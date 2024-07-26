class Train{
public static void book(String sourc,String destination)
{
System.out.println("Source:"+sourc);
System.out.println("Destination:"+destination);
}
public static void book(String source,String destination,int qantity)
{
System.out.println("Source:"+source);
System.out.println("Destination:"+destination);
System.out.println("Quantity:"+qantity);
}
public static void book(String source,String destination,int qantity,int price)
{
System.out.println("Source:"+source);
System.out.println("Destination:"+destination);
System.out.println("Quantity:"+qantity);
System.out.println("Price:"+price);
}

public static void cancel(int tickekno)
{
System.out.println("Tickekno:"+tickekno);
}

public static void cancel(String source,String destination)
{
System.out.println("Source:"+source);
System.out.println("Destination:"+destination);
}
public static void main(String[] args)
{
Train.book("shivamogga","benglore");
Train.book("shivamogga","benglore",2);
Train.book("shivamogga","benglore",2,345);
Train.cancel(4);
Train.cancel("shivamogga","benglore");


}
}


