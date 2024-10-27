import greenfoot.*;  

public class dapatNilaiC extends dapatNilai
{
    
    void spawnBaru(){
        dapatNilaiC dapatNilaiC = new dapatNilaiC();
        getWorld().addObject(dapatNilaiC,Greenfoot.getRandomNumber(300),0);
    }
    double tambahNilai(){
        return 2.0;
    }
    int isMasukSks(){
        return 1;
    }
    void maju(){
        setLocation(getX(), getY()+3);
    }
    
    public void act() 
    {
        super.act();
    }     
}
