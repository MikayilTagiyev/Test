import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a,b;
        try {
            a = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Error "+e.getMessage());;
        }
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try {
            String sing = read.readLine();
        } catch (IOException e) {
            System.out.println("Error "+e.getMessage());
        }
    }
}