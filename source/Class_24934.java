/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_24934
extends Class_1490 {
    private static Class_6340[] Field_24935;
    private Class_1490 Field_24936;
    private Class_39702 Field_24937;
    protected String Field_24938 = "Animation Settings";

    public void Method_24939() {
        int n = -32760 & 18963;
        Class_6340[] arrclass_6340 = Field_24935;
        int n2 = arrclass_6340.length;
        for (int i = 16554 & -26044; i < n2; ++i) {
            Class_6340 class_6340 = arrclass_6340[i];
            int n3 = this.\u0000= final / (8299 & -31738) - (731 & 2459) + n % (8419 & 6406) * (8676 & 1185);
            int n4 = this.\u0000, ` / (-15946 & 8262) + (4117 & 3549) * (n / (-32734 & 10370)) - (-16325 & 9038);
            if (!class_6340.Method_6600()) {
                this.\u0000strictfp.add(new Class_43202(class_6340.Method_6705(), n3, n4, class_6340, this.Field_24937.Method_39885(class_6340)));
            } else {
                this.\u0000strictfp.add(new Class_45706(class_6340.Method_6705(), n3, n4, class_6340));
            }
            ++n;
        }
        this.\u0000strictfp.add(new Class_42376(210 & 21970, this.\u0000= final / (-32438 & 12290) - (-32065 & 10459), this.\u0000, ` / (614 & -10226) + (14844 & -32600) + (37 & 2603), -8089 & 86, 2204 & 597, "All ON"));
        this.\u0000strictfp.add(new Class_42376(28891 & -28973, this.\u0000= final / (-12157 & 8202) - (-32609 & 5531) + (336 & 759), this.\u0000, ` / (-31546 & 6158) + (17071 & 5304) + (8677 & -26071), 4847 & -16058, -32620 & 8220, "All OFF"));
        this.\u0000strictfp.add(new Class_43202(-13619 & 8650, this.\u0000= final / (16898 & -26602) + (27333 & -32459), this.\u0000, ` / (18574 & -31674) + (17580 & 8360) + (7231 & -32543), Class_9802.Method_9806("gui.done", new Object[144 & -9208])));
    }

    private void Method_24940() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_24934(Class_1490 class_1490, Class_39702 class_39702) {
        this.Field_24936 = class_1490;
        this.Field_24937 = class_39702;
    }

    static {
        Class_6340[] arrclass_6340 = new Class_6340[11027 & 19];
        arrclass_6340[-22524 & 16904] = Class_6340.Field_6379;
        arrclass_6340[517 & 403] = Class_6340.Field_6434;
        arrclass_6340[579 & 4146] = Class_6340.Field_6431;
        arrclass_6340[-32445 & 26667] = Class_6340.Field_6374;
        arrclass_6340[8230 & 16988] = Class_6340.Field_6397;
        arrclass_6340[8197 & 53] = Class_6340.Field_6351;
        arrclass_6340[-19770 & 2054] = Class_6340.Field_6420;
        arrclass_6340[1047 & 25167] = Class_6340.Field_6447;
        arrclass_6340[617 & 26762] = Class_6340.Field_6442;
        arrclass_6340[8313 & 6281] = Class_6340.Field_6375;
        arrclass_6340[3690 & 24715] = Class_6340.Field_6446;
        arrclass_6340[-28405 & 1067] = Class_6340.Field_6409;
        arrclass_6340[558 & -27636] = Class_6340.Field_6384;
        arrclass_6340[18061 & 2063] = Class_6340.Field_6386;
        arrclass_6340[-16370 & 14943] = Class_6340.Field_6342;
        arrclass_6340[9231 & -12225] = Class_6340.Field_6404;
        arrclass_6340[28692 & 1393] = Class_6340.Field_6399;
        arrclass_6340[-31207 & 2321] = Class_6340.Field_6451;
        arrclass_6340[-16109 & 3314] = Class_6340.Field_6403;
        Field_24935 = arrclass_6340;
    }

    public void Method_24941(int n, int n2, float f) {
        this.\u0000, 2();
        this.\u0000strictfp(this.\u0000strictfp, this.Field_24938, this.\u0000= final / (8198 & 19082), 8916 & 23580, 1694498815 & 301989887);
        super.Method_1545(n, n2, f);
    }

    protected void Method_24942(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            if (class_42376.Field_42392 < (20686 & 2264) && class_42376 instanceof Class_43202) {
                this.Field_24937.Method_39923(((Class_43202)class_42376).Method_43205(), -23243 & 137);
                class_42376.Field_42381 = this.Field_24937.Method_39885(Class_6340.Method_6715(class_42376.Field_42392));
            }
            if (class_42376.Field_42392 == (27084 & 4296)) {
                this.\u0000strictfp.Field_84.Method_39903();
                this.\u0000strictfp.Method_218(this.Field_24936);
            }
            if (class_42376.Field_42392 == (210 & 8402)) {
                this.\u0000strictfp.Field_84.Method_39931((1537 & -3737) != 0);
            }
            if (class_42376.Field_42392 == (467 & -32549)) {
                this.\u0000strictfp.Field_84.Method_39931((1120 & 9091) != 0);
            }
            if (class_42376.Field_42392 != Class_6340.Field_6390.ordinal()) {
                Class_31566 class_31566 = new Class_31566(this.\u0000strictfp);
                int n = class_31566.Method_31574();
                int n2 = class_31566.Method_31575();
                this.\u0000strictfp(this.\u0000strictfp, n, n2);
            }
        }
    }
}

