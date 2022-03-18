package com.dan.practice.demos.myapp.data;

import org.springframework.stereotype.Repository;

@Repository
public class AnotherRepositoryImpl implements MyRepository {
    @Override
    public void doQuery() {
        System.out.println("Doing another DB thingy");
    }
}
