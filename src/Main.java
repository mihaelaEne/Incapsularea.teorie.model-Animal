import model.Animal;
import model.Oras;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal();//un constructor se apealza la instantiere
//        //adica cand cream un obiect
//        //adica folosim cuvantul cheie new
//
//        Animal ex= new Animal("adsadas");
//
//        animal.setNume("Sasha");
//        animal.setId(001);
//        animal.setVarsta(10);
//        animal.setCuloare("Maro");
//        animal.setLocatieAnterioara("Brasov");
//        animal.setLocatieActuala("sinaia");
//
//        System.out.println(animal.getNume());
//        System.out.println(animal.getId());
//        System.out.println(animal.getVarsta());
//        System.out.println(animal.getCuloare());
//        System.out.println(animal.getLocatieAnterioara());
//        System.out.println(animal.getLocatieActuala());
//
//
//       Animal a3= new Animal("test",12,2,"culoare","test2");
//

//        Animal a4 = new Animal("Ares", 007, 1, "blue", "Medias", "Bucuresti");
//        System.out.println(a4.descriereAnimal());
//
//        System.out.println("\n");
//        a4.setNume("Ares A");
//        System.out.println(a4.descriereAnimal());
//
//

        Oras o1=new Oras("Bucuresti",3000000, 85);
        Oras o2=new Oras("Alexandria", "Teleorman",500000, 45);

        System.out.println(o1.descriereOras());
        System.out.println("\n");
        System.out.println(o2.descriereOras());

    }
}