/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33140
extends Class_32797 {
    private boolean Field_33141 = 12576 & 1034;
    protected Class_1061 Field_33142;

    public boolean Method_33143() {
        return this.Field_33141;
    }

    public Class_33140 Method_33144() {
        this.Field_33141 = 2145 & 149;
        return this;
    }

    public boolean Method_33145() {
        return (this.Field_33142 != null && this.Field_33142 instanceof Class_859 && !(this.Field_33142 instanceof Class_626) ? 10787 & -27643 : 416 & 9288) != 0;
    }

    public Class_1061 Method_33146() {
        return this.Field_33142;
    }

    public Class_33140(String string, Class_1061 class_1061) {
        super(string);
        this.Field_33142 = class_1061;
    }

    private void Method_33147() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1782 Method_33148(Class_859 class_859) {
        Class_2849 class_2849;
        Class_23823 class_23823 = this.Field_33142 instanceof Class_859 ? ((Class_859)this.Field_33142).Method_1010() : null;
        String string = "death.attack." + this.\u0000strictfp;
        String string2 = string + ".item";
        if (class_23823 != null && class_23823.Method_23851() && Class_7594.Method_7599(string2)) {
            Object[] arrobject;
            class_2849 = new Class_2849(string2, arrobject);
            arrobject = new Object[2071 & 1795];
            arrobject[-19967 & 200] = class_859.\u0000strictfp();
            arrobject[-28607 & 785] = this.Field_33142.Method_1232();
            arrobject[17030 & 3107] = class_23823.Method_23900();
        } else {
            Object[] arrobject;
            class_2849 = new Class_2849(string, arrobject);
            arrobject = new Object[-28554 & 1666];
            arrobject[-31743 & 12420] = class_859.\u0000strictfp();
            arrobject[-24285 & 1217] = this.Field_33142.Method_1232();
        }
        return class_2849;
    }
}

