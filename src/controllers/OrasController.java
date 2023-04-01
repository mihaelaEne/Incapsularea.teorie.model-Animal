package controllers;

import model.Animal;
import model.Oras;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class OrasController {
    private ArrayList<Oras> orase;

    public OrasController() {
        this.orase = new ArrayList<>();
        this.load();
    }

    public void load() {
        try {
            File file = new File("C:\\mycode\\OOP\\incapsularea\\Teorie\\src\\data\\orase.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                Oras oras = new Oras(scanner.nextLine());

                this.orase.add(oras);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void afisareOras(){
        for(int i=0; i<this.orase.size(); i++){
            System.out.println(this.orase.get(i).descriereOras());
            System.out.println("\n");
        }
    }



    public void addOras(Oras oras){this.orase.add(oras);}
    public void removeOras(Oras oras){this.orase.remove(oras);}


    public Oras findByName(String nume) {
        for (int i = 0; i < this.orase.size(); i++) {
            if (orase.get(i).getNume().equals(nume)) {
                    return orase.get(i);
            }
        }
        return null;
}

    public ArrayList<Oras> findByNrLocuitori(int nrLocuitori) {
        ArrayList oraseList = new ArrayList();

        for (int i = 0; i < this.orase.size(); i++) {

            if (orase.get(i).getNrLocuitori() >= nrLocuitori) {


                oraseList.add(orase.get(i));
            }
        }
        return oraseList;
    }



}
