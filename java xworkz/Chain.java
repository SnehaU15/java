class Chain{
public static String carat()
{
String Gname="vegetable";
System.out.println("Name:"+Gname);
return Gname;
}
public static String type()
{
String Pname="veg";
System.out.println("Name:"+Pname);
return Pname;
}
public static double cost()
{
double cost=100.0;
System.out.println("Name:"+cost);
return cost;
}
public static String Quality()
{
String test="good";
System.out.println("report:"+test);
return test;
}
public static int Quantity ()
{
int no=10;
System.out.println("tested:"+no);
return no;
}
public static String Waste ()
{
String useless="100g";
System.out.println("tested:"+useless);
return useless;
}
public static double sercharge()
{
double cost=10.0;
System.out.println("charge:"+cost);
return cost;
}
public static double GST()
{
double price=1.0;
System.out.println("Name:"+price);
return price;
}


public static void main(String[] args)
{
String value=Chain.carat();
String name=Chain.type();
double cost=Chain.cost();
String Quality=Chain.Quality();
int Quantity=Chain.Quantity();
String useless=Chain.Waste();
double GST=Chain.GST();
double sercharge=Chain.sercharge();
}


}


