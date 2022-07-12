import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    Frame() {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

    }
}
