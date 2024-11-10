public class Bill3 {
    public static void main(String[] args) {
    
        String c = args[0];
        String b = args[1];
        String a = args[2];
        int bill = Integer.parseInt(args[3]); 
        double personalBill = bill; 
        personalBill = Math.ceil(personalBill / 3); 
        System.out.println("Dear" + " " + a +  "," + " " + b + "," + " " + "and " + c + ":" + " " + "pay" + " " + personalBill + " " + "Shekels" + " " + "each");
    }
}
