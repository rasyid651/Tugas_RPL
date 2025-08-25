package pkg1_strukturproject;

import java.util.Scanner;

public class nilai_mutu {

      public static void main(String[] args) {
         
          Scanner input = new
              Scanner(System.in);
          
          int nilai;
          
          System.out.println("Masukan Nilai Kamu: ");
          
          nilai = input.nextInt();
          
          if(nilai >= 90 && nilai <= 100) {
              System.out.println("Anda mendapatkan nilai A");
          }else if (nilai >= 80 && nilai <= 90) {
              System.out.println("Anda mendapatkan nilai B");
          }else if (nilai >= 70 && nilai <= 80) {
              System.out.println("Anda mendapatkan nilai C");
          }else if (nilai >= 50 && nilai <= 70) {
              System.out.println("Anda mendapatkan nilai D");
          } else {
              System.out.println("Anda mendapatkan nilai E ");
          }
              
       input.close();
      }  
    
}
