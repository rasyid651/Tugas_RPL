package pkg1_strukturproject;

import java.util.Scanner;

public class Latihan_Casebreak {
    
    public static void main(String[] args) {
        
        Scanner in = new
            Scanner(System.in);
        
        //potongan harga 
        int potongan = 30000 - 5000;
        
        System.out.println("==Menu Paket Makanan===");
        System.out.println("1.Paket Ayam\n Harga Rp.15.000\n 2.Paket Ikan\n Harga Rp.20.000");
        System.out.println("3.Paket Daging\n Harga RP.30.000\n 4.Paket Sayur\n Harga Rp.10.000\n");
        System.out.println("Pilihlah menu paket makanan : ");
        
        int menu = in.nextInt();
        
        switch(menu){
            case 1 -> System.out.println("1.Paket Ayam\n harga: Rp.15.000");
            case 2 -> System.out.println("2.Paket ikan\n harga: Rp.20.000");
            case 3 -> System.out.println("1.Paket Daging\n harga: Rp." + potongan + "\n Anda terkena potongan harga sebesar Rp.5000");
            case 4 -> System.out.println("4.Paket Sayur\n harga: Rp.10.000"); 
            default -> System.out.println("Menu tidak ada"); 
        }
        
    }
    
}
