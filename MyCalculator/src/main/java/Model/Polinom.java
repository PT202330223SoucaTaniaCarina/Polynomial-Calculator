package Model;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
///1x^5-3x^3+2x^1-3
//1x^2+1x^1+3
public class Polinom {

     private HashMap<Integer, Double> polinom;

    public HashMap<Integer, Double> getPolinom() {
        return polinom;
    }

    public void setPolinom(HashMap<Integer, Double> polinom) {
        this.polinom = polinom;
    }

    public Polinom(){
        super();
        this.polinom = new HashMap<Integer, Double>();
    }

    public Polinom(String expression) {
        polinom = new HashMap<>();
        parse(expression);
    }


    private void parse(String expression) {
        Pattern termPattern = Pattern.compile("(\\+|-)?(\\d*(\\.\\d+)?)(x(\\^(\\d+))?)?");
        Matcher matcher = termPattern.matcher(expression);

        while (matcher.find()) {
            String sign = matcher.group(1);
            String coefficient = matcher.group(2);
            String variable = matcher.group(4);
            String exponent = matcher.group(6);

            double coeff = (coefficient.isEmpty()) ? 0.0 : Double.parseDouble(coefficient);
            coeff = (sign != null && sign.equals("-")) ? -coeff : coeff;

            int exp = (exponent != null) ? Integer.parseInt(exponent) : 0;

            if (polinom.containsKey(exp)) {
                coeff += polinom.get(exp);
            }

            if (coeff != 0.0) {
                polinom.put(exp, coeff);
            }
        }
    }

    public int degree() {
        if (polinom.isEmpty()) {
            return 0;
        } else {
            return polinom.keySet().stream().max(Integer::compareTo).get();
        }
    }

    public double coefficient(int power) {
        return polinom.getOrDefault(power, 0.0);
    }


    @Override
//    public String toString() {
//        String m = new String();
//        for(Map.Entry<Integer, Double> entry: this.getPolinom().entrySet()) {
//            if (entry.getValue() != 0) {
//                if (entry.getKey() == 0) {
//                    if (entry.getValue() < 0)
//                        m += entry.getValue();
//                    else
//                        m += "+" + entry.getValue();
//                } else {
//                    if (entry.getKey() == 1) {
//                        if (entry.getValue() == 1) {
//                            m += "+x";
//                        } else {
//                            if (entry.getValue() == -1)
//                                m += "-x";
//                            else {
//                                if (entry.getValue() < 0)
//                                    m += entry.getValue() + "x";
//                                else
//                                    m += "+" + entry.getValue() + "x";
//                            }
//                        }
//                    } else {
//                        if (entry.getValue() == 1) {
//                            m += "+x^" + entry.getKey();
//                        } else {
//                            if (entry.getValue() == -1) {
//                                m += "-x^" + entry.getKey();
//                            } else {
//                                if (entry.getValue() < 0)
//                                    m += entry.getValue() + "x^" + entry.getKey();
//                                else
//                                    m += "+" + entry.getValue() + "x^" + entry.getKey();
//                            }
//                        }
//                    }
//                }
//            }
//        }
//            return m;
//        }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = degree(); i >= 0; i--) {
            double coeff = coefficient(i);
            if (coeff != 0.0) {
                builder.append((coeff > 0.0 && builder.length() > 0) ? "+" : "");
                if (coeff != 1.0 || i == 0) {
                    builder.append(coeff);
                }
                if (i > 0) {
                    builder.append("x");
                }
                if (i > 1) {
                    builder.append("^").append(i);
                }
            }
        }
        return builder.toString();
    }
    
    
    
}
