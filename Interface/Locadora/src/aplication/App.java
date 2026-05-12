package aplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

import entity.Rent;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Rent rent = null;

        try{
            System.out.println("Enter rental data:");
            System.out.print("Car model: ");
            String carModel = scn.nextLine();
            System.out.print("PickUp (dd/MM/aaaa HH:mm): ");
            String date = scn.nextLine();
            LocalDateTime pickup = LocalDateTime.parse(date, fmt);
            System.out.print("Restore (dd/MM/aaaa HH:mm): ");
            date = scn.nextLine();
            LocalDateTime restore = LocalDateTime.parse(date, fmt);
            System.out.print("Enter price per hour: ");
            Double pricePerHour = scn.nextDouble();
            scn.nextLine();
            System.out.print("Enter price per day: ");
            Double pricePerDay = scn.nextDouble();
            scn.nextLine();
            rent = new Rent(carModel, pickup, restore, pricePerHour, pricePerDay);
            System.out.println(rent.invois());
        }catch(InputMismatchException e){
            System.out.println("Erro:" + e.getMessage());
        }
    }
}
