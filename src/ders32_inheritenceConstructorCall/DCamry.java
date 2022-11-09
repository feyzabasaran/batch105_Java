package ders32_inheritenceConstructorCall;

public class DCamry extends BToyota{

    DCamry(String pc){
        super("Deniz");
        System.out.println("String Parametreli Camry");
    }

    DCamry(){

    }

    public static void main(String[] args) {

        // eger kullanilan argument'e uygun bir cons.
        //parent class'da yoksa direk CTE olur.
        DCamry camry2= new DCamry("celal");
        //Parametreli Araba Constructor
        //String Parametreli Toyota
        //String Parametreli Camry

        System.out.println("=========");
        DCamry camry1 = new DCamry();
        //Parametresiz Araba Constructor
        //Parametresiz Toyota Constructor
    }
}
