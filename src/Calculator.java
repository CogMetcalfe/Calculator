
public class Calculator {
	double last;
	boolean printMode;
	Calculator(){
		last=0;
		printMode=false;
	}
	Calculator(double start){
		last=start;
		printMode=false;
	}
	
	void setPrint(boolean newPrintMode) {
		printMode = newPrintMode;
	}
	double add(double a) {
		last+=a;
		return last;
	}
	double add(double a, double b) {
		last = a+b;
		return last;
	}
	double subtract(double a) {
		return add(-a);
	}
	double subtract(double a, double b) {
		return add(a,-b);
	}
	double mult(double a) {
		last*=a;
		return last;
	}
	double mult(double a, double b) {
		last = a*b;
		return last;
	}
	double div(double a) {
		last/=a;
		return last;
	}
	double div(double a, double b) {
		last = a/b;
		return last;
	}
	double factorial() {
		return factorial((int)Math.round(last));
	}
	double factorial(int a) {
		if(a>1) {
			last= factorialR(a-1)*a;
		}else if(a==0) {
			last=1;
		}else {
			last = -factorialR(-a);
		}
		return last;
	}
	double factorialR(int a) {
		if(a>1) {
			return factorialR(a-1)*a;
		}
		if(a==0) {return 1;}
		return -factorialR(-a);
	}
	double power(double a) {
		last= Math.pow(last, a);
		return last;
	}
	double power(double a, double b) {
		last =  Math.pow(a,b);
		return last;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


















