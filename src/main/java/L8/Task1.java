package L8;

public class Task1 {
    private static class NestedTest {
        private int number;

        public NestedTest(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }
    public static void main(String[] args) {
        NestedTest test1 = new NestedTest(1);
        NestedTest test2 = new NestedTest(2);
        NestedTest test3 = new NestedTest(3);
        NestedTest test4 = new NestedTest(4);
        NestedTest test5 = new NestedTest(5);
        NestedTest test6 = new NestedTest(6);
        NestedTest test7 = new NestedTest(7);
        NestedTest test8 = new NestedTest(8);

        test1 = test2 = test3 = test4 = test5 = test6 = test7;
        System.out.println(test7.getNumber());
        System.out.println(test8.getNumber());

        System.out.println(test4.getNumber());

    }
}
