public class Bill3 {
    public static void main(String[] args) {
    
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        int bill = Integer.parseInt(args[3]); 
        double personalBill = bill; 
        personalBill = Math.ceil(personalBill / 3); 
        System.out.println("Great! " + name1 + " , " + name2 + " and " + name3 + " pay " + personalBill + " each");
    }
}
