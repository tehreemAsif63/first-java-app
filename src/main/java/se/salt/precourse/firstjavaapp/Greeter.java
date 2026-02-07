package se.salt.precourse.firstjavaapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Greeter {
  private static String greet(String namePassedIn) {
    return "Welcome to SALT, " + namePassedIn;
  }

  private static String dateCalculate(String datePassedIn) {
    LocalDate courseStart = LocalDate.parse(datePassedIn);
    LocalDate today = LocalDate.now();
    long daysLeft = ChronoUnit.DAYS.between(today, courseStart);

    return "Today it is " + daysLeft + " days left until the course starts";
  }

  public static void main(String[] args) throws IOException {
    System.out.print("What is your name? ");

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();
    String greeting = greet(name);

    System.out.print("When does that course start?");
    String date = reader.readLine();
    String daysLeft = dateCalculate(date);

    System.out.println(greeting);
    System.out.println(daysLeft);

  }
}
