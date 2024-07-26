class Dog
{
    public static void guarding(String location)
     {
     System.out.println("the Dog guarding his owner");
	 System.out.println("location:"+""+location);
	 System.out.println(location);
	 }
}

class House
{
    public static void watch(String location)
	{
	System.out.println("the house contains the watch ");
	Dog.guarding(location);
	}
}

class DogRunner
{
    public static void main(String[] args)
	{
	System.out.println("the house is running with parameters");
	House.watch("Gate");
	}
}