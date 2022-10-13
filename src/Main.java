import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Task 1");
        task1();
        System.out.println(" Task 2");
        task2();
        System.out.println(" Task 3");
        task3();

    }
    public static void task1(){
        int[] firstArr = new int[] {1, 2, 3};
        double[] secondArr = {1.57, 7.654, 9.986};
        int[] thirdArr = new int[] {1,400349, 324};
        System.out.println(Arrays.toString(firstArr));
        System.out.println(Arrays.toString(secondArr));
        System.out.println(Arrays.toString(thirdArr));
        }
    public static void task2() {
        int[] firstArr = new int[]{1, 2, 3};
        for (int i = 2; i > -1; i--) {
            System.out.print(firstArr[i] + " ");
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] secondArr = {1.57, 7.654, 9.986};
        for (int i = 2; i > -1; i--) {
            System.out.print(secondArr[i] + " ");
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] thirdArr = new int[]{1, 400349, 324};
        for (int i = 2; i > -1; i--) {
            System.out.print(thirdArr[i] + " ");
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task3() {
        int[] firstArr = new int[] {1, 2, 3};
        for (int i = 0; i < firstArr.length; i++){
            if (firstArr[i] % 2 != 0) {
                firstArr[i]++;
            }
        }
        System.out.println(Arrays.toString(firstArr));
    }
}