package com.example.modernjava.generics;

import com.example.modernjava.MyException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    @Test
    public void covarianceTest() {
        List<Cat> cats = new ArrayList<Cat>();
        List<? extends Pet> pets = cats;

//        pets.add(new Cat()); // won't compile
//        pets.add(new Pet()); //won't compile
        cats.add(new Cat());
    }

}