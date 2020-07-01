package Aggregation;

public class Operation {
int square(int r) {
	return r*r;
}
}

class Circle{
	Operation op;
	double pi=3.14;
	
double area(int radius) {
	op=new Operation();
	int rsquare=op.square(radius);
	return pi*rsquare;
}

public static void main(String...args) {
	Circle c=new Circle();
	double result=c.area(6);
	System.out.println(result);
}
}

