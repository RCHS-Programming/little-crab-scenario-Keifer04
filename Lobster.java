import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  public void act()
    {
    
       
        move();
       lookForCrab();
       randomTurn();
       turnAtEdge();
    }
    public void move( )
    {
        move(4);
    }
    /*
     * Hello this is notes look at them crab it will be eaten
     */
  
    
    public void lookForCrab()
    {
      if(isTouching(Crab.class))
       {
           removeTouching(Crab.class);
           Greenfoot.playSound("au.wav");
         
           Greenfoot.stop();
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
