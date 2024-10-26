import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class candy3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class candy3 extends candy
{
    /**
     * Act - do whatever the candy3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        candy3 candy3 = new candy3();
        getWorld().addObject(candy3,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    }
    
    public void act() 
    {
        super.act();
    }     
}
