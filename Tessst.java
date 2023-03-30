public class Tessst {
    public static void main(String[] args){

        Polinom p = new Polinom();
        Polinom q = new Polinom();
        p.getPolinom().put(3, 6.0);
        p.getPolinom().put(2, 3.0);
        q.getPolinom().put(1, 3.0);
        q.getPolinom().put(3, 6.0);

        System.out.println("Polinom 1: " + p);
        System.out.println("Polinom 2: " + q);

        System.out.println("Adunare: " + Operatii.adunare(p, q));
        System.out.println("Scadere: " + Operatii.scadere(p, q));
        System.out.println("Inmultire: " + Operatii.inmultire(p, q));
        System.out.println("Derivare: " + Operatii.dervivare(p));
        System.out.println("Integrare: " + Operatii.integrare(p));
    }
}
