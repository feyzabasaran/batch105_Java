package ders25_staticKeyword;

public class AHemsireRunner {

    public static void main(String[] args) {

        AHemsire h1 = new AHemsire(); // parametresiz bir constructor
        h1.personelIsim="Ayse";
        h1.personelAdres= "Ulus";
        h1.personelTelefon= "1321235346";
        System.out.println(h1);

        AHemsire h2 = new AHemsire();
        System.out.println(h2);
        h2.personelIsim= "Hatice";
        h2.personelAdres= "Sincan";
        h2.personelTelefon="1234567";
        h2.bashekimIsmi = "Yasar Kemal";

        System.out.println("h1: "+ h1);
        System.out.println("h2: "+ h2);


        AHemsire h3=new AHemsire();
        System.out.println("h3: " + h3);
        h3.hastaneIsmi= "Java hastanesi";

        System.out.println(h2.hastaneIsmi);



    }
}
