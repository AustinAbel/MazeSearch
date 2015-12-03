package maze;

import java.util.ArrayList;
@SuppressWarnings("unused")
public class MazeSearch {
			public static int vert = 1;
			public static int hor = 0;
		public static int[][] lab = 
						{ {1,1,1,0,1,1,0,0,0,1,1,1,1},
						  {1,0,1,1,1,0,1,1,1,1,0,0,1},
						  {0,0,0,0,1,0,1,0,1,0,1,0,0},
						  {1,1,1,0,1,1,1,0,1,0,1,1,1},
						  {1,0,1,0,0,0,0,1,1,1,0,0,1},
						  {1,0,1,1,1,1,1,1,0,1,1,1,1},
						  {1,0,0,0,0,0,0,0,0,0,0,0,0},
						  {1,1,1,1,1,1,1,1,1,1,1,1,1} };
				
				final int tried = 3;
				final int path = 7;
								
				
				
				

				public static void main(String[] args) throws InterruptedException {
							
			traverse(vert, hor);
				
		
				
	}
    static boolean foundend = false;
	public static boolean traverse(int curIndex, int curIndex1) throws InterruptedException {
		
		
		
		Thread.sleep(500);
		
		for (int i = 0; i < 100; i++) {
			
			System.out.println("");
			
		}
		
		lab[curIndex][curIndex1] = 3;
				
		toString1(lab);		
		
		
		
		valid(curIndex, curIndex1);	
		
		if (curIndex == lab.length -1 && curIndex1 == lab[0].length - 1) {
			
			
			foundend = true;
			System.out.println(foundend + " " + curIndex + " " + curIndex1);
			return true;
						
		} else {
			System.out.println(foundend + " " + curIndex + " " + curIndex1);
			if (foundend == false) {
			
			if (valid(curIndex, curIndex1 - 1) == true) {
			foundend = traverse(curIndex, curIndex1 - 1);
			}
			
			if (valid(curIndex, curIndex1 + 1) == true) {
			foundend = traverse(curIndex, curIndex1 + 1);
			}
			
			if (valid(curIndex + 1, curIndex1) == true) {
			foundend = traverse(curIndex + 1, curIndex1);
			}
			
			if (valid(curIndex - 1, curIndex1) == true) {
			foundend = traverse(curIndex - 1, curIndex1);
			}
			
		}
			
	}
		return foundend;
		
		
			
		
}
	
		private static boolean valid(int cur, int cur1) {
		
			if ((cur < 8) && (cur1 < 13) && (cur >= 0) && (cur1 >= 0) && lab[cur][cur1] == 1) {
				
				return true;
				
			} else {
				
				return false;
				
			}
			
	
	}

		public static void toString1(int[][] lab) {
			
		 for (int i = 0; i < 8; i++) {
			
			for (int j = 0; j < 13; j++) {
				
				if (j == 13 - 1) {					
					System.out.println(lab[i][j]);					
				} else {
					System.out.print(lab[i][j] + " ");
				}
				
			}
			
		}		
			
		}
}