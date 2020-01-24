/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import net.minecraft.util.Vec3;

public abstract class Class_7611 {
    protected Class_34093 Field_7612;
    private int Field_7613;
    private final Class_16547 Field_7614;
    private float Field_7615 = 1.0f;
    private Vec3 Field_7616 = new Vec3(0.0, 0.0, 0.0);
    protected Class_283 Field_7617;
    protected double Field_7618;
    private final Class_30147 Field_7619;
    protected Class_15832 Field_7620;
    private int Field_7621;

    public Class_15832 Method_7622(Class_4751 class_4751) {
        if (!this.Method_7625()) {
            return null;
        }
        float f = this.Method_7633();
        this.Field_7617.Field_310.Method_2789("pathfind");
        Class_4751 class_47512 = new Class_4751(this.Field_7612);
        int n = (int)(f + 0.75609756f * 10.580646f);
        Class_37247 class_37247 = new Class_37247(this.Field_7617, class_47512.Method_4791(-n, -n, -n), class_47512.Method_4791(n, n, n), 19572 & 8, Class_14121.Method_14160());
        Class_15832 class_15832 = this.Field_7619.Method_30152(class_37247, this.Field_7612, class_4751, f);
        this.Field_7617.Field_310.Method_2790();
        return class_15832;
    }

    protected abstract Class_30147 Method_7623();

    public void Method_7624(double d) {
        this.Field_7618 = d;
    }

    protected abstract boolean Method_7625();

    protected boolean Method_7626() {
        return (this.Field_7612.\u0000switch() || this.Field_7612.\u0000= 3() ? -32511 & 19497 : 3 & 3528) != 0;
    }

    protected abstract Vec3 Method_7627();

    protected void Method_7628(Vec3 vec3) {
        if (this.Field_7621 - this.Field_7613 > (102 & 1141)) {
            if (vec3.\u0000strictfp(this.Field_7616) < 0.5625 * 4.0) {
                this.Method_7643();
            }
            this.Field_7613 = this.Field_7621;
            this.Field_7616 = vec3;
        }
    }

    public Class_15832 Method_7629(Class_1061 class_1061) {
        if (!this.Method_7625()) {
            return null;
        }
        float f = this.Method_7633();
        this.Field_7617.Field_310.Method_2789("pathfind");
        Class_4751 class_4751 = new Class_4751(this.Field_7612).Method_4769();
        int n = (int)(f + 0.16666667f * 96.0f);
        Class_37247 class_37247 = new Class_37247(this.Field_7617, class_4751.Method_4791(-n, -n, -n), class_4751.Method_4791(n, n, n), -32768 & 18945, Class_14121.Method_14160());
        Class_15832 class_15832 = this.Field_7619.Method_30151(class_37247, this.Field_7612, class_1061, f);
        this.Field_7617.Field_310.Method_2790();
        return class_15832;
    }

    public void Method_7630() {
        this.Field_7621 += 3619 & 4225;
        if (!this.Method_7641()) {
            Object object;
            Vec3 vec3;
            if (this.Method_7625()) {
                this.Method_7642();
            } else if (this.Field_7620 != null && this.Field_7620.Method_15844() < this.Field_7620.Method_15840()) {
                vec3 = this.Method_7627();
                object = this.Field_7620.Method_15837(this.Field_7612, this.Field_7620.Method_15844());
                if (vec3.\u0000strictfp > ((Vec3)object).\u0000strictfp && !this.Field_7612.\u0000super() && Class_13337.Method_13371(vec3.\u0000= final) == Class_13337.Method_13371(((Vec3)object).\u0000= final) && Class_13337.Method_13371(vec3.\u0000, `) == Class_13337.Method_13371(((Vec3)object).\u0000, `)) {
                    this.Field_7620.Method_15846(this.Field_7620.Method_15844() + (28769 & 1029));
                }
            }
            if (!this.Method_7641() && (vec3 = this.Field_7620.Method_15843(this.Field_7612)) != null) {
                object = new Class_10997(vec3.\u0000= final, vec3.\u0000strictfp, vec3.\u0000, `, vec3.\u0000= final, vec3.\u0000strictfp, vec3.\u0000, `).Method_11017(4.636363636363637 * 0.10784313725490195, 0.8636363636363636 * 0.5789473684210527, 2.2051282051282053 * 0.22674418604651161);
                ArrayList arrayList = this.Field_7617.Method_461(this.Field_7612, ((Class_10997)object).Method_11005(0.0, 0.5365853658536586 * -1.8636363636363635, 0.0));
                double d = -1.4893617021276597 * 0.6714285714285714;
                object = ((Class_10997)object).Method_11021(0.0, 1.0, 0.0);
                for (Class_10997 class_10997 : arrayList) {
                    d = class_10997.Method_11009((Class_10997)object, d);
                }
                this.Field_7612.Method_34182().Method_27094(vec3.\u0000= final, vec3.\u0000strictfp + d, vec3.\u0000, `, this.Field_7618);
            }
        }
    }

    public boolean Method_7631(Class_1061 class_1061, double d) {
        Class_15832 class_15832 = this.Method_7629(class_1061);
        return (class_15832 != null ? (int)(this.Method_7632(class_15832, d) ? 1 : 0) : 22533 & 1312) != 0;
    }

    public boolean Method_7632(Class_15832 class_15832, double d) {
        if (class_15832 == null) {
            this.Field_7620 = null;
            return (2201 & -14586) != 0;
        }
        if (!class_15832.Method_15845(this.Field_7620)) {
            this.Field_7620 = class_15832;
        }
        this.Method_7634();
        if (this.Field_7620.Method_15840() == 0) {
            return (-15850 & 10697) != 0;
        }
        this.Field_7618 = d;
        Vec3 vec3 = this.Method_7627();
        this.Field_7613 = this.Field_7621;
        this.Field_7616 = vec3;
        return (8195 & 4389) != 0;
    }

    public float Method_7633() {
        return (float)this.Field_7614.Method_16554();
    }

    protected void Method_7634() {
    }

    protected abstract boolean Method_7635(Vec3 var1, Vec3 var2, int var3, int var4, int var5);

    public Class_15832 Method_7636() {
        return this.Field_7620;
    }

    public void Method_7637(float f) {
        this.Field_7615 = f;
    }

    public boolean Method_7638(double d, double d2, double d3, double d4) {
        Class_15832 class_15832 = this.Method_7639(Class_13337.Method_13371(d), (int)d2, Class_13337.Method_13371(d3));
        return this.Method_7632(class_15832, d4);
    }

    public final Class_15832 Method_7639(double d, double d2, double d3) {
        return this.Method_7622(new Class_4751(Class_13337.Method_13371(d), (int)d2, Class_13337.Method_13371(d3)));
    }

    private void Method_7640() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_7611(Class_34093 class_34093, Class_283 class_283) {
        this.Field_7612 = class_34093;
        this.Field_7617 = class_283;
        this.Field_7614 = class_34093.\u0000strictfp(Class_21716.Field_21719);
        this.Field_7619 = this.Method_7623();
    }

    public boolean Method_7641() {
        return (this.Field_7620 == null || this.Field_7620.Method_15836() ? 22853 & -32599 : 16484 & -32110) != 0;
    }

    protected void Method_7642() {
        int n;
        Vec3 vec3 = this.Method_7627();
        int n2 = this.Field_7620.Method_15840();
        for (int i = this.Field_7620.Method_15844(); i < this.Field_7620.Method_15840(); ++i) {
            if (this.Field_7620.Method_15842((int)i).Field_26871 == (int)vec3.\u0000strictfp) continue;
            n2 = i;
            break;
        }
        float f = this.Field_7612.\u0000= int() * this.Field_7612.\u0000= int() * this.Field_7615;
        for (n = this.Field_7620.Method_15844(); n < n2; ++n) {
            Vec3 vec32 = this.Field_7620.Method_15837(this.Field_7612, n);
            if (!(vec3.\u0000strictfp(vec32) < (double)f)) continue;
            this.Field_7620.Method_15846(n + (129 & 14353));
        }
        n = Class_13337.Method_13362(this.Field_7612.\u0000= int());
        int n3 = (int)this.Field_7612.\u0000= switch() + (45 & -31151);
        int n4 = n;
        for (int i = n2 - (4481 & 17477); i >= this.Field_7620.Method_15844(); --i) {
            if (!this.Method_7635(vec3, this.Field_7620.Method_15837(this.Field_7612, i), n, n3, n4)) continue;
            this.Field_7620.Method_15846(i);
            break;
        }
        this.Method_7628(vec3);
    }

    public void Method_7643() {
        this.Field_7620 = null;
    }
}

