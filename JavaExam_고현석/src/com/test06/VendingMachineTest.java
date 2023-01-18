package com.test06;

import java.util.Scanner;

import com.test06.biz.VendingMachineBiz;
import com.test06.entity.Coffee;
import com.test06.entity.Coke;
import com.test06.entity.Drink;
import com.test06.entity.Juice;

public class VendingMachineTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VendingMachineBiz machine = new VendingMachineBiz();
		Drink[] drinkList = {
			new Coffee(),
			new Coke(),
			new Juice()
		};
		
		Loop:
			while(true) {
				printMenu();
				int select = sc.nextInt();
				
				switch(select) {
					case 1:
						machine.printDrinkList(drinkList);
						break;
					case 2: 
						machine.cartDrink(drinkList[2]);
						break;
					case 3:
						machine.cartDrink(drinkList[0]);
						break;
					case 4:
						machine.cartDrink(drinkList[1]);
						break;
					case 5: 
						machine.printCart();
						break;
					case 9:
						System.out.println("프로그램 종료");
						break Loop;
					default:
						System.out.println("메뉴값을 확인후 다시 입력하세요");
				}
			}
		
		

	}
	
	private static void printMenu() {
		System.out.println("============================\r\n"
				+ "[음료수 자판기 관리 시스템]\r\n"
				+ "============================\r\n"
				+ "1.전체 음료수 및 잔액 보기\r\n"
				+ "2.쥬스 구입하기 ( 200원 )\r\n"
				+ "3.커피 구입하기 ( 100원 )\r\n"
				+ "4.코크 구입하기 ( 50원 )\r\n"
				+ "5.구입한 음료수 목록 보기\r\n"
				+ "9.종료\n");
		System.out.print("메뉴 입력 => ");
	}
}
