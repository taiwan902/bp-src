/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_18167
extends Class_14944 {
    private final Predicate Field_18168;

    public Class_18167(int n, String string, boolean bl, Predicate predicate) {
        super(n, string, bl);
        this.Field_18168 = (Predicate)Objects.firstNonNull((Object)predicate, (Object)Predicates.alwaysTrue());
    }

    public Predicate Method_18169() {
        return this.Field_18168;
    }

    private void Method_18170() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

