package app.outlay.utils;

import org.junit.Before;

import app.outlay.domain.model.Credentials;

import static org.junit.Assert.*;

/**
 * Created by László Tamás on 2017. 05. 04..
 */
public class CredentialsTest {

    private String email = "testelek@nomail.com";
    private String email2 = "bevizElek@testmail.hu";
    private String password = "abcd1234";
    private String password2 = "0123456789";
    private Credentials cred ;
    @Before
    public void setUp() throws Exception {
        cred = new Credentials(email,password);
    }

    @org.junit.Test
    public void getEmail() throws Exception {
        boolean result = cred.getEmail().equals(email);

        assertEquals(true, result);
    }

    @org.junit.Test
    public void setEmail() throws Exception {
        cred.setEmail(email2);
        boolean result = cred.getEmail().equals(email2);

        assertEquals(true, result);
    }

    @org.junit.Test
    public void getPassword() throws Exception {
        boolean result = cred.getPassword().equals(password);

        assertEquals(true, result);
    }

    @org.junit.Test
    public void setPassword() throws Exception {
        cred.setPassword(password2);
        boolean result = cred.getPassword().equals(password2);

        assertEquals(true, result);
    }

    @org.junit.Test
    public void isGuestCredentials() throws Exception {
        boolean result = cred.isGuestCredentials();


        assertEquals(false, result);
    }

    @org.junit.Test
    public void isGuestCredentials2() throws Exception {
        Credentials cred2 = new Credentials(null,null);
        boolean result = cred2.isGuestCredentials();

        assertEquals(true, result);
    }


    @org.junit.Test
    public void isGuestCredentials3() throws Exception {
        Credentials cred3 = new Credentials(email,null);
        boolean result = cred3.isGuestCredentials();

        assertEquals(false, result);
    }


    @org.junit.Test
    public void isGuestCredentials4() throws Exception {
        Credentials cred4 = new Credentials(null,password);
        boolean result = cred4.isGuestCredentials();

        assertEquals(false, result);
    }

}