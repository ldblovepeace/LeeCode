package Questions;

import java.util.List;

public class Q1301 {
	char stock = 'X';
	public int[] pathsWithMaxScore(List<String> board) {
		int length = board.size();
		int[][] score = new int[length][length];
		int[][] path = new int[length][length];
		if(length == 1) {
			return new int[] {0,0};
		}
		score[length-1][length-1] = 0;
		path[length-1][length-1] = 1;
		int modNum = 1000000007;
		for(int i = length-1; i >= 0; i--) {
			for (int j = length -1; j >= 0; j--) {				
				if(board.get(i).charAt(j) != 'X' && (path[i][j-1]!=0 || path[i-1][j]!=0 || path[i-1][j-1]!=0)) {
					int maxValue = Math.max(Math.max(score[i][j-1], score[i-1][j]),score[i-1][j-1]);
					score[i][j] = maxValue + board.get(i).charAt(j) - '0';
					if(maxValue == board.get(i-1).charAt(j)) {
						path[i][j] = path[i-1][j] +path[i][j];
					}
					if(maxValue == board.get(i).charAt(j-1)) {
						path[i][j] = path[i][j-1] +path[i][j];
					}
					if(maxValue == board.get(i-1).charAt(j-1)) {
						path[i][j] = path[i-1][j-1] +path[i][j];
					}
				}else {
					score[i][j] = 0;
					path[i][j] = 0;
				}
			}
		}
		return new int[] {score[0][0] -('E' - '0'),path[0][0]};
    }
	
	
	public static int[] pathsWithMaxScore1(List<String> board) {
        int row = board.size();
        if (row == 0) return new int[]{0, 0};
        int modNum = 1000000007;
        int col = board.get(0).length();
        int[][] dpScore = new int[row+1][col+1];
        int[][] dpPath = new int[row+1][col+1];
        //从右下角开始走，初始路径为1条
        dpPath[row-1][col-1] = 1;
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {
                //如果board[i][j] == 'X', 即为障碍
                //如果dpPath[i+1][j],dpPath[i][j+1]和dpPath[i+1][j+1]都等于0，就是路径被障碍'X'封死了
                if (board.get(i).charAt(j) != 'X' &&
                        (dpPath[i + 1][j] != 0 || dpPath[i][j + 1] != 0 || dpPath[i + 1][j + 1] != 0)) {
                    int maxScore = Math.max(Math.max(dpScore[i + 1][j], dpScore[i][j + 1]), dpScore[i + 1][j + 1]);
                    dpScore[i][j] = maxScore + board.get(i).charAt(j) - '0';
                    if (dpScore[i + 1][j] == maxScore) {
                        dpPath[i][j] = (dpPath[i][j] + dpPath[i + 1][j]) % modNum;
                    }
                    if (dpScore[i][j + 1] == maxScore) {
                        dpPath[i][j] = (dpPath[i][j] + dpPath[i][j + 1]) % modNum;
                    }
                    if (dpScore[i + 1][j + 1] == maxScore) {
                        dpPath[i][j] = (dpPath[i][j] + dpPath[i + 1][j + 1]) % modNum;
                    }
                }
            }
        }
        //dpScore[0][0] - ('E' - '0'),是因为结束时候为'E'，上面加了，所以要减去
        int maxScore = dpScore[0][0] == 0 ? 0 : dpScore[0][0] - ('E' - '0');
        return new int[]{maxScore, dpPath[0][0]};
    }
}
