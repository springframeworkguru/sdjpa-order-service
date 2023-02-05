package guru.springframework.orderservice.bootstrap;

import guru.springframework.orderservice.domain.OrderHeader;
import guru.springframework.orderservice.repositories.OrderHeaderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BootstrapOrderService {

    @Autowired
    OrderHeaderRepository orderHeaderRepository;


    @Transactional
    public void readOrderData()
    {
        OrderHeader orderHeader = orderHeaderRepository.findById(1l).get();
        orderHeader.getOrderLines().forEach(ol -> {
            System.out.println("Product: " + ol.getProduct().getDescription());

            ol.getProduct().getCategories().forEach(cat -> {
                System.out.println("Category: " + cat.getDescription());
            });
        });

    }
}
