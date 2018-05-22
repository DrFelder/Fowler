import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class FowlerTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void out() {
        System.setOut(new PrintStream(outContent));
        Program.main(null);
        assertEquals(
                "Welcome to the Movie Store\n" +
                "Let's get the Statement\n" +
                "Rental Record for joe\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tmovie1\t\t10\t30.0\n" +
                "\tmovie2\t\t5\t4.5\n" +
                "Amount owed is 34.5\n" +
                "You earned 3 frequent renter points\n",
                outContent.toString());
    }

    @Test
    public void TestAmountForRegular() {
        Movie twoThousandAndOne = new Movie("2001: A Space Odyssey", 0);
        Rental rentalTwoThousandAndOne = new Rental(twoThousandAndOne, 10);
        Customer john = new Customer("John Doe");
        john.addRental(rentalTwoThousandAndOne);

        //assertEquals(0, rentalTwoThousandAndOne.amountFor(rentalTwoThousandAndOne));
    }

    @Test
    public void TestAmountForNewRelease() {
        Movie twoThousandAndOne = new Movie("2001: A Space Odyssey", 1);
        Rental rentalTwoThousandAndOne = new Rental(twoThousandAndOne, 10);
        Customer john = new Customer("John Doe");
        john.addRental(rentalTwoThousandAndOne);

        //assertEquals(0, rentalTwoThousandAndOne.amountFor(rentalTwoThousandAndOne));
    }

    @Test
    public void TestAmountForChildrens() {
        Movie twoThousandAndOne = new Movie("2001: A Space Odyssey", 2);
        Rental rentalTwoThousandAndOne = new Rental(twoThousandAndOne, 10);
        Customer john = new Customer("John Doe");
        john.addRental(rentalTwoThousandAndOne);

        //assertEquals(0, rentalTwoThousandAndOne.amountFor(rentalTwoThousandAndOne));
    }

}