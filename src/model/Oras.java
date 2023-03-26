package model;

public class Oras {

    private String nume;
    private String judet;
    private int nrLocuitori;
    private float altitudine;

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return this.nume;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }

    public String getJudet() {
        return judet;
    }

    public void setNrLocuitori(int nrLocuitori) {
        if (nrLocuitori == 0) {
            System.out.println("Oras parasit");
        } else {
            this.nrLocuitori = nrLocuitori;
        }
    }

    public int getNrLocuitori() {
        return nrLocuitori;
    }

    public void setAltitudine(float altitudine) {
        this.altitudine = altitudine;
    }

    public float getAltitudine() {
        return altitudine;
    }


    public Oras(String nume,int nrLocuitori,float altitudine){
        this.nume=nume;
        this.nrLocuitori=nrLocuitori;
        this.altitudine=altitudine;
    }

    public Oras(String nume, String judet, int nrLocuitori, float altitudine){
        this.nume=nume;
        this.judet=judet;
        this.nrLocuitori=nrLocuitori;
        this.altitudine=altitudine;
    }

    public  String descriereOras(){
        String text="";
        text+="Orasul "+this.nume+ " se afla in judetul: "+this.judet+"\n";
        text+=this.nume+" are "+this.nrLocuitori+" locuitori";
        text+=",iar altitudinea este: "+this.altitudine;
        return text;
    }

}
