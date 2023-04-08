package controllers;

import model.Animal;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalControllerTest {


    @Test
    public void testFindById() {
        ArrayList<Animal> animaleList = new ArrayList();
        Animal leu = new Animal("leu", 1, 10, "maro", "locatie1", "locatie2");
        animaleList.add(leu);
        Animal cal = new Animal("cal", 2, 15, "negru", "locatie3", "locatie4");
        animaleList.add(cal);
        Animal maimuta = new Animal("maimuta", 3, 4, "alb", "locatie 5", "locatie6");
        animaleList.add(maimuta);
        Animal caine = new Animal("caine", 4, 17, "roscat", "locatie7", "locatie8");
        animaleList.add(caine);

        AnimalController animalController = new AnimalController(animaleList);

        assertEquals("leu", animalController.findAnimalById(1).getNume());

    }

    @Test
    public void testWithoutId() {
        ArrayList<Animal> animaleList = new ArrayList();
        Animal leu = new Animal("leu", 1, 10, "maro", "locatie1", "locatie2");
        animaleList.add(leu);
        Animal cal = new Animal("cal", 2, 15, "negru", "locatie3", "locatie4");
        animaleList.add(cal);
        Animal maimuta = new Animal("maimuta", 3, 4, "alb", "locatie 5", "locatie6");
        animaleList.add(maimuta);
        Animal caine = new Animal("caine", 4, 17, "roscat", "locatie7", "locatie8");
        animaleList.add(caine);

        AnimalController animalController = new AnimalController(animaleList);


        assertNull(animalController.findAnimalById(10));

    }

    @Test
    public void testFindByNume() {
        ArrayList<Animal> animaleList = new ArrayList();
        Animal leu = new Animal("leu", 1, 10, "maro", "locatie1", "locatie2");
        animaleList.add(leu);
        Animal cal = new Animal("cal", 2, 15, "negru", "locatie3", "locatie4");
        animaleList.add(cal);
        Animal maimuta = new Animal("maimuta", 3, 4, "alb", "locatie 5", "locatie6");
        animaleList.add(maimuta);
        Animal caine = new Animal("caine", 4, 17, "roscat", "locatie7", "locatie8");
        animaleList.add(caine);

        AnimalController animalController = new AnimalController(animaleList);
        assertEquals("leu", animalController.findByNume("leu").getNume());


    }

    @Test
    public void testWithoutNamme() {
        ArrayList<Animal> animaleList = new ArrayList();
        Animal leu = new Animal("leu", 1, 10, "maro", "locatie1", "locatie2");
        animaleList.add(leu);
        Animal cal = new Animal("cal", 2, 15, "negru", "locatie3", "locatie4");
        animaleList.add(cal);
        Animal maimuta = new Animal("maimuta", 3, 4, "alb", "locatie 5", "locatie6");
        animaleList.add(maimuta);
        Animal caine = new Animal("caine", 4, 17, "roscat", "locatie7", "locatie8");
        animaleList.add(caine);

        AnimalController animalController = new AnimalController(animaleList);


        assertNull(animalController.findByNume("urs"));

    }

    @Test
    public void testUpdateNume() {
        //preconditie give
        //am un animal cu un nume

        //actiune  when
        //fac un set ca sa sch numele

        //resulat then
        //ma astept ca numele sa fie schimbat

        ArrayList<Animal> animaleList = new ArrayList();
        Animal leu = new Animal("leu", 1, 10, "maro", "locatie1", "locatie2");
        animaleList.add(leu);
        Animal cal = new Animal("cal", 2, 15, "negru", "locatie3", "locatie4");
        animaleList.add(cal);
        Animal maimuta = new Animal("maimuta", 3, 4, "alb", "locatie 5", "locatie6");
        animaleList.add(maimuta);
        Animal caine = new Animal("caine", 4, 17, "roscat", "locatie7", "locatie8");
        animaleList.add(caine);

        AnimalController animalController = new AnimalController(animaleList);

        Animal leuUpdate = new Animal("leu", 1, 10, "albastru", "locatie2", "locatie3");

        animalController.update(leuUpdate);


        assertEquals("albastru", animalController.findAnimalById(1).getCuloare());
        assertEquals("locatie2", animalController.findAnimalById(1).getLocatieAnterioara());
        assertEquals("locatie3", animalController.findAnimalById(1).getLocatieActuala());

    }


    @Test
    public void testAfisare() {
        ArrayList<Animal> animaleList = new ArrayList();
        Animal leu = new Animal("leu", 1, 10, "maro", "locatie1", "locatie2");
        animaleList.add(leu);
        Animal cal = new Animal("cal", 2, 15, "negru", "locatie3", "locatie4");
        animaleList.add(cal);
        Animal maimuta = new Animal("maimuta", 3, 4, "alb", "locatie 5", "locatie6");
        animaleList.add(maimuta);
        Animal caine = new Animal("caine", 4, 17, "roscat", "locatie7", "locatie8");
        animaleList.add(caine);

        AnimalController animalController = new AnimalController(animaleList);
        for (Animal animal : animaleList) {
            System.out.println(animal.toString());

        }

    }



    @Test
    public void testFindByVarsta(){
        ArrayList<Animal> animaleList=new ArrayList();
        Animal leu = new Animal("leu", 1, 10, "maro", "locatie1", "locatie2");
        animaleList.add(leu);
        Animal cal = new Animal("cal", 2, 15, "negru", "locatie3", "locatie4");
        animaleList.add(cal);
        Animal maimuta = new Animal("maimuta", 3, 4, "alb", "locatie 5", "locatie6");
        animaleList.add(maimuta);
        Animal caine = new Animal("caine", 4, 17, "roscat", "locatie7", "locatie8");
        animaleList.add(caine);

        AnimalController animalController=new AnimalController(animaleList);
        assertEquals("leu", animalController.findAnimalByVarsta(10).get(0).getNume());
    }

    @Test
    public void testWithootVarsta(){
        ArrayList<Animal> animaleList=new ArrayList();
        Animal leu = new Animal("leu", 1, 10, "maro", "locatie1", "locatie2");
        animaleList.add(leu);
        Animal cal = new Animal("cal", 2, 15, "negru", "locatie3", "locatie4");
        animaleList.add(cal);
        Animal maimuta = new Animal("maimuta", 3, 4, "alb", "locatie 5", "locatie6");
        animaleList.add(maimuta);
        Animal caine = new Animal("caine", 4, 17, "roscat", "locatie7", "locatie8");
        animaleList.add(caine);

        AnimalController animalController=new AnimalController(animaleList);
       assertEquals(0,animalController.findAnimalByVarsta(123).size());

    }

@Test
    public void testAdd(){
    ArrayList<Animal> animaleList=new ArrayList();
    Animal leu = new Animal("leu", 1, 10, "maro", "locatie1", "locatie2");
    animaleList.add(leu);
    Animal cal = new Animal("cal", 2, 15, "negru", "locatie3", "locatie4");
    animaleList.add(cal);
    Animal maimuta = new Animal("maimuta", 3, 4, "alb", "locatie 5", "locatie6");
    animaleList.add(maimuta);
    Animal caine = new Animal("caine", 4, 17, "roscat", "locatie7", "locatie8");


    AnimalController animalController=new AnimalController(animaleList);

    animalController.addAnimal(caine);
    assertNotNull(animalController.findAnimalById(4));
}


@Test
    public void testRemove(){
    ArrayList<Animal> animaleList=new ArrayList();
    Animal leu = new Animal("leu", 1, 10, "maro", "locatie1", "locatie2");
    animaleList.add(leu);
    Animal cal = new Animal("cal", 2, 15, "negru", "locatie3", "locatie4");
    animaleList.add(cal);
    Animal maimuta = new Animal("maimuta", 3, 4, "alb", "locatie 5", "locatie6");
    animaleList.add(maimuta);
    Animal caine = new Animal("caine", 4, 17, "roscat", "locatie7", "locatie8");
    animaleList.add(caine);

    AnimalController animalController=new AnimalController(animaleList);
    animalController.removeAnimal(caine);
    assertEquals(null, animalController.findByNume("caine"));
}


}