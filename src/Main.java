import javax.xml.crypto.Data;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        /* Utente user = new Utente(1234, "michele" , "biscotti" , "abcd1234",
                "17 Luglio 1997", Patente.A, true ); */


        /**
        System.out.println("Cod Fiscale: " + user.getCodFiscale());
        */

        /*
        user.ricaricaCredito();
        System.out.println("credito dispobibile: " + user.getCredito());

        System.out.println("Quanto c'è da pagare? ");
        double pagamento=input.nextDouble();
        user.pagamento(pagamento);
        System.out.println("credito dispobibile alla fine del pagamento: " + user.getCredito());
        */

        Azienda az = new Azienda();
        Utente user = new Utente(1234, "michele" , "biscotti" , "abcd1234",
                "17 Luglio 1997", Patente.A, true );
        az.db.aggiungiUtente(user);
        System.out.println(az.db.utenti.get(0).getNome() + az.db.utenti.get(0).getCognome());

        Auto veicolo=new Auto(456, true, "Via napoli 234", 25.0, "DFG456", 55);
        az.db.aggiungiAuto(veicolo);
        System.out.println(az.db.automobili.get(0).getIDVeicolo()+" "+az.db.automobili.get(0).getPosizione()+" "+ az.db.automobili.get(0).getCarburante());

    }
}
