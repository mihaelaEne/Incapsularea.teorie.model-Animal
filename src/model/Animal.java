package model;

public class Animal {


    //atribute
    public String nume;

    //4 atribuet


    //accesorii

    public void setNume(String nume){
        if(nume.equals("test")){
            System.out.println("Nu acceptam numele acesta");
            this.nume="undefined";
        }else{
            this.nume=nume;
        }
    }

    public String getNume(){
        return this.nume;
    }



}
