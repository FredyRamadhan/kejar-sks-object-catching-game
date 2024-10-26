import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class no here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class no extends Actor
{
    abstract void cetakbaru();
    abstract void maju();
    
    void dimakan(){
        cetakbaru();
        getWorld().removeObject(this);
    }
    
    public void act() 
    {
        maju();
        if(getY()>=499){
            setLocation(Greenfoot.getRandomNumber(300),0);
        }
        if(isTouching(kodok.class)){
            Counter2.add(-1);
            dimakan();
        }
        if(Counter2.value==0){
            getWorld().removeObject(this);
        }
    }    
}
