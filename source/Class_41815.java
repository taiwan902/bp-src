/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_41815 {
    private int Field_41816;
    private int Field_41817;
    private final int Field_41818;
    Class_41815 Field_41819;
    private final long[] Field_41820;
    private final int Field_41821;
    int Field_41822;
    Class_41815 Field_41823;
    boolean Field_41824;
    private final int Field_41825;
    final Class_8772 Field_41826;
    private int Field_41827;
    private int Field_41828;
    static final boolean Field_41829 = !Class_41815.class.desiredAssertionStatus() ? -13863 & 4131 : 0 & -6122;

    boolean Method_41830(int n) {
        if (this.Field_41822 == 0) {
            return (16907 & 1237) != 0;
        }
        int n2 = n >>> (3126 & -32762);
        int n3 = n & (-32705 & 6399);
        if (!Field_41829 && (this.Field_41820[n2] >>> n3 & (6626756967153273869L & 517157377L)) == (7500393767481024576L & 277874996L)) {
            throw new AssertionError();
        }
        long[] arrl = this.Field_41820;
        int n4 = n2;
        arrl[n4] = arrl[n4] ^ (-124465169382046205L & 124465168993231233L) << n3;
        this.Method_41835(n);
        int n5 = this.Field_41827;
        this.Field_41827 = n5 + (-32255 & 1313);
        if (n5 == 0) {
            this.Method_41836();
            return (2049 & 225) != 0;
        }
        if (this.Field_41827 != this.Field_41816) {
            return (-16095 & 527) != 0;
        }
        if (this.Field_41823 == this.Field_41819) {
            return (-32703 & 8337) != 0;
        }
        this.Field_41824 = 20756 & 3649;
        this.Method_41837();
        return (259 & 9344) != 0;
    }

    Class_41815(Class_8772 class_8772, int n, int n2, int n3, int n4) {
        this.Field_41826 = class_8772;
        this.Field_41825 = n;
        this.Field_41818 = n2;
        this.Field_41821 = n3;
        this.Field_41820 = new long[n3 >>> (13322 & 155)];
        this.Method_41841(n4);
    }

    private int Method_41831(int n, long l) {
        int n2 = this.Field_41816;
        int n3 = n << (4102 & 27551);
        for (int i = 4104 & 19732; i < (848 & -14139); ++i) {
            if ((l & (-2866465574483916671L & 43143281L)) == (8348696967084788608L & 1074102286L)) {
                int n4 = n3 | i;
                if (n4 >= n2) break;
                return n4;
            }
            l >>>= 6209 & 17287;
        }
        return -1 & -1;
    }

    private int Method_41832() {
        long[] arrl = this.Field_41820;
        int n = this.Field_41828;
        for (int i = 36 & -29488; i < n; ++i) {
            long l = arrl[i];
            if ((l ^ -1L & -1L) == (134221861L & 871467458L)) continue;
            return this.Method_41831(i, l);
        }
        return -1 & -1;
    }

    Class_41815(int n) {
        this.Field_41826 = null;
        this.Field_41825 = -1 & -1;
        this.Field_41818 = -1 & -1;
        this.Field_41822 = -1 & -1;
        this.Field_41821 = n;
        this.Field_41820 = null;
    }

    private int Method_41833() {
        int n = this.Field_41817;
        if (n >= 0) {
            this.Field_41817 = -1 & -1;
            return n;
        }
        return this.Method_41832();
    }

    long Method_41834() {
        if (this.Field_41822 == 0) {
            return this.Method_41838(1537 & -32320);
        }
        if (this.Field_41827 == 0 || !this.Field_41824) {
            return -1L & -1L;
        }
        int n = this.Method_41833();
        int n2 = n >>> (25118 & 1478);
        int n3 = n & (21567 & 703);
        if (!Field_41829 && (this.Field_41820[n2] >>> n3 & (1223279177L & 8501L)) != (1093439488L & 469762837L)) {
            throw new AssertionError();
        }
        long[] arrl = this.Field_41820;
        int n4 = n2;
        arrl[n4] = arrl[n4] | (543293505L & 285249835L) << n3;
        if ((this.Field_41827 -= 6465 & 9783) == 0) {
            this.Method_41837();
        }
        return this.Method_41838(n);
    }

    private void Method_41835(int n) {
        this.Field_41817 = n;
    }

    private void Method_41836() {
        Class_41815 class_41815 = this.Field_41826.Field_8789.Method_14985(this.Field_41822);
        if (!(Field_41829 || this.Field_41823 == null && this.Field_41819 == null)) {
            throw new AssertionError();
        }
        this.Field_41823 = class_41815;
        this.Field_41819 = class_41815.Field_41819;
        this.Field_41819.Field_41823 = this;
        class_41815.Field_41819 = this;
    }

    private void Method_41837() {
        if (!(Field_41829 || this.Field_41823 != null && this.Field_41819 != null)) {
            throw new AssertionError();
        }
        this.Field_41823.Field_41819 = this.Field_41819;
        this.Field_41819.Field_41823 = this.Field_41823;
        this.Field_41819 = null;
        this.Field_41823 = null;
    }

    private long Method_41838(int n) {
        return 4611686019782281240L & 4611686019098584610L | (long)n << (16678 & -22472) | (long)this.Field_41825;
    }

    public String Method_41839() {
        if (!this.Field_41824) {
            return "(" + this.Field_41825 + ": not in use)";
        }
        return String.valueOf((char)(44 & 938)) + this.Field_41825 + ": " + (this.Field_41816 - this.Field_41827) + (char)(-32721 & 11567) + this.Field_41816 + ", offset: " + this.Field_41818 + ", length: " + this.Field_41821 + ", elemSize: " + this.Field_41822 + (char)(8553 & 16555);
    }

    private void Method_41840() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    void Method_41841(int n) {
        this.Field_41824 = -29151 & 397;
        this.Field_41822 = n;
        if (n != 0) {
            this.Field_41816 = this.Field_41827 = this.Field_41821 / n;
            this.Field_41817 = -30616 & 24577;
            this.Field_41828 = this.Field_41816 >>> (4742 & 18487);
            if ((this.Field_41816 & (-21441 & 16703)) != 0) {
                this.Field_41828 += -10231 & 9221;
            }
            for (int i = -24568 & 21252; i < this.Field_41828; ++i) {
                this.Field_41820[i] = 549920L & 587632729L;
            }
        }
        this.Method_41836();
    }
}

