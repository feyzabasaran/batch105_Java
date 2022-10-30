package ders25_staticKeyword;

public class AHemsire {

    static String hastaneIsmi = "Yildiz Hastanesi";
    static String hastaneAdresi = "Cankaya/Ankara";
    static String bashekimIsmi = "Dr Mehmet Yilmaz";

    String personelIsim ="Isim belirtilmedi";
    String personelAdres ="Adres belirtilmedi";
    String personelTelefon ="Telefon belirtilmedi";

    @Override
    public String toString() {
        return "Hemsire Bilgileri" +
                "\nPersonel İsmi= " + personelIsim +
                "\nPersonel Adresi= " + personelAdres  +
                "\nPersonel Telefonu=" + personelTelefon +
                "\nHastane Ismi= " + hastaneIsmi +
                "\nHastane Adresi= " + hastaneAdresi+
                "\nBashekim Ismi= " + bashekimIsmi ;

    }
}
