package fundamentos;

public class ConversaoTiposPrimitivosEmNumericos {
    public static void main(String[] args) {
        double a = 1; //implicita
        System.out.println(a);

        float b = (float) 1.123123123123;//EXPLICITA (CAST)
        System.out.println(b);

        int c = 340;
        byte d = (byte) c;//explicita(cast)
        System.out.println(d);

        double e =  1.999999;
        int f = (int) e;//explicita (cast)
        System.out.println(e);

    }
}
