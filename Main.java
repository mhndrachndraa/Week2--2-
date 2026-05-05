//package berbeda, bukan subclass class main

public class Main {

    public static void main(String[] args) {
        Elektronik mesinCuci = new Elektronik("samsung", 2000000, 5, "Elektronik", 365);
        
        mesinCuci.setGaransi(0);
        mesinCuci.tampilkanData();
    }
    
}
