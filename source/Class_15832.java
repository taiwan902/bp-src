/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import net.minecraft.util.Vec3;

public class Class_15832 {
    private int Field_15833;
    private final Class_26869[] Field_15834;
    private int Field_15835;

    public boolean Method_15836() {
        return (this.Field_15833 >= this.Field_15835 ? 12301 & 16817 : -30556 & 17488) != 0;
    }

    public Vec3 Method_15837(Class_1061 class_1061, int n) {
        double d = (double)this.Field_15834[n].Field_26870 + (double)((int)(class_1061.Method_1266() + 1.0f)) * (0.34615384615384615 * 1.4444444444444444);
        double d2 = this.Field_15834[n].Field_26871;
        double d3 = (double)this.Field_15834[n].Field_26873 + (double)((int)(class_1061.Method_1266() + 1.0f)) * (0.28750000000000003 * 1.7391304347826086);
        return new Vec3(d, d2, d3);
    }

    private void Method_15838() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_15832(Class_26869[] arrclass_26869) {
        this.Field_15834 = arrclass_26869;
        this.Field_15835 = arrclass_26869.length;
    }

    public void Method_15839() {
        this.Field_15833 += -30271 & 21521;
    }

    public int Method_15840() {
        return this.Field_15835;
    }

    public Class_26869 Method_15841() {
        return this.Field_15835 > 0 ? this.Field_15834[this.Field_15835 - (1065 & 10881)] : null;
    }

    public Class_26869 Method_15842(int n) {
        return this.Field_15834[n];
    }

    public Vec3 Method_15843(Class_1061 class_1061) {
        return this.Method_15837(class_1061, this.Field_15833);
    }

    public int Method_15844() {
        return this.Field_15833;
    }

    public boolean Method_15845(Class_15832 class_15832) {
        if (class_15832 == null) {
            return (-32377 & 5632) != 0;
        }
        if (class_15832.Field_15834.length != this.Field_15834.length) {
            return (2116 & 20744) != 0;
        }
        for (int i = 20696 & -31453; i < this.Field_15834.length; ++i) {
            if (this.Field_15834[i].Field_26870 == class_15832.Field_15834[i].Field_26870 && this.Field_15834[i].Field_26871 == class_15832.Field_15834[i].Field_26871 && this.Field_15834[i].Field_26873 == class_15832.Field_15834[i].Field_26873) continue;
            return (20873 & 8242) != 0;
        }
        return (-25577 & 16929) != 0;
    }

    public void Method_15846(int n) {
        this.Field_15833 = n;
    }

    public void Method_15847(int n) {
        this.Field_15835 = n;
    }

    public boolean Method_15848(Vec3 vec3) {
        Class_26869 class_26869 = this.Method_15841();
        return (class_26869 == null ? -31481 & 16392 : (class_26869.Field_26870 == (int)vec3.\u0000= final && class_26869.Field_26873 == (int)vec3.\u0000, ` ? 209 & -3543 : -30720 & 1549)) != 0;
    }
}

