/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Class_37452
implements Class_29081 {
    private int Field_37453 = Integer.MAX_VALUE & Integer.MAX_VALUE;
    private Class_18434[] Field_37454;
    private Class_18434[] Field_37455;
    private Class_18434[] Field_37456;
    private static final Class_18434[] Field_37457 = new Class_18434[4100 & -15839];

    public Class_37452 Method_37458(int n) {
        return new Class_37452(this.Field_37455, this.Field_37454, this.Field_37456, n);
    }

    public Class_37452 Method_37459(Class_18434 ... arrclass_18434) {
        return new Class_37452(this.Field_37455, arrclass_18434, this.Field_37456);
    }

    public Class_37452(Class_18434[] arrclass_18434, Class_18434[] arrclass_184342, Class_18434[] arrclass_184343, int n) {
        this.Field_37455 = Class_37452.Method_37463(arrclass_18434);
        this.Field_37454 = Class_37452.Method_37463(arrclass_184342);
        this.Field_37456 = Class_37452.Method_37463(arrclass_184343);
        this.Field_37453 = n;
    }

    public Class_37452() {
        this(null, null, null);
    }

    public Class_37452 Method_37460(Class_18434 ... arrclass_18434) {
        return new Class_37452(this.Field_37455, this.Field_37454, arrclass_18434);
    }

    public Class_37452(Class_18434[] arrclass_18434, Class_18434[] arrclass_184342, Class_18434[] arrclass_184343) {
        this(arrclass_18434, arrclass_184342, arrclass_184343, -1 & Integer.MAX_VALUE);
    }

    public Class_37452 Method_37461(Class_18434 ... arrclass_18434) {
        return new Class_37452(arrclass_18434, this.Field_37454, this.Field_37456);
    }

    private void Method_37462() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static Class_18434[] Method_37463(Class_18434[] arrclass_18434) {
        return arrclass_18434 == null ? Field_37457 : arrclass_18434;
    }

    public Class_18434[] Method_37464(Class_13745[] arrclass_13745) {
        int n = this.Field_37455.length + this.Field_37456.length;
        int n2 = arrclass_13745.length - n;
        int n3 = 1063 & 22592;
        int n4 = 12324 & 1;
        while (n4 + this.Field_37454.length <= n2 && n + n4 + this.Field_37454.length <= this.Field_37453) {
            ++n3;
            n4 += this.Field_37454.length;
        }
        ArrayList<Class_18434> arrayList = new ArrayList<Class_18434>();
        arrayList.addAll(Arrays.asList(this.Field_37455));
        for (int i = -28656 & 19616; i < n3; ++i) {
            arrayList.addAll(Arrays.asList(this.Field_37454));
        }
        arrayList.addAll(Arrays.asList(this.Field_37456));
        Class_18434[] arrclass_18434 = arrayList.toArray((T[])new Class_18434[arrayList.size()]);
        return arrclass_18434;
    }
}

