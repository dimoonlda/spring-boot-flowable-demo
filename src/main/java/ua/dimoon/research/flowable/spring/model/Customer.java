package ua.dimoon.research.flowable.spring.model;

import javax.persistence.*;

@Entity
@Table(name = "customers", schema = "schema2")
public class Customer {
    @Id
    @GeneratedValue(generator = "customer_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "customer_gen", allocationSize = 1, schema = "schema2", sequenceName = "customer_id_seq")
    private Long id;
    private String tittle;
    @Column(name = "identity_code")
    private String identityCode;
    @Column(name = "boss_name")
    private String bossName;

    public Long getId() {
        return id;
    }

    public Customer setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTittle() {
        return tittle;
    }

    public Customer setTittle(String tittle) {
        this.tittle = tittle;
        return this;
    }

    public String getIdentityCode() {
        return identityCode;
    }

    public Customer setIdentityCode(String identityCode) {
        this.identityCode = identityCode;
        return this;
    }

    public String getBossName() {
        return bossName;
    }

    public Customer setBossName(String bossName) {
        this.bossName = bossName;
        return this;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", identityCode='" + identityCode + '\'' +
                ", bossName='" + bossName + '\'' +
                '}';
    }
}
