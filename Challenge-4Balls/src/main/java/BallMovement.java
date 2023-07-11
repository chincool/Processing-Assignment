import processing.core.PApplet;
import java.util.ArrayList;

public class BallMovement extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    ArrayList<Ball> balls = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("BallMovement", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for(int i = 0; i < 4;)
        {
            balls.add(new Ball(0,(i+1)*HEIGHT/5,++i));
        }
    }

    @Override
    public void draw() {
        for(int i = 0; i < 4;++i)
        {
            drawCircle(balls.get(i));
        }
    }

    private void drawCircle(Ball b) {
        ellipse(b.xStart, b.yStart, DIAMETER, DIAMETER);
        b.xStart += b.speed;
    }
}
