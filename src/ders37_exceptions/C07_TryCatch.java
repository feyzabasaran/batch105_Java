package ders37_exceptions;

public class C07_TryCatch {

    public static void main(String[] args) {

        try {
            calis();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void calis() {
        throw new RuntimeException("Cook calis");
    }
}
