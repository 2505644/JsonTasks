package task2;

import com.fasterxml.jackson.annotation.JsonGetter;

import java.util.List;

public class Employee {

    private int id;

    private String name;

    private List skills;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonGetter("competencies")
    public List getSkills() {
        return skills;
    }

    public void setSkills(List skills) {
        this.skills = skills;
    }
}
