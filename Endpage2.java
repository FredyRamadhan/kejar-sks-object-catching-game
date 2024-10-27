import greenfoot.*; 

public class Endpage2 extends World {
    public Endpage2() {    
        super(1280, 720, 1); 
        mulai();
        
    }

    private void mulai() {
        exit exit = new exit();
        TampilkanHasil tampil = new TampilkanHasil("IPK Anda: ", IPK.getValue());
        addObject(tampil, 640, 280);
        addObject(exit,640,360);
    }
}
