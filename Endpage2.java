import greenfoot.*; 
import java.io.*;

public class Endpage2 extends World {
    private String playerName;
    private double ipk;
    private double bestIPK; // Menggunakan tipe double untuk menyimpan best IPK
    
    public Endpage2(String playerName, double ipk) {    
        super(1280, 720, 1); 
        this.playerName = playerName;
        this.ipk = ipk;
        
        bestIPK = IPKStorage.readIPK(playerName);  // Membaca IPK tertinggi dari file
        if (bestIPK < ipk) {  // Jika IPK saat ini lebih besar dari yang tertinggi
            IPKStorage.saveIPK(playerName, ipk);  // Menyimpan IPK baru
            bestIPK = ipk;  // Update best IPK
        }

        // Menampilkan informasi
        showText("Nama: " + playerName, 1100, 300);
        showText("IPK Saat Ini: " + ipk, 1100, 350);
        showText("IPK Tertinggi: " + bestIPK, 1100, 400);

        mulai();
    }

    private void mulai() {
        exit exitButton = new exit();
        // Pastikan menampilkan nilai yang benar dengan mengakses nilai IPK secara langsung
        TampilkanHasil tampil = new TampilkanHasil("IPK Anda: ", ipk);  
        addObject(tampil, 640, 280);
        addObject(exitButton, 640, 360);
    }
}
