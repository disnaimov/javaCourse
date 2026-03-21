package L15;

public class StringBuilderTest {

    private static boolean equals(StringBuilder SBuilder1, StringBuilder SBuilder2) {
        return SBuilder1.compareTo(SBuilder2) == 0;
    }

    public static void main(String[] args) {
        StringBuilder SBuilder1 = new StringBuilder("String");
        StringBuilder SBuilder2 = new StringBuilder("String");
        System.out.println(equals(SBuilder1, SBuilder2));
    }
}
