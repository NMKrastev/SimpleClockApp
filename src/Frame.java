import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Frame extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    JLabel timeLabel;
    String time;

    Frame() {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        timeFormat = new SimpleDateFormat("kk:mm:ss");
        timeLabel = new JLabel();

        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);

        this.add(timeLabel);
        this.setVisible(true);

    }
}
