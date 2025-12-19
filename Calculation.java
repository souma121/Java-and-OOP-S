import mypack.Shape;
import mypack.mathcheck.Prime;

public class Calculation {
    public static void main(String[] args) {
        Shape sh=new Shape();
        Prime p=new Prime();

        sh.getArea(2);
        sh.getArea(2,3);
        p.isprime(4);
    }
}