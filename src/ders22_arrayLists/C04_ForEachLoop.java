package ders22_arrayLists;

public class C04_ForEachLoop {
    public static void main(String[] args) {

        int [] arr = {3,5,7,8,4,2,6,9,6,4,5};

        // bu array'deki 5'den buyuk olan tum elementleri toplayalim
        int toplam=0;

        for (int i =0; i <arr.length ; i++) {

            if (arr[i]>5){
            toplam += arr[i];
            }
        }
        System.out.println("for loop ile: " + toplam); // 36


        // for each loop daha basit bir kurgu ile calisir.
        // for-each loop'a 3 seyi soylemek lazim
        // 1- hangi data turunde degiskenlerle ugrasacaksiniz
        // 2- loop'un icerisinde her bir element geldiginde hangi isimle islem yapacaksiniz
        // 3- hangi array veya collection'dan elemanlar gelecek
        toplam = 0;

        for (int each: arr // arr'ye git her bir int'i getir
             ) {
            if (each>5){
                toplam += each;
            }
        }
        System.out.println("for-each loop ile toplam: " + toplam);
    }
}