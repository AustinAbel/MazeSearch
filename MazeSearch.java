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
							
			traverse(vert, hor, lab);
				
		
				
	}

	public static void traverse(int curIndex, int curIndex1, int[][] array) throws InterruptedException {
			
		Thread.sleep(500);
		
		lab[curIndex][curIndex1] = 3;
				
		toString1(lab);		
		
		for (int i = -1; i < 2; i++) {
			
			System.out.println(i + " " + curIndex + " " + curIndex1 + " " + lab[curIndex][curIndex1]);
			
			//System.out.println(curIndex + i);
			
			if(curIndex + i >= 0) {
			
				
				System.out.println("Check");
				
				if (lab[curIndex + i][curIndex1] == 1) {
				
				curIndex =  curIndex + i;
				traverse(curIndex, curIndex1, lab);
				
			}
				
		}
				if (curIndex1 + i > 0) {
				
				System.out.println("Check One");
					
			 if (lab[curIndex][curIndex1 + i] == 1) {
				
				curIndex1 = curIndex1 + i;
				traverse(curIndex, curIndex1, lab);
				
			}
		}
		
	}
		
		
		
//		should return a boolean value and throw an InterruptedException
//
//				the end of traverse should be false to start
//
//				takes parameters for row and column
//
//				should check for a valid() location
//
//				if location is valid, mark the number at that location  TRIED
//
//				traverse should end if  the last location in the two dimensional array is located
//
//				run traverse against all 4 adjacent indexes, if any returns true, end
//
//				if an end is found grid[row][col] should equal PATH
//
//				skip 100 lines
//
//				use toString() to print maze
//
//				Thread.sleep(500);
//
//				return when ended

				 
		
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
