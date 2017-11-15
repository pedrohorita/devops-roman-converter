package roman.converter;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class Converter 
{
	private static Map<Integer, String> base = new HashMap<Integer, String>();
	private static String result = "";
	private static int value;
	
	Converter(){
		base.put(1, "I");
		base.put(5, "V");
		base.put(10, "X");
		base.put(50, "L");
		base.put(100, "C");
		base.put(500, "D");
		base.put(1000, "M");
	}
	
	public float getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public static String convert(){
    	result = "";
    	while (value > 0){
	    	if (value >= 1000){
	    		result += base.get(1000);
	    		value -= 1000;
	    	}
	    	else if(value >= 500){
	    		result += base.get(500);
	    		value -= 500;
	    	}
	    	else if(value >= 100){
	    		result += base.get(100);
	    		value -= 100;
	    	}
	    	else if(value >= 50){
	    		result += base.get(50);
	    		value -= 50;
	    	}
	    	else if(value >= 10){
	    		result += base.get(10);
	    		value -= 10;
	    	}
	    	else if(value >= 5){
	    		result += base.get(5);
	    		value -= 5;
	    	}
	    	else if(value >= 1){
	    		result += base.get(1);
	    		value -= 1;
	    	}
    	}
    	return result;
    }
}
