class Datavalue {
    byte a;
    byte b;

    void changeValue(Datavalue d) {
        d.a = 20;
        d.b = 10;
    }

    public static void main(String[] args) {

        Datavalue dv = new Datavalue();
        dv.a = 10;
        dv.b = 20;

        System.out.println("Before Swap");
        System.out.println("A: " + dv.a);
        System.out.println("B: " + dv.b);

        dv.changeValue(dv);

        System.out.println("After Swap");
        System.out.println("A: " + dv.a);
        System.out.println("B: " + dv.b);
    }
}
