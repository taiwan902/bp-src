/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import net.minecraft.util.Vec3;
import org.apache.logging.log4j.Logger;

public class Class_27010
implements Class_1486 {
    private Vec3 Field_27011;
    private Class_19177 Field_27012;
    private static final Class_2190 Field_27013 = new Class_2190(Class_2263.Method_2293(), Class_2205.Field_2211);
    private static final Class_2190 Field_27014 = new Class_2190(Class_2263.Method_2275(), Class_2205.Field_2211);
    double Field_27015;
    private int Field_27016;

    public void Method_27017(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_27016);
        class_29900.Method_29964(this.Field_27012);
        if (this.Field_27012 == Class_19177.Field_19181) {
            class_29900.Method_29939((float)this.Field_27011.\u0000= final);
            class_29900.Method_29939((float)this.Field_27011.\u0000strictfp);
            class_29900.Method_29939((float)this.Field_27011.\u0000, `);
        }
    }

    public Class_19177 Method_27018() {
        return this.Field_27012;
    }

    public void Method_27019(Class_29900 class_29900) {
        this.Field_27016 = class_29900.Method_30004();
        this.Field_27012 = (Class_19177)class_29900.Method_30009(Class_19177.class);
        if (this.Field_27012 == Class_19177.Field_19181) {
            this.Field_27011 = new Vec3(class_29900.Method_29966(), class_29900.Method_29966(), class_29900.Method_29966());
        }
    }

    public Class_1061 Method_27020(Class_283 class_283) {
        return class_283.Method_343(this.Field_27016);
    }

    public Class_27010(Class_1061 class_1061, Vec3 vec3) {
        this(class_1061, Class_19177.Field_19181);
        this.Field_27011 = vec3;
    }

    public Class_27010() {
        this.Field_27015 = 83.0 * -0.012048192771084338;
    }

    private boolean Method_27021(Class_27010 class_27010) {
        Vec3 vec3;
        if (class_27010.Method_27018() != Class_19177.Field_19180) {
            return (8361 & 323) != 0;
        }
        Class_18 class_18 = Class_18.Field_89;
        if (class_18.Field_61.Method_11768()) {
            return (1 & 2479) != 0;
        }
        Class_1061 class_1061 = class_27010.Method_27020(class_18.Field_48.\u0000strictfp);
        if (!(class_1061 instanceof Class_626)) {
            return (-32255 & 2515) != 0;
        }
        this.Field_27015 = 0.0;
        if (class_1061 != class_18.Field_50) {
            return (4131 & -29691) != 0;
        }
        Class_1378 class_1378 = class_18.Field_48;
        double d = class_1378.Field_1401.Method_2199() + (double)class_1378.\u0000, for();
        Vec3 vec32 = new Vec3(class_1061.Field_1130, this.Method_27024(d, class_1061.Method_1324(), class_1061.Method_1324() + (double)class_1061.Method_1357()), class_1061.Field_1106);
        double d2 = vec32.\u0000, `(vec3 = new Vec3(class_1378.\u0000= package, d, class_1378.\u0000= switch));
        if (d2 > Field_27013.Method_2199()) {
            this.Field_27015 = d2;
            return (4738 & -14304) != 0;
        }
        Class_37110 class_37110 = class_18.Field_48.\u0000strictfp(d2 - Field_27014.Method_2199(), class_18.Field_127.Field_2170);
        if (class_37110 == null) {
            return (17153 & 6167) != 0;
        }
        return (18955 & 8533) != 0;
    }

    public Vec3 Method_27022() {
        return this.Field_27011;
    }

    public void Method_27023(Class_10930 class_10930) {
        class_10930.Method_10946(this);
    }

    private double Method_27024(double d, double d2, double d3) {
        return Math.min(Math.max(d, d2), d3);
    }

    private void Method_27025() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_27010(Class_1061 class_1061, Class_19177 class_19177) {
        this.Field_27015 = 0.37373737373737376 * -2.6756756756756754;
        this.Field_27016 = class_1061.Method_1311();
        this.Field_27012 = class_19177;
        try {
            if (!this.Method_27021(this)) {
                Class_20760 class_20760 = new Class_20760(Class_2205.Field_2255, "" + this.Field_27015);
                Class_47033.Method_47059(class_20760);
            }
        }
        catch (Throwable throwable) {
            Class_18.Field_19.warn((Object)throwable);
        }
    }

    public void Method_27026(Class_10954 class_10954) {
        this.Method_27023((Class_10930)class_10954);
    }
}

