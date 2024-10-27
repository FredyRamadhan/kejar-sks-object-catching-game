import greenfoot.*;

public abstract class dapatNilai extends Actor
{
    abstract void spawnBaru();
    abstract double tambahNilai();
    abstract void maju();
    
    void dimakan(){
        Nilai.add(tambahNilai());
        IPK.add(tambahNilai(), 1);
        
        spawnBaru();
        getWorld().removeObject(this);
    }
    
    public void act() 
    {
        maju();
        if(getY()>=719){
            setLocation(Greenfoot.getRandomNumber(1180)+100,0);
        }
        if(isTouching(Karakter.class)){
            dimakan();
        }
        if(MaxPelanggaran.value==0){
            getWorld().removeObject(this);
        }
        
    }    
}
