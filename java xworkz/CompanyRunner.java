class Company
{
  public static void deliver(String item,String location)
  {
     System.out.println("the company runs in delivery with item and location");
	 System.out.println(item + ", " + location);
  }
}

class DeliveryVehicle
{
  public static void deliver(String item,String location)
  {
     System.out.println("the Delivery vehicle runs with deliver for both");
	 Company.deliver(item,location);
  }
}

class DeliveryGuy
{
  public static void deliver(String item)
  {
    System.out.println("the Delivery guy runs with only item");
	DeliveryVehicle.deliver(item,"Fixed");
  }
}

class CompanyRunner
{
  public static void main(String[] args)
  {
    System.out.println("the Delivery vehicle runs in the location");
	DeliveryGuy.deliver("item");
  }
}