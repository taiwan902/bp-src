/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Iterables
 */
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class Class_3692
implements Class_3436 {
    private static final Function Field_3693;
    private int Field_3694 = -1 & -1;
    private int Field_3695 = -1 & -1;
    private Class_2080 Field_3696 = null;
    private int Field_3697 = -1 & -1;
    private static final Joiner Field_3698;

    protected static Object Method_3699(Collection collection, Object object) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().equals(object)) continue;
            if (iterator.hasNext()) {
                return iterator.next();
            }
            return collection.iterator().next();
        }
        return iterator.next();
    }

    public Class_3436 Method_3700(Class_3538 class_3538) {
        return this.\u0000strictfp(class_3538, (Comparable)Class_3692.Method_3699(class_3538.Method_3542(), this.\u0000strictfp(class_3538)));
    }

    public int Method_3701() {
        if (this.Field_3695 < 0) {
            this.Field_3695 = this.\u0000strictfp().Method_3434(this);
        }
        return this.Field_3695;
    }

    static {
        Field_3698 = Joiner.on((char)(11052 & 1068));
        Field_3693 = new Class_3899();
    }

    public int Method_3702() {
        if (this.Field_3697 < 0) {
            this.Field_3697 = Class_3238.Method_3435(this.\u0000strictfp());
        }
        return this.Field_3697;
    }

    private void Method_3703() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_3704() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Class_3238.Field_3271.\u0000, `((Object)this.\u0000strictfp()));
        if (!this.\u0000strictfp().isEmpty()) {
            stringBuilder.append("[");
            Field_3698.appendTo(stringBuilder, Iterables.transform(this.\u0000strictfp().entrySet(), (Function)Field_3693));
            stringBuilder.append("]");
        }
        return stringBuilder.toString();
    }
}

