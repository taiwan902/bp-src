/*
 * Decompiled with CFR 0.145.
 */
import java.io.Serializable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class Class_23527
implements Serializable,
Collection {
    final Class_21500 Field_23528;

    public abstract boolean Method_23529(Object var1);

    public final boolean Method_23530(Collection collection) {
        if (collection != this) {
            for (E e : collection) {
                if (e != null && this.Method_23529(e)) continue;
                return (176 & -29951) != 0;
            }
        }
        return (24617 & 3073) != 0;
    }

    public final Object[] Method_23531() {
        long l = this.Field_23528.Method_21543();
        if (l > (-6460276048268361737L & Integer.MAX_VALUE)) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int n = (int)l;
        Object[] arrobject = new Object[n];
        int n2 = 2642 & 4524;
        Iterator iterator = this.Method_23536();
        while (iterator.hasNext()) {
            E e = iterator.next();
            if (n2 == n) {
                if (n >= (2147483639 & -9)) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                n = n >= (1073741819 & 1073741823) ? -9 & Integer.MAX_VALUE : (n += (n >>> (-16319 & 1569)) + (1153 & 2065));
                arrobject = Arrays.copyOf(arrobject, n);
            }
            arrobject[n2++] = e;
        }
        return n2 == n ? arrobject : Arrays.copyOf(arrobject, n2);
    }

    public final boolean Method_23532(Collection collection) {
        int n = -7424 & 3281;
        Iterator iterator = this.Method_23536();
        while (iterator.hasNext()) {
            if (!collection.contains(iterator.next())) continue;
            iterator.remove();
            n = 6321 & 25101;
        }
        return n != 0;
    }

    public final Object[] Method_23533(Object[] arrobject) {
        long l = this.Field_23528.Method_21543();
        if (l > (-8079151839636881417L & 0x7FFFFFF7L)) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int n = (int)l;
        Object[] arrobject2 = arrobject.length >= n ? arrobject : (Object[])Array.newInstance(arrobject.getClass().getComponentType(), n);
        int n2 = arrobject2.length;
        int n3 = 70 & 18448;
        Iterator iterator = this.Method_23536();
        while (iterator.hasNext()) {
            E e = iterator.next();
            if (n3 == n2) {
                if (n2 >= (Integer.MAX_VALUE & 2147483639)) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                n2 = n2 >= (1073741819 & -5) ? Integer.MAX_VALUE & 2147483639 : (n2 += (n2 >>> (8737 & 18649)) + (677 & 22595));
                arrobject2 = Arrays.copyOf(arrobject2, n2);
            }
            arrobject2[n3++] = e;
        }
        if (arrobject == arrobject2 && n3 < n2) {
            arrobject2[n3] = null;
            return arrobject2;
        }
        return n3 == n2 ? arrobject2 : Arrays.copyOf(arrobject2, n3);
    }

    private void Method_23534() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public final boolean Method_23535() {
        return this.Field_23528.Method_21568();
    }

    public abstract Iterator Method_23536();

    public final boolean Method_23537(Collection collection) {
        int n = 11920 & 4;
        Iterator iterator = this.Method_23536();
        while (iterator.hasNext()) {
            if (collection.contains(iterator.next())) continue;
            iterator.remove();
            n = 49 & -31675;
        }
        return n != 0;
    }

    public final void Method_23538() {
        this.Field_23528.Method_21567();
    }

    Class_23527(Class_21500 class_21500) {
        this.Field_23528 = class_21500;
    }

    public final int Method_23539() {
        return this.Field_23528.Method_21545();
    }

    public final String Method_23540() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((char)(1243 & 27483));
        Iterator iterator = this.Method_23536();
        if (iterator.hasNext()) {
            do {
                E e;
                stringBuilder.append((Object)((e = iterator.next()) == this ? "(this Collection)" : e));
                if (!iterator.hasNext()) break;
                stringBuilder.append((char)(29359 & -30660)).append((char)(866 & -23384));
            } while (true);
        }
        return stringBuilder.append((char)(351 & -24483)).toString();
    }
}

