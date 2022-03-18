package com.dan.practice.demos.myapp.data;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepositoryImpl implements MyRepository {
    @Override
    public void doQuery() {
        System.out.println("Doing DB thingy");
    }
}
