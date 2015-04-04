package com.dickloong.study.run;

import com.dickloong.study.quicksort.QuickSorter;

public class QuickSortLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr={34,34,3,53,2,23,7,14,10,100,100,34};
		QuickSorter qs=new QuickSorter(0,arr.length-1,arr);
		qs.quickSort();
		for(int print:arr){
			System.out.print(print+" ");
		}
		System.out.println();
		qs.quickSort(qs.getStartPoint(), qs.getNewPival()-1);
		for(int print:arr){
			System.out.print(print+" ");
		}
		
	}

}
