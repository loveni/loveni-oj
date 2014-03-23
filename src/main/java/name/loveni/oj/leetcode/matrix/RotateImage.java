package name.loveni.oj.leetcode.matrix;

public class RotateImage {
	
	
	public static void main(String [] args) {
		RotateImage ri=new RotateImage();
		int [][] matrix={{1,2},{3,4}};
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				System.out.print(matrix[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		ri.rotate(matrix);
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				System.out.print(matrix[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
			
		
	}
	
	
	public void rotate(int[][] matrix) {
        
		if(matrix==null||matrix.length==0) {
			return;
		}
		if(matrix.length!=matrix[0].length) {
			return;
		}
		
		int dim=matrix.length-1;
		
		for(int i=0;i<(dim+1)/2;i++) {
			
			for(int j=i;j<dim-i;j++) {
				
				int tmp=matrix[i][j];
				matrix[i][j]=matrix[dim-j][i];
				matrix[dim-j][i]=matrix[dim-i][dim-j];
				matrix[dim-i][dim-j]=matrix[j][dim-i];
				matrix[j][dim-i]=tmp;
				
			}
			
		}
		
    }
}
