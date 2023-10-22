public class Main {
    public static void main(String[] args) {

        int[] vals = {16, 3, 8, 19, 22, 7, 26};
        int[] a = {9, 3, 2, 7, 4};
        int[] b = {2,3,4,7,9};

        int maxVal = findmax(vals);
        int minVal = findMin(vals);
        int hvilkeIndex1= usortetSok(a, 7);
        int hvilkeIndex2= sortedSok(b, 9);
        System.out.println("Maksimum deger :" + maxVal);
        System.out.println("Minumum deger:" + minVal);
        System.out.println("Aranan degerin indeksi: " + hvilkeIndex1);
        System.out.println("Aranan degerin indeksi: " +hvilkeIndex2);

    }

    public static int findmax(int[] vals) {
        int maksVerdi = vals[0];

        for (int i = 1; i < vals.length; i++) {

            int verdi = vals[i];
            if (verdi > maksVerdi) {
                maksVerdi = verdi;
            }

        }
        return maksVerdi;
    }

    public static int findMin(int[] vals) {
        int minVerdi = vals[0];

        for (int i = 1; i < vals.length; i++) {

            int verdi2 = vals[i];
            if (verdi2 < minVerdi) {
                verdi2 = minVerdi;
            }

        }

        return minVerdi;
    }


    public static int usortetSok(int[] a, int deger) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == deger) {
                return i;

            }

        }
        return -1;
    }


    public static int sortedSok(int[] b, int deger) {

        for (int i = 0; i < b.length; i++) {
            if (b[i] == deger) {
                return i;
            }

        }
        return -1;
    }


}



