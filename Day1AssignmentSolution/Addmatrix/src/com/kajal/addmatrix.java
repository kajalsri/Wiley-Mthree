package com.kajal;

public class addmatrix {
	private int[][] arr;
	
	private int rows,cols;
	addmatrix (int rows,int cols) {
		arr=new int[rows][cols];
	}
	addmatrix() {}
	public void display() {
		System.out.println("_____________");
		for(int i=0; i<this.arr.length;i++) {
			for(int j=0; j<this.arr[0].length;j++) {
				System.out.println(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("______________");
			
		}
	
	public addmatrix add(addmatrix m) {
		addmatrix mfun=new addmatrix();
		int[][] answer=new int[m.arr.length][m.arr[0].length];
		for(int i=0; i<this.arr.length;i++) {
			for(int j=0; j<this.arr[0].length;j++) {
				answer[i][j]=this.arr[i][j]+m.arr[i][j];
				
			}
		}
		mfun.setArr(answer);
		mfun.setRows(answer.length);
		mfun.setCols(answer[0].length);
		return mfun;
		
	}
	public void setArr(int[][] arr) {
		this.arr = arr;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}
	
}
