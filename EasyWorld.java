import greenfoot.*;

public class EasyWorld extends World
{
    private int score = 0;
    private int lives = 3;

    public EasyWorld()
    {
        super(800, 600, 1);

        prepare();
    }

   private void prepare()
{
    Player player = new Player();
    addObject(player, 100, 500);

    PuzzleBoard puzzle = new PuzzleBoard();
    addObject(puzzle, 400, 300);

    showText("SCORE: " + score, 100, 30);
    showText("LIVES: " + lives, 700, 30);

    showText("Cari papan puzzle!", 400, 100);
}

public void showPuzzle()
{
    showText("", 400, 100);

    showText("MERAH - BIRU - MERAH - ?", 400, 150);
    showText("Pilih jawaban:", 400, 200);

    AnswerButton answer1 = new AnswerButton(true);
    addObject(answer1, 300, 400);

    AnswerButton answer2 = new AnswerButton(false);
    addObject(answer2, 400, 400);

    AnswerButton answer3 = new AnswerButton(false);
    addObject(answer3, 500, 400);
}
    public void correctAnswer()
    {
        score += 10;

        showText("BENAR! +10", 400, 250);
        showText("SCORE: " + score, 100, 30);

        Greenfoot.delay(30);
    }

    public void wrongAnswer()
    {
        lives--;

        showText("SALAH!", 400, 250);
        showText("LIVES: " + lives, 700, 30);

        if (lives <= 0)
        {
            Greenfoot.setWorld(new GameOverWorld());
        }
    }
}