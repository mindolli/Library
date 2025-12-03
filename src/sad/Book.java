package sad;

public class Book {
    // 필드
    String title;
    String author;
    String publisher;
    int seriesNumber;
    DifficultyLevel difficultyLevel;
    KDC genre;
    boolean isBorrowable;
    String bookType;

    // 메서드
    // 생성자
    public Book(String title, String author, String publisher, int seriesNumber, DifficultyLevel difficultyLevel, KDC genre,
                boolean isBorrowable, String bookType) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.seriesNumber = seriesNumber;
        this.difficultyLevel = difficultyLevel;
        this.genre = genre;
        this.isBorrowable = isBorrowable;
        this.bookType = bookType;
    }

    // toString() - 도서 정보 출력용
    @Override
    public String toString() {
        return "제목: " + title +
                ", 저자: " + author +
                ", 출판사: " + publisher +
                ", 권수: " + seriesNumber +
                ", 난이도: " + difficultyLevel +
                ", 장르: " + genre +
                ", 대출 가능: " + isBorrowable +
                ", 책 종류: " + bookType;

    }
}