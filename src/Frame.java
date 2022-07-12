import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Frame extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;

    Frame() {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Clock");
        this.setLayout(new FlowLayout());
        this.setSize(250, 200);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        timeFormat = new SimpleDateFormat("kk:mm:ss");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("FF.MM.yyyy");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 50));
        timeLabel.setForeground(new Color(255, 0 , 0));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Arial", Font.PLAIN, 50));

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Arial", Font.PLAIN, 15));

        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTime();

    }

    public void setTime() {
        while(true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
