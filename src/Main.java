public class Main {
    public static void main(String[] args) {
        int total_result=gather(321321,32232);
        System.out.println(total_result);
        int subtraction_result=subtract(523,2);
        System.out.println(subtraction_result);
        int multiplication_result=multiply(53,10);
        System.out.println(multiplication_result);
        int section_result=divide(420,10);
        System.out.println(section_result);
        int plural_sum_result=collect_plural(5,34,23,86,11,980);
        System.out.println("sum of numbers="+plural_sum_result);
    }
public static int collect_plural(int... numbers){
        int total=0;
        for (int number:numbers){
            total=number+total;
        }
        return total;
}

    public static int gather(int number1,int number2){
        return number1+number2;
    }
    public static int subtract(int number3,int number4){
        return number3-number4;
    }
    public static int multiply(int number5,int number6){
        return number5*number6;
    }
    public static int divide(int number7,int number8){
        return number7/number8;
    }
}