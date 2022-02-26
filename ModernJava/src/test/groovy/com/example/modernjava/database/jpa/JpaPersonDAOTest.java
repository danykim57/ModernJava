package com.example.modernjava.database.jpa;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JpaPersonDAOTest {
    private PersonDAO dao = new JpaPersonDAO();

    @Test
    void findAll() throws Exception {
        List<Person> people = dao.findAll();
        System.out.println(people);
        assertTrue(people.size() > 0);
    }

    @Test
    void findById() throws Exception{
        for (int id : dao.getIds()) {
            assertNotNull(dao.findById(id));
        }
    }

    @Test
    void save() throws Exception{
        Person p = new Person("Pulaski");
        int generatedId = dao.save(p);
        assertNotNull(dao.findById(generatedId));
    }

    @Test
    void delete() throws Exception{
        Person p = new Person("Pulaski");
        int generatedId = dao.save(p);
        assertNotNull(dao.findById(generatedId));
    }

    @Test
    void getIds() {
        System.out.println(dao.getIds());
    }
}