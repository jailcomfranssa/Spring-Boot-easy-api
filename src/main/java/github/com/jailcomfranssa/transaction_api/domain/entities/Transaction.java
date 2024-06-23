package github.com.jailcomfranssa.transaction_api.domain.entities;

import jakarta.persistence.*;


import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID transactionId;

    private Integer total;
    private LocalDateTime createdAt;
    private String cardNumber;
    private String ccv;
    private String owner;
    private String ein;

    public Transaction() {
    }

    public Transaction(UUID transactionId, Integer total, LocalDateTime createdAt, String cardNumber, String ccv, String owner, String ein) {
        this.transactionId = transactionId;
        this.total = total;
        this.createdAt = createdAt;
        this.cardNumber = cardNumber;
        this.ccv = ccv;
        this.owner = owner;
        this.ein = ein;
    }

    public UUID getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(UUID transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCcv() {
        return ccv;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }
}
