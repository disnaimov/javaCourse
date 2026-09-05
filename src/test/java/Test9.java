class X3 {
    public X3() {
        System.out.println("X");
    }

    public X3(int i) {
        System.out.println("X " + i);
    }

    private boolean abc() { return false; }

    public static void main(String[] args) {
        X3 x = new Y3(18);
        System.out.println(x.abc());
    }
}

class Y3 extends X3 {
    public Y3(int i) {
        System.out.println("Y");
    }

    private boolean abc() { return true;}
}

// X Y false
