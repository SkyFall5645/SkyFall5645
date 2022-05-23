package Lession2;

public class HomeWorkApp2 {
    public static void main(String[] args) {

    }
    // Задание №1
    public static boolean inPeriod(int a, int b){

        return a+b >= 10 && a+b <= 20;
    }

    // Задание №2
    public static void isPositiveOrNegative(int num){
        if (num>=0){
            System.out.println("Positive");

        }
        else {
            System.out.println("Negative");
        }
    }
    // Задание №3
    public static boolean isNegative(int num){
        if (num >=0){
            return false;
        }
        else {
            return true;
        }
    }
    // Задание №4
    public static void printStringFewTimes(String word, int num) {
        for (int i = 0; i < num; i++){
            System.out.println(word);
        }
    }
}
