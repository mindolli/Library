package sad;

import java.util.Scanner;

public class Search {
    public void searchByTitle(java.util.ArrayList<Book> bookList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("검색할 제목을 입력하세요:");
        String keyword = scan.nextLine();

        boolean found = false;
        for (Book book : bookList) {
            if (book.title.contains(keyword)) {
                System.out.println(book);
                found = true;
            }
        }

        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }
    }
    public void searchByGenre(java.util.ArrayList<Book> bookList) {

    }
}
