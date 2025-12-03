package sad;

import java.util.ArrayList;
import java.util.Scanner;

public class Genre {

    public void searchByGenre(ArrayList<Book> bookList) {
        Scanner scan = Main.scan;
        KDC selectedGenre = null;

        // --- 입력 루프(오타 처리 포함) ---
        while (selectedGenre == null) {

            System.out.println("검색할 장르 번호(KDC)를 입력하세요:");
            System.out.println("총류(0), 철학(1), 종교(2), 사회과학(3), 자연과학(4),");
            System.out.println("기술과학(5), 예술(6), 언어(7), 문학(8), 역사(9)");

            String input = scan.nextLine().trim();

            try {
                int number = Integer.parseInt(input); // 숫자 변환 시도
                selectedGenre = KDC.fromCode(number);

                if (selectedGenre == null) {
                    System.out.println("없는 장르 번호입니다. 0~9만 입력 가능합니다.\n");
                }

            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력 가능합니다. 다시 입력하세요.\n");
            }
        }

        // --- 검색 실행 ---
        int count = 0;

        System.out.println("\n[장르 검색 결과]");
        for (Book book : bookList) {
            if (book.genre == selectedGenre) {
                System.out.println(book);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("해당 장르의 도서를 찾을 수 없습니다.");
        }
    }
}