package view;

import controllers.OrasController;
import model.Oras;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewOras {
    private OrasController orasController;
    private Scanner scanner;

    public ViewOras() {
        orasController = new OrasController();
        scanner = new Scanner(System.in);
        play();
    }


    public void meniu() {
        System.out.println("tasta 1 pt a afisa toate orasele ");
        System.out.println("tasta 2 pt a adauga un oras");
        System.out.println("tasta 3 pt a sterge un oras ");
        System.out.println("tasta 4 pt a afisa orasele cu >n nrLocuitori");
    }


    public void play() {
        orasController.load();
        int alegere = 0;
        boolean running = true;
        while (running) {
            meniu();
            alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {
                case 1:
                    orasController.afisareOras();
                    break;
                case 2:
                    adaugareOras();
                    break;
                case 3:
                    stergereOras();
                    break;
                case 4:
                    findByNrLocuitori();
                    break;
                default:
                    System.out.println("Alegere gresita");
                    break;
            }
        }
    }


    private void adaugareOras() {
        System.out.println("Introduceti numele orasului de adaugat:");
        String nume = scanner.nextLine();
        System.out.println("Introduceti judetul din care face parte orasul:");
        String judet = scanner.nextLine();
        System.out.println("Introduceti numarul de locuitori: ");
        int nrLocuitori = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti altitudinea orasului: ");
        float altitudine = Float.parseFloat(scanner.nextLine());

        Oras oras = orasController.findByName(nume);
        if (oras == null) {
            Oras oNou = new Oras(nume, judet, nrLocuitori, altitudine);
            orasController.addOras(oNou);
        } else {
            System.out.println("Orasul exista deja");
        }
    }


    private void stergereOras() {
        System.out.println("Introduceti numele orasului: ");
        String nume = scanner.nextLine();

        Oras oras = orasController.findByName(nume);
        if (oras == null) {
            System.out.println("Nu exista un oras cu numele introdus");
        } else {
            orasController.removeOras(oras);
            System.out.println("Orasul a fost sters");
        }


    }


    private void findByNrLocuitori() {
        System.out.println("Intr nr de locuitori: ");
        int nrLocuitori=Integer.parseInt(scanner.nextLine());

        ArrayList<Oras> orasList=orasController.findByNrLocuitori(nrLocuitori);
        if(orasList.size()==0){
            System.out.println("Nu exista ");
        }else{
            for(int i=0; i<orasList.size(); i++){
                Oras oras=orasList.get(i);
                System.out.println(oras.descriereOras());
            }
            System.out.println("\n S-A TERMIKNAT LISTA DE ORASE");
        }

    }


}
