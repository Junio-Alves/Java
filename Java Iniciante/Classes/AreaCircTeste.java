package Classes;

public class AreaCircTeste {
    public static void main(String[] args) {
        areaCirc a1 = new areaCirc(10);
        a1.raio = 10;

        System.out.println(a1.area());
        System.out.println(areaCirc.area(100));
        System.out.println(areaCirc.PI);
        System.out.println(Math.PI);

    }
}
