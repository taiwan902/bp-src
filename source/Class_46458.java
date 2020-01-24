/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;
import net.minecraft.util.Vec3;

public class Class_46458
extends Class_33077 {
    private double Field_46459;
    private Class_41853 Field_46460;
    private double Field_46461;
    private double Field_46462;
    private double Field_46463;
    private Class_283 Field_46464;

    public boolean Method_46465() {
        if (!this.Field_46464.Method_347()) {
            return (8714 & 22688) != 0;
        }
        if (!this.Field_46460.\u0000, 2()) {
            return (17173 & -31744) != 0;
        }
        if (!this.Field_46464.Method_398(new Class_4751(this.Field_46460.\u0000= package, this.Field_46460.\u0000, `().Field_11000, this.Field_46460.\u0000= switch))) {
            return (770 & 13328) != 0;
        }
        Vec3 vec3 = this.Method_46469();
        if (vec3 == null) {
            return (16641 & 2572) != 0;
        }
        this.Field_46459 = vec3.\u0000= final;
        this.Field_46463 = vec3.\u0000strictfp;
        this.Field_46462 = vec3.\u0000, `;
        return (-3943 & 2081) != 0;
    }

    public boolean Method_46466() {
        return (!this.Field_46460.\u0000strictfp().Method_7641() ? 7377 & -24575 : -24512 & 284) != 0;
    }

    public void Method_46467() {
        this.Field_46460.\u0000strictfp().Method_7638(this.Field_46459, this.Field_46463, this.Field_46462, this.Field_46461);
    }

    public Class_46458(Class_41853 class_41853, double d) {
        this.Field_46460 = class_41853;
        this.Field_46461 = d;
        this.Field_46464 = class_41853.\u0000strictfp;
        this.\u0000strictfp(25893 & 4177);
    }

    private void Method_46468() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Vec3 Method_46469() {
        Random random = this.Field_46460.\u0000strictfp();
        Class_4751 class_4751 = new Class_4751(this.Field_46460.\u0000= package, this.Field_46460.\u0000, `().Field_11000, this.Field_46460.\u0000= switch);
        for (int i = 7590 & 513; i < (-32374 & 14910); ++i) {
            Class_4751 class_47512 = class_4751.Method_4791(random.nextInt(24981 & 1108) - (-32502 & 10383), random.nextInt(-20474 & 16903) - (8263 & -12773), random.nextInt(-14124 & 29) - (-3574 & 2542));
            if (this.Field_46464.Method_398(class_47512) || !(this.Field_46460.Method_41862(class_47512) < 0.0f)) continue;
            return new Vec3(class_47512.\u0000= final(), class_47512.\u0000, `(), class_47512.\u0000strictfp());
        }
        return null;
    }
}

