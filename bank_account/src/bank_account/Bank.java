package bank_account;

public class Bank {

	String bname;
	String loc;
	String ifsc_code;
	
	Account a;

	public Bank(String bname, String loc, String ifsc_code) {
		this.bname = bname;
		this.loc = loc;
		this.ifsc_code = ifsc_code;
	}
	
	public void bankDetails() {
		System.out.println(bname);
		System.out.println(loc);
		System.out.println(ifsc_code);
		if(a!=null) {
			System.out.println(a.account_holder_name);
			System.out.println(a.dob);
			System.out.println(a.pin);
			System.out.println(a.money);
		}else {
			System.out.println("open account first");
		}
	}
	
//	public void createAccount(String account_holder_name,String dob, String pin, double money) {
//		a=new Account(account_holder_name,dob,pin,money);
//	}
	
	public void createAccount(Account a) {
		if (this.a==null) {
			this.a=a;
			System.out.println("Account successfully created");
		} else {
			System.out.println("Account already exist");
		}
	}


}
