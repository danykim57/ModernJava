package com.example.modernjava.database.jdbc;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JdbcPersonDAOTest {
    private PersonDAO dao = new JdbcPersonDAO();

    @Test
    void findAll() throws Exception{
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
    void save() throws Exception {
        Person p = new Person("Pulaski");
        int generatedId = dao.save(p);
        assertNotNull(dao.findById(generatedId));
    }

    @Test
    void delete() throws Exception {
        int maxId = dao.getIds().stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(1);
        System.out.println("maxId=" + maxId);
        Person p = dao.findById(maxId);
        dao.delete(p);
        assertNull(dao.findById(maxId));
    }

    @Test
    void getIds() {
        System.out.println(dao.getIds());
    }
}