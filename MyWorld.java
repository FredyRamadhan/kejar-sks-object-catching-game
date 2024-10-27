import greenfoot.*; 

public class MyWorld extends World {
    private Nilai Nilai; // Instance variable untuk Counter
    private MaxPelanggaran MaxPelanggaran; // Instance variable untuk Counter2
    private IPK IPK;

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld() {    
        // Create a new world with 1280x720 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        
        // Inisialisasi counter dan counter2
        Nilai = new Nilai("Nilai: "); 
        MaxPelanggaran = new MaxPelanggaran("HP : "); 
        IPK = new IPK("IPK: ");
        
        
        // Tambahkan counter dan counter2 ke world
        addObject(Nilai, 300, 70);
        addObject(IPK, 650, 70);
        addObject(MaxPelanggaran, 1000, 70);
        
        
        mulai(); // Panggil metode mulai untuk menambahkan objek lain
    }
    
    // Getter untuk Counter
    public Nilai getNilai() {
        return Nilai; // Mengembalikan instance variable counter
    }

    // Getter untuk Counter2
    public MaxPelanggaran MaxPelanggaran() {
        return MaxPelanggaran;
    }

    /**
     * mulai program.
     * buat beberapa objek pertama untuk memulai game nya
     */
    private void mulai() {
        //inisiasi karakter
        Karakter Karakter = new Karakter();
        addObject(Karakter, 600, 600);
        
        //inisialisasi poin
        dapatNilaiA dapatNilaiA = new dapatNilaiA();
        addObject(dapatNilaiA, Greenfoot.getRandomNumber(1180)+100, 69);
        
        dapatNilaiB dapatNilaiB = new dapatNilaiB();
        addObject(dapatNilaiB, Greenfoot.getRandomNumber(1180)+100, 139);
        
        dapatNilaiC dapatNilaiC = new dapatNilaiC();
        addObject(dapatNilaiC, Greenfoot.getRandomNumber(1180)+100, 43);
        
        bonusNilai bonusNilai  = new bonusNilai ();
        addObject(bonusNilai, Greenfoot.getRandomNumber(1180)+100, 203);
        addObject(bonusNilai, Greenfoot.getRandomNumber(1180)+100, 227);
        
        //inisialisasi poin pengurang
        Pelanggaran1 Pelanggaran1 = new Pelanggaran1();
        addObject(Pelanggaran1, Greenfoot.getRandomNumber(1180)+100, Greenfoot.getRandomNumber(300));
        
        Pelanggaran2 Pelanggaran2 = new Pelanggaran2();
        addObject(Pelanggaran2, Greenfoot.getRandomNumber(1180)+100, Greenfoot.getRandomNumber(300));
        
        Pelanggaran3 Pelanggaran3 = new Pelanggaran3();
        addObject(Pelanggaran3, Greenfoot.getRandomNumber(1180)+100, Greenfoot.getRandomNumber(300));
    }
}
