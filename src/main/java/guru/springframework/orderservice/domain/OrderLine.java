package guru.springframework.orderservice.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

/**
 * Created by jt on 12/14/21.
 */
@Entity
public class OrderLine extends BaseEntity {

    private Integer quantityOrdered;

    @ManyToOne
    private OrderHeader orderHeader;

    @ManyToOne
    private Product product;

    public Integer getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(Integer quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public OrderHeader getOrderHeader() {
        return orderHeader;
    }

    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderLine)) return false;
        if (!super.equals(o)) return false;

        OrderLine orderLine = (OrderLine) o;

        if (getQuantityOrdered() != null ? !getQuantityOrdered().equals(orderLine.getQuantityOrdered()) : orderLine.getQuantityOrdered() != null)
            return false;
        if (getOrderHeader() != null ? !getOrderHeader().equals(orderLine.getOrderHeader()) : orderLine.getOrderHeader() != null)
            return false;
        return getProduct() != null ? getProduct().equals(orderLine.getProduct()) : orderLine.getProduct() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getQuantityOrdered() != null ? getQuantityOrdered().hashCode() : 0);
        result = 31 * result + (getProduct() != null ? getProduct().hashCode() : 0);
        return result;
    }
}
