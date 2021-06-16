public class Monopattino extends Veicolo{

    int energia;

    public Monopattino(int IDVeicolo, boolean disponibile, String posizione, double tariffa, int energia) {
        super(IDVeicolo, disponibile, posizione, tariffa);
        this.energia = energia;
    }

    public int getEnergia() {
        return energia;
    }

    public int controllaEnergia () {
        if (this.energia <=20) {
            System.out.println("Energia sotto il 20%");
        }
        return energia;
    }

    public int ricaricaEnergia (int aggiunta) {
        if ( (aggiunta>0) && (getEnergia()+aggiunta) <= 100) {
            this.energia = getEnergia()+aggiunta;
        } else if ( (aggiunta>0) && (getEnergia()+aggiunta) > 100){
            this.energia = 100;
        }
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia >0 && energia <=100) {
            this.energia = energia;
        } else {
            System.out.println("Settare numeri tra 1 e 100 per il carburante.");
        }
    }
}
