/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import net.minecraft.util.Vec3;

public class Class_34269
extends Class_33077 {
    private Predicate Field_34270;
    protected Class_41853 Field_34271;
    private Class Field_34272;
    private Class_7611 Field_34273;
    private double Field_34274;
    protected Class_1061 Field_34275;
    private final Predicate Field_34276 = new Class_33484(this);
    private Class_15832 Field_34277;
    private double Field_34278;
    private float Field_34279;

    public void Method_34280() {
        if (this.Field_34271.\u0000strictfp(this.Field_34275) < 3.1785714285714284 * 15.415730337078653) {
            this.Field_34271.\u0000strictfp().Method_7624(this.Field_34274);
        } else {
            this.Field_34271.\u0000strictfp().Method_7624(this.Field_34278);
        }
    }

    public void Method_34281() {
        this.Field_34275 = null;
    }

    public void Method_34282() {
        this.Field_34273.Method_7632(this.Field_34277, this.Field_34278);
    }

    private void Method_34283() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_34284() {
        Predicate[] arrpredicate = new Predicate[8231 & 1043];
        arrpredicate[4608 & 8449] = Class_28857.Field_28860;
        arrpredicate[5059 & 16429] = this.Field_34276;
        arrpredicate[-15997 & 6194] = this.Field_34270;
        List list = this.Field_34271.\u0000strictfp.Method_395(this.Field_34272, this.Field_34271.\u0000, `().Method_11017(this.Field_34279, 3.3947368421052633 * 0.8837209302325582, this.Field_34279), Predicates.and((Predicate[])arrpredicate));
        if (list.isEmpty()) {
            return (354 & -24039) != 0;
        }
        this.Field_34275 = (Class_1061)list.get(16581 & 12810);
        Vec3 vec3 = Class_27813.Method_27816(this.Field_34271, 9296 & 177, -27505 & 10503, new Vec3(this.Field_34275.Field_1130, this.Field_34275.Method_1324(), this.Field_34275.Field_1106));
        if (vec3 == null) {
            return (4370 & -31159) != 0;
        }
        if (this.Field_34275.Method_1337(vec3.\u0000= final, vec3.\u0000strictfp, vec3.\u0000, `) < this.Field_34275.Method_1356(this.Field_34271)) {
            return (-32760 & 4704) != 0;
        }
        this.Field_34277 = this.Field_34273.Method_7639(vec3.\u0000= final, vec3.\u0000strictfp, vec3.\u0000, `);
        return (this.Field_34277 == null ? 8196 & 18051 : (int)(this.Field_34277.Method_15848(vec3) ? 1 : 0)) != 0;
    }

    public Class_34269(Class_41853 class_41853, Class class_, Predicate predicate, float f, double d, double d2) {
        this.Field_34271 = class_41853;
        this.Field_34272 = class_;
        this.Field_34270 = predicate;
        this.Field_34279 = f;
        this.Field_34278 = d;
        this.Field_34274 = d2;
        this.Field_34273 = class_41853.\u0000strictfp();
        this.\u0000strictfp(8197 & 5225);
    }

    public boolean Method_34285() {
        return (!this.Field_34273.Method_7641() ? 8449 & -28543 : 16417 & 4104) != 0;
    }

    public Class_34269(Class_41853 class_41853, Class class_, float f, double d, double d2) {
        this(class_41853, class_, Predicates.alwaysTrue(), f, d, d2);
    }
}

