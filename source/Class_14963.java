/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_14963 {
    private final Class_36653 Field_14964;
    final int Field_14965;
    final Class_39208 Field_14966;
    final int Field_14967;
    private final int Field_14968;
    private final Class_36653 Field_14969;
    private final Class_41815[] Field_14970;
    final int Field_14971;
    final int Field_14972;
    private final Class_36653 Field_14973;
    private final Class_41815[] Field_14974;
    private final Class_36653 Field_14975;
    private final Class_36653 Field_14976;
    final int Field_14977;
    static final boolean Field_14978 = !Class_14963.class.desiredAssertionStatus() ? 2051 & 12849 : 16384 & -21232;
    private final Class_36653 Field_14979;

    protected abstract Class_8772 Method_14980(int var1, int var2, int var3, int var4);

    private synchronized void Method_14981(Class_43430 class_43430, int n, int n2) {
        if (this.Field_14976.Method_36662(class_43430, n, n2) || this.Field_14969.Method_36662(class_43430, n, n2) || this.Field_14975.Method_36662(class_43430, n, n2) || this.Field_14964.Method_36662(class_43430, n, n2) || this.Field_14979.Method_36662(class_43430, n, n2) || this.Field_14973.Method_36662(class_43430, n, n2)) {
            return;
        }
        Class_8772 class_8772 = this.Method_14980(this.Field_14971, this.Field_14968, this.Field_14965, this.Field_14972);
        long l = class_8772.Method_8796(n2);
        if (!Field_14978 && l <= (1410345513L & -2205552771350919804L)) {
            throw new AssertionError();
        }
        class_8772.Method_8808(class_43430, l, n);
        this.Field_14964.Method_36663(class_8772);
    }

    protected abstract void Method_14982(Object var1, int var2, Object var3, int var4, int var5);

    protected abstract Class_43430 Method_14983(int var1);

    public synchronized String Method_14984() {
        Class_41815 class_41815;
        int n;
        Class_41815 class_418152;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Chunk(s) at 0~25%:");
        stringBuilder.append(Class_22304.Field_22308);
        stringBuilder.append(this.Field_14964);
        stringBuilder.append(Class_22304.Field_22308);
        stringBuilder.append("Chunk(s) at 0~50%:");
        stringBuilder.append(Class_22304.Field_22308);
        stringBuilder.append(this.Field_14975);
        stringBuilder.append(Class_22304.Field_22308);
        stringBuilder.append("Chunk(s) at 25~75%:");
        stringBuilder.append(Class_22304.Field_22308);
        stringBuilder.append(this.Field_14969);
        stringBuilder.append(Class_22304.Field_22308);
        stringBuilder.append("Chunk(s) at 50~100%:");
        stringBuilder.append(Class_22304.Field_22308);
        stringBuilder.append(this.Field_14976);
        stringBuilder.append(Class_22304.Field_22308);
        stringBuilder.append("Chunk(s) at 75~100%:");
        stringBuilder.append(Class_22304.Field_22308);
        stringBuilder.append(this.Field_14979);
        stringBuilder.append(Class_22304.Field_22308);
        stringBuilder.append("Chunk(s) at 100%:");
        stringBuilder.append(Class_22304.Field_22308);
        stringBuilder.append(this.Field_14973);
        stringBuilder.append(Class_22304.Field_22308);
        stringBuilder.append("tiny subpages:");
        for (n = 769 & 5121; n < this.Field_14974.length; ++n) {
            class_41815 = this.Field_14974[n];
            if (class_41815.Field_41819 == class_41815) continue;
            stringBuilder.append(Class_22304.Field_22308);
            stringBuilder.append(n);
            stringBuilder.append(": ");
            class_418152 = class_41815.Field_41819;
            do {
                stringBuilder.append(class_418152);
            } while ((class_418152 = class_418152.Field_41819) != class_41815);
        }
        stringBuilder.append(Class_22304.Field_22308);
        stringBuilder.append("small subpages:");
        for (n = -8047 & 5127; n < this.Field_14970.length; ++n) {
            class_41815 = this.Field_14970[n];
            if (class_41815.Field_41819 == class_41815) continue;
            stringBuilder.append(Class_22304.Field_22308);
            stringBuilder.append(n);
            stringBuilder.append(": ");
            class_418152 = class_41815.Field_41819;
            do {
                stringBuilder.append(class_418152);
            } while ((class_418152 = class_418152.Field_41819) != class_41815);
        }
        stringBuilder.append(Class_22304.Field_22308);
        return stringBuilder.toString();
    }

    Class_41815 Method_14985(int n) {
        Class_41815[] arrclass_41815;
        int n2;
        if (Class_14963.Method_14987(n)) {
            n2 = n >>> (2055 & 84);
            arrclass_41815 = this.Field_14974;
        } else {
            n2 = -29168 & 16576;
            n >>>= 538 & 18735;
            while (n != 0) {
                n >>>= -16347 & 265;
                ++n2;
            }
            arrclass_41815 = this.Field_14970;
        }
        return arrclass_41815[n2];
    }

    private Class_41815[] Method_14986(int n) {
        return new Class_41815[n];
    }

    static boolean Method_14987(int n) {
        return ((n & (-431 & -512)) == 0 ? 8211 & 2053 : 15384 & -32703) != 0;
    }

    abstract boolean Method_14988();

    private void Method_14989() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected abstract void Method_14990(Class_8772 var1);

    static int Method_14991(int n) {
        return n >>> (5636 & 13);
    }

    protected Class_14963(Class_39208 class_39208, int n, int n2, int n3, int n4) {
        int n5;
        this.Field_14966 = class_39208;
        this.Field_14971 = n;
        this.Field_14968 = n2;
        this.Field_14965 = n3;
        this.Field_14972 = n4;
        this.Field_14967 = n - (-16367 & 4997) ^ -1 & -1;
        this.Field_14974 = this.Method_14986(10675 & 1580);
        for (n5 = 8512 & -25471; n5 < this.Field_14974.length; ++n5) {
            this.Field_14974[n5] = this.Method_15000(n);
        }
        this.Field_14977 = n3 - (4781 & 2075);
        this.Field_14970 = this.Method_14986(this.Field_14977);
        for (n5 = 4099 & 10500; n5 < this.Field_14970.length; ++n5) {
            this.Field_14970[n5] = this.Method_15000(n);
        }
        this.Field_14973 = new Class_36653(this, null, 13436 & -32538, -1 & Integer.MAX_VALUE);
        this.Field_14979 = new Class_36653(this, this.Field_14973, 4735 & 459, 356 & 9340);
        this.Field_14976 = new Class_36653(this, this.Field_14979, 7871 & -32462, 17260 & 13542);
        this.Field_14969 = new Class_36653(this, this.Field_14976, 17465 & 281, 9291 & 491);
        this.Field_14975 = new Class_36653(this, this.Field_14969, 393 & 3601, 2099 & 17718);
        this.Field_14964 = new Class_36653(this, this.Field_14975, -1069413686 & -2146664188, 24857 & 2141);
        this.Field_14973.Field_36657 = this.Field_14979;
        this.Field_14979.Field_36657 = this.Field_14976;
        this.Field_14976.Field_36657 = this.Field_14969;
        this.Field_14969.Field_36657 = this.Field_14975;
        this.Field_14975.Field_36657 = null;
        this.Field_14964.Field_36657 = this.Field_14964;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void Method_14992(Class_15420 class_15420, Class_43430 class_43430, int n) {
        int n2 = this.Method_15001(n);
        if (this.Method_14999(n2)) {
            int n3;
            Class_41815[] arrclass_41815;
            if (Class_14963.Method_14987(n2)) {
                if (class_15420.Method_15437(this, class_43430, n, n2)) {
                    return;
                }
                n3 = Class_14963.Method_14991(n2);
                arrclass_41815 = this.Field_14974;
            } else {
                if (class_15420.Method_15438(this, class_43430, n, n2)) {
                    return;
                }
                n3 = Class_14963.Method_14994(n2);
                arrclass_41815 = this.Field_14970;
            }
            Class_14963 class_14963 = this;
            synchronized (class_14963) {
                Class_41815 class_41815 = arrclass_41815[n3];
                Class_41815 class_418152 = class_41815.Field_41819;
                if (class_418152 != class_41815) {
                    if (!(Field_14978 || class_418152.Field_41824 && class_418152.Field_41822 == n2)) {
                        throw new AssertionError();
                    }
                    long l = class_418152.Method_41834();
                    if (!Field_14978 && l < (-7680680033784869040L & 7680680032121552896L)) {
                        throw new AssertionError();
                    }
                    class_418152.Field_41826.Method_8795(class_43430, l, n);
                    return;
                }
            }
        } else if (n2 <= this.Field_14972) {
            if (class_15420.Method_15448(this, class_43430, n, n2)) {
                return;
            }
        } else {
            this.Method_14997(class_43430, n);
            return;
        }
        this.Method_14981(class_43430, n, n2);
    }

    protected abstract Class_8772 Method_14993(int var1);

    static int Method_14994(int n) {
        int n2 = -30334 & 8;
        int n3 = n >>> (-26357 & 74);
        while (n3 != 0) {
            n3 >>>= 21769 & -32767;
            ++n2;
        }
        return n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void Method_14995(Class_8772 class_8772, long l, int n) {
        if (class_8772.Field_8784) {
            this.Method_14990(class_8772);
        } else {
            Class_15420 class_15420 = (Class_15420)this.Field_14966.Field_39225.get();
            if (class_15420.Method_15444(this, class_8772, l, n)) {
                return;
            }
            Class_14963 class_14963 = this;
            synchronized (class_14963) {
                class_8772.Field_8776.Method_36661(class_8772, l);
            }
        }
    }

    void Method_14996(Class_43430 class_43430, int n, boolean bl) {
        if (n < 0 || n > class_43430.maxCapacity()) {
            throw new IllegalArgumentException("newCapacity: " + n);
        }
        int n2 = class_43430.Field_43433;
        if (n2 == n) {
            return;
        }
        Class_8772 class_8772 = class_43430.Field_43436;
        long l = class_43430.Field_43439;
        Object object = class_43430.Field_43437;
        int n3 = class_43430.Field_43431;
        int n4 = class_43430.Field_43434;
        int n5 = class_43430.readerIndex();
        int n6 = class_43430.writerIndex();
        this.Method_14992((Class_15420)this.Field_14966.Field_39225.get(), class_43430, n);
        if (n > n2) {
            this.Method_14982(object, n3, class_43430.Field_43437, class_43430.Field_43431, n2);
        } else if (n < n2) {
            if (n5 < n) {
                if (n6 > n) {
                    n6 = n;
                }
                this.Method_14982(object, n3 + n5, class_43430.Field_43437, class_43430.Field_43431 + n5, n6 - n5);
            } else {
                n5 = n6 = n;
            }
        }
        class_43430.setIndex(n5, n6);
        if (bl) {
            this.Method_14995(class_8772, l, n4);
        }
    }

    private void Method_14997(Class_43430 class_43430, int n) {
        class_43430.Method_43440(this.Method_14993(n), n);
    }

    Class_43430 Method_14998(Class_15420 class_15420, int n, int n2) {
        Class_43430 class_43430 = this.Method_14983(n2);
        this.Method_14992(class_15420, class_43430, n);
        return class_43430;
    }

    boolean Method_14999(int n) {
        return ((n & this.Field_14967) == 0 ? 3345 & -28017 : 1536 & 14387) != 0;
    }

    private Class_41815 Method_15000(int n) {
        Class_41815 class_41815;
        class_41815.Field_41823 = class_41815 = new Class_41815(n);
        class_41815.Field_41819 = class_41815;
        return class_41815;
    }

    int Method_15001(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("capacity: " + n + " (expected: 0+)");
        }
        if (n >= this.Field_14972) {
            return n;
        }
        if (!Class_14963.Method_14987(n)) {
            int n2 = n;
            --n2;
            n2 |= n2 >>> (4901 & 3201);
            n2 |= n2 >>> (310 & 16459);
            n2 |= n2 >>> (548 & 19476);
            n2 |= n2 >>> (24 & -14324);
            n2 |= n2 >>> (1370 & -26448);
            if (++n2 < 0) {
                n2 >>>= 8193 & 227;
            }
            return n2;
        }
        if ((n & (-32753 & 607)) == 0) {
            return n;
        }
        return (n & (-16 & -11)) + (1136 & 14366);
    }
}

