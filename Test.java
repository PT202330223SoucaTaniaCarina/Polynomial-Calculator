public class Test {
    public static void main(String[] args){
        Polinom p = new Polinom();
        Polinom q = new Polinom();
        p.getPolinom().put(3, 6.0);
        p.getPolinom().put(2, 3.0);
        q.getPolinom().put(1, 3.0);
        q.getPolinom().put(3, 6.0);

        System.out.println(Operatii.adunare(p, q));
    }
}
