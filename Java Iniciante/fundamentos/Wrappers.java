package fundamentos;

public class Wrappers {

    public static void main(String[] args) {
        Byte b = 100;
        Short s = 1000;
        Integer i = 1000; //int
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l/3);

        Float f = 123f;
        Double d= 12345.3912;
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toLowerCase());

        Character c = '#';
        System.out.println(c + "...");
    }
}
