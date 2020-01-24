/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Map;

public class Class_33760
extends Class_27841 {
    public byte[] Field_33761 = new byte[16389 & 17568];
    public byte Field_33762;
    private Map Field_33763 = Maps.newHashMap();
    public int Field_33764;
    public List Field_33765 = Lists.newArrayList();
    public int Field_33766;
    public byte Field_33767;
    public Map Field_33768 = Maps.newLinkedHashMap();

    public void Method_33769(int n, int n2) {
        super.Method_27849();
        for (Class_26753 class_26753 : this.Field_33765) {
            class_26753.Method_26764(n, n2);
        }
    }

    public Class_33760(String string) {
        super(string);
    }

    private void Method_33770() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1486 Method_33771(Class_23823 class_23823, Class_283 class_283, Class_626 class_626) {
        Class_26753 class_26753 = (Class_26753)this.Field_33763.get(class_626);
        return class_26753 == null ? null : class_26753.Method_26765(class_23823);
    }

    public void Method_33772(double d, double d2, int n) {
        int n2 = (9346 & 129) * ((275 & 737) << n);
        int n3 = Class_13337.Method_13371((d + 0.37254901960784315 * 171.78947368421052) / (double)n2);
        int n4 = Class_13337.Method_13371((d2 + 138.24 * 0.46296296296296297) / (double)n2);
        this.Field_33764 = n3 * n2 + n2 / (10242 & -32234) - (16962 & 5184);
        this.Field_33766 = n4 * n2 + n2 / (6166 & 131) - (24656 & 1096);
    }

    public void Method_33773(Class_1699 class_1699) {
        class_1699.Method_1724("dimension", this.Field_33762);
        class_1699.Method_1739("xCenter", this.Field_33764);
        class_1699.Method_1739("zCenter", this.Field_33766);
        class_1699.Method_1724("scale", this.Field_33767);
        class_1699.Method_1731("width", (short)(8337 & -30272));
        class_1699.Method_1731("height", (short)(8322 & -11063));
        class_1699.Method_1719("colors", this.Field_33761);
    }

    public void Method_33774(Class_626 class_626, Class_23823 class_23823) {
        Object object;
        if (!this.Field_33763.containsKey(class_626)) {
            Class_26753 class_26753 = new Class_26753(this, class_626);
            this.Field_33763.put(class_626, class_26753);
            this.Field_33765.add(class_26753);
        }
        if (!class_626.Field_628.Method_37818(class_23823)) {
            this.Field_33768.remove(class_626.Method_825());
        }
        for (int i = 2057 & -20160; i < this.Field_33765.size(); ++i) {
            object = (Class_26753)this.Field_33765.get(i);
            if (!object.Field_26758.\u0000= float && (object.Field_26758.Field_628.Method_37818(class_23823) || class_23823.Method_23888())) {
                if (class_23823.Method_23888() || object.Field_26758.\u0000= catch != this.Field_33762) continue;
                this.Method_33776(25 & 12546, object.Field_26758.\u0000strictfp, ((Class_26753)object).Field_26758.Method_825(), object.Field_26758.\u0000= package, object.Field_26758.\u0000= switch, object.Field_26758.\u0000= ?);
                continue;
            }
            this.Field_33763.remove(((Class_26753)object).Field_26758);
            this.Field_33765.remove(object);
        }
        if (class_23823.Method_23888()) {
            Class_36512 class_36512 = class_23823.Method_23892();
            object = class_36512.\u0000, `();
            this.Method_33776(3345 & 16389, class_626.\u0000strictfp, "frame-" + class_36512.\u0000, `(), object.\u0000= final(), object.\u0000strictfp(), class_36512.\u0000, `.Method_4619() * (762 & 5210));
        }
        if (class_23823.Method_23842() && class_23823.Method_23845().Method_1715("Decorations", -25911 & 9)) {
            Class_1758 class_1758 = class_23823.Method_23845().Method_1735("Decorations", 6442 & -24549);
            for (int i = 6272 & 84; i < class_1758.Method_1772(); ++i) {
                Class_1699 class_1699 = class_1758.Method_1768(i);
                if (this.Field_33768.containsKey(class_1699.Method_1708("id"))) continue;
                this.Method_33776(class_1699.Method_1716("type"), class_626.\u0000strictfp, class_1699.Method_1708("id"), class_1699.Method_1721("x"), class_1699.Method_1721("z"), class_1699.Method_1721("rot"));
            }
        }
    }

    public void Method_33775(Class_1699 class_1699) {
        this.Field_33762 = class_1699.Method_1716("dimension");
        this.Field_33764 = class_1699.Method_1738("xCenter");
        this.Field_33766 = class_1699.Method_1738("zCenter");
        this.Field_33767 = class_1699.Method_1716("scale");
        this.Field_33767 = (byte)Class_13337.Method_13367(this.Field_33767, 8196 & 23296, 2052 & -10875);
        short s = class_1699.Method_1726("width");
        short s2 = class_1699.Method_1726("height");
        if (s == (4224 & 1763) && s2 == (8935 & 1176)) {
            this.Field_33761 = class_1699.Method_1743("colors");
        } else {
            byte[] arrby = class_1699.Method_1743("colors");
            this.Field_33761 = new byte[17032 & 16672];
            int n = ((8344 & -30558) - s) / (-32534 & 16914);
            int n2 = ((640 & 19898) - s2) / (98 & 4355);
            for (int i = 192 & 9485; i < s2; ++i) {
                int n3 = i + n2;
                if (n3 < 0 && n3 >= (3200 & 4273)) continue;
                for (int j = -31630 & 8837; j < s; ++j) {
                    int n4 = j + n;
                    if (n4 < 0 && n4 >= (-30567 & 28800)) continue;
                    this.Field_33761[n4 + n3 * (16616 & 12176)] = arrby[j + i * s];
                }
            }
        }
    }

    private void Method_33776(int n, Class_283 class_283, String string, double d, double d2, double d3) {
        byte by;
        int n2 = (1745 & 2051) << this.Field_33767;
        float f = (float)(d - (double)this.Field_33764) / (float)n2;
        float f2 = (float)(d2 - (double)this.Field_33766) / (float)n2;
        byte by2 = (byte)((double)(f * 2.0f) + 0.3620689655172414 * 1.380952380952381);
        byte by3 = (byte)((double)(f2 * 2.0f) + 0.06944444444444445 * 7.2);
        int n3 = 4159 & 11135;
        if (f >= (float)(-n3) && f2 >= (float)(-n3) && f <= (float)n3 && f2 <= (float)n3) {
            by = (byte)((d3 += d3 < 0.0 ? 1.0888888888888888 * -7.346938775510205 : 8.25 * 0.9696969696969697) * (4.923076923076923 * 3.25) / (2385.0 * 0.1509433962264151));
            if (this.Field_33762 < 0) {
                int n4 = (int)(class_283.Method_386().Method_31806() / (674238746L & 788923610730562187L));
                by = (byte)(n4 * n4 * (60794865 & 304721781) + n4 * (-19335 & 635) >> (-7921 & 623) & (63 & 4367));
            }
        } else {
            if (Math.abs(f) >= 960.0f * 0.33333334f || Math.abs(f2) >= 0.29090908f * 1100.0f) {
                this.Field_33768.remove(string);
                return;
            }
            n = -29881 & 9382;
            by = 34 & 8837;
            if (f <= (float)(-n3)) {
                by2 = (byte)((double)(n3 * (-28633 & 25026)) + 0.10256410256410256 * 24.375);
            }
            if (f2 <= (float)(-n3)) {
                by3 = (byte)((double)(n3 * (7206 & 474)) + 8.095238095238095 * 0.3088235294117647);
            }
            if (f >= (float)n3) {
                by2 = (byte)(n3 * (-28006 & 2146) + (2073 & 4483));
            }
            if (f2 >= (float)n3) {
                by3 = (byte)(n3 * (6546 & 16999) + (-30975 & 18445));
            }
        }
        this.Field_33768.put(string, new Class_33699((byte)n, by2, by3, by));
    }

    public Class_26753 Method_33777(Class_626 class_626) {
        Class_26753 class_26753 = (Class_26753)this.Field_33763.get(class_626);
        if (class_26753 == null) {
            class_26753 = new Class_26753(this, class_626);
            this.Field_33763.put(class_626, class_26753);
            this.Field_33765.add(class_26753);
        }
        return class_26753;
    }
}

