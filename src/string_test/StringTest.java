package string_test;

import java.util.*;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]; //�迭�� �̸��� ����
		arr = new int[10];
		//int arr[] = new int [10];
		arr[0] = 10;
	
		Scanner scann = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String txt = scann.nextLine();
			System.out.println(txt);
			if(txt.equals("exit")) {
				break;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
		
		scann.close();
	}

}
