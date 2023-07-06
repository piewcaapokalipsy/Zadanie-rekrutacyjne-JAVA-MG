package javaZadanieRekrutacyjne;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleApp {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> changes = new ArrayList<>();
            while (true) {
                System.out.print("Podaj wartość reszty do wydania (w zł), lub wpisz 'wynik' aby zakończyć: ");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("done")) {
                    break; // wyjdz z pętli kiedy  'wynik' zostało wpisane
                } 
                input = input.trim();//usuwa niepotrzebne spacje
                input = input.replace(',', '.');// Zamień przecinek na kropkę. Kropka to domyślny separator dziesiętny
                input = input.replaceAll("[^\\d.]", "");// Usuń wszystkie znaki niebędące cyframi ani kropką
                int change;
                try {
                    change = (int) (Float.parseFloat(input) * 100);// Konwertuj ciąg wejściowy na wartość groszy
                } catch (NumberFormatException e) {
                    System.out.println("Nieprawidłowe dane. Podaj poprawną liczbę.");
                    continue; // Przejdź do kolejnej iteracji
                }

                changes.add(change);
            }

            CashRegister kasa = new CashRegister();

            for (int change : changes) {
                kasa.giveChange(change);
            }
        }
    }
}
