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

public class Class_8643 {
    private boolean Field_8644;
    private Class_6295 Field_8645;
    private final List Field_8646 = Lists.newArrayList();

    public void Method_8647(Class_6295 class_6295) {
        this.Field_8645 = class_6295;
    }

    public Class_6295 Method_8648() {
        return this.Field_8645;
    }

    public List Method_8649() {
        return this.Field_8646;
    }

    public void Method_8650(boolean bl) {
        this.Field_8644 = bl;
    }

    private void Method_8651() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_8652() {
        return this.Field_8644;
    }
}

