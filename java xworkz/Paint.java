class Paint{
public static void feature(String brand)
{
System.out.println("Brand:"+brand);
}
public static void feature(String brand,String color)
{
System.out.println("Brand:"+brand);
System.out.println("Color:"+color);
}
public static void feature(String brand,int price)
{
System.out.println("Brand:"+brand);
System.out.println("Price:"+price);
}
public static void feature(String color,int price,String type)
{
System.out.println("Color:"+color);
System.out.println("Price:"+price);
System.out.println("Type:"+type);
}
public static void main(String[] args)
{
Paint.feature("nippon");
Paint.feature("nippon","yellow");
Paint.feature("nippon",456);
Paint.feature("yellow",500,"liquid");

}
}


