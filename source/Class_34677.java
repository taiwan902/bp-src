/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

public class Class_34677 {
    private final int Field_34678 = Class_32728.Method_32744();
    private static final int Field_34679 = Class_32728.Method_32744();

    private void Method_34680() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public final Object Method_34681(Class_32728 class_32728) {
        Object object = class_32728.Method_32730(this.Field_34678);
        if (object != Class_32728.Field_32729) {
            return object;
        }
        return this.Method_34682(class_32728);
    }

    private Object Method_34682(Class_32728 class_32728) {
        Object object = null;
        try {
            object = this.Method_34688();
        }
        catch (Exception exception) {
            Class_7799.Method_7834(exception);
        }
        class_32728.Method_32749(this.Field_34678, object);
        Class_34677.Method_34687(class_32728, this);
        return object;
    }

    public final void Method_34683(Class_32728 class_32728, Object object) {
        if (object != Class_32728.Field_32729) {
            if (class_32728.Method_32749(this.Field_34678, object)) {
                Class_34677.Method_34687(class_32728, this);
            }
        } else {
            this.Method_34689(class_32728);
        }
    }

    public final Object Method_34684() {
        return this.Method_34681(Class_32728.Method_32743());
    }

    private static void Method_34685(Class_32728 class_32728, Class_34677 class_34677) {
        Object object = class_32728.Method_32730(Field_34679);
        if (object == Class_32728.Field_32729 || object == null) {
            return;
        }
        Set set = (Set)object;
        set.remove(class_34677);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void Method_34686() {
        Class_32728 class_32728 = Class_32728.Method_32747();
        if (class_32728 == null) {
            return;
        }
        try {
            Object object = class_32728.Method_32730(Field_34679);
            if (object != null && object != Class_32728.Field_32729) {
                Class_34677[] arrclass_34677;
                Set set = (Set)object;
                Class_34677[] arrclass_346772 = arrclass_34677 = set.toArray(new Class_34677[set.size()]);
                int n = arrclass_346772.length;
                for (int i = 22812 & 608; i < n; ++i) {
                    Class_34677 class_34677 = arrclass_346772[i];
                    class_34677.Method_34689(class_32728);
                }
            }
        }
        finally {
            Class_32728.Method_32732();
        }
    }

    private static void Method_34687(Class_32728 class_32728, Class_34677 class_34677) {
        Set set;
        Object object = class_32728.Method_32730(Field_34679);
        if (object == Class_32728.Field_32729 || object == null) {
            set = Collections.newSetFromMap(new IdentityHashMap());
            class_32728.Method_32749(Field_34679, set);
        } else {
            set = (Set)object;
        }
        set.add(class_34677);
    }

    protected Object Method_34688() {
        return null;
    }

    public final void Method_34689(Class_32728 class_32728) {
        if (class_32728 == null) {
            return;
        }
        Object object = class_32728.Method_32752(this.Field_34678);
        Class_34677.Method_34685(class_32728, this);
        if (object != Class_32728.Field_32729) {
            try {
                this.Method_34690(object);
            }
            catch (Exception exception) {
                Class_7799.Method_7834(exception);
            }
        }
    }

    protected void Method_34690(Object object) {
    }
}

