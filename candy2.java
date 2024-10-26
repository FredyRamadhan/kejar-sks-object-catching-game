import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class candy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class candy2 extends candy
{
    /**
     * Act - do whatever the candy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        candy2 candy2 = new candy2();
        getWorld().addObject(candy2,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    }
    
    public void act() 
    {
        super.act();
    }   
}
