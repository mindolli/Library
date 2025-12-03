package sad;

import java.util.Scanner;

public class delete {
    public void deleteByTitle(java.util.ArrayList<Book> bookList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 도서의 제목을 입력하세요:");
        String keyword = sc.nextLine();

        java.util.ArrayList<Book> searchResults = new java.util.ArrayList<>();
        java.util.ArrayList<Integer> originalIndices = new java.util.ArrayList<>();

        int index = 0;
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            if (book.title.contains(keyword)) {
                searchResults.add(book);
                originalIndices.add(i);
                System.out.println((index + 1) + ". " + book);
                index++;
            }
        }

        if (searchResults.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
            return;
        }

        System.out.println("삭제할 도서의 번호를 입력하세요 (취소: 0):");
        int selection = sc.nextInt();
        sc.nextLine(); // Consume newline

        if (selection > 0 && selection <= searchResults.size()) {
            int originalIndex = originalIndices.get(selection - 1);
            Book deletedBook = bookList.remove(originalIndex);
            System.out.println("'" + deletedBook.title + "' 도서가 삭제되었습니다.");
        } else if (selection == 0) {
            System.out.println("삭제를 취소합니다.");
        } else {
            System.out.println("잘못된 번호입니다.");
        }
    }
}
