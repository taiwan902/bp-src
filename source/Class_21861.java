/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_21861
implements Class_1486 {
    private int Field_21862;
    private int Field_21863;
    private int Field_21864;

    public void Method_21865(Class_29900 class_29900) {
        this.Field_21862 = class_29900.Method_30016();
        this.Field_21864 = class_29900.Method_30008();
        this.Field_21863 = class_29900.Method_30008();
    }

    public int Method_21866() {
        return this.Field_21863;
    }

    private void Method_21867() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_21868(Class_29900 class_29900) {
        class_29900.Method_29949(this.Field_21862);
        class_29900.Method_29922(this.Field_21864);
        class_29900.Method_29922(this.Field_21863);
    }

    public Class_21861(int n, int n2, int n3) {
        this.Field_21862 = n;
        this.Field_21864 = n2;
        this.Field_21863 = n3;
    }

    public int Method_21869() {
        return this.Field_21862;
    }

    public void Method_21870(Class_14856 class_14856) {
        class_14856.Method_14885(this);
    }

    public int Method_21871() {
        return this.Field_21864;
    }

    public Class_21861() {
    }

    public void Method_21872(Class_10954 class_10954) {
        this.Method_21870((Class_14856)class_10954);
    }
}

