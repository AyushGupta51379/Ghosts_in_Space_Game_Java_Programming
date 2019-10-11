import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The space world of the game.
 */
public class Space extends World
{
    /**
     * The constructor of the space world.
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size
        // of 1x1 pixels and without actors staying in the border
        super(900, 600, 1, false); 
        
        // Create a player in the game
        Spaceship spaceship = new Spaceship();
        addObject(spaceship, 450, 300);
        
        // Create the score in the game
        Score score = new Score();
        addObject(score, 50, 25);
    }

    /**
     * Add rocks and cherries to the game
     */
    public void act() {
        // Add a rock anywhere along the border of the game
        // with a probability of 0.05
        if (Greenfoot.getRandomNumber(100) < 5) {
            Rock rock = new Rock();
            
            switch (Greenfoot.getRandomNumber(4)) {
                case 0:
                    // Add the rock on the top border
                    addObject(rock, Greenfoot.getRandomNumber(getWidth()), 0);
                    break;
                case 1:
                    // Add the rock on the bottom border
                    addObject(rock, Greenfoot.getRandomNumber(getWidth()), getHeight() - 1);
                    break;
                case 2:
                    // Add the rock on the left border
                    addObject(rock, 0, Greenfoot.getRandomNumber(getHeight()));
                    break;
                case 3:
                    // Add the rock on the right border
                    addObject(rock, getWidth() - 1, Greenfoot.getRandomNumber(getHeight()));
                    break;
            }
        }
        
        // Add a cherry anywhere along the border of the game
        // with a probability of 0.02
        if (Greenfoot.getRandomNumber(100) < 2) {
            Cherry cherry = new Cherry();
            
            switch (Greenfoot.getRandomNumber(4)) {
                case 0:
                    // Add the cherry on the top border
                    addObject(cherry, Greenfoot.getRandomNumber(getWidth()), 0);
                    break;
                case 1:
                    // Add the cherry on the bottom border
                    addObject(cherry, Greenfoot.getRandomNumber(getWidth()), getHeight() - 1);
                    break;
                case 2:
                    // Add the cherry on the left border
                    addObject(cherry, 0, Greenfoot.getRandomNumber(getHeight()));
                    break;
                case 3:
                    // Add the cherry on the right border
                    addObject(cherry, getWidth() - 1, Greenfoot.getRandomNumber(getHeight()));
                    break;
            }
        }
        
        // Add a banana anywhere along the border of the game
        // with a probability of 0.01
        if (Greenfoot.getRandomNumber(100) < 1) {
            Banana banana = new Banana();
            
            switch (Greenfoot.getRandomNumber(4)) {
                case 0:
                    // Add the banana on the top border
                    addObject(banana, Greenfoot.getRandomNumber(getWidth()), 0);
                    break;
                case 1:
                    // Add the banana on the bottom border
                    addObject(banana, Greenfoot.getRandomNumber(getWidth()), getHeight() - 1);
                    break;
                case 2:
                    // Add the banana on the left border
                    addObject(banana, 0, Greenfoot.getRandomNumber(getHeight()));
                    break;
                case 3:
                    // Add the banana on the right border
                    addObject(banana, getWidth() - 1, Greenfoot.getRandomNumber(getHeight()));
                    break;
            }
        }

    }
}
