import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {

        move();
       lookForWorm();
       checkKeyPress();
       
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
    
    
  
}


