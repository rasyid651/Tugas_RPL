package Projek_besar1;

import java.util.Scanner;

public class manajemen_menuKasir {
    
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int totalHarga = 0;        
        int totalPorsi = 0;        
        String daftarPesanan = ""; 
        
     
        while (true) {
          
            System.out.println("\n=== Menu Paket Makanan ===");
            System.out.println("1. Paket Ayam - Rp. 15.000");
            System.out.println("2. Paket Ikan - Rp. 20.000");
            System.out.println("3. Paket Daging - Rp. 30.000 (diskon Rp.5000)");
            System.out.println("4. Paket Sayur - Rp. 10.000");
            System.out.println("0. Selesai & Tampilkan Total");
            
          
            System.out.print("Pilih paket (0-4): ");
            int pilihan = input.nextInt();
            
         
            if (pilihan == 0) {
                break; 
            }
            
        
            String paket = "";
            int harga = 0;
            
          
            switch (pilihan) {
                case 1:
                    paket = "Paket Ayam";
                    harga = 15000;
                    break;
                case 2:
                    paket = "Paket Ikan";
                    harga = 20000;
                    break;
                case 3:
                    paket = "Paket Daging";
                    harga = 30000 - 5000; // ada diskon Rp.5000
                    break;
                case 4:
                    paket = "Paket Sayur";
                    harga = 10000;
                    break;
                default:
                    
                    System.out.println("Pilihan tidak tersedia. Silakan coba lagi.");
                    continue; 
            }
            
          
            System.out.print("Masukkan jumlah porsi untuk " + paket + ": ");
            int porsi = input.nextInt();
            
           
            int subtotal = harga * porsi;
            
            
            totalHarga += subtotal;
            totalPorsi += porsi;
            
           
            daftarPesanan += paket + " x" + porsi + " = Rp. " + subtotal + "\n";
            
            System.out.println("Ditambahkan: " + paket + " x" + porsi + " (Subtotal: Rp. " + subtotal + ")");
        }
        
      
        System.out.println("\n=== Ringkasan Pesanan ===");
        System.out.println(daftarPesanan);  
        System.out.println("Total Porsi: " + totalPorsi); 
        System.out.println("Total yang harus dibayar: Rp. " + totalHarga); 
        
        input.close();
    }
}

