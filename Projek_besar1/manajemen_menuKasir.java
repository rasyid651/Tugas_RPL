package Projek_besar1;

import java.util.Scanner;

public class manajemen_menuKasir {
    
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // variabel untuk menyimpan hasil total pesanan
        int totalHarga = 0;        // jumlah semua harga pesanan
        int totalPorsi = 0;        // jumlah total porsi yang dipesan
        String daftarPesanan = ""; // menyimpan rincian pesanan untuk ditampilkan
        
        // gunakan perulangan agar customer bisa pesan berkali-kali
        while (true) {
            // tampilkan menu makanan
            System.out.println("\n=== Menu Paket Makanan ===");
            System.out.println("1. Paket Ayam - Rp. 15.000");
            System.out.println("2. Paket Ikan - Rp. 20.000");
            System.out.println("3. Paket Daging - Rp. 30.000 (diskon Rp.5000)");
            System.out.println("4. Paket Sayur - Rp. 10.000");
            System.out.println("0. Selesai & Tampilkan Total");
            
            // input pilihan paket dari user
            System.out.print("Pilih paket (0-4): ");
            int pilihan = input.nextInt();
            
            // jika pilihan 0, maka keluar dari perulangan
            if (pilihan == 0) {
                break; // berhenti dan lanjut menampilkan ringkasan pesanan
            }
            
            // variabel sementara untuk menampung nama paket dan harga
            String paket = "";
            int harga = 0;
            
            // logika pemilihan menu menggunakan switch-case
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
                    // jika input bukan 0-4 maka dianggap tidak valid
                    System.out.println("Pilihan tidak tersedia. Silakan coba lagi.");
                    continue; // kembali ke awal loop tanpa melanjutkan ke bawah
            }
            
            // input jumlah porsi untuk menu yang dipilih
            System.out.print("Masukkan jumlah porsi untuk " + paket + ": ");
            int porsi = input.nextInt();
            
            // hitung subtotal = harga * jumlah porsi
            int subtotal = harga * porsi;
            
            // tambahkan subtotal ke total keseluruhan
            totalHarga += subtotal;
            totalPorsi += porsi;
            
            // simpan pesanan ke dalam string daftarPesanan
            daftarPesanan += paket + " x" + porsi + " = Rp. " + subtotal + "\n";
            
            // konfirmasi bahwa pesanan sudah ditambahkan
            System.out.println("Ditambahkan: " + paket + " x" + porsi + " (Subtotal: Rp. " + subtotal + ")");
        }
        
        // setelah customer memilih 0, tampilkan ringkasan pesanan
        System.out.println("\n=== Ringkasan Pesanan ===");
        System.out.println(daftarPesanan);  // tampilkan daftar makanan
        System.out.println("Total Porsi: " + totalPorsi); // total semua porsi
        System.out.println("Total yang harus dibayar: Rp. " + totalHarga); // total harga keseluruhan
        
        input.close(); // tutup scanner untuk menghindari memory leak
    }
}
