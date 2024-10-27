import greenfoot.*; 

public class Endpage extends World {
    public Endpage() {    
        super(1280, 720, 1); 
        mulai();
    }

    private void mulai() {
        exit exit = new exit();
        addObject(exit,640,350);
    }
}
