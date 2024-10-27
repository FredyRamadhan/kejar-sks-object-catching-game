import greenfoot.*; 
public class Karakter extends Actor
{
    void dimakan(){
        Nilai.add(1);
    }
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+14, getY());
        }
        else if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-14, getY());
        }
        if(isTouching(Pelanggaran.class)){
            MaxPelanggaran.add(-1);
            dimakan();
        }
        if(MaxPelanggaran.value==0){
            Greenfoot.delay(1);
            Greenfoot.setWorld(new Endpage());
            getWorld().removeObject(this);
        }else if(SKSdiambil.value==24) {
            Greenfoot.delay(1);
            Greenfoot.setWorld(new Endpage());
            getWorld().removeObject(this);
        }
    }    
}

