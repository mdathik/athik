package org.athik;

public class KvbBank implements SbiBank,AxisBank{

	@Override
	public void deposit() {
System.out.println("40000");		
	}

	@Override
	public void loan() {
System.out.println("520000");		
	}

	@Override
	public void savings() {
System.out.println("6561");		
	}

	public static void main(String[] args) {
		KvbBank k=new KvbBank();
		k.loan();
		k.savings();
		k.deposit();
		
		AxisBank a=new KvbBank();
		a.deposit();
	}
}
