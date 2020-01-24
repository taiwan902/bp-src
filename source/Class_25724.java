/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_25724
implements Class_1486 {
    private int Field_25725;
    private Class_43755 Field_25726;
    private Class_35650 Field_25727;
    private Class_26801 Field_25728;

    public Class_25724() {
    }

    public void Method_25729(Class_10954 class_10954) {
        this.Method_25734((Class_14856)class_10954);
    }

    public Class_26801 Method_25730() {
        return this.Field_25728;
    }

    public int Method_25731() {
        return this.Field_25725;
    }

    public void Method_25732(Class_29900 class_29900) {
        this.Field_25725 = class_29900.Method_29914();
        this.Field_25728 = Class_26801.Method_26817(class_29900.Method_30016());
        this.Field_25727 = Class_35650.Method_35659(class_29900.Method_30016());
        this.Field_25726 = Class_43755.Method_43784(class_29900.Method_29991(1040 & 23384));
        if (this.Field_25726 == null) {
            this.Field_25726 = Class_43755.Field_43765;
        }
    }

    public Class_25724(int n, Class_26801 class_26801, Class_43755 class_43755, Class_35650 class_35650) {
        this.Field_25725 = n;
        this.Field_25728 = class_26801;
        this.Field_25727 = class_35650;
        this.Field_25726 = class_43755;
    }

    private void Method_25733() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_25734(Class_14856 class_14856) {
        class_14856.Method_14880(this);
    }

    public void Method_25735(Class_29900 class_29900) {
        class_29900.Method_30010(this.Field_25725);
        class_29900.Method_29949(this.Field_25728.Method_26822());
        class_29900.Method_29949(this.Field_25727.Method_35660());
        class_29900.Method_29960(this.Field_25726.Method_43785());
    }

    public Class_43755 Method_25736() {
        return this.Field_25726;
    }

    public Class_35650 Method_25737() {
        return this.Field_25727;
    }
}

