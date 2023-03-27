import java.util.HashMap;
import java.util.Map;

public class Operatii {

    public static Polinom adunare(Polinom p, Polinom q){
        Polinom rez = new Polinom();
        rez.setPolinom((HashMap<Integer, Double>) p.getPolinom().clone());
        for(Map.Entry<Integer, Double> entry: q.getPolinom().entrySet()){
            if(rez.getPolinom().containsKey(entry.getKey())){
                rez.getPolinom().put(entry.getKey(), entry.getValue() + rez.getPolinom().get(entry.getKey()));
            }
            else{
                rez.getPolinom().put(entry.getKey(), entry.getValue());
            }
        }
        return rez;
    }

    public static Polinom scadere(Polinom p, Polinom q){
        Polinom rez = new Polinom();
        rez.setPolinom((HashMap<Integer, Double>) p.getPolinom().clone());
        for(Map.Entry<Integer, Double> entry: q.getPolinom().entrySet()){
            if(rez.getPolinom().containsKey(entry.getKey())){
                if(Math.abs(rez.getPolinom().get(entry.getKey())- entry.getValue())<0.0001)
                    rez.getPolinom().remove(entry.getKey());
                else
                    rez.getPolinom().put(entry.getKey(),rez.getPolinom().get(entry.getKey())- entry.getValue());
            }
            else{
                rez.getPolinom().put(entry.getKey(), entry.getValue());
            }
        }
        return rez;
    }

    public static Polinom inmultire(Polinom p, Polinom q){
        Polinom rez = new Polinom();
        for(Map.Entry<Integer, Double> entry1: p.getPolinom().entrySet()) {
            for (Map.Entry<Integer, Double> entry2 : q.getPolinom().entrySet()) {
                if (rez.getPolinom().containsKey(entry1.getKey() + entry2.getKey())) {
                    rez.getPolinom().put((entry1.getKey() + entry2.getKey()), (entry1.getValue() * entry2.getValue()) +
                            rez.getPolinom().get(entry2.getKey() + entry1.getKey()));
                } else {
                    rez.getPolinom().put((entry1.getKey() + entry2.getKey()), (entry1.getValue() * entry2.getValue()));
                }
            }
        }
        return rez;
    }

    public static Polinom integrare(Polinom p){
        Polinom rez = new Polinom();
        for(Map.Entry<Integer, Double> entry: p.getPolinom().entrySet()){
            rez.getPolinom().put(entry.getKey()+1, entry.getValue()/(entry.getKey() + 1));
        }
        return rez;
    }

    public static Polinom dervivare(Polinom p){
        Polinom rez = new Polinom();
        for(Map.Entry<Integer, Double> entry: p.getPolinom().entrySet()){
            if(entry.getKey() > 0)
                rez.getPolinom().put(entry.getKey() - 1, entry.getValue() * (entry.getKey()));
        }
        return rez;
    }

}
