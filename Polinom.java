import java.util.TreeMap;
import java.util.*;

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

    @Override
    public String toString() {
        String m = new String();
        for(Map.Entry<Integer, Double> entry: this.getPolinom().entrySet()) {
            if (entry.getValue() != 0) {
                if (entry.getKey() == 0) {
                    if (entry.getValue() < 0)
                        m += entry.getValue();
                    else
                        m += "+" + entry.getValue();
                } else {
                    if (entry.getKey() == 1) {
                        if (entry.getValue() == 1) {
                            m += "+x";
                        } else {
                            if (entry.getValue() == -1)
                                m += "-x";
                            else {
                                if (entry.getValue() < 0)
                                    m += entry.getValue() + "x";
                                else
                                    m += "+" + entry.getValue() + "x";
                            }
                        }
                    } else {
                        if (entry.getValue() == 1) {
                            m += "+x^" + entry.getKey();
                        } else {
                            if (entry.getValue() == -1) {
                                m += "-x^" + entry.getKey();
                            } else {
                                if (entry.getValue() < 0)
                                    m += entry.getValue() + "x^" + entry.getKey();
                                else
                                    m += "+" + entry.getValue() + "x^" + entry.getKey();
                            }
                        }
                    }
                }
            }
        }
            return m;
        }
    
    
    
}
