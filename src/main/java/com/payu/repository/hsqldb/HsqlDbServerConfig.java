package com.payu.repository.hsqldb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HsqlDbServerConfig {

    @Value("${spring.datasource.hsql.server.baseDirectory:target/hsqldb-server}")
    private String baseDirectory;

    @Bean(initMethod = "start", destroyMethod = "stop")
    public HsqlDbServer hsqlDbServer() {
        return new HsqlDbServer(baseDirectory, "bookcollectordb", 9001);
    }
}
