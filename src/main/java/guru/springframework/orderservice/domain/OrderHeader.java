package guru.springframework.orderservice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by jt on 12/5/21.
 */
@Entity
public class OrderHeader extends BaseEntity{

    private String customer;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderHeader)) return false;
        if (!super.equals(o)) return false;

        OrderHeader that = (OrderHeader) o;

        return getCustomer() != null ? getCustomer().equals(that.getCustomer()) : that.getCustomer() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getCustomer() != null ? getCustomer().hashCode() : 0);
        return result;
    }
}
