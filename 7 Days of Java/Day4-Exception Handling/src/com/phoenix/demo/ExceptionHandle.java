package com.phoenix.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Abhijit.Mahajan
 *
 */
public class ExceptionHandle {
		public static void main(String[] args) {
			boolean val=true;
			while(val) {
			try {
				System.out.println("Enter a Number :");
				Scanner sc = new Scanner(System.in);
				int v=sc.nextInt();
				System.out.println(v);
				val=false;
			}
			catch(InputMismatchException ime)
			{
				System.out.println("Wrong data type ");
			}
			//System.out.println("ok");
			}
		}
}
