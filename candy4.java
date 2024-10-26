import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class candy4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class candy4 extends candy
{
    /**
     * Act - do whatever the candy4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        candy4 candy4 = new candy4();
        getWorld().addObject(candy4,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    }
    
    public void act() 
    {
        super.act();
    }    
}
