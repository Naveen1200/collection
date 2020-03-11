package check;

public  final class Immutclass {
	//static int j=0;
	private  final int a;
	private  final String str;
	Immutclass i;
	
	public  Immutclass(int a, String str) {
		this.a = a;
		this.str = str;
	
	}

	public  int getA() {
		return this.a;
	}

	public  String getStr() {
		return this.str;
	}
	
	@Override
	public String toString() {

		return a+":"+str;
	}
	
	@Override
	public int hashCode() {
		//j++;
		//System.out.println("hash code"+j);
		System.out.println("original hash code:::"+super.hashCode());
		return this.a;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equal");
		if(obj == this)
				return true;
		if(obj == null || obj.getClass() != this.getClass())
			return false;
		i = (Immutclass)obj;
		return i.str.equals(this.str) && i.a==this.a;
	}
	

}
