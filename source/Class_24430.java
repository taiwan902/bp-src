/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_24430
implements Class_22368 {
    private boolean Field_24431;
    private final String Field_24432;
    private final Class_22368 Field_24433;
    private final Class_2190 Field_24434;

    public double Method_24435() {
        return this.Field_24434.Method_2199();
    }

    public boolean Method_24436() {
        return this.Field_24431;
    }

    public Class_22368 Method_24437() {
        return this.Field_24433;
    }

    public Class_24430 Method_24438(boolean bl) {
        this.Field_24431 = bl;
        return this;
    }

    protected Class_24430(Class_22368 class_22368, String string, double d) {
        this.Field_24433 = class_22368;
        this.Field_24432 = string;
        this.Field_24434 = new Class_2190(d, Class_2205.Field_2234);
        if (string == null) {
            throw new IllegalArgumentException("Name cannot be null!");
        }
    }

    public int Method_24439() {
        return this.Field_24432.hashCode();
    }

    public boolean Method_24440(Object object) {
        return (object instanceof Class_22368 && this.Field_24432.equals(((Class_22368)object).Method_22373()) ? 16545 & 321 : 8208 & 6477) != 0;
    }

    public String Method_24441() {
        return this.Field_24432;
    }

    private void Method_24442() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

