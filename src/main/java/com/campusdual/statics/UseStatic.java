package com.campusdual.statics;

public class UseStatic {
    public static void main(String[] args) {
        System.out.println("STATIC METHOD:");
        System.out.println("==================================");
        System.out.println(StaticMethod.countDownToYear("Daniel", 2460));
        System.out.println(StaticMethod.countDownToYear("Daniel", 1975));

        StaticAttribute sta1 = new StaticAttribute();
        StaticAttribute sta2 = new StaticAttribute();
        StaticAttribute sta3 = new StaticAttribute();

        sta2.incrementAndPrintCounter();
        sta3.incrementAndPrintCounter();
        sta3.incrementAndPrintCounter();
        sta2.incrementAndPrintCounter();
        sta1.incrementAndPrintCounter();
        sta3.incrementAndPrintCounter();
        sta1.incrementAndPrintCounter();
        sta2.incrementAndPrintCounter();
        sta2.incrementAndPrintCounter();
        sta3.incrementAndPrintCounter();
    }
}
