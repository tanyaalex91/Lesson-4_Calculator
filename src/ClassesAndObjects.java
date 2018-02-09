
public class ClassesAndObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pizza pizza1 = new Pizza();

pizza1.name = "Pepperoni";
pizza1.size = 50;
System.out.println("Your order is" + " "+ pizza1.name + "." + "the size is" + " " + pizza1.size +  " " + "santimeters");
Pizza pizza2 = new Pizza();
System.out.println(" ");
pizza2.name = "Four seasons";
pizza2.size = 45;
System.out.println("Your order is" + " "+ pizza2.name + "." + "the size is" + " " + pizza2.size +  " " + "santimeters");

	}
}
	
	
	class Pizza{
		
		String name;
		int size;
	}
	

