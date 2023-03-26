package model;

public class Animal {


    //atribute
    private String nume;
    private int id;

    private int varsta;

    private String culoare;
    private String locatieAnterioara;
    private String locatieActuala;

    //cosntructori
    public Animal(){
        System.out.println("Eu sunt un constructor gol");
    }

    public Animal(String test){
        System.out.println("Eu sunt un constructpr cu un parametru ");
    }


    public Animal(String nume, int id,int varsta, String culoare, String locatieAnterioara){
        this.nume=nume;
        this.id=id;
        this.varsta=varsta;
        this.culoare=culoare;
        this.locatieAnterioara=locatieAnterioara;

    }

    public Animal(String nume, int id,int varsta, String culoare, String locatieAnterioara, String locatieActuala) {
        this.nume = nume;
        this.id = id;
        this.varsta = varsta;
        this.culoare = culoare;
        this.locatieAnterioara = locatieAnterioara;
        this.locatieActuala=locatieActuala;
    }

        //accesorii

    public void setNume(String nume) {
        if (nume.equals("test")) {
            System.out.println("Nu acceptam numele acesta");
            this.nume = "undefined";
        } else {
            this.nume = nume;
        }
    }

    public String getNume() {
        return this.nume;
    }

    public void setId(int id) {
        if (id == 0) {
            System.out.println("incorect");
        } else {
            this.id = id;
        }
    }

    public int getId() {
        return this.id;
    }

    public void setVarsta(int varsta) {
        if (varsta > 0) {
            this.varsta = varsta;
        } else {
            System.out.println("imposibil");
        }
    }

    public int getVarsta() {
        return this.varsta;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getCuloare() {
        return this.culoare;
    }

    public void setLocatieAnterioara(String locatieAnterioara) {
        this.locatieAnterioara = locatieAnterioara;
    }

    public String getLocatieAnterioara() {
        return this.locatieAnterioara;
    }

    public void setLocatieActuala(String locatieActuala) {
        if (locatieActuala.equals(locatieAnterioara)) {
            System.out.println("Nu este o locatie noua");
        } else {
            this.locatieActuala = locatieActuala;
        }
    }


    public String getLocatieActuala() {
        return this.locatieActuala;
    }
    public String descriereAnimal() {
        String text = "";

        text += "Numele animalului este: " + this.nume + " cu id-ul: " + this.id + "\n";
        text += "Varsta lui este: " + this.varsta + "\n";
        text += "Culoarea animalului este: " +this.culoare+"\n";
        text+="Locatia anterioara in care a stat "+this.nume+" este: "+this.locatieAnterioara+", iar locatia actuala este: "+this.locatieActuala;
        return text;
    }


}
