import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kodok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kodok extends Actor
{
    void dimakan(){
        Counter.add(1);
        getWorld().removeObject(this);
    }
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+4, getY());
        }
        else if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-4, getY());
        }
        if(isTouching(no.class)){
            Counter2.add(-1);
            dimakan();
        }
        if(Counter2.value==0){
            Greenfoot.delay(1);
            Greenfoot.setWorld(new Endpage());
            getWorld().removeObject(this);
        }
    }    
}
