/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.input.Keyboard
 */
import internal.org.lwjgl.input.Keyboard;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_21257
extends Class_1490 {
    private Class_42376 Field_21258;
    private int Field_21259;
    private int Field_21260;
    private Class_33614 Field_21261;

    private void Method_21262() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_21263(Class_42376 class_42376) {
        if (class_42376.Field_42388 && class_42376.Field_42392 == 0) {
            this.Field_21261.\u0000, for();
            this.\u0000strictfp.Method_218(null);
        }
    }

    public void Method_21264() {
        if (Class_18.Field_89.Field_127.Field_2178 > 0) {
            this.Field_21259 += 5 & 2611;
        }
    }

    public Class_21257(Class_33614 class_33614) {
        this.Field_21261 = class_33614;
    }

    public void Method_21265(int n, int n2, float f) {
        this.\u0000, 2();
        this.\u0000strictfp(this.\u0000strictfp, Class_9802.Method_9806("sign.edit", new Object[16400 & 3074]), this.\u0000= final / (6211 & 782), 7208 & -31942, 687865855 & -1795162113);
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        Class_16867.Method_16961();
        Class_16867.Method_16943(this.\u0000= final / (18698 & 5138), 0.0f, 202.5f * 0.24691358f);
        float f2 = 207.5893f * 0.4516129f;
        Class_16867.Method_16973(-f2, -f2, -f2);
        Class_16867.Method_16940(1.9f * 94.73685f, 0.0f, 1.0f, 0.0f);
        Class_3238 class_3238 = this.Field_21261.\u0000strictfp();
        if (class_3238 == Class_9265.Field_9367) {
            float f3 = (float)(this.Field_21261.\u0000, `() * (5100 & 24936)) / (22.153847f * 0.7222222f);
            Class_16867.Method_16940(f3, 0.0f, 1.0f, 0.0f);
            Class_16867.Method_16943(0.0f, 0.09090909f * -11.6875f, 0.0f);
        } else {
            int n3 = this.Field_21261.\u0000, `();
            float f4 = 0.0f;
            if (n3 == (-27578 & 946)) {
                f4 = 226.66667f * 0.7941176f;
            }
            if (n3 == (17220 & 8205)) {
                f4 = 62.068962f * 1.45f;
            }
            if (n3 == (-32379 & 6173)) {
                f4 = 0.59090906f * -152.3077f;
            }
            Class_16867.Method_16940(f4, 0.0f, 1.0f, 0.0f);
            Class_16867.Method_16943(0.0f, -0.013621795f * 78.0f, 0.0f);
        }
        if (this.Field_21259 / (20999 & 2486) % (810 & -32573) == 0) {
            this.Field_21261.Field_33618 = this.Field_21260;
        }
        Class_26692.Field_26697.Method_26708(this.Field_21261, 0.03773584905660377 * -13.25, -0.42857142857142855 * 1.75, -0.3333333333333333 * 1.5, 0.0f);
        this.Field_21261.Field_33618 = -1 & -1;
        Class_16867.Method_16945();
        super.Method_1545(n, n2, f);
    }

    public void Method_21266() {
        this.\u0000strictfp.clear();
        Keyboard.enableRepeatEvents((2085 & 4673) != 0);
        this.Field_21258 = new Class_42376(10240 & -32640, this.\u0000= final / (8275 & 16642) - (9061 & 3172), this.\u0000, ` / (6189 & 24644) + (9464 & 120), Class_9802.Method_9806("gui.done", new Object[80 & 12169]));
        this.\u0000strictfp.add(this.Field_21258);
        this.Field_21261.Method_33633((-15296 & 394) != 0);
    }

    protected void Method_21267(char c, int n) {
        if (n == (1256 & -5944)) {
            this.Field_21260 = this.Field_21260 - (21521 & -30589) & (11571 & 715);
        }
        if (n == (9680 & 4318) || n == (25724 & 284) || n == (15004 & 16862)) {
            this.Field_21260 = this.Field_21260 + (28777 & 2177) & (-16057 & 11);
        }
        String string = this.Field_21261.Field_33615[this.Field_21260].Method_1788();
        if (n == (10287 & 1630) && string.length() > 0) {
            string = string.substring(21697 & 2582, string.length() - (-30719 & 24583));
        }
        if (Class_12053.Method_12057(c) && this.\u0000strictfp.Method_28715(string + c) <= (12382 & 3066)) {
            string = string + c;
        }
        this.Field_21261.Field_33615[this.Field_21260] = new Class_2840(string);
        this.Field_21261.Method_33631();
        if (n == (-24447 & 17187)) {
            this.Method_21263(this.Field_21258);
        }
    }

    public void Method_21268() {
        Keyboard.enableRepeatEvents((-7641 & 2304) != 0);
        Class_20165 class_20165 = this.\u0000strictfp.Method_271();
        if (class_20165 != null) {
            class_20165.Method_20245(new Class_33586(this.Field_21261.\u0000strictfp(), this.Field_21261.Field_33615));
        }
        this.Field_21261.Method_33633((25683 & 6177) != 0);
    }
}

