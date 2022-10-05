package week1.day2;

public class TwoWheeler {

	public int noOfWheels(int num1, int num2)
	{
	int count = num1 + num2;
	return count;
	}
	
	public short noOfMirrors(int num3)
	{
	short mirror = 2;
	return mirror;
	}
	
	public long chassisNumber()
	{
	long number = 642221812L;
	return number;
	}
	
	public boolean isPunctured()
	{
		boolean type = true;
		return type;
	}
	public String bikeName()
		{
		String name="JAWA";
		return name;
}
		
	public double runningKM() {
		double runKM = 2563444.554887;
		return runKM;
	}
		
	public static void main(String args[])
	{
		TwoWheeler car = new TwoWheeler();
		int count = car.noOfWheels(2, 2);
		System.out.println(count);
		short mirror = car.noOfMirrors(2);
		System.out.println(mirror);
		long number = car.chassisNumber();
		System.out.println(number);
		boolean type = car.isPunctured();
		System.out.println(type);
		String name = car.bikeName();
		System.out.println(name);
		double runKM= car.runningKM();
		System.out.println(runKM);	
		
	}
		

}
