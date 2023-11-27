package fundamentos;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    public static void main(String[] args) {
        resolucao();

    }
    static void resolucao(){
        Toolkit tk= Toolkit.getDefaultToolkit();
        Dimension R= tk.getScreenSize();
        System.out.println("A resolução da tela é:" +R.width+ "x" +R.height);

    }
}
