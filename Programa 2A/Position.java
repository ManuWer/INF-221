package programa2a;

public class Position {

	int minutes;
	boolean[] floor = new boolean [5];

	public Position() {
		for(int i=0;i<5;i++)
			this.floor[i] = false;
	}
	
	public int getMinutes() {
		return this.minutes;
	}
	
	public boolean[] getFloor() {
		return this.floor;
	}
	
	public void calculatePosition(int n, int f[]) {
		int menor = 1000000;
		int[] min = new int[n];
		for(int i=0;i<n;i++) {
			min[i] = 0;
			for(int t=0;t<n;t++)
				min[i] += 2 * f[t] * Math.abs(t-i);
			if(min[i] < menor)
				menor = min[i];
		}
		
		for(int i=0;i<n;i++)
			if(min[i] == menor)
				this.floor[i] = true;
		
		this.minutes = menor;		
	}
}
