/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public class Class_25493 {
    protected final Map Field_25494 = Maps.newConcurrentMap();

    private void Method_25495() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_25496(Class_626 class_626, Class_13017 class_13017, int n) {
        if (!class_13017.Method_13036() || this.Method_25499((Class_14225)class_13017)) {
            this.Method_25497(class_626, class_13017, this.Method_25501(class_13017) + n);
        }
    }

    public void Method_25497(Class_626 class_626, Class_13017 class_13017, int n) {
        Class_15795 class_15795 = (Class_15795)this.Field_25494.get(class_13017);
        if (class_15795 == null) {
            class_15795 = new Class_15795();
            this.Field_25494.put(class_13017, class_15795);
        }
        class_15795.Method_15798(n);
    }

    public Class_18520 Method_25498(Class_13017 class_13017) {
        Class_15795 class_15795 = (Class_15795)this.Field_25494.get(class_13017);
        return class_15795 != null ? class_15795.Method_15801() : null;
    }

    public boolean Method_25499(Class_14225 class_14225) {
        return (class_14225.Field_14231 == null || this.Method_25502(class_14225.Field_14231) ? -16375 & 5159 : 2088 & 5777) != 0;
    }

    public Class_18520 Method_25500(Class_13017 class_13017, Class_18520 class_18520) {
        Class_15795 class_15795 = (Class_15795)this.Field_25494.get(class_13017);
        if (class_15795 == null) {
            class_15795 = new Class_15795();
            this.Field_25494.put(class_13017, class_15795);
        }
        class_15795.Method_15799(class_18520);
        return class_18520;
    }

    public int Method_25501(Class_13017 class_13017) {
        Class_15795 class_15795 = (Class_15795)this.Field_25494.get(class_13017);
        return class_15795 == null ? -24568 & 1554 : class_15795.Method_15800();
    }

    public boolean Method_25502(Class_14225 class_14225) {
        return (this.Method_25501(class_14225) > 0 ? 16721 & -25597 : 608 & 2449) != 0;
    }

    public int Method_25503(Class_14225 class_14225) {
        if (this.Method_25502(class_14225)) {
            return 1098 & 6417;
        }
        int n = -24192 & 515;
        Class_14225 class_142252 = class_14225.Field_14231;
        while (class_142252 != null && !this.Method_25502(class_142252)) {
            class_142252 = class_142252.Field_14231;
            ++n;
        }
        return n;
    }
}

