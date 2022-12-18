package com.main;


import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Yil Giriniz: ");
		int Yil= input.nextInt();
		String sonikiRakam = Integer.toString(Yil).substring(2,4);
		
		if(sonikiRakam.equals("00")) {
			if(Yil%400==0) {
				System.out.println(Yil+" bir artik yildir!");
			}else {
				System.out.println(Yil+" bir artik degildir!");
			}
		}else if (Yil%4==0) {
			System.out.println(Yil+" bir artik yildir!");
		}else {
			System.out.println(Yil+" bir artik degildir!");
		}
		input.close();

	}

}
