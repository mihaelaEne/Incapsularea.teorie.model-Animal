package controllers;

import model.Animal;

import java.util.ArrayList;

public class AnimalController {

    private ArrayList<Animal> animals;

    public AnimalController(){

        this.animals= new ArrayList<>();//cream un obiect de tip lista si-l salvam in referinta animals

        this.load();
    }

    public void load(){
        Animal a1=new Animal("Pablo", 123456,6,"alb","Pantelimon", "Dristor");
        Animal a2=new Animal("Burito", 789456, 5,"negru","Corbeanca","Ilfov");
        Animal a3=new Animal("Mario", 741258963, 8,"galben", "Pitesti", "Ploiesti");

        animals.add(a1);
        animals.add(a2);
        animals.add(a3);

    }

    public void afisareAnimal(){
        for(int i=0; i<animals.size(); i++){
            System.out.println(this.animals.get(i).descriereAnimal());
            System.out.println("\n");
        }
    }
}
