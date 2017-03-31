package ua.dimoon.research.flowable.spring.model.dto;

import java.io.Serializable;

public class DocumentResponseDto implements Serializable{
    private String number;
    private String owner;

    public String getNumber() {
        return number;
    }

    public DocumentResponseDto setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getOwner() {
        return owner;
    }

    public DocumentResponseDto setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    @Override
    public String toString() {
        return "DocumentResponseDto{" +
                "number='" + number + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
