import java.io.*;

public class IPKStorage {
    private static final String FILE_NAME = "ipk.txt";  // Nama file untuk menyimpan IPK

    // Metode untuk membaca IPK dari file
    public static double readIPK(String playerName) {
        try {
            File file = new File(FILE_NAME);
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split("-");
                    if (parts[0].trim().equals(playerName)) {
                        reader.close();
                        return Double.parseDouble(parts[1].trim());  // Mengembalikan sebagai double
                    }
                }
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0.0;  // Jika nama tidak ditemukan, IPK default adalah 0
    }

    // Metode untuk menyimpan atau memperbarui IPK ke file
    public static void saveIPK(String playerName, double ipk) {
        try {
            File file = new File(FILE_NAME);
            boolean playerExists = false;
            StringBuilder content = new StringBuilder();

            // Memastikan direktori ada dan file bisa ditulis
            if (!file.exists()) {
                file.createNewFile();  // Buat file jika belum ada
            }

            // Membaca file dan update IPK
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split("-");
                    if (parts[0].trim().equals(playerName)) {
                        content.append(playerName).append(" - ").append(ipk).append("\n");
                        playerExists = true;
                    } else {
                        content.append(line).append("\n");
                    }
                }
                reader.close();
            }

            if (!playerExists) {
                content.append(playerName).append(" - ").append(ipk).append("\n");
            }
            
            if (!playerExists) {
                file.createNewFile(); 
            }

            // Menyimpan konten ke file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(content.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
