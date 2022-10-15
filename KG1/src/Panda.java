import java.awt.*;
import java.awt.geom.Ellipse2D;


public class Panda {

    private int x;
    private int y;
    private int width;
    private int height;

    public Panda(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    void draw(final Graphics gr) {


        Graphics2D e = (Graphics2D) gr;



//        e.setStroke(new BasicStroke(10));
//        gr.setColor(Color.BLACK);
//        gr.drawOval(this.x, this.y, 100, 100);
//
//
//        gr.setColor(Color.RED);
//        gr.fillOval(this.x, this.y, 100, 100);



        // фон
        gr.setColor(Color.WHITE);
        gr.fillRect(0, 0, 4000, 4000);

        // хвост
        gr.setColor(Color.BLACK);
        gr.fillOval((int) (this.x+this.width*0.43), (int) (this.y+this.height*0.12), (int) (this.height*0.125), (int) (this.height*0.125));

        // тело
        e.setStroke(new BasicStroke(10));
        gr.setColor(Color.BLACK);
        gr.drawArc((int) (this.x+this.width*0.023), (int) (this.y+this.height*0.25), (int) (this.width*0.95), (int) (this.height*0.95), 0, 180);

        gr.drawLine((int) (this.x+this.width*0.023), (int) (this.y+this.height*0.75), (int) (this.x+this.width*0.974), (int) (this.y+this.height*0.75));

        // ухо левое и правое
        Ellipse2D ellipse = new Ellipse2D.Double(this.x+this.width*0.06,this.y+this.height*0.195,this.width*0.25,this.height*0.15);
        Ellipse2D ellipse1 = new Ellipse2D.Double(this.x+this.width*0.69,this.y+this.height*0.195,this.width*0.25,this.height*0.15);
        ((Graphics2D) gr).fill(ellipse);
        ((Graphics2D) gr).fill(ellipse1);

        // глаз левый
        gr.fillArc((int) (this.x+this.width*0.075), (int) (this.y+this.height*0.58), (int) (this.width*0.3375), (int) (this.height*0.3375), 0, 180);

        gr.setColor(Color.WHITE);

        gr.fillOval((int) (this.x+this.width*0.227), (int) (this.y+this.height*0.6), (int) (this.width*0.1), (int) (this.height*0.1));

        gr.setColor(Color.BLACK);

        // глаз левый
        gr.fillArc((int) (this.x+this.width*0.58), (int) (this.y+this.height*0.58), (int) (this.width*0.3375), (int) (this.height*0.3375), 0, 180);

        gr.setColor(Color.WHITE);

        gr.fillOval((int) (this.x+this.width*0.73), (int) (this.y+this.height*0.6), (int) (this.width*0.1), (int) (this.height*0.1));


        gr.setColor(Color.BLACK);

        // нос
        gr.drawPolygon(new int[] {(int) (this.x+this.width*0.45), (int) (this.x+this.width*0.5), (int) (this.x+this.width*0.55)}, new int[] {(int) (this.y+this.width*0.68), (int) (this.y+this.width*0.73), (int) (this.y+this.width*0.68)}, 3);



//        RoundRectangle2D rectRound = new RoundRectangle2D.Double(20,30,130,100,18,15);




//        gr.setColor(Color.BLACK);
//        gr.fillOval(initialPositionX1 + MyPanel.ticksFromStart, (int) (this.y * 1.8), 15, 15);
//
//
//        e.setStroke(new BasicStroke(3));
//        gr.setColor(Color.BLACK);
//        gr.drawOval(initialPositionX2 + MyPanel.ticksFromStart, (int) (this.y * 1.26), 70, 70);


    }
}