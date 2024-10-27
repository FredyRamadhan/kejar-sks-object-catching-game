import greenfoot.*;

public class dapatNilaiB extends dapatNilai
{
    private static int random;
    void spawnBaru(){
        dapatNilaiB dapatNilaiB = new dapatNilaiB();
        getWorld().addObject(dapatNilaiB,Greenfoot.getRandomNumber(1100)+100,0);
        random = Greenfoot.getRandomNumber(4)-2;
    }
    double tambahNilai(){
        return 3.0;
    }
    int isMasukSks(){
        return 1;
    }
    void maju(){
        setLocation(getX()+random, getY()+4);
    }
    
    public void act() 
    {
        super.act();
    }   
}
