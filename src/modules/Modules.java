package modules;

class Modules {
    private int index;
    private String material;

    public Modules(int index, String material) {
        this.index = index;
        this.material = material;
    }

    @Override
    public String toString() {
        String modulseString = String.format("\nModules-%d\n\n%s", index, material);
        return modulseString;
    }
}
