class Test4 {
    public static void main(String[] args) {
        int a = 7;
        System.out.println(a > 2 ? a < 5 ? 3:6:9);
    }
}

// Группируется так a > 2 ? (a < 5 ? 3 : 6) : 9
/*
Подставим a = 7:

Проверяем первое условие: a > 2 → 7 > 2 → true.

Значит, выбирается «then»-часть: (a < 5 ? 3 : 6).

Внутри: a < 5 ? 3 : 6 → 7 < 5 ? 3 : 6.

Условие 7 < 5 → false.

Значит, выбирается «else»-часть → 6.

Итог: System.out.println(6); → выводится 6.
*/
