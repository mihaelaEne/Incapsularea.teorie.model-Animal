package controllers;

import model.Animal;
import model.Oras;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OrasControllerTest {


    @Test
    public void testFindByNrLocuitori() {
        ArrayList<Oras> oraseList = new ArrayList();

        Oras alexandria = new Oras("Alexandria", "Teleorman", 100, 5);
        oraseList.add(alexandria);
        Oras bucuresti = new Oras("Bucuresti", "Bucuresti", 50000, 6);
        oraseList.add(bucuresti);
        Oras constanta = new Oras("Constanta", "Constanta", 800, 0);
        oraseList.add(constanta);
        Oras galati = new Oras("galati", "galati", 700, 7);
        oraseList.add(galati);


        OrasController orasController = new OrasController(oraseList);

        assertEquals("Bucuresti", orasController.findByNrLocuitori(50000).get(0).getNume());

    }

     @Test
     public void testFindByNume() {
         ArrayList<Oras> oraseList = new ArrayList();

         Oras alexandria = new Oras("Alexandria", "Teleorman", 100, 5);
         oraseList.add(alexandria);
         Oras bucuresti = new Oras("Bucuresti", "Bucuresti", 50000, 6);
         oraseList.add(bucuresti);
         Oras constanta = new Oras("Constanta", "Constanta", 800, 0);
         oraseList.add(constanta);
         Oras galati = new Oras("galati", "galati", 700, 7);
         oraseList.add(galati);


         OrasController orasController = new OrasController(oraseList);
         assertEquals("Bucuresti", orasController.findByName("Bucuresti").getNume());


     }

     @Test
     public void testFindByNumeNull() {
         ArrayList<Oras> oraseList = new ArrayList();

         Oras alexandria = new Oras("Alexandria", "Teleorman", 100, 5);
         oraseList.add(alexandria);
         Oras bucuresti = new Oras("Bucuresti", "Bucuresti", 50000, 6);
         oraseList.add(bucuresti);
         Oras constanta = new Oras("Constanta", "Constanta", 800, 0);
         oraseList.add(constanta);
         Oras galati = new Oras("galati", "galati", 700, 7);
         oraseList.add(galati);


         OrasController orasController = new OrasController(oraseList);
         assertNull(orasController.findByName("test1"));


     }


     @Test

    public void testAdauguare(){
         ArrayList<Oras> oraseList = new ArrayList();

         Oras alexandria = new Oras("Alexandria", "Teleorman", 100, 5);
         oraseList.add(alexandria);
         Oras bucuresti = new Oras("Bucuresti", "Bucuresti", 50000, 6);
         oraseList.add(bucuresti);
         Oras constanta = new Oras("Constanta", "Constanta", 800, 0);
         oraseList.add(constanta);
         Oras galati = new Oras("galati", "galati", 700, 7);



         OrasController orasController = new OrasController(oraseList);
         orasController.addOras(galati);
         assertNotNull(orasController.findByName("galati"));
     }


     @Test
    public void testStergere(){
         ArrayList<Oras> oraseList = new ArrayList();

         Oras alexandria = new Oras("Alexandria", "Teleorman", 100, 5);
         oraseList.add(alexandria);
         Oras bucuresti = new Oras("Bucuresti", "Bucuresti", 50000, 6);
         oraseList.add(bucuresti);
         Oras constanta = new Oras("Constanta", "Constanta", 800, 0);
         oraseList.add(constanta);
         Oras galati = new Oras("galati", "galati", 700, 7);
         oraseList.add(galati);


         OrasController orasController = new OrasController(oraseList);
         orasController.removeOras(galati);
         assertEquals(null, orasController.findByName("galati"));
     }
 }



