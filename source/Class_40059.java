/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public abstract class Class_40059
extends Class_39999 {
    private final Class_18956 Field_40060 = Class_18956.Method_18960(this, Class_40059.class, "I");

    private void Method_40061() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_40062(Object object) {
        return this.Field_40060.Method_18962(object);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void Method_40063(Class_39158 class_39158, Object object) {
        Class_18236 class_18236;
        block13 : {
            class_18236 = Class_18236.Method_18239();
            try {
                if (this.Method_40062(object)) {
                    Object object2 = object;
                    try {
                        this.Method_40064(class_39158, object2, class_18236);
                        break block13;
                    }
                    finally {
                        Class_24761.Method_24765(object2);
                    }
                }
                class_18236.Method_18248(object);
            }
            catch (Class_32043 class_32043) {
                try {
                    throw class_32043;
                    catch (Exception exception) {
                        throw new Class_32043(exception);
                    }
                }
                catch (Throwable throwable) {
                    int n = class_18236.size();
                    int n2 = 18564 & -31726;
                    do {
                        if (n2 >= n) {
                            class_18236.Method_18247();
                            throw throwable;
                        }
                        class_39158.Method_39183(class_18236.get(n2));
                        ++n2;
                    } while (true);
                }
            }
        }
        int n = class_18236.size();
        int n3 = -24062 & 6184;
        do {
            if (n3 >= n) {
                class_18236.Method_18247();
                return;
            }
            class_39158.Method_39183(class_18236.get(n3));
            ++n3;
        } while (true);
    }

    protected abstract void Method_40064(Class_39158 var1, Object var2, List var3);

    protected Class_40059() {
    }
}

