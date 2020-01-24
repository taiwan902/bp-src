/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.List;

public class Class_18681 {
    private String Field_18682;
    private Class_3538 Field_18683;
    private final List Field_18684 = Lists.newArrayList();

    public Class_18681 Method_18685(Class_3538 class_3538) {
        this.Field_18683 = class_3538;
        return this;
    }

    public Class_18681 Method_18686(Class_3538 ... arrclass_3538) {
        Collections.addAll(this.Field_18684, arrclass_3538);
        return this;
    }

    public Class_44996 Method_18687() {
        return new Class_44996(this.Field_18683, this.Field_18682, this.Field_18684, null);
    }

    private void Method_18688() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_18681 Method_18689(String string) {
        this.Field_18682 = string;
        return this;
    }
}

