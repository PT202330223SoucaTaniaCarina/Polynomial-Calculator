import javax.swing.*;

public class JavaCalculator {
    private JPanel JavaCalculator;
    private JLabel Pol1;
    private JLabel Pol2;
    private JTextField textFieldPol2;
    private JTextField textFieldPol1;
    private JLabel RezultatLabel;
    private JTextField TextFieldRezultat;
    private JButton AddButton;
    private JButton SubButton;
    private JButton MulButton;
    private JButton DivButton;
    private JButton DerButton;
    private JButton IntButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
