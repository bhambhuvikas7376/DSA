package Comparablecomparator;

//import java.util.*;

public class laptop implements Comparable<laptop>  {
	private String brand;
	private int ram;
	private int price;
	
	

	public  laptop(String brand,int ram,int price)
	{
		this.brand=brand;
		this.ram=ram;
		this.price=price;
	}
	
	public String getbrand()
	{
		return brand;
	}
	public void setbrand(String brand)
	{
		this.brand=brand;
	}
	
	public int getram()
	{
		return ram;
	}
	public void setram(int ram)
	{
		this.ram=ram;
	}
	
	public int getprice()
	{
		return price;
	}
	public void setprice(int price)
	{
		this.price=price;
	}
	
	public String toString()
	{
		return "Laptop [brand=" + brand + ",ram=" + ram + ",price=" + price +"]";
		
	}

	@Override
	public int compareTo(laptop o) {
		if(this.getram() > o.getram()) return 1;
		else return -1;
		
		
	}
	

}