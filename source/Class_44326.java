/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_44326
extends Class_43984 {
    private Class_22553 Field_44327;
    private Class_33149 Field_44328;

    protected void Method_44329(Class_39158 class_39158, Object object) {
        this.Method_44332(class_39158, (Class_11915)object);
    }

    private void Method_44330(Class_39158 class_39158) {
        try {
            this.Field_44328.Method_33154(this.Field_44327);
        }
        finally {
            class_39158.Method_39175().Method_26111();
        }
    }

    private void Method_44331() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_44332(Class_39158 class_39158, Class_11915 class_11915) {
        Class_11915 class_119152;
        if (class_11915 instanceof Class_37974) {
            class_119152 = (Class_37974)class_11915;
            int n = class_119152.Method_37975().Method_7129();
            if (n == Class_7065.Field_7072.Method_7129()) {
                this.Method_44330(class_39158);
                return;
            }
            if (n != Class_7065.Field_7094.Method_7129()) {
                throw new IllegalStateException("Expected HTTP response 200 OK, got " + class_119152.Method_37975());
            }
        }
        if (class_11915 instanceof Class_41723) {
            class_119152 = (Class_41723)class_11915;
            this.Field_44327.Method_22631(class_119152.content());
            if (class_11915 instanceof Class_44416) {
                this.Method_44330(class_39158);
            }
        }
    }

    public void Method_44333(Class_39158 class_39158, Throwable throwable) {
        try {
            this.Field_44328.Method_33152(throwable);
        }
        finally {
            class_39158.Method_39175().Method_26111();
        }
    }

    public Class_44326(Class_33149 class_33149) {
        this.Field_44328 = class_33149;
        this.Field_44327 = Class_16620.Method_16633();
    }
}

