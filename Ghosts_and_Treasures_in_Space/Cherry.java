import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cherry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cherry extends Actor
{
    /**
    * The constructor of the class which initializes the direction of the cherry
    */
    public Cherry() {
        super();

        // Randomly turn the cherry
        turn(Greenfoot.getRandomNumber(360));
    }

    /**
     * Move the cherry
     */
    public void act() 
    {
        // Move the cherry in a unit of time
        move(1);

        // Remove the cherry if it is out of the world
        World world = getWorld();
        if (getX() < 0 || getX() >= world.getWidth() ||
            getY() < 0 || getY() >= world.getHeight()) {
            world.removeObject(this);
        }
        // Add your action code here.
    }    
}
