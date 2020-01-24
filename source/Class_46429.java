/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Class_46429
extends Class_43566 {
    private int Field_46430;
    private int Field_46431;
    private UUID Field_46432;
    private static final Class_10375 Field_46433;
    private static final UUID Field_46434;

    private static String Method_46435(String string) {
        int n = 21975;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_46429.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_46436() {
        Class_16547 class_16547 = this.\u0000strictfp(Class_21716.Field_21722);
        if (this.Method_46443()) {
            if (!this.\u0000, for() && !class_16547.Method_16555(Field_46433)) {
                class_16547.Method_16549(Field_46433);
            }
            this.Field_46431 -= 3 & -28059;
        } else if (class_16547.Method_16555(Field_46433)) {
            class_16547.Method_16551(Field_46433);
        }
        if (this.Field_46430 > 0 && (this.Field_46430 -= 8721 & -16241) == 0) {
            this.\u0000strictfp("mob.zombiepig.zpigangry", this.\u0000= float() * 2.0f, ((this.\u0000strictfp.nextFloat() - this.\u0000strictfp.nextFloat()) * (0.89772725f * 0.22278482f) + 1.0f) * (0.23333333f * 7.7142854f));
        }
        if (this.Field_46431 > 0 && this.Field_46432 != null && this.\u0000= final() == null) {
            Class_626 class_626 = this.\u0000strictfp.Method_422(this.Field_46432);
            this.Method_46442(class_626);
            this.\u0000strictfp = class_626;
            this.\u0000+ = this.\u0000= package();
        }
        super.\u0000, if();
    }

    private void Method_46437() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_46438(String string) {
        int n = 13806;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_46429.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_46439() {
        this.\u0000strictfp(Class_10527.Field_10705, 2135 & 4769);
    }

    protected void Method_46440(Class_33888 class_33888) {
        this.\u0000strictfp(24705 & -29856, new Class_23823(Class_10527.Field_10642));
    }

    public boolean Method_46441() {
        return (this.\u0000strictfp.Method_542(this.\u0000, `(), this) && this.\u0000strictfp.Method_461(this, this.\u0000, `()).isEmpty() && !this.\u0000strictfp.Method_509(this.\u0000, `()) ? 1293 & 19 : 770 & 240) != 0;
    }

    public void Method_46442(Class_859 class_859) {
        super.\u0000= final(class_859);
        if (class_859 != null) {
            this.Field_46432 = class_859.\u0000strictfp();
        }
    }

    public boolean Method_46443() {
        return (this.Field_46431 > 0 ? -32509 & 20613 : -30671 & 12616) != 0;
    }

    protected String Method_46444() {
        return "mob.zombiepig.zpigdeath";
    }

    protected void Method_46445(boolean bl, int n) {
        int n2;
        int n3 = this.\u0000strictfp.nextInt((-32725 & 3094) + n);
        for (n2 = 592 & 16676; n2 < n3; ++n2) {
            this.\u0000strictfp(Class_10527.Field_10574, 393 & -8175);
        }
        n3 = this.\u0000strictfp.nextInt((3146 & -31994) + n);
        for (n2 = 16436 & -28543; n2 < n3; ++n2) {
            this.\u0000strictfp(Class_10527.Field_10581, -31695 & 31369);
        }
    }

    public void Method_46446(Class_1699 class_1699) {
        super.Method_43581(class_1699);
        this.Field_46431 = class_1699.Method_1726("Anger");
        String string = class_1699.Method_1708("HurtBy");
        if (string.length() > 0) {
            this.Field_46432 = UUID.fromString(string);
            Class_626 class_626 = this.\u0000strictfp.Method_422(this.Field_46432);
            this.Method_46442(class_626);
            if (class_626 != null) {
                this.\u0000strictfp = class_626;
                this.\u0000+ = this.\u0000= package();
            }
        }
    }

    protected String Method_46447() {
        return "mob.zombiepig.zpig";
    }

    protected void Method_46448() {
        super.Method_43617();
        this.\u0000strictfp(\u0000strictfp).Method_16556(0.0);
        this.\u0000strictfp(Class_21716.Field_21722).Method_16556(0.3034042608230672 * 0.7580645161290323);
        this.\u0000strictfp(Class_21716.Field_21717).Method_16556(1.7777777777777777 * 2.8125);
    }

    protected void Method_46449() {
        this.\u0000, `.Method_16858(1333 & 21003, new Class_40704(this));
        this.\u0000, `.Method_16858(4122 & -32701, new Class_45949(this));
    }

    public boolean Method_46450(Class_626 class_626) {
        return (7296 & -32767) != 0;
    }

    protected String Method_46451() {
        return "mob.zombiepig.zpighurt";
    }

    public void Method_46452(Class_1699 class_1699) {
        super.Method_43576(class_1699);
        class_1699.Method_1731("Anger", (short)this.Field_46431);
        if (this.Field_46432 != null) {
            class_1699.Method_1702("HurtBy", this.Field_46432.toString());
        } else {
            class_1699.Method_1702("HurtBy", "");
        }
    }

    public void Method_46453() {
        super.Method_43602();
    }

    public Class_46429(Class_283 class_283) {
        super(class_283);
        this.\u0000, # = 6733 & 16643;
    }

    public Class_26405 Method_46454(Class_33888 class_33888, Class_26405 class_26405) {
        super.Method_43603(class_33888, class_26405);
        this.\u0000= float((1536 & 28810) != 0);
        return class_26405;
    }

    public boolean Method_46455() {
        return (this.\u0000strictfp.Method_487() != Class_26801.Field_26803 ? 33 & 26509 : 29060 & 1040) != 0;
    }

    public boolean Method_46456(Class_32797 class_32797, float f) {
        if (this.\u0000strictfp(class_32797)) {
            return (3392 & 18) != 0;
        }
        Class_1061 class_1061 = class_32797.Method_32856();
        if (class_1061 instanceof Class_626) {
            this.Method_46457(class_1061);
        }
        return super.Method_43587(class_32797, f);
    }

    public void Method_46457(Class_1061 class_1061) {
        this.Field_46431 = (-32368 & 28060) + this.\u0000strictfp.nextInt(-32261 & 3984);
        this.Field_46430 = this.\u0000strictfp.nextInt(297 & -854);
        if (class_1061 instanceof Class_859) {
            this.Method_46442((Class_859)class_1061);
        }
    }

    static {
        Field_46434 = UUID.fromString(Class_46429.Method_46435("\u0602\u0602\u0600\u0600\u0606\u0626\u0604\u0604\u060a\u0608\u0628\u062a\u060e\u060e\u060c\u060c\u0630\u0632\u0610\u0632\u0616\u0616\u0616\u0614\u0618\u0638\u0618\u0618\u063c\u061c\u061e\u063c\u0622\u0620\u0620\u0620"));
        Field_46433 = new Class_10375(Field_46434, Class_46429.Method_46438("\u20cd\u20e8\u20e8\u20ed\u20ed\u20e5\u20e5\u20e0\u20e1\u20a4\u20e5\u20e4\u20e1\u20e1\u20e0\u20a4\u20ec\u20e1\u20e1\u20ed\u20e8"), 0.1076923076923077 * 0.4642857142857143, -16352 & 12421).Method_10386((5642 & -6080) != 0);
    }
}

