package guru.springframework.orderservice.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

/**
 * Created by jt on 5/21/22.
 */
@Entity
public class OrderApproval extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "order_header_id")
    private OrderHeader orderHeader;
    private String approvedBy;

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public OrderHeader getOrderHeader() {
        return orderHeader;
    }

    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }
}
