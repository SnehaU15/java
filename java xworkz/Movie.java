class Movie{
public static void hero(String name)
{
System.out.println(name);
}
public static void hero(int no)
{
System.out.println(no);
}
public static void hero(double price)
{
System.out.println(price);
}
public static void hero(short rating)
{
System.out.println(rating);
}
public static void main(String[] args)
{
Movie.hero("klki");
Movie.hero(5);
Movie.hero(45.0);
Movie.hero(5);
}
}
