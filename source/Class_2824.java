/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 */
import com.google.common.base.Function;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;

public abstract class Class_2824
implements Class_1782 {
    private Class_2893 Field_2825;
    protected List Field_2826 = Lists.newArrayList();

    private void Method_2827() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Iterator Method_2828(Iterable iterable) {
        Iterator iterator = Iterators.concat((Iterator)Iterators.transform(iterable.iterator(), (Function)new Class_28260()));
        iterator = Iterators.transform((Iterator)iterator, (Function)new Class_7502());
        return iterator;
    }

    public final String Method_2829() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = this.Method_2839();
        while (iterator.hasNext()) {
            Class_1782 class_1782 = (Class_1782)iterator.next();
            stringBuilder.append(class_1782.Method_1789().Method_2912());
            stringBuilder.append(class_1782.Method_1784());
            stringBuilder.append((Object)Class_5478.Field_5507);
        }
        return stringBuilder.toString();
    }

    public Class_2893 Method_2830() {
        if (this.Field_2825 == null) {
            this.Field_2825 = new Class_2893();
            for (Class_1782 class_1782 : this.Field_2826) {
                class_1782.Method_1789().Method_2941(this.Field_2825);
            }
        }
        return this.Field_2825;
    }

    public Class_1782 Method_2831(Class_1782 class_1782) {
        class_1782.Method_1789().Method_2941(this.Method_2830());
        this.Field_2826.add(class_1782);
        return this;
    }

    public Class_1782 Method_2832(Class_2893 class_2893) {
        this.Field_2825 = class_2893;
        for (Class_1782 class_1782 : this.Field_2826) {
            class_1782.Method_1789().Method_2941(this.Method_2830());
        }
        return this;
    }

    public List Method_2833() {
        return this.Field_2826;
    }

    public final String Method_2834() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = this.Method_2839();
        while (iterator.hasNext()) {
            Class_1782 class_1782 = (Class_1782)iterator.next();
            stringBuilder.append(class_1782.Method_1784());
        }
        return stringBuilder.toString();
    }

    public String Method_2835() {
        return "BaseComponent{style=" + this.Field_2825 + ", siblings=" + this.Field_2826 + (char)(-25985 & 9341);
    }

    public int Method_2836() {
        return (-28513 & 11871) * this.Field_2825.Method_2933() + this.Field_2826.hashCode();
    }

    public boolean Method_2837(Object object) {
        if (this == object) {
            return (24839 & -31719) != 0;
        }
        if (!(object instanceof Class_2824)) {
            return (-22464 & 33) != 0;
        }
        Class_2824 class_2824 = (Class_2824)object;
        return (this.Field_2826.equals(class_2824.Field_2826) && this.Method_2830().Method_2907(class_2824.Method_2830()) ? 67 & 12437 : 18432 & 5762) != 0;
    }

    public Class_1782 Method_2838(String string) {
        return this.Method_2831(new Class_2840(string));
    }

    public Iterator Method_2839() {
        Object[] arrobject = new Class_2824[1089 & 12801];
        arrobject[-20852 & 20835] = this;
        return Iterators.concat((Iterator)Iterators.forArray((Object[])arrobject), (Iterator)Class_2824.Method_2828(this.Field_2826));
    }
}

