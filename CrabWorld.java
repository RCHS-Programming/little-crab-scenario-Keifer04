import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(640, 660, 1);
        populateWorld();
       
    }
    
    public void populateWorld()
    {
         addObject(new Crab(), 150, 100);
        addObject(new Lobster(), 400, 100);
        addObject(new Lobster(), 400, 300);
        addObject(new Lobster(), 400, 500);
        addObject(new Worm(), 50, 50);
        addObject(new Worm(), 250, 100);
        addObject(new Worm(), 380, 400);
        addObject(new Worm(), 480, 500);
        addObject(new Worm(), 450, 350);
        addObject(new Worm(), 300, 150);
        addObject(new Worm(), 100, 250);
        addObject(new Worm(), 200, 200);
    }
}