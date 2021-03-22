import java.util.*;

public class MySweetProgram {
    
    public static void main(String[] args) {
        
        System.out.println("Enter your name");
        
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = new String("hey"); //invoking the constructor

        int x = 5;
        float d = 5.5f;

        if (s.equals("Caleb")) {
            System.out.println("Hey Caleb");

        } 
        else if(s.equals("Sally")) {
            System.out.println("Hey Sally");

        }
        else {
            System.out.println("You're not welcome here");

        }

        int i = 0;
        while(i < 10) {
            System.out.println("i is: " + i);
            i++;

        }

        for(int j = 0; j < 10; j++) {
            System.out.println("j is: " + j);
        }

        System.out.println(s);
        in.close();


        //test


    }







}
