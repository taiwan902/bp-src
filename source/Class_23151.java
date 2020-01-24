/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_23151
implements Class_1486 {
    private boolean Field_23152;
    private int Field_23153;
    private int Field_23154;
    private int Field_23155;
    private int Field_23156;
    private byte Field_23157;
    private byte Field_23158;

    public int Method_23159() {
        return this.Field_23153;
    }

    public int Method_23160() {
        return this.Field_23155;
    }

    public void Method_23161(Class_10954 class_10954) {
        this.Method_23167((Class_14856)class_10954);
    }

    public void Method_23162(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_23155);
        class_29900.Method_30010(this.Field_23154);
        class_29900.Method_30010(this.Field_23156);
        class_29900.Method_30010(this.Field_23153);
        class_29900.Method_29949(this.Field_23158);
        class_29900.Method_29949(this.Field_23157);
        class_29900.Method_29980(this.Field_23152);
    }

    public byte Method_23163() {
        return this.Field_23157;
    }

    public Class_23151() {
    }

    public Class_23151(int n, int n2, int n3, int n4, byte by, byte by2, boolean bl) {
        this.Field_23155 = n;
        this.Field_23154 = n2;
        this.Field_23156 = n3;
        this.Field_23153 = n4;
        this.Field_23158 = by;
        this.Field_23157 = by2;
        this.Field_23152 = bl;
    }

    public int Method_23164() {
        return this.Field_23156;
    }

    private void Method_23165() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_23166(Class_29900 class_29900) {
        this.Field_23155 = class_29900.Method_30004();
        this.Field_23154 = class_29900.Method_29914();
        this.Field_23156 = class_29900.Method_29914();
        this.Field_23153 = class_29900.Method_29914();
        this.Field_23158 = class_29900.Method_29944();
        this.Field_23157 = class_29900.Method_29944();
        this.Field_23152 = class_29900.Method_29962();
    }

    public void Method_23167(Class_14856 class_14856) {
        class_14856.Method_14861(this);
    }

    public int Method_23168() {
        return this.Field_23154;
    }

    public byte Method_23169() {
        return this.Field_23158;
    }

    public Class_23151(Class_1061 class_1061) {
        this.Field_23155 = class_1061.Method_1311();
        this.Field_23154 = Class_13337.Method_13371(class_1061.Field_1130 * (12.571428571428571 * 2.5454545454545454));
        this.Field_23156 = Class_13337.Method_13371(class_1061.Method_1324() * (113.23076923076924 * 0.2826086956521739));
        this.Field_23153 = Class_13337.Method_13371(class_1061.Field_1106 * (6.7368421052631575 * 4.75));
        this.Field_23158 = (byte)(class_1061.Field_1079 * (413.53845f * 0.61904764f) / (115.9322f * 3.1052632f));
        this.Field_23157 = (byte)(class_1061.Field_1093 * (759.4667f * 0.33707866f) / (9.666667f * 37.24138f));
        this.Field_23152 = class_1061.Method_1244();
    }

    public boolean Method_23170() {
        return this.Field_23152;
    }
}

