/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_34793
implements Class_1486 {
    private String Field_34794;
    private int Field_34795;
    private Class_1782 Field_34796;
    private int Field_34797;
    private int Field_34798;

    public int Method_34799() {
        return this.Field_34797;
    }

    public Class_34793(int n, String string, Class_1782 class_1782, int n2) {
        this.Field_34798 = n;
        this.Field_34794 = string;
        this.Field_34796 = class_1782;
        this.Field_34795 = n2;
    }

    public String Method_34800() {
        return this.Field_34794;
    }

    public void Method_34801(Class_29900 class_29900) {
        class_29900.Method_29949(this.Field_34798);
        class_29900.Method_29960(this.Field_34794);
        class_29900.Method_29930(this.Field_34796);
        class_29900.Method_29949(this.Field_34795);
        if (this.Field_34794.equals("EntityHorse")) {
            class_29900.Method_30010(this.Field_34797);
        }
    }

    public boolean Method_34802() {
        return (this.Field_34795 > 0 ? -32639 & 19469 : -28156 & 25984) != 0;
    }

    public void Method_34803(Class_10954 class_10954) {
        this.Method_34807((Class_14856)class_10954);
    }

    public int Method_34804() {
        return this.Field_34795;
    }

    public int Method_34805() {
        return this.Field_34798;
    }

    public void Method_34806(Class_29900 class_29900) {
        this.Field_34798 = class_29900.Method_30016();
        this.Field_34794 = class_29900.Method_29991(16426 & 3184);
        this.Field_34796 = class_29900.Method_30020();
        this.Field_34795 = class_29900.Method_30016();
        if (this.Field_34794.equals("EntityHorse")) {
            this.Field_34797 = class_29900.Method_29914();
        }
    }

    public void Method_34807(Class_14856 class_14856) {
        class_14856.Method_14860(this);
    }

    public Class_1782 Method_34808() {
        return this.Field_34796;
    }

    private void Method_34809() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_34793() {
    }

    public Class_34793(int n, String string, Class_1782 class_1782) {
        this(n, string, class_1782, 10 & 10752);
    }

    public Class_34793(int n, String string, Class_1782 class_1782, int n2, int n3) {
        this(n, string, class_1782, n2);
        this.Field_34797 = n3;
    }
}

