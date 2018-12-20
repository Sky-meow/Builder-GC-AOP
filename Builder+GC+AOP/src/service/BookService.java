package service;

public class BookService implements Service{
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("I am BookService");
    }

    @Override
    public String toString() {
        return "BookService{" +
                "name='" + name + '\'' +
                '}';
    }
}
