/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public class Class_23625
extends Class_2804 {
    private Map Field_23626;

    private void Method_23627() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Map Method_23628() {
        this.Field_23626 = Maps.newHashMap();
        return this.Field_23626;
    }

    public void Method_23629() {
        this.Field_23626.clear();
    }

    public void Method_23630(Class_38873 class_38873) {
        this.\u0000strictfp((Object)class_38873.Method_38882(), (Object)class_38873);
    }
}

