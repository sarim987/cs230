
public class Solver {
	public static void main (String[] args) {
		int[][] fill = {{1, 2, 3, 0},
				        {3, 4, 0, 0},
				        {2, 1, 0, 0},
				        {4, 3, 0, 1}};
		
		if(!isEmpty(fill)) System.out.println("Win!");
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				for(int val = 1; val < 5; val++) {
					if(safemove(fill, i, j, val)) {
						fill[i][j] = val;
						
					} printTable(fill);
				}
			}
			System.out.println("");
		}
		//solve(oned);
		
	}
	public static boolean checkRow(int arr[][], int x, int num)
	{
	    for (int j = 0; j < 4; j++) {
	        if (arr[x][j] == num) {
	            return true;
	        }
	    }
	    return false;
	}
	 

	public static boolean checkCol(int arr[][], int y, int num)
	{
	    for (int i = 0; i < 4; i++) {
	        if (arr[i][y] == num) {
	            return true;
		}
	}
	    return false;
	}

	public static boolean checkBox(int arr[][], int substart, int subend, int num)
	{
	    for (int i = 0; i < 4; i++) {
	        for (int j = 0; j < 3; j++) {
	        		if (arr[i+substart][j+subend] == num) {
	        			return true;
	        		}
	        }
	    }       
	    return false;
	}
	public static boolean safemove(int arr[][], int row, int col, int num) {
		if(!checkRow(arr, row, num) && !checkCol(arr, col, num) && !checkBox(arr, row - 1 , col - col -1, num)) {
			return true;
		}
		return false;
	}
	
	private static boolean isEmpty(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(arr[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}
	private static void printTable(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}
		System.out.println();
	}
	
}
