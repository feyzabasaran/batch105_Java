package ders31_inheritance;

public class FToyota extends EAraba {


    FToyota(){
        super(); // parent class'daki parametresiz cons. git
        System.out.println("Toyota cons. calisti");
    }

    protected String marka = "Toyota";
    protected String motor = "Toyota arclar cevreci motor kullanir";
    protected String uretimYeri = "Uretim yeri belirtilmemis";
    protected int hiz = 140;


}
