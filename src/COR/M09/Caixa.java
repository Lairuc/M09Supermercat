package COR.M09;

import java.util.List;

public class Caixa implements Runnable {
    Client currentClient = null;

    public Caixa(Client currentClient) {
        this.currentClient = currentClient;
    }

    public void cobrar (Client client) {
        //this.cobrar( client.getLlistaPreus() );
        List<Float> llistaPreus = client.getLlistaPreus();
        float total = 0.0F;
        for (Float a:llistaPreus) {
            System.out.println("Preu: " + a + " €");
            total += a;
        }
        System.out.println("TOTAL COBRAT: " + total + " €");
    }

    public void cobrar() {
        this.cobrar(this.currentClient);
    }

    @Override
    public void run() {
        this.cobrar(this.currentClient);
    }
}
