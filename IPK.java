import greenfoot.*;


public class IPK extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    public static int value;
    private static int target;
    private String prefix;
    private static double nilai;
    private static double totalNilai;
    private static double IPK;
    
    public IPK()
    {
        this(new String());
    }

    public IPK(String prefix)
    {
        background = getImage();
        value = 0;
        target = 0;
        nilai = 0.0;
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
        };
        
        if (nilai < totalNilai) {
            nilai++;
            IPK();
            updateImage();
        }
        else if (nilai > totalNilai) {
            nilai--;
            IPK();
            updateImage();
        }
    }

    private void IPK() 
    {
        double nilaiIPK = nilai / (double) value;
        IPK = nilaiIPK;
    }
    public static void add(double nilai, int SKS)
    {
        totalNilai += nilai;
        target += SKS;
    }

    public static double getValue()
    {
        return (Math.round(IPK * 100.0) / 100.0);
    }

    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage(prefix + (Math.round(IPK * 100.0) / 100.0), 22, Color.BLACK, transparent);
        
        if (text.getWidth() > image.getWidth() - 20)
        {
            image.scale(text.getWidth() + 20, image.getHeight());
        }
        
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
                        (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
}


