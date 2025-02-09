package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
public class View extends JFrame{
    private JTextField ArmorIDField;
    private JButton submitButton;
    private JButton clearButton;
    private JLabel resultLabel;
    private JButton repairButton;

    public View() {
        setTitle("SuperHero Armor QC");
        setSize(400, 250); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        ArmorIDField = new JTextField(10);
        submitButton = new JButton("submit");
        clearButton = new JButton("clear");
        repairButton = new JButton("Repair");
        resultLabel = new JLabel();

        repairButton.setVisible(false);
        
        JPanel panel = new JPanel();
        panel.add(new JLabel());
        panel.add(ArmorIDField);
        panel.add(submitButton);
        panel.add(clearButton);
        panel.add(resultLabel);
        panel.add(repairButton);
        add(panel);
    }
    public String getArmorID() {
        return ArmorIDField.getText();
    }
    public void setArmorIDtoDefault() {
        ArmorIDField.setText("");
    }
    public void setResult(String result) {
        resultLabel.setText(result);
    }
    public void setRepairButtonVisible() {
        repairButton.setVisible(true);
    }
    public void setRepairButtonInvisible() {
        repairButton.setVisible(false);
    }
    public void addSubmitButtonListener(ActionListener listener) {
        submitButton.addActionListener(listener);
    }
    public void addClearButtonListener(ActionListener listener) {
        clearButton.addActionListener(listener);
    }
    public void addRepairButtonListener(ActionListener listener) {
        repairButton.addActionListener(listener);
    }

}
