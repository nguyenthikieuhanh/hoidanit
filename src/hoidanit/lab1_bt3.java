package hoidanit;

import java.util.Scanner;

public class lab1_bt3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Canh cua khoi lap phuong la: ");
		int canh = scanner.nextInt();
		System.out.println("The tich cua hinh lap phuong la: " + Math.pow(canh, 3));
		scanner.close();
	}
}
