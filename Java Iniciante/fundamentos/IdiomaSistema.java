package fundamentos;

import java.util.Locale;
public class IdiomaSistema {
    public static void main(String[] args) {
        Locale Idioma = Locale.getDefault();
        System.out.print("o idioma do sistema é:");
        System.out.print(Idioma.getDisplayLanguage());

    }
}
