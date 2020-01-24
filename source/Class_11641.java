/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_11641 {
    private final String Field_11642;
    public static final Class_11641 Field_11643 = new Class_11641("");

    public static Class_11641 Method_11644(Class_1699 class_1699) {
        if (class_1699.Method_1715("Lock", 8204 & 1801)) {
            String string = class_1699.Method_1708("Lock");
            return new Class_11641(string);
        }
        return Field_11643;
    }

    private void Method_11645() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_11646() {
        return this.Field_11642;
    }

    public Class_11641(String string) {
        this.Field_11642 = string;
    }

    public void Method_11647(Class_1699 class_1699) {
        class_1699.Method_1702("Lock", this.Field_11642);
    }

    public boolean Method_11648() {
        return (this.Field_11642 == null || this.Field_11642.isEmpty() ? 12041 & -32719 : -29683 & 16384) != 0;
    }
}

