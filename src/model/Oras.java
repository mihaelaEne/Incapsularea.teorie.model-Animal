package model;

public class Oras {

    private String nume;
    private String judet;
    private int nrLocuitori;
    private float altitudine;

    public Oras(String nume, String judet, int nrLocuitori, float altitudine) {
        this.nume = nume;
        this.judet = judet;
        this.nrLocuitori = nrLocuitori;
        this.altitudine = altitudine;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getJudet() {
        return judet;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }

    public int getNrLocuitori() {
        return nrLocuitori;
    }

    public void setNrLocuitori(int nrLocuitori) {
        this.nrLocuitori = nrLocuitori;
    }

    public float getAltitudine() {
        return altitudine;
    }

    public void setAltitudine(float altitudine) {
        this.altitudine = altitudine;
    }

    public  String descriereOras(){
        String text="";
        text+="Orasul "+this.nume+ " se afla in judetul: "+this.judet+"\n";
        text+=this.nume+" are "+this.nrLocuitori+" locuitori";
        text+=",iar altitudinea este: "+this.altitudine;
        return text;
    }

    public Oras(String aux){
        String [] split= aux.split(",");
        this.nume=split[0];
        this.judet=split[1];
        this.nrLocuitori=Integer.parseInt(split[2]);
        this.altitudine=Float.parseFloat(split[3]);
    }

}
