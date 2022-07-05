package guru.springframework.orderservice.bootstrap;

import guru.springframework.orderservice.domain.Customer;
import guru.springframework.orderservice.domain.Product;
import guru.springframework.orderservice.domain.ProductStatus;
import guru.springframework.orderservice.repositories.CustomerRepository;
import guru.springframework.orderservice.repositories.OrderHeaderRepository;
import guru.springframework.orderservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 6/8/22.
 */
@Component
public class Bootstrap implements CommandLineRunner {

    @Autowired
    OrderHeaderRepository orderHeaderRepository;

    @Autowired
    BootstrapOrderService bootstrapOrderService;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    ProductService productService;
    private void updateProduct(){
        Product product = new Product();
        product.setDescription("My Product");
        product.setProductStatus(ProductStatus.NEW);

        Product savedProduct = productService.saveProduct(product);

        Product savedProduct2 = productService.updateQOH(savedProduct.getId(), 25);

        System.out.println("Updated Qty: " + savedProduct2.getQuantityOnHand());
    }

    @Override
    public void run(String... args) throws Exception {

        updateProduct();

        bootstrapOrderService.readOrderData();

        Customer customer = new Customer();
        customer.setCustomerName("Testing Version");
        Customer savedCustomer = customerRepository.save(customer);
        System.out.println("Version is: " + savedCustomer.getVersion());

        savedCustomer.setCustomerName("Testing Version 2");
        Customer savedCustomer2 = customerRepository.save(savedCustomer);
        System.out.println("Version is: " + savedCustomer2.getVersion());

        savedCustomer2.setCustomerName("Testing Version 3");
        Customer savedCustomer3 = customerRepository.save(savedCustomer2);
        System.out.println("Version is: " + savedCustomer3.getVersion());

        customerRepository.delete(savedCustomer3);
    }
}






