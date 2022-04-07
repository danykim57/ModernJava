package com.dan.practice.demos.myapp;

import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class DAO {

    private DataSource dataSource;

    public DAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
