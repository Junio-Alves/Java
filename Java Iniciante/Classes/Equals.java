package Classes;

public class Equals {
    public static void main(String[] args) {
        usuario u1 = new usuario();
        u1.nome = "Pedro Silva";
        u1.email = "Pedro.silva@ezemail.com";

        usuario u2 = new usuario();
        u2.nome = "Pedro Silva";
        u2.email = "Pedro.silva@ezemail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));


    }
}
