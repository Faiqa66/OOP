package JavaPrograms;

public class PrimeNumber2 {
	static void checkPrime(int n) {
	int m,flag=0;
	m=n/2;
	if(n==0||n==1) {
		System.out.println(n+" is not a prime number!");
	}
	else {
	for(int i=2;i<=m;i++) {
		if(n%i==0) {
			System.out.println("Number is not prime!");
			flag=1;
			break;
		}
	}
if(flag==0) {
	System.out.println(n+" is a prime number!");
}
	}
	}
public static void main(String[] args) {
	checkPrime(1);
	checkPrime(17);
	checkPrime(34);
	checkPrime(77);
}
}