package org.example.service2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SecretServiceTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        SecretService secretService = new SecretService();
        int result = secretService.doAddition(2, 3);
        Assert.assertTrue(result == 5);
    }

    @Test
    public void subtract() {
        SecretService secretService = new SecretService();
        Assert.assertTrue(secretService.doSubtraction(5, 5) == 0);
    }


    @Test
    public void doNoOp() {
        SecretService secretService = new SecretService();
        secretService.doNoOp(1,2);
    }
}