package com.payu.repository.hsqldb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HsqlDbServerConfig {

    @Value("${spring.datasource.hsql.server.baseDirectory}")
    private String baseDirectory;

    @Value("${spring.datasource.name}")
    private String databaseName;

    @Value("${spring.datasource.port}")
    private int port;

    @Bean(initMethod = "start", destroyMethod = "stop")
    public HsqlDbServer hsqlDbServer() {
        return new HsqlDbServer(baseDirectory, databaseName, port);
    }
}
