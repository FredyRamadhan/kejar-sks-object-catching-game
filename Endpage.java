import greenfoot.*;
import java.io.*; 

public class Endpage extends World {
    private String playerName;
    private double ipk; // Ini akan menjadi SKS yang didapat
    private double bestIPK;
    
    // Konstruktor yang menerima playerName dan SKS (score)
    public Endpage(String playerName, double ipk) {    
        super(1280, 720, 1); 
        this.playerName = playerName;
        this.ipk = ipk;
        
        bestIPK = IPKStorage.readIPK(playerName);        
        if (bestIPK < ipk) {  // Jika IPK saat ini lebih besar dari yang tertinggi
            IPKStorage.saveIPK(playerName, ipk);  // Menyimpan IPK baru
            bestIPK = ipk;  // Update best IPK
        }
        
        showText("Nama: " + playerName, 1100, 300);
        showText("IPK Saat Ini: " + ipk, 1100, 350);
        showText("IPK Tertinggi: " + bestIPK, 1100, 400);
        
        mulai();
    }

    private void mulai() {
        exit exit = new exit();
        addObject(exit,640,350);
    }
}
