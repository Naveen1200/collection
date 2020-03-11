package test;

public class Book {
	private String name;
	private double price;
	private int qty;
	private Aurthor[] arths;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getQty() {
		return qty;
	}



	public void setQty(int qty) {
		this.qty = qty;
	}



	public Aurthor[] getArths() {
		return arths;
	}



	public void setArths(Aurthor[] arths) {
		this.arths = arths;
	}

	public String getArthorName(Aurthor[] arths)
	{
	String n = "";	
	for(int i =0;i<arths.length;i++){
		Aurthor a = arths[i];
		String s = a.getName();
		n = n+""+s+" ";
		//System.out.println(n+"...");
	}
	return n;
	}

	public Book( String name,int qty, double price, Aurthor[] arths) {
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.arths=arths;
	}
	

}
