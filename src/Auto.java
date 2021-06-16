public class Auto extends Veicolo{

    String targa;
    int carburante;

    public Auto(int IDVeicolo, boolean disponibile, String posizione, double tariffa, String targa, int carburante) {
        super(IDVeicolo, disponibile, posizione, tariffa);
        this.targa=targa;
        this.carburante=carburante;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getCarburante() {
        return carburante;
    }

    public int controllaCarburante () {
        if (this.carburante<=20) {
            System.out.println("Carburante sotto 20%");
        }
        return carburante;
    }

    public int aggiungereCarburante (int aggiunta) {
        if ( (aggiunta>0) && (getCarburante()+aggiunta) <= 100) {
            this.carburante=getCarburante()+aggiunta;
        } else {
            System.out.println("Puoi aggiungere al massimo " + (100-getCarburante()) + "% di carburante");
        }
        return carburante;
    }
    public void setCarburante(int carburante) {
        if (carburante>0 && carburante<=100) {
            this.carburante = carburante;
        } else {
            System.out.println("Settare numeri tra 1 e 100 per il carburante.");
        }

    }

}
