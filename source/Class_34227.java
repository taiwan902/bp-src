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

public class Class_34227
implements Class_1486 {
    private float Field_34228;
    private double Field_34229;
    private double Field_34230;
    private List Field_34231;
    private float Field_34232;
    private float Field_34233;
    private float Field_34234;
    private double Field_34235;

    public void Method_34236(Class_29900 class_29900) {
        class_29900.Method_29939((float)this.Field_34235);
        class_29900.Method_29939((float)this.Field_34230);
        class_29900.Method_29939((float)this.Field_34229);
        class_29900.Method_29939(this.Field_34233);
        class_29900.Method_30010(this.Field_34231.size());
        int n = (int)this.Field_34235;
        int n2 = (int)this.Field_34230;
        int n3 = (int)this.Field_34229;
        for (Class_4751 class_4751 : this.Field_34231) {
            int n4 = class_4751.\u0000= final() - n;
            int n5 = class_4751.\u0000, `() - n2;
            int n6 = class_4751.\u0000strictfp() - n3;
            class_29900.Method_29949(n4);
            class_29900.Method_29949(n5);
            class_29900.Method_29949(n6);
        }
        class_29900.Method_29939(this.Field_34234);
        class_29900.Method_29939(this.Field_34232);
        class_29900.Method_29939(this.Field_34228);
    }

    public void Method_34237(Class_14856 class_14856) {
        class_14856.Method_14871(this);
    }

    public void Method_34238(Class_29900 class_29900) {
        this.Field_34235 = class_29900.Method_29966();
        this.Field_34230 = class_29900.Method_29966();
        this.Field_34229 = class_29900.Method_29966();
        this.Field_34233 = class_29900.Method_29966();
        int n = class_29900.Method_29914();
        this.Field_34231 = Lists.newArrayListWithCapacity((int)n);
        int n2 = (int)this.Field_34235;
        int n3 = (int)this.Field_34230;
        int n4 = (int)this.Field_34229;
        for (int i = -31872 & 9248; i < n; ++i) {
            int n5 = class_29900.Method_29944() + n2;
            int n6 = class_29900.Method_29944() + n3;
            int n7 = class_29900.Method_29944() + n4;
            this.Field_34231.add(new Class_4751(n5, n6, n7));
        }
        this.Field_34234 = class_29900.Method_29966();
        this.Field_34232 = class_29900.Method_29966();
        this.Field_34228 = class_29900.Method_29966();
    }

    public double Method_34239() {
        return this.Field_34235;
    }

    public double Method_34240() {
        return this.Field_34229;
    }

    public float Method_34241() {
        return this.Field_34228;
    }

    public float Method_34242() {
        return this.Field_34232;
    }

    public void Method_34243(Class_10954 class_10954) {
        this.Method_34237((Class_14856)class_10954);
    }

    public Class_34227() {
    }

    private void Method_34244() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public List Method_34245() {
        return this.Field_34231;
    }

    public float Method_34246() {
        return this.Field_34234;
    }

    public float Method_34247() {
        return this.Field_34233;
    }

    public double Method_34248() {
        return this.Field_34230;
    }

    public Class_34227(double d, double d2, double d3, float f, List list, Vec3 vec3) {
        this.Field_34235 = d;
        this.Field_34230 = d2;
        this.Field_34229 = d3;
        this.Field_34233 = f;
        this.Field_34231 = Lists.newArrayList((Iterable)list);
        if (vec3 != null) {
            this.Field_34234 = (float)vec3.\u0000= final;
            this.Field_34232 = (float)vec3.\u0000strictfp;
            this.Field_34228 = (float)vec3.\u0000, `;
        }
    }
}

