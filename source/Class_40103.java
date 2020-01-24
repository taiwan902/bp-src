/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_40103
extends Class_33140 {
    private Class_1061 Field_40104;

    public Class_1061 Method_40105() {
        return this.\u0000strictfp;
    }

    public Class_1782 Method_40106(Class_859 class_859) {
        Class_2849 class_2849;
        Class_1782 class_1782 = this.Field_40104 == null ? this.\u0000strictfp.Method_1232() : this.Field_40104.Method_1232();
        Class_23823 class_23823 = this.Field_40104 instanceof Class_859 ? ((Class_859)this.Field_40104).Method_1010() : null;
        String string = "death.attack." + this.\u0000strictfp;
        String string2 = string + ".item";
        if (class_23823 != null && class_23823.Method_23851() && Class_7594.Method_7599(string2)) {
            Object[] arrobject;
            class_2849 = new Class_2849(string2, arrobject);
            arrobject = new Object[67 & 2083];
            arrobject[-31608 & 6208] = class_859.\u0000strictfp();
            arrobject[16641 & 10401] = class_1782;
            arrobject[1071 & 21074] = class_23823.Method_23900();
        } else {
            Object[] arrobject;
            class_2849 = new Class_2849(string, arrobject);
            arrobject = new Object[-19446 & 16770];
            arrobject[1212 & 20480] = class_859.\u0000strictfp();
            arrobject[721 & 19469] = class_1782;
        }
        return class_2849;
    }

    public Class_40103(String string, Class_1061 class_1061, Class_1061 class_10612) {
        super(string, class_1061);
        this.Field_40104 = class_10612;
    }

    private void Method_40107() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1061 Method_40108() {
        return this.Field_40104;
    }
}

