/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package damenalexandroverificafilab;

/**
 *
 * @author damen.alexandro
 */
import java.util.Scanner;
public class DamenAlexandroVerificaFilaB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        
        Evento e1 = new Evento("Festival della salsiccia",5,2,80);
        Evento e2 = new Evento("Festival della salsiccia",5,5,50);
        int qntB = 0, scelta;
        boolean checkScelta = false, continua = true;
        
        while(continua){
            System.out.println("1-> Vendere biglietti | 2->Ristampare biglietti | 3-> Confrontare gli eventi | 4-> Mostra info evento |...-> Esci\nInserire azione da fare: ");
            scelta = input.nextInt();
            
            if(scelta == 1 || scelta == 2){
                System.out.println("Inserire quantita' biglietti: ");
                qntB = input.nextInt();
            }
            switch(scelta){
                case 1:
                    if (e1.vendiBiglietti(qntB)){
                        System.out.println("Vendita andata a buon fine.");
                    }else{
                        System.out.println("Biglietti non sufficenti!\nProva con un numero piu basso o aspetta la ristampa.");
                    }
                    break;
                case 2:
                    if(e1.ristampaBiglietti(qntB)) System.out.println("Ristampa di "+qntB+" biglietti andata a buon fine");
                    break;
                case 3:
                    if(e1.equals(e2)){
                        System.out.println("I due Eventi sono identici (stesso nome & prezzo).");
                    }else{
                        System.out.println("I due Eventi sono diversi (diverso nome o prezzo)i.");
                    }
                    break;
                case 4:
                    System.out.println(e1.toString());
                    break;
                default:
                    System.out.println("Uscita...");
                    continua = false;
            }
        }
    }
}
