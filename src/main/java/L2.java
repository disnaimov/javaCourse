import java.util.ArrayList;
import java.util.List;

public class L2 {
    public static void main(String[] args) {
        //--------------------------ЭТАП 1-----------------------------

        List<Object> args1 = new ArrayList<>();

        byte byte1 = 0b00000011;
        byte byte2 = 03;
        byte byte3 = 3;
        byte byte4 = 0x03;
        byte byteSum = (byte) (byte1 + byte2 + byte3 + byte4);

        System.out.println("Byte sum = " + byteSum);

        args1.add(byte1);
        args1.add(byte2);
        args1.add(byte3);
        args1.add(byte4);

        short short1 = 0b1010101;
        short short2 = 0125;
        short short3 = 600;
        short short4 = 530;
        short shortSum = (short) (short1 + short2 + short3 + short4);

        System.out.println("Short sum = " + shortSum);

        args1.add(short1);
        args1.add(short2);
        args1.add(short3);
        args1.add(short4);

        int int1 = 0b0;
        int int2 = 00;
        int int3 = 0;
        int int4 = 0x0;
        int intSum = int1 + int2 + int3 + int4;

        System.out.println("Int sum = " + intSum);

        args1.add(int1);
        args1.add(int2);
        args1.add(int3);
        args1.add(int4);

        long long1 = 0b0L;
        long long2 = 00L;
        long long3 = 123456789L;
        long long4 = 0x0L;
        long longSum = long1 + long2 + long3 + long4;

        System.out.println("Long sum = " + longSum);

        args1.add(long1);
        args1.add(long2);
        args1.add(long3);
        args1.add(long4);

        L2.printArgs(args1);

        //--------------------------ЭТАП 2-----------------------------

        List<Object> args2 = new ArrayList<>();

        float float1 = 1f;
        float float2 = 2f;

        args2.add(float1);
        args2.add(float2);

        double double1 = 1d;
        double double2 = 2d;

        args2.add(double1);
        args2.add(double2);

        boolean trueB = true;
        boolean falseB = false;

        args2.add(trueB);
        args2.add(falseB);

        L2.printArgs(args2);

        //--------------------------ЭТАП 3-----------------------------

        List<Object> args3 = new ArrayList<>();

        char char1 = 'a';
        char char2 = 500;
        char cha3 = '\u0500';

        args3.add(char1);
        args3.add(char2);
        args3.add(cha3);

        L2.printArgs(args3);

    }

    private static void printArgs(List<Object> args) {
        args.forEach(System.out::println);
    }
}
