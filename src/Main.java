public class Main {
    public static void main(String[] args) {

        int[] vals={16,3,8,19,22,7,26};

        int maxVal =findmax(vals);
        System.out.println("Maksumum deger :" +maxVal);

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


}



