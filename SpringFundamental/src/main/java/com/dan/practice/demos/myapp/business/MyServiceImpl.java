package com.dan.practice.demos.myapp.business;

import com.dan.practice.demos.myapp.data.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    private MyRepository repo;

    @Autowired
    public MyServiceImpl(@Qualifier("myRepositoryImpl")MyRepository repo) {
        this.repo = repo;
    }

    @Override
    public void doBusinessLogic() {
        System.out.println("doing my business");
        repo.doQuery();
    }
}