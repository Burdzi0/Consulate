package software.design.consulate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Charge {

    @Id
    @GeneratedValue
    private Long id;

    private double value;

    @Column(length = 10)
    private String currency;

    private Date paymentTime;

    private Boolean paid;

    public Charge() {
    }

    public Charge(double value, String currency, Date paymentTime, Boolean paid) {
        this.value = value;
        this.currency = currency;
        this.paymentTime = paymentTime;
        this.paid = paid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }
}
