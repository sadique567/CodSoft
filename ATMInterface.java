package task3.codSoft.ATMInterface;

import java.util.Scanner;


class UserBankAccounts {
	
	Scanner sc = new Scanner(System.in);
	private String name;
	private String panNo;
	private String address;
	private double avlBalance;

	private long accontNo;
	
	
	public void openAccount() {
		
		int min=1;
		int max = 999;
		accontNo =  (long) (Math.random()*(max - min + 1) + min);
		System.out.println("enter details to open new Account ");
		System.out.println("Enter Name : "); name = sc.nextLine();
		System.out.println("Enter PAN No : "); panNo = sc.nextLine();
		System.out.println("Enter Address : "); address = sc.nextLine();
		System.out.println("Initial Amount : "); 
		avlBalance = sc.nextDouble();
		
		
	}
	public void withdraw(){
		
		System.out.println("Enter Acc No");
		long enterAcc = sc.nextLong();
		if(accontNo == 0) {
			System.out.println("Sorry! here is No Account....");
			openAccount();
		}
		
		if(accontNo == enterAcc) {
		 int withDrawAmount;
		System.out.println("Enter Withdraw Amount : ");
		withDrawAmount = sc.nextInt();
		if(withDrawAmount<avlBalance && withDrawAmount>0) {
		avlBalance -= withDrawAmount;
		System.out.println("Avl Bal : "+avlBalance);
		}else {
			System.out.println("insufficient Balance");
		}
		}
		else {
			System.out.println("Incorrect Acc No");
		}
	}
	public void deposit() {
		if(accontNo == 0) {
			System.out.println("Sorry! here is No Acc....");
			openAccount();
		}
		System.out.println("Enter Acc No");
		long enterAcc = sc.nextLong();
		if(accontNo == enterAcc) {
		int depositAmount;
		System.out.println("Enter Deposit Amount");
		depositAmount = sc.nextInt();
		avlBalance += depositAmount;
		System.out.println("Now Avl Bal : "+avlBalance);
		}
	}
	public void checkBalance() {
		if(accontNo == 0) {
			System.out.println("Sorry! here is No Acc....");
			openAccount();
		}
		System.out.println("Enter Acc No");
		long enterAcc = sc.nextLong();
		if(accontNo == enterAcc) {
		System.out.println("Avl Bal : "+avlBalance);
		}
		
	}
	public void customerSummary() {
		System.out.println("-------------Client Summary-----------");
		System.out.println("Name : "+name);
		System.out.println("Account No. : "+accontNo);
		System.out.println("Pan Card No : "+panNo);
		System.out.println("Address : "+address);
		System.out.println("Avl Bal : "+avlBalance);
		System.out.println("----------------------------------------");
		
	}
}




public class ATMInterface {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		UserBankAccounts userAcc = new UserBankAccounts();
		do {
		System.out.println("Select any option : ");
		System.out.println("1-Open Account\n2-Customer Summary\n3-Deposit\n4-check Balance\n5-Withdraw");
		System.out.println("6- Exit ");
		 n = sc.nextInt();
		switch (n) {
		case 1: {
			userAcc.openAccount();
			userAcc.customerSummary();
			break;
		}
		case 2: {
			userAcc.customerSummary();
			break;
		}
		case 3: {
			userAcc.deposit();
			break;
		}
		case 4: {
			userAcc.checkBalance();
			break;
		}
		case 5: {
			userAcc.withdraw();
			break;
		}
		}
		}
		while(n != 6);
		
		System.out.println("Thank You!");
	}

}


/*****************************************************/
