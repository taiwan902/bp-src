/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import net.minecraft.util.Vec3;

public class Class_33730
extends Class_27380 {
    private static final Class_2080 Field_33731 = new Class_2080(Class_33730.Method_33736("\u0982\u0983\u0982\u0982\u0983\u0980\u0983\u0981\u0981\u0983\u0980\u0982\u0983\u0982\u0983\u0981\u0993\u0993\u0990\u0993\u0991\u0993\u0990\u0992\u0990\u0992\u0990\u0991"));
    protected Class_33781 Field_33732 = new Class_39682();

    protected void Method_33733(Class_15933 class_15933, float f, Class_3436 class_3436) {
        Class_16867.Method_16961();
        Class_18.Field_89.Method_214().Method_36715(class_3436, class_15933.\u0000strictfp(f));
        Class_16867.Method_16945();
    }

    public void Method_33734(Class_15933 class_15933, double d, double d2, double d3, float f, float f2) {
        Class_16867.Method_16961();
        this.\u0000, `((Class_1061)class_15933);
        long l = (long)class_15933.\u0000, `() * (1576465719L & 9073143309608613303L);
        l = l * l * (-3512421018045303055L & 3512421020689197011L) + l * (3292896529853157849L & 1083016685L);
        float f3 = (((float)(l >> (2129 & -15856) & (-4391986374495892457L & 4391986372379459855L)) + 3.5833333f * 0.13953489f) / (9.955556f * 0.8035714f) - 0.028735632f * 17.4f) * (0.0049014087f * 0.81609195f);
        float f4 = (((float)(l >> (2071 & 28796) & (1063431L & 300171271L)) + 0.24418604f * 2.047619f) / (66.0f * 0.121212125f) - 0.6666667f * 0.75f) * (0.0029767444f * 1.34375f);
        float f5 = (((float)(l >> (16504 & 8732) & (1312895L & 943768583L)) + 4.5f * 0.11111111f) / (0.85714287f * 9.333333f) - 0.74418604f * 0.671875f) * (0.018476192f * 0.21649484f);
        Class_16867.Method_16943(f3, f4, f5);
        double d4 = class_15933.\u0000, for + (class_15933.\u0000= package - class_15933.\u0000, for) * (double)f2;
        double d5 = class_15933.\u0000, 2 + (class_15933.\u0000, for() - class_15933.\u0000, 2) * (double)f2;
        double d6 = class_15933.\u0000, # + (class_15933.\u0000= switch - class_15933.\u0000, #) * (double)f2;
        double d7 = 0.04477611940298507 * 6.70000026623408;
        Vec3 vec3 = class_15933.Method_15981(d4, d5, d6);
        float f6 = class_15933.\u0000, 2 + (class_15933.\u0000= float - class_15933.\u0000, 2) * f2;
        if (vec3 != null) {
            Vec3 vec32 = class_15933.Method_15992(d4, d5, d6, d7);
            Vec3 vec33 = class_15933.Method_15992(d4, d5, d6, -d7);
            if (vec32 == null) {
                vec32 = vec3;
            }
            if (vec33 == null) {
                vec33 = vec3;
            }
            d += vec3.\u0000= final - d4;
            d2 += (vec32.\u0000strictfp + vec33.\u0000strictfp) / (8.875 * 0.22535211267605634) - d5;
            d3 += vec3.\u0000, ` - d6;
            Vec3 vec34 = vec33.\u0000strictfp(-vec32.\u0000= final, -vec32.\u0000strictfp, -vec32.\u0000, `);
            if (vec34.\u0000strictfp() != 0.0) {
                vec34 = vec34.\u0000strictfp();
                f = (float)(Math.atan2(vec34.\u0000, `, vec34.\u0000= final) * (20.0 * 9.0) / (0.19444444444444445 * 16.156762218461793));
                f6 = (float)(Math.atan(vec34.\u0000strictfp) * (11.0 * 6.636363636363637));
            }
        }
        Class_16867.Method_16943((float)d, (float)d2 + 0.7764706f * 0.48295453f, (float)d3);
        Class_16867.Method_16940(1.4313725f * 125.753426f - f, 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940(-f6, 0.0f, 0.0f, 1.0f);
        float f7 = (float)class_15933.Method_15961() - f2;
        float f8 = class_15933.Method_15983() - f2;
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f7 > 0.0f) {
            Class_16867.Method_16940(Class_13337.Method_13370(f7) * f7 * f8 / (4.6031747f * 2.1724138f) * (float)class_15933.Method_15986(), 1.0f, 0.0f, 0.0f);
        }
        int n = class_15933.Method_15991();
        Class_3436 class_3436 = class_15933.Method_15967();
        if (class_3436.Method_3442().Method_3316() != (-1 & -1)) {
            Class_16867.Method_16961();
            this.\u0000strictfp(Class_24069.Field_24084);
            float f9 = 0.22988506f * 3.2625f;
            Class_16867.Method_16973(f9, f9, f9);
            Class_16867.Method_16943(-0.039215688f * 12.75f, (float)(n - (8200 & 17070)) / (6.6666665f * 2.4f), 0.11445783f * 4.368421f);
            this.Method_33733(class_15933, f2, class_3436);
            Class_16867.Method_16945();
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            this.\u0000, `((Class_1061)class_15933);
        }
        Class_16867.Method_16973(1.0769231f * -0.9285714f, -0.95f * 1.0526316f, 1.0f);
        this.Field_33732.Method_33794(class_15933, 0.0f, 0.0f, -0.04390244f * 2.2777777f, 0.0f, 0.0f, 0.1125f * 0.5555556f);
        Class_16867.Method_16945();
        super.Method_27403(class_15933, d, d2, d3, f, f2);
    }

    private void Method_33735() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_33736(String string) {
        int n = 14807;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33730.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_33737(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_33734((Class_15933)class_1061, d, d2, d3, f, f2);
    }

    public Class_33730(Class_8491 class_8491) {
        super(class_8491);
        this.\u0000, ` = 0.62f * 0.8064516f;
    }

    protected Class_2080 Method_33738(Class_15933 class_15933) {
        return Field_33731;
    }

    protected Class_2080 Method_33739(Class_1061 class_1061) {
        return this.Method_33738((Class_15933)class_1061);
    }
}

