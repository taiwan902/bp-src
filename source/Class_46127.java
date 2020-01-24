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

public class Class_46127
extends Class_31144 {
    private final Class_27772 Field_46128;
    private final List Field_46129 = Lists.newArrayList();
    private final List Field_46130 = Lists.newArrayList();
    private int Field_46131 = -1 & -1;
    private final Class_14246 Field_46132 = new Class_15466(this);

    protected int Method_46133() {
        return this.Field_46129.size() + (10023 & 22593) + this.Field_46130.size();
    }

    public void Method_46134(int n) {
        this.Field_46131 = n;
        if (this.Field_46131 >= this.Method_46133()) {
            this.Field_46131 = -1 & -1;
        }
    }

    public Class_14246 Method_46135(int n) {
        if (n < this.Field_46129.size()) {
            return (Class_14246)this.Field_46129.get(n);
        }
        if ((n -= this.Field_46129.size()) == 0) {
            return this.Field_46132;
        }
        if (--n < this.Field_46130.size()) {
            return (Class_14246)this.Field_46130.get(n);
        }
        return null;
    }

    public void Method_46136(List list) {
        this.Field_46130.clear();
        for (Class_32525 class_32525 : list) {
            this.Field_46130.add(new Class_32533(this.Field_46128, class_32525));
        }
    }

    public void Method_46137(Class_22674 class_22674) {
        this.Field_46129.clear();
        for (int i = -28670 & 2624; i < class_22674.Method_22685(); ++i) {
            Class_15474 class_15474 = class_22674.Method_22680(i);
            if (class_15474.Field_15488 && class_15474.Method_15493()) continue;
            this.Field_46129.add(new Class_20310(this.Field_46128, class_15474, i));
        }
    }

    public int Method_46138() {
        return this.Field_46131;
    }

    protected boolean Method_46139(int n) {
        return (n == this.Field_46131 ? 3345 & 16961 : 5120 & 8608) != 0;
    }

    protected int Method_46140() {
        return super.\u0000strictfp() + (1054 & -10209);
    }

    public Class_46127(Class_27772 class_27772, Class_18 class_18, int n, int n2, int n3, int n4, int n5) {
        super(class_18, n, n2, n3, n4, n5);
        this.Field_46128 = class_27772;
    }

    public int Method_46141() {
        return super.\u0000= final() + (-24491 & 5493);
    }

    private void Method_46142() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

