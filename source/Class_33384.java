/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33384
implements Class_1486 {
    private float Field_33385;
    private boolean Field_33386;
    private boolean Field_33387;
    private float Field_33388;

    public void Method_33389(Class_29900 class_29900) {
        this.Field_33385 = class_29900.Method_29966();
        this.Field_33388 = class_29900.Method_29966();
        byte by = class_29900.Method_29944();
        this.Field_33387 = (by & (4357 & -16301)) > 0 ? 18737 & -23931 : -31610 & 31009;
        this.Field_33386 = (by & (4250 & 19462)) > 0 ? 5137 & 321 : -30648 & 17442;
    }

    public float Method_33390() {
        return this.Field_33388;
    }

    public void Method_33391(Class_29900 class_29900) {
        class_29900.Method_29939(this.Field_33385);
        class_29900.Method_29939(this.Field_33388);
        int n = 0 & 6192;
        if (this.Field_33387) {
            n = (byte)(n | -3389 & 9);
        }
        if (this.Field_33386) {
            n = (byte)(n | 1098 & 20499);
        }
        class_29900.Method_29949(n);
    }

    public boolean Method_33392() {
        return this.Field_33386;
    }

    public float Method_33393() {
        return this.Field_33385;
    }

    public Class_33384(float f, float f2, boolean bl, boolean bl2) {
        this.Field_33385 = f;
        this.Field_33388 = f2;
        this.Field_33387 = bl;
        this.Field_33386 = bl2;
    }

    public Class_33384() {
    }

    public void Method_33394(Class_10930 class_10930) {
        class_10930.Method_10945(this);
    }

    public void Method_33395(Class_10954 class_10954) {
        this.Method_33394((Class_10930)class_10954);
    }

    private void Method_33396() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_33397() {
        return this.Field_33387;
    }
}

