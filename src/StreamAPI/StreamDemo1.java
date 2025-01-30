package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Coffee
{
	private String coffeeName;
	private double price;
	
	public Coffee(String coffeeName, double price) {
		super();
		this.coffeeName = coffeeName;
		this.price = price;
	}
	
	public String getCoffeeName() {
		return coffeeName;
	}
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
public class StreamDemo1 
{

	public static void main(String[] args) 
	{
		List<Coffee> coffeeList=Arrays.asList(new Coffee("Espresso",200),
				                              new Coffee("Latte",250),
				                              new Coffee("Regular",350),
				                              new Coffee("Black",275),
				                              new Coffee("Ceylon",350),
				                              new Coffee("Cold coffee",450));		
		Stream<Coffee> coffeeStream=coffeeList.stream();
		
		Predicate<Coffee> filterByPrice=(e)->e.getPrice()>200;
		Function<Coffee,String> displayCoffee=(e)->e.getCoffeeName().toUpperCase()+","+e.getPrice();
		
		coffeeStream.filter(filterByPrice).map(displayCoffee).
		forEach((e)->System.out.println(e));
		

	}

}
