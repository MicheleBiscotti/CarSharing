import java.util.ArrayList;

public class Database {

    ArrayList<Utente> utenti = new ArrayList<>();
    ArrayList<Auto> automobili = new ArrayList<>();
    ArrayList<Moto> motocicli = new ArrayList<>();
    ArrayList<Furgoncino> furgoncini = new ArrayList<>();
    ArrayList<Bici> biciclette = new ArrayList<>();
    ArrayList<Monopattino> monopattini = new ArrayList<>();


    public void aggiungiUtente (Utente utente) {
        utenti.add(utente);
    }

    public void aggiungiAuto (Auto auto) {
        automobili.add(auto);
    }

    public void aggiungiMoto (Moto moto) {
        motocicli.add(moto);
    }

    public void aggiungiFurgoncini (Furgoncino furgoncino) {
        furgoncini.add(furgoncino);
    }

    public void aggiungiBici (Bici bicicletta) {
        biciclette.add(bicicletta);
    }

    public void aggiungiMonopattini (Monopattino monopattino) {
        monopattini.add(monopattino);
    }

}
