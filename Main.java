
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the no.of strings: ");
        int size = s.nextInt();
        s.nextLine();


        String[] str = new String[size];
        System.out.println("Enter the strings: ");
        for (int i = 0 ; i < size ; i++){
            str[i] = s.nextLine();
        }

        for (int i = 0 ; i < size ; i++){
            for (int j = i + 1 ; j < size ; j++){
                if (str[i].length() > str[j].length()){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("String after sorting based on length: " + Arrays.toString(str));
    }
}