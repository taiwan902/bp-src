/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_27203
implements Class_1486 {
    private String Field_27204;
    private int Field_27205;

    private void Method_27206() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_27207(Class_10954 class_10954) {
        this.Method_27210((Class_14856)class_10954);
    }

    public int Method_27208() {
        return this.Field_27205;
    }

    public void Method_27209(Class_29900 class_29900) {
        class_29900.Method_29949(this.Field_27205);
        class_29900.Method_29960(this.Field_27204);
    }

    public Class_27203() {
    }

    public Class_27203(int n, Class_7873 class_7873) {
        this.Field_27205 = n;
        this.Field_27204 = class_7873 == null ? "" : class_7873.Method_7881();
    }

    public void Method_27210(Class_14856 class_14856) {
        class_14856.Method_14909(this);
    }

    public void Method_27211(Class_29900 class_29900) {
        this.Field_27205 = class_29900.Method_29944();
        this.Field_27204 = class_29900.Method_29991(16785 & 4658);
    }

    public String Method_27212() {
        return this.Field_27204;
    }
}

