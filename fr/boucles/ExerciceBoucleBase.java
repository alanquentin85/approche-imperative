package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {
        System.out.println("----------------Affichez tous les nombres de 1 a 10-----------------");
        int n = 10;

         for (int i = 1; i <= n; i++){
             System.out.println(i);
         }
        System.out.println("----------------Affichez 20 fois votre nom et votre prenom-----------------");
        n = 20;
        for (int i = 1; i <= n; i++){
            System.out.println("QUENTIN Alan");
        }
        System.out.println("----------------Affichez les elements pairs de 2 a 100-----------------");
        n = 100;
        System.out.println("Les nombres pairs de 1 a 100 sont: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("----------------Affichez les elements impair de 1 a 99-----------------");
        System.out.println("Les nombres impairs de 1 a 99 sont: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
              System.out.println(i);
            }
        }
    }
}
