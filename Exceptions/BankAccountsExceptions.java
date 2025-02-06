class BankException extends Exception {
	public  BankException(String message) {
		super(message);
	} 
}
public class BankAccountsExceptions {
	private int balance;
	public BankAccountsExceptions(int balance) {
		this.balance = balance;
	}

	public void verifyBalance() throws BankException {
		if(balance<10000) {
			throw new BankException("Balance Insufficient");
		} else {
			System.out.println("Balance is sufficient");
		}
	}
	
	public static void main(String[] args) {
		BankAccountsExceptions acc1 = new BankAccountsExceptions(9000);
		BankAccountsExceptions acc2 = new BankAccountsExceptions(10000);
		
		try {
			acc1.verifyBalance();
		} catch (BankException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			acc2.verifyBalance();
		} catch (BankException e) {
			System.out.println(e.getMessage());
		}
	}
}
