package com.greatlearning.service;

import com.greatlearning.model.Employee;

import java.util.Random;

public class CredentialsService {
    public char[] generatePassword(){
        String capitalLetters = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String smallLetters = "qwertyuiopasdfghjklzxcvbnm";
        String numbers = "0123456789";
        String specialCharacters = "~!@#$%^&*().";

        final String finalStr = capitalLetters + smallLetters + numbers + specialCharacters;

        Random random = new Random();

        char []password = new char[8];
        for (int i =0; i < 8; i++){
            password[i] = finalStr.charAt(random.nextInt(finalStr.length()));
        }

        return password;
    }

   public String generateEmailAddress(String firstName, String lastName, String Department){
        return firstName + lastName + "@" + Department + ".abc.com";
   }

    public void showCredentials(Employee emp, String email, char[] password){
        System.out.println("Dear " + emp.getFirstName() + "your generated credentials are as follows");
        System.out.println("Email => " + email);
        System.out.println("Password => " + password);
    }
}
