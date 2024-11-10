// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	int a = Integer.parseInt(args [0]);
    int hundreds = (a/100);
	int tens = (a -(hundreds*100))/10;
	int ones = a -(hundreds*100)-(tens*10) ;
	System.out.println(  hundreds  +  " hundreds "  +  tens  +  " tens "  +  ones  +  " ones " ) ;
	}
}
