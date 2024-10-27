import greenfoot.*; 

public class Endpage extends World {

    public Endpage() {    
        super(1280, 720, 1); 
        prepare();
    }

    private void prepare() {
        exit exit = new exit();
        addObject(exit,640,345);
    }
}
