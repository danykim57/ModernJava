package com.dan.practice.demos.myapp;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.dan.practice.demos.myapp")
public class AppConfig {

    @Bean
    public DataSource dataSource() {
        //Reusage of the same connection for the ease of test. Someone should close the connection via the close() method
//        SingleConnectionDataSource dataSource = new SingleConnectionDataSource();


        //This is Apache tomcat dbcp(database connetion pool)
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        //dataSource.setUrl("jdbc:h2:mem:mydb"); //h2 memory db
        dataSource.setUrl("jdbc:h2:file:~/ModernJava/mydb;AUTO_SERVER=TRUE;DB_CLOSE_ON_EXIT=FALSE");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        //dataSource.setMaxActive(5);  //Methods from BasicDataSource
        //dataSource.setMaxIdle(30000);
        return dataSource;
    }
}
