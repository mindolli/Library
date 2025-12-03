package sad;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
import java.nio.file.*;
import java.util.List;

public class Database {
    private static final String FILE_PATH = "books.txt";
    private static int initialBookCount = 0; // 초기 도서 수 저장

    public static void addBooksToFile(ArrayList<Book> bookList) {
        Scanner scan = Main.scan;
        // ArrayList<Book> bookList = new ArrayList<>();

        boolean contiueProgram = true;
        while (contiueProgram) {
            String title = null;
            String author = null;
            String publisher = null;
            int seriserNumber = 0;
            DifficultyLevel difficultyLevel = null;
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
                while (!Test1) {
                    try {
                        System.out.println("난이도를 숫자로 입력하세요. 5:상, 4:중상, 3:중, 2:중하, 1:하");
                        int diffCode = scan.nextInt();
                        scan.nextLine();
                        difficultyLevel = DifficultyLevel.fromCode(diffCode);
                        if (difficultyLevel != null) {
                            Test1 = true;
                        } else {
                            System.out.println("1~5 사이의 숫자를 입력해주세요.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("숫자만 입력해주세요.");
                        scan.nextLine();
                    }
                }
                while (!Test2) {
                    try {
                        System.out.println("난이도가 " + difficultyLevel.name() + "(" + difficultyLevel.getCode()
                                + ") (이)가 맞나요? true 혹은 false를 입력해주세요");
                        Check = scan.nextBoolean();
                        scan.nextLine();
                        Test2 = true;
                    } catch (InputMismatchException e) {
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
            Test = false;
            Check = false;
            Test1 = false;
            Test2 = false;
            while (!Test) {
                while (!Test1) {
                    try {
                        System.out.println("대출가능 여부를 입력하세요.");
                        isBorrowable = scan.nextBoolean();
                        scan.nextLine();
                        Test1 = true;
                        Test2 = false;
                    } catch (InputMismatchException e) {
                        System.out.println("잘못된 입력입니다. true or false를 입력해주세요.");
                        scan.nextLine();
                    }
                }
                while (!Test2) {
                    try {
                        System.out.println("대출가능 여부가 " + isBorrowable + "가 맞나요? true 혹은 false를 입력해주세요");
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
            Test = false;
            Check = false;
            Test1 = false;
            Test2 = false;
            while (!Test) {
                System.out.println("책 종류를 입력하세요.");
                bookType = scan.nextLine();
                Test1 = false;
                while (!Test1) {
                    try {
                        System.out.println("책의 종류가 " + bookType + "(이)가 맞나요? true 혹은 false를 입력해주세요");
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
            Book book = new Book(title, author, publisher, seriserNumber, difficultyLevel, genre, isBorrowable,
                    bookType);
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
        // System.out.println("=====================================");
        // for (int i = 0; i < bookList.size(); i++) {
        // System.out.println((i + 1) + ". " + bookList.get(i));
        // }
        // System.out.println("=====================================");

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
                    int diffCode = Integer.parseInt(parts[4]);
                    DifficultyLevel diffEnum = DifficultyLevel.fromCode(diffCode);
                    int genreCode = Integer.parseInt(parts[5]);
                    KDC genreEnum = KDC.fromCode(genreCode);
                    boolean isBorrowableVal = Boolean.parseBoolean(parts[6]);
                    String bookTypeVal = parts[7];

                    Book bookObj = new Book(title, author, publisher, seriesNumber,
                            diffEnum, genreEnum, isBorrowableVal, bookTypeVal);
                    bookList.add(bookObj);
                }
            }
            initialBookCount = bookList.size(); // 로드 완료 후 개수 저장
        } catch (IOException e) {
            System.out.println("파일 읽기 오류: " + e.getMessage());
        }
    }

    // 파일에 도서 목록 저장하기
    public static void saveBooksToFile(ArrayList<Book> bookList) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH));
            int changeCount = bookList.size() - initialBookCount;
            String changeMsg = "";
            if (changeCount > 0) {
                changeMsg = changeCount + "권이 추가되었습니다.";
            } else if (changeCount < 0) {
                changeMsg = Math.abs(changeCount) + "권이 삭제되었습니다.";
            } else {
                changeMsg = "변경된 도서가 없습니다.";
            }
            System.out.println("파일 저장 중... (" + changeMsg + ")");

            for (Book book : bookList) {
                String line = book.title + "|" + book.author + "|" +
                        book.publisher + "|" + book.seriesNumber + "|" +
                        book.difficultyLevel.getCode() + "|" + book.genre.getCode() + "|" +
                        book.isBorrowable + "|" + book.bookType;
                writer.write(line);
                writer.newLine();
            }
            writer.close();
            System.out.println("파일 저장 완료! 위치: " + new File(FILE_PATH).getAbsolutePath());
            initialBookCount = bookList.size(); // 저장 후 기준점 업데이트
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
        Scanner scan = Main.scan;
        System.out.println("삭제할 도서의 제목을 입력하세요:");
        String keyword = scan.nextLine();

        ArrayList<Book> searchResults = new ArrayList<>();
        ArrayList<Integer> originalIndices = new ArrayList<>();

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
        int selection = scan.nextInt();
        scan.nextLine(); // Consume newline

        if (selection > 0 && selection <= searchResults.size()) {
            int originalIndex = originalIndices.get(selection - 1);
            Book deletedBook = bookList.remove(originalIndex);
            System.out.println("'" + deletedBook.title + "' 도서가 삭제되었습니다.");
            saveBooksToFile(bookList);
            System.out.println("도서 목록이 books.txt 파일에 저장되었습니다!");
            System.out.println("프로그램을 종료합니다.");
        } else if (selection == 0) {
            System.out.println("삭제를 취소합니다.");
        } else {
            System.out.println("잘못된 번호입니다.");
        }
    }
}