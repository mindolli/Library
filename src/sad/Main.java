package sad;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();


        System.out.println("제목을 입력하세요.");
        String title = scan.nextLine();
        System.out.println("저자를 입력하세요.");
        String author = scan.nextLine();
        System.out.println("출판사를 입력하세요.");
        String publisher = scan.nextLine();
        System.out.println("시리즈의 권수를 입력하세요.");
        int seriserNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("난이도를 입력하세요.");
        String difficulty = scan.nextLine();
        System.out.println("장르를 입력하세요.");
        int genre = scan.nextInt();
        scan.nextLine();
        System.out.println("대출가능 여부를 입력하세요.");
        boolean isBorrowable = scan.nextBoolean();
        scan.nextLine();
        System.out.println("책 종류를 입력하세요.");
        String bookType = scan.nextLine();
        Book book = new Book(title , author,  publisher, seriserNumber, difficulty, genre, isBorrowable,bookType) ;
        System.out.println(book);
        bookList.add(book);

    }
}