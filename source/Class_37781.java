/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_37781
implements Class_4961 {
    public int Field_37782;
    private Class_23823 Field_37783;
    public Class_23823[] Field_37784 = new Class_23823[24638 & 229];
    public boolean Field_37785;
    public Class_626 Field_37786;
    public Class_23823[] Field_37787 = new Class_23823[5316 & -7916];

    public int Method_37788() {
        return this.Field_37784.length + (18948 & 8244);
    }

    public void Method_37789(Class_626 class_626) {
    }

    private int Method_37790(Class_23823 class_23823) {
        for (int i = -32638 & 27764; i < this.Field_37784.length; ++i) {
            if (this.Field_37784[i] == null || this.Field_37784[i].Method_23844() != class_23823.Method_23844() || !this.Field_37784[i].Method_23898() || this.Field_37784[i].Field_23826 >= this.Field_37784[i].Method_23837() || this.Field_37784[i].Field_23826 >= this.Method_37823() || this.Field_37784[i].Method_23877() && this.Field_37784[i].Method_23843() != class_23823.Method_23843() || !Class_23823.Method_23895(this.Field_37784[i], class_23823)) continue;
            return i;
        }
        return -1 & -1;
    }

    public boolean Method_37791(int n, Class_23823 class_23823) {
        return (4297 & 18707) != 0;
    }

    public Class_37781(Class_626 class_626) {
        this.Field_37786 = class_626;
    }

    private int Method_37792(Class_23823 class_23823) {
        Class_1956 class_1956 = class_23823.Method_23844();
        int n = class_23823.Field_23826;
        int n2 = this.Method_37790(class_23823);
        if (n2 < 0) {
            n2 = this.Method_37805();
        }
        if (n2 < 0) {
            return n;
        }
        if (this.Field_37784[n2] == null) {
            this.Field_37784[n2] = new Class_23823(class_1956, -13312 & 4736, class_23823.Method_23843());
            if (class_23823.Method_23842()) {
                this.Field_37784[n2].Method_23869((Class_1699)class_23823.Method_23845().Method_1732());
            }
        }
        int n3 = n;
        if (n > this.Field_37784[n2].Method_23837() - this.Field_37784[n2].Field_23826) {
            n3 = this.Field_37784[n2].Method_23837() - this.Field_37784[n2].Field_23826;
        }
        if (n3 > this.Method_37823() - this.Field_37784[n2].Field_23826) {
            n3 = this.Method_37823() - this.Field_37784[n2].Field_23826;
        }
        if (n3 == 0) {
            return n;
        }
        this.Field_37784[n2].Field_23826 += n3;
        this.Field_37784[n2].Field_23824 = 9733 & -32753;
        return n -= n3;
    }

    public Class_23823 Method_37793(int n) {
        return this.Field_37787[n];
    }

    public Class_23823 Method_37794(int n) {
        Class_23823[] arrclass_23823 = this.Field_37784;
        if (n >= arrclass_23823.length) {
            n -= arrclass_23823.length;
            arrclass_23823 = this.Field_37787;
        }
        return arrclass_23823[n];
    }

    public void Method_37795(int n, int n2) {
    }

    public void Method_37796(int n, Class_23823 class_23823) {
        Class_23823[] arrclass_23823 = this.Field_37784;
        if (n >= arrclass_23823.length) {
            n -= arrclass_23823.length;
            arrclass_23823 = this.Field_37787;
        }
        arrclass_23823[n] = class_23823;
    }

    public void Method_37797(Class_1758 class_1758) {
        this.Field_37784 = new Class_23823[14636 & -32651];
        this.Field_37787 = new Class_23823[16934 & 1092];
        for (int i = 19712 & 74; i < class_1758.Method_1772(); ++i) {
            Class_1699 class_1699 = class_1758.Method_1768(i);
            int n = class_1699.Method_1716("Slot") & (1535 & -1793);
            Class_23823 class_23823 = Class_23823.Method_23840(class_1699);
            if (class_23823 == null) continue;
            if (n >= 0 && n < this.Field_37784.length) {
                this.Field_37784[n] = class_23823;
            }
            if (n < (16748 & 3174) || n >= this.Field_37787.length + (4452 & 17636)) continue;
            this.Field_37787[n - (100 & -23836)] = class_23823;
        }
    }

    public void Method_37798() {
        int n;
        for (n = 1554 & 12328; n < this.Field_37784.length; ++n) {
            if (this.Field_37784[n] == null) continue;
            this.Field_37786.Method_843(this.Field_37784[n], (589 & -29693) != 0, (0 & -14229) != 0);
            this.Field_37784[n] = null;
        }
        for (n = 2240 & 1552; n < this.Field_37787.length; ++n) {
            if (this.Field_37787[n] == null) continue;
            this.Field_37786.Method_843(this.Field_37787[n], (1553 & -32637) != 0, (7888 & 16416) != 0);
            this.Field_37787[n] = null;
        }
    }

    public void Method_37799() {
        this.Field_37785 = 13573 & -32567;
    }

    public Class_1758 Method_37800(Class_1758 class_1758) {
        Class_1699 class_1699;
        int n;
        for (n = 8194 & -27496; n < this.Field_37784.length; ++n) {
            if (this.Field_37784[n] == null) continue;
            class_1699 = new Class_1699();
            class_1699.Method_1724("Slot", (byte)n);
            this.Field_37784[n].Method_23841(class_1699);
            class_1758.Method_1781(class_1699);
        }
        for (n = 1024 & 24; n < this.Field_37787.length; ++n) {
            if (this.Field_37787[n] == null) continue;
            class_1699 = new Class_1699();
            class_1699.Method_1724("Slot", (byte)(n + (4215 & 228)));
            this.Field_37787[n].Method_23841(class_1699);
            class_1758.Method_1781(class_1699);
        }
        return class_1758;
    }

    public void Method_37801(Class_1956 class_1956, int n, boolean bl, boolean bl2) {
        int n2;
        Class_23823 class_23823 = this.Method_37821();
        int n3 = n2 = bl ? this.Method_37806(class_1956, n) : this.Method_37813(class_1956);
        if (n2 >= 0 && n2 < (20505 & 1033)) {
            this.Field_37782 = n2;
        } else if (bl2 && class_1956 != null) {
            int n4 = this.Method_37805();
            if (n4 >= 0 && n4 < (4683 & -32599)) {
                this.Field_37782 = n4;
            }
            if (class_23823 == null || !class_23823.Method_23866() || this.Method_37806(class_23823.Method_23844(), class_23823.Method_23853()) != this.Field_37782) {
                int n5;
                int n6 = this.Method_37806(class_1956, n);
                if (n6 >= 0) {
                    n5 = this.Field_37784[n6].Field_23826;
                    this.Field_37784[n6] = this.Field_37784[this.Field_37782];
                } else {
                    n5 = 521 & -5771;
                }
                this.Field_37784[this.Field_37782] = new Class_23823(class_1956, n5, n);
            }
        }
    }

    public void Method_37802() {
        for (int i = -7856 & 4106; i < this.Field_37784.length; ++i) {
            if (this.Field_37784[i] == null) continue;
            this.Field_37784[i].Method_23897(this.Field_37786.\u0000strictfp, this.Field_37786, i, (this.Field_37782 == i ? 131 & 21033 : 16385 & 4688) != 0);
        }
    }

    public int Method_37803() {
        return 11313 & -32506;
    }

    public void Method_37804(Class_23823 class_23823) {
        this.Field_37783 = class_23823;
    }

    public int Method_37805() {
        for (int i = 72 & 1058; i < this.Field_37784.length; ++i) {
            if (this.Field_37784[i] != null) continue;
            return i;
        }
        return -1 & -1;
    }

    private int Method_37806(Class_1956 class_1956, int n) {
        for (int i = 257 & 17924; i < this.Field_37784.length; ++i) {
            if (this.Field_37784[i] == null || this.Field_37784[i].Method_23844() != class_1956 || this.Field_37784[i].Method_23843() != n) continue;
            return i;
        }
        return -1 & -1;
    }

    public static int Method_37807() {
        return 20553 & -32721;
    }

    public int Method_37808() {
        int n = -24563 & 5136;
        for (int i = 2 & 10988; i < this.Field_37787.length; ++i) {
            if (this.Field_37787[i] == null || !(this.Field_37787[i].Method_23844() instanceof Class_37716)) continue;
            int n2 = ((Class_37716)this.Field_37787[i].Method_23844()).Field_37718;
            n += n2;
        }
        return n;
    }

    public void Method_37809(float f) {
        if ((f /= 6.7058825f * 0.5964912f) < 1.0f) {
            f = 1.0f;
        }
        for (int i = -12128 & 9486; i < this.Field_37787.length; ++i) {
            if (this.Field_37787[i] == null || !(this.Field_37787[i].Method_23844() instanceof Class_37716)) continue;
            this.Field_37787[i].Method_23883((int)f, this.Field_37786);
            if (this.Field_37787[i].Field_23826 != 0) continue;
            this.Field_37787[i] = null;
        }
    }

    public boolean Method_37810(Class_3238 class_3238) {
        if (class_3238.Method_3373().Method_3767()) {
            return (20753 & 8363) != 0;
        }
        Class_23823 class_23823 = this.Method_37794(this.Field_37782);
        return (class_23823 != null ? class_23823.Method_23856(class_3238) : 14433 & 17408) != 0;
    }

    public Class_1782 Method_37811() {
        return this.Method_37828() ? new Class_2840(this.Method_37817()) : new Class_2849(this.Method_37817(), new Object[1159 & 10256]);
    }

    public Class_23823 Method_37812() {
        return this.Field_37783;
    }

    private int Method_37813(Class_1956 class_1956) {
        for (int i = -32247 & 6416; i < this.Field_37784.length; ++i) {
            if (this.Field_37784[i] == null || this.Field_37784[i].Method_23844() != class_1956) continue;
            return i;
        }
        return -1 & -1;
    }

    public int Method_37814(int n) {
        return 16708 & -25592;
    }

    public void Method_37815(Class_626 class_626) {
    }

    private void Method_37816() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_37817() {
        return "container.inventory";
    }

    public boolean Method_37818(Class_23823 class_23823) {
        int n;
        for (n = -7904 & 17; n < this.Field_37787.length; ++n) {
            if (this.Field_37787[n] == null || !this.Field_37787[n].Method_23865(class_23823)) continue;
            return (16899 & 2333) != 0;
        }
        for (n = 648 & -28656; n < this.Field_37784.length; ++n) {
            if (this.Field_37784[n] == null || !this.Field_37784[n].Method_23865(class_23823)) continue;
            return (813 & 24579) != 0;
        }
        return (4178 & -7647) != 0;
    }

    public void Method_37819(Class_37781 class_37781) {
        int n;
        for (n = 14344 & 17430; n < this.Field_37784.length; ++n) {
            this.Field_37784[n] = Class_23823.Method_23855(class_37781.Field_37784[n]);
        }
        for (n = 12528 & 3072; n < this.Field_37787.length; ++n) {
            this.Field_37787[n] = Class_23823.Method_23855(class_37781.Field_37787[n]);
        }
        this.Field_37782 = class_37781.Field_37782;
    }

    public void Method_37820(int n) {
        if (n > 0) {
            n = 1153 & 12625;
        }
        if (n < 0) {
            n = -1 & -1;
        }
        this.Field_37782 -= n;
        while (this.Field_37782 < 0) {
            this.Field_37782 += -30689 & 1385;
        }
        while (this.Field_37782 >= (12569 & 2089)) {
            this.Field_37782 -= 13 & -28983;
        }
    }

    public Class_23823 Method_37821() {
        return this.Field_37782 < (24681 & 9) && this.Field_37782 >= 0 ? this.Field_37784[this.Field_37782] : null;
    }

    public void Method_37822() {
        int n;
        for (n = 4864 & 64; n < this.Field_37784.length; ++n) {
            this.Field_37784[n] = null;
        }
        for (n = 6657 & -31440; n < this.Field_37787.length; ++n) {
            this.Field_37787[n] = null;
        }
    }

    public int Method_37823() {
        return -30351 & 12354;
    }

    public boolean Method_37824(Class_23823 class_23823) {
        if (class_23823 != null && class_23823.Field_23826 != 0 && class_23823.Method_23844() != null) {
            try {
                int n;
                if (class_23823.Method_23878()) {
                    int n2 = this.Method_37805();
                    if (n2 >= 0) {
                        this.Field_37784[n2] = Class_23823.Method_23855(class_23823);
                        this.Field_37784[n2].Field_23824 = 1821 & -30683;
                        class_23823.Field_23826 = 24658 & 257;
                        return (21611 & 8193) != 0;
                    }
                    if (this.Field_37786.Field_694.Method_18094()) {
                        class_23823.Field_23826 = 8741 & 20482;
                        return (161 & 3345) != 0;
                    }
                    return (8305 & -30326) != 0;
                }
                do {
                    n = class_23823.Field_23826;
                    class_23823.Field_23826 = this.Method_37792(class_23823);
                } while (class_23823.Field_23826 > 0 && class_23823.Field_23826 < n);
                if (class_23823.Field_23826 == n && this.Field_37786.Field_694.Method_18094()) {
                    class_23823.Field_23826 = 25904 & 576;
                    return (2069 & 20707) != 0;
                }
                return (class_23823.Field_23826 < n ? 181 & 24577 : 9792 & -32634) != 0;
            }
            catch (Throwable throwable) {
                Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Adding item to inventory");
                Class_13220 class_13220 = class_13268.Method_13280("Item being added");
                class_13220.Method_13231("Item ID", Class_1956.Method_1986(class_23823.Method_23844()));
                class_13220.Method_13231("Item data", class_23823.Method_23843());
                class_13220.Method_13232("Item name", new Class_14577(this, class_23823));
                throw new Class_1809(class_13268);
            }
        }
        return (10305 & 4660) != 0;
    }

    public float Method_37825(Class_3238 class_3238) {
        float f = 1.0f;
        if (this.Field_37784[this.Field_37782] != null) {
            f *= this.Field_37784[this.Field_37782].Method_23860(class_3238);
        }
        return f;
    }

    public boolean Method_37826(Class_1956 class_1956) {
        int n = this.Method_37813(class_1956);
        if (n < 0) {
            return (14402 & 672) != 0;
        }
        if ((this.Field_37784[n].Field_23826 -= -7935 & 4107) <= 0) {
            this.Field_37784[n] = null;
        }
        return (8223 & -16127) != 0;
    }

    public boolean Method_37827(Class_626 class_626) {
        return (this.Field_37786.\u0000= float ? 9393 & 16460 : (class_626.\u0000strictfp((Class_1061)this.Field_37786) <= 1.0909090909090908 * 58.66666666666667 ? 8773 & -28541 : 18944 & 4162)) != 0;
    }

    public boolean Method_37828() {
        return (-14717 & 10304) != 0;
    }

    public Class_23823 Method_37829(int n) {
        Class_23823[] arrclass_23823 = this.Field_37784;
        if (n >= this.Field_37784.length) {
            arrclass_23823 = this.Field_37787;
            n -= this.Field_37784.length;
        }
        if (arrclass_23823[n] != null) {
            Class_23823 class_23823 = arrclass_23823[n];
            arrclass_23823[n] = null;
            return class_23823;
        }
        return null;
    }

    public Class_23823 Method_37830(int n, int n2) {
        Class_23823[] arrclass_23823 = this.Field_37784;
        if (n >= this.Field_37784.length) {
            arrclass_23823 = this.Field_37787;
            n -= this.Field_37784.length;
        }
        if (arrclass_23823[n] != null) {
            if (arrclass_23823[n].Field_23826 <= n2) {
                Class_23823 class_23823 = arrclass_23823[n];
                arrclass_23823[n] = null;
                return class_23823;
            }
            Class_23823 class_23823 = arrclass_23823[n].Method_23857(n2);
            if (arrclass_23823[n].Field_23826 == 0) {
                arrclass_23823[n] = null;
            }
            return class_23823;
        }
        return null;
    }

    public boolean Method_37831(Class_1956 class_1956) {
        int n = this.Method_37813(class_1956);
        return (n >= 0 ? 16917 & 1219 : 1028 & 320) != 0;
    }

    public int Method_37832(Class_1956 class_1956, int n, int n2, Class_1699 class_1699) {
        int n3;
        int n4;
        Class_23823 class_23823;
        int n5 = 16401 & 4296;
        for (n4 = -28288 & 79; n4 < this.Field_37784.length; ++n4) {
            class_23823 = this.Field_37784[n4];
            if (class_23823 == null || class_1956 != null && class_23823.Method_23844() != class_1956 || n > (-1 & -1) && class_23823.Method_23843() != n || class_1699 != null && !Class_25852.Method_25854(class_1699, class_23823.Method_23845(), (-13135 & 4109) != 0)) continue;
            n3 = n2 <= 0 ? class_23823.Field_23826 : Math.min(n2 - n5, class_23823.Field_23826);
            n5 += n3;
            if (n2 == 0) continue;
            this.Field_37784[n4].Field_23826 -= n3;
            if (this.Field_37784[n4].Field_23826 == 0) {
                this.Field_37784[n4] = null;
            }
            if (n2 <= 0 || n5 < n2) continue;
            return n5;
        }
        for (n4 = 3640 & -8191; n4 < this.Field_37787.length; ++n4) {
            class_23823 = this.Field_37787[n4];
            if (class_23823 == null || class_1956 != null && class_23823.Method_23844() != class_1956 || n > (-1 & -1) && class_23823.Method_23843() != n || class_1699 != null && !Class_25852.Method_25854(class_1699, class_23823.Method_23845(), (-28022 & 8209) != 0)) continue;
            n3 = n2 <= 0 ? class_23823.Field_23826 : Math.min(n2 - n5, class_23823.Field_23826);
            n5 += n3;
            if (n2 == 0) continue;
            this.Field_37787[n4].Field_23826 -= n3;
            if (this.Field_37787[n4].Field_23826 == 0) {
                this.Field_37787[n4] = null;
            }
            if (n2 <= 0 || n5 < n2) continue;
            return n5;
        }
        if (this.Field_37783 != null) {
            if (class_1956 != null && this.Field_37783.Method_23844() != class_1956) {
                return n5;
            }
            if (n > (-1 & -1) && this.Field_37783.Method_23843() != n) {
                return n5;
            }
            if (class_1699 != null && !Class_25852.Method_25854(class_1699, this.Field_37783.Method_23845(), (6694 & -32447) != 0)) {
                return n5;
            }
            n4 = n2 <= 0 ? this.Field_37783.Field_23826 : Math.min(n2 - n5, this.Field_37783.Field_23826);
            n5 += n4;
            if (n2 != 0) {
                this.Field_37783.Field_23826 -= n4;
                if (this.Field_37783.Field_23826 == 0) {
                    this.Field_37783 = null;
                }
                if (n2 > 0 && n5 >= n2) {
                    return n5;
                }
            }
        }
        return n5;
    }
}

