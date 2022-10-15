import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JFrame implements ActionListener {
    private final int BACKGROUND_WIDTH = 400;
    private final int BACKGROUND_HEIGHT = 400;
    private final int TIMER_DELAY = 1000;
    private final Timer timer = new Timer(TIMER_DELAY, this);
    public int ticksFromStart = 0;

    private Panda panda;

    public MyPanel() {
        setTitle("Drawing panel");
        setSize(BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        timer.start();


        this.panda = new Panda(ticksFromStart, 200, 200, 200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            ++ticksFromStart;
        }
    }
    @Override
    public void paint(final Graphics g) {
        super.paint(g);


        panda.setX(ticksFromStart);




        panda.draw(g);

//        g2d.setColor(Color.WHITE);
//        g2d.fillRect(0, 0, BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
//
//        g2d.setColor(Color.BLACK);
//        g2d.drawOval(ticksFromStart, BACKGROUND_HEIGHT / 2, BACKGROUND_WIDTH / 10, BACKGROUND_WIDTH / 10);
//        g2d.setColor(Color.GREEN);
//        g2d.fillOval(ticksFromStart, BACKGROUND_HEIGHT / 2, BACKGROUND_WIDTH / 10, BACKGROUND_WIDTH / 10);



    }

}