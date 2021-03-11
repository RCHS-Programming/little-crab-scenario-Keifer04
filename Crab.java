import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
       turn(-100); 
       
       move(30);
    }
    
    public void move( )
    {
        move(1);
    }
}


