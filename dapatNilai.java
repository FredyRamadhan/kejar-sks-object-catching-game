import greenfoot.*;

public abstract class dapatNilai extends Actor
{
    abstract void spawnBaru();
    abstract double tambahNilai();
    abstract void maju();
    abstract int isMasukSks();
    /*abstract int delayTime();
    private int delayFrame = 0;*/
    
    void dimakan(){
        //boolean checkSpawn = false;
        Nilai.add(tambahNilai());
        IPK.add(tambahNilai(), isMasukSks());
        SKSdiambil.add(isMasukSks());
        spawnBaru();
        
        /*
           while(checkSpawn==false){
                if(delayFrame >= delayTime()) {
                    delayFrame++;
                    
                    checkSpawn=true;
                }   
            }    
           */
        
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
