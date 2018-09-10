

import java.util.Random;

public class ProDiffKard {
    public static void main(String[] args) {
        Random random = new Random();

        String n[] = {"1 of hearts", "2 of hearts", "3 of hearts", "4 of hearts", "5 of hearts", "6 of hearts", "7 of hearts", "8 of hearts", "9 of hearts", "10 of hearts", "1 of spades", "2 of spades", "3 of spades", "4  of spades", "5 of spades", "6 of spades", "7 of spades", "8 of spades", "9  of spades", "10 of spades", "1 of clubs", "2 of clubs", "3 of clubs", "4 of clubs", "5 of clubs", "6 of clubs", "7 of clubs", "8 of clubs", "9 of clubs", "10 of clubs",
                "1 of diamonds", "2 of diamonds", "3 of diamonds", "4 of diamonds", "5 of diamonds", "6 of diamonds", "7 of diamonds", "8 of diamonds", "9 of diamonds", "10 of diamonds", "jack of diamonds", "queen of diamonds", "king of diamonds", "ace of diamonds", "jack of hearts", "queen of hearts", "king of hearts", "ace of hearts", "jack of spades", "queen of spades", "king of spades", "ace of spades", "jack of clubs", "queen of clubs", "king of clubs", "ace of clubs"};
        System.out.println("Изначально колода выглядила так: ");
        System.out.println();
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i] + "\t");
        }
        System.out.println();
        String mix[] = new String[];
        for (int b = n.length - 1; b > 0; b--) {
            int s = random.nextInt(b + 1);
            String a = mix[s];
            mix[s] = mix[b];
            System.out.println(mix[b]);
        }
    }
}
