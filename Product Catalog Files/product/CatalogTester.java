package product;

public class CatalogTester
{
	public static void main(String [] args)
	{
		// testAddProduct();
		// testSearchProduct();
		// testChangeProductPrice();
		testDeleteProduct();
	}

	public static void testAddProduct()
	{
		// create a new catalog
		Catalog catalog= new Catalog();
		System.out.println(catalog);

		// add some products
		catalog.addProduct("P10", "table", 100);
		catalog.addProduct("P20", "chair", 20);
		System.out.println(catalog);

		// try to add a product that already exists
		// (an invalid request)
		catalog.addProduct("P10", "desk", 200);
		System.out.println(catalog);
	}

	public static void testChangeProductPrice()
	{
		// create a catalog with some products in it
		Catalog catalog= new Catalog();
		catalog.addProduct("P10", "table", 100);
		catalog.addProduct("P20", "chair", 20);
		System.out.println(catalog);

		// change the price of a product
		catalog.changeProductPrice("P20", 30);
		System.out.println(catalog);

		// Invalid request:
		// Change the price of a product that is not in
		// the collection
		catalog.changeProductPrice("P100", 15);
		System.out.println(catalog);
	}

	public static void testSearchProduct()
	{
		// create a catalog with some products in it
		Catalog catalog= new Catalog();
		catalog.addProduct("P10", "table", 100);
		catalog.addProduct("P20", "chair", 20);
		System.out.println(catalog);

		// search for a product
		Product product = catalog.searchProduct("P20");
		System.out.println("product retrieved: " + product);

		// Invalid request:
		// Search for a product that is not in the collection
		product = catalog.searchProduct("P100");
		System.out.println("product retrieved: " + product);
	}

	public static void testDeleteProduct()
	{
		// create a catalog with some products in it
		Catalog catalog= new Catalog();
		catalog.addProduct("P10", "table", 100);
		catalog.addProduct("P20", "chair", 20);
		catalog.addProduct("P30", "desk", 200);
		System.out.println(catalog);

		// delete a product
		catalog.deleteProduct("P20");
		System.out.print(catalog);

		// invalid request:
		// delete a product that is not in the collection
		catalog.deleteProduct("P100");
		System.out.print(catalog);

		// Note: We should also set up tests to delete
		// the first and the last products in the collection
	}
}