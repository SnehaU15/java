class India
{

public static double price(String item)
{
System.out.println("my favorite item is biryani");
System.out.println("the item is:"+item);
if(item=="nippat")
{
return 444;
}
if(item=="chakli")
{
return 50;
}
if(item=="biryani")
{
return 120;
}
if(item=="champakali")
{
return 577;
}
if(item=="puri")
{
return 478;
}
return 0;
}
public static String produerName(String movieName)
{
System.out.println("my favorite movie is gaja");
System.out.println("the movieName is:"+movieName);
if(movieName=="abay")
{
return "darshan";
}
if(movieName=="kranti")
{
return "shylaja";
}
if(movieName=="katera")
{
return "rocklinevenkatesh";
}
if(movieName=="sarathi")
{
return "satya";
}
if(movieName=="devil")
{
return "vijay";
}
return "not found";
}
public static String country(double code)
{
System.out.println("india is my country");
System.out.println("the code is:"+code);
if(code==577222)
{
return "holalkere";
}
if(code==577722)
{
return "singenahalli";
}
if(code==577282)
{
return "ramagiri";
}
if(code==577252)
{
return "kachinkatte";
}
if(code==577227)
{
return "shivmogga";
}
return "not found";
}
public static void main(String [] args)
{
System.out.println("main mathod running");
String movie=India.produerName("snehana preethina");
System.out.println("the movie is:"+movie);
String movie1=India.produerName("abay");
System.out.println("the movie is:"+movie1);
String movie2=India.produerName("kranthi");
System.out.println("the movie is:"+movie2);
String movie3=India.produerName("katera");
System.out.println("the movie is:"+movie3);
String movie4=India.produerName("sarathi");
System.out.println("the movie is:"+movie4);
String movie5=India.produerName("devil");
System.out.println("movie:"+movie5);

System.out.println("main mathod running");
String value=India.country(577222);
System.out.println("the country is:"+value);
String value1=India.country(577922);
System.out.println("the country is:"+value1);
String value2=India.country(577722);
System.out.println("the country is:"+value2);
String value3=India.country(577282);
System.out.println("the country is:"+value3);
String value4=India.country(577252);
System.out.println("the country is:"+value4);
String value5=India.country(577227);
System.out.println("Value:"+value5);

System.out.println("main mathod running");
double ref=India.price("nippat");
System.out.println("the item is:"+ref);
double ref1=India.price("champakali");
System.out.println("the item is:"+ref1);
double ref2=India.price("chakli");
System.out.println("the item is:"+ref2);
double ref3=India.price("puri");
System.out.println("the item is:"+ref3);
double ref4=India.price("biryani");
System.out.println("the item is:"+ref4);
double ref5=India.price("pongal");
System.out.println("item:"+ref5);

	
}

}