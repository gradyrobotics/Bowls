import java.sql.Array;
import java.util.Scanner;

/**
 * TODO COMMENT
 */
public class Main {
    /**
     * TODO COMMENT
     */
    public static void main(String[] args) {
        //TODO COMMENT
        Scanner in = new Scanner(System.in);
        //TODO COMMENT
        Bowl[] boleray = new Bowl[5];

        //TODO COMMENT
        for(int x = 1; x <= 5; x++) {
            //TODO COMMENT
        System.out.println("Bowl" + (x-1));
        //TODO COMMENT
        boleray[x - 1] = new Bowl(Double.parseDouble(in.nextLine()), in.nextLine(), in.nextLine());
        }

        //TODO COMMENT
        while(true) {
            //TODO COMMENT
            System.out.println("Price lookup, Which bowl?");
            //TODO COMMENT
            int bowlNumber = Integer.parseInt(in.nextLine());
            //TODO COMMENT
            System.out.println("Bowl " + bowlNumber + " Price: " + boleray[bowlNumber - 1].getPrice());
        }
    }
}