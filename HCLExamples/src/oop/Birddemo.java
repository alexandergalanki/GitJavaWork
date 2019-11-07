package oop;

public class Birddemo {

	public static void main(String[] args) {
		//create object for class bird
		Bird b=new Bird();
		
		//set values to attributes
		b.birdcolor="Green";
		b.birdname="Parrot";
//		b.legs=2;
//		b.wings=2;
		//call walk method
		b.walk();
		b.setsingingStatus();
		b.sing();
		
		//call fly method
		b.fly();
		
		Bird k=new Bird();
		k.birdcolor="Black";
		k.birdname="kokkila";
		k.walk();
		k.setsingingStatus();
		k.sing();
		k.fly();
		
		
	
		
		System.out.println("Object id:"+b.hashCode());

	}

}
