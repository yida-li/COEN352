

public class Account{

		private double balance;
		public Account(double balance) {
		this.balance = balance;
		}
		public void deposit(double amnt) {
		balance += amnt;
		}
		public void withdrawal (double amnt) {
		if (balance >= amnt)
		balance -= amnt;
		else
			System.out.println("Not enuff funds yo");
		
		
	}
		public double getBalance() {
			return balance;
			}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account = new Account(5000.00); // !!!remember this one!!!
		account.deposit(2000.00);
		System.out.println("Balance: " + account.getBalance());
		account.withdrawal(4000);
		System.out.println("Balance: " + account.getBalance());
		
		
		
		

	}
	
}
