package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        System.out.println("----------Afficher l ensemble des elements du tableau grace a une boucle--------");
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("----------Afficher l ensemble des elements dans un ordre inverse du tableau ---------");
        for(int i = 0; i < array.length / 2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("tableau inversé");
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }

        System.out.println("----------Combiner une boucle et un test de manière a afficher que les entiers supérieurs a 3  ---------");
    }
}
