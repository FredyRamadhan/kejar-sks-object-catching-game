import greenfoot.*; 

public class exit extends Actor
{
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),
            (int)Math.round(getImage().getHeight()*0.9));
        }
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.delay(1);
            Greenfoot.setWorld(new Homepage());
        }
    }    
}
