import java.util.TreeMap;

public class Polinom {
    private Float putere;
    private Float coeficient;

    //TreeMap<Float, Float> polinom = new TreeMap<putere, coeficient>();

    private Polinom(Float putere, Float coeficient){
        this.putere = putere;
        this.coeficient = coeficient;
    }


    public Float getPutere() {
        return putere;
    }

    public void setPutere(Float putere) {
        this.putere = putere;
    }

    public Float getCoeficient() {
        return coeficient;
    }

    public void setCoeficient(Float coeficient) {
        this.coeficient = coeficient;
    }

}
