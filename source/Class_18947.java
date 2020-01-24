/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 */
import com.google.common.collect.Iterators;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;

public class Class_18947
implements Iterable {
    final Class_30043 Field_18948;
    final Class Field_18949;

    Class_18947(Class_30043 class_30043, Class class_) {
        this.Field_18948 = class_30043;
        this.Field_18949 = class_;
    }

    private void Method_18950() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Iterator Method_18951() {
        List list = (List)Class_30043.Method_30050(this.Field_18948).get(this.Field_18948.Method_30057(this.Field_18949));
        if (list == null) {
            return Iterators.emptyIterator();
        }
        Iterator iterator = list.iterator();
        return Iterators.filter(iterator, (Class)this.Field_18949);
    }
}

