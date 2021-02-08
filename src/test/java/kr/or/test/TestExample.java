package kr.or.test;

public class TestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = new int[4][3]; 
		int num = 1; 
		for (int i= 0; i<array.length; i++) {
			if(i%2==0) {
				for (int j= 0; j<array[i].length; j++) {
					array[i][j] = num++;
				} 
			} else {
				for (int j=array[i].length-1; j>=0; j--) {
					array[i][j] = num++;
				} 
			}
		} 
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+"\t");
			} 
			System.out.print("\n"); 
		}
	}
}