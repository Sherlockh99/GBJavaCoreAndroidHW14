import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,5,6};
        int[] arr2 = newArrayAfterLastNumber(arr,3);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {1,1,4,1,1,4,4,1};
        int[] arr4 = {1,1,3,1,1,3,3,1};
        int[] arr5 = {1,1,3,1,1,4,5,1};
        System.out.println(checkArray(arr3,1,4));
        System.out.println(checkArray(arr4,1,4));
        System.out.println(checkArray(arr5,1,5));
    }

    public static int[] newArrayAfterLastNumber(int[] array, int lastFindNumber){
        for (int i = array.length; i > 0; i--) {
            if(array[i-1]==lastFindNumber){
                return Arrays.copyOfRange(array, i-1, array.length);
            }
        }
        return null;
    }

    public static boolean checkArray(int[] array, int firstNumber, int secondNumber) {
        if(checkFirstLastNumbers(array, firstNumber, secondNumber)){
            return checkNumbers(array, firstNumber, secondNumber);
        }
        return false;
    }

    public static boolean checkFirstLastNumbers(int[] array, int firstNumber, int secondNumber) {
        if (array.length < 2) {
            return false;
        }
        if (firstNumber > secondNumber) {
            firstNumber += secondNumber;
            secondNumber = firstNumber - secondNumber;
            firstNumber = firstNumber - secondNumber;
        }
        int[] sortArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortArray);
        if (!(sortArray[0] == firstNumber && sortArray[sortArray.length - 1] == secondNumber)) {
            return false;
        }
        return true;
    }

    public static boolean checkNumbers(int[] array, int firstNumber, int lastNumber) {
        int[] sortArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortArray);
        for (int i = sortArray[1]; i < sortArray.length-1; i++) {
            if(!(sortArray[i]==firstNumber || sortArray[i]==lastNumber)){
                return false;
            }
        }
        return true;
    }
}
