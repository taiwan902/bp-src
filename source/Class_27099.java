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

public class Class_27099
extends Class_9867 {
    protected List Field_27100 = Lists.newArrayList();

    public Class_27099(String string) {
        this.\u0000strictfp = string;
    }

    private void Method_27101() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1674 Method_27102() {
        Class_1758 class_1758 = new Class_1758();
        for (Class_9867 class_9867 : this.Field_27100) {
            class_1758.Method_1781(class_9867.Method_9870());
        }
        return class_1758;
    }
}

