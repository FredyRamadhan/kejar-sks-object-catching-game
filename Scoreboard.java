import greenfoot.*;
import java.io.*;

public class Scoreboard extends Actor {
    private static final String FILE_NAME = "ipk.txt";  // Nama file untuk menyimpan skor
    private String playerName;
    private double ipk;
    
    public Scoreboard(String playerName, double ipk) {
        this.playerName = playerName;
        this.ipk = ipk;
        updateScore();  // Memperbarui tampilan skor
    }
    
    public void updateScore() {
        // Menampilkan nama pemain dan IPK di layar
        setImage(new GreenfootImage(
            "Nama: " + playerName + "\nIPK: " + String.format("%.2f", ipk), 
            24, Color.BLACK, Color.WHITE
        ));
    }
    
    // Metode untuk membaca skor dari file
    public static String readHighestIPK(String playerName) {
        try {
            File file = new File(FILE_NAME);  // Gunakan File biasa, bukan GreenfootFile
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split("-");
                    if (parts[0].trim().equals(playerName)) {
                        reader.close();
                        return parts[1].trim();
                    }
                }
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "0.00"; // Jika nama tidak ditemukan, skor default adalah 0
    }

    // Metode untuk menulis atau memperbarui skor ke file
    public static void saveIPK(String playerName, double ipk) {
        try {
            File file = new File(FILE_NAME);  // Gunakan File biasa
            StringBuilder content = new StringBuilder();
            boolean playerExists = false;
            
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split("-");
                    if (parts[0].trim().equals(playerName)) {
                        content.append(playerName).append(" - ").append(String.format("%.2f", ipk)).append("\n");
                        playerExists = true;  // Menandakan pemain sudah ada
                    } else {
                        content.append(line).append("\n");
                    }
                }
                reader.close();
            }
            
            if (!playerExists) {
            content.append(playerName).append(" - ").append(String.format("%.2f", ipk)).append("\n");            
        }
            // Simpan perubahan ke file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(content.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
