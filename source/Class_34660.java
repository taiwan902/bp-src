/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_34660
extends Class_4879 {
    private int Field_34661;
    private Class_1956 Field_34662;

    public void Method_34663(Class_1956 class_1956, int n) {
        this.Field_34662 = class_1956;
        this.Field_34661 = n;
    }

    public int Method_34664() {
        return this.Field_34661;
    }

    public Class_34660(Class_1956 class_1956, int n) {
        this.Field_34662 = class_1956;
        this.Field_34661 = n;
    }

    public Class_34660() {
    }

    private void Method_34665() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_34666(Class_1699 class_1699) {
        super.Method_4911(class_1699);
        this.Field_34662 = class_1699.Method_1715("Item", -26357 & 524) ? Class_1956.Method_2015(class_1699.Method_1708("Item")) : Class_1956.Method_1978(class_1699.Method_1738("Item"));
        this.Field_34661 = class_1699.Method_1738("Data");
    }

    public Class_1956 Method_34667() {
        return this.Field_34662;
    }

    public void Method_34668(Class_1699 class_1699) {
        super.Method_4929(class_1699);
        Class_2080 class_2080 = (Class_2080)Class_1956.Field_1961.Method_3648(this.Field_34662);
        class_1699.Method_1702("Item", class_2080 == null ? "" : class_2080.Method_2086());
        class_1699.Method_1739("Data", this.Field_34661);
    }

    public Class_1486 Method_34669() {
        Class_1699 class_1699 = new Class_1699();
        this.Method_34668(class_1699);
        class_1699.Method_1740("Item");
        class_1699.Method_1739("Item", Class_1956.Method_1986(this.Field_34662));
        return new Class_24663(this.\u0000strictfp, 7 & -21739, class_1699);
    }
}

