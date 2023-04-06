import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

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

//deriv, scadere
    public JavaCalculator() {  //+4x^5-3x^4+1x^2-8x^1+1x^0
                               //+3x^4-1x^3+1x^2+2x^1-1x^0
        AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pol1 = textFieldPol1.getText();
                String pol2 = textFieldPol2.getText();

                  Polinom p1 = new Polinom(pol1);
                  Polinom p2 = new Polinom(pol2);

                  textFieldPol1.setText(p1.toString());
                  textFieldPol2.setText(p2.toString());
                  TextFieldRezultat.setText(Operatii.adunare(p1, p2).toString());
            }
        });

        SubButton.addActionListener(new ActionListener() {  //+4x^5-3x^4+1x^2-8x^1+1x^0
                                                            //+3x^4-1x^3+1x^2+2x^1-1x^0
            @Override
            public void actionPerformed(ActionEvent e) {
                String pol1 = textFieldPol1.getText();
                String pol2 = textFieldPol2.getText();

                Polinom p1C = new Polinom(pol1);
                Polinom p2C = new Polinom(pol2);

                textFieldPol1.setText(p1C.toString());
                textFieldPol2.setText(p2C.toString());
                TextFieldRezultat.setText(Operatii.scadere(p1C, p2C).toString());
            }
        });

        MulButton.addActionListener(new ActionListener() { // 3x^2-x^1+1x^0
                                                            // 1x^1-2x^0
            @Override
            public void actionPerformed(ActionEvent e) {
                String pol1 = textFieldPol1.getText();
                String pol2 = textFieldPol2.getText();

                Polinom p1C = new Polinom(pol1);
                Polinom p2C = new Polinom(pol2);

                textFieldPol1.setText(p1C.toString());
                textFieldPol2.setText(p2C.toString());
                TextFieldRezultat.setText(Operatii.inmultire(p1C, p2C).toString());
            }
        });

        DerButton.addActionListener(new ActionListener() { // 1x^3-2x^2+6x^1-5
            @Override
            public void actionPerformed(ActionEvent e) {
                String pol1 = textFieldPol1.getText();

                Polinom p1C = new Polinom(pol1);

                textFieldPol1.setText(p1C.toString());

                TextFieldRezultat.setText(Operatii.dervivare(p1C).toString());
            }
        });

        IntButton.addActionListener(new ActionListener() {  // x^3+4.0x^2+5.0
            @Override
            public void actionPerformed(ActionEvent e) {
                String pol1 = textFieldPol1.getText();

                Polinom p1C = new Polinom(pol1);

                textFieldPol1.setText(p1C.toString());

                TextFieldRezultat.setText(Operatii.integrare(p1C).toString());
            }
        });


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }
}
