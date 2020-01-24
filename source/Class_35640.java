/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import net.minecraft.util.Vec3;

public class Class_35640
extends Class_33077 {
    private double Field_35641;
    private Class_41853 Field_35642;
    private double Field_35643;
    private double Field_35644;
    private double Field_35645;

    public boolean Method_35646() {
        if (this.Field_35642.Method_41873()) {
            return (-6902 & 4224) != 0;
        }
        Class_4751 class_4751 = this.Field_35642.Method_41869();
        Vec3 vec3 = Class_27813.Method_27819(this.Field_35642, -11235 & 8720, 24631 & 7503, new Vec3(class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp()));
        if (vec3 == null) {
            return (-16288 & 4) != 0;
        }
        this.Field_35643 = vec3.\u0000= final;
        this.Field_35645 = vec3.\u0000strictfp;
        this.Field_35644 = vec3.\u0000, `;
        return (1029 & 26851) != 0;
    }

    public boolean Method_35647() {
        return (!this.Field_35642.\u0000strictfp().Method_7641() ? 17537 & 517 : 17104 & 6144) != 0;
    }

    public Class_35640(Class_41853 class_41853, double d) {
        this.Field_35642 = class_41853;
        this.Field_35641 = d;
        this.\u0000strictfp(-16359 & 14529);
    }

    private void Method_35648() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_35649() {
        this.Field_35642.\u0000strictfp().Method_7638(this.Field_35643, this.Field_35645, this.Field_35644, this.Field_35641);
    }
}

