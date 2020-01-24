/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_23014 {
    private Class_4751 Field_23015;
    private int Field_23016;
    private Class_3238 Field_23017;
    private int Field_23018;

    public boolean Method_23019(Object object) {
        if (!(object instanceof Class_23014)) {
            return (-31476 & 576) != 0;
        }
        Class_23014 class_23014 = (Class_23014)object;
        return (this.Field_23015.equals(class_23014.Field_23015) && this.Field_23018 == class_23014.Field_23018 && this.Field_23016 == class_23014.Field_23016 && this.Field_23017 == class_23014.Field_23017 ? 14897 & 17481 : 10752 & 20524) != 0;
    }

    public int Method_23020() {
        return this.Field_23018;
    }

    public Class_4751 Method_23021() {
        return this.Field_23015;
    }

    public Class_23014(Class_4751 class_4751, Class_3238 class_3238, int n, int n2) {
        this.Field_23015 = class_4751;
        this.Field_23018 = n;
        this.Field_23016 = n2;
        this.Field_23017 = class_3238;
    }

    private void Method_23022() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_23023() {
        return "TE(" + this.Field_23015 + ")," + this.Field_23018 + "," + this.Field_23016 + "," + this.Field_23017;
    }

    public int Method_23024() {
        return this.Field_23016;
    }

    public Class_3238 Method_23025() {
        return this.Field_23017;
    }
}

