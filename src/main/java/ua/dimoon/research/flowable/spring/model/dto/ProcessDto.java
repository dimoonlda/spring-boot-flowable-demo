package ua.dimoon.research.flowable.spring.model.dto;

public class ProcessDto {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public ProcessDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProcessDto setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "ProcessDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
