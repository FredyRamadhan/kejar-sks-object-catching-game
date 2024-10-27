import greenfoot.*;  

public abstract class Pelanggaran extends Actor
{
    abstract void spawnBaru();
    abstract void maju();
    
    void dimakan(){
        // Buat objek baru sesuai dengan tipe class-nya
        if(this instanceof Pelanggaran1) {
            Pelanggaran1 Pelanggaran1 = new Pelanggaran1();
            getWorld().addObject(Pelanggaran1, Greenfoot.getRandomNumber(1180)+100, 0);
        } 
        else if(this instanceof Pelanggaran2) {
            Pelanggaran2 Pelanggaran2 = new Pelanggaran2();
            getWorld().addObject(Pelanggaran2, Greenfoot.getRandomNumber(1180)+100, 0);
        }
        else if(this instanceof Pelanggaran3) {
            Pelanggaran3 Pelanggaran3 = new Pelanggaran3();
            getWorld().addObject(Pelanggaran3, Greenfoot.getRandomNumber(1180)+100, 0);
        }
        MaxPelanggaran.add(-1);
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
