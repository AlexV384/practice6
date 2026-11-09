class Main{
    public static void main(String[] args) {
        System.out.print("Это добавлено в ветке main");
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static String repeat(String s, int times) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++) {
            result.append(s);
        }
        return result.toString();
    }

    static int subtract(int a, int b) {
        return a - b;
    }
}
