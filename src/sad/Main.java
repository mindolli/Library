package sad;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
import java.nio.file.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
//
//        System.out.print("제목을 입력하세요.");
//        String title = sc.nextLine();
//        System.out.print("저자를 입력하세요.");
//        String author = sc.nextLine();
//        System.out.print("출판사를 입력하세요.");
//        String publisher = sc.nextLine();
//        System.out.print("시리즈의 권수를 입력하세요.");
//        int seriserNumber = sc.nextInt();
//        sc.nextLine();
//        System.out.print("난이도를 입력하세요.");
//        String difficulty = sc.nextLine();
//        System.out.print("장르를 입력하세요.");
//        int genre = sc.nextInt();
//        sc.nextLine();
//        System.out.print("대출가능 여부를 입력하세요.");
//        boolean isBorrowable = sc.nextBoolean();
//        sc.nextLine();
//        System.out.print("책 종류를 입력하세요.");
//        String bookType = sc.nextLine();
//        Book book = new Book(title, author, publisher, seriserNumber, difficulty, genre, isBorrowable, bookType);
        Book book1 = new Book("title", "author", "publisher", 1, "1", 1, true, "bookType");
        Book book2 = new Book("title", "author", "publisher", 2, "1", 1, true, "bookType");
        System.out.println(book1);
        bookList.add(book1);
        System.out.println(book2);
        bookList.add(book2);

        System.out.println("1: 도서 등록\n2: 도서 삭제\n3: 전체 도서 출력\n4: 제목 검색\n5: 장르 검색\n6: 난이도 검색");
        System.out.println("숫자를 입력해 주세요 : ");
        int choice = scan.nextInt();
        scan.nextLine();

        switch (choice) {
            case 1:
                // addBook();
                break;
            case 2:
                delete deleter = new delete();
                deleter.deleteByTitle(bookList);
                break;
            case 3:
                // 전체 도서 목록 출력
                break;
            case 4:
                search searcher = new search();
                searcher.searchByTitle(bookList);
                break;
            case 5:
                // 장르 검색
                break;
            case 6:
                // 난이도 검색
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }

    // System.out.println("제목을 입력하세요.");
    // String title = scan.nextLine();
    // System.out.println("저자를 입력하세요.");
    // String author = scan.nextLine();
    // System.out.println("출판사를 입력하세요.");
    // String publisher = scan.nextLine();
    // System.out.println("시리즈의 권수를 입력하세요.");
    // int seriserNumber = scan.nextInt();
    // scan.nextLine();
    // System.out.println("난이도를 입력하세요.");
    // String difficulty = scan.nextLine();
    // System.out.println("장르를 입력하세요.");
    // int genre = scan.nextInt();
    // scan.nextLine();
    // System.out.println("대출가능 여부를 입력하세요.");
    // boolean isBorrowable = scan.nextBoolean();
    // scan.nextLine();
    // System.out.println("책 종류를 입력하세요.");
    // String bookType = scan.nextLine();
    // Book book = new Book(title , author, publisher, seriserNumber, difficulty,
    // genre, isBorrowable,bookType) ;
    // System.out.println(book);
    // bookList.add(book);

}