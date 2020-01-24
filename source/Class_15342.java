/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_15342 {
    private Class_7710 Field_15343;
    private Class_13745 Field_15344;
    private Class_17976 Field_15345;
    private String Field_15346;

    public void Method_15347() {
        this.Field_15345.Method_17989(this.Field_15344, this.Field_15343);
    }

    public Class_13745 Method_15348() {
        return this.Field_15344;
    }

    private void Method_15349() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_15342(String string, Class_17976 class_17976, Class_13745 class_13745) {
        this.Field_15346 = string;
        this.Field_15345 = class_17976;
        this.Field_15344 = class_13745;
        this.Field_15343 = class_17976.Method_17983(string);
    }

    public void Method_15350(int n) {
        this.Field_15343.Method_7719(n);
    }
}

