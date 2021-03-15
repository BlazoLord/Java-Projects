package product;

public class Product
{
	private String id;
	private String name;
	private double price;

	public Product(String id, String name, double price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public String getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public double getPrice()
	{
		return price;
	}

	public String getDetails()
	{
		return "id: " + id + ", name: " + name
					+ ", price: " + price;
	}

	public String toString()
	{
		return getClass().getName() + "[" + getDetails() + "]";
	}


	// To perform some quick tests
	public static void main(String [] args)
	{
		Product p = new Product("P10", "Table", 10.00);
		System.out.println(p);
	}
}