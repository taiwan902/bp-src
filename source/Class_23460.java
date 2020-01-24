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

public class Class_23460
extends Class_9867 {
    protected List Field_23461 = Lists.newArrayList();

    private void Method_23462() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1674 Method_23463() {
        Class_1699 class_1699 = new Class_1699();
        for (Class_9867 class_9867 : this.Field_23461) {
            class_1699.Method_1744(class_9867.Field_9868, class_9867.Method_9870());
        }
        return class_1699;
    }

    public Class_23460(String string) {
        this.\u0000strictfp = string;
    }
}

