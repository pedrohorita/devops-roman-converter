package roman.converter;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to convert from decimal numbers to Roman numerals
 *
 */
public class Converter 
{
	private Map<Integer, String> base = new HashMap<Integer, String>();
	private int value;
	
	public Converter(){
		base.put(1, "I");
		base.put(5, "V");
		base.put(10, "X");
		base.put(50, "L");
		base.put(100, "C");
		base.put(500, "D");
		base.put(1000, "M");
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
    
    public String convert(){
    	StringBuilder result = new StringBuilder(100);
    	while (value > 0){
	    	if (value >= 1000){
	    		result.append(base.get(1000));
	    		value -= 1000;
	    	}
	    	else if(value >= 500){
	    		if (value < 900){
		    		result.append(base.get(500));
		    		value -= 500;
	    		}
	    		else{
		    		result.append(base.get(100) + base.get(1000));
		    		value -= 900;
	    		}
	    	}
	    	else if(value >= 100){
	    		if (value < 400){
		    		result.append(base.get(100));
		    		value -= 100;
	    		}
	    		else{
		    		result.append(base.get(100) + base.get(500));
		    		value -= 400;
	    		}
	    	}
	    	else if(value >= 50){
	    		if (value < 90){
		    		result.append(base.get(50));
		    		value -= 50;
	    		}
	    		else{
	    			result.append(base.get(10) + base.get(100));
		    		value -= 90;
	    		}
	    	}
	    	else if(value >= 10){
	    		if (value < 40){
		    		result.append(base.get(10));
		    		value -= 10;
	    		}
	    		else{
	    			result.append(base.get(10) + base.get(50));
		    		value -= 40;
	    		}
	    	}
	    	else if(value >= 5){
	    		if (value == 9){
	    			result.append(base.get(1) + base.get(10));
	    			value -= 9;
	    		}
	    		else{
	    			result.append(base.get(5));
	    			value -= 5;
	    		}
	    	}
	    	else if(value >= 1){
	    		if (value == 4){
	    			result.append(base.get(1) + base.get(5));
	    			value -= 5;
	    		}
	    		else{
		    		result.append(base.get(1));
		    		value -= 1;
	    		}
	    	}
    	}
    	return result.toString();
    }
}
