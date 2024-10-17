class bank
{
	int balance;
	int amount;
	void check()
	{
		balance = 1000;
		amount = 2000;
		System.out.println(balance);
		System.out.println(amount);
	}
}


class program1 {

	public static void main(String[] args) {
		
		bank b = new bank();
		b.check();
		
	}

}
