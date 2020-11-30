package progama1a;

import java.util.Arrays;

public class Competition {
	
	private int classified;
	private double[] stats = new double [4];
	
	public Competition() {
		this.classified = 0;
	}
	
	public int getClassified() {
		return classified;
	}
	
	public double [] getStats() {
		return stats;
	}
	
	private static double getAverage(int[] v) {
		double ans = 0.0;
		for(int i=0;i<v.length;i++)
			ans += v[i];
		ans /= v.length;
		return ans;
	}
	
	private static double getStandardDeviation(int[] v, double avg) {
		double sum = 0.0;
		for(int i=0;i<v.length;i++)
			sum += Math.pow(v[i] - avg, 2);
		sum /= v.length;
		double ans = Math.sqrt(sum);
		return ans;
	}
	
	public void competition(int n, int m, int[] v) {
		Arrays.sort(v);
		int last = 0, cont = 0;
		for(int i=v.length-1;i>=0;i--) {
			cont++;
			if (cont==m)  // quando alcancar o numero de classificados salva a ultima pontuacao
				last = v[i];
			if (cont>m && v[i]<last)   // se ja passou no numero de classificados e a pontuacao eh menor que a do ultimo classificado
				break;
			this.classified++;
		}
		
		int[] classifiedArray = Arrays.copyOfRange(v, v.length-this.classified, v.length);
	
		this.stats[1] = getAverage(classifiedArray);
		this.stats[0] = getStandardDeviation(classifiedArray, this.stats[1]);
		this.stats[3] = getAverage(v);
		this.stats[2] = getStandardDeviation(v, this.stats[3]);

		return;
	}
	
}


