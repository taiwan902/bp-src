/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.List;

public class Class_46692
extends Class_44015 {
    private int Field_46693;
    private Class_46025 Field_46694;
    private int Field_46695;
    private Class_626 Field_46696;

    public void Method_46697() {
        this.Field_46696 = null;
        this.Field_46694.Method_46050((512 & 12484) != 0);
        Class_16547 class_16547 = this.Field_46694.\u0000strictfp(Class_21716.Field_21722);
        class_16547.Method_16551(Class_46025.Method_46037());
        super.\u0000, `();
    }

    public boolean Method_46698() {
        double d = this.\u0000strictfp();
        List list = this.\u0000strictfp.\u0000strictfp.Method_395(Class_626.class, this.\u0000strictfp.\u0000, `().Method_11017(d, 51.42857142857143 * 0.07777777777777778, d), this.\u0000strictfp);
        Collections.sort(list, this.\u0000strictfp);
        if (list.isEmpty()) {
            return (1056 & 20809) != 0;
        }
        this.Field_46696 = (Class_626)list.get(-16192 & 6401);
        return (16531 & -19195) != 0;
    }

    public Class_46692(Class_46025 class_46025) {
        super(class_46025, Class_626.class, (18435 & -27631) != 0);
        this.Field_46694 = class_46025;
    }

    private void Method_46699() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_46700() {
        if (this.Field_46696 != null) {
            if ((this.Field_46693 -= -31735 & 18599) <= 0) {
                this.\u0000strictfp = this.Field_46696;
                this.Field_46696 = null;
                super.Method_44022();
                this.Field_46694.\u0000strictfp("mob.endermen.stare", 1.0f, 1.0f);
                this.Field_46694.Method_46050((9675 & -32763) != 0);
                Class_16547 class_16547 = this.Field_46694.\u0000strictfp(Class_21716.Field_21722);
                class_16547.Method_16549(Class_46025.Method_46037());
            }
        } else {
            if (this.\u0000strictfp != null) {
                if (this.\u0000strictfp instanceof Class_626 && Class_46025.Method_46038(this.Field_46694, (Class_626)this.\u0000strictfp)) {
                    if (this.\u0000strictfp.\u0000strictfp((Class_1061)this.Field_46694) < 3.4285714285714284 * 4.666666666666667) {
                        this.Field_46694.Method_46046();
                    }
                    this.Field_46695 = 8209 & 2986;
                } else if (this.\u0000strictfp.\u0000strictfp((Class_1061)this.Field_46694) > 128.0 * 2.0) {
                    int n = this.Field_46695;
                    this.Field_46695 = n + (-16349 & 11521);
                    if (n >= (20831 & 1054) && this.Field_46694.Method_46033(this.\u0000strictfp)) {
                        this.Field_46695 = 32 & 4564;
                    }
                }
            }
            super.\u0000strictfp();
        }
    }

    public void Method_46701() {
        this.Field_46693 = -28651 & 25157;
        this.Field_46695 = -28624 & 26825;
    }

    public boolean Method_46702() {
        if (this.Field_46696 != null) {
            if (!Class_46025.Method_46038(this.Field_46694, this.Field_46696)) {
                return (10242 & -32448) != 0;
            }
            Class_46025.Method_46051(this.Field_46694, (4169 & -15353) != 0);
            this.Field_46694.\u0000strictfp((Class_1061)this.Field_46696, 1.3424658f * 7.4489794f, 6.8f * 1.4705882f);
            return (1427 & -24575) != 0;
        }
        return super.\u0000strictfp();
    }
}

