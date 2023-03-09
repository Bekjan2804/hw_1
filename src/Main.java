public class Main {
    public static void main(String[] args) {
        String geeksAndroid;
        int NUM = 15;
        String word = "lesson 1";
        geeksAndroid = NUM + word;
        System.out.println(geeksAndroid);
        if (NUM<0){
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM>0) {
            System.out.println("Вы сохранили положительное число");
        }else {
            System.out.println("Вы сохранили 0");
        }

    }
}