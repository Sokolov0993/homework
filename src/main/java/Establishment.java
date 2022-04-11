public enum Establishment {
    LENIZDAT("lenizdat"),
    ZALUPA("zalupa");
    private String name;

    Establishment(String code) {
        this.name = code;
    }

    public String getName() {
        return name;
    }
}

