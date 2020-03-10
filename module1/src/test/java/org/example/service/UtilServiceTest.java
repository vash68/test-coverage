package org.example.service;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilServiceTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        UtilService utilService = new UtilService();
        int result = utilService.add(2, 3);
        Assert.assertTrue(result == 5);
    }

    @Test
    public void subtract() {
        UtilService utilService = new UtilService();
        Assert.assertTrue(utilService.subtract(10, 4) == 6);
    }
}