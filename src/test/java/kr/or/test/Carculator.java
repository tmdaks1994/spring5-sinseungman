package kr.or.test;

public class Carculator {

	int plus(int x,int y) {
		return x+y;
	}
	double avg(int x,int y) {
		int sum = plus(x,y);
		return (double)sum/2;
	}
	void println(String message) {
		System.out.println(message);
	}
	void execute(){
		double result = avg(7,10);
		System.out.println("결과는 :" + result );
	}
}
