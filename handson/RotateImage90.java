package com.handson;

public class RotateImage90 {
	public static void trans(int[][] mat, int i, int j) {
		int temp = mat[i][j];
		mat[i][j] = mat[j][i];
		mat[j][i] = temp;

	}

	public static void swap(int[][] mat, int i, int s, int e) {
		int temp = mat[i][s];
		mat[i][s] = mat[i][e];
		mat[i][e] = temp;
	}

	public static void rotate(int[][] mat) {
		// transpose
		int n = mat.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				trans(mat, i, j);
			}
		}
		for (int i = 0; i < n; i++) {
			int s = 0;
			int e = n - 1;
			while (s < e) {
				swap(mat, i, s, e);
				s++;
				e--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
		rotate(mat);
		int n = mat.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}

}
