public class FVCalc {
    public static void main(String[] args) {
        int money = Integer.parseInt(args [0]);
        double interest = Double.parseDouble(args[1]);
        int n =  Integer.parseInt(args[2]);
		interest = interest/100; 
        double futurevalue= money* (Math.pow(1+ interest, n)) ;
        System.out.println(" After " +(int) n + " years, " + "a" +  " " + "$" + money + " saved at " + interest*100 + "%" +"25"+ " will yield " + "$" +  (int)futurevalue ) ;
	
	
	}

}

