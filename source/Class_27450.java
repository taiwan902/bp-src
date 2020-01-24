/*
 * Decompiled with CFR 0.145.
 */
import java.io.Serializable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public class Class_27450
implements Serializable,
Cloneable {
    private transient Object[][] Field_27451;
    private transient long[][] Field_27452;
    private transient int Field_27453;
    private transient int Field_27454;

    private void Method_27455() {
        this.Field_27452 = new long[-25968 & 20557][];
        this.Field_27451 = new Object[12481 & -28158][];
    }

    private void Method_27456() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Set Method_27457() {
        return new Class_6804(this, null);
    }

    private long Method_27458(long l) {
        l ^= l >>> (7229 & 25121);
        l *= -49064778989728563L & -47358199199850545L;
        l ^= l >>> (8241 & 20969);
        l *= -1743181128450310573L & -2522086167608431533L;
        l ^= l >>> (-19423 & 97);
        return l;
    }

    public Object Method_27459() {
        Class_27450 class_27450 = (Class_27450)super.clone();
        class_27450.Method_27464();
        class_27450.Method_27455();
        Iterator iterator = this.Method_27457().iterator();
        while (iterator.hasNext()) {
            long l = (Long)iterator.next();
            Object object = this.Method_27465(l);
            class_27450.Method_27468(l, object);
        }
        return class_27450;
    }

    static int Method_27460(Class_27450 class_27450) {
        return class_27450.Field_27454;
    }

    public boolean Method_27461(long l) {
        return (this.Method_27465(l) != null ? 133 & 10305 : 20744 & -29647) != 0;
    }

    public int Method_27462() {
        return this.Field_27453;
    }

    static int Method_27463(Class_27450 class_27450) {
        return class_27450.Field_27453;
    }

    public Class_27450() {
        this.Method_27455();
    }

    public void Method_27464() {
        if (this.Field_27453 == 0) {
            return;
        }
        this.Field_27454 += 24801 & -30207;
        this.Field_27453 = 22689 & -32760;
        Arrays.fill((Object[])this.Field_27452, null);
        Arrays.fill((Object[])this.Field_27451, null);
    }

    public Object Method_27465(long l) {
        int n = (int)(this.Method_27458(l) & (-6647347311488921601L & 6647347311222517759L));
        long[] arrl = this.Field_27452[n];
        if (arrl == null) {
            return null;
        }
        for (int i = -13047 & 146; i < arrl.length; ++i) {
            long l2 = arrl[i];
            if (l2 == (-4565146305248084030L & -9223372036715806671L)) {
                return null;
            }
            if (l2 != l) continue;
            return this.Field_27451[n][i];
        }
        return null;
    }

    public Object Method_27466(long l) {
        int n = (int)(this.Method_27458(l) & (4823919620293464063L & 1141563391L));
        long[] arrl = this.Field_27452[n];
        if (arrl == null) {
            return null;
        }
        for (int i = 8780 & -28624; i < arrl.length && arrl[i] != (-9223372036853727231L & -9223372036661828608L); ++i) {
            if (arrl[i] != l) continue;
            Object object = this.Field_27451[n][i];
            ++i;
            while (i < arrl.length && arrl[i] != (-9223372036854247390L & -9223372036753833140L)) {
                arrl[i - (-23519 & 4755)] = arrl[i];
                this.Field_27451[n][i - (529 & 103)] = this.Field_27451[n][i];
                ++i;
            }
            arrl[i - (787 & 165)] = -9223372035781029280L & -4326333931721309164L;
            this.Field_27451[n][i - (-20717 & 33)] = null;
            this.Field_27453 -= -32439 & 2721;
            this.Field_27454 += 167 & 3841;
            return object;
        }
        return null;
    }

    static long[][] Method_27467(Class_27450 class_27450) {
        return class_27450.Field_27452;
    }

    public Object Method_27468(long l, Object object) {
        int n = (int)(this.Method_27458(l) & (-1145413178473558017L & 2146303L));
        long[] arrl = this.Field_27452[n];
        Object[] arrobject = this.Field_27451[n];
        this.Field_27454 += -30197 & 8289;
        if (arrl == null) {
            arrl = new long[-30696 & 589];
            this.Field_27452[n] = arrl;
            Arrays.fill(arrl, -7066322574203647408L & -9223372036850974459L);
            arrobject = new Object[6942 & 24584];
            this.Field_27451[n] = arrobject;
            arrl[8208 & 1280] = l;
            arrobject[16899 & 4168] = object;
            this.Field_27453 += 2601 & 16389;
        } else {
            int n2;
            for (n2 = -30684 & 1041; n2 < arrl.length; ++n2) {
                if (arrl[n2] == (-8736433308144956667L & -9223372036846369758L)) {
                    this.Field_27453 += 5249 & 8291;
                    arrl[n2] = l;
                    arrobject[n2] = object;
                    return null;
                }
                if (arrl[n2] != l) continue;
                Object object2 = arrobject[n2];
                arrl[n2] = l;
                arrobject[n2] = object;
                return object2;
            }
            arrl = Arrays.copyOf(arrl, n2 << (-16127 & 5661));
            this.Field_27452[n] = arrl;
            Arrays.fill(arrl, n2, arrl.length, -5470890427041341104L & -9223372036716230130L);
            arrobject = Arrays.copyOf(arrobject, n2 << (26755 & -31703));
            this.Field_27451[n] = arrobject;
            arrl[n2] = l;
            arrobject[n2] = object;
            this.Field_27453 += 643 & -24475;
        }
        return null;
    }

    static Object[][] Method_27469(Class_27450 class_27450) {
        return class_27450.Field_27451;
    }
}

