/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_7873 {
    private final String Field_7874;
    private Class_43298 Field_7875;
    private final Class_20976 Field_7876;
    private String Field_7877;
    private final Class_27930 Field_7878;

    public Class_7873(Class_20976 class_20976, String string, Class_27930 class_27930) {
        this.Field_7876 = class_20976;
        this.Field_7874 = string;
        this.Field_7878 = class_27930;
        this.Field_7877 = string;
        this.Field_7875 = class_27930.Method_27941();
    }

    public void Method_7879(String string) {
        this.Field_7877 = string;
        this.Field_7876.Method_21005(this);
    }

    public Class_43298 Method_7880() {
        return this.Field_7875;
    }

    public String Method_7881() {
        return this.Field_7874;
    }

    public void Method_7882(Class_43298 class_43298) {
        this.Field_7875 = class_43298;
        this.Field_7876.Method_21005(this);
    }

    public Class_27930 Method_7883() {
        return this.Field_7878;
    }

    public Class_20976 Method_7884() {
        return this.Field_7876;
    }

    private void Method_7885() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_7886() {
        return this.Field_7877;
    }
}

