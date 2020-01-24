/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 *  com.mojang.authlib.GameProfile
 */
import com.google.common.collect.ComparisonChain;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import java.util.UUID;

public final class Class_12131
implements Comparator {
    Class_12131() {
    }

    public int Method_12132(Class_9738 class_9738, Class_9738 class_97382) {
        return ComparisonChain.start().compare((Comparable)class_9738.Method_9758().getId(), (Comparable)class_97382.Method_9758().getId()).result();
    }

    private void Method_12133() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_12134(Object object, Object object2) {
        return this.Method_12132((Class_9738)object, (Class_9738)object2);
    }
}

