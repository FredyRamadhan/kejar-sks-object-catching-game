import greenfoot.*; 

public class MyWorld extends World {
    private IPK IPK;
    private MaxPelanggaran MaxPelanggaran;
    private Nilai Nilai;
    private SKSdiambil sksdiambil;
    private String playerName; 

    public MyWorld() {    
        super(1280, 720, 1); // Inisialisasi world 1280x720

        // Inisialisasi objek Nilai, MaxPelanggaran, IPK, dan SKSdiambil
        IPK = new IPK("IPK: ");
        MaxPelanggaran = new MaxPelanggaran("Max Pelanggaran : ");
        Nilai = new Nilai("Total Nilai: ");
        sksdiambil = new SKSdiambil("SKS Diambil: ");
        
        addObject(IPK, 880, 70);
        addObject(Nilai, 200, 70);
        addObject(sksdiambil, 400, 70);
        addObject(MaxPelanggaran, 1080, 70);
        
        inputNama(); // Input nama pemain
        mulaiPermainan(); // Mulai permainan
    }

    private void inputNama() {
        playerName = Greenfoot.ask("Masukkan Nama Anda: ");
        if (playerName == null || playerName.trim().isEmpty()) {
            playerName = "Pemain"; 
        }
    }

     private void mulaiPermainan() {
        // Membaca IPK sebelumnya dari file menggunakan IPKStorage
        double ipk = IPKStorage.readIPK(playerName);

        // Kirim nama pemain dan IPK sebelumnya ke objek Karakter
        addObject(new Karakter(playerName, IPK), 600, 600);
        
        mulai(); // Lanjutkan inisialisasi objek
    }

    private void mulai() {
        double ipk = IPKStorage.readIPK(playerName);
        
        Karakter karakter = new Karakter(playerName, IPK);
        addObject(karakter, 600, 600);
        
        addObject(new dapatNilaiA(), Greenfoot.getRandomNumber(1180) + 100, 69);
        addObject(new dapatNilaiB(), Greenfoot.getRandomNumber(1180) + 100, 139);
        addObject(new dapatNilaiC(), Greenfoot.getRandomNumber(1180) + 100, 43);
        addObject(new dapatNilaiC(), Greenfoot.getRandomNumber(1180) + 100, 67);
        addObject(new bonusNilai(), Greenfoot.getRandomNumber(1180) + 100, 703);
        
        addObject(new Pelanggaran1(), Greenfoot.getRandomNumber(1180) + 100, Greenfoot.getRandomNumber(300));
        addObject(new Pelanggaran2(), Greenfoot.getRandomNumber(1180) + 100, Greenfoot.getRandomNumber(300));
        addObject(new Pelanggaran3(), Greenfoot.getRandomNumber(1180) + 100, Greenfoot.getRandomNumber(300));
    }
}
