package OOP;

public class OOP {
    
    public static void main(String[] args) {
        
        Buku buku1 = new Buku();
        buku1.namaBuku = "Epep Booyah";
        buku1.penulis = "Edo";
        buku1.penerbit = "PT Garam";
        buku1.tahunTerbit = 2025;
        
        
        Buku buku2 = new Buku();
        buku2.namaBuku = "Java Tutorial";
        buku2.penulis = "Rasyid";   
        buku2.penerbit = "PT Gula";
        buku2.tahunTerbit = 2020;
        
        buku1.infoBuku();
        buku2.infoBuku();
    
        
         
    }
    
}
