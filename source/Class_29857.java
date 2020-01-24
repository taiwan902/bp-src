/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Class_29857
extends Class_18019 {
    public Class_29857() {
    }

    private void Method_29858() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_29857(Class_283 class_283, Random random, int n, int n2) {
        super(n, n2);
        Class_41963 class_41963 = new Class_41963(random, (n << (-28636 & 454)) + (3 & -32766), (n2 << (1028 & 24805)) + (2374 & 12307));
        this.\u0000strictfp.add(class_41963);
        class_41963.\u0000strictfp((Class_13400)class_41963, (List)this.\u0000strictfp, random);
        List list = class_41963.Field_41964;
        while (!list.isEmpty()) {
            int n3 = random.nextInt(list.size());
            Class_13400 class_13400 = (Class_13400)list.remove(n3);
            class_13400.Method_13427(class_41963, this.\u0000strictfp, random);
        }
        this.\u0000strictfp();
        this.\u0000strictfp(class_283, random, 8240 & -26382, 759 & 9294);
    }
}

