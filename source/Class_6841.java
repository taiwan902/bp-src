/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.input.Mouse
 */
import internal.org.lwjgl.input.Mouse;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;

public abstract class Class_6841 {
    protected int Field_6842;
    protected boolean Field_6843 = -14143 & 1339;
    protected final Class_18 Field_6844;
    protected boolean Field_6845 = 5 & -30951;
    protected int Field_6846;
    protected float Field_6847;
    protected boolean Field_6848 = 3 & -16323;
    protected int Field_6849;
    protected int Field_6850;
    protected float Field_6851;
    private int Field_6852;
    protected boolean Field_6853 = -32752 & 21448;
    protected int Field_6854 = -2 & -2;
    private int Field_6855;
    protected final int Field_6856;
    private boolean Field_6857 = 10465 & 785;
    protected float Field_6858;
    protected long Field_6859;
    protected int Field_6860;
    protected int Field_6861;
    protected boolean Field_6862;
    protected int Field_6863;
    private Map Field_6864 = new HashMap<K, V>();
    private boolean Field_6865;
    protected int Field_6866;
    protected float Field_6867;
    protected int Field_6868 = -1 & -1;
    public int Field_6869;

    public void Method_6870(int n, int n2) {
        this.Field_6852 = n;
        this.Field_6855 = n2;
    }

    public void Method_6871(float f, boolean bl) {
        this.Field_6847 = f;
        if (!bl) {
            this.Field_6851 = f;
            this.Field_6867 = 0.0f;
        }
    }

    protected void Method_6872() {
        this.Field_6847 = this.Method_6907(this.Field_6847);
    }

    protected void Method_6873(int n, int n2, int n3) {
    }

    public boolean Method_6874() {
        return this.Field_6857;
    }

    protected abstract boolean Method_6875(int var1);

    public void Method_6876() {
        boolean bl = Mouse.isButtonDown((int)(17616 & -32479));
        if (!bl && this.Field_6854 > 0 && !this.Field_6865) {
            this.Field_6853 = 25669 & 4617;
        }
        if (this.Method_6895(this.Field_6860)) {
            int n;
            int n2;
            int n3;
            int n4;
            if (Mouse.getEventButton() == 0 && Mouse.getEventButtonState() && this.Field_6860 >= this.Field_6849 && this.Field_6860 <= this.Field_6869) {
                n3 = (this.Field_6861 - this.Method_6882()) / (4130 & 278);
                n2 = (this.Field_6861 + this.Method_6882()) / (4634 & 226);
                n4 = this.Field_6860 - this.Field_6849 - this.Field_6850 + this.Method_6902() - (6940 & 16388);
                n = n4 / this.Field_6856;
                if (n < this.Method_6886() && this.Field_6866 >= n3 && this.Field_6866 <= n2 && n >= 0 && n4 >= 0) {
                    this.Method_6881(n, (16902 & 14592) != 0, this.Field_6866, this.Field_6860);
                    this.Field_6868 = n;
                } else if (this.Field_6866 >= n3 && this.Field_6866 <= n2 && n4 < 0) {
                    this.Method_6903(this.Field_6866 - n3, this.Field_6860 - this.Field_6849 + this.Method_6902() - (2068 & -31643));
                }
            }
            if (bl && this.Method_6874()) {
                this.Field_6853 = 1284 & 28819;
                if (this.Field_6854 == (-1 & -1)) {
                    n3 = -32503 & 12323;
                    if (this.Field_6860 >= this.Field_6849 && this.Field_6860 <= this.Field_6869) {
                        int n5;
                        n2 = (this.Field_6861 - this.Method_6882()) / (7234 & 24742);
                        n4 = (this.Field_6861 + this.Method_6882()) / (9034 & 3074);
                        n = this.Field_6860 - this.Field_6849 - this.Field_6850 + this.Method_6902() - (4132 & -16124);
                        int n6 = n / this.Field_6856;
                        if (n6 < this.Method_6886() && this.Field_6866 >= n2 && this.Field_6866 <= n4 && n6 >= 0 && n >= 0) {
                            n5 = n6 == this.Field_6868 && Class_18.Method_207() - this.Field_6859 < (-6458791048758516486L & 277348858L) ? 1673 & -8137 : 3202 & 4460;
                            this.Method_6881(n6, n5 != 0, this.Field_6866, this.Field_6860);
                            this.Field_6868 = n6;
                            this.Field_6859 = Class_18.Method_207();
                        } else if (this.Field_6866 >= n2 && this.Field_6866 <= n4 && n < 0) {
                            this.Method_6903(this.Field_6866 - n2, this.Field_6860 - this.Field_6849 + this.Method_6902() - (3493 & 582));
                            n3 = 640 & -22512;
                        }
                        n5 = this.Method_6885();
                        int n7 = n5 + (2070 & -31730);
                        this.Field_6865 = this.Field_6866 >= n5 && this.Field_6866 <= n7 ? 9281 & 18705 : 257 & 18436;
                        int n8 = this.Field_6865 ? 1 : 0;
                        if (this.Field_6865) {
                            this.Field_6858 = -2.46875f * 0.4050633f;
                            int n9 = this.Method_6891();
                            if (n9 < (8201 & -32765)) {
                                n9 = 3 & -7799;
                            }
                            int n10 = (int)((float)((this.Field_6869 - this.Field_6849) * (this.Field_6869 - this.Field_6849)) / (float)this.Method_6889());
                            n10 = Class_13337.Method_13367(n10, -7376 & 3104, this.Field_6869 - this.Field_6849 - (-32759 & 1210));
                            this.Field_6858 /= (float)(this.Field_6869 - this.Field_6849 - n10) / (float)n9;
                        } else {
                            this.Field_6858 = 1.0f;
                        }
                        this.Field_6854 = n3 != 0 ? this.Field_6860 : -1 & -2;
                    } else {
                        this.Field_6854 = -2 & -2;
                    }
                } else if (this.Field_6854 >= 0) {
                    n3 = !this.Field_6865 ? 289 & 193 : 4097 & 1152;
                    this.Method_6893(-((float)(this.Field_6860 - this.Field_6854)) * this.Field_6858, n3 != 0);
                    this.Field_6854 = this.Field_6860;
                }
            } else {
                this.Field_6854 = -1 & -1;
            }
            n3 = Mouse.getEventDWheel();
            if (n3 != 0) {
                if (n3 > 0) {
                    n3 = -1 & -1;
                } else if (n3 < 0) {
                    n3 = 9223 & -32079;
                }
                this.Method_6893(n3 * this.Field_6856 / (25731 & -32734), (4109 & -13935) != 0);
                this.Field_6853 = 416 & 11;
            }
        }
    }

    protected void Method_6877(int n, int n2, Class_7644 class_7644) {
    }

    public Class_6841(Class_18 class_18, int n, int n2, int n3, int n4, int n5) {
        this.Field_6844 = class_18;
        this.Field_6861 = n;
        this.Field_6842 = n2;
        this.Field_6849 = n3;
        this.Field_6869 = n4;
        this.Field_6856 = n5;
        this.Field_6846 = 25176 & 1186;
        this.Field_6863 = n;
    }

    public void Method_6878(int n, int n2, int n3, int n4) {
        this.Field_6861 = n;
        this.Field_6842 = n2;
        this.Field_6849 = n3;
        this.Field_6869 = n4;
        this.Field_6846 = -27596 & 770;
        this.Field_6863 = n;
    }

    public void Method_6879(int n) {
        this.Method_6893(n, (320 & 3106) != 0);
        this.Field_6854 = -2 & -2;
    }

    public void Method_6880(boolean bl) {
        this.Field_6857 = bl;
    }

    protected abstract void Method_6881(int var1, boolean var2, int var3, int var4);

    public int Method_6882() {
        return 5852 & -24354;
    }

    public void Method_6883(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            if (class_42376.Field_42392 == this.Field_6852) {
                this.Method_6893(-((float)(this.Field_6856 * (4363 & 24578) / (1035 & 12295))), (3080 & 1) != 0);
                this.Field_6854 = -1 & -2;
                this.Method_6872();
            } else if (class_42376.Field_42392 == this.Field_6855) {
                this.Method_6893(this.Field_6856 * (12298 & 17270) / (-26993 & 8307), (10385 & 16424) != 0);
                this.Field_6854 = -2 & -2;
                this.Method_6872();
            }
        }
    }

    protected void Method_6884(int n, int n2, int n3, int n4) {
        if (((Boolean)this.Field_6844.Field_84.Field_39732.Field_8856.\u0000strictfp()).booleanValue()) {
            this.Field_6844.Method_253().Method_34707(Class_1578.Field_1582);
            Class_16867.Method_16924(0.19090909f * 4.1904764f, 0.9692308f * 0.82539684f, 0.91139245f * 0.87777776f, 1.0f);
            Class_1551.Method_1566(28677 & -28864, n, 0.0f, n, this.Field_6861, n2, this.Field_6861, this.Field_6842);
        } else {
            Class_7644 class_7644 = Class_7644.Method_7649();
            Class_22385 class_22385 = class_7644.Method_7648();
            this.Field_6844.Method_253().Method_34707(Class_1551.Field_1554);
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            float f = 3.952381f * 8.096386f;
            class_22385.Method_22417(2359 & 20687, Class_29585.Field_29586);
            class_22385.Method_22443(this.Field_6846, n2, 0.0).Method_22433(0.0, (float)n2 / (2.6f * 12.307693f)).Method_22424(4161 & -21180, 19285 & -20288, 15296 & 84, n4).Method_22451();
            class_22385.Method_22443(this.Field_6846 + this.Field_6861, n2, 0.0).Method_22433((float)this.Field_6861 / (0.17391305f * 184.0f), (float)n2 / (1.254902f * 25.5f)).Method_22424(-32692 & 576, 2626 & 353, 64 & -32695, n4).Method_22451();
            class_22385.Method_22443(this.Field_6846 + this.Field_6861, n, 0.0).Method_22433((float)this.Field_6861 / (9.142858f * 3.5f), (float)n / (72.38095f * 0.44210526f)).Method_22424(-32062 & 8289, 3178 & 24656, 4202 & -32063, n3).Method_22451();
            class_22385.Method_22443(this.Field_6846, n, 0.0).Method_22433(0.0, (float)n / (18.133333f * 1.7647059f)).Method_22424(9552 & 4164, 16456 & 8771, 10313 & -32672, n3).Method_22451();
            class_7644.Method_7647();
        }
    }

    protected int Method_6885() {
        return this.Field_6861 / (11522 & 21011) + (-12164 & 1278);
    }

    protected abstract int Method_6886();

    public int Method_6887(int n, int n2) {
        int n3 = this.Field_6846 + this.Field_6861 / (9227 & -27822) - this.Method_6882() / (-13290 & 8450);
        int n4 = this.Field_6846 + this.Field_6861 / (451 & 3622) + this.Method_6882() / (-30577 & 5170);
        int n5 = n2 - this.Field_6849 - this.Field_6850 + this.Method_6902() - (678 & 8452);
        int n6 = n5 / this.Field_6856;
        return n < this.Method_6885() && n >= n3 && n <= n4 && n6 >= 0 && n5 >= 0 && n6 < this.Method_6886() ? n6 : -1 & -1;
    }

    public void Method_6888(int n, int n2, float f) {
        this.Method_6901(n, n2, f, (-32767 & 1057) != 0);
    }

    protected int Method_6889() {
        return this.Method_6886() * this.Field_6856 + this.Field_6850;
    }

    protected void Method_6890(boolean bl, int n) {
        this.Field_6862 = bl;
        this.Field_6850 = n;
        if (!bl) {
            this.Field_6850 = 20112 & -24510;
        }
    }

    public int Method_6891() {
        return Math.max(7328 & 16386, this.Method_6889() - (this.Field_6869 - this.Field_6849 - (23572 & 8709)));
    }

    protected abstract void Method_6892();

    public void Method_6893(float f, boolean bl) {
        float f2 = this.Method_6907(this.Field_6847 + f);
        this.Method_6871(f2, bl);
    }

    public int Method_6894() {
        return this.Field_6856;
    }

    public boolean Method_6895(int n) {
        return (n >= this.Field_6849 && n <= this.Field_6869 && this.Field_6866 >= this.Field_6846 && this.Field_6866 <= this.Field_6863 ? 121 & 515 : 8 & 8738) != 0;
    }

    protected void Method_6896(int n, int n2) {
    }

    private void Method_6897() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_6898(int n) {
        this.Field_6846 = n;
        this.Field_6863 = n + this.Field_6861;
    }

    public void Method_6899(int n, int n2, float f, boolean bl) {
        if (this.Field_6848) {
            int n3;
            this.Field_6866 = n;
            this.Field_6860 = n2;
            this.Method_6892();
            int n4 = this.Method_6885();
            int n5 = n4 + (-21482 & 16486);
            this.Method_6872();
            Class_16867.Method_16931();
            Class_16867.Method_16954();
            Class_7644 class_7644 = Class_7644.Method_7649();
            Class_22385 class_22385 = class_7644.Method_7648();
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            int n6 = this.Field_6846 + this.Field_6861 / (-30514 & 24611) - this.Method_6882() / (66 & 24602) + (178 & 6914);
            int n7 = this.Field_6849 + (68 & -32124) - this.Method_6902();
            if (this.Field_6862) {
                this.Method_6877(n6, n7, class_7644);
            }
            this.Method_6900(n6, n7, n, n2);
            Class_16867.Method_16944();
            int n8 = 8301 & -32636;
            this.Method_6884(8984 & 64, this.Field_6849, 255 & 767, 767 & 4351);
            this.Method_6884(this.Field_6869, this.Field_6842, -16140 & 6245, 3839 & 16639);
            Class_16867.Method_16947();
            Class_16867.Method_16984(3974 & 802, 1927 & 17163, 32 & -15526, -32767 & 3201);
            Class_16867.Method_16985();
            Class_16867.Method_16972(16197 & 7457);
            Class_16867.Method_16922();
            if (bl) {
                class_22385.Method_22417(6167 & -23545, Class_29585.Field_29586);
                class_22385.Method_22443(this.Field_6846, this.Field_6849 + n8, 0.0).Method_22433(0.0, 1.0).Method_22424(897 & 2052, 2576 & 1129, -10352 & 3, 576 & -27364).Method_22451();
                class_22385.Method_22443(this.Field_6863, this.Field_6849 + n8, 0.0).Method_22433(1.0, 1.0).Method_22424(4112 & 1024, 2057 & 9248, 7268 & -15856, 18432 & -24506).Method_22451();
                class_22385.Method_22443(this.Field_6863, this.Field_6849, 0.0).Method_22433(1.0, 0.0).Method_22424(23121 & -31736, 22145 & 12, 37 & 6488, 27259 & 1206).Method_22451();
                class_22385.Method_22443(this.Field_6846, this.Field_6849, 0.0).Method_22433(0.0, 0.0).Method_22424(8256 & 0, 16384 & 8530, 10256 & -32573, -30150 & 4402).Method_22451();
                class_7644.Method_7647();
                class_22385.Method_22417(-32569 & 3103, Class_29585.Field_29586);
                class_22385.Method_22443(this.Field_6846, this.Field_6869, 0.0).Method_22433(0.0, 1.0).Method_22424(24768 & 5894, -20397 & 0, -30140 & 16385, -16334 & 3250).Method_22451();
                class_22385.Method_22443(this.Field_6863, this.Field_6869, 0.0).Method_22433(1.0, 1.0).Method_22424(24602 & 4672, 17436 & 6690, 4226 & -32248, 20602 & 2102).Method_22451();
                class_22385.Method_22443(this.Field_6863, this.Field_6869 - n8, 0.0).Method_22433(1.0, 0.0).Method_22424(20992 & 1036, 2208 & 25356, 25921 & 30, -32000 & 29760).Method_22451();
                class_22385.Method_22443(this.Field_6846, this.Field_6869 - n8, 0.0).Method_22433(0.0, 0.0).Method_22424(512 & 316, 15392 & -16192, 25666 & -26576, -30264 & 5124).Method_22451();
                class_7644.Method_7647();
            }
            if ((n3 = this.Method_6891()) > 0) {
                int n9 = (this.Field_6869 - this.Field_6849) * (this.Field_6869 - this.Field_6849) / this.Method_6889();
                n9 = Class_13337.Method_13367(n9, 2336 & -15134, this.Field_6869 - this.Field_6849 - (8875 & -16120));
                int n10 = this.Method_6902() * (this.Field_6869 - this.Field_6849 - n9) / n3 + this.Field_6849;
                if (n10 < this.Field_6849) {
                    n10 = this.Field_6849;
                }
                class_22385.Method_22417(-30585 & 25095, Class_29585.Field_29586);
                class_22385.Method_22443(n4, this.Field_6869, 0.0).Method_22433(0.0, 1.0).Method_22424(5813 & 2112, 20506 & 9248, -24511 & 21016, 16639 & -22017).Method_22451();
                class_22385.Method_22443(n5, this.Field_6869, 0.0).Method_22433(1.0, 1.0).Method_22424(6497 & 8, 544 & -28288, -26298 & 521, 10495 & 21759).Method_22451();
                class_22385.Method_22443(n5, this.Field_6849, 0.0).Method_22433(1.0, 0.0).Method_22424(20612 & 1147, 16544 & -32752, 512 & 4582, 16639 & -16641).Method_22451();
                class_22385.Method_22443(n4, this.Field_6849, 0.0).Method_22433(0.0, 0.0).Method_22424(4 & 8449, 2304 & 16432, 25385 & -31598, 2815 & -32257).Method_22451();
                class_7644.Method_7647();
                class_22385.Method_22417(15 & 807, Class_29585.Field_29586);
                class_22385.Method_22443(n4, n10 + n9, 0.0).Method_22433(0.0, 1.0).Method_22424(14470 & -15743, -12076 & 9354, 1712 & -24186, 18687 & 4351).Method_22451();
                class_22385.Method_22443(n5, n10 + n9, 0.0).Method_22433(1.0, 1.0).Method_22424(128 & 688, 2240 & 4260, -22888 & 18822, -31489 & 2303).Method_22451();
                class_22385.Method_22443(n5, n10, 0.0).Method_22433(1.0, 0.0).Method_22424(1203 & 14528, -30580 & 28817, 24712 & -32608, 255 & 6911).Method_22451();
                class_22385.Method_22443(n4, n10, 0.0).Method_22433(0.0, 0.0).Method_22424(384 & 2212, 8832 & 18566, -2880 & 136, 255 & -28417).Method_22451();
                class_7644.Method_7647();
                class_22385.Method_22417(9287 & 2215, Class_29585.Field_29586);
                class_22385.Method_22443(n4, n10 + n9 - (-5725 & 1093), 0.0).Method_22433(0.0, 1.0).Method_22424(-32574 & 229, 9180 & -30493, -15159 & 2502, 511 & -32513).Method_22451();
                class_22385.Method_22443(n5 - (5831 & -32735), n10 + n9 - (-28047 & 8321), 0.0).Method_22433(1.0, 1.0).Method_22424(15058 & 1473, 8672 & 4804, 192 & 16578, 255 & 22783).Method_22451();
                class_22385.Method_22443(n5 - (1665 & 16689), n10, 0.0).Method_22433(1.0, 0.0).Method_22424(4288 & 732, 4554 & 736, -32024 & 25792, -24065 & 22271).Method_22451();
                class_22385.Method_22443(n4, n10, 0.0).Method_22433(0.0, 0.0).Method_22424(13036 & -15920, 3300 & 25027, -28480 & 17856, 26879 & -32513).Method_22451();
                class_7644.Method_7647();
            }
            this.Method_6896(n, n2);
            Class_16867.Method_16965();
            Class_16867.Method_16972(-24768 & 7476);
            Class_16867.Method_16913();
            Class_16867.Method_16952();
        }
    }

    protected void Method_6900(int n, int n2, int n3, int n4) {
        int n5 = this.Method_6886();
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        boolean bl = (Boolean)this.Field_6844.Field_84.Field_39732.Field_8856.\u0000strictfp();
        for (int i = -13656 & 8531; i < n5; ++i) {
            int n6;
            int n7;
            int n8 = n2 + i * this.Field_6856 + this.Field_6850;
            int n9 = this.Field_6856 - (12806 & -16251);
            if (n8 > this.Field_6869 || n8 + n9 < this.Field_6849) {
                this.Method_6873(i, n, n8);
            }
            if (bl) {
                n6 = n8 - (17043 & 1090);
                n7 = n8 + this.Field_6856 - (27959 & 515);
                int n10 = this.Field_6846 + (this.Field_6861 / (114 & -24830) - this.Method_6882() / (3 & 17634));
                Class_40903 class_40903 = (Class_40903)this.Field_6864.get(i);
                if (this.Field_6843 && this.Method_6875(i)) {
                    if (class_40903 == null) {
                        class_40903 = new Class_40903(n10, n6, n10 + this.Method_6882(), n7, 0.28f * 0.71428573f, 1.0f, 2.0f);
                        class_40903.Method_40909();
                        this.Field_6864.put(i, class_40903);
                    } else {
                        class_40903.Method_40909();
                        this.Field_6864.replace(i, class_40903);
                    }
                } else if (class_40903 != null) {
                    class_40903.Method_40908();
                    this.Field_6864.replace(i, class_40903);
                }
                if (class_40903 != null) {
                    class_40903.Method_40912(n10, n10 + this.Method_6882());
                    class_40903.Method_40914(n6, n7);
                    if (class_40903.Method_40913() <= 0.81904763f * 0.24418604f) {
                        this.Field_6864.remove(i);
                    } else {
                        class_40903.Method_40910(this.Field_6844.Field_36);
                    }
                }
            } else if (this.Field_6843 && this.Method_6875(i)) {
                n6 = this.Field_6846 + (this.Field_6861 / (8202 & 18742) - this.Method_6882() / (-24510 & 2187));
                n7 = this.Field_6846 + this.Field_6861 / (198 & 4643) + this.Method_6882() / (8210 & 7490);
                Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
                Class_16867.Method_16922();
                class_22385.Method_22417(8295 & 135, Class_29585.Field_29586);
                class_22385.Method_22443(n6, n8 + n9 + (23658 & 386), 0.0).Method_22433(0.0, 1.0).Method_22424(1154 & -28536, -32117 & 29904, 133 & 8880, 22783 & 255).Method_22451();
                class_22385.Method_22443(n7, n8 + n9 + (28466 & 130), 0.0).Method_22433(1.0, 1.0).Method_22424(4777 & 132, -31088 & 12680, 17601 & -17502, 25087 & 1279).Method_22451();
                class_22385.Method_22443(n7, n8 - (4115 & -22494), 0.0).Method_22433(1.0, 0.0).Method_22424(9944 & 16548, 10376 & -31037, -16224 & 12744, 1023 & 8447).Method_22451();
                class_22385.Method_22443(n6, n8 - (-30590 & 5246), 0.0).Method_22433(0.0, 0.0).Method_22424(-11616 & 156, 394 & 32497, 4600 & 25222, 255 & -27393).Method_22451();
                class_22385.Method_22443(n6 + (4179 & -30331), n8 + n9 + (-23039 & 20657), 0.0).Method_22433(0.0, 1.0).Method_22424(2370 & 9228, 17 & 8324, 16394 & 64, 8447 & -14849).Method_22451();
                class_22385.Method_22443(n7 - (4099 & -32711), n8 + n9 + (17507 & 2945), 0.0).Method_22433(1.0, 1.0).Method_22424(-32056 & 20482, 0 & -22362, 0 & -1749, 3071 & 9471).Method_22451();
                class_22385.Method_22443(n7 - (-32763 & 3), n8 - (16385 & 9), 0.0).Method_22433(1.0, 0.0).Method_22424(584 & 6160, 29953 & 128, 988 & 16416, 2559 & 9471).Method_22451();
                class_22385.Method_22443(n6 + (19463 & 12353), n8 - (395 & 69), 0.0).Method_22433(0.0, 0.0).Method_22424(194 & -23808, 3084 & 419, 19512 & -28093, 2303 & -11777).Method_22451();
                class_7644.Method_7647();
                Class_16867.Method_16965();
            }
            this.Method_6905(i, n, n8, n9, n3, n4);
        }
    }

    public void Method_6901(int n, int n2, float f, boolean bl) {
        this.Method_6904();
        if (((Boolean)this.Field_6844.Field_84.Field_39732.Field_8856.\u0000strictfp()).booleanValue()) {
            this.Method_6899(n, n2, f, bl);
            return;
        }
        if (this.Field_6848) {
            this.Field_6866 = n;
            this.Field_6860 = n2;
            this.Method_6892();
            int n3 = this.Method_6885();
            int n4 = n3 + (-32122 & 4422);
            this.Method_6872();
            Class_16867.Method_16931();
            Class_16867.Method_16954();
            Class_7644 class_7644 = Class_7644.Method_7649();
            Class_22385 class_22385 = class_7644.Method_7648();
            this.Field_6844.Method_253().Method_34707(Class_1551.Field_1554);
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            float f2 = 152.61539f * 0.20967741f;
            class_22385.Method_22417(8279 & 16935, Class_29585.Field_29586);
            class_22385.Method_22443(this.Field_6846, this.Field_6869, 0.0).Method_22433((float)this.Field_6846 / f2, (float)(this.Field_6869 + this.Method_6902()) / f2).Method_22424(-27088 & 16676, -32224 & 5232, 2090 & 4208, 28927 & 1535).Method_22451();
            class_22385.Method_22443(this.Field_6863, this.Field_6869, 0.0).Method_22433((float)this.Field_6863 / f2, (float)(this.Field_6869 + this.Method_6902()) / f2).Method_22424(-21208 & 679, 1066 & 6756, 9278 & 2337, -28417 & 1279).Method_22451();
            class_22385.Method_22443(this.Field_6863, this.Field_6849, 0.0).Method_22433((float)this.Field_6863 / f2, (float)(this.Field_6849 + this.Method_6902()) / f2).Method_22424(17722 & 8289, 2592 & 233, -6472 & 34, -27393 & 2303).Method_22451();
            class_22385.Method_22443(this.Field_6846, this.Field_6849, 0.0).Method_22433((float)this.Field_6846 / f2, (float)(this.Field_6849 + this.Method_6902()) / f2).Method_22424(4193 & 10292, 8224 & 16800, 10020 & 32, 12543 & 16639).Method_22451();
            class_7644.Method_7647();
            int n5 = this.Field_6846 + this.Field_6861 / (2087 & -15998) - this.Method_6882() / (16650 & 2695) + (-6118 & 4290);
            int n6 = this.Field_6849 + (-32571 & 13612) - this.Method_6902();
            if (this.Field_6862) {
                this.Method_6877(n5, n6, class_7644);
            }
            this.Method_6900(n5, n6, n, n2);
            Class_16867.Method_16944();
            int n7 = -20466 & 2053;
            this.Method_6884(2080 & 25157, this.Field_6849, -31489 & 27391, 255 & -5889);
            this.Method_6884(this.Field_6869, this.Field_6842, 1279 & -27905, 12543 & 3071);
            Class_16867.Method_16947();
            Class_16867.Method_16984(-31997 & 11042, -27901 & 771, -28455 & 9218, 9249 & 2137);
            Class_16867.Method_16985();
            Class_16867.Method_16972(7989 & -25279);
            Class_16867.Method_16922();
            class_22385.Method_22417(-24569 & 16607, Class_29585.Field_29586);
            class_22385.Method_22443(this.Field_6846, this.Field_6849 + n7, 0.0).Method_22433(0.0, 1.0).Method_22424(-14296 & 21, -24575 & 16446, -14172 & 10048, -32410 & 20609).Method_22451();
            class_22385.Method_22443(this.Field_6863, this.Field_6849 + n7, 0.0).Method_22433(1.0, 1.0).Method_22424(1114 & -32383, 2958 & 1040, -32616 & 0, 8194 & -29168).Method_22451();
            class_22385.Method_22443(this.Field_6863, this.Field_6849, 0.0).Method_22433(1.0, 0.0).Method_22424(17925 & 80, 4245 & -13024, 642 & 18453, 7423 & 255).Method_22451();
            class_22385.Method_22443(this.Field_6846, this.Field_6849, 0.0).Method_22433(0.0, 0.0).Method_22424(-31928 & 8194, -22016 & 177, 5640 & -32576, 4351 & -15873).Method_22451();
            class_7644.Method_7647();
            class_22385.Method_22417(8239 & -32377, Class_29585.Field_29586);
            class_22385.Method_22443(this.Field_6846, this.Field_6869, 0.0).Method_22433(0.0, 1.0).Method_22424(-32150 & 20, 18 & 9344, -16384 & 257, -14081 & 5375).Method_22451();
            class_22385.Method_22443(this.Field_6863, this.Field_6869, 0.0).Method_22433(1.0, 1.0).Method_22424(-32495 & 12420, 384 & 19456, 324 & 9265, 8959 & -11009).Method_22451();
            class_22385.Method_22443(this.Field_6863, this.Field_6869 - n7, 0.0).Method_22433(1.0, 0.0).Method_22424(-31581 & 6416, 20742 & 128, 1032 & 6791, -32180 & 2049).Method_22451();
            class_22385.Method_22443(this.Field_6846, this.Field_6869 - n7, 0.0).Method_22433(0.0, 0.0).Method_22424(16657 & -24508, 513 & -21030, 0 & -26192, -30068 & 64).Method_22451();
            class_7644.Method_7647();
            int n8 = this.Method_6891();
            if (n8 > 0) {
                int n9 = (this.Field_6869 - this.Field_6849) * (this.Field_6869 - this.Field_6849) / this.Method_6889();
                n9 = Class_13337.Method_13367(n9, 4128 & -31712, this.Field_6869 - this.Field_6849 - (25608 & -32248));
                int n10 = this.Method_6902() * (this.Field_6869 - this.Field_6849 - n9) / n8 + this.Field_6849;
                if (n10 < this.Field_6849) {
                    n10 = this.Field_6849;
                }
                class_22385.Method_22417(1671 & 10295, Class_29585.Field_29586);
                class_22385.Method_22443(n3, this.Field_6869, 0.0).Method_22433(0.0, 1.0).Method_22424(2193 & -28608, -30440 & 16486, -30719 & 130, 3327 & 255).Method_22451();
                class_22385.Method_22443(n4, this.Field_6869, 0.0).Method_22433(1.0, 1.0).Method_22424(17666 & 552, 17 & 17568, 16614 & 4632, 4863 & -32257).Method_22451();
                class_22385.Method_22443(n4, this.Field_6849, 0.0).Method_22433(1.0, 0.0).Method_22424(22656 & 2, 4152 & 450, -25344 & 243, 255 & 2303).Method_22451();
                class_22385.Method_22443(n3, this.Field_6849, 0.0).Method_22433(0.0, 0.0).Method_22424(32 & 10321, -24317 & 2688, 1554 & 12292, 14079 & -32257).Method_22451();
                class_7644.Method_7647();
                class_22385.Method_22417(10135 & 4175, Class_29585.Field_29586);
                class_22385.Method_22443(n3, n10 + n9, 0.0).Method_22433(0.0, 1.0).Method_22424(6866 & 416, 8649 & -32090, 2176 & 5283, 18943 & -28417).Method_22451();
                class_22385.Method_22443(n4, n10 + n9, 0.0).Method_22433(1.0, 1.0).Method_22424(1920 & 227, 8921 & -32608, 4297 & 144, 29183 & 255).Method_22451();
                class_22385.Method_22443(n4, n10, 0.0).Method_22433(1.0, 0.0).Method_22424(1152 & -24100, 26776 & 4224, 8840 & 1472, 4351 & -20737).Method_22451();
                class_22385.Method_22443(n3, n10, 0.0).Method_22433(0.0, 0.0).Method_22424(-23164 & 4841, -24376 & 388, 16512 & -19051, 511 & -17665).Method_22451();
                class_7644.Method_7647();
                class_22385.Method_22417(-18409 & 16743, Class_29585.Field_29586);
                class_22385.Method_22443(n3, n10 + n9 - (24777 & 273), 0.0).Method_22433(0.0, 1.0).Method_22424(8640 & -14136, 18884 & -32528, -14120 & 8900, -32001 & 28927).Method_22451();
                class_22385.Method_22443(n4 - (21633 & 857), n10 + n9 - (129 & 16427), 0.0).Method_22433(1.0, 1.0).Method_22424(4848 & 1216, 5321 & 9204, 192 & 2272, 18687 & -30977).Method_22451();
                class_22385.Method_22443(n4 - (-16377 & 6297), n10, 0.0).Method_22433(1.0, 0.0).Method_22424(232 & 13265, 4336 & 9665, 4838 & 208, 17919 & 8447).Method_22451();
                class_22385.Method_22443(n3, n10, 0.0).Method_22433(0.0, 0.0).Method_22424(3299 & 208, -15930 & 737, 192 & 3274, 255 & 14079).Method_22451();
                class_7644.Method_7647();
            }
            this.Method_6896(n, n2);
            Class_16867.Method_16965();
            Class_16867.Method_16972(24352 & 15626);
            Class_16867.Method_16913();
            Class_16867.Method_16952();
        }
    }

    public int Method_6902() {
        return (int)this.Method_6908();
    }

    protected void Method_6903(int n, int n2) {
    }

    public void Method_6904() {
        int n;
        float f;
        double d = Class_18.Field_89.Field_127.Field_2180;
        if (d > 1.0) {
            d = 1.0;
        }
        int n2 = (f = this.Method_6907(this.Field_6851)) != this.Field_6851 ? 2881 & 8197 : -30952 & 18529;
        int n3 = n = n2 != 0 && this.Field_6853 ? 133 & -23031 : 1145 & 19072;
        if (n != 0) {
            this.Field_6853 = -30720 & 25870;
            this.Field_6847 = f;
        }
        double d2 = 0.3043476739130435 * 3.2857142857142856;
        if (this.Field_6853) {
            d2 = 0.6326530612244898 * 1.549032258064516;
        }
        float f2 = this.Field_6847 - this.Field_6851;
        if (!this.Field_6853) {
            this.Field_6867 = (float)((double)this.Field_6867 + (double)f2 * Math.min(0.6530612244897959 * 6.125000000000001 * d, 1.0));
        } else {
            this.Field_6847 = f;
        }
        this.Field_6867 = (float)((double)this.Field_6867 * Math.pow(1.0 - d2, d));
        float f3 = 0.1f * 400.0f;
        this.Field_6851 = (float)((double)this.Field_6851 + (double)this.Field_6867 * d * (double)f3);
        if (Math.abs(this.Field_6867 * f3) < 2.6987953f * 2.9642856f && (double)Math.abs(f2) <= 2.909090909090909 * 0.515625) {
            this.Field_6867 = 0.0f;
        }
    }

    protected abstract void Method_6905(int var1, int var2, int var3, int var4, int var5, int var6);

    public void Method_6906(boolean bl) {
        this.Field_6843 = bl;
    }

    public float Method_6907(float f) {
        return Class_13337.Method_13360(f, 0.0f, this.Method_6891());
    }

    public float Method_6908() {
        return this.Field_6851;
    }
}

