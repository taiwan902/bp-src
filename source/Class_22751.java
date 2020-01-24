/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_22751
implements Class_1486 {
    private int Field_22752;
    private int Field_22753;
    private Class_35650 Field_22754;
    private Class_43755 Field_22755;
    private int Field_22756;
    private Class_26801 Field_22757;
    private boolean Field_22758;
    private boolean Field_22759;

    public int Method_22760() {
        return this.Field_22752;
    }

    public void Method_22761(Class_14856 class_14856) {
        class_14856.Method_14887(this);
    }

    public int Method_22762() {
        return this.Field_22753;
    }

    public Class_26801 Method_22763() {
        return this.Field_22757;
    }

    public void Method_22764(Class_29900 class_29900) {
        class_29900.Method_30010(this.Field_22753);
        int n = this.Field_22754.Method_35660();
        if (this.Field_22758) {
            n |= -31416 & 24712;
        }
        class_29900.Method_29949(n);
        class_29900.Method_29949(this.Field_22756);
        class_29900.Method_29949(this.Field_22757.Method_26822());
        class_29900.Method_29949(this.Field_22752);
        class_29900.Method_29960(this.Field_22755.Method_43785());
        class_29900.Method_29980(this.Field_22759);
    }

    private void Method_22765() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_22766(Class_29900 class_29900) {
        this.Field_22753 = class_29900.Method_29914();
        int n = class_29900.Method_30016();
        this.Field_22758 = (n & (9228 & 137)) == (4174 & 19497) ? 31005 & -32671 : 2796 & 8194;
        this.Field_22754 = Class_35650.Method_35659(n &= -9 & -1);
        this.Field_22756 = class_29900.Method_29944();
        this.Field_22757 = Class_26801.Method_26817(class_29900.Method_30016());
        this.Field_22752 = class_29900.Method_30016();
        this.Field_22755 = Class_43755.Method_43784(class_29900.Method_29991(17425 & 4214));
        if (this.Field_22755 == null) {
            this.Field_22755 = Class_43755.Field_43765;
        }
        this.Field_22759 = class_29900.Method_29962();
    }

    public boolean Method_22767() {
        return this.Field_22758;
    }

    public Class_35650 Method_22768() {
        return this.Field_22754;
    }

    public boolean Method_22769() {
        return this.Field_22759;
    }

    public void Method_22770(Class_10954 class_10954) {
        this.Method_22761((Class_14856)class_10954);
    }

    public int Method_22771() {
        return this.Field_22756;
    }

    public Class_43755 Method_22772() {
        return this.Field_22755;
    }

    public Class_22751() {
    }

    public Class_22751(int n, Class_35650 class_35650, boolean bl, int n2, Class_26801 class_26801, int n3, Class_43755 class_43755, boolean bl2) {
        this.Field_22753 = n;
        this.Field_22756 = n2;
        this.Field_22757 = class_26801;
        this.Field_22754 = class_35650;
        this.Field_22752 = n3;
        this.Field_22758 = bl;
        this.Field_22755 = class_43755;
        this.Field_22759 = bl2;
    }
}

