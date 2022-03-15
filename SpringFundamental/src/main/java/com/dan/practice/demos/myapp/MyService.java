package com.dan.practice.demos.myapp;

import org.springframework.stereotype.Component;

@Component
public class MyService {

    private MyRepository repo;

    public MyService(MyRepository repo) {
        this.repo = repo;
    }

    public void doBusinessLogic() {
        System.out.println("doing my business");
        repo.doQuery();
    }

    public MyRepository getRepo() {
        return repo;
    }

    public void setRepo(MyRepository repo) {
        this.repo = repo;
    }
}