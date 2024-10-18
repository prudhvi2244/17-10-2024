import java.util.Scanner;

public class Client {

    private static void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your details");
        String details = sc.nextLine();
        String[] splitDetails=details.split(":");

        String name=splitDetails[0];
        int age=Integer.parseInt(splitDetails[1]);
        String gender=splitDetails[2];

        if(age<18)
            System.out.println("Your age is less than 18 so code cannot be generated");

        if(!gender.equals("Male") && !gender.equals("Female"))
            System.out.println("There is no such gender");

        if(age>=18 && (gender.equals("Male")||gender.equals("Female"))){
            String first3Letters=name.substring(0,3);
            StringBuilder passcode=new StringBuilder(first3Letters).reverse()
                    .append(age).append(gender.substring(0,1).toLowerCase()).append(name.length());
            System.out.println(passcode);

        }


    }

    public static void main(String[] args) {
        Client.display();
    }
}
