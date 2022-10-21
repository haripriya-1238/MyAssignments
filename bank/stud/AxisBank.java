package bank.stud;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposited");

	}

	public static void main(String[] args) {
		BankInfo bank = new BankInfo();
		bank.deposit();

		System.out.println("------------------------");

		AxisBank banks = new AxisBank();
		banks.deposit();

	}
}
