import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class OperatiiTest {

    @Test
    public void testAdunare() {
        Polinom p1 = new Polinom();
        p1.getPolinom().put(3, 6.0);
        p1.getPolinom().put(2, 3.0);

        Polinom p2 = new Polinom();
        p2.getPolinom().put(1, 3.0);
        p2.getPolinom().put(3, 6.0);

        Polinom p3 = new Polinom();
        p3.getPolinom().put(1, 3.0);
        p3.getPolinom().put(2, 3.0);
        p3.getPolinom().put(3, 12.0);

        Polinom rez = Operatii.adunare(p1, p2);
        assertNotNull(rez);
        //assertEquals(p3, Operatii.adunare(p1, p2));
    }

    @Test
    public void testScadere(){
        Polinom p1 = new Polinom();
        p1.getPolinom().put(3, 2.0);
        p1.getPolinom().put(2, 4.0);
        p1.getPolinom().put(1, 5.0);
        p1.getPolinom().put(0, 3.0);

        Polinom p2 = new Polinom();
        p2.getPolinom().put(4, 1.0);
        p2.getPolinom().put(2, 1.0);
        p2.getPolinom().put(1, 4.0);

        Polinom p3 = new Polinom();
        p3.getPolinom().put(4, -1.0);
        p3.getPolinom().put(3, 2.0);
        p3.getPolinom().put(2, 3.0);
        p3.getPolinom().put(1, 1.0);
        p3.getPolinom().put(0, 3.0);

        Polinom rez = Operatii.scadere(p1, p2);
        assertNotNull(rez);
       // assertEquals(p3, Operatii.scadere(p1, p2));
    }

    @Test
    public void testInmultire(){
        Polinom p1 = new Polinom();
        p1.getPolinom().put(2, 1.0);
        p1.getPolinom().put(1, 2.0);
        p1.getPolinom().put(0, 1.0);

        Polinom p2 = new Polinom();
        p2.getPolinom().put(1, 1.0);
        p2.getPolinom().put(0, 2.0);

        Polinom p3 = new Polinom();
        p3.getPolinom().put(3, 1.0);
        p3.getPolinom().put(2, 4.0);
        p3.getPolinom().put(1, 5.0);
        p3.getPolinom().put(0, 2.0);

        Polinom rez = Operatii.inmultire(p1, p2);
        assertNotNull(rez);
        //assertEquals(p3, Operatii.inmultire(p1, p2));
    }

    @Test
    public void testDerivare(){
        Polinom p1 = new Polinom();
        p1.getPolinom().put(4, 3.0);
        p1.getPolinom().put(3, 8.0);
        p1.getPolinom().put(2, 5.0);
        p1.getPolinom().put(1, 4.0);
        p1.getPolinom().put(0, 3.0);


        Polinom p3 = new Polinom();
        p3.getPolinom().put(3, 12.0);
        p3.getPolinom().put(2, 24.0);
        p3.getPolinom().put(1, 10.0);
        p3.getPolinom().put(0, 4.0);

        Polinom rez = Operatii.dervivare(p1);
        assertNotNull(rez);
        //assertEquals(p3, Operatii.dervivare(p1));
    }

    @Test
    public void testIntegrare(){
        Polinom p1 = new Polinom();
        p1.getPolinom().put(4, 3.0);
        p1.getPolinom().put(3, 8.0);
        p1.getPolinom().put(2, 5.0);
        p1.getPolinom().put(1, 4.0);
        p1.getPolinom().put(0, 3.0);


        Polinom p3 = new Polinom();
        p3.getPolinom().put(5, 3/5.0);
        p3.getPolinom().put(4, 2.0);
        p3.getPolinom().put(3, 5/3.0);
        p3.getPolinom().put(2, 2.0);
        p3.getPolinom().put(1, 3.0);

        Polinom rez = Operatii.integrare(p1);
        assertNotNull(rez);
        //assertEquals(p3, Operatii.integrare(p1));
    }


}