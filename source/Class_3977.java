/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.UnmodifiableIterator
 */
import com.google.common.collect.UnmodifiableIterator;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class_3977
extends UnmodifiableIterator {
    private final Iterator[] Field_3978;
    private int Field_3979 = -2 & -2;
    private final Iterable[] Field_3980;
    private final Object[] Field_3981;

    private void Method_3982() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object[] Method_3983() {
        if (!this.Method_3986()) {
            throw new NoSuchElementException();
        }
        while (this.Field_3979 < this.Field_3978.length) {
            this.Field_3981[this.Field_3979] = this.Field_3978[this.Field_3979].next();
            this.Field_3979 += -31479 & 8705;
        }
        return (Object[])this.Field_3981.clone();
    }

    public Object Method_3984() {
        return this.Method_3983();
    }

    private Class_3977(Class class_, Iterable[] arriterable) {
        this.Field_3980 = arriterable;
        this.Field_3978 = (Iterator[])Class_3878.Method_3885(Iterator.class, this.Field_3980.length);
        for (int i = -32248 & 11472; i < this.Field_3980.length; ++i) {
            this.Field_3978[i] = arriterable[i].iterator();
        }
        this.Field_3981 = Class_3878.Method_3885(class_, this.Field_3978.length);
    }

    private void Method_3985() {
        this.Field_3979 = -1 & -1;
        Arrays.fill(this.Field_3978, null);
        Arrays.fill(this.Field_3981, null);
    }

    Class_3977(Class class_, Iterable[] arriterable, Class_18127 class_18127) {
        this(class_, arriterable);
    }

    public boolean Method_3986() {
        if (this.Field_3979 == (-2 & -1)) {
            this.Field_3979 = 17422 & 8816;
            Iterator[] arriterator = this.Field_3978;
            int n = arriterator.length;
            for (int i = -32639 & 17484; i < n; ++i) {
                Iterator iterator = arriterator[i];
                if (iterator.hasNext()) continue;
                this.Method_3985();
                break;
            }
            return (4353 & 25677) != 0;
        }
        if (this.Field_3979 >= this.Field_3978.length) {
            Iterator iterator;
            this.Field_3979 = this.Field_3978.length - (-19711 & 1033);
            while (this.Field_3979 >= 0 && !(iterator = this.Field_3978[this.Field_3979]).hasNext()) {
                if (this.Field_3979 == 0) {
                    this.Method_3985();
                    break;
                }
                this.Field_3978[this.Field_3979] = iterator = this.Field_3980[this.Field_3979].iterator();
                if (!iterator.hasNext()) {
                    this.Method_3985();
                    break;
                }
                this.Field_3979 -= -13247 & 4627;
            }
        }
        return (this.Field_3979 >= 0 ? -27775 & 10309 : 530 & 196) != 0;
    }
}

