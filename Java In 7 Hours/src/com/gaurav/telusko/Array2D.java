package com.gaurav.telusko;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4 };
		int b[] = { 5, 6, 7, 8 };
		int c[] = { 9, 1, 2, 3 };

		int d[][] = {

				// { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 1, 2, 3 },
				{ 1, 2, 3, 4 }, { 5, 6, 8 }, { 9, 1, 2, 3 },

		};

		// System.out.println(d[0][2]);

		// for(int i = 0;i<3; i++) {
		/*
		 * for (int i = 0; i < d.length; i++) { // for(int j = 0; j<4; j++) { for (int j
		 * = 0; j < d[i].length; j++) {
		 * 
		 * System.out.print(" " + d[i][j]); } System.out.println(); }
		 */

		for (int k[] : d) {

			for (int l : k) {

				System.out.print(" " + l);
			}

			System.out.println();
		}

	}

}
