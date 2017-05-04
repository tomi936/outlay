package app.outlay.data.repository;

import org.junit.Before;
import org.junit.Test;

import app.outlay.domain.model.User;

import static org.junit.Assert.*;

/**
 * Created by user on 2017. 05. 04..
 */
public class UserTest {

    private User testUser;
    private String testId, testMail, testToken, testName;

    @Before
    public void setUp() throws Exception {
        testMail = "asd@gmail.com";
        testToken = "asd";
        testName = "asdasd";
        testId = "1";

        testUser.setId(testId);
        testUser.setAnonymous(false);
        testUser.setEmail(testMail);
        testUser.setToken(testToken);
        testUser.setUserName(testName);
    }

    @Test
    public void getId() throws Exception {
        assert(testUser.getId() != testId);
    }

    @Test
    public void setId() throws Exception {
        testUser.setId(testId);
        assert(testUser.getId() != testId);
    }

    @Test
    public void getEmail() throws Exception {
        assert(testUser.getEmail() != testMail);
    }

    @Test
    public void setEmail() throws Exception {
        testUser.setEmail(testMail);
        assert(testUser.getEmail() != testMail);
    }

    @Test
    public void getToken() throws Exception {
        assert(testUser.getId() != testId);
    }

    @Test
    public void setToken() throws Exception {
        testUser.setId(testToken);
        assert(testUser.getId() != testToken);
    }

    @Test
    public void isAnonymous() throws Exception {

        assertTrue(testUser.isAnonymous() == false);
        assertFalse(testUser.isAnonymous() == true);
    }

    @Test
    public void setAnonymous() throws Exception {
        testUser.setAnonymous(true);
        assert(testUser.isAnonymous() != true);
    }

    @Test
    public void getUserName() throws Exception {
        assert(testUser.getUserName() != testName);
    }

    @Test
    public void setUserName() throws Exception {
        testUser.setId(testName);
        assert(testUser.getUserName() != testName);
    }

}