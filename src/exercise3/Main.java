package exercise3;

public class Main {
    public static void main(String[] args) {

        int numberOfArrayElements= 100;
        int startOfRangeOfArray = 1;
        int finishOfRangeOfArray = 100;
        int multipleNumber = 3;

        int[]arr = Util.createMass(numberOfArrayElements, startOfRangeOfArray,finishOfRangeOfArray);
        Util.printElementsMultiples(arr,multipleNumber);
    }
}
