import greenfoot.*;  

public class Pelanggaran3 extends Pelanggaran
{
    void spawnBaru(){
        // Method kosong karena pembuatan objek baru ditangani di parent class
    }
    
    void maju(){
        setLocation(getX(), getY()+2);
    }
    
    public void act() 
    {
        super.act();
    }    
}
