/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_40755
implements Class_1486 {
    private Class_22232 Field_40756;
    private Class_4595 Field_40757;
    private Class_4751 Field_40758;

    public Class_4595 Method_40759() {
        return this.Field_40757;
    }

    public Class_22232 Method_40760() {
        return this.Field_40756;
    }

    private void Method_40761() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_40762(Class_29900 class_29900) {
        this.Field_40756 = (Class_22232)class_29900.Method_30009(Class_22232.class);
        this.Field_40758 = class_29900.Method_29910();
        this.Field_40757 = Class_4595.Method_4637(class_29900.Method_30016());
    }

    public void Method_40763(Class_10930 class_10930) {
        class_10930.Method_10940(this);
    }

    public void Method_40764(Class_10954 class_10954) {
        this.Method_40763((Class_10930)class_10954);
    }

    public Class_4751 Method_40765() {
        return this.Field_40758;
    }

    public Class_40755() {
    }

    public void Method_40766(Class_29900 class_29900) {
        class_29900.Method_29964(this.Field_40756);
        class_29900.Method_29996(this.Field_40758);
        class_29900.Method_29949(this.Field_40757.Method_4648());
    }

    public Class_40755(Class_22232 class_22232, Class_4751 class_4751, Class_4595 class_4595) {
        this.Field_40756 = class_22232;
        this.Field_40758 = class_4751;
        this.Field_40757 = class_4595;
    }
}

