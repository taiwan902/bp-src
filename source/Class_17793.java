/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.UUID;

public abstract class Class_17793 {
    protected Class_12001 Field_17794;
    protected boolean Field_17795;
    protected Class_10099 Field_17796;
    protected boolean Field_17797;
    private final UUID Field_17798;
    protected Class_1782 Field_17799;
    protected boolean Field_17800;
    protected float Field_17801;

    public Class_17793 Method_17802(boolean bl) {
        this.Field_17795 = bl;
        return this;
    }

    public Class_17793 Method_17803(boolean bl) {
        this.Field_17797 = bl;
        return this;
    }

    public Class_17793 Method_17804(boolean bl) {
        this.Field_17800 = bl;
        return this;
    }

    public float Method_17805() {
        return this.Field_17801;
    }

    public void Method_17806(Class_10099 class_10099) {
        this.Field_17796 = class_10099;
    }

    public Class_10099 Method_17807() {
        return this.Field_17796;
    }

    public Class_12001 Method_17808() {
        return this.Field_17794;
    }

    public void Method_17809(float f) {
        this.Field_17801 = f;
    }

    public void Method_17810(Class_1782 class_1782) {
        this.Field_17799 = class_1782;
    }

    public Class_1782 Method_17811() {
        return this.Field_17799;
    }

    private void Method_17812() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_17793.Method_17814("\u084c\u0842\u084f\u0841\u0849\u0844\u084d\u084e\u084f\u0846\u0843\u0842\u0846\u084e"));
    }

    public void Method_17813(Class_12001 class_12001) {
        this.Field_17794 = class_12001;
    }

    public Class_17793(UUID uUID, Class_1782 class_1782, Class_12001 class_12001, Class_10099 class_10099) {
        this.Field_17798 = uUID;
        this.Field_17799 = class_1782;
        this.Field_17794 = class_12001;
        this.Field_17796 = class_10099;
        this.Field_17801 = 1.0f;
    }

    private static String Method_17814(String string) {
        int n = 12880;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17793.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

