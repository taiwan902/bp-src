/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_20362 {
    private Class_28316 Field_20363;
    private Class_7479 Field_20364;
    private String Field_20365;
    private Class_27269 Field_20366;
    private Class_40254 Field_20367;
    private Class_29059 Field_20368;

    public String Method_20369() {
        return this.Field_20365;
    }

    public Class_28316 Method_20370() {
        return this.Field_20363;
    }

    public Class_20362(Class_7479 class_7479, Class_27269 class_27269, Class_29059 class_29059, String string, Class_28316 class_28316) {
        this.Field_20364 = class_7479;
        this.Field_20366 = class_27269;
        this.Field_20368 = class_29059;
        this.Field_20365 = string;
        this.Field_20363 = class_28316;
    }

    public Class_29059 Method_20371() {
        return this.Field_20368;
    }

    public Class_20362() {
        this.Field_20364 = Class_7479.Field_7482;
        this.Field_20366 = Class_27269.Field_27270;
        this.Field_20368 = Class_29059.Field_29061;
        this.Field_20365 = null;
        this.Field_20363 = Class_28316.Field_28320;
    }

    public Class_40254 Method_20372() {
        return this.Field_20367;
    }

    private void Method_20373() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

