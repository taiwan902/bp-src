/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_16340
implements Comparable {
    public String Field_16341;
    public double Field_16342;
    public double Field_16343;

    public int Method_16344(Object object) {
        return this.Method_16345((Class_16340)object);
    }

    public int Method_16345(Class_16340 class_16340) {
        return class_16340.Field_16342 < this.Field_16342 ? -1 & -1 : (class_16340.Field_16342 > this.Field_16342 ? 11781 & 16387 : class_16340.Field_16341.compareTo(this.Field_16341));
    }

    private void Method_16346() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_16340(String string, double d, double d2) {
        this.Field_16341 = string;
        this.Field_16342 = d;
        this.Field_16343 = d2;
    }

    public int Method_16347() {
        return (this.Field_16341.hashCode() & (12238571 & 1139518382)) + (1086604404 & 894760517);
    }
}

