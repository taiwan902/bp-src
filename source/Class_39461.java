/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_39461
implements Class_1486 {
    private int Field_39462;
    private Class_32274 Field_39463;
    private Class_1782 Field_39464;
    private int Field_39465;
    private int Field_39466;

    private void Method_39467() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1782 Method_39468() {
        return this.Field_39464;
    }

    public Class_39461(Class_32274 class_32274, Class_1782 class_1782, int n, int n2, int n3) {
        this.Field_39463 = class_32274;
        this.Field_39464 = class_1782;
        this.Field_39466 = n;
        this.Field_39462 = n2;
        this.Field_39465 = n3;
    }

    public Class_39461() {
    }

    public int Method_39469() {
        return this.Field_39462;
    }

    public void Method_39470(Class_10954 class_10954) {
        this.Method_39476((Class_14856)class_10954);
    }

    public Class_39461(int n, int n2, int n3) {
        this(Class_32274.Field_32277, null, n, n2, n3);
    }

    public void Method_39471(Class_29900 class_29900) {
        this.Field_39463 = (Class_32274)class_29900.Method_30009(Class_32274.class);
        if (this.Field_39463 == Class_32274.Field_32276 || this.Field_39463 == Class_32274.Field_32279) {
            this.Field_39464 = class_29900.Method_30020();
        }
        if (this.Field_39463 == Class_32274.Field_32277) {
            this.Field_39466 = class_29900.Method_29914();
            this.Field_39462 = class_29900.Method_29914();
            this.Field_39465 = class_29900.Method_29914();
        }
    }

    public Class_39461(Class_32274 class_32274, Class_1782 class_1782) {
        this(class_32274, class_1782, -1 & -1, -1 & -1, -1 & -1);
    }

    public int Method_39472() {
        return this.Field_39465;
    }

    public int Method_39473() {
        return this.Field_39466;
    }

    public Class_32274 Method_39474() {
        return this.Field_39463;
    }

    public void Method_39475(Class_29900 class_29900) {
        class_29900.Method_29964(this.Field_39463);
        if (this.Field_39463 == Class_32274.Field_32276 || this.Field_39463 == Class_32274.Field_32279) {
            class_29900.Method_29930(this.Field_39464);
        }
        if (this.Field_39463 == Class_32274.Field_32277) {
            class_29900.Method_30010(this.Field_39466);
            class_29900.Method_30010(this.Field_39462);
            class_29900.Method_30010(this.Field_39465);
        }
    }

    public void Method_39476(Class_14856 class_14856) {
        class_14856.Method_14917(this);
    }
}

