package hoidanit;

import java.util.Scanner;

public class lab1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ten sinh vien");
		String name = scanner.nextLine();
		System.out.println("Diem trung binh");
		int diem = scanner.nextInt();
		System.out.println("Sinh vien " + name + " co diem trung binh la: " + diem);
		scanner.close();
	}
}
