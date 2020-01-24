/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_40509 {
    private String Field_40510;
    private float Field_40511 = 1.0f;
    private boolean Field_40512 = 2560 & 5409;
    private int Field_40513 = 517 & -26613;
    private float Field_40514 = 1.0f;
    private Class_36228 Field_40515 = Class_36228.Field_36230;

    public int Method_40516() {
        return this.Field_40513;
    }

    public float Method_40517() {
        return this.Field_40511;
    }

    public void Method_40518(float f) {
        this.Field_40511 = f;
    }

    public void Method_40519(boolean bl) {
        this.Field_40512 = bl;
    }

    public float Method_40520() {
        return this.Field_40514;
    }

    public void Method_40521(float f) {
        this.Field_40514 = f;
    }

    private void Method_40522() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_40523(Class_36228 class_36228) {
        this.Field_40515 = class_36228;
    }

    public void Method_40524(int n) {
        this.Field_40513 = n;
    }

    public String Method_40525() {
        return this.Field_40510;
    }

    public Class_36228 Method_40526() {
        return this.Field_40515;
    }

    public void Method_40527(String string) {
        this.Field_40510 = string;
    }

    public boolean Method_40528() {
        return this.Field_40512;
    }
}

