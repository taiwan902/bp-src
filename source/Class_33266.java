/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33266
implements Class_1486 {
    private Class_23823 Field_33267;
    private int Field_33268;
    private int Field_33269;
    private short Field_33270;
    private int Field_33271;
    private int Field_33272;

    public Class_33266() {
    }

    public void Method_33273(Class_10954 class_10954) {
        this.Method_33279((Class_10930)class_10954);
    }

    public int Method_33274() {
        return this.Field_33271;
    }

    public Class_23823 Method_33275() {
        return this.Field_33267;
    }

    public int Method_33276() {
        return this.Field_33268;
    }

    public short Method_33277() {
        return this.Field_33270;
    }

    public void Method_33278(Class_29900 class_29900) {
        class_29900.Method_29949(this.Field_33269);
        class_29900.Method_29922(this.Field_33272);
        class_29900.Method_29949(this.Field_33268);
        class_29900.Method_29922(this.Field_33270);
        class_29900.Method_29949(this.Field_33271);
        class_29900.Method_29984(this.Field_33267);
    }

    public void Method_33279(Class_10930 class_10930) {
        class_10930.Method_10938(this);
    }

    public void Method_33280(Class_29900 class_29900) {
        this.Field_33269 = class_29900.Method_29944();
        this.Field_33272 = class_29900.Method_30008();
        this.Field_33268 = class_29900.Method_29944();
        this.Field_33270 = class_29900.Method_30008();
        this.Field_33271 = class_29900.Method_29944();
        this.Field_33267 = class_29900.Method_30002();
    }

    public Class_33266(int n, int n2, int n3, int n4, Class_23823 class_23823, short s) {
        this.Field_33269 = n;
        this.Field_33272 = n2;
        this.Field_33268 = n3;
        this.Field_33267 = class_23823 != null ? class_23823.Method_23850() : null;
        this.Field_33270 = s;
        this.Field_33271 = n4;
    }

    public int Method_33281() {
        return this.Field_33272;
    }

    public int Method_33282() {
        return this.Field_33269;
    }

    private void Method_33283() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

