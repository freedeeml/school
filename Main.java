package prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer> num = new ArrayList();
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int mas[] = new int[n];
		for(int i=0;i<mas.length;i++) {
			mas[i]=0;
		}
		rec(mas,0);
		System.out.println("<"+num.size()+">");
		Object[] arr=num.toArray();
		int arr2[]=new int[num.size()];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=(int)arr[i];
		}
		Arrays.sort(arr2);
		for(int i=0;i<num.size();i++) {
			System.out.println(arr2[i]);
		}
	}

	public static void rec(int mas[],int x) {
			int sum = 0;
			for (int i = 0; i < mas.length; i++) {
				sum += mas[i];
			}
	
			if ((!num.contains(sum))&&(sum!=0)&&(x==mas.length)) {
				num.add(sum);
				
			}
			if(x<mas.length) {
			mas[x]=1;
			rec(mas,x+1);
			mas[x]=2;
			rec(mas,x+1);
			mas[x]=5;
			rec(mas,x+1);
			mas[x]=10;
			rec(mas,x+1);
			}
	}
}
