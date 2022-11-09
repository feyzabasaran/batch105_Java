package ders32_inheritenceConstructorCall;

public class Corolla extends BToyota{


    Corolla (int pc){
        super(5);
        System.out.println("Parametreli Corolla Constructor");
    }
    Corolla(){

    }

    Corolla(String str){
        this();
        System.out.println("String parametreli Corolla Constructor");
    }

    public static void main(String[] args) {

        Corolla corolla3 = new Corolla("Ilker");
        //Parametresiz Araba Constructor
        //Parametreli Toyota Constructor
        //Parametreli Corolla Constructor

        System.out.println("=========");
        Corolla corolla1 = new Corolla();
        // Parametresiz Araba Constructor
        // Parametresiz Toyota Constructor
        System.out.println("=========");

        Corolla corolla2 = new Corolla(3);
        //Parametresiz Araba Constructor
        //Parametreli Toyota Constructor
        //Parametreli Corolla Constructor
    }
}
