/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 */
import com.google.common.base.Objects;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_10422 {
    private final Class_40184 Field_10423;
    private final int Field_10424;
    private final List Field_10425;

    public int Method_10426() {
        return this.Field_10424;
    }

    public Class_14683 Method_10427(int n) {
        return n >= 0 && n < this.Field_10425.size() ? (Class_14683)Objects.firstNonNull(this.Field_10425.get(n), (Object)Class_10233.Field_10240) : Class_10233.Field_10240;
    }

    public Class_10422(Class_40184 class_40184, List list, int n) {
        this.Field_10423 = class_40184;
        this.Field_10425 = list;
        this.Field_10424 = n;
    }

    private void Method_10428() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

