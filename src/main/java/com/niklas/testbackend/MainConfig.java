package com.niklas.testbackend;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.postgresql.ds.PGSimpleDataSource;

@Configuration
@PropertySource("classpath:application.properties")
public class MainConfig {

    @Bean
    public DataSource dataSource() throws URISyntaxException {
        
        URI dbUri = new URI(System.getenv("DATABASE_URL"));
        
        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath() + "?sslmode=require";

        PGSimpleDataSource pgSimpleDataSource= new PGSimpleDataSource();
        pgSimpleDataSource.setUrl(dbUrl);
        pgSimpleDataSource.setUser(username);
        pgSimpleDataSource.setPassword(password);

        return pgSimpleDataSource;
    }
}
