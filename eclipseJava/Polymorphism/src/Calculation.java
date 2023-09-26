public class Calculation {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int x, int a, int c) {
        return x + a + c;
    }

    public static void main(String[] args) {
        Calculation cal = new Calculation();

        int result1 = cal.add(2, 3);
        int result2 = cal.add(2, 3, 4);

        System.out.println("Result of adding 2 and 3: " + result1);
        System.out.println("Result of adding 2, 3, and 4: " + result2);
    }
}
