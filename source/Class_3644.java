/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Map;

public class Class_3644
extends Class_2804
implements Class_3656 {
    protected final Map Field_3645 = ((BiMap)this.\u0000, `).inverse();
    protected final Class_3657 Field_3646 = new Class_3657();

    public int Method_3647(Object object) {
        return this.Field_3646.Method_3662(object);
    }

    public Object Method_3648(Object object) {
        return this.Field_3645.get(object);
    }

    public void Method_3649(int n, Object object, Object object2) {
        this.Field_3646.Method_3660(object2, n);
        this.\u0000strictfp(object, object2);
    }

    public Object Method_3650(Object object) {
        return super.Method_2809(object);
    }

    public Iterator Method_3651() {
        return this.Field_3646.Method_3664();
    }

    private void Method_3652() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_3653(int n) {
        return this.Field_3646.Method_3663(n);
    }

    public boolean Method_3654(Object object) {
        return super.Method_2808(object);
    }

    protected Map Method_3655() {
        return HashBiMap.create();
    }
}

