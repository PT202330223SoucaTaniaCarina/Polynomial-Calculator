import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
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


    public JavaCalculator() {
        AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom p = new Polinom();
                Polinom q = new Polinom();
                p.getPolinom().put(3, 6.0);
                p.getPolinom().put(2, 3.0);
                q.getPolinom().put(1, 3.0);
                q.getPolinom().put(3, 6.0);

                textFieldPol1.setText(p.toString());
                textFieldPol2.setText(q.toString());
                TextFieldRezultat.setText(Operatii.adunare(p, q).toString());
            }
        });

        SubButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom p = new Polinom();
                Polinom q = new Polinom();
                p.getPolinom().put(3, 6.0);
                p.getPolinom().put(2, 3.0);
                q.getPolinom().put(1, 3.0);
                q.getPolinom().put(3, 6.0);

                textFieldPol1.setText(p.toString());
                textFieldPol2.setText(q.toString());
                TextFieldRezultat.setText(Operatii.scadere(p, q).toString());
            }
        });

        MulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom p = new Polinom();
                Polinom q = new Polinom();
                p.getPolinom().put(3, 6.0);
                p.getPolinom().put(2, 3.0);
                q.getPolinom().put(1, 3.0);
                q.getPolinom().put(3, 6.0);

                textFieldPol1.setText(p.toString());
                textFieldPol2.setText(q.toString());
                TextFieldRezultat.setText(Operatii.inmultire(p, q).toString());
            }
        });

        DerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom p = new Polinom();
                Polinom q = new Polinom();
                p.getPolinom().put(3, 6.0);
                p.getPolinom().put(2, 3.0);
                q.getPolinom().put(1, 3.0);
                q.getPolinom().put(3, 6.0);

                textFieldPol1.setText(p.toString());
                textFieldPol2.setText(q.toString());
                TextFieldRezultat.setText(Operatii.dervivare(p).toString());
            }
        });

        IntButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom p = new Polinom();
                Polinom q = new Polinom();
                p.getPolinom().put(3, 6.0);
                p.getPolinom().put(2, 3.0);
                q.getPolinom().put(1, 3.0);
                q.getPolinom().put(3, 6.0);

                textFieldPol1.setText(p.toString());
                textFieldPol2.setText(q.toString());
                TextFieldRezultat.setText(Operatii.integrare(p).toString());
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
