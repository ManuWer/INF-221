package programa2a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] f = new int [n];
		for(int i=0;i<n;i++)
			f[i] = in.nextInt();
		
		Position pos = new Position();
		pos.calculatePosition(n, f);
		System.out.println(pos.minutes);
		for(int i=0;i<5;i++)
			if(pos.floor[i])
				System.out.println(i+1);
		
		in.close();
	}
}
