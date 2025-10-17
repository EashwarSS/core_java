// class A{
	
// }
// class B extends A{
	
// }
// //class C extends A,B
// // Multiple inheritance does not supported by Java
// // Ambiguity issue
// class C extends B{
	
// }

// public class Demo{
// 	public static void main(String args[])
// 	{
		
// 	}
// }


class A {
	void show() {
		System.out.println("This is class A");
	}
}

class B extends A {
	void display() {
		System.out.println("This is class B");
	}
}

class C extends B {
	void print() {
		System.out.println("This is class C");
	}
}

public class Demo {
	public static void main(String args[]) {
		C obj = new C();
		obj.show();     // From class A
		obj.display();  // From class B
		obj.print();    // From class C
	}
}

