/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.List;

public class Class_26185
implements Class_25993 {
    private final boolean Field_26186;
    private final List Field_26187;
    private final boolean Field_26188;

    private void Method_26189() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public List Method_26190() {
        return Collections.unmodifiableList(this.Field_26187);
    }

    public Class_26185(boolean bl, boolean bl2, List list) {
        this.Field_26188 = bl;
        this.Field_26186 = bl2;
        this.Field_26187 = list;
    }

    public boolean Method_26191() {
        return this.Field_26186;
    }

    public boolean Method_26192() {
        return this.Field_26188;
    }
}

