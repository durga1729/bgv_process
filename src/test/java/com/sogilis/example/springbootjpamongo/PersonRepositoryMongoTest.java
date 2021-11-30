package com.sogilis.example.springbootjpamongo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
// or, to load only beans involved with MongoDB + PersonRepositoryTester
// @DataMongoTest(includeFilters = @ComponentScan.Filter(type =
// FilterType.ASSIGNABLE_TYPE, classes = PersonRepositoryTester.class))
@ActiveProfiles("mongodb")
public class PersonRepositoryMongoTest {

    @Autowired
    private PersonRepositoryTester personRepositoryTester;

    @Test
    public void save_and_find() {
        personRepositoryTester.save_and_find();
    }
}
