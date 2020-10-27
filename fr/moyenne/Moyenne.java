package fr.moyenne;

import java.util.Scanner;

public class Moyenne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float note1, note2;
        System.out.println("Bienvenue dans le palas");
        System.out.println("Entrez la 1ere note : ");
        note1 = sc.nextFloat();
        System.out.println("Entrez la 2eme note : ");
        note2 = sc.nextFloat();
        sc.nextLine();
        System.out.println("La moyenne calcule est : "+ (note1+note2)/2);

    }
}
