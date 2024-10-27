import greenfoot.*;

public class Nilai extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    public static double value;
    private static double target;
    private String prefix;
    
    public Nilai()
    {
        this(new String());
    }

    public Nilai(String prefix)
    {
        background = getImage();
        value = 0.0;
        target = 0.0;
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

    public static void add(double score)
    {
        target += score;
    }

    public static double getValue()
    {
        return target;
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
