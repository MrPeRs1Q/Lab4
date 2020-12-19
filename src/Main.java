import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Author A = new Author("Aram","aramkenny97@gmail.com",'M');
        System.out.println("E-mail: " + A.getEmail());
        System.out.println("Name: " + A.getName());
        System.out.println("Gender: " + A.getGender());
        System.out.println(A.toString());
    }
}
