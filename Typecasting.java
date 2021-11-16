public class Typecasting {
    public static void main(String args[]){
        //Widening Casting
        short i = 12;
        int num_1 = i;
        System.out.println(i);
        System.out.println(num_1);

        //Narrowing Casting
        int j = 12;
        short num_2 = (short) i;
        System.out.println(j);
        System.out.println(num_2);
    }
}
