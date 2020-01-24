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

public class Class_36241
extends Class_33077 {
    private final Class_42339 Field_36242;
    private Class_859 Field_36243;
    private final Predicate Field_36244;
    private Class_34093 Field_36245;
    private static final Logger Field_36246 = LogManager.getLogger();

    protected double Method_36247() {
        Class_16547 class_16547 = this.Field_36245.\u0000strictfp(Class_21716.Field_21719);
        return class_16547 == null ? 22.857142857142858 * 0.7 : class_16547.Method_16554();
    }

    public boolean Method_36248() {
        double d = this.Method_36247();
        List list = this.Field_36245.\u0000strictfp.Method_395(Class_626.class, this.Field_36245.\u0000, `().Method_11017(d, 3.588235294117647 * 1.1147540983606556, d), this.Field_36244);
        Collections.sort(list, this.Field_36242);
        if (list.isEmpty()) {
            return (-15872 & 5386) != 0;
        }
        this.Field_36243 = (Class_859)list.get(328 & 16530);
        return (513 & -22399) != 0;
    }

    public Class_36241(Class_34093 class_34093) {
        this.Field_36245 = class_34093;
        if (class_34093 instanceof Class_41853) {
            Field_36246.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
        }
        this.Field_36244 = new Class_11104(this);
        this.Field_36242 = new Class_42339(class_34093);
    }

    public void Method_36249() {
        this.Field_36245.Method_34117(null);
        super.Method_33080();
    }

    public void Method_36250() {
        this.Field_36245.Method_34117(this.Field_36243);
        super.Method_33080();
    }

    public boolean Method_36251() {
        Class_859 class_859 = this.Field_36245.Method_34127();
        if (class_859 == null) {
            return (522 & -2716) != 0;
        }
        if (!class_859.Method_1033()) {
            return (18442 & 913) != 0;
        }
        if (class_859 instanceof Class_626 && ((Class_626)class_859).Field_694.Field_18085) {
            return (3 & 8840) != 0;
        }
        Class_9665 class_9665 = this.Field_36245.\u0000strictfp();
        Class_9665 class_96652 = class_859.Method_949();
        if (class_9665 != null && class_96652 == class_9665) {
            return (-20456 & 1) != 0;
        }
        double d = this.Method_36247();
        return (this.Field_36245.\u0000strictfp((Class_1061)class_859) > d * d ? -32622 & 4928 : (!(class_859 instanceof \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true) || !((\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)class_859).\u0000strictfp.Method_38768() ? -15871 & 11389 : -23392 & 4632)) != 0;
    }

    private void Method_36252() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static Class_34093 Method_36253(Class_36241 class_36241) {
        return class_36241.Field_36245;
    }
}

