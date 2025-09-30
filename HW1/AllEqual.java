import java.util.Scanner;
public class AllEqual {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int x = scanner.nextInt();
       int y = scanner.nextInt();
       int z = scanner.nextInt();
       if(x==y&&y==z){
         System.out.println("Equal");
       }
       else System.out.println("Not Equal");
       scanner.close();
    }

}