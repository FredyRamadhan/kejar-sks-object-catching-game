import greenfoot.*;

public class Homepage extends World
{
    public Homepage()
    {    
        super(1280, 720, 1);
        mulai();
    }
    
    private void mulai()
    {
        play play = new play();
        addObject(play,640, 420);
    }
}
