/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;
import net.minecraft.util.Vec3;

public class Class_27813 {
    private static Vec3 Field_27814 = new Vec3(0.0, 0.0, 0.0);

    public static Vec3 Method_27815(Class_41853 class_41853, int n, int n2) {
        return Class_27813.Method_27818(class_41853, n, n2, null);
    }

    public static Vec3 Method_27816(Class_41853 class_41853, int n, int n2, Vec3 vec3) {
        Field_27814 = new Vec3(class_41853.\u0000= package, class_41853.\u0000, for(), class_41853.\u0000= switch).\u0000, `(vec3);
        return Class_27813.Method_27818(class_41853, n, n2, Field_27814);
    }

    private void Method_27817() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static Vec3 Method_27818(Class_41853 class_41853, int n, int n2, Vec3 vec3) {
        double d;
        double d2;
        Random random = class_41853.\u0000strictfp();
        int n3 = 452 & 8192;
        int n4 = 4096 & -29392;
        int n5 = 82 & 18432;
        int n6 = 9032 & 1168;
        float f = -20967.531f * 4.769231f;
        int n7 = class_41853.Method_41866() ? ((d2 = class_41853.Method_41869().\u0000, `((double)Class_13337.Method_13371(class_41853.\u0000= package), (double)Class_13337.Method_13371(class_41853.\u0000, for()), (double)Class_13337.Method_13371(class_41853.\u0000= switch)) + 3.506849315068493 * 1.140625) < (d = (double)(class_41853.Method_41870() + (float)n)) * d ? -21311 & 1 : -16375 & 5712) : 0 & 11904;
        for (int i = -28375 & 2070; i < (-26870 & 16394); ++i) {
            Class_4751 class_4751;
            float f2;
            int n8 = random.nextInt((16130 & 162) * n + (16515 & 5401)) - n;
            int n9 = random.nextInt((-32462 & 10755) * n2 + (11265 & 16833)) - n2;
            int n10 = random.nextInt((38 & 138) * n + (2343 & -16247)) - n;
            if (vec3 != null && !((double)n8 * vec3.\u0000= final + (double)n10 * vec3.\u0000, ` >= 0.0)) continue;
            if (class_41853.Method_41866() && n > (8531 & 21001)) {
                class_4751 = class_41853.Method_41869();
                n8 = class_41853.\u0000= package > (double)class_4751.\u0000= final() ? (n8 -= random.nextInt(n / (8450 & 66))) : (n8 += random.nextInt(n / (-28154 & 17507)));
                n10 = class_41853.\u0000= switch > (double)class_4751.\u0000strictfp() ? (n10 -= random.nextInt(n / (-5566 & 4262))) : (n10 += random.nextInt(n / (-16285 & 8706)));
            }
            class_4751 = new Class_4751(n8 += Class_13337.Method_13371(class_41853.\u0000= package), n9 += Class_13337.Method_13371(class_41853.\u0000, for()), n10 += Class_13337.Method_13371(class_41853.\u0000= switch));
            if (n7 != 0 && !class_41853.Method_41865(class_4751) || !((f2 = class_41853.Method_41862(class_4751)) > f)) continue;
            f = f2;
            n4 = n8;
            n5 = n9;
            n6 = n10;
            n3 = 24199 & 257;
        }
        if (n3 != 0) {
            return new Vec3(n4, n5, n6);
        }
        return null;
    }

    public static Vec3 Method_27819(Class_41853 class_41853, int n, int n2, Vec3 vec3) {
        Field_27814 = vec3.\u0000, `(class_41853.\u0000= package, class_41853.\u0000, for(), class_41853.\u0000= switch);
        return Class_27813.Method_27818(class_41853, n, n2, Field_27814);
    }
}

