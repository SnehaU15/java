class Tuesday
{

public static double price(String medicine)
{
System.out.println("medicine in medical");
System.out.println("the medicine:"+medicine);
if(medicine=="dolo")
{
return 44;
}
if(medicine=="paracetomol")
{
return 50;
}
if(medicine=="citrizine")
{
return 20;
}
return 0;
}
public static String medicineName(String symptom)
{
System.out.println("symptom for medicine");
System.out.println("the medicine is:"+symptom);
if(symptom=="fever")
{
return "dolo";
}
if(symptom=="sneeze")
{
return "citrizen";
}
if(symptom=="headeche")
{
return "paracetomol";
}
return "not found";
}
public static boolean avalability(String dName)
{
System.out.println("docter avalability");
System.out.println("the avalability:"+dName);
if(dName=="sneha")
{
return true;
}
if(dName=="nisarga")
{
return false;
}
if(dName=="sreena")
{
return false;
}

return false;
}
public static void main(String [] args)
{
System.out.println("main mathod running");
double cost=Tuesday.price("dolo");
System.out.println("the cost is:"+cost);
double cost1=Tuesday.price("paracetomol");
System.out.println("the cost is:"+cost);
double cost2=Tuesday.price("citrizen");
System.out.println("the cost is:"+cost);

System.out.println("main mathod running");
String medicine=Tuesday.medicineName("fever");
System.out.println("the medicine:"+medicine);
String medicine2=Tuesday.medicineName("sneeze");
System.out.println("the medicine is:"+medicine);
String medicine3=Tuesday.medicineName("fever");
System.out.println("the medicine is:"+medicine);


System.out.println("main mathod running");
boolean ref=Tuesday.avalability("sneha");
System.out.println("the item is:"+ref);
boolean ref1=Tuesday.avalability("nisarga");
System.out.println("the item is:"+ref1);
boolean ref2=Tuesday.avalability("sreena");
System.out.println("the item is:"+ref2);

	
}

}