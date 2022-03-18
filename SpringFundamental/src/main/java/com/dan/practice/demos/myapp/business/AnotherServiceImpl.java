package com.dan.practice.demos.myapp.business;

import com.dan.practice.demos.myapp.data.AnotherRepositoryImpl;
import com.dan.practice.demos.myapp.data.MyRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class AnotherServiceImpl implements MyService {

    private AnotherRepositoryImpl repo;
    @Autowired
    public AnotherServiceImpl(AnotherRepositoryImpl repo) {
        this.repo = repo;
    }

    @Override
    public void doBusinessLogic() {
        System.out.println("doing another business");
        repo.doQuery();
    }
}
