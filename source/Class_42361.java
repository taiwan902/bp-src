/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.util.Vec3;

public class Class_42361 {
    private int Field_42362;
    private int Field_42363;
    private boolean Field_42364;
    private int Field_42365;
    private Class_20407 Field_42366;
    private Class_283 Field_42367;
    private int Field_42368;
    private int Field_42369 = -1 & -1;
    private int Field_42370;

    public Class_42361(Class_283 class_283) {
        this.Field_42367 = class_283;
    }

    private Vec3 Method_42371(Class_4751 class_4751) {
        for (int i = 1409 & 18520; i < (1226 & 12298); ++i) {
            Class_4751 class_47512 = class_4751.Method_4791(this.Field_42367.Field_307.nextInt(16 & 29808) - (16520 & -23524), this.Field_42367.Field_307.nextInt(8967 & 46) - (-26785 & 3), this.Field_42367.Field_307.nextInt(-32688 & 6417) - (5290 & -16120));
            if (!this.Field_42366.Method_20451(class_47512) || !Class_7184.Method_7191(Class_17650.Field_17654, this.Field_42367, class_47512)) continue;
            return new Vec3(class_47512.\u0000= final(), class_47512.\u0000, `(), class_47512.\u0000strictfp());
        }
        return null;
    }

    private void Method_42372() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean Method_42373() {
        var1_1 = this.Field_42367.Field_325;
        var2_2 = var1_1.iterator();
        do lbl-1000: // 4 sources:
        {
            if (!var2_2.hasNext()) {
                return (boolean)(-30654 & 144);
            }
            var3_3 = (Class_626)var2_2.next();
            if (var3_3.Method_752()) ** GOTO lbl-1000
            this.Field_42366 = this.Field_42367.Method_558().Method_41910(new Class_4751(var3_3), 4867 & -32687);
            if (this.Field_42366 == null || this.Field_42366.Method_20430() < (23578 & 394) || this.Field_42366.Method_20445() < (564 & 9238) || this.Field_42366.Method_20446() < (2773 & 28)) ** GOTO lbl-1000
            var4_4 = this.Field_42366.Method_20452();
            var5_5 = this.Field_42366.Method_20435();
            var6_6 = -28416 & 3110;
            for (var7_8 = 5120 & -16275; var7_8 < (-20018 & 27); ++var7_8) {
                var8_9 = this.Field_42367.Field_307.nextFloat() * (1.4285715f * 2.1991148f) * 2.0f;
                this.Field_42362 = var4_4.\u0000= final() + (int)((double)(Class_13337.Method_13350(var8_9) * var5_5) * (0.7442307692307693 * 1.2093023255813953));
                this.Field_42363 = var4_4.\u0000, `();
                this.Field_42365 = var4_4.\u0000strictfp() + (int)((double)(Class_13337.Method_13370(var8_9) * var5_5) * (1.0833333333333333 * 0.8307692307692308));
                var6_6 = 23744 & 34;
                for (Class_20407 var10_11 : this.Field_42367.Method_558().Method_41912()) {
                    if (var10_11 == this.Field_42366 || !var10_11.Method_20451(new Class_4751(this.Field_42362, this.Field_42363, this.Field_42365))) continue;
                    var6_6 = 2049 & 29261;
                    break;
                }
                if (var6_6 == 0) break;
            }
            if (var6_6 == 0) continue;
            return (boolean)(210 & 17965);
        } while ((var7_7 = this.Method_42371(new Class_4751(this.Field_42362, this.Field_42363, this.Field_42365))) == null);
        this.Field_42370 = 1216 & 514;
        this.Field_42368 = -28588 & 3764;
        return (boolean)(2329 & 16387);
    }

    private boolean Method_42374() {
        Class_43566 class_43566;
        Vec3 vec3 = this.Method_42371(new Class_4751(this.Field_42362, this.Field_42363, this.Field_42365));
        if (vec3 == null) {
            return (-28122 & 1281) != 0;
        }
        try {
            class_43566 = new Class_43566(this.Field_42367);
            class_43566.Method_43603(this.Field_42367.Method_364(new Class_4751(class_43566)), null);
            class_43566.Method_43597((-3822 & 1097) != 0);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return (129 & 4672) != 0;
        }
        class_43566.\u0000, `(vec3.\u0000= final, vec3.\u0000strictfp, vec3.\u0000, `, this.Field_42367.Field_307.nextFloat() * (840.0f * 0.42857143f), 0.0f);
        this.Field_42367.Method_350(class_43566);
        Class_4751 class_4751 = this.Field_42366.Method_20452();
        class_43566.\u0000strictfp(class_4751, this.Field_42366.Method_20435());
        return (4623 & 19745) != 0;
    }

    public void Method_42375() {
        if (this.Field_42367.Method_347()) {
            this.Field_42369 = 335 & 14384;
        } else if (this.Field_42369 != (2050 & -28462)) {
            if (this.Field_42369 == 0) {
                float f = this.Field_42367.Method_447(0.0f);
                if ((double)f < 1.0833333333333333 * 0.46153846153846156 || (double)f > 3.357142857142857 * 0.14923404255319148) {
                    return;
                }
                this.Field_42369 = this.Field_42367.Field_307.nextInt(-16294 & 2090) == 0 ? -32759 & 21 : -14262 & 9095;
                this.Field_42364 = 3465 & 48;
                if (this.Field_42369 == (6219 & -31706)) {
                    return;
                }
            }
            if (this.Field_42369 != (-1 & -1)) {
                if (!this.Field_42364) {
                    if (!this.Method_42373()) {
                        return;
                    }
                    this.Field_42364 = 4739 & 93;
                }
                if (this.Field_42370 > 0) {
                    this.Field_42370 -= -24255 & 15;
                } else {
                    this.Field_42370 = 386 & 9251;
                    if (this.Field_42368 > 0) {
                        this.Method_42374();
                        this.Field_42368 -= -32247 & 28753;
                    } else {
                        this.Field_42369 = -29389 & 16962;
                    }
                }
            }
        }
    }
}

