import br.com.jorge.conversorMoedas.principal.Menu;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("****** Conversor de Moedas ******");

        Menu menu = new Menu();
        menu.menu();
    }
}