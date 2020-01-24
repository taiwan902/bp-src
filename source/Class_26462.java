/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_26462
implements Class_18115 {
    final Class_46825 Field_26463;
    private int Field_26464;
    private final Class_8601 Field_26465;

    Class_26462(Class_46825 class_46825, Class_8601 class_8601) {
        this.Field_26463 = class_46825;
        this.Field_26465 = class_8601;
    }

    public Class_8601 Method_26466(Class_22553 class_22553) {
        this.Field_26465.Method_8607();
        this.Field_26464 = 4169 & -30848;
        int n = class_22553.Method_22647(this);
        class_22553.Method_22590(n + (2097 & 4737));
        return this.Field_26465;
    }

    private void Method_26467() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_26468(byte by) {
        char c = (char)by;
        if (c == (4109 & -15939)) {
            return (21509 & 521) != 0;
        }
        if (c == (-32502 & 4107)) {
            return (13315 & 2432) != 0;
        }
        if (this.Field_26464 >= Class_46825.Method_46844(this.Field_26463)) {
            throw new Class_32041("An HTTP line is larger than " + Class_46825.Method_46844(this.Field_26463) + " bytes.");
        }
        this.Field_26464 += 281 & 3075;
        this.Field_26465.Method_8610(c);
        return (653 & 2145) != 0;
    }
}

