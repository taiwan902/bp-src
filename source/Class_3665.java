/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;

public class Class_3665
implements Class_3656 {
    private Class_3677[] Field_3666 = new Class_3677[470 & 25];
    private final IdentityHashMap Field_3667 = new IdentityHashMap(-32150 & 18177);
    private int Field_3668;

    public int Method_3669() {
        return this.Field_3668;
    }

    public void Method_3670(Class_3677 class_3677, int n) {
        this.Field_3667.put(class_3677, n);
        while (this.Field_3668 <= n) {
            this.Method_3676(null);
        }
        this.Field_3666[n] = class_3677;
    }

    private void Method_3671() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_3672(Class_3677 class_3677) {
        Integer n = (Integer)this.Field_3667.get(class_3677);
        return n == null ? -1 & -1 : n;
    }

    private void Method_3673(int n) {
        Class_3677[] arrclass_3677 = new Class_3677[n];
        System.arraycopy(this.Field_3666, 16666 & -30684, arrclass_3677, 4122 & 16512, Math.min(this.Field_3668, n));
        this.Field_3666 = arrclass_3677;
    }

    public Iterator Method_3674() {
        ArrayList<Class_3677> arrayList = new ArrayList<Class_3677>();
        for (int i = 4232 & 8981; i < this.Field_3668; ++i) {
            if (this.Field_3666[i] == null) continue;
            arrayList.add(this.Field_3666[i]);
        }
        return arrayList.iterator();
    }

    public final Class_3677 Method_3675(int n) {
        return n >= 0 && n < this.Field_3668 ? this.Field_3666[n] : null;
    }

    private void Method_3676(Class_3677 class_3677) {
        if (this.Field_3668 + (2113 & 8713) >= this.Field_3666.length) {
            this.Method_3673(this.Field_3666.length * (-24030 & 19474));
        }
        int n = this.Field_3668;
        this.Field_3668 = n + (21523 & -31991);
        this.Field_3666[n] = class_3677;
    }
}

