package FileExceptionDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingHamletBackwards {
    public static void main(String[] args) {
        try {
            File file = new File("src/FileExceptionDemo/hamlet.txt");
            try (Scanner sc = new Scanner(file);) {
                //ArrayList<String> lines = new ArrayList<String>();
                while (sc.hasNextLine()) {
                    //lines.add(sc.nextLine());
                    reverse("file");
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

    public static String reverse(String file) throws FileNotFoundException {
        if(file.equals("true")){
            return reverse(file);
        }
        else if(file.equals(0)){
            throw new FileNotFoundException();
        }
        return "";
    }

//    public int rev(int n, File file) throws FileNotFoundException {
//        if(n > 0){
//            return n - rev(n-1);
//        }
//        else if(n <= 0){
//            throw new FileNotFoundException(" ");
//        }
//        return n;
//    }
    }
