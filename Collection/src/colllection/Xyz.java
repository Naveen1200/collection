package colllection;

public class Xyz {
	 static private int myCount = 0;
	  int yourNumber;
	  private static synchronized int nextCount ()
	  {
	    return ++myCount;
	  }
	  public void getYourNumber ()
	  {
	    yourNumber = nextCount ();
	  }
}
