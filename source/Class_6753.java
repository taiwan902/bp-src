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

public class Class_6753
implements Comparator {
    public int Method_6754(Object object, Object object2) {
        return this.Method_6756((Class_9738)object, (Class_9738)object2);
    }

    private Class_6753() {
    }

    private void Method_6755() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_6753(Class_40065 class_40065) {
        this();
    }

    public int Method_6756(Class_9738 class_9738, Class_9738 class_97382) {
        Class_22057 class_22057 = class_9738.Method_9755();
        Class_22057 class_220572 = class_97382.Method_9755();
        return ComparisonChain.start().compareTrueFirst((class_9738.Method_9754() != Class_35650.Field_35654 ? 4717 & 19473 : 25634 & 2072) != 0, (class_97382.Method_9754() != Class_35650.Field_35654 ? 17189 & 1041 : -16064 & 7184) != 0).compare((Comparable)((Object)(class_22057 != null ? class_22057.Method_22075() : "")), (Comparable)((Object)(class_220572 != null ? class_220572.Method_22075() : ""))).compare((Comparable)((Object)class_9738.Method_9758().getName()), (Comparable)((Object)class_97382.Method_9758().getName())).result();
    }
}

