package com.paymoney.main;

import java.util.Scanner;

import com.paymoney.service.TransactionService;

public class DriverClass {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		
		int size = sc.nextInt();
		
		int array[] = new int [size];
		
		System.out.println("Enter the values of array");
		for (int i=0; i<size; i++)
		
			array[i] = sc.nextInt();
		
		System.out.println("Enter the total no of target that need to be achieved");
		
		int targetNo = sc.nextInt();
		
	    TransactionService transactionService = new TransactionService();
	    
	    transactionService.checkTransaction(array, targetNo);
	    sc.close();
	    
		
		 
		
		


	}

}
