import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int wormEat;
    
    public Crab()
    {
        image1 = new GreenfootImage ("crab.png");
        image2 = new GreenfootImage ("crab2.png");
        setImage (image1);
        wormEat = 0;
        
    }
    public void act()
    {

    
       move();
       lookForWorm();
       checkKeyPress();
       switchImage();
       
       
    }
    
    public void move( )
    {
        move(5);
        
    }    
    
    /*
     * Hello this is notes look at them worms it will be eaten
     */
  
    
    public void lookForWorm()
    {
      if(isTouching(Worm.class))
       {
           removeTouching(Worm.class);
           Greenfoot.playSound("slurp.wav");
           wormEat = wormEat + 1; 
           
           getWorld().showText("Score: " + wormEat, 50, 500);
           
           
           if ( wormEat ==8)
           {Greenfoot.playSound ("fanfare.wav");
               Greenfoot.stop();
            }
        }  
        
    }
    
    
    /*
     * check wether a key is pressed if so turn the crab
     */
    
    public void checkKeyPress()
    {
              if (Greenfoot.isKeyDown("left"))
       {
            turn(-4);
        }
       if (Greenfoot.isKeyDown("right"))
       {
           turn(4);
        } 
    }
    
    
    /**
     * animate crab 
     */
    public void switchImage()
    {
      {
        if (getImage() == image1)
       {setImage (image2);}
       else
       {setImage (image1);}
    }  
    }
  
}


