import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Move the bullet in a unit of time
        move(8);
        
        // When bullet hits rock, increase score by 1, remove bullet, remove rock 
        if(!getObjectsInRange(30, Rock.class).isEmpty()){
            Score score = (Score) getWorld().getObjects(Score.class).get(0);
            score.increase();
            
            Rock rock = (Rock) getObjectsInRange(30, Rock.class).get(0);
            getWorld().removeObject(rock);
            getWorld().removeObject(this); 
            return;
        }
        
        // When bullet hits cherry, increase score by 1, remove cherry, remove bullet
        else if(!getObjectsInRange(25, Cherry.class).isEmpty()){
            Score score = (Score) getWorld().getObjects(Score.class).get(0);
            score.increase();
            score.increase();
            score.increase();
            
            Cherry cherry = (Cherry) getObjectsInRange(25, Cherry.class).get(0);
            getWorld().removeObject(cherry);
            getWorld().removeObject(this); 
            return;
        }
        
        // When bullet hits banana, increase score by 1, remove banana, remove bullet
        else if(!getObjectsInRange(25, Banana.class).isEmpty()){
            Score score = (Score) getWorld().getObjects(Score.class).get(0);
            score.increase();
            score.increase();
            score.increase();
            score.increase();
            score.increase();
            
            Banana banana = (Banana) getObjectsInRange(25, Banana.class).get(0);
            getWorld().removeObject(banana);
            getWorld().removeObject(this); 
            return;
        }


        
        // Remove the bullet if it is out of the world
        World world = getWorld();
        if (getX() < 0 || getX() >= world.getWidth() ||
            getY() < 0 || getY() >= world.getHeight()) {
            world.removeObject(this);
        }

    }    
}
