package lista5;

import java.util.Scanner;

public class exercicio2 {
		public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int x= 0 , y = 0;
		int [][] N1 = new int [4][6];
		int [][] N2 = new int [4][6];
		int [][] M1 = new int [4][6];
		int [][] M2 = new int [4][6];
		
				


				// N1
				for (x=0; x<4; x++){
					for (y=0; y<6; y++){
						
						System.out.println("Valor para Matriz N1 " );
						(N1[x][y])= ler.nextInt();
						
					}
				}
				
				// N2 
				for (x=0; x<4; x++){
					for (y=0; y<6;y++){
						
						System.out.println("Valor para Matriz N2 " );
						(N2[x][y])= ler.nextInt();
					}
				}
				
						System.out.println("\n A Soma das Matrizes N1 e N2 é: " );
				for (x=0; x<4; x++){
					 for (y=0; y<6;y++){
				              M1[x][y] = N1[x][y] + N2[x][y];
					 System.out.print(M1[x][y]);
					 
					 System.out.println(  );
						
					 }
				}

				System.out.println(" \n A diferença entre as matrizes N1 - N2 é ");
				for (x=0; x<4; x++){
					 for (y=0; y<6;y++){
				             M2[x][y] = N2 [x][y] - N1[x][y];
					 System.out.print("\n" + M2[x][y] );
					 
					 
						
					  }

		
				}
}
}