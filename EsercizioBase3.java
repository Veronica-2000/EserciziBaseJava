package org.elis.esercizibase;

import java.util.Scanner;

public class EsercizioBase3 {

	public static void main(String[] args) {
		
		//input
		// recupero dei dati 
	    // numero dei chilometri in double
		// età del passeggero int 
		
		//creazione scanner recupero dati input
		Scanner sc=new Scanner(System.in);
		System.out.println("quanti chilometri devi fare");
		double d=sc.nextDouble();
		System.out.println("quanti anni hai");
		int etaPassegero=sc.nextInt();
		// chiusura scanner 
		sc.close();
		
		//double d=10.00;
		//int etaPassegero=68;
		
		
		//inizzializzazione variabili 
		double costoChilometro=0.21;
		double prezzoFinale=0;
		
		//applicato lo sconto del 20% con il ( se )
		if(etaPassegero<=18) {
			double prezzoBase=d*costoChilometro;
			double sconto=(prezzoBase/100)*20;
			prezzoFinale=prezzoBase-sconto;
			
		//applicato lo sconto del 40% (altrimenti se)
		}else if(etaPassegero>=65) {
			double prezzoBase=d*costoChilometro;
			double sconto=(prezzoBase/100)*40;
			prezzoFinale=prezzoBase-sconto;
		
			//prezzo finale senza sconto 	
		}else {
			prezzoFinale=d*costoChilometro;
			
			
		}
		
		
		
		
		
		
		
		// costo del chilometro 0.21£ double
		//applicare lo sconto minorenni per 20 int
		//applicare lo sconto per over 65 del 40 int 
		// caso1:10 km ( 10*0.21 ) 
		// caso 2:10 km 16 anni (10*0.21) prezzo tot =2.10
		// sconto =0,42 
		// prezzo tot finale biglietto =2.10-0.42 
		
		
		
		 //output
		 //restituire il prezzo totale  del vaiggio 
         //prezzo totale int 
		
		// creazione del prezzo finale arrotondato con un metodo il specifico 
		double prezzoFinaleArrotondato=Math.round(prezzoFinale*100.0)/100.0;
		
		//output mostra al programma il prezzo finale 
		System.out.println("questo il prezzo finale:" + prezzoFinaleArrotondato);
		
		
		
	}

}


/*
Calcolo del biglietto del treno versione form
Il programma dovrà stampare a schermo il costo del biglietto chiedendo in input 
all'utente il numero di chilometri che vuole percorrere e l'età del passeggero. 
Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole: 
il prezzo del biglietto è definito in base ai km (0.21 € al km) 
va applicato uno sconto del 20% per i minorenni va applicato uno sconto del 40% per gli over 65
*/