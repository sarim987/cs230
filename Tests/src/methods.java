
public class methods {
	public static void main (String[] args) {
		String hey = "hey";
		counter();
		//for(int x = 0; x <= 12; x++) {
			//System.out.println(/*x + ": " +*/ foo(6));
			//System.out.println("count: " + count);
		//}
	}
	public static void counter () {
		int c = 0;
		for(int x = 1; x <= 3; x++) {
			for(int i = 3; i > 0; i--) {
				c = i + c + x;
			}
		}
		System.out.println("Count: " + c);
	}
	public static boolean isLessThan(int x, int y) {
	    if (y == 0) {
	        return false;
	    }
	    if (x == 0) {
	        return true;
	    }

	    return isLessThan(x - 1, y - 1);
	}static int count = 0;
	public static int foo(int n) {
		
		if(n <= 1) return n;
		count++;
		//System.out.print(n + " ");
		return foo(n) + foo(n-1);
	}
	
	private static boolean isPal(String string) {
		// TODO Auto-generated method stub
		for(int x = 0; x < string.length(); x++)
		{
			if(string.charAt(x) != string.charAt(string.length()-x-1)) {
				return false;
			}
		}
		return true;
	}
	
	
	static boolean sameParity(int x, int y) {
	    if ((x == 0) && (y == 0)) return true;
	    if (x == 0) return !sameParity(x, y-1);
	    if (y == 0) return !sameParity(x-1, y);
	    return sameParity(x-1, y-1);}
	
}
