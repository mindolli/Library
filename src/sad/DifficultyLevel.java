package sad;

public enum DifficultyLevel {
    상(5), 중상(4), 중(3), 중하(2), 하(1);

    private final int code;

    DifficultyLevel(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static DifficultyLevel fromCode(int input) {
        for (DifficultyLevel diff : DifficultyLevel.values()) {
            if (diff.code == input) {
                return diff;
            }
        }
        return null;
    }
}
