import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

//    1. Написать метод, которому в качестве аргумента передается не пустой
//    одномерный целочисленный массив. Метод должен вернуть новый массив,
//    который получен путем вытаскивания из исходного массива элементов,
//    идущих после последней четверки. Входной массив должен содержать хотя бы
//    одну четверку, иначе в методе необходимо выбросить RuntimeException.
//    Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//    Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].

    public static int[] arrayTailAfter4(int[] array) {
        int startingСoordinate = 0;
        boolean ifFour = false;
        int[] arrayLast = new int[startingСoordinate];

        for (int i =0; i<array.length; i++) {
            if (array[i] == 4) {
                ifFour = true;
                startingСoordinate = i+1;
                arrayLast = new int[array.length - startingСoordinate];
                for (int j = 0; j < array.length - startingСoordinate; j++) {
                    if (array[startingСoordinate+j]<=array.length){
                        arrayLast[j] = array[startingСoordinate+j];
                    }
                }
            }
        }
            if (ifFour){
                System.out.println(Arrays.toString(arrayLast));
                return arrayLast;
            } else throw new RuntimeException(" no fours found ");
    }
//    2. Написать метод, который проверяет состав массива из чисел 1 и 4.
//    Если в нем нет хоть одной четверки или единицы, то метод вернет false;
//    Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//            [ 1 1 1 4 4 1 4 4 ] -> true
//            [ 1 1 1 1 1 1 ] -> false
//            [ 4 4 4 4 ] -> false
//            [ 1 4 4 1 1 4 3 ] -> false

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,4,1,3};
        int[] arr2 = {1,1,1,4,4,1,4,4};
        int[] arr3 = {1,1,1,1,1,1,1};
//        arrayTailAfter4(arr);
//        arrayCheck(arr2);
//        arrayCheck(arr3);

    }

    public static boolean arrayCheck(int[] arr){
        boolean one = false;
        boolean four = false;
        for (int i : arr) {
            if(arr[i] == 1){
                one = true;
            } else if(arr[i] == 4){
                four = true;
            }
        }
        if(one==true&&four==true){
            return true;
        } else return false;
    }
}
