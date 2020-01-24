/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_23680
implements Class_1486 {
    private int Field_23681;
    private boolean Field_23682;
    private Class_4751 Field_23683;
    private int Field_23684;

    public boolean Method_23685() {
        return this.Field_23682;
    }

    public void Method_23686(Class_14856 class_14856) {
        class_14856.Method_14873(this);
    }

    public int Method_23687() {
        return this.Field_23681;
    }

    public int Method_23688() {
        return this.Field_23684;
    }

    public Class_23680() {
    }

    public void Method_23689(Class_10954 class_10954) {
        this.Method_23686((Class_14856)class_10954);
    }

    private void Method_23690() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_4751 Method_23691() {
        return this.Field_23683;
    }

    public void Method_23692(Class_29900 class_29900) {
        this.Field_23684 = class_29900.Method_29914();
        this.Field_23683 = class_29900.Method_29910();
        this.Field_23681 = class_29900.Method_29914();
        this.Field_23682 = class_29900.Method_29962();
    }

    public Class_23680(int n, Class_4751 class_4751, int n2, boolean bl) {
        this.Field_23684 = n;
        this.Field_23683 = class_4751;
        this.Field_23681 = n2;
        this.Field_23682 = bl;
    }

    public void Method_23693(Class_29900 class_29900) {
        class_29900.Method_30010(this.Field_23684);
        class_29900.Method_29996(this.Field_23683);
        class_29900.Method_30010(this.Field_23681);
        class_29900.Method_29980(this.Field_23682);
    }
}

