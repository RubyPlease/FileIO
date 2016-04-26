import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Scanner intScanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        Magazine mag = new Magazine();

        if (ReadWriteJson.fExist()) {
            mag = ReadWriteJson.read();
            System.out.println(mag);
        }

        System.out.println("What is the name of the magazine?");
        String nameResp = scanner.nextLine();
        mag.magName = nameResp;

        System.out.println("How many subscribers does the magazine have?");
        int subs = intScanner.nextInt();
        mag.subscribers = subs;

        System.out.println("What topic does the magazine cover?");
        String topResp = scanner.nextLine();
        mag.magTopic = topResp;

        System.out.println("How many pages are in the magazine?");
        int pagNum = intScanner.nextInt();
        mag.pages = pagNum;

        System.out.println("Is this magazine for children?[Y/N]");
        String childMag = scanner.nextLine();
        if (childMag.equalsIgnoreCase("y")) mag.childMag = true;
        else mag.childMag = false;

        ReadWriteJson.write(mag);
    }
}
