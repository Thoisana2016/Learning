package object;

public class CopyConstructor {
    public int id;
    public String name;

    public CopyConstructor(int x, String str){
        this.id = x;
        this.name = str;
    }

    public CopyConstructor(CopyConstructor cp){
        this.name = cp.name;
        this.id = cp.id;
    }
}
