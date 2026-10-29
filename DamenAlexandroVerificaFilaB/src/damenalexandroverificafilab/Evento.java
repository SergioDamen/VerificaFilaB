/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package damenalexandroverificafilab;

import java.util.Objects;

/**
 *
 * @author damen.alexandro
 */
public class Evento {
    private String nomeEvento;
    private float prezzo;
    private int numeroBigliettiVenduti;
    private int numeroBigliettiResidui;
    /**
     * Metodo costruttore
     * @param nome  Attributo dove si stanziera il nome dell'evento
     * @param prezzo    Attributo dove si stanziera il prezzo del singolo biglietto dell'evento
     * @param venduti   Attributo dove si stanziera la quantita' di biglietti venduti dell'evento
     * @param residui   Attributo dove si stanziera la quantita' di biglietti rimasti dell'evento
     */
    public Evento(String nome,float prezzo,int venduti,int residui){
        this.nomeEvento=nome;
        this.prezzo=prezzo;
        this.numeroBigliettiVenduti=venduti;
        this.numeroBigliettiResidui=residui;
    }
    /**
     * Metodo che controlla la possibilità di vendere un certo numero di biglietti
     * @param qntB  Numero di biglietti da controllare
     * @return  Valore booleano che mi dice se la vendita e' concessa
     */
    private boolean canVendiBiglietti(int qntB){
        return qntB<=this.numeroBigliettiResidui;
    }
    /**
     * Metodo che sottrae un cero numero di biglietti a quelli residui e aggiunge a quelli venduti
     * @param qntB  Numero di biglietti da controllare
     * @return  Valore booleano che mi notifica la riuscita della azione
     */
    public boolean vendiBiglietti(int qntB){
        if(canVendiBiglietti(qntB)){
            this.numeroBigliettiResidui -= qntB;
            this.numeroBigliettiVenduti+= qntB;
            return true;
        }
        return false;
    }
    /**
     * Metodo che aggiunge un cero numero di biglietti a quelli residui
     * @param qntB  Numero di biglietti da ristampare
     * @return  Valore booleano che mi notifica la riuscita della azione
     */
    public boolean ristampaBiglietti(int qntB){
        this.numeroBigliettiResidui +=qntB;
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nomeEvento);
        hash = 53 * hash + Float.floatToIntBits(this.prezzo);
        return hash;
    }
    /**
     * Metodo che confronta nomeEvento & prezzo di due oggetti Evento
     * @return Valore booleano che mi notifica la eguaglianza degli attiburi
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Evento other = (Evento) obj;
        if (Float.floatToIntBits(this.prezzo) != Float.floatToIntBits(other.prezzo)) {
            return false;
        }
        return Objects.equals(this.nomeEvento, other.nomeEvento);
    }
    /**
     * Metodo toString per stampare i valori del oggetto Evento
     * @return Stringa che contiene le informazioni
     */
    @Override
    public String toString() {
        return "Evento\n{" + "Nome:" + nomeEvento + ", Prezzo:" + prezzo + ", Biglietti venduti:" + numeroBigliettiVenduti + ", Biglietti residui:" + numeroBigliettiResidui + '}';
    }
}
