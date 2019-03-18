import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.GeneralPath;

public class Animation extends JPanel implements ActionListener {
    private static int maxWidth;
    private static int maxHeight;
    private Timer timer;

    private double angle = 0;
    private double scale = 1;
    private double delta = 0.01;

    public Animation() {
        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);

        g2d.setBackground(new Color(192, 192, 192));
        g2d.clearRect(0, 0, maxWidth, maxHeight);

        g2d.translate(maxWidth / 2, maxHeight / 2);

        BasicStroke bs2 = new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
        g2d.setStroke(bs2);
        g2d.drawRect(-320, -320, 640, 640);

        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float) scale));
        g2d.rotate(angle);

        GradientPaint gp = new GradientPaint(
                -20, -20,
                new Color(2, 227, 255),
                100, 20,
                Color.BLUE,
                true
        );
        g2d.setPaint(gp);

        // upperTriangle
        g2d.fillPolygon(new int[]{133, 164, 257}, new int[]{11, 92, 59}, 3);
        g2d.setColor(new Color(0,0,255));

        // leftTriangle
        g2d.fillPolygon(new int[]{18, 58, 26}, new int[]{183, 112, 50}, 3);
        g2d.setColor(new Color(255,0,128));

        // upperPolygon
        g2d.fillPolygon(new int[]{26, 133, 164, 58}, new int[]{50, 11, 92, 112}, 4);
        g2d.setColor(new Color(128,128,255));

        // rightPolygon
        g2d.fillPolygon(new int[]{257, 164, 182, 281}, new int[]{59, 92, 146, 143}, 4);
        g2d.setColor(new Color(255,0,128));

        // rightTriangle
        g2d.fillPolygon(new int[]{182, 281, 131}, new int[]{146, 143, 240}, 3);
        g2d.setColor(new Color(255,255,255));

        // leftPolygon
        double[][] leftPolygon = {{131, 240}, {18, 183}, {58, 112}, {182, 146}};
        GeneralPath lPolygon = new GeneralPath();
        lPolygon.moveTo(leftPolygon[0][0], leftPolygon[0][1]);
        for (int k = 1; k < leftPolygon.length; k++)
            lPolygon.lineTo(leftPolygon[k][0], leftPolygon[k][1]);
        lPolygon.closePath();
        g2d.fill(lPolygon);

        g2d.setColor(Color.YELLOW);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.add(new Animation());

        frame.setVisible(true);

        Dimension size = frame.getSize();
        Insets insets = frame.getInsets();
        maxWidth = size.width - insets.left - insets.right - 1;
        maxHeight = size.height - insets.top - insets.bottom - 1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (scale < 0.01 || scale > 0.99)
            delta = -delta;

        scale += delta;
        angle -= 0.01;

        repaint();
    }
}