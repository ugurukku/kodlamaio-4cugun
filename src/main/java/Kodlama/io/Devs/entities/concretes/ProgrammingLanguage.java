package Kodlama.io.Devs.entities.concretes;

public class ProgrammingLanguage {

    Integer id;

    String name;

    public ProgrammingLanguage(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProgrammingLanguage() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
