import java.util.Arrays;

public class GenericsAlgo {

        // Generic sıralama metodu
        public static <T extends Comparable<T>> void sortArray(T[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i].compareTo(array[j]) > 0) {
                        T temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                    System.out.println();
                }
            }
        }

        public static void main(String[] args) {
            // Integer dizisi üzerinde sıralama
            Integer[] intArray = {4, 2, 9, 6, 23, 12};
            System.out.println("Before sorting: " + Arrays.toString(intArray));
            sortArray(intArray);
            System.out.println("After sorting: " + Arrays.toString(intArray));

            // String dizisi üzerinde sıralama
            String[] stringArray = {"banana", "apple", "orange", "pear"};
            System.out.println("Before sorting: " + Arrays.toString(stringArray));
            sortArray(stringArray);
            System.out.println("After sorting: " + Arrays.toString(stringArray));
        }
    }

