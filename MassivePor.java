/*
 Напишите программу, которая печатает массив сначала в обычном порядке, затем в обратном.
 */
 
public class MassivePor {
    public static void main(String[] args) {
//        int massive[] = new int [list.length];
//        for (int i = 0; i < massive.length; i++) {
//            System.out.println(massive[i] + " ");
//        }
//
//        System.out.println(" ");
//        for (int i = 5, j = massive.length - 1; i < massive.length; i++, j--) {
//            massive[j] = massive[i];
//            System.out.println(massive[j] + " ");
//        }
//    }
//}
        int mas[] = new int[10];
        for (int i = 0; i < 10; i++) {
            mas[i] = (int) (Math.random() * 10 + 1);
            System.out.println("Цифра " + i + " " + mas[i]);
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println("Значение " + i + " " + mas[i]);
        }
    }
}
