import javax.swing.*;
import java.awt.*;

class HelloSwing {
    HelloSwing() {
        JFrame jFrm = new JFrame("Hello World");
        jFrm.setSize(375, 150);
        jFrm.setLocation(496, 309);
        jFrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel jLab = new JLabel("Текс в окошке. Hello world again");
        //jLab.setLocation((jFrm.getWidth() / 2) - jLab.getWidth(), (jFrm.getHeight() / 2) - jLab.getHeight());
        jFrm.add(jLab);
        jFrm.setVisible(true);
    }
}


public class HelloWorld {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(HelloSwing::new);
    }
}
