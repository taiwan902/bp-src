/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.util.Vec3;

public class Class_41682
extends Class_33077 {
    private int Field_41683;
    private Class_859 Field_41684;
    private double Field_41685;
    private Class_43334 Field_41686;

    public boolean Method_41687() {
        return (this.Field_41683 > 0 ? 1301 & 24705 : -23552 & 192) != 0;
    }

    public void Method_41688() {
        this.Field_41686.Method_43372((216 & -26620) != 0);
        this.Field_41684 = null;
    }

    public Class_41682(Class_43334 class_43334, double d) {
        this.Field_41686 = class_43334;
        this.Field_41685 = d;
        this.\u0000strictfp(-16091 & 3097);
    }

    private void Method_41689() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_41690() {
        if (this.Field_41684 != null) {
            this.Field_41686.Method_43372((16449 & -32511) != 0);
        }
        this.Field_41683 = 13288 & 1018;
    }

    public void Method_41691() {
        this.Field_41683 -= -32575 & 31249;
        if (this.Field_41684 != null) {
            if (this.Field_41686.\u0000strictfp((Class_1061)this.Field_41684) > 7.5 * 0.5333333333333333) {
                this.Field_41686.\u0000strictfp().Method_7631(this.Field_41684, this.Field_41685);
            }
        } else if (this.Field_41686.\u0000strictfp().Method_7641()) {
            Vec3 vec3 = Class_27813.Method_27815(this.Field_41686, 17425 & 11064, -23545 & 4147);
            if (vec3 == null) {
                return;
            }
            this.Field_41686.\u0000strictfp().Method_7638(vec3.\u0000= final, vec3.\u0000strictfp, vec3.\u0000, `, this.Field_41685);
        }
    }

    public boolean Method_41692() {
        if (this.Field_41686.\u0000strictfp() >= 0) {
            return (20808 & -23007) != 0;
        }
        if (this.Field_41686.\u0000strictfp().nextInt(12688 & -32362) != 0) {
            return (16512 & -27802) != 0;
        }
        List list = this.Field_41686.\u0000strictfp.Method_488(Class_43334.class, this.Field_41686.\u0000, `().Method_11017(1.2352941176470589 * 4.857142857142857, 3.4615384615384612 * 0.8666666666666667, 1.119047619047619 * 5.361702127659575));
        double d = 3.2 * 5.617791046444736E307;
        Object object = list.iterator();
        while (object.hasNext()) {
            double d2;
            Class_43334 class_43334 = (Class_43334)object.next();
            if (class_43334 == this.Field_41686 || class_43334.Method_43389() || class_43334.\u0000strictfp() >= 0 || !((d2 = class_43334.\u0000strictfp((Class_1061)this.Field_41686)) <= d)) continue;
            d = d2;
            this.Field_41684 = class_43334;
        }
        if (this.Field_41684 == null && (object = Class_27813.Method_27815(this.Field_41686, 144 & 16978, 28675 & -29833)) == null) {
            return (-16384 & 10312) != 0;
        }
        return (12305 & 16393) != 0;
    }
}

