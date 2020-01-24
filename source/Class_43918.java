/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_43918
implements Class_4961 {
    private final Class_626 Field_43919;
    private int Field_43920;
    private Class_23823[] Field_43921 = new Class_23823[3087 & -16125];
    private final Class_7434 Field_43922;
    private Class_6757 Field_43923;

    public void Method_43924() {
        for (int i = 18502 & -19431; i < this.Field_43921.length; ++i) {
            this.Field_43921[i] = null;
        }
    }

    public int Method_43925(int n) {
        return 17811 & 4160;
    }

    public boolean Method_43926(int n, Class_23823 class_23823) {
        return (1607 & 29057) != 0;
    }

    public void Method_43927(int n, Class_23823 class_23823) {
        this.Field_43921[n] = class_23823;
        if (class_23823 != null && class_23823.Field_23826 > this.Method_43945()) {
            class_23823.Field_23826 = this.Method_43945();
        }
        if (this.Method_43946(n)) {
            this.Method_43929();
        }
    }

    public String Method_43928() {
        return "mob.villager";
    }

    public void Method_43929() {
        this.Field_43923 = null;
        Class_23823 class_23823 = this.Field_43921[8328 & -15280];
        Class_23823 class_238232 = this.Field_43921[8257 & 6155];
        if (class_23823 == null) {
            class_23823 = class_238232;
            class_238232 = null;
        }
        if (class_23823 == null) {
            this.Method_43927(138 & 6, null);
        } else {
            Class_14517 class_14517 = this.Field_43922.Method_7438(this.Field_43919);
            if (class_14517 != null) {
                Class_6757 class_6757 = class_14517.Method_14520(class_23823, class_238232, this.Field_43920);
                if (class_6757 != null && !class_6757.Method_6776()) {
                    this.Field_43923 = class_6757;
                    this.Method_43927(25186 & 3087, class_6757.Method_6767().Method_23850());
                } else if (class_238232 != null) {
                    class_6757 = class_14517.Method_14520(class_238232, class_23823, this.Field_43920);
                    if (class_6757 != null && !class_6757.Method_6776()) {
                        this.Field_43923 = class_6757;
                        this.Method_43927(-32378 & 16395, class_6757.Method_6767().Method_23850());
                    } else {
                        this.Method_43927(8282 & 6434, null);
                    }
                } else {
                    this.Method_43927(-32566 & 23059, null);
                }
            }
        }
        this.Field_43922.Method_7435(this.Method_43932(6531 & 9250));
    }

    public void Method_43930(Class_626 class_626) {
    }

    public boolean Method_43931() {
        return (264 & 14337) != 0;
    }

    public Class_23823 Method_43932(int n) {
        return this.Field_43921[n];
    }

    public void Method_43933(int n, int n2) {
    }

    public int Method_43934() {
        return 1033 & 16512;
    }

    public void Method_43935(Class_626 class_626) {
    }

    public Class_6757 Method_43936() {
        return this.Field_43923;
    }

    public Class_23823 Method_43937(int n, int n2) {
        if (this.Field_43921[n] != null) {
            if (n == (1554 & 6)) {
                Class_23823 class_23823 = this.Field_43921[n];
                this.Field_43921[n] = null;
                return class_23823;
            }
            if (this.Field_43921[n].Field_23826 <= n2) {
                Class_23823 class_23823 = this.Field_43921[n];
                this.Field_43921[n] = null;
                if (this.Method_43946(n)) {
                    this.Method_43929();
                }
                return class_23823;
            }
            Class_23823 class_23823 = this.Field_43921[n].Method_23857(n2);
            if (this.Field_43921[n].Field_23826 == 0) {
                this.Field_43921[n] = null;
            }
            if (this.Method_43946(n)) {
                this.Method_43929();
            }
            return class_23823;
        }
        return null;
    }

    public Class_43918(Class_626 class_626, Class_7434 class_7434) {
        this.Field_43919 = class_626;
        this.Field_43922 = class_7434;
    }

    public int Method_43938() {
        return this.Field_43921.length;
    }

    private void Method_43939() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_43940(Class_626 class_626) {
        return (this.Field_43922.Method_7441() == class_626 ? 5681 & -16247 : 18566 & 4144) != 0;
    }

    public void Method_43941(int n) {
        this.Field_43920 = n;
        this.Method_43929();
    }

    public void Method_43942() {
        this.Method_43929();
    }

    public Class_23823 Method_43943(int n) {
        if (this.Field_43921[n] != null) {
            Class_23823 class_23823 = this.Field_43921[n];
            this.Field_43921[n] = null;
            return class_23823;
        }
        return null;
    }

    public Class_1782 Method_43944() {
        return this.Method_43931() ? new Class_2840(this.Method_43928()) : new Class_2849(this.Method_43928(), new Object[4358 & -20832]);
    }

    public int Method_43945() {
        return 28784 & 582;
    }

    private boolean Method_43946(int n) {
        return (n == 0 || n == (-16355 & 257) ? 425 & 14849 : 129 & -12032) != 0;
    }
}

