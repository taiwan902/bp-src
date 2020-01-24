/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_15247
implements Comparable {
    private final String Field_15248;
    private final String Field_15249;
    private final String Field_15250;
    private final boolean Field_15251;

    public boolean Method_15252(Object object) {
        return (this == object ? 1157 & 22537 : (!(object instanceof Class_15247) ? 4352 & -29561 : (int)(this.Field_15249.equals(((Class_15247)object).Field_15249) ? 1 : 0))) != 0;
    }

    public boolean Method_15253() {
        return this.Field_15251;
    }

    public int Method_15254() {
        return this.Field_15249.hashCode();
    }

    public int Method_15255(Object object) {
        return this.Method_15257((Class_15247)object);
    }

    public String Method_15256() {
        Object[] arrobject = new Object[7218 & -16254];
        arrobject[-32764 & 16432] = this.Field_15250;
        arrobject[16421 & 4425] = this.Field_15248;
        return String.format("%s (%s)", arrobject);
    }

    public int Method_15257(Class_15247 class_15247) {
        return this.Field_15249.compareTo(class_15247.Field_15249);
    }

    public Class_15247(String string, String string2, String string3, boolean bl) {
        this.Field_15249 = string;
        this.Field_15248 = string2;
        this.Field_15250 = string3;
        this.Field_15251 = bl;
    }

    public String Method_15258() {
        return this.Field_15249;
    }

    private void Method_15259() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

