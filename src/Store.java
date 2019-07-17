import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        String[] productName = {"Guitars", "Pianos", "Keyboards", "Trumpets", "Saxophones", "Drums", "Banjos", "Maracas", "Flutes", "Xylophones"};
        int[] price = {750, 250, 120, 160, 440, 550, 222, 360, 420, 668};
        int[] numberBought = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d. %s $%d \n", i + 1, productName[i], price[i]);
        }
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Please enter the ID number of the product you would like to purchase : ");
            int IDnumberBuy = scan.nextInt();

            System.out.printf("You chose product %d.\n" +
                    "How many %s would you like to buy?", IDnumberBuy, productName[IDnumberBuy]);
            int howManyBuy = scan.nextInt();
            System.out.printf("%s  %d x %d totals $%d \n"
                    , productName[IDnumberBuy], howManyBuy, price[IDnumberBuy], (howManyBuy * price[IDnumberBuy]));

            System.out.println("*************************************");
            System.out.print("Would you like to keep shopping? (Y/N)");
            answer = scan.next();
        }while(answer.equals("y"));

    }

}
