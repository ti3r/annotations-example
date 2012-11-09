import annotations.Property;


public class Object2 {

	@Property(name="prop1")
	public String property1 = null;

	@Property(name="p2")
	public String p2 = null;
	
	public String getProperty1() {
		return property1;
	}

	public void setProperty1(String property1) {
		this.property1 = property1;
	}

	public String getP2() {
		return p2;
	}

	public void setP2(String p2) {
		this.p2 = p2;
	}
	
	
	
}
