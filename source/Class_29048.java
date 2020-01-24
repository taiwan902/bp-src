/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_29048
implements Class_1486 {
    private int Field_29049;
    private short Field_29050;
    private boolean Field_29051;

    public void Method_29052(Class_29900 class_29900) {
        class_29900.Method_29949(this.Field_29049);
        class_29900.Method_29922(this.Field_29050);
        class_29900.Method_29949(this.Field_29051 ? 8777 & 23 : 4393 & 1030);
    }

    public void Method_29053(Class_10930 class_10930) {
        class_10930.Method_10942(this);
    }

    private void Method_29054() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public short Method_29055() {
        return this.Field_29050;
    }

    public int Method_29056() {
        return this.Field_29049;
    }

    public Class_29048() {
    }

    public Class_29048(int n, short s, boolean bl) {
        this.Field_29049 = n;
        this.Field_29050 = s;
        this.Field_29051 = bl;
    }

    public void Method_29057(Class_29900 class_29900) {
        this.Field_29049 = class_29900.Method_29944();
        this.Field_29050 = class_29900.Method_30008();
        this.Field_29051 = class_29900.Method_29944() != 0 ? -30711 & 13317 : -32560 & 25600;
    }

    public void Method_29058(Class_10954 class_10954) {
        this.Method_29053((Class_10930)class_10954);
    }
}

