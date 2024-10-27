import greenfoot.*;

public class candy2 extends candy
{
    void cetakbaru(){
        candy2 candy2 = new candy2();
        getWorld().addObject(candy2,Greenfoot.getRandomNumber(1100)+100,0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    }
    
    public void act() 
    {
        super.act();
    }   
}
