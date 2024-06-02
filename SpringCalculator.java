import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpringCalculator {
    private JFrame frame;
    private JTextField volumeField;
    private JTextField heightField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public SpringCalculator() {
        frame = new JFrame("Калькулятор потенційної енергії ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(4, 2));

        JLabel volumeLabel = new JLabel("Висота греблі в метрах (h):");
        volumeField = new JTextField();
        JLabel heightLabel = new JLabel("Об'єм води в метрах^3 (V):");
        heightField = new JTextField();
        calculateButton = new JButton("Розрахувати");
        resultLabel = new JLabel("");

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateForce();
            }
        });

        frame.add(volumeLabel);
        frame.add(volumeField);
        frame.add(heightLabel);
        frame.add(heightField);
        frame.add(calculateButton);
        frame.add(resultLabel);
    }

    public void show() {
        frame.setVisible(true);
    }

    private void calculateForce() {
        try {
            double volume = Double.parseDouble(volumeField.getText());
            double height = Double.parseDouble(heightField.getText());
            double force = 0.00098 *  volume * height;
            resultLabel.setText("Потенційна енергія води в МДж (W): "  + force);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Введіть числові значення для жорсткості та стиснення.", "Помилка", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SpringCalculator calculator = new SpringCalculator();
                calculator.show();
            }
        });
    }
}
