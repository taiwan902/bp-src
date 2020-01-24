/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_20850
extends Class_1490 {
    private final Class_39702 Field_20851;
    private final Class_1490 Field_20852;
    private String Field_20853;
    protected String Field_20854 = "Options";

    public Class_20850(Class_1490 class_1490, Class_39702 class_39702) {
        this.Field_20852 = class_1490;
        this.Field_20851 = class_39702;
    }

    private void Method_20855() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_20856() {
        int n = 14 & 18560;
        this.Field_20854 = Class_9802.Method_9806("options.sounds.title", new Object[16385 & 9382]);
        this.Field_20853 = Class_9802.Method_9806("options.off", new Object[-26225 & 512]);
        this.\u0000strictfp.add(new Class_43037(this, Class_6295.Field_6300.Method_6315(), this.\u0000= final / (8390 & 18434) - (-31525 & 2203) + n % (8330 & 2854) * (14508 & -15135), this.\u0000, ` / (2078 & 14150) - (25740 & -30659) + (3610 & 24600) * (n >> (-32255 & 2305)), Class_6295.Field_6300, (6675 & -32639) != 0));
        n += 290 & -23398;
        Class_6295[] arrclass_6295 = Class_6295.Method_6332();
        int n2 = arrclass_6295.length;
        for (int i = 16916 & 1152; i < n2; ++i) {
            Class_6295 class_6295 = arrclass_6295[i];
            if (class_6295 == Class_6295.Field_6300) continue;
            this.\u0000strictfp.add(new Class_43037(this, class_6295.Method_6315(), this.\u0000= final / (1442 & -30710) - (1211 & 4507) + n % (-23546 & 6890) * (-31562 & 19104), this.\u0000, ` / (134 & 551) - (16765 & 142) + (17499 & 8856) * (n >> (8713 & -30703)), class_6295, (3362 & 24592) != 0));
            ++n;
        }
        this.\u0000strictfp.add(new Class_42376(25289 & 458, this.\u0000= final / (-24494 & 6147) - (25830 & -27803), this.\u0000, ` / (1030 & 18447) + (424 & -32536), Class_9802.Method_9806("gui.done", new Object[-24436 & 5136])));
    }

    protected void Method_20857(Class_42376 class_42376) {
        if (class_42376.Field_42388 && class_42376.Field_42392 == (2792 & 25036)) {
            this.\u0000strictfp.Field_84.Method_39903();
            this.\u0000strictfp.Method_218(this.Field_20852);
        }
    }

    public void Method_20858(int n, int n2, float f) {
        this.\u0000, 2();
        this.\u0000strictfp(this.\u0000strictfp, this.Field_20854, this.\u0000= final / (1154 & 2566), 1076 & 80, 1090519039 & -2046820353);
        super.Method_1545(n, n2, f);
    }

    static Class_39702 Method_20859(Class_20850 class_20850) {
        return class_20850.Field_20851;
    }

    protected String Method_20860(Class_6295 class_6295) {
        float f = this.Field_20851.Method_39932(class_6295);
        return f == 0.0f ? this.Field_20853 : (int)(f * (1.75f * 57.142857f)) + "%";
    }
}

