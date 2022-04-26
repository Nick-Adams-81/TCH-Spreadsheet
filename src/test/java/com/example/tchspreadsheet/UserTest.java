package com.example.tchspreadsheet;

import com.example.tchspreadsheet.Models.User;
import org.junit.Before;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Test;
import static org.junit.Assert.*;

@SpringBootTest
public class UserTest {

    User emptyUser;
    User userWithOne;
    User userWithMany;

    @Before
    public void setupUser() {

        emptyUser = new User();

        userWithOne = new User();
        userWithOne.setUsername("test user");

        userWithMany = new User();
        userWithMany.setUsername("test user 2");
        userWithMany.setPassword("test-password");
        userWithMany.setEmail("test@test.com");
    }

    @Test
    public void testIsEmpty() {
        assertTrue(emptyUser.getUsername(), true);
        assertFalse(userWithMany.getUsername(), false);
    }


}
