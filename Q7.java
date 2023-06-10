import java.util.Scanner;

class InvalidDOBException extends Exception

{
    public InvalidDOBException(String s) {

        super(s);
    }

}

public class Q7

{

    static void DOB(int y) throws InvalidDOBException

    {

        if (y + 18 > 2023)

        {

            throw new InvalidDOBException("Parent/Gaurdian required for creating bank account as you are minor");

        }

        else

        {

            System.out.println("Creating bank account...");

        }

    }

    public static void main(String args[])

    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year of birth: ");

        int a = sc.nextInt();

        try

        {

            DOB(a);

        }

        catch (InvalidDOBException e)

        {

            System.out.println(e);

        }

        sc.close();

    }

}