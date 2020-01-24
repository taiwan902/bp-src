/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_34083
extends Class_26421 {
    private int Field_34084;
    private final Class_626 Field_34085;
    private final Class_43010 Field_34086;

    protected void Method_34087(Class_23823 class_23823, int n) {
        this.Field_34084 += n;
        this.Method_34088(class_23823);
    }

    protected void Method_34088(Class_23823 class_23823) {
        if (this.Field_34084 > 0) {
            class_23823.Method_23848(this.Field_34085.\u0000strictfp, this.Field_34085, this.Field_34084);
        }
        this.Field_34084 = -32767 & 24962;
        if (class_23823.Method_23844() == Class_1956.Method_1981(Class_9265.Field_9433)) {
            this.Field_34085.Method_750(Class_21905.Field_21933);
        }
        if (class_23823.Method_23844() instanceof Class_41540) {
            this.Field_34085.Method_750(Class_21905.Field_21925);
        }
        if (class_23823.Method_23844() == Class_1956.Method_1981(Class_9265.Field_9354)) {
            this.Field_34085.Method_750(Class_21905.Field_21912);
        }
        if (class_23823.Method_23844() instanceof Class_28176) {
            this.Field_34085.Method_750(Class_21905.Field_21909);
        }
        if (class_23823.Method_23844() == Class_10527.Field_10630) {
            this.Field_34085.Method_750(Class_21905.Field_21913);
        }
        if (class_23823.Method_23844() == Class_10527.Field_10679) {
            this.Field_34085.Method_750(Class_21905.Field_21926);
        }
        if (class_23823.Method_23844() instanceof Class_41540 && ((Class_41540)class_23823.Method_23844()).\u0000strictfp() != Class_16800.Field_16806) {
            this.Field_34085.Method_750(Class_21905.Field_21928);
        }
        if (class_23823.Method_23844() instanceof Class_20825) {
            this.Field_34085.Method_750(Class_21905.Field_21919);
        }
        if (class_23823.Method_23844() == Class_1956.Method_1981(Class_9265.Field_9455)) {
            this.Field_34085.Method_750(Class_21905.Field_21910);
        }
        if (class_23823.Method_23844() == Class_1956.Method_1981(Class_9265.Field_9339)) {
            this.Field_34085.Method_750(Class_21905.Field_21918);
        }
        if (class_23823.Method_23844() == Class_10527.Field_10669 && class_23823.Method_23843() == (21 & 21251)) {
            this.Field_34085.Method_750(Class_21905.Field_21920);
        }
    }

    public Class_23823 Method_34089(int n) {
        if (this.\u0000strictfp()) {
            this.Field_34084 += Math.min(n, this.\u0000strictfp().Field_23826);
        }
        return super.Method_26427(n);
    }

    public Class_34083(Class_626 class_626, Class_43010 class_43010, Class_4961 class_4961, int n, int n2, int n3) {
        super(class_4961, n, n2, n3);
        this.Field_34085 = class_626;
        this.Field_34086 = class_43010;
    }

    public boolean Method_34090(Class_23823 class_23823) {
        return (16 & -26612) != 0;
    }

    public void Method_34091(Class_626 class_626, Class_23823 class_23823) {
        this.Method_34088(class_23823);
        Class_23823[] arrclass_23823 = Class_22497.Method_22506().Method_22507(this.Field_34086, class_626.\u0000strictfp);
        for (int i = 9732 & 18802; i < arrclass_23823.length; ++i) {
            Class_23823 class_238232 = this.Field_34086.Method_43032(i);
            Class_23823 class_238233 = arrclass_23823[i];
            if (class_238232 != null) {
                this.Field_34086.Method_43021(i, 9385 & 6673);
            }
            if (class_238233 == null) continue;
            if (this.Field_34086.Method_43032(i) == null) {
                this.Field_34086.Method_43025(i, class_238233);
                continue;
            }
            if (this.Field_34085.Field_628.Method_37824(class_238233)) continue;
            this.Field_34085.Method_733(class_238233, (-24048 & 2080) != 0);
        }
    }

    private void Method_34092() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

