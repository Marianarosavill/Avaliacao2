package ParteDos;

import java.util.Scanner;

public class Emoticons {

		static Scanner sc = new Scanner(System.in);
	    private static String letras;
	    private static String divertido = ":-)";
	    private static String chateado = ":-(";     
	    private static int feliz = 0;
	    private static int triste = 0;

		public static void main(String[] args) {		
			EscanearFrase();		
		}
		
		public static void EscanearFrase() {
			
			do {
	            System.out.println("Introduce texto o emoticon: ");
	           letras= sc.nextLine();
	        } while (letras.isEmpty());	
			
			triste =  contador(letras, chateado);
			feliz = contador(letras, divertido);
			
			if(triste>feliz) {
	        	System.out.println("CHATEADO");
	        }
			else if(feliz>triste){
	        	System.out.println("DIVERTIDO");
	        }
			else System.out.println("NEUTRO");	
			
		}
		
		public static int contador(String cadena, String secuencia) {	
	        int posiciones, cont = 0;
	    
	        posiciones = cadena.indexOf(secuencia);
	        while (posiciones != -1) { 
	            cont++;        
	            posiciones = cadena.indexOf(secuencia, posiciones + 1);
	        }
	        return cont;
	   }

	}


