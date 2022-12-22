package com.example.flavors;

import static org.junit.Assert.assertTrue;


import com.example.flavors.Login.Validation;

import org.junit.Before;
import org.junit.Test;

public class MainActivityTest {

    public Validation validation;


    @Before
    public void setUp(){
        validation = new Validation();
    }

    @Test
    public void subDomainEmailValidation(){
        boolean result = validation.isValidEmail("test@qq.com.co");
        assertTrue("JUnit testing for validation",result);
    }

    @Test
    public void domainEmailValidation(){
        boolean result = validation.isValidEmail("test@qq.com");
        assertTrue("JUnit testing for validation",result);
    }



}