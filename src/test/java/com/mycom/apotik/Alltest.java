/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycom.apotik;

import cucumber.api.PendingException;
import cucumber.api.java.en.*; // And But Given When  Then
import java.util.ArrayList;
import junit.framework.Assert;


public class Alltest {
    App app= new App();
    ArrayList<Obat> daftarobat;
    Obat o=new Obat();
    Pegawai pg=new Pegawai();
    Pembeli p=new Pembeli();

@Given("^user take medicine with id \"([^\"]*)\"$")
public void user_take_medicine_with_id(String arg1) throws Exception {
    int expected=Integer.parseInt(arg1);
    o=app.cariobat(Integer.parseInt(arg1));
    int result=o.getIdobat();
    Assert.assertEquals(expected, result);
}
@When("^medicine available \"([^\"]*)\"$")
public void medicine_available(String arg1) throws Exception {
    boolean expected =true;
    boolean result= o.evailable(Integer.parseInt(arg1));
    Assert.assertEquals(expected, result);
    
}

@Then("^employee input data$")
public void employee_input_data() throws Exception {
     daftarobat=new ArrayList();
     daftarobat.add(o);
    boolean expected =true;
    boolean result= app.tambahtransaksi(pg, p, daftarobat, 5,1000);
    Assert.assertEquals(expected, result);
}

@Given("^distributor have medicine with id  \"([^\"]*)\"$")
public void distributor_have_medicine_with_id(String arg1) throws Exception {
    int expected=Integer.parseInt(arg1);
    o=app.cariobat(Integer.parseInt(arg1));
    int result=o.getIdobat();
    Assert.assertEquals(expected, result);

}

@When("^medicine in store limited$")
public void medicine_in_store_limited() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^employee note the medicine;$")
public void employee_note_the_medicine() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^user give data  id =\"([^\"]*)\" name=\"([^\"]*)\"$")
public void user_give_data_id_name(String arg1, String arg2) throws Exception {
    Pembeli expected=null;
    
    Pembeli result=app.caripembeli(Integer.parseInt(arg1));
    Assert.assertEquals(expected, result);
    
 
}

@When("^data user not available$")
public void data_user_not_available() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}
}
