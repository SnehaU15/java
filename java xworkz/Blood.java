class Book
{
public static String group()
{
String Gname="star";
System.out.println("Name:"+Gname);
return Gname;
}
public static String PerName()
{
String Pname="suganda";
System.out.println("Name:"+Pname);
return Pname;
}
public static double cost()
{
double cost=100.0;
System.out.println("Name:"+cost);
return cost;
}
public static boolean hospitaltested()
{
boolean test=true;
System.out.println("report:"+test);
return test;
}
public static boolean sick ()
{
boolean sick=false;
System.out.println("tested:"+sick);
return sick;
}
public static boolean donate ()
{
boolean donate=false;
System.out.println("tested:"+donate);
return donate;
}

public static void main(String[] args)
{
String value=Book.PerName();
String name=Book.group();
double cost=Book.cost();
boolean hospitaltested=Book.hospitaltested();
boolean sick=Book.sick();
boolean donate=Book.donate();
}


}