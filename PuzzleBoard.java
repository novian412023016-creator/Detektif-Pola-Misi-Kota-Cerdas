import greenfoot.*;

public class PuzzleBoard extends Actor
{
    private boolean active = false;

    public void act()
    {
        Player player = (Player)getOneIntersectingObject(Player.class);

        if (player != null && !active)
        {
            active = true;

            EasyWorld world = (EasyWorld)getWorld();
            world.showPuzzle();
        }
    }
}
