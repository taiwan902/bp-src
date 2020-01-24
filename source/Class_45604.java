/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Class_45604
extends Class_39999 {
    private ScheduledFuture Field_45605;
    private final long Field_45606;
    private long Field_45607;
    private int Field_45608;
    private static final long Field_45609 = TimeUnit.MILLISECONDS.toNanos(268556677L & 185606249L);
    private boolean Field_45610;

    static long Method_45611(Class_45604 class_45604) {
        return class_45604.Field_45607;
    }

    private void Method_45612() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static long Method_45613(Class_45604 class_45604) {
        return class_45604.Field_45606;
    }

    public Class_45604(int n) {
        this(n, TimeUnit.SECONDS);
    }

    public void Method_45614(Class_39158 class_39158) {
        if (class_39158.Method_39175().Method_26107()) {
            this.Method_45623(class_39158);
        }
        super.Method_40003(class_39158);
    }

    static ScheduledFuture Method_45615(Class_45604 class_45604, ScheduledFuture scheduledFuture) {
        class_45604.Field_45605 = scheduledFuture;
        return class_45604.Field_45605;
    }

    public void Method_45616(Class_39158 class_39158) {
        this.Method_45617();
        super.Method_40005(class_39158);
    }

    private void Method_45617() {
        this.Field_45608 = 8290 & -30078;
        if (this.Field_45605 != null) {
            this.Field_45605.cancel((-11236 & 2144) != 0);
            this.Field_45605 = null;
        }
    }

    public void Method_45618(Class_39158 class_39158) {
        this.Method_45623(class_39158);
        super.Method_40000(class_39158);
    }

    public void Method_45619(Class_39158 class_39158) {
        this.Method_45617();
    }

    public Class_45604(long l, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit");
        }
        this.Field_45606 = l <= (35931224L & 1224808994L) ? 966932512L & -7657360140705348094L : Math.max(timeUnit.toNanos(l), Field_45609);
    }

    public void Method_45620(Class_39158 class_39158) {
        if (class_39158.Method_39175().Method_26107() && class_39158.Method_39175().Method_26112()) {
            this.Method_45623(class_39158);
        }
    }

    public void Method_45621(Class_39158 class_39158, Object object) {
        this.Field_45607 = System.nanoTime();
        class_39158.Method_39183(object);
    }

    protected void Method_45622(Class_39158 class_39158) {
        if (!this.Field_45610) {
            class_39158.Method_39162(Class_44006.Field_44007);
            class_39158.Method_39178();
            this.Field_45610 = -16343 & 321;
        }
    }

    private void Method_45623(Class_39158 class_39158) {
        switch (this.Field_45608) {
            case 1: 
            case 2: {
                return;
            }
        }
        this.Field_45608 = 73 & -14203;
        this.Field_45607 = System.nanoTime();
        if (this.Field_45606 > (927290517392720409L & 1109394692L)) {
            this.Field_45605 = class_39158.Method_39160().schedule((Runnable)new Class_15669(this, class_39158), this.Field_45606, TimeUnit.NANOSECONDS);
        }
    }
}

