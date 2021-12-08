package com.ngocquektqd;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*char a = 'A';
	    System.out.println("This is my first app");
        System.out.println("My name is Que");
        // System.out.println(a);

        hello
        hi
        This prints to the console

        int number = 124;
        double double1 = 123.435;
        String string1 = "ngocquektqd";
        System.out.println(number);
        System.out.println(double1);
        System.out.println(string1);
        Date date = new Date();
        String name = new String("my name is Drblue");
        int age = 20;
        System.out.println(name.length());
        System.out.print(name);
        System.out.println(name.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now.getYear());

        int a = 10;
        int b = 100;
        System.out.println("a = " + a+ " - b = "+b);
        Person alex = new Person("alex");
        Person mariam = alex;
        int zero = 0;
        int one = 1;
        double pi = 3.1415;
        int subscriberCountForDrblueChanel = 1000000;
        String name = new String("NgocQueKtqd");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
        String ktqd = new String("Ktqd");
        System.out.println(name.contains(ktqd));
        System.out.println(name.equals(ktqd));
        String name = "Que";
        String surname = "Le";
        System.out.println(name + " " + surname);
        String fullName = name + surname;
        System.out.println(fullName);
        String fullName2 = name.concat(" ").concat(surname);
        System.out.println(fullName2);
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        String s = new String();
        s = "alex";
        System.out.println(s);

        System.out.println(10 + 2);
        System.out.println(10 - 2);
        System.out.println(10 / 2);
        System.out.println(10 * 2);
        System.out.println(10 % 4);
        System.out.println(Math.abs(-125));
        System.out.println(Math.max(6,12));
        int a;

         */
//        int queAge = 28;
//        int chiAge = 26;
//        System.out.println(queAge < chiAge);
//        System.out.println(queAge > chiAge);
//        System.out.println(queAge >= chiAge);
//        System.out.println(queAge <= chiAge);
//        System.out.println(queAge == chiAge);
//        System.out.println(queAge != chiAge);
//        boolean isAdult = false;
//        boolean isStudent = true;
//        System.out.println(isAdult || isStudent);

//        String gender = "FEMALE";
//        if (gender.equals("FEMALE")){
//            System.out.println("I am a female");
//        }else if (gender.equals("MALE")){
//            System.out.println("I am a Male");
//        }else if (gender.equals("PREFER_NOT_SAY")){
//            System.out.println("Prefer not say");
//        }
        /*
        switch (gender){
            case "FEMALE":
                System.out.println("I am a Female");
                break;
            case  "MALE":
                System.out.println("I am a Male");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("Prefer not say");
                break;
            default:
        }
         */
        // Arrays
//        int zero = 0;
//        int one = 1;
//        int [] numbers1 = {1,5,3};
//        int [] numbers = new int [4];
//        numbers[0] = 0;
//        numbers[1] = 1;
//        numbers[2] = 2;
//        numbers[3] = 3;
//        int i;
//        for (i=0;i<=3;i++){
//            numbers[i] = i;
//        }
//        boolean[] booleans = new boolean[4];
//        String[] strings = {"Le Ngoc Que", "Pham Linh Chi"};
//
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(booleans));
//        System.out.println(Arrays.toString(numbers1));
//        System.out.println(numbers1.length);
//        System.out.println(Arrays.toString(strings));
//        System.out.println(strings.length);
//
//        int number = 0;
//        number++;
//        number +=5;
//        System.out.println(number);
//        int[] numbers = {1, 2, 5 , 7, 9, 12, 33, 66};
//        String[] names = {"Le Ngoc Que", "Pham Linh Chi"};

//        for (int i = 0; i<numbers.length;i++){
//            System.out.println("number of index " + i);
//            System.out.println(numbers[i]);
//        }
        // numbers.for
//        for (int i = 0; i < numbers.length; i++) {
//
//        }

//        System.out.println("Enhanced for loop");
//        for (int number : numbers){
//            System.out.println(number);
//        }
//        for (String name : names){
//            System.out.println(name);
//        }
//        Arrays.stream(numbers).forEach(System.out::println);
//        Arrays.stream(names).forEach(System.out::println);

//        String[] names = {"Linh Chi", "Le Ngoc Que", "Ong Vinh", "Ba Lien"};
//        for (String name : names) {
//            System.out.println(name);
//        }
//        for (String name : names) {
//            if (name.equals("Ong Vinh")){
//                break;
//            }
//            System.out.println(name);
//        }
//        for (String name : names) {
//            if (name.startsWith("L")){
//                continue;
//            }
//            System.out.println(name);
//        }
        //While Loop
//        while (true){
//            System.out.println("I Love my Wife");
//        }
//        int count = 0;
//        while (count <= 20){
//            System.out.println("count " + count);
//            count++;
//        }

//        do {
//            System.out.println("count " + count);
//            count++;
//        }
//        while (count<=20);
        // Scanner
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name? ");
//        String userName = scanner.nextLine();
//        System.out.println("Hello " + userName);
//
//        System.out.println("How old are you?");
//        int age = scanner.nextInt();
//        int year = LocalDateTime.now().minusYears(age).getYear();
//        System.out.println("You were born in " + year);
//
//        if (age < 18){
//            System.out.println("You are not an adult");
//        }else {
//            System.out.println("You are an adult");
//        }

        // Methods

//        System.out.println("Hello");
//        String brand = "samsung";
//        System.out.println(brand.toUpperCase());
//        System.out.println(brand.startsWith("s"));
//        System.out.println(brand.endsWith("g"));
//        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
////        countOccurrences();
//        int count = countOccurrences(letters,'A');
//        System.out.println(count);

        // Class and Object

//        Lens lensOne = new Lens("Sony", "85mm", true);
//        Lens lensTwo = new Lens("Canon", "82mm", true);
//        Lens lensThree = new Lens("Sony", "62mm", true);
//        Lens lensFour = new Lens("Canon", "64mm", true);
//
//        System.out.println("Lens One");
//        System.out.println(lensOne.brand);
//        System.out.println(lensOne.focalLength);
//        System.out.println(lensOne.isPrime);
//        System.out.println();
//
//        System.out.println("Lens Two");
//        System.out.println(lensTwo.brand);
//        System.out.println(lensTwo.focalLength);
//        System.out.println(lensTwo.isPrime);
//        System.out.println();
//
//        System.out.println("len Three");
//        System.out.println(lensThree.brand);
//        System.out.println(lensThree.focalLength);
//        System.out.println(lensThree.isPrime);
//        System.out.println();
//
//        System.out.println("Lens Four");
//        System.out.println(lensFour.brand);
//        System.out.println(lensFour.focalLength);
//        System.out.println(lensFour.isPrime);

        Passport ukPassport = new Passport("123456", "England",
                LocalDate.of(2025,1,1));
        Passport usaPassport = new Passport("1234563456", "USA",
                LocalDate.of(2025,1,1));

        System.out.println("UK Passpert");
        System.out.println(ukPassport.number);
        System.out.println(ukPassport.country);
        System.out.println(ukPassport.expiryDate);
    }

    static class Passport{
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number, String country, LocalDate expiryDate){
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }
}
