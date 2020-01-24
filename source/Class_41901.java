/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;

public class Class_41901
extends Class_27841 {
    private final List Field_41902 = Lists.newArrayList();
    private final List Field_41903 = Lists.newArrayList();
    private Class_283 Field_41904;
    private final List Field_41905 = Lists.newArrayList();
    private int Field_41906;

    public Class_41901(String string) {
        super(string);
    }

    public static String Method_41907(Class_18343 class_18343) {
        return "villages" + class_18343.Method_18358();
    }

    private boolean Method_41908(Class_4751 class_4751) {
        Class_3238 class_3238 = this.Field_41904.Method_375(class_4751).Method_3442();
        return (class_3238 instanceof Class_16100 ? (class_3238.Method_3373() == Class_3713.Field_3723 ? -24027 & 21521 : 256 & 8808) : 8992 & -9212) != 0;
    }

    private boolean Method_41909(Class_4751 class_4751) {
        for (Class_4751 class_47512 : this.Field_41903) {
            if (!class_47512.equals(class_4751)) continue;
            return (3073 & 4871) != 0;
        }
        return (833 & -24576) != 0;
    }

    public Class_20407 Method_41910(Class_4751 class_4751, int n) {
        Class_20407 class_20407 = null;
        double d = 0.30851063829787234 * 1.1029841580697143E39;
        for (Class_20407 class_204072 : this.Field_41902) {
            float f;
            double d2 = class_204072.Method_20452().\u0000strictfp((Class_4792)class_4751);
            if (!(d2 < d) || !(d2 <= (double)((f = (float)(n + class_204072.Method_20435())) * f))) continue;
            class_20407 = class_204072;
            d = d2;
        }
        return class_20407;
    }

    private void Method_41911(Class_4751 class_4751) {
        int n;
        Class_4595 class_4595 = Class_16100.Method_16113(this.Field_41904, class_4751);
        Class_4595 class_45952 = class_4595.Method_4660();
        int n2 = this.Method_41917(class_4751, class_4595, 421 & -18931);
        if (n2 != (n = this.Method_41917(class_4751, class_45952, n2 + (4609 & -31519)))) {
            this.Field_41905.add(new Class_38163(class_4751, n2 < n ? class_4595 : class_45952, this.Field_41906));
        }
    }

    public List Method_41912() {
        return this.Field_41902;
    }

    private void Method_41913() {
        for (int i = 28032 & 4104; i < this.Field_41905.size(); ++i) {
            Class_38163 class_38163 = (Class_38163)this.Field_41905.get(i);
            Class_20407 class_20407 = this.Method_41910(class_38163.Method_38176(), -20448 & 3876);
            if (class_20407 == null) {
                class_20407 = new Class_20407(this.Field_41904);
                this.Field_41902.add(class_20407);
                this.\u0000, `();
            }
            class_20407.Method_20434(class_38163);
        }
        this.Field_41905.clear();
    }

    public Class_41901(Class_283 class_283) {
        super(Class_41901.Method_41907(class_283.Field_284));
        this.Field_41904 = class_283;
        this.\u0000, `();
    }

    public void Method_41914(Class_1699 class_1699) {
        class_1699.Method_1739("Tick", this.Field_41906);
        Class_1758 class_1758 = new Class_1758();
        for (Class_20407 class_20407 : this.Field_41902) {
            Class_1699 class_16992 = new Class_1699();
            class_20407.Method_20425(class_16992);
            class_1758.Method_1781(class_16992);
        }
        class_1699.Method_1744("Villages", class_1758);
    }

    private void Method_41915() {
        Iterator iterator = this.Field_41902.iterator();
        while (iterator.hasNext()) {
            Class_20407 class_20407 = (Class_20407)iterator.next();
            if (!class_20407.Method_20447()) continue;
            iterator.remove();
            this.\u0000, `();
        }
    }

    private Class_38163 Method_41916(Class_4751 class_4751) {
        for (Object object : this.Field_41905) {
            if (((Class_38163)object).Method_38176().\u0000= final() != class_4751.\u0000= final() || ((Class_38163)object).Method_38176().\u0000strictfp() != class_4751.\u0000strictfp() || Math.abs(((Class_38163)object).Method_38176().\u0000, `() - class_4751.\u0000, `()) > (101 & -23399)) continue;
            return object;
        }
        for (Object object : this.Field_41902) {
            Class_38163 class_38163 = ((Class_20407)object).Method_20432(class_4751);
            if (class_38163 == null) continue;
            return class_38163;
        }
        return null;
    }

    private int Method_41917(Class_4751 class_4751, Class_4595 class_4595, int n) {
        int n2 = 1280 & 2225;
        for (int i = 513 & 1283; i <= (22533 & -32379); ++i) {
            if (!this.Field_41904.Method_398(class_4751.Method_4776(class_4595, i)) || ++n2 < n) continue;
            return n2;
        }
        return n2;
    }

    private void Method_41918() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_41919() {
        this.Field_41906 += 28951 & 3265;
        for (Class_20407 class_20407 : this.Field_41902) {
            class_20407.Method_20439(this.Field_41906);
        }
        this.Method_41915();
        this.Method_41923();
        this.Method_41913();
        if (this.Field_41906 % (20884 & 11738) == 0) {
            this.\u0000, `();
        }
    }

    public void Method_41920(Class_1699 class_1699) {
        this.Field_41906 = class_1699.Method_1738("Tick");
        Class_1758 class_1758 = class_1699.Method_1735("Villages", 3626 & 12298);
        for (int i = 22729 & -32768; i < class_1758.Method_1772(); ++i) {
            Class_1699 class_16992 = class_1758.Method_1768(i);
            Class_20407 class_20407 = new Class_20407();
            class_20407.Method_20423(class_16992);
            this.Field_41902.add(class_20407);
        }
    }

    private void Method_41921(Class_4751 class_4751) {
        int n = 1049 & 8208;
        int n2 = 10668 & -31724;
        int n3 = 5330 & 528;
        for (int i = -n; i < n; ++i) {
            for (int j = -n2; j < n2; ++j) {
                for (int k = -n3; k < n3; ++k) {
                    Class_4751 class_47512 = class_4751.Method_4791(i, j, k);
                    if (!this.Method_41908(class_47512)) continue;
                    Class_38163 class_38163 = this.Method_41916(class_47512);
                    if (class_38163 == null) {
                        this.Method_41911(class_47512);
                        continue;
                    }
                    class_38163.Method_38185(this.Field_41906);
                }
            }
        }
    }

    public void Method_41922(Class_4751 class_4751) {
        if (this.Field_41903.size() <= (65 & 17094) && !this.Method_41909(class_4751)) {
            this.Field_41903.add(class_4751);
        }
    }

    private void Method_41923() {
        if (!this.Field_41903.isEmpty()) {
            this.Method_41921((Class_4751)this.Field_41903.remove(8320 & 2119));
        }
    }

    public void Method_41924(Class_283 class_283) {
        this.Field_41904 = class_283;
        for (Class_20407 class_20407 : this.Field_41902) {
            class_20407.Method_20438(class_283);
        }
    }
}

