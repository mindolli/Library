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
        Database db = new Database();

        // 기존 파일 불러오기
        db.loadBooksFromFile(bookList);

        System.out.println("=====================================");
        System.out.println("기존에 저장된 도서 " + bookList.size() + "권을 불러왔습니다.");
        System.out.println("=====================================\n");

        System.out.println("1: 도서 등록\n2: 도서 삭제\n3: 전체 도서 출력\n4: 제목 검색\n5: 장르 검색\n6: 난이도 검색");
        System.out.println("숫자를 입력해 주세요 : ");
        int choice = scan.nextInt();
        scan.nextLine();

        switch (choice) {
            case 1:     // 도서 등록
                db.addBooksToFile(bookList);
                break;
            case 2:     // 도서 샂게
                delete deleter = new delete();
                deleter.deleteByTitle(bookList);
                break;
            case 3:     // 전체 도서 목록 출력
                db.loadBooksFromFile(bookList);

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