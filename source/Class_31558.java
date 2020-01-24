/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_31558
implements Class_1486 {
    private String[] Field_31559;

    public Class_31558(String[] arrstring) {
        this.Field_31559 = arrstring;
    }

    public void Method_31560(Class_14856 class_14856) {
        class_14856.Method_14902(this);
    }

    private void Method_31561() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_31562(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_31559.length);
        String[] arrstring = this.Field_31559;
        int n = arrstring.length;
        for (int i = -8180 & 4464; i < n; ++i) {
            String string = arrstring[i];
            class_29900.Method_29960(string);
        }
    }

    public void Method_31563(Class_10954 class_10954) {
        this.Method_31560((Class_14856)class_10954);
    }

    public Class_31558() {
    }

    public void Method_31564(Class_29900 class_29900) {
        this.Field_31559 = new String[class_29900.Method_30004()];
        for (int i = 2088 & -24576; i < this.Field_31559.length; ++i) {
            this.Field_31559[i] = class_29900.Method_29991(32767 & -1);
        }
    }

    public String[] Method_31565() {
        return this.Field_31559;
    }
}

