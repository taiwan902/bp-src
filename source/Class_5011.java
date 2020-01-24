/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Collections2
 *  com.google.common.collect.Lists
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;

public class Class_5011
extends Class_3957 {
    protected Class_5011(String string, Collection collection) {
        super(string, Class_4595.class, collection);
    }

    public static Class_5011 Method_5012(String string, Predicate predicate) {
        return Class_5011.Method_5014(string, Collections2.filter((Collection)Lists.newArrayList((Object[])Class_4595.Field_4600), (Predicate)predicate));
    }

    public static Class_5011 Method_5013(String string) {
        return Class_5011.Method_5012(string, Predicates.alwaysTrue());
    }

    public static Class_5011 Method_5014(String string, Collection collection) {
        return new Class_5011(string, collection);
    }

    private void Method_5015() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

