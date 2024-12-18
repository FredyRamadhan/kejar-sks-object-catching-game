import greenfoot.*; 

public class Karakter extends Actor {
    private String playerName;  // Variabel untuk menyimpan nama pemain
    private IPK IPK; 
    
    public Karakter(String playerName, IPK IPK) { 
        this.playerName = playerName;
        this.IPK = IPK; // Setel referensi objek IPK
    }

    public String getPlayerName() {
        return playerName;
    }

    public void dimakan() {
        Nilai.add(1);
    }

    public void act() {
        if(Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 14, getY());
        } else if(Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 14, getY());
        }

        if(isTouching(Pelanggaran.class)) {
            MaxPelanggaran.add(-1);
            dimakan();
        }

         if (MaxPelanggaran.value == 0) {
            Greenfoot.delay(1);
            Greenfoot.setWorld(new Endpage(playerName, IPK.getValue())); // Kirim IPK
            getWorld().removeObject(this);
        } else if (SKSdiambil.value == 24) {
            Greenfoot.delay(1);
            Greenfoot.setWorld(new Endpage2(playerName, IPK.getValue())); // Kirim IPK
            getWorld().removeObject(this);
        }
    }
}
