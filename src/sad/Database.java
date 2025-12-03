package sad;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
import java.nio.file.*;
import java.util.List;

public class Database {
    private static final String FILE_PATH = "books.txt";

    public static void addBooksToFile(ArrayList<Book> bookList) {
        Scanner scan = Main.scan;
        // ArrayList<Book> bookList = new ArrayList<>();

        boolean contiueProgram = true;
        while (contiueProgram) {
            String title = null;
            String author = null;
            String publisher = null;
            int seriserNumber = 0;
            String difficulty = null;
            KDC genre = null;
            boolean isBorrowable = false;
            String bookType = null;
            boolean Check = false;
            boolean Test1 = false;
            boolean Test2 = false;
            boolean Test = false;
            while (!Test) {
                System.out.println("제목을 입력하세요.");
                title = scan.nextLine();
                Test1 = false;
                while (!Test1) {
                    try {
                        System.out.println("제목이 " + title + " 이 맞나요? true 혹은 false를 입력해주세요");
                        Check = scan.nextBoolean();
                        scan.nextLine();
                        Test1 = true;
                    } catch (InputMismatchException e) {
                        System.out.println("true 혹은 false를 입력해주셔야 합니다.");
                        scan.nextLine();
                    }
                }
                if (Check == true) {
                    Test = true;
                } else {
                    System.out.println("다시 입력하겠습니다.");
                }
            }
            Test = false;
            Check = false;
            Test1 = false;
            while (!Test) {
                System.out.println("저자를 입력하세요.");
                author = scan.nextLine();
                Test1 = false;
                while (!Test1) {
                    try {
                        System.out.println("저자가 " + author + " 이 맞나요? true 혹은 false를 입력해주세요");
                        Check = scan.nextBoolean();
                        scan.nextLine();
                        Test1 = true;
                    } catch (InputMismatchException e) {
                        System.out.println("true 혹은 false를 입력해주셔야 합니다.");
                        scan.nextLine();
                    }
                }
                if (Check == true) {
                    Test = true;
                } else {
                    System.out.println("다시 입력하겠습니다.");
                }
            }
            Test = false;
            Check = false;
            Test1 = false;
            while (!Test) {
                System.out.println("출판사를 입력하세요.");
                publisher = scan.nextLine();
                Test1 = false;
                while (!Test1) {
                    try {
                        System.out.println("출판사가 " + publisher + " 가 맞나요? true 혹은 false를 입력해주세요");
                        Check = scan.nextBoolean();
                        scan.nextLine();
                        Test1 = true;
                    } catch (InputMismatchException e) {
                        System.out.println("true 혹은 false를 입력해주셔야 합니다.");
                        scan.nextLine();
                    }
                }
                if (Check == true) {
                    Test = true;
                } else {
                    System.out.println("다시 입력하겠습니다.");
                }
            }
            Test = false;
            Check = false;
            Test1 = false;
            while (!Test) {
                while (!Test1) {
                    try {
                        System.out.println("시리즈의 권수를 입력하세요.");
                        seriserNumber = scan.nextInt();
                        scan.nextLine();
                        Test1 = true;
                        Test2 = false;
                    } catch (InputMismatchException e) {
                        System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                        scan.nextLine();
                    }
                }
                while (!Test2) {
                    try {
                        System.out.println("시리즈가 총 " + seriserNumber + "권이 맞나요? true 혹은 false를 입력해주세요");
                        Check = scan.nextBoolean();
                        scan.nextLine();
                        Test2 = true;
                    } catch (InputMismatchException e1) {
                        System.out.println("true 혹은 false를 입력해주셔야 합니다.");
                        scan.nextLine();
                    }
                }
                if (Check == true) {
                    Test = true;
                } else if (Check == false) {
                    System.out.println("다시 입력하겠습니다.");
                    Test1 = false;
                }
            }
            Test = false;
            Check = false;
            Test1 = false;
            Test2 = false;
            while (!Test) {
                System.out.println("난이도를 입력하세요.(상, 중상, 중, 중하, 하)");
                difficulty = scan.nextLine();
                Test1 = false;
                while (!Test1) {
                    try {
                        System.out.println("난이도가 " + difficulty + " (이)가 맞나요? true 혹은 false를 입력해주세요");
                        Check = scan.nextBoolean();
                        scan.nextLine();
                        Test1 = true;
                    } catch (InputMismatchException e) {
                        System.out.println("true 혹은 false를 입력해주셔야 합니다.");
                        scan.nextLine();
                    }
                }
                if (Check == true) {
                    Test = true;
                } else {
                    System.out.println("다시 입력하겠습니다.");
                }
            }
            Test = false;
            Check = false;
            Test1 = false;

            while (!Test) {
                while (!Test1) {
                    try {
                        System.out.println(
                                "장르 숫자로 입력하세요. 총류(0), 철학(1), 종교(2), 사회과학(3), 자연과학(4), 기술과학(5), 예술(6), 언어(7), 문학(8), 역사(9)");
                        int genreCode = scan.nextInt();
                        scan.nextLine();
                        genre = KDC.fromCode(genreCode);
                        if (genre != null) {
                            Test1 = true;
                            Test2 = false;
                        } else {
                            System.out.println("잘못된 장르 번호입니다. 0~9 사이의 숫자를 입력해주세요.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                        scan.nextLine();
                    }
                }
                while (!Test2) {
                    try {
                        System.out.println(
                                "장르가 KDC기준 " + genre.name() + "(" + genre.getCode() + ")번이 맞나요? true 혹은 false를 입력해주세요");
                        Check = scan.nextBoolean();
                        scan.nextLine();
                        Test2 = true;
                    } catch (InputMismatchException e1) {
                        System.out.println("true 혹은 false를 입력해주셔야 합니다.");
                        scan.nextLine();
                    }
                }
                if (Check == true) {
                    Test = true;
                } else {
                    System.out.println("다시 입력하겠습니다.");
                    Test1 = false;
                }
            }
            Book book = new Book(title, author, publisher, seriserNumber, difficulty, genre, isBorrowable, bookType);
            System.out.println(book);
            bookList.add(book);
            System.out.println("\n도서가 저장되었습니다!");
            System.out.println("\n현재까지 저장된 도서 수: " + bookList.size() + "권\n");
            boolean validChoice = false;
            while (!validChoice) {
                try {
                    System.out.println("다른 도서를 추가로 입력하시겠습니까? (true: 계속, false: 종료)");
                    contiueProgram = scan.nextBoolean();
                    scan.nextLine();
                    validChoice = true;
                } catch (InputMismatchException e) {
                    System.out.println("true 혹은 false를 입력해주세요.");
                    scan.nextLine();
                }
            }
        }

        System.out.println("\n=====================================");
        System.out.println("저장된 모든 도서 (총 " + bookList.size() + "권)");
        System.out.println("=====================================");
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println((i + 1) + ". " + bookList.get(i));
        }
        System.out.println("=====================================");

        saveBooksToFile(bookList);
        System.out.println("도서 목록이 books.txt 파일에 저장되었습니다!");
        System.out.println("프로그램을 종료합니다.");

        // scan.close();

    }

    public static void loadBooksFromFile(ArrayList<Book> bookList) {
        try {
            File file = new File(FILE_PATH);
            if (!file.exists()) {
                return; // 파일이 없으면 그냥 종료
            }

            List<String> lines = Files.readAllLines(Paths.get(FILE_PATH));
            for (String line : lines) {
                String[] parts = line.split("\\|");
                if (parts.length == 8) {
                    String title = parts[0];
                    String author = parts[1];
                    String publisher = parts[2];
                    int seriesNumber = Integer.parseInt(parts[3]);
                    String difficulty = parts[4];
                    int genreCode = Integer.parseInt(parts[5]);
                    KDC genreEnum = KDC.fromCode(genreCode);
                    boolean isBorrowable = Boolean.parseBoolean(parts[6]);
                    String bookType = parts[7];

                    Book book = new Book(title, author, publisher, seriesNumber,
                            difficulty, genreEnum, isBorrowable, bookType);
                    bookList.add(book);
                }
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 오류: " + e.getMessage());
        }
    }

    // 파일에 도서 목록 저장하기
    public static void saveBooksToFile(ArrayList<Book> bookList) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH));
            System.out.println("파일 저장 중... 저장할 도서 수: " + bookList.size());
            for (Book book : bookList) {
                String line = book.title + "|" + book.author + "|" +
                        book.publisher + "|" + book.seriesNumber + "|" +
                        book.difficulty + "|" + book.genre.getCode() + "|" + // Changed to getCode()
                        book.isBorrowable + "|" + book.bookType;
                writer.write(line);
                writer.newLine();
            }
            writer.close();
            System.out.println("파일 저장 완료! 위치: " + new File(FILE_PATH).getAbsolutePath());
        } catch (IOException e) {
            System.out.println("파일 저장 오류: " + e.getMessage());
        }
        System.out.println("===== 저장된 도서 목록 =====");
        for (Book b : bookList) {
            System.out.println(b);
        }
        System.out.println("===========================");
    }

    public static void deleteBooksFromFile(ArrayList<Book> bookList) {

    }
}