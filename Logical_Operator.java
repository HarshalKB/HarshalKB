public class Logical_Operator {
    public static void main(String args[]){
        //AND operator
        System.out.println((5 > 4) && (6 > 4));  //True
        System.out.println((5 < 4) && (6 < 4));  //False

        //OR operator
        System.out.println((5 > 4) || (6 < 4));  //True
        System.out.println((5 < 4) || (6 < 4));  //False

        //NOT operator
        System.out.println(!(5 > 4));  //False
        System.out.println(!(5 < 4));  //True
    }
}
