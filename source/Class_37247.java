/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_37247
implements Class_561 {
    protected Class_17665[][] Field_37248;
    public Class_4810[] Field_37249;
    protected Class_283 Field_37250;
    private Class_570 Field_37251;
    protected boolean Field_37252;
    protected int Field_37253;
    protected int Field_37254;

    private int Method_37255(Class_6778 class_6778, Class_4751 class_4751) {
        if (class_6778 == Class_6778.Field_6781 && this.Field_37250.Field_284.Method_18370()) {
            return 4609 & -32696;
        }
        if (class_4751.\u0000, `() >= 0 && class_4751.\u0000, `() < (-28288 & 3921)) {
            if (this.Method_37257(class_4751).Method_3442().Method_3304()) {
                int n = 773 & 9256;
                Class_4595[] arrclass_4595 = Class_4595.Field_4600;
                int n2 = arrclass_4595.length;
                for (int i = 10 & -20203; i < n2; ++i) {
                    Class_4595 class_4595 = arrclass_4595[i];
                    int n3 = this.Method_37262(class_6778, class_4751.Method_4767(class_4595, this.Field_37249[Class_14121.Field_14134.ordinal()]));
                    if (n3 > n) {
                        n = n3;
                    }
                    if (n < (8607 & 22543)) continue;
                    return n;
                }
                return n;
            }
            int n = (class_4751.\u0000= final() >> (8454 & 2724)) - this.Field_37254;
            int n4 = (class_4751.\u0000strictfp() >> (8453 & 4100)) - this.Field_37253;
            return this.Field_37248[n][n4].Method_17705(class_6778, class_4751);
        }
        return class_6778.Field_6779;
    }

    private void Method_37256() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_3436 Method_37257(Class_4751 class_4751) {
        if (class_4751.\u0000, `() >= 0 && class_4751.\u0000, `() < (424 & 6916)) {
            Class_17665 class_17665;
            int n = (class_4751.\u0000= final() >> (-21435 & 158)) - this.Field_37254;
            int n2 = (class_4751.\u0000strictfp() >> (5 & -26868)) - this.Field_37253;
            if (n >= 0 && n < this.Field_37248.length && n2 >= 0 && n2 < this.Field_37248[n].length && (class_17665 = this.Field_37248[n][n2]) != null) {
                return class_17665.Method_17709(class_4751);
            }
        }
        return Class_9265.Field_9351.Method_3293();
    }

    public boolean Method_37258(Class_4751 class_4751) {
        return (this.Method_37257(class_4751).Method_3442().Method_3373() == Class_3713.Field_3718 ? 16481 & -28653 : 10604 & 1) != 0;
    }

    public int Method_37259(Class_4751 class_4751, Class_4595 class_4595) {
        Class_3436 class_3436 = this.Method_37257(class_4751);
        return class_3436.Method_3442().Method_3313(this, class_4751, class_3436, class_4595);
    }

    public int Method_37260(Class_4751 class_4751, int n) {
        int n2 = this.Method_37255(Class_6778.Field_6781, class_4751);
        int n3 = this.Method_37255(Class_6778.Field_6780, class_4751);
        if (n3 < n) {
            n3 = n;
        }
        return n2 << (16916 & 5302) | n3 << (4109 & -15324);
    }

    public Class_4879 Method_37261(Class_4751 class_4751) {
        int n = (class_4751.\u0000= final() >> (1028 & -19602)) - this.Field_37254;
        int n2 = (class_4751.\u0000strictfp() >> (12 & 16996)) - this.Field_37253;
        return this.Field_37248[n][n2].Method_17765(class_4751, Class_13470.Field_13472);
    }

    public int Method_37262(Class_6778 class_6778, Class_4751 class_4751) {
        if (class_4751.\u0000, `() >= 0 && class_4751.\u0000, `() < (16656 & -28916)) {
            int n = (class_4751.\u0000= final() >> (8516 & 4)) - this.Field_37254;
            int n2 = (class_4751.\u0000strictfp() >> (-16124 & 39)) - this.Field_37253;
            return this.Field_37248[n][n2].Method_17705(class_6778, class_4751);
        }
        return class_6778.Field_6779;
    }

    public Class_17281 Method_37263(Class_4751 class_4751) {
        return this.Field_37251.\u0000strictfp(class_4751);
    }

    public boolean Method_37264() {
        return this.Field_37252;
    }

    public Class_3677 Method_37265(Class_4751 class_4751) {
        return (Class_3677)this.Method_37257(class_4751);
    }

    public Class_37247(Class_283 class_283, Class_4751 class_4751, Class_4751 class_47512, int n, Class_4810[] arrclass_4810) {
        int n2;
        int n3;
        this.Field_37250 = class_283;
        if (class_283 instanceof Class_570) {
            this.Field_37251 = (Class_570)class_283;
        }
        this.Field_37254 = class_4751.\u0000= final() - n >> (28742 & 1460);
        this.Field_37253 = class_4751.\u0000strictfp() - n >> (3622 & 16580);
        int n4 = class_47512.\u0000= final() + n >> (16399 & 2116);
        int n5 = class_47512.\u0000strictfp() + n >> (22580 & 9477);
        this.Field_37248 = new Class_17665[n4 - this.Field_37254 + (1281 & -9543)][n5 - this.Field_37253 + (8271 & 17713)];
        this.Field_37252 = 17409 & -23979;
        this.Field_37249 = arrclass_4810;
        for (n2 = this.Field_37254; n2 <= n4; ++n2) {
            for (n3 = this.Field_37253; n3 <= n5; ++n3) {
                this.Field_37248[n2 - this.Field_37254][n3 - this.Field_37253] = class_283.Method_346(n2, n3);
            }
        }
        for (n2 = class_4751.\u0000= final() >> (-31700 & 214); n2 <= class_47512.\u0000= final() >> (2196 & 4165); ++n2) {
            for (n3 = class_4751.\u0000strictfp() >> (8268 & -31594); n3 <= class_47512.\u0000strictfp() >> (10756 & 1228); ++n3) {
                Class_17665 class_17665 = this.Field_37248[n2 - this.Field_37254][n3 - this.Field_37253];
                if (class_17665 == null || class_17665.Method_17747(class_4751.\u0000, `(), class_47512.\u0000, `())) continue;
                this.Field_37252 = 24586 & -27388;
            }
        }
    }

    public Class_43755 Method_37266() {
        return this.Field_37250.Method_394();
    }
}

