import greenfoot.*;

public class dapatNilaiB extends dapatNilai
{
    void spawnBaru(){
        dapatNilaiB dapatNilaiB = new dapatNilaiB();
        getWorld().addObject(dapatNilaiB,Greenfoot.getRandomNumber(1100)+100,0);
    }
    double tambahNilai(){
        return 3.0;
    }
    void maju(){
        setLocation(getX(), getY()+4);
    }
    
    public void act() 
    {
        super.act();
    }   
}
