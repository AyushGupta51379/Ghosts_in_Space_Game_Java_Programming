import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banana extends Actor
{
    /**
    * The constructor of the class which initializes the direction of the banana
    */
    public Banana() {
        super();

        // Randomly turn the cherry
        turn(Greenfoot.getRandomNumber(360));
    }

    
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Move the banana in a unit of time
        move(1);

        // Remove the banana if it is out of the world
        World world = getWorld();
        if (getX() < 0 || getX() >= world.getWidth() ||
            getY() < 0 || getY() >= world.getHeight()) {
            world.removeObject(this);
        }
        // Add your action code here.
    }    
}
