/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_28523
implements Class_1486 {
    private int Field_28524;
    private Class_34249 Field_28525;
    private boolean Field_28526;
    private int Field_28527;
    private String Field_28528;

    public void Method_28529(Class_10930 class_10930) {
        class_10930.Method_10950(this);
    }

    public void Method_28530(Class_10954 class_10954) {
        this.Method_28529((Class_10930)class_10954);
    }

    private void Method_28531() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_28532(Class_29900 class_29900) {
        class_29900.Method_29960(this.Field_28528);
        class_29900.Method_29949(this.Field_28527);
        class_29900.Method_29949(this.Field_28525.Method_34257());
        class_29900.Method_29980(this.Field_28526);
        class_29900.Method_29949(this.Field_28524);
    }

    public Class_34249 Method_28533() {
        return this.Field_28525;
    }

    public Class_28523(String string, int n, Class_34249 class_34249, boolean bl, int n2) {
        this.Field_28528 = string;
        this.Field_28527 = n;
        this.Field_28525 = class_34249;
        this.Field_28526 = bl;
        this.Field_28524 = n2;
    }

    public String Method_28534() {
        return this.Field_28528;
    }

    public Class_28523() {
    }

    public void Method_28535(Class_29900 class_29900) {
        this.Field_28528 = class_29900.Method_29991(17431 & -28601);
        this.Field_28527 = class_29900.Method_29944();
        this.Field_28525 = Class_34249.Method_34268(class_29900.Method_29944());
        this.Field_28526 = class_29900.Method_29962();
        this.Field_28524 = class_29900.Method_30016();
    }

    public int Method_28536() {
        return this.Field_28524;
    }

    public boolean Method_28537() {
        return this.Field_28526;
    }
}

