import greenfoot.*;

public abstract class candy extends Actor
{
    abstract void cetakbaru();
    abstract void maju();
    
    void dimakan(){
        Counter.add(1);
        
        cetakbaru();
        getWorld().removeObject(this);
    }
    
    public void act() 
    {
        maju();
        if(getY()>=719){
            setLocation(Greenfoot.getRandomNumber(1280),0);
        }
        if(isTouching(kodok.class)){
            dimakan();
        }
        if(Counter2.value==0){
            getWorld().removeObject(this);
        }
        
    }    
}
