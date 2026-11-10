public class Lab4Drills {

    // 1. The Forbidden Access
    String name = "Name";
    public static void drill1() {
        // Compile error
        //System.out.println(name);
    }

    // 2. Varargs Math
    public static int drill2(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    // 3. Varargs Math
    // void test(int... nums, String s) { }
    // Varargs must always be the last parameter in the method signature.

    // 4. The Default Ghost
    static class MyClassWithConstructor {
        String title;

        public MyClassWithConstructor(String title) {
            this.title = title;
        }
    }
    public static void drill4() {
        // Compile error
        // MyClassWithConstructor object = new MyClassWithConstructor();
        // The default constructor disappears once you define your own custom constructor.
    }

    // 5. Constructor Chain
    static class ChainExample {
        int x;
        int y;

        public ChainExample(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public ChainExample(int x) {
            this(x, 100);
        }
    }

    // 6. Static Call Practice
    public static void drill6() {
        double resultSqrt = Math.sqrt(144);
        int resultParse = Integer.parseInt("100");
        System.out.println("Math.sqrt(144) = " + resultSqrt + " Integer.parseInt = " + resultParse);
    }

    // 7. Final Parameter
    public static void drill7(final int x) {
        // Compile error
        // x = 10;
        System.out.println("Final parameter cannot be reassigned. x = " + x);
    }

    // 8. The Identity Crisis
    static class IdentityCrisis {
        public void printThis() {
            System.out.println("This keyword: " + this);
        }
    }

    // 9. Main Location
    // Project still works, provided specify the new class
    // as the main entry point in IDE or runner settings.

    // 10. Shadowing Fix
    static class ShadowingExample {
        String name;
        public ShadowingExample(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        // Drill 1
        drill1();

        // Drill 2
        int sumResult = drill2(10, 20, 30, 40);
        System.out.println("Drill 2 Sum: " + sumResult);

        // Drill 5
        ChainExample chainObj = new ChainExample(50);
        System.out.println("Drill 5 Chain: x = " + chainObj.x + ", y = " + chainObj.y);

        // Drill 6
        drill6();

        // Drill 7
        drill7(15);

        // Drill 8
        IdentityCrisis identityObj = new IdentityCrisis();
        identityObj.printThis();

        // Shadowing Fix
        ShadowingExample shadowingObj = new ShadowingExample("Test Name");
        System.out.println("Drill 10 Shadowing resolved name: " + shadowingObj.name);
    }
}
