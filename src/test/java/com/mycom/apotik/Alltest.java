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
    Obat o;
    Pegawai pg;
    Pembeli p;
    Distributor d;

@Given("^user take medicine with id \"([^\"]*)\"$")
public void user_take_medicine_with_id(String arg1) throws Exception {
    o=new Obat();
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


@Then("^employee input data transaction$")
public void employee_input_data_transaction() throws Exception {
    pg= new Pegawai();
    p= new Pembeli();
    daftarobat=new ArrayList();
    daftarobat.add(o);
    boolean expected =true;
    boolean result= app.tambahtransaksi(pg, p, daftarobat, 5,1000);
    Assert.assertEquals(expected, result);
}
@When("^medicine not available \"([^\"]*)\"$")
public void medicine_not_available(String arg1) throws Exception {
    boolean expected =false;
    boolean result= o.evailable(Integer.parseInt(arg1));
    Assert.assertEquals(expected, result);
}

@Then("^employee not input data transaction$")
public void employee_not_input_data_transaction() throws Exception {
   Assert.assertTrue(true);
}
@Given("^distributor have medicine with id  \"([^\"]*)\"$")
public void distributor_have_medicine_with_id(String arg1) throws Exception {
    o= new Obat();
    int expected=Integer.parseInt(arg1);
    o=app.cariobat(Integer.parseInt(arg1));
    int result=o.getIdobat();
    Assert.assertEquals(expected, result);

}

@When("^medicine in store limited$")
public void medicine_in_store_limited() throws Exception {
    boolean result=o.islimited();
    Assert.assertTrue(result);
}

@Then("^employee note the medicine$")
public void employee_note_the_medicine() throws Exception {
    d=new Distributor();
    pg=new Pegawai(1);
    boolean result =app.tambahRestock(pg, d,o, 10);
    Assert.assertTrue(result);
}
@When("^medicine in store not limited$")
public void medicine_in_store_not_limited() throws Exception {
    boolean result=o.islimited();
    Assert.assertFalse(result);
   
}

@Then("^employee not note the medicine$")
public void employee_not_note_the_medicine() throws Exception {
    boolean result=o.islimited();
    Assert.assertFalse(result);
}
@Given("^user give data  id =\"([^\"]*)\" name=\"([^\"]*)\"$")
public void user_give_data_id_name(String arg1, String arg2) throws Exception {
   
    p=new Pembeli(Integer.parseInt(arg1));
    p.setNama(arg2);
    Assert.assertNotNull(p);
 
}

@When("^data user not available$")
public void data_user_not_available() throws Exception {
    Pembeli result=app.caripembeli(p.getId());
    Assert.assertNull(result);
}

@Then("^employee input data member$")
public void employee_input_data_member() throws Exception {
  boolean expected= true;
  boolean result=app.masukkanDataPembeli(p);
 Assert.assertEquals(expected, result);
}


@Given("^person give data  id = \"([^\"]*)\" name = \"([^\"]*)\"$")
public void person_give_data_id_name(String arg1, String arg2) throws Exception {
   d=new Distributor(Integer.parseInt(arg1));
    d.setNama(arg2);
    Assert.assertNotNull(d);
}


@When("^data not available$")
public void data_not_available() throws Exception {
   Distributor result= app.caridistributor(d.getIddistributor());
     Assert.assertNull(result);
}

@Then("^employee input data distributor$")
public void employee_input_data_distributor() throws Exception {
  boolean expected= true;
  boolean result=app.masukkandatadistributor(d.getNama(),d.getKontak() , d.getAlamat(),"123");
 Assert.assertEquals(expected, result);
}


@Given("^data person  id =\"([^\"]*)\" name=\"([^\"]*)\"$")
public void data_person_id_name(String arg1, String arg2) throws Exception {
    pg=new Pegawai(Integer.parseInt(arg1));
    pg.setNama(arg2);
    Assert.assertNotNull(pg);
}

@When("^data person not available in employee$")
public void data_person_not_available_in_employee() throws Exception {
    Pegawai result= app.caripegawai(pg.getIdpegawai());
     Assert.assertNull(result);
}

@Then("^owner input data employee$")
public void owner_input_data_employee() throws Exception {
   boolean expected= true;
  boolean result=app.inputPegawai(pg);
 Assert.assertEquals(expected, result); 
}

@Given("^showing see the medicine's with id=\"([^\"]*)\"$")
public void showing_see_the_medicine_s_with_id(String arg1) throws Exception {
   
    int expected=Integer.parseInt(arg1);
    o=new Obat(Integer.parseInt(arg1));
    int result=o.getIdobat();
    Assert.assertEquals(expected, result);
}

@When("^medicine found$")
public void medicine_found() throws Exception {
    int expected=o.getIdobat();
    int result=app.cariobat(o.getIdobat()).getIdobat();
    Assert.assertEquals(expected, result);
}

@Then("^show medicine's data belong to the selected$")
public void show_medicine_s_data_belong_to_the_selected() throws Exception {
    String result=o.toString();
   Assert.assertNotNull(result);
}
}
