/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;

public abstract class Class_1899
extends Class_1906 {
    private boolean Field_1900;

    private void Method_1901() {
        int n = this.\u0000
         - (2941 & 8446);
        int n2 = this.\u0000%;
        int n3 = 4774 & -14169;
        Collection collection = this.\u0000strictfp.Field_48.\u0000strictfp();
        if (!collection.isEmpty()) {
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            Class_16867.Method_16931();
            int n4 = 4129 & 1641;
            if (collection.size() > (4159 & -32763)) {
                n4 = (-29308 & 12484) / (collection.size() - (16467 & -31227));
            }
            for (Class_25240 class_25240 : this.\u0000strictfp.Field_48.\u0000strictfp()) {
                Class_8338 class_8338 = Class_8338.Field_8341[class_25240.Method_25253()];
                Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
                this.\u0000strictfp.Method_253().Method_34707(\u0000%);
                this.\u0000strictfp(n, n2, 2142 & 513, 16807 & 1270, 668 & 3244, 16422 & -24031);
                if (class_8338.Method_8446()) {
                    int n5 = class_8338.Method_8425();
                    this.\u0000strictfp(n + (6414 & -31722), n2 + (455 & 1591), (18956 & 4096) + n5 % (4138 & -30691) * (1170 & 10267), (4310 & -6937) + n5 / (2506 & 13) * (-32493 & 18), -32366 & 9270, 12562 & -31526);
                }
                String string = Class_9802.Method_9806(class_8338.Method_8411(), new Object[1803 & -8176]);
                if (class_25240.Method_25257() == (-32511 & 8291)) {
                    string = string + " " + Class_9802.Method_9806("enchantment.level.2", new Object[-27515 & 2112]);
                } else if (class_25240.Method_25257() == (3 & -32558)) {
                    string = string + " " + Class_9802.Method_9806("enchantment.level.3", new Object[192 & 18450]);
                } else if (class_25240.Method_25257() == (4435 & -8017)) {
                    string = string + " " + Class_9802.Method_9806("enchantment.level.4", new Object[9224 & 4834]);
                }
                this.\u0000strictfp.Method_28729(string, n + (3406 & 554) + (-15950 & 1050), n2 + (7686 & 8583), 620756991 & 67108863);
                String string2 = Class_8338.Method_8416(class_25240);
                this.\u0000strictfp.Method_28729(string2, n + (-14134 & 13355) + (-30505 & 24602), n2 + (654 & -27386) + (11 & 15502), 192937983 & 16744319);
                n2 += n4;
            }
        }
    }

    public void Method_1902() {
        super.Method_1946();
        this.Method_1903();
    }

    protected void Method_1903() {
        if (!this.\u0000strictfp.Field_48.\u0000strictfp().isEmpty()) {
            this.\u0000
             = (Integer)this.\u0000strictfp.Field_84.Field_39732.Field_8839.\u0000strictfp() == (16593 & 1313) ? (this.\u0000= final - this.\u0000, for) / (-24009 & 3138) : ((Integer)this.\u0000strictfp.Field_84.Field_39732.Field_8839.\u0000strictfp() == (8338 & 4931) ? (19632 & 4585) + (this.\u0000= final - this.\u0000, for - (233 & -31800)) / (-31486 & 2179) : (12604 & 2237) + (this.\u0000= final - this.\u0000, for) / (-15742 & 10258));
            this.Field_1900 = 16513 & -23501;
        } else {
            this.\u0000
             = (Integer)this.\u0000strictfp.Field_84.Field_39732.Field_8839.\u0000strictfp() == (2063 & 16771) ? (-10180 & 191) + (this.\u0000= final - this.\u0000, for) / (6 & -22382) : (this.\u0000= final - this.\u0000, for) / (3 & -28526);
            this.Field_1900 = 1024 & 21089;
        }
    }

    private void Method_1904() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1899(Class_8295 class_8295) {
        super(class_8295);
    }

    public void Method_1905(int n, int n2, float f) {
        super.Method_1948(n, n2, f);
        if (this.Field_1900) {
            this.Method_1901();
        }
    }
}

