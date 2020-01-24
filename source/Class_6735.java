/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_6735 {
    private long Field_6736;
    private final Class_31916 Field_6737;
    private List Field_6738 = Lists.newArrayList();
    private Class_14376 Field_6739 = new Class_14376();

    private void Method_6740() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_6741() {
        long l = Class_2457.Method_2513();
        long l2 = l - this.Field_6736;
        if (l2 > (1087774028L & 403283276L) || l2 < (5301265334451246088L & 302006820L)) {
            this.Field_6736 = l;
            for (int i = 0 & -27852; i < this.Field_6738.size(); ++i) {
                Class_23717 class_23717 = (Class_23717)this.Field_6738.get(i);
                long l3 = l - class_23717.Field_23722;
                if (l3 <= (1074296240L & 194114930L) && l3 >= (-5883888149345580784L & 172228744L)) continue;
                this.Field_6738.remove(i--);
                long l4 = (long)class_23717.Field_23721 & (0xFFFFFFFFL & 0xFFFFFFFFL) | ((long)class_23717.Field_23720 & (-4670478872259592193L & 4670478876554559487L)) << (26658 & 1072);
                this.Field_6739.Method_14387(l4);
            }
        }
    }

    public Class_23717 Method_6742(int n, int n2) {
        long l = (long)(n >>= 6540 & -31228) & (8876642290576130047L & 0xFFFFFFFFL) | ((long)(n2 >>= 198 & -18675) & (0xFFFFFFFFL & -2623046014973509633L)) << (-32152 & 5300);
        Class_23717 class_23717 = (Class_23717)this.Field_6739.Method_14384(l);
        if (class_23717 == null) {
            class_23717 = new Class_23717(this, n, n2);
            this.Field_6739.Method_14393(l, class_23717);
            this.Field_6738.add(class_23717);
        }
        class_23717.Field_23722 = Class_2457.Method_2513();
        return class_23717;
    }

    public Class_6735(Class_31916 class_31916) {
        this.Field_6737 = class_31916;
    }

    public Class_17281 Method_6743(int n, int n2, Class_17281 class_17281) {
        Class_17281 class_172812 = this.Method_6742(n, n2).Method_23724(n, n2);
        return class_172812 == null ? class_17281 : class_172812;
    }

    static Class_31916 Method_6744(Class_6735 class_6735) {
        return class_6735.Field_6737;
    }

    public Class_17281[] Method_6745(int n, int n2) {
        return this.Method_6742((int)n, (int)n2).Field_23719;
    }
}

