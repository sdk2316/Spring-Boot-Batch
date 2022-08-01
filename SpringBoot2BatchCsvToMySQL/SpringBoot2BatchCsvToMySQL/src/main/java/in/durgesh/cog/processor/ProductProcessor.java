package in.durgesh.cog.processor;

import org.springframework.batch.item.ItemProcessor;

import in.durgesh.cog.model.Product;
//not required
public class ProductProcessor implements ItemProcessor<Product, Product> {

	public Product process(Product item) throws Exception {
		double cost = item.getProdCost();
		
		item.setProdGst(cost*12/100.0);
		item.setProdDisc(cost*20/100.0);
		
		return item;
	}

}
