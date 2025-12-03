package sad;

// ===== KDC 장르 enum =====
public enum KDC {
    총류(0), 철학(1), 종교(2), 사회과학(3), 자연과학(4),
    기술과학(5), 예술(6), 언어(7), 문학(8), 역사(9);

    private final int code;

    KDC(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    // 문자열 입력을 enum으로 안전하게 변환
    public static KDC fromCode(int input) {
        for (KDC genre : KDC.values()) {
            if (genre.code == input) {
                return genre;
            }
        }
        return null; // 잘못된 번호일 때
    }
}
