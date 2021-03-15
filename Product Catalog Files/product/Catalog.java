package product;

public class Catalog
{
	private Product[] products;
	private int productCount;

	public Catalog()
	{
		products = new Product[100];
		productCount = 0;
	}

	public String toString()
	{
		String productsString = "";
		for(int i = 0; i < productCount; i++)
		{
			productsString = productsString + products[i].toString() + "\n";
		}
		return "Catalog: \n" + productsString;
    }

    private Product searchById(String id) {
        // Go through the products,
        // if there is a match, return that product
        for (int i = 0; i < productCount; i++) {
            if (products[i].getId().equals(id)) {
                return products[i];
            }
        }
        // If there is no match, return null
        return null;
    }
    // pre: product id is new
    // post: create the product and add it to the catalog

    public void addProduct(String id, String name, double price) {
        // product id must be new
        Product product = searchById(id);
        boolean pre = (product == null); // product is not found
        // If the precondition is not satisfied, we issue an alert and
        // terminate the operation
        if (!pre) {
            System.out.println("ALERT: The product already exists!");
            return;
        }
        // Otherwise, we create the new product and add it to the
        // collection (to fulfill our obligation)
        products[productCount] = new Product(id, name, price);
        productCount++;
    }

    // pre: product must exist
    // post: retrieve and return the product
    public Product searchProduct(String id) {
        // check that product exists
        Product product = searchById(id);
        boolean pre = product != null;
        
        if (!pre) {
            System.out.println("ALERT: The product does not exist!");
            return null;
        }
        // If we reach this point, it means that the product exists.
        // We have already retrieved it. So we just need to return it
        return product;
    }

    // pre: product with given id must exist
    // post: get the product and change its price
    public void changeProductPrice(String id, double price) {
        Product product = searchById(id);
        boolean pre = product != null;

        if (!pre) {
            System.out.println("ALERT: The searched product does not exist!");
            return;
        }
        product.setPrice(price);
    }

	// pre: product must exist
	// post: get the product and delete it
	//
	public void deleteProduct(String id)
	{
            int index = -1;
            boolean productFound = false;
            for(int i = 0; i < productCount; i++) {
                if(products[i].getId().equals(id)) {
                    index = i;
                    productFound = true;
                }
            }
            if(productFound == false) {
                System.out.println("Product could not be found.");
                return;
            }
            if(index > 0) {
                products[index] = searchById(products[productCount-1].getId());
                productCount--;
            } else if(index == 0) {
                products[0] = null;
                productCount--;
            }
	}
}