
public class Matrix {
    public static void main(String[] args) {
    	MatrixSolution s = new MatrixSolution();
        int[][] mat = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        s.rotate(mat);
    }
}

class MatrixSolution {
	public void rotate(int[][] matrix) {
	    int matrixLength = matrix.length;
	    
	    int[][] resultMatrix = new int[matrixLength][matrixLength];
	    int idx = 0;
	    
	    while(idx < matrixLength) {
	    	int colIdx = 0;	
	    	
	    	while (colIdx < matrixLength) {
	    		resultMatrix[idx][colIdx] = matrix[matrixLength - colIdx - 1][idx];
	    		colIdx++;
	    	}
	    	
	    	idx++;
	    }

	    matrix = resultMatrix;
    }
}

