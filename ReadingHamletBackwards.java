package FileExceptionDemo;

import RecursionPractice.Factorials.NegativeNumberException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.reverse;

public class ReadingHamletBackwards {
    public static void main(String[] args) {
        try {
            File file = new File("src/FileExceptionDemo/hamlet.txt");
            try (Scanner sc = new Scanner(file);) {
                //ArrayList<String> lines = new ArrayList<String>();
                while (sc.hasNextLine()) {
                    //lines.add(sc.nextLine());
                    reverse(0);
                    String data = sc.nextLine();
                    System.out.println(data);
                }
                sc.close();
//                for(int i = lines.size() - 1; i >= 0;i--){
//                    System.out.println(lines.get(i));
//                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("error " + e);
        }
    }
    public int rev(int n) throws FileNotFoundException {
        if(n < 0){
            throw new FileNotFoundException(" ");
        }
        else if(n == 0){
            return 1;
        }
        else return n - rev(n-1);
    }
    }


