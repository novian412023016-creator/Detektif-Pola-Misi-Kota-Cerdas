import greenfoot.*;

public class Player extends Actor
{
    public void act()
    {
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 4);
        }

        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 4);
        }

        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 4, getY());
        }

        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 4, getY());
        }
    }
}