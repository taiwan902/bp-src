/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_3166 {
    private Class_21330 Field_3167;
    private Class_1782 Field_3168;
    private Class_13307 Field_3169;
    private String Field_3170;

    public void Method_3171(Class_13307 class_13307) {
        this.Field_3169 = class_13307;
    }

    public String Method_3172() {
        return this.Field_3170;
    }

    private void Method_3173() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_21330 Method_3174() {
        return this.Field_3167;
    }

    public Class_1782 Method_3175() {
        return this.Field_3168;
    }

    public Class_13307 Method_3176() {
        return this.Field_3169;
    }

    public void Method_3177(Class_1782 class_1782) {
        this.Field_3168 = class_1782;
    }

    public void Method_3178(String string) {
        this.Field_3170 = string;
    }

    public void Method_3179(Class_21330 class_21330) {
        this.Field_3167 = class_21330;
    }
}

