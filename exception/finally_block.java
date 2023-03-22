package exception;

public class finally_block {
	public static void main(String[] args) {
		try { // ist inner try 
			int num=10/2;    // aritmetic exception
			System.out.println(num); //no exception occur  
		}
		catch(Exception e) { // ist catCH block 
			System.out.println(e);
		}
		try { //  inner try 
			int num=10/0;    // aritmetic exception
			System.out.println(num);
		}
		catch(Exception e) { //  catCH block 
			System.out.println(e);
				}
		
		try { // ist inner try 
			int num=10/0;    // aritmetic exception
			System.out.println(num);
		}
		catch(NullPointerException e) { //  catCH block 
			System.out.println(e);
	}
		finally {
			System.out.println("always finally block is run ");
		}
	}
		
	}


