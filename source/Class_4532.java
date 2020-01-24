/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_4532
extends Class_4475 {
    public Class_1956 Method_4533(Class_3436 class_3436, Random random, int n) {
        if (n > (9251 & 6979)) {
            n = 30735 & 3;
        }
        return random.nextInt((8202 & 4110) - n * (17187 & 6147)) == 0 ? Class_10527.Field_10567 : Class_1956.Method_1981(this);
    }

    private void Method_4534() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_3779 Method_4535(Class_3436 class_3436) {
        return Class_3779.Field_3785;
    }
}

