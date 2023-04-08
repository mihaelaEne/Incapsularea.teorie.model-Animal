package controllers;

import model.Animal;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalController {

    private ArrayList<Animal> animals;

    public AnimalController() {

        this.animals = new ArrayList<>();//cream un obiect de tip lista si-l salvam in referinta animals

        this.load();
    }

    public  AnimalController(ArrayList<Animal> animals){


        this.animals=animals;
    }

    public void load() {


        try {


            File file = new File("C:\\mycode\\OOP\\incapsularea\\Teorie\\src\\data\\animale.txt");


            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {


                Animal animal = new Animal(scanner.nextLine());

                this.animals.add(animal);

            }

        } catch (Exception e) {

            e.printStackTrace();
        }


    }

    public void afisareAnimal() {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(this.animals.get(i).descriereAnimal());
            System.out.println("\n");
        }
    }


    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        this.animals.remove(animal);
    }


    public Animal findAnimalById(int id) {
        for (int i = 0; i < this.animals.size(); i++) {
            if (animals.get(i).getId() == id) {
                return animals.get(i);
            }
        }
        return null;
    }


    public Animal findByNume(String nume) {
        for (int i = 0; i < this.animals.size(); i++) {
            if (animals.get(i).getNume().equals(nume)) {
                if (animals.get(i).getNume().equals(nume)) {
                    return animals.get(i);
                }
            }
        }
        return null;
    }

    public void update(Animal animal) {
        Animal deUpdatat = findAnimalById(animal.getId());

        if (animal.getNume() != null) {
            deUpdatat.setNume(animal.getNume());
        }
        if (animal.getLocatieAnterioara() != null) {
            deUpdatat.setLocatieAnterioara(animal.getLocatieAnterioara());
        }
        if (animal.getLocatieActuala() != null) {
            deUpdatat.setLocatieActuala(animal.getLocatieActuala());
        }
        if (animal.getCuloare() != null) {
            deUpdatat.setCuloare(animal.getCuloare());
        }
    }

//todo:afisare animale ce au varsta dupa o valoare introdusa

    public ArrayList<Animal> findAnimalByVarsta(int varsta) {
        ArrayList<Animal> animaleList = new ArrayList();

        for (int i = 0; i < this.animals.size(); i++) {

            if (animals.get(i).getVarsta() >= varsta) {


                animaleList.add(animals.get(i));
            }
        }
        return animaleList;
    }




}
