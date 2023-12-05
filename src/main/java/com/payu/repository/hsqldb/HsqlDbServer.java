package com.payu.repository.hsqldb;

import lombok.extern.log4j.Log4j2;
import org.hsqldb.server.Server;

@Log4j2
public class HsqlDbServer {

    private Server server;

    private boolean running = false;

    private final String baseDirectory;

    private final String database;

    private final int port;

    public HsqlDbServer(String baseDirectory, String database, int port) {
        this.baseDirectory = baseDirectory;
        this.database = database;
        this.port = port;
    }

    public void start() {
        if (server == null) {
            log.info("Starting HSQL server...");
            server = new Server();
            server.setPort(this.port);
            server.setDatabaseName(0, this.database);
            server.setDatabasePath(0, this.baseDirectory + "/" + database);

            server.setTrace(false);
            server.setSilent(true);
            server.setNoSystemExit(true);
            server.start();
            running = true;
        }
    }

    public boolean isRunning() {
        if (server != null) {
            server.checkRunning(running);
        }
        return running;
    }

    public void stop() {
        if (isRunning()) {
            server.stop();
            running = false;
        }
    }
}
