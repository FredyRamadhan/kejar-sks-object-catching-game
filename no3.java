import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class no3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class no3 extends no
{
    /**
     * Act - do whatever the no3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        no3 no3 = new no3();
        getWorld().addObject(no3,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+2);
    }
    public void act() 
    {
        super.act();
    }     
}
