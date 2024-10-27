import greenfoot.*;  

public abstract class no extends Actor
{
    abstract void cetakbaru();
    abstract void maju();
    
    void dimakan(){
        // Buat objek baru sesuai dengan tipe class-nya
        if(this instanceof no1) {
            no1 newNo1 = new no1();
            getWorld().addObject(newNo1, Greenfoot.getRandomNumber(1180)+100, 0);
        } 
        else if(this instanceof no2) {
            no2 newNo2 = new no2();
            getWorld().addObject(newNo2, Greenfoot.getRandomNumber(1180)+100, 0);
        }
        else if(this instanceof no3) {
            no3 newNo3 = new no3();
            getWorld().addObject(newNo3, Greenfoot.getRandomNumber(1180)+100, 0);
        }
        Counter2.add(-1);
        getWorld().removeObject(this);
    }
    
    public void act() 
    {
        maju();
        if(getY()>=719){
            setLocation(Greenfoot.getRandomNumber(1180)+100,0);
        }
        if(isTouching(kodok.class)){
            dimakan();
        }
        if(Counter2.value==0){
            getWorld().removeObject(this);
        }
    }    
}
