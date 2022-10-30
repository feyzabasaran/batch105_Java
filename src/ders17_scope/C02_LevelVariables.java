package ders17_scope;

public class C02_LevelVariables {

    // class level variable'lar method'larin disinda olusturulur
    // genel kullanim en ustte olusturulmalaridir.
    static String hastaneismi= "Yildiz hastanesi";
    static int hastaSayisi= 23453; // tek bir hastanin gelmesi tum hastaneyi etkiledigi icin static olmalidir.
    static String basHekimIsmi; // bashekim'de herkesi ilgilendirdigi icin static olmali
    String persIsmi= "isim girilmedi"; // personel ismi herkeste ayni olmadigi icin static olmamali
    String persTelefonu= "telefon girilmedi"; // null gorunmesindense bu sekilde olmasi daha guzel
    int persYasi;


    public static void main(String[] args) {
        System.out.println(hastaneismi); // Yildiz hastanesi
        System.out.println(basHekimIsmi); // null
        // System.out.println(persIsmi); // static olmadigi icin static main method'dan kullanilamaz
        /*
        Class level variable'lara deger atamasi yapilmamis olursa
        Java bu variable'lara data turune gore
        default olarak tanimlanan degerleri atar
        default degerler
        sayisal variable'lar: 0
        boolean : false
        char =''
        Objeler(String dahil): null
         */

    }
    public static void method1(){
        System.out.println(hastaSayisi);
        hastaSayisi++;
        // System.out.println(persIsmi); // static olmadigi icin kullilamaz

    }
    public void method2(){
        System.out.println(hastaneismi); // static variable'lar heryere girilebilir.
        hastaSayisi++;
        System.out.println(persIsmi); // isim girilmedi
        System.out.println(persYasi); // 0


    }
}
