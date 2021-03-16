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
       randomTurn();
       turnAtEdge();
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
        }  
        
    }
    
    /*
     * make the crab turn randomly 
     */
    public void randomTurn()
    {
        if(Greenfoot.getRandomNumber(100)<10 )
       {
           turn(Greenfoot.getRandomNumber(91) -45 );
       } 
    }
    
    public void turnAtEdge()
    {
     if( isAtEdge())
        {
            turn (17);
            
        }   
        
    }
  
}


