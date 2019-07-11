package ejerciciosFiboPrimosDni;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		
		int menu=0;
		
		Scanner leer=new Scanner(System.in);
		
		do {
			System.out.println("1. Fibonacci");
			System.out.println("2. Numeros primos");
			System.out.println("3. Letra DNI");
			System.out.println("4. Salir");
			menu=leer.nextInt();
			
			switch (menu) {
				case 1:
					
					//Numeros de la serie de Fibonacci
					
					int n1=1;
					int n2=0;
					int fibo=0;
					int cuantosn=0;
					
					System.out.println("¿Cuantos numeros de la serie de Fibonacci quieres?");
					cuantosn=leer.nextInt();
					
					for (int conta=0; conta < cuantosn; conta++) {
						
						fibo=n1+n2;
						System.out.println(fibo);
						n1=n2;
						n2=fibo;
						
						
					}
					
					break;
				
				case 2:
					
					//Numeros primos
					int inter1=0;
					int inter2=0;
					int resto=0;
					int acu=0;
					
					System.out.println("Inicio del intervalo");
					inter1=leer.nextInt();
					System.out.println("Fin del intervalo");
					inter2=leer.nextInt();
					
					for (int i = inter1; i <= inter2; i++) {
						resto=0;
						acu=0;
						for (int j = 2; j <= i; j++) {
							resto=i%j;
							if (resto==0) {
								acu++;
							}
						}
						if (acu==1) {
							System.out.println(i);
						}	
					}
					
					
					break;
					
				case 3:
					
					//Letra DNI
					int dni=0;
					int numletra=0;
					
					System.out.println("Escribe el DNI para saber la letra que le corresponde");
					dni=leer.nextInt();
					
					numletra=dni%23;
					switch (numletra) {
						case 0:
							System.out.println("Le corresponde la letra T = "+dni+"T");
							break;
						case 1:
							System.out.println("Le corresponde la letra R = "+dni+"R");
							break;
						case 2:
							System.out.println("Le corresponde la letra W = "+dni+"W");
							break;
						case 3:
							System.out.println("Le corresponde la letra A = "+dni+"A");
							break;
						case 4:
							System.out.println("Le corresponde la letra G = "+dni+"G");
							break;
						case 5:
							System.out.println("Le corresponde la letra M = "+dni+"M");
							break;
						case 6:
							System.out.println("Le corresponde la letra Y = "+dni+"Y");
							break;
						case 7:
							System.out.println("Le corresponde la letra F = "+dni+"F");
							break;
						case 8:
							System.out.println("Le corresponde la letra P = "+dni+"P");
							break;
						case 9:
							System.out.println("Le corresponde la letra D = "+dni+"D");
							break;
						case 10:
							System.out.println("Le corresponde la letra X = "+dni+"X");
							break;
						case 11:
							System.out.println("Le corresponde la letra B = "+dni+"B");
							break;
						case 12:
							System.out.println("Le corresponde la letra N = "+dni+"N");
							break;
						case 13:
							System.out.println("Le corresponde la letra J = "+dni+"J");
							break;
						case 14:
							System.out.println("Le corresponde la letra Z = "+dni+"Z");
							break;
						case 15:
							System.out.println("Le corresponde la letra S = "+dni+"S");
							break;
						case 16:
							System.out.println("Le corresponde la letra Q = "+dni+"Q");
							break;
						case 17:
							System.out.println("Le corresponde la letra V = "+dni+"V");
							break;
						case 18:
							System.out.println("Le corresponde la letra H = "+dni+"H");
							break;
						case 19:
							System.out.println("Le corresponde la letra L = "+dni+"L");
							break;
						case 20:
							System.out.println("Le corresponde la letra C = "+dni+"C");
							break;
						case 21:
							System.out.println("Le corresponde la letra K = "+dni+"K");
							break;
						case 22:
							System.out.println("Le corresponde la letra E = "+dni+"E");
							break;
						default:
							break;
					}
	
					
				break;
					
	
				default:
					System.out.println("La opcion seleccionada no existe");
					
					break;
			}
			
			
		} while (menu!=4);
		
		System.out.println("Fin del programa");
		
		
		
		
		
		
		
	}

}
