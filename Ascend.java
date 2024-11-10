public class Ascend {
	public static void main(String[] args) {
	int numberandom = Integer.parseInt (args[0]);
	double a = Math.random()* numberandom; 
	double b = Math.random()* numberandom;  
	double c = Math.random()* numberandom; 

    double max1 = Math.max(a, b);
	double max2 = Math.max(max1, c);

	double min1 = Math.min(a, b);
	double min2 = Math.min(min1, c);
    
	double middle = ((a+b+c)-max2-min2);

	System.out.println ( (int)a + " " +  (int)b + " " +  (int)c);
    System.out.println ((int)min2 + " " + (int)middle + " " + (int)max2);

	}
}
