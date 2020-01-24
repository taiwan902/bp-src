/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicBoolean;

public final class Class_27689
extends PhantomReference
implements Class_20340 {
    private final String Field_27690;
    private Class_27689 Field_27691;
    private Class_27689 Field_27692;
    private final AtomicBoolean Field_27693;
    final Class_24943 Field_27694;
    private final Deque Field_27695;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String Method_27696() {
        Object[] arrobject;
        if (this.Field_27690 == null) {
            return "";
        }
        Object object = this.Field_27695;
        synchronized (object) {
            arrobject = this.Field_27695.toArray();
        }
        object = new StringBuilder(22608 & -7901);
        ((StringBuilder)object).append(Class_22304.Field_22308);
        ((StringBuilder)object).append("Recent access records: ");
        ((StringBuilder)object).append(arrobject.length);
        ((StringBuilder)object).append(Class_22304.Field_22308);
        if (arrobject.length > 0) {
            for (int i = arrobject.length - (16387 & 4225); i >= 0; --i) {
                ((StringBuilder)object).append((char)(-6877 & 683));
                ((StringBuilder)object).append(i + (17413 & -32733));
                ((StringBuilder)object).append((char)(9403 & 4478));
                ((StringBuilder)object).append(Class_22304.Field_22308);
                ((StringBuilder)object).append(arrobject[i]);
            }
        }
        ((StringBuilder)object).append("Created at:");
        ((StringBuilder)object).append(Class_22304.Field_22308);
        ((StringBuilder)object).append(this.Field_27690);
        ((StringBuilder)object).setLength(((StringBuilder)object).length() - Class_22304.Field_22308.length());
        return ((StringBuilder)object).toString();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_27697() {
        if (this.Field_27690 != null) {
            String string = Class_24943.Method_24959(14 & 322);
            Deque deque = this.Field_27695;
            synchronized (deque) {
                int n = this.Field_27695.size();
                if (n == 0 || !((String)this.Field_27695.getLast()).equals(string)) {
                    this.Field_27695.add(string);
                }
                if (n > (12374 & 2052)) {
                    this.Field_27695.removeFirst();
                }
            }
        }
    }

    private void Method_27698() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Class_27689(Class_24943 class_24943, Object object) {
        this.Field_27694 = class_24943;
        super(object, object != null ? Class_24943.Method_24967(class_24943) : null);
        this.Field_27695 = new ArrayDeque();
        if (object != null) {
            Class_28119 class_28119 = Class_24943.Method_24968();
            this.Field_27690 = class_28119.ordinal() >= Class_28119.Field_28120.ordinal() ? Class_24943.Method_24959(131 & 10835) : null;
            Class_27689 class_27689 = Class_24943.Method_24974(class_24943);
            synchronized (class_27689) {
                this.Field_27692 = Class_24943.Method_24974(class_24943);
                this.Field_27691 = Class_24943.Method_24974((Class_24943)class_24943).Field_27691;
                Class_24943.Method_24974((Class_24943)class_24943).Field_27691.Field_27692 = this;
                Class_24943.Method_24974((Class_24943)class_24943).Field_27691 = this;
                Class_24943.Method_24966(class_24943);
            }
            this.Field_27693 = new AtomicBoolean();
        } else {
            this.Field_27690 = null;
            this.Field_27693 = new AtomicBoolean((603 & 2053) != 0);
        }
    }

    static Class_27689 Method_27699(Class_27689 class_27689, Class_27689 class_276892) {
        class_27689.Field_27692 = class_276892;
        return class_27689.Field_27692;
    }

    static Class_27689 Method_27700(Class_27689 class_27689, Class_27689 class_276892) {
        class_27689.Field_27691 = class_276892;
        return class_27689.Field_27691;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean Method_27701() {
        if (this.Field_27693.compareAndSet((46 & 8960) != 0, (2625 & -19167) != 0)) {
            Class_27689 class_27689 = Class_24943.Method_24974(this.Field_27694);
            synchronized (class_27689) {
                Class_24943.Method_24961(this.Field_27694);
                this.Field_27692.Field_27691 = this.Field_27691;
                this.Field_27691.Field_27692 = this.Field_27692;
                this.Field_27692 = null;
                this.Field_27691 = null;
            }
            return (-28267 & 19457) != 0;
        }
        return (8712 & 16599) != 0;
    }
}

