// AULA 130 a 133 - Herança

package section13;

import POO.entities.items.Account;
import POO.entities.items.BusinessAccount;
import POO.entities.items.SavingsAccount;

public class Lesson130 {
	
	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex", 1000.0);
		acc.withdraw(200.0);
		System.out.println(acc.getBalance());
		
		// Usando super() e @Override
		
		Account acc8 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc8.withdraw(200.0);
		System.out.println(acc8.getBalance());
		
		Account acc9 = new BusinessAccount(1003, "Joao", 1000.0, 500.0);
		acc9.withdraw(200.0);
		System.out.println(acc9.getBalance());
		
		// UPCASTING
		
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(100.0);
			System.out.println("Loan completed!");
		} else if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		} else {
			System.out.println("Operation failed!");
		}
		
	}

}
