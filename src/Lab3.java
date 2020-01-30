public class Lab3 {
	
	static double calcCentigrade(double i) {
		return (i - 32) * 5.0 / 9.0;
	}
	
	public static void main(String[] args) {
		double[] fahrenheitArray = {0.0, 5.0, 10.0, 15.0, 20.0, 25.0, 30.0, 35.0, 40.0};
		double fahrenheit;
		double centigrade;
		
		//for loop for using fahrenheitArray
		for (int i = 0; i < fahrenheitArray.length; i++) {
			centigrade = calcCentigrade(fahrenheitArray[i]);
			System.out.println("F: " + fahrenheitArray[i]);
			System.out.println("C: " + centigrade);
			System.out.println();
		}
		
		//for loop for using a range of fahrenheit from 0.0 to 200.0
		for (fahrenheit = 0.0; fahrenheit <= 200.0; fahrenheit += 5) {
			centigrade = calcCentigrade(fahrenheit);
			System.out.println("F: " + fahrenheit);
			System.out.println("C: " + centigrade);
			System.out.println();
		}
	}
}
