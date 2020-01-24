/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_43514
implements Class_10321 {
    final Class_40509 Field_43515;
    final String Field_43516;
    final Class_29094 Field_43517;
    final Class_2080 Field_43518;

    public Object Method_43519() {
        return this.Method_43521();
    }

    private void Method_43520() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_6002 Method_43521() {
        Class_38873 class_38873 = (Class_38873)Class_29094.Method_29117(this.Field_43517).\u0000strictfp((Object)this.Field_43518);
        return class_38873 == null ? Class_29094.Field_29097 : class_38873.Method_38884();
    }

    public int Method_43522() {
        Class_38873 class_38873 = (Class_38873)Class_29094.Method_29117(this.Field_43517).\u0000strictfp((Object)this.Field_43518);
        return class_38873 == null ? 17112 & 293 : class_38873.Method_38881();
    }

    Class_43514(Class_29094 class_29094, String string, Class_40509 class_40509) {
        this.Field_43517 = class_29094;
        this.Field_43516 = string;
        this.Field_43515 = class_40509;
        this.Field_43518 = new Class_2080(this.Field_43516, this.Field_43515.Method_40525());
    }
}

