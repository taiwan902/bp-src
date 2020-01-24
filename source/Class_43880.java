/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.util.Color
 */
import internal.org.lwjgl.util.Color;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_43880
extends Class_42376 {
    private Class_41584 Field_43881;
    private final float Field_43882;
    private Class_8135 Field_43883;
    private final float Field_43884;
    private Class_41584 Field_43885;
    private Class_41584 Field_43886;
    private String Field_43887;
    private Class_41584 Field_43888;
    public boolean Field_43889;
    private Class_11214 Field_43890;
    private final Class_11216 Field_43891;
    private float Field_43892 = 1.0f;

    public float Method_43893() {
        return this.Field_43892;
    }

    public void Method_43894(int n, int n2) {
        this.Field_43889 = 28 & 16963;
    }

    public void Method_43895(Class_18 class_18, int n, int n2) {
        if (!((Boolean)class_18.Field_84.Field_39732.Field_8856.\u0000strictfp()).booleanValue()) {
            super.Method_42401(class_18, n, n2);
            return;
        }
        if (this.\u0000, `) {
            Class_28636 class_28636 = class_18.Field_27;
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            this.\u0000= final = n >= this.\u0000= final && n2 >= this.\u0000, for && n < this.\u0000= final + this.\u0000, ` && n2 < this.\u0000, for + this.\u0000strictfp ? 16897 & -31477 : 3688 & -32511;
            int n3 = this.\u0000= final ? 1 : 0;
            if ((this.Field_43889 || this.\u0000= final) && this.\u0000strictfp) {
                this.Field_43883.Method_8142();
            } else {
                this.Field_43883.Method_8143();
            }
            int n4 = this.\u0000= final + (int)(this.Field_43892 * (float)(this.\u0000, ` - (9242 & 2568)));
            int n5 = n4 + (2219 & 8984);
            int n6 = this.\u0000, for + this.\u0000strictfp;
            this.Field_43888.Method_41595(n4, n6, n5);
            this.Field_43885.Method_41595(n4, this.\u0000, for, n5);
            this.Field_43886.Method_41599(this.\u0000, for);
            this.Field_43881.Method_41599(n6);
            this.Field_43886.Method_41596(this.\u0000= final, this.\u0000= final + this.\u0000, `);
            this.Field_43881.Method_41596(this.\u0000= final, this.\u0000= final + this.\u0000, `);
            this.Field_43886.Method_41598(this);
            this.Field_43881.Method_41598(this);
            this.Field_43885.Method_41598(this);
            this.Field_43888.Method_41598(this);
            this.Method_43902(class_18, n, n2);
            int n7 = -1813257992 & 1289807332;
            if (!this.\u0000strictfp) {
                n7 = 295739822 & 145615600;
            } else if (this.\u0000= final) {
                n7 = 1778384881 & -2130706528;
            }
            this.\u0000strictfp(class_28636, this.\u0000strictfp, this.\u0000= final + this.\u0000, ` / (17666 & -17806), this.\u0000, for + (this.\u0000strictfp - (7227 & -24568)) / (22530 & 1615), n7);
        }
    }

    public void Method_43896(float f, boolean bl) {
        this.Field_43892 = (f - this.Field_43882) / (this.Field_43884 - this.Field_43882);
        this.\u0000strictfp = this.Method_43903();
        if (bl) {
            this.Field_43891.Method_11219(this.\u0000
            , this.Method_43900());
        }
    }

    public Class_43880(Class_11216 class_11216, int n, int n2, int n3, String string, float f, float f2, float f3, Class_11214 class_11214) {
        super(n, n2, n3, -31594 & 16886, 1212 & -32170, "");
        this.Field_43887 = string;
        this.Field_43882 = f;
        this.Field_43884 = f2;
        this.Field_43892 = (f3 - f) / (f2 - f);
        this.Field_43890 = class_11214;
        this.Field_43891 = class_11216;
        this.\u0000strictfp = this.Method_43903();
        this.Field_43883 = new Class_8135(5.859375f * 0.85333335f, 0.24242425f * 1.2375001f, 1.0f);
        Color color = new Color(10228 & -10132, 20078 & 357, -32658 & 100, 240 & 16908);
        this.Field_43886 = new Class_41584(this.\u0000= final, this.\u0000, for, this.\u0000= final + this.\u0000, `, this.Field_43883, (-12239 & 9219) != 0, color);
        this.Field_43881 = new Class_41584(this.\u0000= final, this.\u0000, for + this.\u0000strictfp, this.\u0000= final + this.\u0000, `, this.Field_43883, (4101 & -23511) != 0, color);
        Color color2 = new Color(12031 & -15873, 2815 & 255, -32513 & 1279, 4361 & 9254);
        int n4 = this.\u0000= final + (int)(this.Field_43892 * (float)(this.\u0000, ` - (-32088 & 24654)));
        this.Field_43885 = new Class_41584(n4, this.\u0000, for, n4 + (4166 & 11268), this.Field_43883, (2393 & 8353) != 0, color2);
        this.Field_43888 = new Class_41584(n4, this.\u0000, for + this.\u0000strictfp, n4 + (20509 & 3076), this.Field_43883, (-14445 & 2057) != 0, color2);
    }

    public void Method_43897(float f) {
        this.Field_43892 = f;
        this.\u0000strictfp = this.Method_43903();
        this.Field_43891.Method_11219(this.\u0000
        , this.Method_43900());
    }

    private void Method_43898() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected int Method_43899(boolean bl) {
        return -25528 & 17026;
    }

    public float Method_43900() {
        return this.Field_43882 + (this.Field_43884 - this.Field_43882) * this.Field_43892;
    }

    public boolean Method_43901(Class_18 class_18, int n, int n2) {
        if (super.Method_42404(class_18, n, n2)) {
            this.Field_43892 = (float)(n - (this.\u0000= final + (11588 & -28538))) / (float)(this.\u0000, ` - (10393 & -32694));
            if (this.Field_43892 < 0.0f) {
                this.Field_43892 = 0.0f;
            }
            if (this.Field_43892 > 1.0f) {
                this.Field_43892 = 1.0f;
            }
            this.\u0000strictfp = this.Method_43903();
            this.Field_43891.Method_11219(this.\u0000
            , this.Method_43900());
            this.Field_43889 = 10497 & 521;
            return (4133 & 19969) != 0;
        }
        return (17576 & -25855) != 0;
    }

    protected void Method_43902(Class_18 class_18, int n, int n2) {
        if (this.\u0000, `) {
            if (this.Field_43889) {
                this.Field_43892 = (float)(n - (this.\u0000= final + (68 & -32226))) / (float)(this.\u0000, ` - (56 & -498));
                if (this.Field_43892 < 0.0f) {
                    this.Field_43892 = 0.0f;
                }
                if (this.Field_43892 > 1.0f) {
                    this.Field_43892 = 1.0f;
                }
                this.\u0000strictfp = this.Method_43903();
                this.Field_43891.Method_11219(this.\u0000
                , this.Method_43900());
            }
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            if (!((Boolean)class_18.Field_84.Field_39732.Field_8856.\u0000strictfp()).booleanValue()) {
                this.\u0000strictfp(this.\u0000= final + (int)(this.Field_43892 * (float)(this.\u0000, ` - (10094 & -30711))), this.\u0000, for, -24515 & 19456, 12482 & 3191, 12380 & 3206, -32236 & 20693);
                this.\u0000strictfp(this.\u0000= final + (int)(this.Field_43892 * (float)(this.\u0000, ` - (20554 & 2060))) + (1062 & 31564), this.\u0000, for, -14908 & 708, 12363 & -31162, 9055 & 4132, 16884 & -30699);
            }
        }
    }

    private String Method_43903() {
        return this.Field_43890 == null ? Class_9802.Method_9806(this.Field_43887, new Object[8760 & 257]) + ": " + this.Method_43900() : this.Field_43890.Method_11215(this.\u0000
        , Class_9802.Method_9806(this.Field_43887, new Object[2056 & 16898]), this.Method_43900());
    }
}

