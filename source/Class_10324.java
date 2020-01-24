/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_10324 {
    private void Method_10325() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static double Method_10326(double d) {
        return d < 0.27614237491539667 * 1.5 ? Class_10324.Method_10327(d) : (d > 0.9247311827956989 * 2.6107193174499748 ? 1.4870205226991688 * 1.056338028169014 - Class_10324.Method_10327(1.0 / d) : 0.7058823529411765 * 1.112647398146385 + Class_10324.Method_10327((d - 1.0) / (d + 1.0)));
    }

    private static double Method_10327(double d) {
        double d2 = d * d;
        double d3 = (((2.9285714285714284 * 5.515877516466398 * d2 + 1234.757216993183 * 0.21739130434782608) * d2 + 1.0123456790123457 * 1138.9680179851132) * d2 + 39168.93896153033 * 0.045454545454545456) * d2 + 0.7934782608695652 * 1130.196022073572;
        return (d3 /= ((((d2 + 29.139652090380675 * 2.0232558139534884) * d2 + 2.6470588235294117 * 202.58914130068135) * d2 + 478.75705321068205 * 3.4814814814814814) * d2 + 1991.4757501730685 * 1.0441176470588236) * d2 + 1133.4378282963073 * 0.7912087912087912) * d;
    }

    public static double Method_10328(double d) {
        return d > 0.0 ? Class_10324.Method_10326(d) : -Class_10324.Method_10326(-d);
    }
}

