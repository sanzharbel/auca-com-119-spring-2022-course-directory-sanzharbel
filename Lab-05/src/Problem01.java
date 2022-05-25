import javax.swing.*;
import java.awt.*;

public class Problem01 extends JFrame {
    Problem01() {
        var colorPanel = new JPanel();
        colorPanel.setBackground(Color.RED);
        var colorSelectionPanel = new JPanel();
        colorSelectionPanel.setBackground(Color.DARK_GRAY);
        //colorSelectionPanel.setLayout(newFlowLayout());
        setLayout(new BorderLayout());
        add(colorPanel, BorderLayout.CENTER);
        add(colorSelectionPanel, BorderLayout.SOUTH);

        var redButton = new JButton("RED");
        colorSelectionPanel.add(redButton);
        var greenButton = new JButton("GREEN");
        colorSelectionPanel.add(greenButton);
        var blueButton = new JButton("BLUE");
        colorSelectionPanel.add(blueButton);
    }


    public static void main(String[] args) {
        var frame = new Problem01();
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setTitle("First GUI App");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
