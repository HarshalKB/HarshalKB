import java.util.Scanner;
public class Greatest_Number{
    public static void main(String arhs[]){
        Scanner sc = new Scanner(System.in);
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        int num_3 = sc.nextInt();
        if (num_1 > num_2 && num_1 > num_3){
            System.out.print(num_1);
        } else if (num_2 > num_1 && num_2 > num_3){
            System.out.print(num_2);
        } else {
            System.out.print(num_3);
        }
    }
}