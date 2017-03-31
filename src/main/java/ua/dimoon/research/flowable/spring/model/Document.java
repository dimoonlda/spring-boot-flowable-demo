package ua.dimoon.research.flowable.spring.model;

import javax.persistence.*;

@Table(name = "documents", schema = "schema3")
@Entity
public class Document {
    @Id
    @GeneratedValue(generator = "doc_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "doc_gen", schema = "schema3", sequenceName = "doc_id_gen", allocationSize = 1)
    private Long id;
    private String number;
    private String owner;

    public Long getId() {
        return id;
    }

    public Document setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public Document setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getOwner() {
        return owner;
    }

    public Document setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
