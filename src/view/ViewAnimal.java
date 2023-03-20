package view;

import controllers.AnimalController;
import model.Animal;

import java.util.Scanner;

public class ViewAnimal {
    private AnimalController animalController;
    private Scanner scanner;


    public ViewAnimal() {
        animalController = new AnimalController();
        scanner = new Scanner(System.in);
        play();
    }

    public void meniu() {
        System.out.println("Apasa 1 pt a afisa toate animalele");
        System.out.println("Apasa 2 pt a adauga un animal");
        System.out.println("Apasa 3 pt a sterge un animal");
        System.out.println("Apasa 4 pt a modifica un animal");


    }


    public void play() {
        animalController.load();
        int alegere = 0;
        boolean running = true;
        while (running) {
            meniu();
            alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {

                case 1:
                    animalController.afisareAnimal();
                    break;
                case 2:
                    adaugareAnimal();
                    break;
                case 3:
                    stergereAnimal();
                    break;
                case 4:
                    updateAnimal();
                default:
                    System.out.println("Alegere gresita");
                    break;

            }
        }
    }

    private void adaugareAnimal() {
        System.out.println("Introduceti numele animalului:");
        String nume = scanner.nextLine();
        System.out.println("Introduceti id-ul animalului:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti varsta animalului:");
        int varsta = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti culoarea animalului:");
        String culoare = scanner.nextLine();
        System.out.println("Introduceti unde a fost animalul pana acum:");
        String locatieAnterioara = scanner.nextLine();
        System.out.println("Introduceti locatia in care se afla animalul acum: ");
        String locatiaActuala = scanner.nextLine();

        Animal animal = animalController.findAnimalById(id);
        if (animal == null) {
            Animal aNou = new Animal(nume,id,varsta,culoare,locatieAnterioara,locatiaActuala);
            animalController.addAnimal(aNou);
        } else {
            System.out.println("Pacientul exista deja");
        }
    }

    private void stergereAnimal() {
        System.out.println("Introduceti id-ul animalului");
        int id = Integer.parseInt(scanner.nextLine());

        Animal animal = animalController.findAnimalById(id);
        if (animal == null) {
            System.out.println("Nu exista un animal cu id-ul introdus");
        } else {
            animalController.removeAnimal(animal);
            System.out.println("Animalul a fost sters");
        }

    }

    private void updateAnimal() {
        System.out.println("Introduceti numele-ul animalului");
        String nume = scanner.nextLine();

        Animal animal = animalController.findByNume(nume);

        if (animal == null) {
            System.out.println("Nu exista un animal cu id-ul introdus");
        } else {
            System.out.println("Introdu cu virgula ce doresti sa modifici:id,culoarea,locatia actuala");

            String[] upd = scanner.nextLine().split(",");

            Animal nou = new Animal();

            nou.setNume(animal.getNume());

            for (int i = 0; i < upd.length; i++) {
                switch (upd[i]) {
                    case "id":
                        System.out.println("Introduceti noul id:");
                       int id=Integer.parseInt(scanner.nextLine());
                        break;
                    case "culoarea":
                        System.out.println("Introduceti noua culoare");
                        String culoare = scanner.nextLine();
                        break;

                    case "locatie actuala":
                        System.out.println("Introduceti noua locatie: ");
                        String locatieActuala = scanner.nextLine();
                        break;
                    default:
                        System.out.println("Alegere gresita");

                }
            }
            animalController.update(nou);
        }

    }

}
