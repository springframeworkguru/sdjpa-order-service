package guru.springframework.orderservice.domain;

import jakarta.persistence.Entity;

/**
 * Created by jt on 5/21/22.
 */
@Entity
public class OrderApproval extends BaseEntity {

    private String approvedBy;

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }
}
