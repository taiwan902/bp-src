/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Map;

public class Class_32145
extends Class_1956 {
    private static final Map Field_32146 = Maps.newHashMap();
    public final String Field_32147;

    protected Class_32145(String string) {
        this.Field_32147 = string;
        this.\u0000strictfp = 291 & 21505;
        this.\u0000strictfp(Class_3987.Field_4003);
        Field_32146.put("records." + string, this);
    }

    public static Class_32145 Method_32148(String string) {
        return (Class_32145)Field_32146.get(string);
    }

    private void Method_32149() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_32150() {
        return Class_7594.Method_7602("item.record." + this.Field_32147 + ".desc");
    }

    public void Method_32151(Class_23823 class_23823, Class_626 class_626, List list, boolean bl) {
        list.add(this.Method_32150());
    }

    public boolean Method_32152(Class_23823 class_23823, Class_626 class_626, Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3) {
        Class_3436 class_3436 = class_283.Method_375(class_4751);
        if (class_3436.Method_3442() == Class_9265.Field_9442 && !((Boolean)class_3436.Method_3440(Class_12211.Field_12212)).booleanValue()) {
            if (class_283.Field_306) {
                return (-21355 & 11) != 0;
            }
            ((Class_12211)Class_9265.Field_9442).Method_12219(class_283, class_4751, class_3436, class_23823);
            class_283.Method_358(null, 4077 & 13309, class_4751, Class_1956.Method_1986(this));
            class_23823.Field_23826 -= 4529 & -32753;
            class_626.Method_750(Class_19863.Field_19914);
            return (8353 & -14321) != 0;
        }
        return (138 & -24284) != 0;
    }

    public Class_41140 Method_32153(Class_23823 class_23823) {
        return Class_41140.Field_41141;
    }
}

