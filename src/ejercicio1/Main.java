package ejercicio1;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private static void exercise1() {
        print("Ejercicio 1");
        print("Ingrese un número enteros. Le diremos todos los números pares en ese rango");
        int range = scanner.nextInt();
        for (int i = 0; i <= range; i ++) {
            if (isEven(i)) {
                print(i);
            }
        }
    }

    private static void print(Object i) {
        System.out.println(i);
    }

    private static boolean isEven(int i) {
        return areEvenDivisible(i, 2);
    }

    private static boolean areEvenDivisible(int n, int m) {
        return n % m == 0;
    }

    private static void exercise2() {
        print("Ejercicio 2");
        print("Ingrese dos números n y m. Le diremos si son múltiplos");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        print(areEvenDivisible(n, m) ? "Son múltiplos" : "No son múltiplos");
    }

    private static void exercise3() {
        print("Ejercicio 3");
        print("Ingrese un número. Le diremos si es primo");
        int n = scanner.nextInt();

        print(isPrime(n) ? "Es primo" : "No es primo");
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        boolean isPrimo = true;
        int range = 2;
        while (range < n && isPrimo) {
            if (areEvenDivisible(n, range)) isPrimo = false;
            range ++;
        }
        return isPrimo;
    }

    private static void exercise4() {
        print("Ejercicio 4");
        print("Ingrese un número. Le diremos todos los números primos en ese rango");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i ++) {
            if (isPrime(i)) print(i);
        }
    }

    private static void exercise5() {
        print("Ejercicio 5");
        print("Ingrese tres números n, m y d. Le mostraremos los primeros n números naturales que tienen al menos m digitios d");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();

        int counter = 0;
        int number = 1;

        while (counter < n) {
            char[] chars = String.valueOf(number).toCharArray();
            char dChar = (char) (d+'0');
            int ocurrences = 0;

            for (char aChar : chars) {
                if (aChar == dChar) ocurrences++;
            }
            if (ocurrences >= m) {
                print(number);
                counter ++;
            }
            number ++;
        }
    }
}