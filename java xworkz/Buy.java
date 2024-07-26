class Buy
{
public static void product(String brand,double price)
{
System.out.println("Brand:"+brand);
System.out.println("Price:"+price);
if(price<700&&price>=600)

System.out.println("valid price");
else
System.out.println("invalid");
}

public static void product(String name,String quality,int quantity,double price)
{
	System.out.println("Price:"+price);
	System.out.println("Name:"+name);
	System.out.println("Quality:"+quality);
	System.out.println("Quantity:"+quantity);
if(price<700&&price>=600)
System.out.println("valid price");
else
System.out.println("invalid");

if(quantity<7&&quantity>=00)
System.out.println("valid q");
else
System.out.println("invalid");
}

public static void BookMovieTicket(String name,String theatername,int quantity,double price)
{
	System.out.println("Price:"+price);
	System.out.println("Name:"+name);
	System.out.println("TName:"+ theatername);
	System.out.println("Quantity:"+quantity);
	if(price<700&&price>=600)
System.out.println("valid price");
else
System.out.println("invalid");

if(quantity<7&&quantity>=00)
System.out.println("valid q");
else
System.out.println("invalid");
}

public static void buyEgg(int total,double pricePerEgg){
	
	System.out.println("Price:"+pricePerEgg);
	System.out.println("Total:"+total);
if(pricePerEgg<=7.0&&pricePerEgg>0)
System.out.println("valid price");
else
System.out.println("invalid");
}

public static void buyShampoo(int quantity,double price,String brand,String mfDate){
	System.out.println("Price:"+price);
	System.out.println("Quantity:"+quantity);
	System.out.println("Brand:"+brand);
	System.out.println("Mfdate:"+mfDate);
	System.out.println("Quantity:"+quantity);
	if(price<700&&price>=600)
System.out.println("valid price");
else
System.out.println("invalid");

}
public static void buyCake(char size,int quantity,double price,String type,String flavour){
	System.out.println("Price:"+price);
	System.out.println("Quantity:"+quantity);
	System.out.println("Size:"+size);
	System.out.println("Type:"+type);
	System.out.println("Flavour:"+flavour);
if(price<700&&price>=600)
System.out.println("valid price");
else
System.out.println("invalid");}

public static void buyLaptop(String brand,int serialNo,int batteryCapacity,double screensize,String os,int ramSize,double price,int harddisksize){
	System.out.println("Price:"+price);
	System.out.println("RamSize:"+ramSize);
	System.out.println("Brand:"+brand);
	System.out.println("SerialNo:"+serialNo);
	System.out.println("BatteryCapacity:"+batteryCapacity);
	System.out.println("Screensize:"+screensize);
	System.out.println("Os:"+os);
	System.out.println("RamSize:"+ramSize);
System.out.println("Harddisksize:"+harddisksize);
if(price<=40000&&price>0)
System.out.println("valid price");
else
System.out.println("invalid");

}
public static void buySmartWatch(String brand,double price,int color,char type,int mode)
{
	int color=6;
	System.out.println("Brand:"+brand);
	System.out.println("Price:"+price);
	System.out.println("Color:"+color);
	System.out.println("Type:"+type);
	System.out.println("Mode"+mode);
	if(price<=40000&&price>0)
System.out.println("valid price");
else
System.out.println("invalid");
	
}

public static void main(String[] args){
	Buy.product("benz",800);
	Buy.product("benz",600);
	
	Buy.product("mobile","good",8,600);
	Buy.product("tv","avg",62,800);
	
	Buy.BookMovieTicket("kalki","saroja",8,600);
	Buy.BookMovieTicket("fida","city",2,800);
	
	 Buy.buyEgg(10,6);
	 Buy.buyEgg(10,8);
	 
	 Buy.buyShampoo(4,600,"chick","23");
	 Buy.buyShampoo(4,500,"chick","24");
	 
	 Buy.buyCake('M',2,250.0,"choclate","vennila");
	 Buy.buyCake('s',2,850.0,"choclate","straberry");
	 
	 Buy.buyLaptop("apple",1,60,4.5,"windows",8,4000.0,5);
	  Buy.buyLaptop("acer",1,60,4.5,"linux",8,40000.0,5);
	  
	  Buy.buySmartWatch("fastrack",800,6,'b',3);
	 Buy.buySmartWatch("fastrack",800,6,'b',3);
	 
	 
	 
}
}