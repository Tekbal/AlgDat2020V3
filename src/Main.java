public class Main {
    public static void main(String[] args) {

        int[] vals={16,3,8,19,22,7,26};

        int maxVal =findmax(vals);
        int minVal= findMin(vals);
        System.out.println("Maksimum deger :" +maxVal);
        System.out.println("Minumum deger:" +minVal);

    }

    public static int findmax (int[] vals) {
        int maksVerdi = vals[0];

        for (int i = 1; i <vals.length ; i++) {

            int verdi=vals[i];
            if (verdi>maksVerdi){
                maksVerdi=verdi;
            }

        }
        return maksVerdi;
    }

    public static int findMin (int[] vals){
        int minVerdi= vals[0];

        for (int i = 1 ; i < vals.length; i++){

            int verdi2 = vals[i];
            if (verdi2<minVerdi){
                verdi2=minVerdi;
            }

        }

        return  minVerdi;
    }


}



