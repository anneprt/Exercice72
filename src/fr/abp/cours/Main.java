package fr.abp.cours;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s1 = "";
        String plusGrande;
        String plusPetite;


        System.out.println("Entrez  un mot au clavier");
        Scanner lectureClavier = new Scanner(System.in);
        s1 = lectureClavier.next();
        plusGrande = s1;
        plusPetite = s1;

        do {
            if (s1.compareTo(plusGrande) < 0) {
                plusGrande = s1;
            }
            if (s1.compareTo(plusPetite) > 0) {
                plusPetite = s1;
            }

            System.out.print("Entrer un mot (FIN pour sortir) :");
            s1 = lectureClavier.next();
        } while (!s1.equalsIgnoreCase("FIN"));

        System.out.println("Le plus petit mot est: " + plusPetite);
        System.out.println("Le plus grand mot est:" + plusGrande);


    }
}
