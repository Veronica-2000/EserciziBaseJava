package org.elis.esercizibase;

import java.util.Scanner;

public class EsercizioBase5 {

	public static void main(String[] args) {
		
		//inserisco un numero nella variabile int
       
		Scanner sc=new Scanner(System.in);
		System.out.println("inserisci un numero");
		int numero=sc.nextInt();
		sc.close();
		
		//int numero=5;
	
	   if(numero%2==0) {
	     System.out.println("il numero e pari");
	     
	    }else {
	    	System.out.println("in numero è dispari");
	    }
	   
	
	
	}

}


//Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.