/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class_13519
extends Class_11681 {
    private static final Map Field_13520 = Maps.newHashMap();
    private static final Class_2080 Field_13521 = new Class_2080(Class_13519.Method_13526("\u1018\u1008\u1010\u1019\u1019\u1019\u1009\u1018\u1001\u1008\u1000\u1019\u1001\u1019\u1011\u1000\u1018\u1018\u1010\u1011\u1019\u1009\u1001\u1019\u1019\u1008\u1019\u1011\u1008\u1011\u1019"));
    private Class_47582 Field_13522 = new Class_47582();

    private void Method_13523() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_13524(Class_39935 class_39935, double d, double d2, double d3, float f, int n) {
        float f2;
        int n2 = class_39935.\u0000, `() != null ? 16997 & 7169 : 4102 & -32232;
        int n3 = n2 == 0 || class_39935.\u0000strictfp() == Class_9265.Field_9409 ? 5705 & 16385 : 4608 & -15346;
        int n4 = n2 != 0 ? class_39935.\u0000, `() : 290 & -30588;
        long l = n2 != 0 ? class_39935.\u0000, `().Method_363() : 25169216L & 138440708L;
        Class_16867.Method_16961();
        float f3 = 18.333334f * 0.036363635f;
        if (n3 != 0) {
            Class_16867.Method_16943((float)d + 0.078947365f * 6.3333335f, (float)d2 + 1.6857142f * 0.44491526f * f3, (float)d3 + 0.36842105f * 1.3571429f);
            f2 = (float)(n4 * (4476 & -15000)) / (25.066668f * 0.63829786f);
            Class_16867.Method_16940(-f2, 0.0f, 1.0f, 0.0f);
            this.Field_13522.Field_47584.Field_31967 = 1025 & 17093;
        } else {
            f2 = 0.0f;
            if (n4 == (16554 & 3331)) {
                f2 = 0.50769234f * 354.54544f;
            }
            if (n4 == (18500 & -23780)) {
                f2 = 289.2857f * 0.31111112f;
            }
            if (n4 == (4149 & 18439)) {
                f2 = -171.0f * 0.5263158f;
            }
            Class_16867.Method_16943((float)d + 1.9285715f * 0.25925925f, (float)d2 - 0.010204081f * 24.5f * f3, (float)d3 + 0.85714287f * 0.5833333f);
            Class_16867.Method_16940(-f2, 0.0f, 1.0f, 0.0f);
            Class_16867.Method_16943(0.0f, -1.4338235f * 0.21794872f, -0.36303192f * 1.2051282f);
            this.Field_13522.Field_47584.Field_31967 = 8193 & -16206;
        }
        Class_4751 class_4751 = class_39935.\u0000strictfp();
        float f4 = (float)(class_4751.\u0000= final() * (17799 & 4615) + class_4751.\u0000, `() * (5133 & -24215) + class_4751.\u0000strictfp() * (23565 & -24401)) + (float)l + f;
        this.Field_13522.Field_47585.Field_31984 = (-0.007012195f * 1.7826087f + 1.7543859E-4f * 57.0f * Class_13337.Method_13350(f4 * (2.7142856f * 1.157429f) * (18.4f * 0.0010869565f))) * (4.468043f * 0.703125f);
        Class_16867.Method_16957();
        Class_2080 class_2080 = this.Method_13527(class_39935);
        if (class_2080 != null) {
            this.\u0000strictfp(class_2080);
            Class_16867.Method_16961();
            Class_16867.Method_16973(f3, -f3, -f3);
            this.Field_13522.Method_47586();
            Class_16867.Method_16945();
        }
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        Class_16867.Method_16945();
    }

    public void Method_13525(Class_4879 class_4879, double d, double d2, double d3, float f, int n) {
        this.Method_13524((Class_39935)class_4879, d, d2, d3, f, n);
    }

    private static String Method_13526(String string) {
        int n = 25548;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_13519.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Class_2080 Method_13527(Class_39935 class_39935) {
        String string = class_39935.Method_39949();
        if (string.isEmpty()) {
            return null;
        }
        Class_17501 class_17501 = (Class_17501)Field_13520.get(string);
        if (class_17501 == null) {
            Object object;
            if (Field_13520.size() >= (264 & 14817)) {
                long l = System.currentTimeMillis();
                object = Field_13520.keySet().iterator();
                while (object.hasNext()) {
                    String string2 = (String)object.next();
                    Object object2 = (Class_17501)Field_13520.get(string2);
                    if (l - ((Class_17501)object2).Field_17503 <= (-7876567902134408580L & 614788960L)) continue;
                    Class_18.Field_89.Method_253().Method_34702(((Class_17501)object2).Field_17502);
                    object.remove();
                }
                if (Field_13520.size() >= (10632 & 1287)) {
                    return null;
                }
            }
            List list = class_39935.Method_39945();
            List list2 = class_39935.Method_39955();
            object = Lists.newArrayList();
            for (Object object2 : list) {
                object.add("textures/entity/banner/" + ((Class_29153)((Object)object2)).Method_29226() + ".png");
            }
            class_17501 = new Class_17501(null);
            class_17501.Field_17502 = new Class_2080(string);
            Class_18.Field_89.Method_253().Method_34704(class_17501.Field_17502, new Class_25761(Field_13521, (List)object, list2));
            Field_13520.put(string, class_17501);
        }
        class_17501.Field_17503 = System.currentTimeMillis();
        return class_17501.Field_17502;
    }
}

