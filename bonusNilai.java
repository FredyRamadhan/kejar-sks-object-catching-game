import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class bonusNilai extends dapatNilai
{
    private static int random;
    //int delayTime(){return 0;}
    void spawnBaru(){
        bonusNilai bonusNilai = new bonusNilai();
        getWorld().addObject(bonusNilai,Greenfoot.getRandomNumber(1180)+100,0);
        random = Greenfoot.getRandomNumber(8)-4;
    }
    double tambahNilai(){
        return 1;
    }
    int isMasukSks(){
        return 0;
    }
    void maju(){
        setLocation(getX()+random, getY()+4);
    }
    
    public void act() 
    {
        super.act();
    }    
}
