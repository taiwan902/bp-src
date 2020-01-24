/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Set;

public class Class_28889
extends Class_1490 {
    private final Class_1490 Field_28890;
    private String Field_28891;

    public Class_28889(Class_1490 class_1490) {
        this.Field_28890 = class_1490;
    }

    protected void Method_28892(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            if (class_42376.Field_42392 == (-18215 & 234)) {
                this.\u0000strictfp.Field_84.Method_39903();
                this.\u0000strictfp.Method_218(this.Field_28890);
            } else if (class_42376.Field_42392 == (11977 & -32309)) {
                this.\u0000strictfp.Field_84.Method_39903();
                this.\u0000strictfp.Method_218(new Class_43063(this));
            } else if (class_42376 instanceof Class_44403) {
                Class_21361 class_21361 = Class_44403.Method_44406((Class_44403)class_42376);
                this.\u0000strictfp.Field_84.Method_39889(class_21361);
                class_42376.Field_42381 = this.Method_28893(class_21361);
            }
        }
    }

    public String Method_28893(Class_21361 class_21361) {
        String string = this.\u0000strictfp.Field_84.Method_39898().contains((Object)class_21361) ? Class_9802.Method_9806("options.on", new Object[64 & -31228]) : Class_9802.Method_9806("options.off", new Object[5128 & 2688]);
        return class_21361.Method_21384().Method_1783() + ": " + string;
    }

    public void Method_28894() {
        int n = 4704 & 8216;
        this.Field_28891 = Class_9802.Method_9806("options.skinCustomisation.title", new Object[-8190 & 4137]);
        Class_21361[] arrclass_21361 = Class_21361.Method_21388();
        int n2 = arrclass_21361.length;
        for (int i = 17 & -19198; i < n2; ++i) {
            Class_21361 class_21361 = arrclass_21361[i];
            this.\u0000strictfp.add(new Class_44403(this, class_21361.Method_21375(), this.\u0000= final / (19650 & -28669) - (-23329 & 4507) + n % (8450 & 4614) * (-8016 & 1252), this.\u0000, ` / (70 & 8206) + (3130 & 4441) * (n >> (20993 & 11553)), -14369 & 8342, -32586 & 2068, class_21361, null));
            ++n;
        }
        if (n % (18571 & -20478) == (18719 & -32159)) {
            ++n;
        }
        this.\u0000strictfp.add(new Class_42376(6621 & 9417, this.\u0000= final / (519 & -7070) - (16613 & -23964), this.\u0000, ` / (19159 & 1286) + (10266 & 25) * (n >> (-11775 & 45)), "OptiFine Cape..."));
        this.\u0000strictfp.add(new Class_42376(10952 & -15111, this.\u0000= final / (24718 & 514) - (17637 & 10870), this.\u0000, ` / (-30617 & 12950) + (315 & -13224) * ((n += 2) >> (12529 & -32767)), Class_9802.Method_9806("gui.done", new Object[18446 & 833])));
    }

    private void Method_28895() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_28896(int n, int n2, float f) {
        this.\u0000, 2();
        this.\u0000strictfp(this.\u0000strictfp, this.Field_28891, this.\u0000= final / (-3958 & 770), 13649 & -32590, 553648127 & -1979711489);
        super.Method_1545(n, n2, f);
    }
}

