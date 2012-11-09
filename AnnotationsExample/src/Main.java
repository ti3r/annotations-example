
public class Main {

	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) 
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, ClassNotFoundException {
		Object1 o1 = new Object1();
		o1.setProperty1("Alex");
		String toString = Converter.stringObject(o1);
		System.out.println(toString);
		
		Object2 o2 = new Object2();
		o2.setProperty1("Prop1");
		o2.setP2("property2");
		toString = Converter.stringObject(o2);
		System.out.println(toString);
		
	}

}
