package object;

public class ConstructInit {

    public int id;
    public String name;

    public ConstructInit(){ //default constructor
        System.out.println("Hi I'm the Default Constructor.");
    }
    public ConstructInit(int id, String name){ //parametrized constructor
        this.name = name;
        this.id = id;
    }

    public ConstructInit(String name){
        this.name = name;
        this.id = 123;
    }
}
