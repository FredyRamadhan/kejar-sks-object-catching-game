import greenfoot.*;
import javax.swing.JOptionPane;

public class InputName extends Actor {
    public static String playerName;

    public InputName() {
        getInput();
    }

    public void getInput() {
        // Menampilkan dialog input menggunakan JOptionPane
        playerName = JOptionPane.showInputDialog("Masukkan Nama Anda:");
        if (playerName == null || playerName.trim().isEmpty()) {
            playerName = "Player"; // Nama default jika kosong
        }
    }
}