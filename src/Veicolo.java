public class Veicolo {

    int IDVeicolo;
    boolean disponibile;
    String posizione;
    double tariffa;

    public Veicolo(int IDVeicolo, boolean disponibile, String posizione, double tariffa) {
        this.IDVeicolo = IDVeicolo;
        this.disponibile = disponibile;
        this.posizione = posizione;
        this.tariffa = tariffa;
    }


    public int getIDVeicolo() {
        return IDVeicolo;
    }

    public void setIDVeicolo(int IDVeicolo) {
        this.IDVeicolo = IDVeicolo;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    public String getPosizione() {
        return posizione;
    }

    public void setPosizione(String posizione) {
        this.posizione = posizione;
    }

    public double getTariffa() {
        return tariffa;
    }

    public void setTariffa(double tariffa) {
        this.tariffa = tariffa;
    }
}
