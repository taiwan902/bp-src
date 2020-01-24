/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Joiner
 *  com.google.common.base.Objects
 *  com.google.common.base.Objects$ToStringHelper
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Class_3855 {
    private static final Joiner Field_3856 = Joiner.on((String)Class_3855.Method_3868("\u0101\u0100"));
    private final Class_3238 Field_3857;
    private final ImmutableList Field_3858;
    private static final Function Field_3859 = new Class_3869();
    private final ImmutableList Field_3860;

    private void Method_3861() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private List Method_3862() {
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 1136 & 4610; i < this.Field_3860.size(); ++i) {
            arrayList.add(((Class_3538)this.Field_3860.get(i)).Method_3542());
        }
        return arrayList;
    }

    public Class_3855(Class_3238 class_3238, Class_3538 ... arrclass_3538) {
        this.Field_3857 = class_3238;
        Arrays.sort(arrclass_3538, new Class_3873(this));
        this.Field_3860 = ImmutableList.copyOf((Object[])arrclass_3538);
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        ArrayList arrayList = Lists.newArrayList();
        for (Object object : Class_3878.Method_3883(this.Method_3862())) {
            Map map = Class_3895.Method_3896((Iterable)this.Field_3860, (Iterable)object);
            Class_3677 class_3677 = new Class_3677(class_3238, ImmutableMap.copyOf((Map)map), null);
            linkedHashMap.put(map, class_3677);
            arrayList.add(class_3677);
        }
        for (Object object : arrayList) {
            ((Class_3677)object).Method_3681(linkedHashMap);
        }
        this.Field_3858 = ImmutableList.copyOf((Collection)arrayList);
    }

    public Class_3238 Method_3863() {
        return this.Field_3857;
    }

    public Collection Method_3864() {
        return this.Field_3860;
    }

    public ImmutableList Method_3865() {
        return this.Field_3858;
    }

    public String Method_3866() {
        return Objects.toStringHelper((Object)this).add("block", Class_3238.Field_3271.\u0000, `((Object)this.Field_3857)).add("properties", (Object)Iterables.transform((Iterable)this.Field_3860, (Function)Field_3859)).toString();
    }

    public Class_3436 Method_3867() {
        return (Class_3436)this.Field_3858.get(-23728 & 18472);
    }

    private static String Method_3868(String string) {
        int n = 29207;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_3855.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

