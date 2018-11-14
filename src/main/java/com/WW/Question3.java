package com.WW;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Question3 {
	public static int nthSmallest(int start, int end, int pos){
		Random rand=new Random();
		int[] arr=new int[50];
		for(int i=0;i<50;i++)
			arr[i]=rand.nextInt(end)+start;
		Arrays.sort(arr);
		if (pos>50)
			return Integer.MAX_VALUE;
		return arr[pos-1];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the start of the range");
		int start = in.nextInt();
		System.out.println("Enter the end of the range");
		int end = in.nextInt();
		System.out.println("Enter the nth number value");
		int pos = in.nextInt();
		if (nthSmallest(start,end,pos)==Integer.MAX_VALUE)
			System.out.println("Enter proper nth vale to find");
		else
			System.out.println(nthSmallest(start,end,pos));

	}

}
