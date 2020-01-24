/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_41159
extends Class_1551 {
    private int Field_41160;
    private final ArrayList Field_41161 = Lists.newArrayList();
    public final ArrayList Field_41162 = Lists.newArrayList();
    private final Class_18 Field_41163;
    private float Field_41164 = 0.0f;
    private final ArrayList Field_41165 = Lists.newArrayList();
    private static final Logger Field_41166 = LogManager.getLogger();
    private boolean Field_41167;
    private float Field_41168 = 0.0f;
    private float Field_41169 = 0.0f;
    private boolean Field_41170;

    public static int Method_41171(float f) {
        int n = 182 & 19708;
        int n2 = 3452 & 12436;
        return Class_13337.Method_13377(f * (float)(n - n2) + (float)n2);
    }

    public void Method_41172(Class_1782 class_1782, int n) {
        this.Method_41191(class_1782, n, this.Field_41163.Field_105.Method_45448(), (6656 & 9216) != 0);
        Field_41166.info("[CHAT] " + class_1782.Method_1788());
    }

    public int Method_41173() {
        return this.Method_41180() / (13 & -16613);
    }

    public Class_1782 Method_41174(int n, int n2) {
        if (!this.Method_41184()) {
            return null;
        }
        Class_31566 class_31566 = new Class_31566(this.Field_41163);
        int n3 = class_31566.Method_31572();
        float f = this.Method_41192();
        int n4 = n / n3 - (-32761 & 4195);
        int n5 = n2 / n3 - (5183 & 27163);
        n4 = Class_13337.Method_13377((float)n4 / f);
        n5 = Class_13337.Method_13377((float)n5 / f);
        if (n4 >= 0 && n5 >= 0) {
            int n6 = Math.min(this.Method_41173(), this.Field_41161.size());
            if (n4 <= Class_13337.Method_13377((float)this.Method_41190() / this.Method_41192())) {
                if (n5 < (5261 & -13477) * n6 + n6) {
                    int n7 = n5 / (12377 & 265) + this.Field_41160;
                    if (n7 >= 0 && n7 < this.Field_41161.size()) {
                        Class_15106 class_15106 = (Class_15106)this.Field_41161.get(n7);
                        int n8 = 2080 & 512;
                        for (Class_1782 class_1782 : class_15106.Method_15111()) {
                            if (!(class_1782 instanceof Class_2840) || (n8 += this.Field_41163.Field_27.Method_28715(Class_17908.Method_17910(((Class_2840)class_1782).Method_2848(), (7180 & 275) != 0))) <= n4) continue;
                            return class_1782;
                        }
                    }
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public void Method_41175() {
        this.Field_41160 = 9328 & 0;
        this.Field_41170 = 96 & 0;
    }

    public void Method_41176(int n) {
        Class_15106 class_15106;
        Iterator iterator = this.Field_41161.iterator();
        while (iterator.hasNext()) {
            class_15106 = (Class_15106)iterator.next();
            if (class_15106.Method_15112() != n) continue;
            iterator.remove();
            this.Field_41169 += 0.04054054f * 222.00002f;
            this.Field_41164 += 4.2711864f * 2.107143f;
        }
        iterator = this.Field_41162.iterator();
        while (iterator.hasNext()) {
            class_15106 = (Class_15106)iterator.next();
            if (class_15106.Method_15112() != n) continue;
            iterator.remove();
            break;
        }
    }

    public void Method_41177() {
        this.Field_41161.clear();
        this.Field_41162.clear();
        this.Field_41165.clear();
    }

    public Class_41159(Class_18 class_18) {
        this.Field_41163 = class_18;
    }

    public List Method_41178() {
        return this.Field_41165;
    }

    public void Method_41179(float f, int n) {
        float f2 = this.Method_41183(f);
        if (this.Field_41163.Field_84.Field_39757 != Class_34249.Field_34256) {
            int n2;
            int n3 = n2 = this.Method_41173();
            n3 += Class_13337.Method_13377(Math.abs(f2) / (0.5217391f * 17.25f) + 0.13103448f * 0.7631579f);
            int n4 = 8321 & 22016;
            if (this.Method_41184()) {
                n4 = 9 & -22843;
            }
            if (n4 != this.Field_41167) {
                this.Field_41167 = n4;
            }
            int n5 = 5640 & 18449;
            int n6 = this.Field_41161.size();
            float f3 = this.Field_41163.Field_84.Field_39792 * (20.699999f * 0.04347826f) + 0.3333333f * 0.3f;
            if (n6 > 0) {
                int n7;
                float f4 = this.Method_41192();
                int n8 = Class_13337.Method_13362((float)this.Method_41190() / f4);
                Class_16867.Method_16961();
                Class_16867.Method_16943(2.0f, 9.565218f * 2.090909f, 0.0f);
                Class_16867.Method_16973(f4, f4, 1.0f);
                this.Field_41163.Field_27.Method_28712();
                for (n7 = -21440 & 22; n7 + this.Field_41160 < this.Field_41161.size() && n7 < n3; ++n7) {
                    float f5;
                    Class_15106 class_15106 = (Class_15106)this.Field_41161.get(n7 + this.Field_41160);
                    if (class_15106 == null || !((f5 = f + (float)n - (float)class_15106.Method_15115()) < 131.64557f * 1.5192307f) && n4 == 0) continue;
                    double d = (double)f5 / (77.77777777777777 * 2.5714285714285716);
                    double d2 = d * (1.4411764705882353 * 34.69387755102041);
                    d = 1.0 - d;
                    d *= 1.2698412698412698 * 7.875;
                    d = Class_13337.Method_13385(d, 0.0, 1.0);
                    d *= d;
                    d2 = Class_13337.Method_13385(d2, 0.0, 1.0);
                    d *= d2;
                    float f6 = (float)n7 + f2 * (0.1625f * 0.6837607f) + 0.11306818f * 17.6f;
                    if (f6 > (float)n2) {
                        if ((f6 -= (float)n2) > 1.0f) {
                            f6 = 1.0f;
                        }
                        d *= (double)(1.0f - f6);
                    }
                    int n9 = (int)(1.5 * 170.0 * d);
                    if (n4 != 0) {
                        n9 = 8447 & 255;
                    }
                    n9 = (int)((float)n9 * f3);
                    ++n5;
                    if (n9 <= (20811 & 2231)) continue;
                    int n10 = 256 & -12282;
                    int n11 = -n7 * (10525 & -32247);
                    if (((Boolean)this.Field_41163.Field_84.Field_39732.Field_8874.\u0000strictfp()).booleanValue()) {
                        Class_41159.\u0000strictfp((double)n10, (double)((float)(n11 - (1193 & -28663)) - f2), (double)(n10 + n8 + (-12276 & 8804)), (double)((float)n11 - f2), (int)(n9 / (2210 & -32694) << (5176 & 152)));
                    }
                    String string = class_15106.Method_15114();
                    this.Field_41163.Field_27.Method_28711(string, n10, (float)(n11 - (2058 & 16989)) - f2, (385875967 & 16777215) + (n9 << (2650 & -32488)));
                }
                Class_16867.Method_16947();
                Class_16867.Method_16913();
                this.Field_41163.Field_27.Method_28728();
                Class_16867.Method_16985();
                Class_16867.Method_16952();
                if (n4 != 0) {
                    n7 = 669 & -26583;
                    Class_16867.Method_16943(-4.5f * 0.6666667f, 0.0f, 0.0f);
                    int n12 = n6 * n7 + n6;
                    int n13 = n5 * n7 + n5;
                    int n14 = this.Field_41160 * n13 / n6;
                    int n15 = n13 * n13 / n12;
                    if (n12 != n13) {
                        int n16 = n14 > 0 ? 24746 & -30530 : 4448 & 11361;
                        int n17 = this.Field_41170 ? 419312435 & 650965875 : 305640363 & 674968570;
                        Class_41159.\u0000, `((int)(14346 & -31995), (int)(-n14), (int)(-22526 & 17158), (int)(-n14 - n15), (int)(n17 + (n16 << (4984 & 1055))));
                        Class_41159.\u0000, `((int)(12546 & 19974), (int)(-n14), (int)(17477 & 785), (int)(-n14 - n15), (int)((-991109939 & 148688604) + (n16 << (5947 & -22440))));
                    }
                }
                Class_16867.Method_16945();
            }
        }
    }

    public int Method_41180() {
        return Class_41159.Method_41171(this.Method_41184() ? this.Field_41163.Field_84.Field_39814 : this.Field_41163.Field_84.Field_39729);
    }

    public static int Method_41181(float f) {
        int n = -3631 & 2370;
        int n2 = 21928 & 556;
        return Class_13337.Method_13377(f * (float)(n - n2) + (float)n2);
    }

    private void Method_41182() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public float Method_41183(float f) {
        return this.Field_41164 + (this.Field_41169 - this.Field_41164) * f;
    }

    public boolean Method_41184() {
        return this.Field_41163.Field_36 instanceof Class_1864;
    }

    public void Method_41185() {
        float f = 0.0f;
        this.Field_41164 = this.Field_41169;
        this.Field_41168 = (float)((double)this.Field_41168 * (0.35714285714285715 * 0.924));
        this.Field_41168 = (float)((double)this.Field_41168 + (double)(f - this.Field_41169) * (1.3333333333333333 * 0.225));
        this.Field_41169 += this.Field_41168;
    }

    public void Method_41186() {
        this.Field_41161.clear();
        this.Method_41175();
        for (int i = this.Field_41162.size() - (9993 & -30587); i >= 0; --i) {
            Class_15106 class_15106 = (Class_15106)this.Field_41162.get(i);
            this.Method_41191(class_15106.Method_15111(), class_15106.Method_15112(), class_15106.Method_15115(), (5633 & -22189) != 0);
        }
        this.Field_41169 = 0.0f;
        this.Field_41164 = 0.0f;
    }

    public void Method_41187(String string) {
        if (this.Field_41165.isEmpty() || !((String)this.Field_41165.get(this.Field_41165.size() - (16389 & 339))).equals(string)) {
            this.Field_41165.add(string);
        }
    }

    public void Method_41188(Class_1782 class_1782) {
        this.Method_41172(class_1782, -32629 & 548);
    }

    public void Method_41189(int n) {
        this.Field_41160 += n;
        int n2 = this.Field_41161.size();
        if (this.Field_41160 > n2 - this.Method_41173()) {
            this.Field_41160 = n2 - this.Method_41173();
        }
        if (this.Field_41160 <= 0) {
            this.Field_41160 = 10278 & -31720;
            this.Field_41170 = 21769 & 6;
        }
    }

    public int Method_41190() {
        return Class_41159.Method_41181(this.Field_41163.Field_84.Field_39824);
    }

    private void Method_41191(Class_1782 class_1782, int n, int n2, boolean bl) {
        if (n != 0) {
            this.Method_41176(n);
        }
        int n3 = Class_13337.Method_13377((float)this.Method_41190() / this.Method_41192());
        List list = Class_17908.Method_17911(class_1782, n3, this.Field_41163.Field_27, (3456 & -32748) != 0, (-22518 & 117) != 0);
        boolean bl2 = this.Method_41184();
        for (Class_1782 class_17822 : list) {
            if (bl2 && this.Field_41160 > 0) {
                this.Field_41170 = 2113 & 549;
                this.Method_41189(16643 & -22511);
            }
            if (((Boolean)this.Field_41163.Field_84.Field_39732.Field_8860.\u0000strictfp()).booleanValue() && !this.Field_41170) {
                this.Field_41169 -= 1.1489362f * 7.8333335f;
                this.Field_41164 -= 3.0f * 3.0f;
            }
            this.Field_41161.add(1546 & 20656, new Class_15106(n2, class_17822, n));
        }
        while (this.Field_41161.size() > (358 & -11020)) {
            this.Field_41161.remove(this.Field_41161.size() - (9345 & 3));
        }
        if (!bl) {
            this.Field_41162.add(-24112 & 544, new Class_15106(n2, class_1782, n));
            while (this.Field_41162.size() > (-24092 & 4196)) {
                this.Field_41162.remove(this.Field_41162.size() - (2051 & 9153));
            }
        }
    }

    public float Method_41192() {
        return this.Field_41163.Field_84.Field_39854;
    }
}

