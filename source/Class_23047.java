/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;

public class Class_23047 {
    private ArrayList Field_23048 = Lists.newArrayList();

    public Class_23047 Method_23049(Class_31211 class_31211, int n) {
        this.Field_23048.add(new Class_40456(class_31211, n));
        return this;
    }

    public Class_31198 Method_23050() {
        Collections.sort(this.Field_23048);
        return new Class_31198(this.Field_23048);
    }

    public Class_31211 Method_23051() {
        return ((Class_40456)this.Field_23048.get((int)(20 & 9729))).Field_40457;
    }

    private void Method_23052() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

