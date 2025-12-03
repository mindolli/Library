package sad;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static final Scanner scan = new Scanner(System.in); // final: 변경할 수 없음을 의미 - 오버라이딩 금지

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        Database db = new Database();

        // 기존 파일 불러오기
        db.loadBooksFromFile(bookList);

        System.out.println("=====================================");
        System.out.println("기존에 저장된 도서 " + bookList.size() + "권을 불러왔습니다.");
        System.out.println("=====================================\n");

        System.out.println("1: 도서 등록\n2: 도서 삭제\n3: 전체 도서 출력\n4: 제목 검색\n5: 장르 검색\n6: 난이도 검색\n7: 프로그램 종료");
        System.out.println("숫자를 입력해 주세요 : ");
        int choice = scan.nextInt();
        scan.nextLine();

        switch (choice) {
            case 1: // 도서 등록
                db.addBooksToFile(bookList);
                break;
            case 2: // 도서 삭제
                db.deleteBooksFromFile(bookList);
                break;
            case 3: // 전체 도서 목록 출력
                if (bookList.isEmpty()) {
                    System.out.println("등록된 도서가 없습니다.");
                } else {
                    for (Book book : bookList) {
                        System.out.println(book);
                    }
                }
                break;
            case 4: // 제목으로 검색
                Search titleSearcher = new Search();
                titleSearcher.searchByTitle(bookList);
                break;
            case 5: // 장르 검색
                Search genreSearcher = new Search();
                genreSearcher.searchByGenre(bookList);
                break;
            case 6:
                // 난이도 검색
                break;
            case 7: // 프로그램 종료
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}