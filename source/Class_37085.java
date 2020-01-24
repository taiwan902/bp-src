/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_37085
implements Class_18115 {
    final Class_46825 Field_37086;
    private final Class_8601 Field_37087;

    public boolean Method_37088(byte by) {
        char c = (char)by;
        Class_46825.Method_46854(this.Field_37086);
        if (c == (2573 & -16307)) {
            return (-13903 & 9217) != 0;
        }
        if (c == (1099 & 538)) {
            return (-30288 & 16395) != 0;
        }
        if (Class_46825.Method_46857(this.Field_37086) >= Class_46825.Method_46839(this.Field_37086)) {
            throw new Class_32041("HTTP header is larger than " + Class_46825.Method_46839(this.Field_37086) + " bytes.");
        }
        this.Field_37087.Method_8610(c);
        return (449 & 13833) != 0;
    }

    private void Method_37089() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_37085(Class_46825 class_46825, Class_8601 class_8601) {
        this.Field_37086 = class_46825;
        this.Field_37087 = class_8601;
    }

    public Class_8601 Method_37090(Class_22553 class_22553) {
        this.Field_37087.Method_8607();
        Class_46825.Method_46861(this.Field_37086, 16385 & 2432);
        int n = class_22553.Method_22647(this);
        class_22553.Method_22590(n + (777 & 17623));
        return this.Field_37087;
    }
}

