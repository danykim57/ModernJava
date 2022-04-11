package com.dan.practice.demos.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Repository
public class DAO extends JdbcDaoSupport {

    private DataSource dataSource;

    @Autowired
    public DAO(DataSource dataSource) {
        setDataSource(dataSource);
    }

    @PostConstruct
    public void doQuery() {
        String result = getJdbcTemplate().queryForObject("select 1 from dual", String.class);
        System.out.println("result = " + result);
    }

}
