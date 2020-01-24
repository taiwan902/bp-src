/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_35765
extends Class_29579 {
    private boolean Field_35766;
    final Class_44525 Field_35767;
    private Class_44525 Field_35768;

    private void Method_35769() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_35770(boolean bl) {
        this.Field_35766 = bl;
    }

    public Class_35765(Class_44525 class_44525, Class_44525 class_445252) {
        this.Field_35767 = class_44525;
        super(class_445252);
        this.Field_35766 = -32767 & 29088;
        this.Field_35768 = class_445252;
    }

    public boolean Method_35771() {
        return this.\u0000strictfp;
    }

    public void Method_35772() {
        if (this.\u0000strictfp) {
            this.Field_35768.Method_44570(Class_14002.Field_14005);
            this.\u0000strictfp = 10513 & 18016;
        }
    }

    public boolean Method_35773() {
        return this.Field_35766;
    }
}

