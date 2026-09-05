class X {
    String s1 = "hi";
}

class Y extends X {
    boolean bool = false;
}

class Test7 {
    public static void main(String[] args) {
        X x = new Y();
        //System.out.println(x.s1 + " " + x.bool);
    }
}

// Компилятор смотрит на тип (X), а не фактический объект Y ---> ошибка компиляции
