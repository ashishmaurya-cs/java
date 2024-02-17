import java.util.Scanner;


public class TwoArray {
	static void show(int matrix[][]){
for(int row=0;row<matrix.length;row++){
			
			for(int col=0;col<matrix[row].length;col++){
				System.out.print(matrix[row][col]+" ");
			}	
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter rows");
		int rows=s.nextInt();
		System.out.println("enter cols");
		int cols=s.nextInt();
		int matrix[][]=new int[rows][cols];
		
		for(int row=0;row<matrix.length;row++){
			System.out.println("" + (row+1) + "data");
			for(int col=0;col<matrix[row].length;col++){
			System.out.println("enter "+ (col+1) + "data");
			matrix[row][col]=s.nextInt();
			}	
		}
		show(matrix);
	}

}
