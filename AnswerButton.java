import greenfoot.*;

public class AnswerButton extends Actor
{
    private boolean correct;

    public AnswerButton(boolean correct)
    {
        this.correct = correct;
    }

    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            EasyWorld world = (EasyWorld)getWorld();

            if (correct)
            {
                world.correctAnswer();
            }
            else
            {
                world.wrongAnswer();
            }
        }
    }
}

