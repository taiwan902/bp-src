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

public class Class_31457 {
    private long Field_31458;
    private long Field_31459;
    private int Field_31460 = -32763 & 1031;
    private int Field_31461 = 207 & 12815;
    private double Field_31462 = 0.9036144578313253 * 0.22133333333333333;
    private double Field_31463 = this.Field_31466 = 2.6315789473684214E7 * 2.28;
    private int Field_31464 = 1170857843 & 30393328;
    private double Field_31465 = 8.26923076923077 * 0.6046511627906976;
    private double Field_31466;
    private double Field_31467 = 0.0;
    private double Field_31468 = 0.0;
    private final List Field_31469 = Lists.newArrayList();

    public double Method_31470() {
        return this.Field_31465;
    }

    public void Method_31471(double d) {
        this.Field_31465 = d;
        for (Class_20595 class_20595 : this.Method_31499()) {
            class_20595.Method_20601(this, d);
        }
    }

    public void Method_31472(int n) {
        this.Field_31461 = n;
        for (Class_20595 class_20595 : this.Method_31499()) {
            class_20595.Method_20600(this, n);
        }
    }

    public double Method_31473() {
        double d = this.Method_31500() - this.Method_31475() / (0.4675324675324675 * 4.277777777777778);
        if (d < (double)(-this.Field_31464)) {
            d = -this.Field_31464;
        }
        return d;
    }

    public double Method_31474() {
        double d = this.Method_31495() - this.Method_31475() / (2.764705882352941 * 0.723404255319149);
        if (d < (double)(-this.Field_31464)) {
            d = -this.Field_31464;
        }
        return d;
    }

    public double Method_31475() {
        if (this.Method_31492() != Class_39041.Field_39043) {
            double d = (float)(System.currentTimeMillis() - this.Field_31458) / (float)(this.Field_31459 - this.Field_31458);
            if (d < 1.0) {
                return this.Field_31466 + (this.Field_31463 - this.Field_31466) * d;
            }
            this.Method_31501(this.Field_31463);
        }
        return this.Field_31466;
    }

    public double Method_31476(Class_1061 class_1061) {
        return this.Method_31477(class_1061.Field_1130, class_1061.Field_1106);
    }

    public double Method_31477(double d, double d2) {
        double d3 = d2 - this.Method_31474();
        double d4 = this.Method_31491() - d2;
        double d5 = d - this.Method_31473();
        double d6 = this.Method_31489() - d;
        double d7 = Math.min(d5, d6);
        d7 = Math.min(d7, d3);
        return Math.min(d7, d4);
    }

    public void Method_31478(double d, double d2) {
        this.Field_31467 = d;
        this.Field_31468 = d2;
        for (Class_20595 class_20595 : this.Method_31499()) {
            class_20595.Method_20598(this, d, d2);
        }
    }

    private void Method_31479() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public long Method_31480() {
        return this.Method_31492() != Class_39041.Field_39043 ? this.Field_31459 - System.currentTimeMillis() : 1241790472L & 539002407L;
    }

    public void Method_31481(double d, double d2, long l) {
        this.Field_31466 = d;
        this.Field_31463 = d2;
        this.Field_31458 = System.currentTimeMillis();
        this.Field_31459 = this.Field_31458 + l;
        for (Class_20595 class_20595 : this.Method_31499()) {
            class_20595.Method_20596(this, d, d2, l);
        }
    }

    public int Method_31482() {
        return this.Field_31461;
    }

    public void Method_31483(double d) {
        this.Field_31462 = d;
        for (Class_20595 class_20595 : this.Method_31499()) {
            class_20595.Method_20602(this, d);
        }
    }

    public double Method_31484() {
        return this.Field_31459 == this.Field_31458 ? 0.0 : Math.abs(this.Field_31466 - this.Field_31463) / (double)(this.Field_31459 - this.Field_31458);
    }

    public boolean Method_31485(Class_29480 class_29480) {
        return ((double)class_29480.Method_29488() > this.Method_31473() && (double)class_29480.Method_29487() < this.Method_31489() && (double)class_29480.Method_29496() > this.Method_31474() && (double)class_29480.Method_29485() < this.Method_31491() ? 24657 & 4101 : -32255 & 7252) != 0;
    }

    public int Method_31486() {
        return this.Field_31460;
    }

    public void Method_31487(int n) {
        this.Field_31460 = n;
        for (Class_20595 class_20595 : this.Method_31499()) {
            class_20595.Method_20597(this, n);
        }
    }

    public double Method_31488() {
        return this.Field_31462;
    }

    public double Method_31489() {
        double d = this.Method_31500() + this.Method_31475() / (0.018867924528301886 * 106.0);
        if (d > (double)this.Field_31464) {
            d = this.Field_31464;
        }
        return d;
    }

    public void Method_31490(Class_20595 class_20595) {
        this.Field_31469.add(class_20595);
    }

    public double Method_31491() {
        double d = this.Method_31495() + this.Method_31475() / (0.4418604651162791 * 4.526315789473684);
        if (d > (double)this.Field_31464) {
            d = this.Field_31464;
        }
        return d;
    }

    public Class_39041 Method_31492() {
        return this.Field_31463 < this.Field_31466 ? Class_39041.Field_39042 : (this.Field_31463 > this.Field_31466 ? Class_39041.Field_39045 : Class_39041.Field_39043);
    }

    public boolean Method_31493(Class_10997 class_10997) {
        return (class_10997.Field_11002 > this.Method_31473() && class_10997.Field_10999 < this.Method_31489() && class_10997.Field_11003 > this.Method_31474() && class_10997.Field_11001 < this.Method_31491() ? 13317 & 16393 : 8705 & -30648) != 0;
    }

    public int Method_31494() {
        return this.Field_31464;
    }

    public double Method_31495() {
        return this.Field_31468;
    }

    public void Method_31496(int n) {
        this.Field_31464 = n;
    }

    public double Method_31497() {
        return this.Field_31463;
    }

    public boolean Method_31498(Class_4751 class_4751) {
        return ((double)(class_4751.\u0000= final() + (7173 & 577)) > this.Method_31473() && (double)class_4751.\u0000= final() < this.Method_31489() && (double)(class_4751.\u0000strictfp() + (2177 & -28653)) > this.Method_31474() && (double)class_4751.\u0000strictfp() < this.Method_31491() ? 33 & 19715 : 8801 & 16512) != 0;
    }

    protected List Method_31499() {
        return Lists.newArrayList((Iterable)this.Field_31469);
    }

    public double Method_31500() {
        return this.Field_31467;
    }

    public void Method_31501(double d) {
        this.Field_31466 = d;
        this.Field_31463 = d;
        this.Field_31458 = this.Field_31459 = System.currentTimeMillis();
        for (Class_20595 class_20595 : this.Method_31499()) {
            class_20595.Method_20599(this, d);
        }
    }
}

