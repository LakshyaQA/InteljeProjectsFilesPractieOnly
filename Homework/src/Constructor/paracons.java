package Constructor;

public class paracons {
    int a;
     paracons(int a)  //datatype int  a,ParametricConstructor
    {
        this.a = a;

    }

    void type() {

    }

    public static void main(String[] args)
    {
        paracons show;  //object created
        show = new paracons(10 );
        system.out.println("type.a");
    }
}
