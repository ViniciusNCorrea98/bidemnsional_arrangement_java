package program_package;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a ordem da minha matriz? ");
		int n = sc.nextInt();
		
		double [][] matrix = new double[n][n];
		
		for(int i =0; i < n; i++) {
			for(int j = 0; j<n; j++) {
					System.out.print("Digite o valor da posicao" + i+1+"x"+j+1);
				
					matrix[i][j] = sc.nextDouble();			
				}
		}
		
		double sum =1.0;
		for (int i =0; i<n; i++) {
			for ( int j =0; j<n; j++) {
				if (i==j) {
					sum *= matrix[i][j];
				}
			}
		}
		System.out.print("Main diagonal value is: "+sum);
		
		System.out.println("Typed matrix: ");
		for (int i =0; i<n; i++) {
			for (int j =0; j<n; j++) {
				System.out.print(" "+matrix[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}

}
