package ua.dimoon.research.flowable.spring.model.dto;

public class TaskDto {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public TaskDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public TaskDto setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "TaskDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
