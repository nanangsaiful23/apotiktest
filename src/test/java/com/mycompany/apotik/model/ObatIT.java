/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.apotik.model;

import junit.framework.TestCase;

/**
 *
 * @author nanang saiful
 */
public class ObatIT extends TestCase {
    
    public ObatIT(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getJumlah method, of class Obat.
     */
    public void testGetJumlah() {
        System.out.println("getJumlah");
        Obat instance = new Obat();
        int expResult = 0;
        int result = instance.getJumlah();
        assertEquals(expResult, result);
    }

    
}
