/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_44944
implements Class_40184 {
    private final List Field_44945 = Lists.newArrayList();

    public List Method_44946() {
        return this.Field_44945;
    }

    private void Method_44947() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1782 Method_44948() {
        return new Class_2840("Press a key to select a command, and again to use it.");
    }

    public Class_44944() {
        this.Field_44945.add(new Class_47441());
        this.Field_44945.add(new Class_46175());
    }
}

