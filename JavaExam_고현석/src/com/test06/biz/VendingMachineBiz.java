package com.test06.biz;

import com.test06.entity.Coffee;
import com.test06.entity.Coke;
import com.test06.entity.Drink;
import com.test06.entity.Juice;

public class VendingMachineBiz implements IVendingMachineBiz {
	private int balance;
	private Drink[] cartList;
	private int count;
	
	public VendingMachineBiz() {
		this.balance = 1000;
		this.cartList = new Drink[3];
		this.count = 0;
	}
	
	@Override
	public void cartDrink(Drink drink) {
		String menu = "";
		
		if(drink instanceof Coffee) 
			menu = "커피";
		if(drink instanceof Juice) 
			menu = "쥬스";
		if(drink instanceof Coke) 
			menu = "코크";
		
		int save = balance - drink.getPrice();
		
		if(save < 0) {
			System.out.println("잔액이 부족하여 " + menu + "를 구입할 수 없습니다");
			return;
		}
		
		cartList[count++] = drink;
		
		if(count == cartList.length) {
			Drink[] newCart = new Drink[cartList.length * 3];
			
			for(int i=0 ; i<cartList.length ; i++) {
				newCart[i] = cartList[i];
			}
			cartList = newCart;
		}
		
		balance = save;
		System.out.println("커피를 구매했습니다. 현재 잔액: " + balance);
	}

	@Override
	public void printCart() {
		int coffee = 0, juice = 0, coke = 0;
		
		for(Drink d : cartList) {
			if(d instanceof Coffee) coffee++;
			if(d instanceof Juice) juice++;
			if(d instanceof Coke) coke++;
		}
		
		if(coffee != 0) System.out.println("커피 : " + coffee + "개");
		if(juice != 0) System.out.println("쥬스 : " + juice + "개");
		if(coke != 0) System.out.println("코크 : " + juice + "개");
		System.out.println("현재 잔액: " + balance + "원");
	}

	@Override
	public void printDrinkList(Drink[] drinkList) {
		for(Drink d : drinkList) {
			System.out.println(d.toString());
		}
		System.out.println("현재 잔액: " + balance + "원");
	}

}
