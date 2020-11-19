package Questions.Q500;

public class Q463 {
	public int islandPerimeter(int[][] grid) {
		int result = 0;
		for(int i = 0; i< grid.length;i++) {
			for(int j=0; j< grid[i].length; j++) {
				if(grid[i][j] == 1) {
					result = result + 4 - neighbors(grid,i,j);
				}
			}
		}
		return result;
    }
	public int neighbors(int[][] grid, int i, int j) {
		int result = 0;
		if(i > 0) {
			result = result +  grid[i-1][j];
		}
		if(j < grid[i].length-1) {
			result = result +  grid[i][j+1];
		}
		if(j > 0){
			result = result + grid[i][j-1];
		}
		if(i < grid.length-1){
			result = result + grid[i+1][j];
		}
		return result;
	}
}
 