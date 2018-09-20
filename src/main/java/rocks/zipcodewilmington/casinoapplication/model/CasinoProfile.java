package rocks.zipcodewilmington.casinoapplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author leon on 9/1/18.
 */
@Entity
public class CasinoProfile {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Double balance;

    public CasinoProfile(Long id, String name, Double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
