/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Class_25916
extends Class_18019 {
    private void Method_25917() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_25916() {
    }

    public Class_25916(Class_283 class_283, Random random, int n, int n2) {
        super(n, n2);
        Class_8238.Method_8251();
        Class_45837 class_45837 = new Class_45837(16388 & 3769, random, (n << (25094 & -31731)) + (17482 & 4130), (n2 << (-6420 & 20)) + (4186 & -24442));
        this.\u0000strictfp.add(class_45837);
        class_45837.\u0000strictfp((Class_13400)class_45837, (List)this.\u0000strictfp, random);
        List list = class_45837.Field_45840;
        while (!list.isEmpty()) {
            int n3 = random.nextInt(list.size());
            Class_13400 class_13400 = (Class_13400)list.remove(n3);
            class_13400.Method_13427(class_45837, this.\u0000strictfp, random);
        }
        this.\u0000strictfp();
        this.\u0000strictfp(class_283, random, 298 & 16459);
    }
}

