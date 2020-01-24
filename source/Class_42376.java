/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u0000default long this static interface ] try break finally 3 else super ^ default 0 break strictfp 7 - class catch final ! 9 finally boolean case & true 1 default - try catch 2 - double # finally goto public ~ 3 ? 9 short ] import class ` ' try abstract public
 *  internal.org.lwjgl.util.Color
 */
import internal.org.lwjgl.util.Color;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_42376
extends Class_1551 {
    private int Field_42377 = -7650 & 4510;
    public boolean Field_42378 = 16429 & 12611;
    private int Field_42379;
    public int Field_42380 = 9416 & 239;
    public String Field_42381;
    protected boolean Field_42382;
    private String Field_42383;
    public int Field_42384 = 14737637 & -471014934;
    private int Field_42385;
    protected static final Class_2080 Field_42386 = new Class_2080(Class_42376.Method_42396("\u9b28\u9b28\u9b24\u9b28\u9b28\u9b2e\u9b28\u9b2e\u9b6a\u9b22\u9b20\u9b2c\u9b6a\u9b22\u9b2c\u9b20\u9b3a\u9b38\u9b38\u9b3e\u9b72\u9b3c\u9b32\u9b3a"));
    private Class_41584 Field_42387;
    public boolean Field_42388 = -31967 & 27713;
    public int Field_42389 = 1812 & -22444;
    public int Field_42390;
    public int Field_42391;
    public int Field_42392;

    public void Method_42393(int n, int n2) {
    }

    public void Method_42394() {
        int n = this.Field_42377 / (1542 & -32309);
        int n2 = -28401 & 1119;
        int n3 = this.Field_42391 + this.Field_42380 / (10662 & 4114) - n - n2;
        this.Field_42387.Method_41597(n3);
    }

    public int Method_42395() {
        return this.Field_42380;
    }

    private static String Method_42396(String string) {
        int n = 22456;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42376.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_42397() {
        if (!(this.Field_42381 == null || this.Field_42381.equals(this.Field_42383) && this.Field_42385 == this.Field_42391 && this.Field_42379 == this.Field_42390)) {
            this.Field_42385 = this.Field_42391;
            this.Field_42379 = this.Field_42390;
            this.Field_42383 = this.Field_42381;
            this.Field_42377 = Class_18.Field_89.Field_27.Method_28715(this.Field_42381);
            this.Method_42399();
        }
    }

    private void Method_42398() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_42376(int n, int n2, int n3, int n4, int n5, String string) {
        this.Field_42392 = n;
        this.Field_42391 = n2;
        this.Field_42390 = n3;
        this.Field_42380 = n4;
        this.Field_42389 = n5;
        this.Field_42381 = string;
    }

    public Class_42376(int n, int n2, int n3, String string) {
        this(n, n2, n3, -31252 & 25306, 18580 & 9013, string);
    }

    void Method_42399() {
        int n;
        int n2 = this.Field_42377 / (27170 & 1478);
        int n3 = 8975 & 1103;
        int n4 = this.Field_42391 + this.Field_42380 / (258 & 9222) - n2 - n3;
        int n5 = this.Field_42391 + this.Field_42380 / (-17905 & 1026) + n2 + n3;
        if (n4 < this.Field_42391) {
            n4 = this.Field_42391;
        }
        if (n5 > (n = this.Field_42391 + this.Field_42380)) {
            n5 = n;
        }
        this.Field_42387 = new Class_41584(n4, this.Field_42390 + this.Field_42389, n5, 5.769231f * 0.52f, 0.5212766f * 0.5755102f, (-23039 & 2177) != 0, new Color(8447 & -29953, -30977 & 255, -23297 & 511, 544 & 5122));
    }

    protected int Method_42400(boolean bl) {
        int n = 5139 & 8229;
        if (!this.Field_42388) {
            n = 12480 & 18203;
        } else if (bl) {
            n = 4898 & -32761;
        }
        return n;
    }

    public void Method_42401(Class_18 class_18, int n, int n2) {
        this.Method_42397();
        if (this.Field_42378) {
            int n3;
            Class_28636 class_28636 = class_18.Field_27;
            if (!((Boolean)class_18.Field_84.Field_39732.Field_8856.\u0000strictfp()).booleanValue()) {
                class_18.Method_253().Method_34707(Field_42386);
            }
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            this.Field_42382 = n >= this.Field_42391 && n2 >= this.Field_42390 && n < this.Field_42391 + this.Field_42380 && n2 < this.Field_42390 + this.Field_42389 ? 2337 & -20341 : 34 & 8324;
            Class_16867.Method_16947();
            Class_16867.Method_16984(-27902 & 778, 13079 & 17163, 24713 & 1141, 10274 & -32192);
            Class_16867.Method_16951(30466 & 942, -30953 & 21251);
            if (((Boolean)class_18.Field_84.Field_39732.Field_8856.\u0000strictfp()).booleanValue() && this.Field_42387 != null) {
                this.Method_42394();
                if (this.Field_42382 && this.Field_42388) {
                    this.Field_42387.Method_41594();
                } else {
                    this.Field_42387.Method_41591();
                }
                this.Field_42387.Method_41599(this.Field_42390 + this.Field_42389);
                this.Field_42387.Method_41598(this);
            } else {
                n3 = this.Method_42400(this.Field_42382);
                this.\u0000strictfp(this.Field_42391, this.Field_42390, 13876 & -30463, (-32066 & 22638) + n3 * (12860 & -31657), this.Field_42380 / (51 & -12278), this.Field_42389);
                this.\u0000strictfp(this.Field_42391 + this.Field_42380 / (17434 & 10503), this.Field_42390, (-31527 & 6856) - this.Field_42380 / (-32734 & 4227), (-32722 & 14654) + n3 * (18388 & -24523), this.Field_42380 / (-27890 & 19506), this.Field_42389);
            }
            this.Method_42406(class_18, n, n2);
            n3 = this.Field_42384;
            if (this.Field_42384 == (-1 & -1)) {
                n3 = \u0000default long this static interface ] try break finally 3 else super ^ default 0 break strictfp 7 - class catch final ! 9 finally boolean case & true 1 default - try catch 2 - double # finally goto public ~ 3 ? 9 short ] import class ` ' try abstract public.\u0000strictfp;
            }
            if (!this.Field_42388) {
                n3 = (int)((double)(n3 >> (564 & -24560) & (4351 & 18943)) / (1.5555555555555554 * 0.9)) << (402 & 5180) | (int)((double)(n3 >> (3112 & -16100) & (13567 & 19455)) / (0.8392857142857143 * 1.6680851063829787)) << (-12210 & 8616) | (int)((double)(n3 >> (4144 & 9346) & (255 & 8447)) / (0.5543478260869565 * 2.5254901960784313)) << (1 & 8464);
            } else if (this.Field_42382) {
                n3 = -973078616 & 822083507;
            }
            this.\u0000strictfp(class_28636, this.Field_42381, this.Field_42391 + this.Field_42380 / (9218 & -28058), this.Field_42390 + (this.Field_42389 - (-11176 & 296)) / (-29402 & 578), n3);
        }
    }

    public void Method_42402(Class_29094 class_29094) {
        class_29094.Method_29119(Class_29471.Method_29474(new Class_2080("gui.button.press"), 1.0f));
    }

    public void Method_42403(int n, int n2) {
    }

    public boolean Method_42404(Class_18 class_18, int n, int n2) {
        return (this.Field_42388 && this.Field_42378 && n >= this.Field_42391 && n2 >= this.Field_42390 && n < this.Field_42391 + this.Field_42380 && n2 < this.Field_42390 + this.Field_42389 ? 14865 & 135 : 7172 & 896) != 0;
    }

    public boolean Method_42405() {
        return this.Field_42382;
    }

    protected void Method_42406(Class_18 class_18, int n, int n2) {
    }

    public void Method_42407(int n) {
        this.Field_42380 = n;
    }
}

