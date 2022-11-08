public class Main{
	public static void main(String[] args){
		double bmi = 47 / (1.6 * 1.6);
		double bmi2 = 52 / (1.7 * 1.7);
		System.out.println((double)Math.round(bmi*100)/100);
		System.out.println((double)Math.round(bmi2*100)/100);
	}
}
