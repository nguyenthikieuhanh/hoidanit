package hoidanit;

import java.util.Scanner;

public class lab1_bt2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chieu dai la: ");
		int chieudai = scanner.nextInt();
		System.out.println("Chieu rong la: ");
		int chieurong = scanner.nextInt();
		System.out.println("Chu vi hcn la: " + (chieudai + chieurong) * 2);
		System.out.println("Dien tich hcn la: " + (chieudai * chieurong));
		System.out.println("Canh nho nhat la: " + Math.min(chieudai, chieurong));

	}
}
