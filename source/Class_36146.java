/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_36146
extends Class_4981
implements Class_4961,
Class_5591 {
    public Class_36146 Field_36147;
    public Class_36146 Field_36148;
    public Class_36146 Field_36149;
    private int Field_36150;
    private String Field_36151;
    private Class_23823[] Field_36152;
    public int Field_36153;
    private int Field_36154;
    public Class_36146 Field_36155;
    public float Field_36156;
    public boolean Field_36157;
    public float Field_36158;

    public int Method_36159() {
        return -32229 & 1339;
    }

    public void Method_36160() {
        Object object;
        float f;
        this.Method_36163();
        int n = this.\u0000strictfp.\u0000= final();
        int n2 = this.\u0000strictfp.\u0000, `();
        int n3 = this.\u0000strictfp.\u0000strictfp();
        this.Field_36154 += 17169 & -32637;
        if (!this.\u0000strictfp.Field_306 && this.Field_36153 != 0 && (this.Field_36154 + n + n2 + n3) % (4300 & 28408) == 0) {
            this.Field_36153 = 2178 & 1576;
            f = 3.4f * 1.4705882f;
            for (Class_626 class_626 : this.\u0000strictfp.Method_488(Class_626.class, new Class_10997((float)n - f, (float)n2 - f, (float)n3 - f, (float)(n + (12561 & 7)) + f, (float)(n2 + (-14335 & 971)) + f, (float)(n3 + (-11259 & 385)) + f))) {
                if (!(class_626.Field_665 instanceof Class_9724) || (object = (Object)((Class_9724)class_626.Field_665).Method_9730()) != this && (!(object instanceof Class_25997) || !((Class_25997)object).Method_26007(this))) continue;
                this.Field_36153 += 20493 & -29935;
            }
        }
        this.Field_36156 = this.Field_36158;
        f = 2.1891892f * 0.045679014f;
        if (this.Field_36153 > 0 && this.Field_36158 == 0.0f && this.Field_36149 == null && this.Field_36148 == null) {
            double d = (double)n + 0.010416666666666666 * 48.0;
            double d2 = (double)n3 + 2.3142857142857145 * 0.21604938271604937;
            if (this.Field_36147 != null) {
                d2 += 0.19886363636363638 * 2.5142857142857142;
            }
            if (this.Field_36155 != null) {
                d += 0.1891891891891892 * 2.642857142857143;
            }
            this.\u0000strictfp.Method_475(d, (double)n2 + 0.12698412698412698 * 3.9375, d2, "random.chestopen", 0.18032788f * 2.7727273f, this.\u0000strictfp.Field_307.nextFloat() * (0.043023255f * 2.3243244f) + 0.9736842f * 0.92432433f);
        }
        if (this.Field_36153 == 0 && this.Field_36158 > 0.0f || this.Field_36153 > 0 && this.Field_36158 < 1.0f) {
            float f2;
            float f3 = this.Field_36158;
            this.Field_36158 = this.Field_36153 > 0 ? (this.Field_36158 += f) : (this.Field_36158 -= f);
            if (this.Field_36158 > 1.0f) {
                this.Field_36158 = 1.0f;
            }
            if (this.Field_36158 < (f2 = 0.9836066f * 0.5083333f) && f3 >= f2 && this.Field_36149 == null && this.Field_36148 == null) {
                object = (double)n + 0.4888888888888889 * 1.0227272727272727;
                double d = (double)n3 + 8.6 * 0.05813953488372093;
                if (this.Field_36147 != null) {
                    d += 0.6 * 0.8333333333333334;
                }
                if (this.Field_36155 != null) {
                    object += 0.6346153846153847 * 0.7878787878787878;
                }
                this.\u0000strictfp.Method_475((double)object, (double)n2 + 0.4246575342465753 * 1.1774193548387097, d, "random.chestclosed", 19.8f * 0.025252527f, this.\u0000strictfp.Field_307.nextFloat() * (8.0f * 0.0125f) + 2.5363636f * 0.3548387f);
            }
            if (this.Field_36158 < 0.0f) {
                this.Field_36158 = 0.0f;
            }
        }
    }

    public int Method_36161(int n) {
        return 9896 & 4102;
    }

    public int Method_36162() {
        return 322 & 19660;
    }

    public void Method_36163() {
        if (!this.Field_36157) {
            this.Field_36157 = 133 & 16441;
            this.Field_36148 = this.Method_36188(Class_4595.Field_4602);
            this.Field_36155 = this.Method_36188(Class_4595.Field_4603);
            this.Field_36149 = this.Method_36188(Class_4595.Field_4598);
            this.Field_36147 = this.Method_36188(Class_4595.Field_4613);
        }
    }

    public void Method_36164(Class_626 class_626) {
        if (!class_626.Method_752() && this.\u0000strictfp() instanceof Class_4125) {
            this.Field_36153 -= -28671 & 27145;
            this.\u0000strictfp.Method_466(this.\u0000strictfp, this.\u0000strictfp(), 1025 & -32741, this.Field_36153);
            this.\u0000strictfp.Method_525(this.\u0000strictfp, this.\u0000strictfp());
            this.\u0000strictfp.Method_525(this.\u0000strictfp.Method_4782(), this.\u0000strictfp());
        }
    }

    public boolean Method_36165(int n, Class_23823 class_23823) {
        return (16865 & 6147) != 0;
    }

    public String Method_36166() {
        return "minecraft:chest";
    }

    public Class_23823 Method_36167(int n, int n2) {
        if (this.Field_36152[n] != null) {
            if (this.Field_36152[n].Field_23826 <= n2) {
                Class_23823 class_23823 = this.Field_36152[n];
                this.Field_36152[n] = null;
                this.\u0000, for();
                return class_23823;
            }
            Class_23823 class_23823 = this.Field_36152[n].Method_23857(n2);
            if (this.Field_36152[n].Field_23826 == 0) {
                this.Field_36152[n] = null;
            }
            this.\u0000, for();
            return class_23823;
        }
        return null;
    }

    private void Method_36168(Class_36146 class_36146, Class_4595 class_4595) {
        if (class_36146.\u0000%()) {
            this.Field_36157 = -29616 & 4225;
        } else if (this.Field_36157) {
            switch (Class_26629.Field_26630[class_4595.ordinal()]) {
                case 1: {
                    if (this.Field_36149 == class_36146) break;
                    this.Field_36157 = -32376 & 17923;
                    break;
                }
                case 2: {
                    if (this.Field_36147 == class_36146) break;
                    this.Field_36157 = -27024 & 8203;
                    break;
                }
                case 3: {
                    if (this.Field_36155 == class_36146) break;
                    this.Field_36157 = -22528 & 16912;
                    break;
                }
                case 4: {
                    if (this.Field_36148 == class_36146) break;
                    this.Field_36157 = 18688 & 8312;
                }
            }
        }
    }

    public void Method_36169(int n, Class_23823 class_23823) {
        this.Field_36152[n] = class_23823;
        if (class_23823 != null && class_23823.Field_23826 > this.Method_36162()) {
            class_23823.Field_23826 = this.Method_36162();
        }
        this.\u0000, for();
    }

    public void Method_36170(int n, int n2) {
    }

    public void Method_36171() {
        for (int i = 4946 & 1056; i < this.Field_36152.length; ++i) {
            this.Field_36152[i] = null;
        }
    }

    public Class_36146(int n) {
        this.Field_36152 = new Class_23823[9115 & -32677];
        this.Field_36150 = n;
    }

    public void Method_36172() {
        super.\u0000= final();
        this.Field_36157 = 18437 & 152;
    }

    public void Method_36173(Class_626 class_626) {
        if (!class_626.Method_752()) {
            if (this.Field_36153 < 0) {
                this.Field_36153 = -28670 & 48;
            }
            this.Field_36153 += 525 & -12159;
            this.\u0000strictfp.Method_466(this.\u0000strictfp, this.\u0000strictfp(), 2193 & -31443, this.Field_36153);
            this.\u0000strictfp.Method_525(this.\u0000strictfp, this.\u0000strictfp());
            this.\u0000strictfp.Method_525(this.\u0000strictfp.Method_4782(), this.\u0000strictfp());
        }
    }

    public void Method_36174(String string) {
        this.Field_36151 = string;
    }

    public boolean Method_36175(int n, int n2) {
        if (n == (27179 & 4293)) {
            this.Field_36153 = n2;
            return (17681 & 65) != 0;
        }
        return super.\u0000strictfp(n, n2);
    }

    private void Method_36176() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_36177(Class_1699 class_1699) {
        super.Method_4989(class_1699);
        Class_1758 class_1758 = new Class_1758();
        for (int i = 40 & 14353; i < this.Field_36152.length; ++i) {
            if (this.Field_36152[i] == null) continue;
            Class_1699 class_16992 = new Class_1699();
            class_16992.Method_1724("Slot", (byte)i);
            this.Field_36152[i].Method_23841(class_16992);
            class_1758.Method_1781(class_16992);
        }
        class_1699.Method_1744("Items", class_1758);
        if (this.Method_36186()) {
            class_1699.Method_1702("CustomName", this.Field_36151);
        }
    }

    public int Method_36178() {
        if (this.Field_36150 == (-1 & -1)) {
            if (this.\u0000strictfp == null || !(this.\u0000strictfp() instanceof Class_4125)) {
                return 4099 & 9188;
            }
            this.Field_36150 = ((Class_4125)this.\u0000strictfp()).Field_4127;
        }
        return this.Field_36150;
    }

    public void Method_36179() {
        super.\u0000
        ();
        this.Method_36172();
        this.Method_36163();
    }

    public Class_36146() {
        this.Field_36152 = new Class_23823[-27621 & 17375];
        this.Field_36150 = -1 & -1;
    }

    public Class_23823 Method_36180(int n) {
        if (this.Field_36152[n] != null) {
            Class_23823 class_23823 = this.Field_36152[n];
            this.Field_36152[n] = null;
            return class_23823;
        }
        return null;
    }

    private boolean Method_36181(Class_4751 class_4751) {
        if (this.\u0000strictfp == null) {
            return (6320 & 66) != 0;
        }
        Class_3238 class_3238 = this.\u0000strictfp.Method_375(class_4751).Method_3442();
        return (class_3238 instanceof Class_4125 && ((Class_4125)class_3238).Field_4127 == this.Method_36178() ? 8225 & -16297 : 280 & 1697) != 0;
    }

    public Class_8295 Method_36182(Class_37781 class_37781, Class_626 class_626) {
        return new Class_9724(class_37781, this, class_626);
    }

    public boolean Method_36183(Class_626 class_626) {
        return (this.\u0000strictfp.Method_429(this.\u0000strictfp) != this ? 1555 & 24772 : (class_626.\u0000strictfp((double)this.\u0000strictfp.\u0000= final() + 1.3181818181818181 * 0.37931034482758624, (double)this.\u0000strictfp.\u0000, `() + 0.7028985507246377 * 0.711340206185567, (double)this.\u0000strictfp.\u0000strictfp() + 0.6507936507936508 * 0.7682926829268293) <= 13.0 * 4.923076923076923 ? 16417 & 2641 : 16705 & -32250)) != 0;
    }

    public String Method_36184() {
        return this.Method_36186() ? this.Field_36151 : "container.chest";
    }

    public int Method_36185() {
        return 5568 & 0;
    }

    public boolean Method_36186() {
        return (this.Field_36151 != null && this.Field_36151.length() > 0 ? 5185 & -24313 : -12016 & 3748) != 0;
    }

    public void Method_36187(Class_1699 class_1699) {
        super.Method_4984(class_1699);
        Class_1758 class_1758 = class_1699.Method_1735("Items", 4106 & -22386);
        this.Field_36152 = new Class_23823[this.Method_36159()];
        if (class_1699.Method_1715("CustomName", -15959 & 2568)) {
            this.Field_36151 = class_1699.Method_1708("CustomName");
        }
        for (int i = 8464 & 4228; i < class_1758.Method_1772(); ++i) {
            Class_1699 class_16992 = class_1758.Method_1768(i);
            int n = class_16992.Method_1716("Slot") & (6399 & 9983);
            if (n < 0 || n >= this.Field_36152.length) continue;
            this.Field_36152[n] = Class_23823.Method_23840(class_16992);
        }
    }

    protected Class_36146 Method_36188(Class_4595 class_4595) {
        Class_4879 class_4879;
        Class_4751 class_4751 = this.\u0000strictfp.Method_4765(class_4595);
        if (this.Method_36181(class_4751) && (class_4879 = this.\u0000strictfp.Method_429(class_4751)) instanceof Class_36146) {
            Class_36146 class_36146 = (Class_36146)class_4879;
            class_36146.Method_36168(this, class_4595.Method_4660());
            return class_36146;
        }
        return null;
    }

    public Class_23823 Method_36189(int n) {
        return this.Field_36152[n];
    }
}

