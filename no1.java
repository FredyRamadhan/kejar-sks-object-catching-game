import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class no1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class no1 extends no
{
    void cetakbaru(){
        no1 no1 = new no1();
        getWorld().addObject(no1,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+2);
    }
    public void act() 
    {
        super.act();
    }     
}
