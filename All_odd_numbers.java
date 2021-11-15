import java.util.Scanner;
public class All_odd_numbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        for (int i = 1; i <= num; i = i + 1 ){
            if (i%2 != 0){
                System.out.print(i+" ");
            }
        }
    }
}
