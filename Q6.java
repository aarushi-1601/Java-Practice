import java.io.*;

import java.util.*;

class VoterAgeException extends Exception {

public VoterAgeException() {

System.out.println("Voter is not old enough to be registered for ID");

}

}

public class Q6 {

public static void main(String[] args) {

try {

Scanner sc = new Scanner(System.in);

System.out.println("Enter age of voter for ID registration: ");
int age = sc.nextInt();

if (age < 18) {

throw new VoterAgeException();

}


else if (age >= 18) {

System.out.println("\nVoter is old enough to be registered for ID.");
}

}

catch (VoterAgeException e) {

System.out.println("\nException Caught");

}

}

}
