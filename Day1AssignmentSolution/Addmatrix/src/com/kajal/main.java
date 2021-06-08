package com.kajal;
import com.kajal.addmatrix;
public class main {
	public static void main(String args[]) {
		int[][] arr= {{0,1,2},{3,4,5},{5,6,8}};
		addmatrix mat=new addmatrix();
		mat.setArr(arr);
		mat.setRows(arr.length);
		mat.setCols(arr[0].length);
		mat.display();
		int [][] arr1={{1,2,3},{0,4,3},{7,9,8}};
		addmatrix mat1=new addmatrix();
		mat1.setArr(arr1);
		mat1.setRows(arr1.length);
		mat1.setCols(arr1[0].length);
		mat1.display();
		addmatrix mm=mat.add(mat1);
		mm.display();
		
	}
}
