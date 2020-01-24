/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public abstract class Class_15030 {
    protected ArrayList Field_15031 = Lists.newArrayListWithCapacity((int)(26000 & 19545));
    protected boolean Field_15032;
    private double Field_15033;
    private double Field_15034;
    public static long Field_15035 = System.nanoTime();
    private double Field_15036;

    public void Method_15037(Class_6176 class_6176, Class_17531 class_17531) {
        this.Field_15031.add(class_6176);
    }

    public void Method_15038(double d, double d2, double d3) {
        this.Field_15032 = 16529 & 2665;
        this.Field_15031.clear();
        this.Field_15034 = d;
        this.Field_15036 = d2;
        this.Field_15033 = d3;
    }

    public final void Method_15039(Class_6176 class_6176) {
        float f;
        long l;
        Class_4751 class_4751 = class_6176.Method_6226();
        float f2 = (float)((double)class_4751.\u0000= final() - this.Field_15034);
        float f3 = (float)((double)class_4751.\u0000, `() - this.Field_15036);
        float f4 = (float)((double)class_4751.\u0000strictfp() - this.Field_15033);
        float f5 = 0.0f;
        if (Field_15035 != (638583338L & 1757630647926546692L) && (l = Field_15035 - class_6176.Field_6183) < (-5436910601705263839L & 5436910600557786370L) && l > (9018662978173541064L & 1075880960L) && f2 * f2 + f4 * f4 >= (f3 + (f = 1.1927711f * 53.656567f)) * (f3 + f)) {
            float f6 = (float)l / (3.3E9f * 0.15151516f);
            f5 = 1.0f - f6;
            f5 *= f5;
            f5 *= f5;
            f5 *= f5;
            f5 *= f5;
            f5 *= 37.735847f * 2.65f;
        }
        Class_16867.Method_16943(f2, f3 -= f5, f4);
    }

    public abstract void Method_15040(Class_17531 var1);

    private void Method_15041() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

