// class Laptop
// {
// 	String model;
// 	int price;
// //	String serial;
	
// 	public String toString()
// 	{
// //		return "Hey";
// 		return model+ " : "+price;
// 	}
// 	public boolean equals(Laptop that)
// 	{
// //		if(this.model.equals(that.model) && this.price==that.price) 
// //			return true;
// //		else
// //			return false;
		
// 		return this.model.equals(that.model) && this.price==that.price ;
// 	}
// }
	
// public class  Demo{
//     public static void main(String[] args) {

//     	Laptop obj=new Laptop();
//     	obj.model="Lenevo Yoga";
//     	obj.price=1000;
    	
//     	Laptop obj2=new Laptop();
//     	obj2.model="Lenevo Yoga";
//  //   	obj2.model="Lenevo Yoga1";
//     	obj2.price=1000;
    	
//     	boolean result = obj.equals(obj2);
    	
//     	System.out.println(obj.toString());
// //   	System.out.println(obj);
    	
//     }
// }

class Laptop {
    String model;
    int price;

    @Override
    public String toString() {
        return model + " : " + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Laptop that = (Laptop) obj;
        return this.price == that.price && this.model.equals(that.model);
    }
}

public class Demo {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenevo Yoga";
        obj.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenevo Yoga";
        obj2.price = 1000;

        System.out.println(obj.toString());
        System.out.println("Objects are equal: " + obj.equals(obj2));
    }
}
