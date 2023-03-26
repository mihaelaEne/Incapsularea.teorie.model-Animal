package controllers;

import model.Oras;

import java.util.ArrayList;

public class OrasController {

    private ArrayList<Oras> orase;

    public OrasController() {

        this.orase = new ArrayList<>();

        this.load2();
    }

    public void load2() {
        Oras o1 = new Oras("Bucuresti", "Bucuresti", 3000000, 85);
        Oras o2 = new Oras("Sibiu", "Sibiu", 2500000, 220);
        Oras o3 = new Oras("Alexandria", "Teleorman", 500000, 50);

        orase.add(o1);
        orase.add(o2);
        orase.add(o3);

    }

    public void afisareOras() {
        for (int i = 0; i < orase.size(); i++) {
            System.out.println(this.orase.get(i).descriereOras());
            System.out.println("\n");
        }
    }
}
