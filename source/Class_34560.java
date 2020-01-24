/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 *  com.google.common.base.Predicate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_34560
extends Class_33077 {
    private Class Field_34561;
    private Class_859 Field_34562;
    private final Class_42339 Field_34563;
    private Class_34093 Field_34564;
    private static final Logger Field_34565 = LogManager.getLogger();
    private final Predicate Field_34566;

    public boolean Method_34567() {
        Class_859 class_859 = this.Field_34564.Method_34127();
        if (class_859 == null) {
            return (16584 & 4368) != 0;
        }
        if (!class_859.Method_1033()) {
            return (8209 & 17610) != 0;
        }
        double d = this.Method_34569();
        return (this.Field_34564.\u0000strictfp((Class_1061)class_859) > d * d ? -28247 & 82 : (!(class_859 instanceof \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true) || !((\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)class_859).\u0000strictfp.Method_38768() ? 9551 & 2049 : 7698 & 452)) != 0;
    }

    public boolean Method_34568() {
        double d = this.Method_34569();
        List list = this.Field_34564.\u0000strictfp.Method_395(this.Field_34561, this.Field_34564.\u0000, `().Method_11017(d, 2.6206896551724137 * 1.5263157894736843, d), this.Field_34566);
        Collections.sort(list, this.Field_34563);
        if (list.isEmpty()) {
            return (9923 & 256) != 0;
        }
        this.Field_34562 = (Class_859)list.get(132 & 14627);
        return (27457 & 135) != 0;
    }

    protected double Method_34569() {
        Class_16547 class_16547 = this.Field_34564.\u0000strictfp(Class_21716.Field_21719);
        return class_16547 == null ? 2.3076923076923075 * 6.933333333333334 : class_16547.Method_16554();
    }

    static Class_34093 Method_34570(Class_34560 class_34560) {
        return class_34560.Field_34564;
    }

    public Class_34560(Class_34093 class_34093, Class class_) {
        this.Field_34564 = class_34093;
        this.Field_34561 = class_;
        if (class_34093 instanceof Class_41853) {
            Field_34565.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
        }
        this.Field_34566 = new Class_16018(this);
        this.Field_34563 = new Class_42339(class_34093);
    }

    public void Method_34571() {
        this.Field_34564.Method_34117(null);
        super.Method_33080();
    }

    private void Method_34572() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_34573() {
        this.Field_34564.Method_34117(this.Field_34562);
        super.Method_33080();
    }
}

