package ro.esolutions.repositories;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ro.esolutions.Application;
import ro.esolutions.entities.Product;
import ro.esolutions.specifications.ProductSpecifications;

import java.util.List;

/**
 * Created by BOGDAN on 2/8/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testFindAll() {
        List<Product> products = productRepository.findAll();
        System.out.println(products.size());
        Assert.assertEquals(products.size(), 14);
    }

    @Test
    public void testNameEquals() {
        List products = productRepository.findAll(ProductSpecifications.nameEquals("PRODUCT_1"));
        System.out.println(products.size());
        Assert.assertEquals(products.size(), 1);
    }

    @Test
    public void testNameEqualsOr() {
        List products = productRepository.findAll(Specifications.where(ProductSpecifications.nameEquals("PRODUCT_1")).or(ProductSpecifications.nameEquals("PRODUCT_2")));
        System.out.println(products.size());
        Assert.assertEquals(products.size(), 2);
    }

    @Test
    public void testCodeEqualsAndNameEquals() {
        List products = productRepository.findAll(Specifications.where(ProductSpecifications.codeEquals("CODE_2")).and(ProductSpecifications.nameEquals("PRODUCT_2")));
        System.out.println(products.size());
        Assert.assertEquals(products.size(), 1);
    }

    @Test
    public void testAcquisitionPriceGreaterThanOrEqualsTo(){
        List products = productRepository.findAll(ProductSpecifications.acquisitionPriceGreaterThanOrEqualsTo(100D));
        System.out.println(products.size());
        Assert.assertEquals(products.size(), 5);
    }


    @Test
    public void testActualPriceAndAcquisitionPrice() {
        List products = productRepository.findAll(Specifications.where(ProductSpecifications.actualPriceBetween(120D,170D)).
                and(ProductSpecifications.acquisitionPriceGreaterThanOrEqualsTo(100D)));
        System.out.println(products.size());
        Assert.assertEquals(products.size(), 3);
    }

    @Test
    public void testDescriptionLike(){
        List<Product> products = productRepository.findAll(ProductSpecifications.descriptionLike("DESC"));
        System.out.println(products.size());
        Assert.assertEquals(products.size(), 14);
    }
}
