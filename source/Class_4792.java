/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.base.Objects$ToStringHelper
 */
import com.google.common.base.Objects;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_4792
implements Comparable {
    protected int Field_4793;
    protected int Field_4794;
    public static final Class_4792 Field_4795 = new Class_4792(5636 & 16384, 4304 & -31711, 4114 & -24540);
    protected int Field_4796;

    public String Method_4797() {
        return Objects.toStringHelper((Object)this).add("x", this.Method_4807()).add("y", this.Method_4806()).add("z", this.Method_4809()).toString();
    }

    public Class_4792(int n, int n2, int n3) {
        this.Field_4794 = n;
        this.Field_4793 = n2;
        this.Field_4796 = n3;
    }

    public int Method_4798(Object object) {
        return this.Method_4802((Class_4792)object);
    }

    private void Method_4799() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_4800(Object object) {
        if (this == object) {
            return (-31733 & 6501) != 0;
        }
        if (!(object instanceof Class_4792)) {
            return (384 & -16284) != 0;
        }
        Class_4792 class_4792 = (Class_4792)object;
        return (this.Method_4807() != class_4792.Method_4807() ? -32248 & 4196 : (this.Method_4806() != class_4792.Method_4806() ? 138 & -30672 : (this.Method_4809() == class_4792.Method_4809() ? 8459 & 4161 : -32016 & 8202))) != 0;
    }

    public Class_4792 Method_4801(Class_4792 class_4792) {
        return new Class_4792(this.Method_4806() * class_4792.Method_4809() - this.Method_4809() * class_4792.Method_4806(), this.Method_4809() * class_4792.Method_4807() - this.Method_4807() * class_4792.Method_4809(), this.Method_4807() * class_4792.Method_4806() - this.Method_4806() * class_4792.Method_4807());
    }

    public int Method_4802(Class_4792 class_4792) {
        return this.Method_4806() == class_4792.Method_4806() ? (this.Method_4809() == class_4792.Method_4809() ? this.Method_4807() - class_4792.Method_4807() : this.Method_4809() - class_4792.Method_4809()) : this.Method_4806() - class_4792.Method_4806();
    }

    public double Method_4803(double d, double d2, double d3) {
        double d4 = (double)this.Method_4807() + 0.011764705882352941 * 42.5 - d;
        double d5 = (double)this.Method_4806() + 1.0416666666666667 * 0.48 - d2;
        double d6 = (double)this.Method_4809() + 1.6363636363636365 * 0.3055555555555555 - d3;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public int Method_4804() {
        return (this.Method_4806() + this.Method_4809() * (28703 & 3167)) * (24607 & 927) + this.Method_4807();
    }

    public double Method_4805(Class_4792 class_4792) {
        return this.Method_4808(class_4792.Method_4807(), class_4792.Method_4806(), class_4792.Method_4809());
    }

    public final int Method_4806() {
        return this.Field_4793;
    }

    public final int Method_4807() {
        return this.Field_4794;
    }

    public Class_4792(double d, double d2, double d3) {
        this(Class_13337.Method_13371(d), Class_13337.Method_13371(d2), Class_13337.Method_13371(d3));
    }

    public double Method_4808(double d, double d2, double d3) {
        double d4 = (double)this.Method_4807() - d;
        double d5 = (double)this.Method_4806() - d2;
        double d6 = (double)this.Method_4809() - d3;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public final int Method_4809() {
        return this.Field_4796;
    }
}

