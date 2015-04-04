package com.dickloong.study.quicksort;

public class QuickSorter {

	private int[] targetArray;
	
	private int newPival;

	public int getNewPival() {
		return newPival;
	}

	public void setNewPival(int newPival) {
		this.newPival = newPival;
	}

	public int[] getTargetArray() {
		return targetArray;
	}

	public void setTargetArray(int[] targetArray) {
		this.targetArray = targetArray;
	}

	private int startPoint;
	private int endPoint;

	public int getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(int startPoint) {
		this.startPoint = startPoint;
	}

	public int getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(int endPoint) {
		this.endPoint = endPoint;
	}

	public QuickSorter(int startPoint, int endPoint, int[] targetArray) {
		this.setEndPoint(endPoint);
		this.setStartPoint(startPoint);
		this.setTargetArray(targetArray);
	}
	
	public void quickSort(int startPoint,int endPoint){
		this.setStartPoint(startPoint);
		this.setEndPoint(endPoint);
		this.quickSort();
	}

	public int quickSort() {
		int i = this.startPoint;
		int j = this.endPoint;
		int newPival = i;
		int temp = targetArray[newPival];
		while (i < j) {
			while (i < j && temp > targetArray[i])
				i++;
			if (i < j) {
				targetArray[newPival] = targetArray[i];
			}
			while (i < j && temp <= targetArray[j])
				j--;
			if (i < j) {
				targetArray[i]=targetArray[j];
				targetArray[j]=targetArray[newPival];
				targetArray[newPival]=targetArray[i];
			}
			newPival=i;
		}
		targetArray[newPival]=temp;
		this.setNewPival(newPival);
		return newPival;
	}
	
	public boolean checkSorter(int a,int b){
		return a-b<=1?true:false;
	}

}
