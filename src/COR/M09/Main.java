package COR.M09;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

    public static void main(String[] args) {
        Client c1 = new Client();
        Client c2 = new Client("Juan Palomo");
        Client c3 = new Client("Sra. Josefina");

        c1.ompleLlistaPreus();
        c2.ompleLlistaPreus();
        c3.ompleLlistaPreus();

        List<Client> clients = new ArrayList<Client>();
        clients.add(c1);
        clients.add(c2);
        clients.add(c3);

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

        //List<Caixa> perCobrar = new ArrayList<Caixa>();
        for (Client c: clients) {
            Caixa caixa = new Caixa(c);
            executor.execute(caixa);
        }
        executor.shutdown();
    }
}
