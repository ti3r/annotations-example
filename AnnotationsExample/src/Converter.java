import java.lang.reflect.Field;

import annotations.Property;


public class Converter {

	public static String stringObject(Object obj ) 
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, ClassNotFoundException{
		StringBuilder result = new StringBuilder();
		Field[] fields = obj.getClass().getFields();
		for(Field field : fields){
			if (field.isAnnotationPresent(Property.class)){
				Property p = field.getAnnotation(Property.class);
				String name = p.name();
				Object value = field.get(obj);		
				result.append(name).append("=").append(value);
			}
		}		
		return result.toString();
	}
	
}
