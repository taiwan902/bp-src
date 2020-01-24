/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_44108
implements Class_21832 {
    final int Field_44109;
    final Class_40426 Field_44110;
    final Class_12364 Field_44111;
    final Class_27921 Field_44112;

    public void Method_44113(Class_27581 class_27581) {
        this.Field_44111.Method_12369(this.Field_44109);
        this.Field_44111.Method_12370();
        Class_40426.Method_40440(this.Field_44112);
    }

    private void Method_44114() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_44115(Class_21065 class_21065) {
        this.Method_44113((Class_27581)class_21065);
    }

    Class_44108(Class_40426 class_40426, Class_12364 class_12364, int n, Class_27921 class_27921) {
        this.Field_44110 = class_40426;
        this.Field_44111 = class_12364;
        this.Field_44109 = n;
        this.Field_44112 = class_27921;
    }
}

