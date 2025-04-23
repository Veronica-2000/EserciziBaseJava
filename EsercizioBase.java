
public class EsercizioBase {

	public static void main(String[] args) {
	 
		//inizzializzare due variabili
		
		String s="buon pomeriggio sign.";
		String s1="rossi";
		
		char c=s1.charAt(0);
		String s2=Character.toString(c).toUpperCase();
		String s3=s1.substring(1,5);
		
		
		//stampare la frase 
		System.out.println(s+ s2 +s3 );
   
	}

}






/*
effettuare la concatenazione dei  valori buon pomeriggio sign. e Rossi associati a due variabili inizializzate in precedenza . 
stampa  la frase ottenuta  ponendo il valore della seconda variabile  con iniziale maiuscola tramite metodo 
*/