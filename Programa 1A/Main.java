package progama1a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] points = new int [n];
		for(int i=0;i<n;i++)
			points[i] = in.nextInt();
		
		Competition C = new Competition();
		C.competition(n, k, points);
		System.out.println(C.getClassified());
		for(int i=0;i<4;i++)
			System.out.format("%.2f%n", C.getStats()[i]);
		
		in.close();
	}
}
