import java.util.Arrays;

public class ExceptionDemo1 {

    String name="raj";
    void f1(){
        System.out.println("Before Exception");
        try {
            String upperCaseName=name.toUpperCase();
        }

        catch (NullPointerException npe){
            System.out.println(npe);
        }

        System.out.println("After Exception");
    }

    public static void main(String[] args) {

        ExceptionDemo1 obj=new ExceptionDemo1();
        obj.f1();

    }
}
