package ua.dimoon.research.flowable.spring.model.dto;

import java.io.Serializable;

public class CustomerResponseDto implements Serializable{
    private String tittle;
    private String identityCode;
    private String bossName;

    public String getTittle() {
        return tittle;
    }

    public CustomerResponseDto setTittle(String tittle) {
        this.tittle = tittle;
        return this;
    }

    public String getIdentityCode() {
        return identityCode;
    }

    public CustomerResponseDto setIdentityCode(String identityCode) {
        this.identityCode = identityCode;
        return this;
    }

    public String getBossName() {
        return bossName;
    }

    public CustomerResponseDto setBossName(String bossName) {
        this.bossName = bossName;
        return this;
    }

    @Override
    public String toString() {
        return "CustomerResponseDto{" +
                "tittle='" + tittle + '\'' +
                ", identityCode='" + identityCode + '\'' +
                ", bossName='" + bossName + '\'' +
                '}';
    }
}
