import java.util.Scanner;

public class Utente {

    Scanner input=new Scanner(System.in);

    int IDUtente;
    String nome;
    String cognome;
    String codFiscale;
    String dataDiNascita;
    Patente patente;
    double credito;
    boolean casco;

    public Utente(int IDUtente, String nome, String cognome, String codFiscale, String dataDiNascita, Patente patente, boolean casco) {
        this.IDUtente = IDUtente;
        this.nome = nome;
        this.cognome = cognome;
        this.codFiscale = setCodFiscale(codFiscale);
        this.dataDiNascita = dataDiNascita;
        this.patente = patente;
        this.credito = 0.0;
        this.casco = casco;
    }

    public int getIDUtente() {
        return IDUtente;
    }

    public void setIDUtente(int IDUtente) {
        this.IDUtente = IDUtente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodFiscale() {
        return codFiscale;
    }

    public String setCodFiscale(String codFiscale) {
        if (codFiscale.length()==16) {
            this.codFiscale = codFiscale;
        } else {
            System.out.println("Codice fiscale inserito non corretto.");
        }
        return this.codFiscale;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public Patente getPatente() {
        return patente;
    }

    public void setPatente(Patente patente) {
        this.patente = patente;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito (double credito) {
        this.credito = credito;
    }

    public void ricaricaCredito() {
        System.out.println("Quanto credito vuoi aggiungere? ");
        double credito=input.nextDouble();

        if (credito>0) {
            this.credito = this.credito+credito;
        }
    }

    public void pagamento (double pagamento) {

        if ( pagamento>0 ) {
            if (this.credito-pagamento<0) {
                System.out.println("Credito insufficiente, ricaricare prima del pagamento.");
                ricaricaCredito();
                pagamento(pagamento);
            } else {
                this.credito=this.credito-pagamento;
            }
        } else {
            System.out.println("Il pagamento deve avere un valore positivo!");
        }
    }

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }

}

enum Patente {
 A, B, C, D
}
