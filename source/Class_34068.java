/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import net.minecraft.util.Vec3;

public class Class_34068
extends Class_33077 {
    private Class_15832 Field_34069;
    private double Field_34070;
    private boolean Field_34071;
    private Class_41853 Field_34072;
    private Class_38163 Field_34073;
    private List Field_34074 = Lists.newArrayList();

    private Class_38163 Method_34075(Class_20407 class_20407) {
        Class_38163 class_38163 = null;
        int n = Integer.MAX_VALUE & Integer.MAX_VALUE;
        for (Class_38163 class_381632 : class_20407.Method_20448()) {
            int n2 = class_381632.Method_38171(Class_13337.Method_13371(this.Field_34072.\u0000= package), Class_13337.Method_13371(this.Field_34072.\u0000, for()), Class_13337.Method_13371(this.Field_34072.\u0000= switch));
            if (n2 >= n || this.Method_34081(class_381632)) continue;
            class_38163 = class_381632;
            n = n2;
        }
        return class_38163;
    }

    public boolean Method_34076() {
        this.Method_34077();
        if (this.Field_34071 && this.Field_34072.\u0000strictfp.Method_347()) {
            return (6164 & -24447) != 0;
        }
        Class_20407 class_20407 = this.Field_34072.\u0000strictfp.Method_558().Method_41910(new Class_4751(this.Field_34072), -12928 & 8262);
        if (class_20407 == null) {
            return (1102 & 12304) != 0;
        }
        this.Field_34073 = this.Method_34075(class_20407);
        if (this.Field_34073 == null) {
            return (20998 & 10240) != 0;
        }
        Class_25797 class_25797 = (Class_25797)this.Field_34072.\u0000strictfp();
        boolean bl = class_25797.Method_25815();
        class_25797.Method_25807((-32096 & 28941) != 0);
        this.Field_34069 = class_25797.\u0000strictfp(this.Field_34073.Method_38176());
        class_25797.Method_25807(bl);
        if (this.Field_34069 != null) {
            return (14337 & 1881) != 0;
        }
        Vec3 vec3 = Class_27813.Method_27819(this.Field_34072, 5147 & 202, -11481 & 2071, new Vec3(this.Field_34073.Method_38176().\u0000= final(), this.Field_34073.Method_38176().\u0000, `(), this.Field_34073.Method_38176().\u0000strictfp()));
        if (vec3 == null) {
            return (1041 & -22400) != 0;
        }
        class_25797.Method_25807((320 & 672) != 0);
        this.Field_34069 = this.Field_34072.\u0000strictfp().Method_7639(vec3.\u0000= final, vec3.\u0000strictfp, vec3.\u0000, `);
        class_25797.Method_25807(bl);
        return (this.Field_34069 != null ? 6459 & 1 : 9226 & 18484) != 0;
    }

    private void Method_34077() {
        if (this.Field_34074.size() > (-28657 & 143)) {
            this.Field_34074.remove(8196 & 6338);
        }
    }

    public void Method_34078() {
        this.Field_34072.\u0000strictfp().Method_7632(this.Field_34069, this.Field_34070);
    }

    private void Method_34079() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_34080() {
        if (this.Field_34072.\u0000strictfp().Method_7641()) {
            return (-16364 & 971) != 0;
        }
        float f = this.Field_34072.\u0000= int() + 0.64285713f * 6.2222223f;
        return (this.Field_34072.\u0000strictfp(this.Field_34073.Method_38176()) > (double)(f * f) ? 16673 & 2053 : 8324 & 20307) != 0;
    }

    public Class_34068(Class_41853 class_41853, double d, boolean bl) {
        this.Field_34072 = class_41853;
        this.Field_34070 = d;
        this.Field_34071 = bl;
        this.\u0000strictfp(4613 & 27705);
        if (!(class_41853.\u0000strictfp() instanceof Class_25797)) {
            throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
        }
    }

    private boolean Method_34081(Class_38163 class_38163) {
        for (Class_38163 class_381632 : this.Field_34074) {
            if (!class_38163.Method_38176().equals(class_381632.Method_38176())) continue;
            return (24583 & 601) != 0;
        }
        return (26689 & 160) != 0;
    }

    public void Method_34082() {
        if (this.Field_34072.\u0000strictfp().Method_7641() || this.Field_34072.\u0000strictfp(this.Field_34073.Method_38176()) < 8.967032967032967 * 1.7843137254901962) {
            this.Field_34074.add(this.Field_34073);
        }
    }
}

