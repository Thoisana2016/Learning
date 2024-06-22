package object;

public class ObjectTesting {
    public int x;
    public int y;

    public void sum(int a, int b){
        int res = a + b;
        System.out.println("Sum is "+res);
    }

    public void multiply(){
        int res = x * y;
        System.out.println("Product is "+res);
    }
}