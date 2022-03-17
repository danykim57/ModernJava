package com.dan.practice.demos.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Autowired
    private MyRepository repo;

    public MyService(MyRepository repo) {
        this.repo = repo;
    }

    public void doBusinessLogic() {
        System.out.println("doing my business");
        repo.doQuery();
    }
}