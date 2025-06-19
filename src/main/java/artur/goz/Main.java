package artur.goz;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        start();
    }


    private static void start(){
        Scanner in = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Input: ");
                String input = in.nextLine();
                WatchController.controlMessages(input);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }


}