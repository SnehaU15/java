class UpdateRunner{
	public static void main(String[] args){
		

Foodie food=new Foodie();
int val6=food.rupee;
String ref6=food.name;
double price6=food.price;
System.out.println("rupee6:"+val6);
System.out.println("ref6:"+ref6);
System.out.println("price6:"+price6);
food.rupee=10;
food.name="pizza";
food.price=100;
System.out.println("rupee:"+food.rupee);
System.out.println("name:"+food.name);
System.out.println("price6:"+food.price);

Medicine medicine=new Medicine();
int val1=medicine.rupee;
String ref1=medicine.name;
double price1=medicine.price;
System.out.println("rupee1:"+val6);
System.out.println("ref1:"+ref6);
System.out.println("price1:"+price6);
medicine.rupee=10;
medicine.name="dolo";
medicine.price=100;
System.out.println("rupee1:"+medicine.rupee);
System.out.println("name1:"+medicine.name);
System.out.println("price1:"+medicine.price);

 Matrimony matrimony=new Matrimony();
	  String name=matrimony.name;   //it prints the default values
	  System.out.println("the declared values is:"+name);     
	  double password=matrimony.password;
	  System.out.println("the declared values is:"+password);
	  int age=matrimony.age;
	  System.out.println("the declared values is:"+age);
	  
	  matrimony.name="gaja"; //to update the values with the default value 
      matrimony.password=123456;
      matrimony.age=40;  
	  System.out.println("the updated values is:"+matrimony.name);
	  System.out.println("the updated values is:"+matrimony.password);
	  System.out.println("the updated values is:"+matrimony.age);
	  
	  
	  Application application=new Application();
	  String appName=application.appName;   
	  System.out.println("the declared values is:"+appName);     
	  String name1=application.name1;
	  System.out.println("the declared values is:"+name1);
	  double password1=application.password1;
	  System.out.println("the declared values is:"+password1);
	  
	  application.appName="amazon";  
      application.name1="swetha";
      application.password1=987654;  
	  System.out.println("the updated values is:"+application.appName);
	  System.out.println("the updated values is:"+application.name1);
	  System.out.println("the updated values is:"+application.password1);
	  
	  
	  Fruit fruit=new Fruit();
	  String fName=fruit.fName;   
	  System.out.println("the declared values is:"+fName);     
	  int price=fruit.price;
	  System.out.println("the declared values is:"+price);
	  double quantity=fruit.quantity;
	  System.out.println("the declared values is:"+quantity);
	  
	  fruit.fName="pineapple";  
      fruit.price=100;
      fruit.quantity=245;  
	  System.out.println("the updated values is:"+fruit.fName);
	  System.out.println("the updated values is:"+fruit.price);
	  System.out.println("the updated values is:"+fruit.quantity);
	  
	  
	  Juice juice=new Juice();
	  String jName1=juice.jName1;   
	  System.out.println("the declared values is:"+jName1);     
	  int price1=juice.price1;
	  System.out.println("the declared values is:"+price1);
	  double quantity1=juice.quantity1;
	  System.out.println("the declared values is:"+quantity1);
	  
	  juice.jName1="mango";  
      juice.price1=50;
      juice.quantity1=499;  
	  System.out.println("the updated values is:"+juice.jName1);
	  System.out.println("the updated values is:"+juice.price1);
	  System.out.println("the updated values is:"+juice.quantity1);
	  



	}


}