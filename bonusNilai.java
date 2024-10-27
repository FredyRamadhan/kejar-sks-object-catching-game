import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class candy4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bonusNilai extends dapatNilai
{
    void spawnBaru(){
        bonusNilai bonusNilai = new bonusNilai();
        getWorld().addObject(bonusNilai,Greenfoot.getRandomNumber(300),0);
    }
    double tambahNilai(){
        return 1.0;
    }
    void maju(){
        setLocation(getX(), getY()+3);
    }
    
    public void act() 
    {
        super.act();
    }    
}
