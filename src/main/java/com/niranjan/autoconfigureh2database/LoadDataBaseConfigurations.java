package com.niranjan.autoconfigureh2database;

import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

import javax.sql.DataSource;


@Configuration
@ConditionalOnClass(DataSource.class)
public class LoadDataBaseConfigurations {

    @Bean
    public DataSource dataSource(){
        System.out.println("niranjan loading the data base");
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:h2:file:C:\\Users\\lniranja\\OneDrive - Capgemini\\2021\\data\\h2database");
        dataSourceBuilder.username("king");
        dataSourceBuilder.password("vanitha");
        dataSourceBuilder.driverClassName("org.h2.Driver");
        return    dataSourceBuilder.build();
    }




}
