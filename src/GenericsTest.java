public class GenericsTest {
    public static void main(String[] args) {
        int[] a = {1,8,9,18,98,2,3,9};
        char[] b = {'A','C','K','L','Z','Y','M'};

        System.out.println("Maks av int-array:");
        System.out.println(maks(a));

        System.out.println("Maks av char-array:");
        System.out.println(maks(b));


    }

    static int maks (int[] values){
        int currentMax= values[0];
        int currentIndex = 0;

        for (int i = 1; i <values.length ; i++) {
            if (values[i] > currentMax){
                currentMax= values[i];
                currentIndex=i;
            }

        }
        return currentIndex;
    }

    static int maks (char[] values){
        int currentMax= values[0];
        int currentIndex = 0;

        for (int i = 1; i <values.length ; i++) {
            if (values[i] > currentMax){
                currentMax= values[i];
                currentIndex=i;
            }

        }
        return currentIndex;
    }
}
