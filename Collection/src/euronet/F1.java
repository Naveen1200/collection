package euronet;

public class F1  {
String str = "a";
void A()
{
try{
	str +="b";
	B();
}	
catch(Exception e)
{
str +="c";	
}

}

void B() throws Exception
{
	try{
		str +="d";
		C();
	}
	catch(Exception e)
	{
		throw new Exception();
	}
	finally {
		str += "e";
	}
	str += "f";
}

void C() throws Exception
{
	
	throw new Exception();
}

void disp()
{
System.out.println(str);	
}

public static void main(String[] args) {
	F1 f = new F1();
	f.A();
	f.disp();
}

}
