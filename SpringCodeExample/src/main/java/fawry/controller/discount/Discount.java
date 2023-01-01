package fawry.controller.discount;

import java.util.HashMap;

public abstract class Discount{
	public static HashMap<String,Float> services = new HashMap<String, Float>();
    public abstract float getDiscount();
}