/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Class_26720
implements Class_25993 {
    private final boolean Field_26721;
    private final int Field_26722;
    private final List Field_26723;
    private final int Field_26724;
    private final int Field_26725;

    public int Method_26726() {
        return this.Field_26722;
    }

    public int Method_26727(int n) {
        Class_16190 class_16190 = this.Method_26731(n);
        return class_16190.Method_16195() ? this.Field_26724 : class_16190.Method_16196();
    }

    public Set Method_26728() {
        HashSet hashSet = Sets.newHashSet();
        for (Class_16190 class_16190 : this.Field_26723) {
            hashSet.add(class_16190.Method_16193());
        }
        return hashSet;
    }

    public int Method_26729() {
        return this.Field_26725;
    }

    public Class_26720(List list, int n, int n2, int n3, boolean bl) {
        this.Field_26723 = list;
        this.Field_26722 = n;
        this.Field_26725 = n2;
        this.Field_26724 = n3;
        this.Field_26721 = bl;
    }

    public boolean Method_26730(int n) {
        return (!((Class_16190)this.Field_26723.get(n)).Method_16195() ? -22091 & 16897 : 1491 & 16896) != 0;
    }

    private Class_16190 Method_26731(int n) {
        return (Class_16190)this.Field_26723.get(n);
    }

    public int Method_26732() {
        return this.Field_26723.size();
    }

    public boolean Method_26733() {
        return this.Field_26721;
    }

    private void Method_26734() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_26735() {
        return this.Field_26724;
    }

    public int Method_26736(int n) {
        return ((Class_16190)this.Field_26723.get(n)).Method_16193();
    }
}

