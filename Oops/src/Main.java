import object.AnonymousConstructor;
import object.ConstructInit;
import object.CopyConstructor;
import object.ObjectTesting;

public class Main {
    public static void main(String[] args) {

        ObjectTesting obj1 = new ObjectTesting();
        obj1.sum(3, 5);
        obj1.x =10;
        obj1.y = 23;
        obj1.multiply();


        ConstructInit cons1 = new ConstructInit();
//        System.out.println("id "+cons1.id);
//        System.out.println("name "+cons1.name);


        ConstructInit cons2 = new ConstructInit(3, "Virat");
        System.out.println("id "+cons2.id);
        System.out.println("name "+cons2.name);


        ConstructInit cons3 = new ConstructInit("Suvidh");
        System.out.println("id "+cons3.id);
        System.out.println("name "+cons3.name);


        //AnonymousConstructor a = new AnonymousConstructor();
        new AnonymousConstructor().substraction(5, 2);


        //Copy Constructor
        CopyConstructor cp = new CopyConstructor(12, "John");

        CopyConstructor cp1 = new CopyConstructor(cp); //copy constructor through object
        System.out.println("Id  : "+cp1.id);
        System.out.println("Name : "+cp1.name);

    }
}
