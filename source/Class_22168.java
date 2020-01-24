/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_22168
implements Class_1486 {
    public int Field_22169;
    private byte Field_22170;
    private Class_1782 Field_22171;

    public void Method_22172(Class_29900 class_29900) {
        class_29900.Method_29930(this.Field_22171);
        class_29900.Method_29949(this.Field_22170);
    }

    public void Method_22173(Class_14856 class_14856) {
        class_14856.Method_14904(this);
    }

    public Class_22168() {
    }

    private void Method_22174() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public byte Method_22175() {
        return this.Field_22170;
    }

    public Class_22168(Class_1782 class_1782, byte by) {
        this.Field_22171 = class_1782;
        this.Field_22170 = by;
    }

    public void Method_22176(Class_29900 class_29900) {
        this.Field_22171 = class_29900.Method_30020();
        this.Field_22170 = class_29900.Method_29944();
        this.Field_22169 = class_29900.Method_29992() ? class_29900.Method_30004() : -16350 & 8257;
    }

    public void Method_22177(Class_10954 class_10954) {
        this.Method_22173((Class_14856)class_10954);
    }

    public Class_1782 Method_22178() {
        return this.Field_22171;
    }

    public Class_22168(Class_1782 class_1782) {
        this(class_1782, (byte)(11011 & 16405));
    }

    public boolean Method_22179() {
        return (this.Field_22170 == (545 & -18293) || this.Field_22170 == (-32765 & 4650) ? -30719 & 12313 : 12851 & 2056) != 0;
    }
}

