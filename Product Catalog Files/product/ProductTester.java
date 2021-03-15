package product;

public class ProductTester
{
	public static void main(String [] args)
	{
		Product p = new Product("P10", "Table", 10.00);
		System.out.println(p);

		p.setPrice(20);
		System.out.println(p);

	}
}