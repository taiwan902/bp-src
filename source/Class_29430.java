/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_29430
extends Class_26421 {
    private Class_626 Field_29431;

    public static boolean Method_29432(Class_23823 class_23823) {
        return (class_23823 != null && (class_23823.Method_23844() == Class_10527.Field_10687 || class_23823.Method_23844() == Class_10527.Field_10666) ? 12801 & -32759 : 2450 & -32672) != 0;
    }

    public Class_29430(Class_626 class_626, Class_4961 class_4961, int n, int n2, int n3) {
        super(class_4961, n, n2, n3);
        this.Field_29431 = class_626;
    }

    public int Method_29433() {
        return 81 & 8719;
    }

    private void Method_29434() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_29435(Class_23823 class_23823) {
        return Class_29430.Method_29432(class_23823);
    }

    public void Method_29436(Class_626 class_626, Class_23823 class_23823) {
        if (class_23823.Method_23844() == Class_10527.Field_10687 && class_23823.Method_23843() > 0) {
            this.Field_29431.Method_750(Class_21905.Field_21911);
        }
        super.Method_26441(class_626, class_23823);
    }
}

