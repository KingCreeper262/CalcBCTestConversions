import java.util.Scanner;

public class source {
    public static void main(String[] args) {
        boolean loop = true;
        while(loop == true) {
            @SuppressWarnings("resource")
            Scanner myObj = new Scanner(System.in);
            System.out.print("Please type the score of the paper.");
            String output = myObj.nextLine();
            try {
                int number = Integer.valueOf(output);
                if(number < 5.5) {
                    System.out.println("Whoever got this has less than a 50. Please tell them to study more.");
                } else if(number < 6.5) {
                    System.out.println("50");
                } else if(number < 7.5) {
                    System.out.println("53");
                } else if (number < 8.5) {
                    System.out.println("55");
                } else if (number < 9.5) {
                    System.out.println("57");
                } else if (number < 10.5) {
                    System.out.println("59");
                } else if (number < 11.5) {
                    System.out.println("60");
                } else if (number < 12.5) {
                    System.out.println("63");
                } else if (number < 13.5) {
                    System.out.println("65");
                } else if (number < 14.5) {
                    System.out.println("67");
                } else if (number < 15.5) {
                    System.out.println("69");
                } else if (number < 16.5) {
                    System.out.println("70");
                } else if (number < 17.5) {
                    System.out.println("73");
                } else if (number < 18.5) {
                    System.out.println("75");
                } else if (number < 19.5) {
                    System.out.println("77");
                } else if (number < 20.5) {
                    System.out.println("79");
                } else if (number < 21.5) {
                    System.out.println("80");
                } else if (number < 22.5) {
                    System.out.println("83");
                } else if (number < 23.5) {
                    System.out.println("85");
                } else if (number < 24.5) {
                    System.out.println("87");
                } else if (number < 25.5) {
                    System.out.println("89");
                } else if (number < 26.5) {
                    System.out.println("90");
                } else if (number < 27.5) {
                    System.out.println("91");
                } else if (number < 28.5) {
                    System.out.println("92");
                } else if (number < 29.5) {
                    System.out.println("93");
                } else if (number < 30.5) {
                    System.out.println("94");
                } else if (number < 31.5) {
                    System.out.println("95");
                } else if (number < 32.5) {
                    System.out.println("96");
                } else if (number < 33.5) {
                    System.out.println("97");
                } else if (number < 34.5) {
                    System.out.println("98");
                } else if (number < 35.5) {
                    System.out.println("99");
                } else {
                    System.out.println("100... Congrats a perfect score.");
                }
                System.out.println();
            } catch (NumberFormatException e) {
                System.out.println("Invalid input please try again.");
            }
        }
    }
}
