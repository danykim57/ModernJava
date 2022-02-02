package com.example.modernjava.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void comma() {
        Utils u = new Utils();
        int a = u.comma(0, 1);
        System.out.println(a);
    }

}