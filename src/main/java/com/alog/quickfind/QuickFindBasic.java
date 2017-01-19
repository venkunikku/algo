package com.alog.quickfind;

public class QuickFindBasic {
	private int[] items;
	
	public QuickFindBasic(int totalRecordsInArray){
		items = new int[totalRecordsInArray];
		for (int i = 0 ; i < totalRecordsInArray; i++){
			items[i] = i;
		}
	}

	public static void main(String[] args) {
		
	}

}
