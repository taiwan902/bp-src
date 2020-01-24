/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.util.Color
 */
import internal.org.lwjgl.util.Color;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_43037
extends Class_42376 {
    private Class_41584 Field_43038;
    public boolean Field_43039;
    private Class_41584 Field_43040;
    private final String Field_43041;
    private Class_8135 Field_43042;
    private final Class_6295 Field_43043;
    final Class_20850 Field_43044;
    private Class_41584 Field_43045;
    public float Field_43046;
    private Class_41584 Field_43047;

    public boolean Method_43048(Class_18 class_18, int n, int n2) {
        if (super.Method_42404(class_18, n, n2)) {
            this.Field_43046 = (float)(n - (this.\u0000= final + (16542 & -28635))) / (float)(this.\u0000, ` - (6584 & 16394));
            this.Field_43046 = Class_13337.Method_13360(this.Field_43046, 0.0f, 1.0f);
            class_18.Field_84.Method_39895(this.Field_43043, this.Field_43046);
            class_18.Field_84.Method_39903();
            this.\u0000strictfp = this.Field_43041 + ": " + this.Field_43044.Method_20860(this.Field_43043);
            this.Field_43039 = 6215 & -14831;
            return (33 & -32235) != 0;
        }
        return (1408 & -32686) != 0;
    }

    protected void Method_43049(Class_18 class_18, int n, int n2) {
        if (this.\u0000, `) {
            if (this.Field_43039) {
                this.Field_43046 = (float)(n - (this.\u0000= final + (2566 & 12452))) / (float)(this.\u0000, ` - (17436 & -24566));
                this.Field_43046 = Class_13337.Method_13360(this.Field_43046, 0.0f, 1.0f);
                class_18.Field_84.Method_39895(this.Field_43043, this.Field_43046);
                class_18.Field_84.Method_39903();
                this.\u0000strictfp = this.Field_43041 + ": " + this.Field_43044.Method_20860(this.Field_43043);
            }
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            if (((Boolean)class_18.Field_84.Field_39732.Field_8856.\u0000strictfp()).booleanValue()) {
                if ((this.Field_43039 || this.\u0000= final) && this.\u0000strictfp) {
                    this.Field_43042.Method_8142();
                } else {
                    this.Field_43042.Method_8143();
                }
                int n3 = this.\u0000= final + (int)(this.Field_43046 * (float)(this.\u0000, ` - (6792 & 24623)));
                int n4 = n3 + (10280 & 18185);
                this.Field_43045.Method_41596(n3, n4);
                this.Field_43040.Method_41596(n3, n4);
                this.Field_43047.Method_41598(this);
                this.Field_43038.Method_41598(this);
                this.Field_43040.Method_41598(this);
                this.Field_43045.Method_41598(this);
            } else {
                this.\u0000strictfp(this.\u0000= final + (int)(this.Field_43046 * (float)(this.\u0000, ` - (-24439 & 76))), this.\u0000, for, 964 & 12304, 12354 & 1771, 1029 & 12452, 3103 & 16532);
                this.\u0000strictfp(this.\u0000= final + (int)(this.Field_43046 * (float)(this.\u0000, ` - (18824 & -32676))) + (2661 & 16398), this.\u0000, for, 8652 & 18661, 66 & 202, 2054 & -28523, 799 & 24756);
            }
        }
    }

    public void Method_43050(Class_29094 class_29094) {
    }

    protected int Method_43051(boolean bl) {
        return 780 & -22398;
    }

    private void Method_43052() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_43037(Class_20850 class_20850, int n, int n2, int n3, Class_6295 class_6295, boolean bl) {
        this.Field_43044 = class_20850;
        super(n, n2, n3, bl ? 18806 & 12606 : 1175 & 17054, 6164 & 724, "");
        this.Field_43046 = 1.0f;
        this.Field_43043 = class_6295;
        this.Field_43041 = Class_9802.Method_9806("soundCategory." + class_6295.Method_6334(), new Object[-30623 & 4744]);
        this.\u0000strictfp = this.Field_43041 + ": " + class_20850.Method_20860(class_6295);
        this.Field_43046 = Class_20850.Method_20859(class_20850).Method_39932(class_6295);
        this.Field_43042 = new Class_8135(1.2711865f * 3.9333334f, 0.25479454f * 1.1774193f, 1.0f);
        Color color = new Color(-24476 & 17767, 15204 & 1150, 2151 & 28772, 1028 & -30080);
        this.Field_43047 = new Class_41584(this.\u0000= final, this.\u0000, for, this.\u0000= final + this.\u0000, `, this.Field_43042, (18529 & 259) != 0, color);
        this.Field_43038 = new Class_41584(this.\u0000= final, this.\u0000, for + this.\u0000strictfp, this.\u0000= final + this.\u0000, `, this.Field_43042, (-32735 & 20489) != 0, color);
        Color color2 = new Color(8959 & 4351, 10239 & 2303, 16895 & 1791, 8201 & -10384);
        int n4 = this.\u0000= final + (int)(this.Field_43046 * (float)(this.\u0000, ` - (522 & 8377)));
        this.Field_43040 = new Class_41584(n4, this.\u0000, for, n4 + (-12257 & 3812), this.Field_43042, (-18429 & 1) != 0, color2);
        this.Field_43045 = new Class_41584(n4, this.\u0000, for + this.\u0000strictfp, n4 + (18732 & 12950), this.Field_43042, (16401 & 2337) != 0, color2);
    }

    public void Method_43053(int n, int n2) {
        if (this.Field_43039) {
            if (this.Field_43043 == Class_6295.Field_6300) {
                float f = 1.0f;
            } else {
                Class_20850.Method_20859(this.Field_43044).Method_39932(this.Field_43043);
            }
            this.Field_43044.\u0000strictfp.Method_245().Method_29119(Class_29471.Method_29474(new Class_2080("gui.button.press"), 1.0f));
        }
        this.Field_43039 = -23480 & 17184;
    }
}

