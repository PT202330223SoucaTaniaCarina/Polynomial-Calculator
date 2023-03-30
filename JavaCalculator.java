import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    Polinom p = new Polinom();
    Polinom q = new Polinom();

    void Polinom (Polinom p, Polinom q){
        p.getPolinom().put(3, 6.0);
        p.getPolinom().put(2, 3.0);
        q.getPolinom().put(1, 3.0);
        q.getPolinom().put(3, 6.0);
        String pol1 = textFieldPol1.getText();
        String pol2 = textFieldPol2.getText();

//        Polinom newPolinom = new Polinom();
//        Pattern pattern = Pattern.compile("\\d");
//        Matcher matcher = pattern.matcher(pol1);
//        for(Map.Entry<Integer, Double> entry: this.getPolinom().entrySet()) {
//            int count = 0;
//            while (matcher.find()) {
//                if (count % 2 == 0) {
//                    newPolinom.entry.getKey() = Integer.(matcher.group());
//                }
//                else {
//                    newPolinom.entry.getValue() = Integer.(matcher.group());
//                }
//                count++;
//            }
//        }
//
//        Polinom newPolinom2 = new Polinom();
//        Matcher matcher2 = pattern.matcher(pol2);
//        for(Map.Entry<Integer, Double> entry: this.getPolinom().entrySet()) {
//            int count = 0;
//            while (matcher2.find()) {
//                if (count % 2 == 0) {
//                    newPolinom2.entry.getKey() = Integer.(matcher2.group());
//                }
//                else {
//                    newPolinom2.entry.getValue() = Integer.(matcher2.group());
//                }
//                count++;
//            }
//        }

    }

    public JavaCalculator() {
        AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom(p, q);

                textFieldPol1.setText(p.toString());
                textFieldPol2.setText(q.toString());
                TextFieldRezultat.setText(Operatii.adunare(p, q).toString());
            }
        });

        SubButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom(p, q);

                textFieldPol1.setText(p.toString());
                textFieldPol2.setText(q.toString());
                TextFieldRezultat.setText(Operatii.scadere(p, q).toString());
            }
        });

        MulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom(p, q);

                textFieldPol1.setText(p.toString());
                textFieldPol2.setText(q.toString());
                TextFieldRezultat.setText(Operatii.inmultire(p, q).toString());
            }
        });

        DerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom(p, q);

                textFieldPol1.setText(p.toString());
                textFieldPol2.setText(q.toString());
                TextFieldRezultat.setText(Operatii.dervivare(p).toString());
            }
        });

        IntButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom(p, q);

                textFieldPol1.setText(p.toString());
                textFieldPol2.setText(q.toString());
                TextFieldRezultat.setText(Operatii.integrare(p).toString());
               // String pol1 = textFieldPol1.getText();
               // test.setText(pol1);
            }
        });
//        textFieldPol1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String pol1 = textFieldPol1.getText();
//
//            }
//        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }
}
