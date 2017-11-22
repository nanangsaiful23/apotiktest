/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycom.apotik;

import cucumber.api.PendingException;
import cucumber.api.java.en.*; // And But Given When  Then


public class Alltest {
    @Given("^pengguna meminta medicine$")
    public void pengguna_meminta_medicine() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^medicine tersedia$")
    public void medicine_tersedia() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^Petugas menginputkan data$")
    public void petugas_menginputkan_data() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }
            @Given("^distributor membawa obat$")
        public void distributor_membawa_obat() throws Exception {
            // Write code here that turns the phrase above into concrete actions
        }

        @When("^medicine di gudang sudah siap untuk restock$")
        public void medicine_di_gudang_sudah_siap_untuk_restock() throws Exception {
            // Write code here that turns the phrase above into concrete actions
        }

        @Then("^Petugas menginputkan data medicine$")
        public void petugas_menginputkan_data_medicine() throws Exception {
            // Write code here that turns the phrase above into concrete actions
        }

        @Given("^pengguna memberikan data$")
        public void pengguna_memberikan_data() throws Exception {
            // Write code here that turns the phrase above into concrete actions
        }

        @When("^data pengguna belum tedaftar$")
        public void data_pengguna_belum_tedaftar() throws Exception {
            // Write code here that turns the phrase above into concrete actions
        }

        @Then("^Petugas menginputkan data user$")
        public void petugas_menginputkan_data_user() throws Exception {
            // Write code here that turns the phrase above into concrete actions
        }
}
