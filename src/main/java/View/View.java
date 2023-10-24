package View;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);
    public double getValue(String title){
        System.out.printf("%s", title);
        return scanner.nextDouble();
    }

    public void print(String title, double data){
        System.out.print(title);
        System.out.print(data);
        System.out.println();

    }
}
