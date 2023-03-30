import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int count=0;
    private JLabel label;
    private  JFrame frame;
    private JPanel Panel;


    public GUI(){

        JFrame frame = new JFrame();

        JButton button = new JButton("Click me");
        button.addActionListener(this);

         label = new JLabel("Number of clicks: 0");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(70, 70, 30, 70));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My Gui");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
