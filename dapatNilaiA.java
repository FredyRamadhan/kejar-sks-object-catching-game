import greenfoot.*;

public class dapatNilaiA extends dapatNilai
{
    private static int random;
    //int delayTime(){return 50;}
    void spawnBaru(){
        dapatNilaiA dapatNilaiA = new dapatNilaiA();
        getWorld().addObject(dapatNilaiA,Greenfoot.getRandomNumber(1180)+100,0);
        random = Greenfoot.getRandomNumber(12)-6;
    }
    double tambahNilai(){
        return 4.0;
    }
    int isMasukSks(){
        return 1;
    }
    void maju(){
        setLocation(getX()+random, getY()+6);
    }
    
    public void act() 
    {
        super.act();
    }    
}
