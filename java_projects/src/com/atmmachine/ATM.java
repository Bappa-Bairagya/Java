package com.atmmachine;


import java.util.Scanner;

public class ATM {
int pin=5432;
float balance;
Scanner sc =new Scanner(System.in);
public void checkpin() {
	System.out.println("Enter your ATM pin :");
	int upin=sc.nextInt();
	if (upin==pin) {
		Menu();
	}
	else {
		System.out.println("you enterd wrong pin");
		checkpin();
	}
}

public void Menu() {
	
	System.out.println("1: Check Balance");
	System.out.println("2: Deposit amaount");
	System.out.println("3: Withdrow amount");
	System.out.println("4: Exit");
	System.out.println("Enter your choice:");
	int n=sc.nextInt();
	
	if (n==1) {
		check_balance();
	} else if (n==2) {
		deposit_balance();
	} else if (n==3) {
		withdrow_amount();
	}else if (n==4) {
		return;
	}
	else {
		System.out.println("Please enter right choice");
		Menu();
	}
	

}
private void check_balance() {
	System.out.println("Your balance is"+balance);
	Menu();
}
private void deposit_balance() {
	System.out.println("Enter amount");
	float n=sc.nextFloat();
	balance=balance+n;
	System.out.println("Succesfully deposited your amount");
	Menu();
}
private void withdrow_amount() {
	System.out.println("Enter withdrow amount");
	float n=sc.nextFloat();
	if (n>balance) {
		System.out.println("Balance can't be negetive");
	} else {
		balance=balance-n;
	}
	Menu();
}
}
