package kr.or.test;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();
		
		System.out.print("회사: "+mycar.company+"\t");
		System.out.print("모델: "+mycar.model+"\t");
		System.out.print("색깔: "+mycar.color+"\n");
		System.out.print("최고속도: "+mycar.maxSpeed+"\t");
		System.out.print("현재속도: "+mycar.speed+"\t");
		
		mycar.speed = 60;
		System.out.println("수정된 속도: "+mycar.speed);
	}

}
