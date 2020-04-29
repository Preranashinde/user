package com.bridgelabz.loginform;

import model.User;
import service.UserService;
import service.UserServiceImpl;

import java.util.Scanner;

public class UserLoginInfo {
    private static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("press 1 for registration");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                addNewUser();
        }
    }
    private static void addNewUser() {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name");
        String lastName = scanner.nextLine();
        System.out.println("Enter your mobile number");
        String mobileNumber = scanner.nextLine();
        System.out.println("Enter your address");
        String address = scanner.nextLine();
        User user = new User(firstName,lastName,mobileNumber,address);*/
        userService.registerUser(null);
    }
}
