/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.util.Color
 */
import internal.org.lwjgl.util.Color;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_45706
extends Class_42376 {
    private float Field_45707 = 1.0f;
    private Class_6340 Field_45708;
    private Class_8135 Field_45709;
    private Class_41584 Field_45710;
    public boolean Field_45711;
    private Class_41584 Field_45712;
    private Class_41584 Field_45713;
    private Class_41584 Field_45714;

    public Class_45706(int n, int n2, int n3, Class_6340 class_6340) {
        super(n, n2, n3, 407 & -28010, 18006 & 2100, "");
        this.Field_45708 = class_6340;
        Class_18 class_18 = Class_18.Field_89;
        this.Field_45707 = class_6340.Method_6565(class_18.Field_84.Method_39920(class_6340));
        this.\u0000strictfp = class_18.Field_84.Method_39885(class_6340);
        this.Field_45709 = new Class_8135(2.4657536f * 2.0277777f, 0.9425287f * 0.3182927f, 1.0f);
        Color color = new Color(5236 & 2405, 2149 & 28772, -14234 & 357, -20214 & 3077);
        this.Field_45710 = new Class_41584(this.\u0000= final, this.\u0000, for, this.\u0000= final + this.\u0000, `, this.Field_45709, (-2033 & 1169) != 0, color);
        this.Field_45713 = new Class_41584(this.\u0000= final, this.\u0000, for + this.\u0000strictfp, this.\u0000= final + this.\u0000, `, this.Field_45709, (1025 & 2101) != 0, color);
        Color color2 = new Color(6399 & -23041, 2559 & 8447, 25087 & -28417, 4360 & 24645);
        int n4 = this.\u0000= final + (int)(this.Field_45707 * (float)(this.\u0000, ` - (24 & 204)));
        this.Field_45714 = new Class_41584(n4, this.\u0000, for, n4 + (19301 & -31732), this.Field_45709, (5633 & 18697) != 0, color2);
        this.Field_45712 = new Class_41584(n4, this.\u0000, for + this.\u0000strictfp, n4 + (4132 & 5), this.Field_45709, (5141 & 2307) != 0, color2);
    }

    protected int Method_45715(boolean bl) {
        return -26591 & 17360;
    }

    public void Method_45716(int n, int n2) {
        this.Field_45711 = 16904 & 9600;
    }

    private void Method_45717() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_45718(Class_18 class_18, int n, int n2) {
        if (!((Boolean)class_18.Field_84.Field_39732.Field_8856.\u0000strictfp()).booleanValue()) {
            super.Method_42401(class_18, n, n2);
            return;
        }
        if (this.\u0000, `) {
            Class_28636 class_28636 = class_18.Field_27;
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            this.\u0000= final = n >= this.\u0000= final && n2 >= this.\u0000, for && n < this.\u0000= final + this.\u0000, ` && n2 < this.\u0000, for + this.\u0000strictfp ? -32767 & 23049 : 3077 & 29640;
            int n3 = this.\u0000= final ? 1 : 0;
            if ((this.Field_45711 || this.\u0000= final) && this.\u0000strictfp) {
                this.Field_45709.Method_8142();
            } else {
                this.Field_45709.Method_8143();
            }
            int n4 = this.\u0000= final + (int)(this.Field_45707 * (float)(this.\u0000, ` - (-31448 & 12)));
            int n5 = n4 + (1037 & 6152);
            int n6 = this.\u0000, for + this.\u0000strictfp;
            this.Field_45712.Method_41595(n4, n6, n5);
            this.Field_45714.Method_41595(n4, this.\u0000, for, n5);
            this.Field_45710.Method_41596(this.\u0000= final, this.\u0000= final + this.\u0000, `);
            this.Field_45713.Method_41596(this.\u0000= final, this.\u0000= final + this.\u0000, `);
            this.Field_45710.Method_41599(this.\u0000, for);
            this.Field_45713.Method_41599(n6);
            this.Field_45710.Method_41598(this);
            this.Field_45713.Method_41598(this);
            this.Field_45714.Method_41598(this);
            this.Field_45712.Method_41598(this);
            this.Method_45720(class_18, n, n2);
            int n7 = 1173025776 & -1829707538;
            if (!this.\u0000strictfp) {
                n7 = 1151447713 & 48275624;
            } else if (this.\u0000= final) {
                n7 = 1107296244 & -2130706526;
            }
            this.\u0000strictfp(class_28636, this.\u0000strictfp, this.\u0000= final + this.\u0000, ` / (16514 & -26581), this.\u0000, for + (this.\u0000strictfp - (2059 & 17448)) / (2851 & -27646), n7);
        }
    }

    public boolean Method_45719(Class_18 class_18, int n, int n2) {
        if (super.Method_42404(class_18, n, n2)) {
            this.Field_45707 = (float)(n - (this.\u0000= final + (4180 & 17444))) / (float)(this.\u0000, ` - (2057 & 29726));
            this.Field_45707 = Class_13337.Method_13360(this.Field_45707, 0.0f, 1.0f);
            class_18.Field_84.Method_39918(this.Field_45708, this.Field_45708.Method_6640(this.Field_45707));
            this.\u0000strictfp = class_18.Field_84.Method_39885(this.Field_45708);
            this.Field_45711 = 8475 & 1;
            return (28937 & -30173) != 0;
        }
        return (2912 & 8337) != 0;
    }

    protected void Method_45720(Class_18 class_18, int n, int n2) {
        if (this.\u0000, `) {
            if (this.Field_45711) {
                this.Field_45707 = (float)(n - (this.\u0000= final + (16516 & 7686))) / (float)(this.\u0000, ` - (16505 & -32626));
                this.Field_45707 = Class_13337.Method_13360(this.Field_45707, 0.0f, 1.0f);
                float f = this.Field_45708.Method_6640(this.Field_45707);
                class_18.Field_84.Method_39918(this.Field_45708, f);
                this.Field_45707 = this.Field_45708.Method_6565(f);
                this.\u0000strictfp = class_18.Field_84.Method_39885(this.Field_45708);
            }
            class_18.Method_253().Method_34707(\u0000%);
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            if (!((Boolean)class_18.Field_84.Field_39732.Field_8856.\u0000strictfp()).booleanValue()) {
                this.\u0000strictfp(this.\u0000= final + (int)(this.Field_45707 * (float)(this.\u0000, ` - (4232 & 75))), this.\u0000, for, -21983 & 4368, 4194 & 338, 2148 & 28679, 2389 & 24724);
                this.\u0000strictfp(this.\u0000= final + (int)(this.Field_45707 * (float)(this.\u0000, ` - (12428 & 378))) + (-32763 & 19532), this.\u0000, for, 16836 & -32516, 17730 & 8298, 10949 & -16364, 24884 & 5271);
            }
        }
    }
}

