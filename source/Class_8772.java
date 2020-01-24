/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_8772 {
    private int Field_8773;
    private final Class_41815[] Field_8774;
    private final int Field_8775;
    Class_36653 Field_8776;
    static final boolean Field_8777 = !Class_8772.class.desiredAssertionStatus() ? 10245 & 1193 : 104 & 20611;
    final Object Field_8778;
    private final int Field_8779;
    private final int Field_8780;
    private final byte[] Field_8781;
    private final int Field_8782;
    private final byte[] Field_8783;
    final boolean Field_8784;
    Class_8772 Field_8785;
    private final int Field_8786;
    private final byte Field_8787;
    private final int Field_8788;
    final Class_14963 Field_8789;
    private final int Field_8790;
    Class_8772 Field_8791;

    private void Method_8792(int n) {
        while (n > (20929 & 2065)) {
            byte by;
            int n2 = n >>> (1293 & -3583);
            byte by2 = this.Method_8800(n);
            byte by3 = by2 < (by = this.Method_8800(n ^ 1059 & 157)) ? by2 : by;
            this.Method_8806(n2, by3);
            n = n2;
        }
    }

    private long Method_8793(int n) {
        int n2 = this.Field_8779 - (Class_8772.Method_8807(n) - this.Field_8782);
        int n3 = this.Method_8811(n2);
        if (n3 < 0) {
            return n3;
        }
        this.Field_8773 -= this.Method_8812(n3);
        return n3;
    }

    private int Method_8794(int n) {
        int n2 = n ^ (20993 & 7) << this.Method_8798(n);
        return n2 * this.Method_8812(n);
    }

    void Method_8795(Class_43430 class_43430, long l, int n) {
        this.Method_8809(class_43430, l, (int)(l >>> (96 & 12836)), n);
    }

    long Method_8796(int n) {
        if ((n & this.Field_8786) != 0) {
            return this.Method_8793(n);
        }
        return this.Method_8803(n);
    }

    private void Method_8797() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private byte Method_8798(int n) {
        return this.Field_8783[n];
    }

    void Method_8799(long l) {
        int n = (int)l;
        int n2 = (int)(l >>> (34 & 181));
        if (n2 != 0) {
            Class_41815 class_41815 = this.Field_8774[this.Method_8810(n)];
            if (!(Field_8777 || class_41815 != null && class_41815.Field_41824)) {
                throw new AssertionError();
            }
            if (class_41815.Method_41830(n2 & (1073741823 & -1))) {
                return;
            }
        }
        this.Field_8773 += this.Method_8812(n);
        this.Method_8806(n, this.Method_8798(n));
        this.Method_8801(n);
    }

    private byte Method_8800(int n) {
        return this.Field_8781[n];
    }

    private void Method_8801(int n) {
        int n2 = this.Method_8798(n) + (523 & -15263);
        while (n > (17409 & -27819)) {
            int n3 = n >>> (273 & 16391);
            byte by = this.Method_8800(n);
            byte by2 = this.Method_8800(n ^ -16125 & 11965);
            if (by == --n2 && by2 == n2) {
                this.Method_8806(n3, (byte)(n2 - (5253 & 24835)));
            } else {
                byte by3 = by < by2 ? by : by2;
                this.Method_8806(n3, by3);
            }
            n = n3;
        }
    }

    public String Method_8802() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Chunk(");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(": ");
        stringBuilder.append(this.Method_8804());
        stringBuilder.append("%, ");
        stringBuilder.append(this.Field_8788 - this.Field_8773);
        stringBuilder.append((char)(8751 & 6655));
        stringBuilder.append(this.Field_8788);
        stringBuilder.append((char)(-14807 & 361));
        return stringBuilder.toString();
    }

    private long Method_8803(int n) {
        int n2 = this.Field_8779;
        int n3 = this.Method_8811(n2);
        if (n3 < 0) {
            return n3;
        }
        Class_41815[] arrclass_41815 = this.Field_8774;
        int n4 = this.Field_8775;
        this.Field_8773 -= n4;
        int n5 = this.Method_8810(n3);
        Class_41815 class_41815 = arrclass_41815[n5];
        if (class_41815 == null) {
            arrclass_41815[n5] = class_41815 = new Class_41815(this, n3, this.Method_8794(n3), n4, n);
        } else {
            class_41815.Method_41841(n);
        }
        return class_41815.Method_41834();
    }

    int Method_8804() {
        int n = this.Field_8773;
        if (n == 0) {
            return 20588 & -30604;
        }
        int n2 = (int)((long)n * (1073840228L & 172504166L) / (long)this.Field_8788);
        if (n2 == 0) {
            return 14459 & 1123;
        }
        return (614 & -30611) - n2;
    }

    private Class_41815[] Method_8805(int n) {
        return new Class_41815[n];
    }

    Class_8772(Class_14963 class_14963, Object object, int n, int n2, int n3, int n4) {
        this.Field_8784 = 4160 & -31599;
        this.Field_8789 = class_14963;
        this.Field_8778 = object;
        this.Field_8775 = n;
        this.Field_8782 = n3;
        this.Field_8779 = n2;
        this.Field_8788 = n4;
        this.Field_8787 = (byte)(n2 + (9217 & 16521));
        this.Field_8790 = Class_8772.Method_8807(n4);
        this.Field_8786 = n - (-30175 & 24907) ^ -1 & -1;
        this.Field_8773 = n4;
        if (!Field_8777 && n2 >= (24638 & -30562)) {
            throw new AssertionError((Object)("maxOrder should be < 30, but is: " + n2));
        }
        this.Field_8780 = (4441 & -24537) << n2;
        this.Field_8781 = new byte[this.Field_8780 << (-15357 & 4633)];
        this.Field_8783 = new byte[this.Field_8781.length];
        int n5 = 1171 & 12557;
        for (int i = 2668 & -11264; i <= n2; ++i) {
            int n6 = (26627 & 4901) << i;
            for (int j = 4096 & -30208; j < n6; ++j) {
                this.Field_8781[n5] = (byte)i;
                this.Field_8783[n5] = (byte)i;
                ++n5;
            }
        }
        this.Field_8774 = this.Method_8805(this.Field_8780);
    }

    private void Method_8806(int n, byte by) {
        this.Field_8781[n] = by;
    }

    private static int Method_8807(int n) {
        return (95 & 3871) - Integer.numberOfLeadingZeros(n);
    }

    Class_8772(Class_14963 class_14963, Object object, int n) {
        this.Field_8784 = 18449 & 1635;
        this.Field_8789 = class_14963;
        this.Field_8778 = object;
        this.Field_8781 = null;
        this.Field_8783 = null;
        this.Field_8774 = null;
        this.Field_8786 = 9216 & 18753;
        this.Field_8775 = 16932 & 11264;
        this.Field_8782 = -27392 & 8193;
        this.Field_8779 = -31488 & 31270;
        this.Field_8787 = (byte)(this.Field_8779 + (1173 & 11));
        this.Field_8788 = n;
        this.Field_8790 = Class_8772.Method_8807(this.Field_8788);
        this.Field_8780 = 16904 & 32;
    }

    void Method_8808(Class_43430 class_43430, long l, int n) {
        int n2 = (int)l;
        int n3 = (int)(l >>> (-31888 & 163));
        if (n3 == 0) {
            byte by = this.Method_8800(n2);
            if (!Field_8777 && by != this.Field_8787) {
                throw new AssertionError((Object)String.valueOf(by));
            }
            class_43430.Method_43446(this, l, this.Method_8794(n2), n, this.Method_8812(n2));
        } else {
            this.Method_8809(class_43430, l, n3, n);
        }
    }

    private void Method_8809(Class_43430 class_43430, long l, int n, int n2) {
        if (!Field_8777 && n == 0) {
            throw new AssertionError();
        }
        int n3 = (int)l;
        Class_41815 class_41815 = this.Field_8774[this.Method_8810(n3)];
        if (!Field_8777 && !class_41815.Field_41824) {
            throw new AssertionError();
        }
        if (!Field_8777 && n2 > class_41815.Field_41822) {
            throw new AssertionError();
        }
        class_43430.Method_43446(this, l, this.Method_8794(n3) + (n & (1073741823 & 1073741823)) * class_41815.Field_41822, n2, class_41815.Field_41822);
    }

    private int Method_8810(int n) {
        return n ^ this.Field_8780;
    }

    private int Method_8811(int n) {
        int n2 = 325 & -18431;
        int n3 = -((4153 & 8385) << n);
        byte by = this.Method_8800(n2);
        if (by > n) {
            return -1 & -1;
        }
        while (by < n || (n2 & n3) == 0) {
            by = this.Method_8800(n2 <<= -16333 & 449);
            if (by <= n) continue;
            by = this.Method_8800(n2 ^= -32159 & 5395);
        }
        byte by2 = this.Method_8800(n2);
        if (!(Field_8777 || by2 == n && (n2 & n3) == (1433 & 18439) << n)) {
            Object[] arrobject = new Object[-4061 & 2075];
            arrobject[16514 & -28380] = by2;
            arrobject[261 & 5729] = n2 & n3;
            arrobject[2083 & 222] = n;
            throw new AssertionError((Object)String.format("val = %d, id & initial = %d, d = %d", arrobject));
        }
        this.Method_8806(n2, this.Field_8787);
        this.Method_8792(n2);
        return n2;
    }

    private int Method_8812(int n) {
        return (3809 & -12263) << this.Field_8790 - this.Method_8798(n);
    }
}

