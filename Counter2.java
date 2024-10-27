import greenfoot.*;

public class Counter2 extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    public static int value;
    private static int target;
    private String prefix;
    
    public Counter2()
    {
        this(new String());
    }
    
    public Counter2(String prefix)
    {
        background = getImage(); 
        value = 5;
        target = 5;
        this.prefix = prefix;
        updateImage();
    }
    
    public void act() 
    {
        if (value < target) {
            value++;
            updateImage();
        }
        else if (value > target) {
            value--;
            updateImage();
        }
    }
    
    public static void add(int score)
    {
        target += score;
    }
    
    public int getValue()
    {
        return target;
    }
    
    public void setValue(int newValue)
    {
        target = newValue;
        value = newValue;
        updateImage();
    }
    
    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
        updateImage();
    }
    
    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage(prefix + value, 22, Color.BLACK, transparent);
        
        if (text.getWidth() > image.getWidth() - 20)
        {
            image.scale(text.getWidth() + 20, image.getHeight());
        }
        
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
                        (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
}
