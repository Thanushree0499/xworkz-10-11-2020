class Operations{
	public static int add(int a,int b){
	int sum=0;
	sum=a+b;
	return sum;
	}
	public static int sub(int a,int b){
	int diff=0;
	diff=a-b;
	return diff;
	}
	public static double multiply(double a,double b){
	double result=0;
	result=a*b;
	return result;
	}
	public static double division(double a,double b){
	double res=0;
	res=a/b;
	return res;
	}
	public static void main(String args[]){
	System.out.println("sum is"+Operations.add(10,20));
	System.out.println("difference is"+Operations.sub(10,20));
	System.out.println(" multiply result is"+Operations.multiply(10.13,20.34));
	System.out.println("division result is"+Operations.division(10.45,20.45));
}
}