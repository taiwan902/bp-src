/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;

public class Class_4173
extends Class_3968 {
    private final ImmutableSet Field_4174 = ImmutableSet.of((Object)((23553 & 513) != 0), (Object)((24617 & 1218) != 0));

    private void Method_4175() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_4176(Comparable comparable) {
        return this.Method_4179((Boolean)comparable);
    }

    public static Class_4173 Method_4177(String string) {
        return new Class_4173(string);
    }

    public Collection Method_4178() {
        return this.Field_4174;
    }

    public String Method_4179(Boolean bl) {
        return bl.toString();
    }

    protected Class_4173(String string) {
        super(string, Boolean.class);
    }
}

