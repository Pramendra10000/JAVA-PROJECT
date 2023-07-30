package bank_account;

public class Account {

	String account_holder_name;
	String dob;
	String pin;
	double money;
	long Account_no;
	
	
	public Account(String account_holder_name, String dob, String pin, double money,long Account_no) {
		this.account_holder_name = account_holder_name;
		this.dob = dob;
		this.pin = pin;
		this.money = money;
		this.Account_no=Account_no;
	}
	public void accountDetails() {
		System.out.println(account_holder_name);
		System.out.println(dob);
		System.out.println(pin);
		System.out.println(money);
		System.out.println(Account_no);
	}
	
}
