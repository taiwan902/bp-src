/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ 
 *  \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ $ native private ` final ] 2 extends float ? boolean
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.FloatBuffer;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

public class Class_6176 {
    private final ReentrantLock Field_6177 = new ReentrantLock();
    public float Field_6178;
    private Class_4751[] Field_6179 = new Class_4751[Class_4595.Field_4600.length];
    private static Class_17531[] Field_6180 = Class_17531.Field_17536;
    private final Class_24997 Field_6181;
    public float Field_6182;
    public long Field_6183 = System.nanoTime();
    public long Field_6184;
    private Class_570 Field_6185;
    private Class_17531[] Field_6186 = new Class_17531[5185 & -29923];
    public int Field_6187;
    public float Field_6188;
    private Class_283 Field_6189;
    private Class_4751 Field_6190;
    private final Set Field_6191 = Sets.newHashSet();
    private Class_17594 Field_6192 = null;
    private int Field_6193 = -1 & -1;
    public Class_10997 Field_6194;
    public float Field_6195;
    public float Field_6196;
    public float Field_6197;
    public boolean Field_6198;
    private final ReentrantLock Field_6199 = new ReentrantLock();
    public float Field_6200;
    public int Field_6201;
    public float Field_6202;
    public boolean Field_6203;
    private final FloatBuffer Field_6204 = Class_11552.Method_11553(13328 & 16988);
    public static int Field_6205;
    private final Class_13574[] Field_6206 = new Class_13574[Class_17531.Field_17536.length];
    private final int Field_6207;
    public float Field_6208;
    public Class_26579 Field_6209 = Class_26579.Field_26582;
    private boolean Field_6210 = 1173 & 15105;

    private boolean Method_6211() {
        Class_6176 class_6176 = this;
        Class_570 class_570 = this.Field_6185;
        if (class_570 == null) {
            return (129 & -28123) != 0;
        }
        Class_17665 class_17665 = class_570.Method_587(class_6176.Field_6201, class_6176.Field_6187);
        if (class_17665.Method_17728()) {
            return (-30659 & 1153) != 0;
        }
        Class_17665 class_176652 = class_570.Method_587(class_6176.Field_6201 + (9921 & -28667), class_6176.Field_6187);
        if (class_176652.Method_17728()) {
            return (26213 & 4353) != 0;
        }
        class_176652 = class_570.Method_587(class_6176.Field_6201 - (769 & -5103), class_6176.Field_6187);
        if (class_176652.Method_17728()) {
            return (-14255 & 675) != 0;
        }
        class_176652 = class_570.Method_587(class_6176.Field_6201, class_6176.Field_6187 + (16385 & 8921));
        if (class_176652.Method_17728()) {
            return (12385 & 16389) != 0;
        }
        class_176652 = class_570.Method_587(class_6176.Field_6201, class_6176.Field_6187 - (9225 & 22695));
        if (class_176652.Method_17728()) {
            return (103 & 25345) != 0;
        }
        return (-32763 & 12354) != 0;
    }

    public void Method_6212() {
        Class_16867.Method_16982(this.Field_6204);
    }

    public Class_6176(Class_283 class_283, Class_24997 class_24997, Class_4751 class_4751, int n) {
        this.Field_6189 = class_283;
        this.Field_6185 = (Class_570)class_283;
        this.Field_6181 = class_24997;
        this.Field_6207 = n;
        if (!class_4751.equals(this.Method_6226())) {
            this.Method_6228(class_4751);
        }
        if (Class_32876.Method_32939()) {
            for (int i = 6688 & -24240; i < Class_17531.Field_17536.length; ++i) {
                this.Field_6206[i] = new Class_13574(Class_29585.Field_29597);
            }
        }
    }

    public boolean Method_6213(int n) {
        if (this.Field_6193 == n) {
            return (-28152 & 102) != 0;
        }
        this.Field_6193 = n;
        return (5441 & 24591) != 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Class_17594 Method_6214() {
        Class_17594 class_17594;
        this.Field_6199.lock();
        try {
            Class_17594 class_175942;
            if (this.Field_6192 != null && this.Field_6192.Method_17610() == Class_15815.Field_15817) {
                Class_17594 class_175943;
                Class_17594 class_175944 = class_175943 = null;
                return class_175944;
            }
            if (this.Field_6192 != null && this.Field_6192.Method_17610() != Class_15815.Field_15819) {
                this.Field_6192.Method_17603();
                this.Field_6192 = null;
            }
            this.Field_6192 = new Class_17594(this, Class_26332.Field_26334);
            this.Field_6192.Method_17606(this.Field_6209);
            class_17594 = class_175942 = this.Field_6192;
        }
        finally {
            this.Field_6199.unlock();
        }
        return class_17594;
    }

    public final boolean Method_6215() {
        return this.Field_6210;
    }

    public Class_17594 Method_6216() {
        Class_17594 class_17594;
        this.Method_6225();
        this.Field_6199.lock();
        try {
            this.Method_6220();
            class_17594 = this.Field_6192 = new Class_17594(this, Class_26332.Field_26335);
        }
        finally {
            this.Field_6199.unlock();
        }
        return class_17594;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_6217(Class_26579 class_26579) {
        this.Field_6177.lock();
        try {
            long l = System.nanoTime();
            if (this.Field_6209.Method_26587()) {
                this.Field_6183 = l;
            }
            this.Field_6184 = l;
            this.Field_6209 = class_26579;
        }
        finally {
            this.Field_6177.unlock();
        }
    }

    private void Method_6218() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_6219(float f, float f2, float f3, Class_17594 class_17594) {
        Class_26579 class_26579 = class_17594.Method_17615();
        if (class_26579.Method_26595() != null && !class_26579.Method_26597(Class_17531.Field_17537)) {
            Class_22385 class_22385 = class_17594.Method_17611().Method_9686(Class_17531.Field_17537);
            this.Method_6234(class_22385, this.Field_6190);
            class_22385.Method_22448(class_26579.Method_26595());
            this.Method_6227(Class_17531.Field_17537, f, f2, f3, class_22385, class_26579);
        }
    }

    protected void Method_6220() {
        this.Field_6199.lock();
        try {
            if (this.Field_6192 != null && this.Field_6192.Method_17610() != Class_15815.Field_15819) {
                this.Field_6192.Method_17603();
                this.Field_6192 = null;
            }
        }
        finally {
            this.Field_6199.unlock();
        }
    }

    public void Method_6221(boolean bl) {
        this.Field_6210 = bl;
        if (bl) {
            this.Method_6225();
        }
    }

    public void Method_6222() {
        this.Method_6232();
        this.Field_6189 = null;
        for (int i = 652 & -25247; i < Class_17531.Field_17533; ++i) {
            if (this.Field_6206[i] == null) continue;
            this.Field_6206[i].Method_13579();
        }
    }

    public ReentrantLock Method_6223() {
        return this.Field_6199;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_6224(float f, float f2, float f3, Class_17594 class_17594, Class_4810[] arrclass_4810) {
        Object object;
        Class_46187 class_46187;
        Object object2;
        Class_26579 class_26579 = new Class_26579();
        int n = 1 & -16347;
        Class_4751 class_4751 = this.Field_6190;
        Class_4751 class_47512 = class_4751.Method_4791(9167 & 4127, -32241 & 1039, 111 & 143);
        class_17594.Method_17609().lock();
        try {
            if (class_17594.Method_17610() != Class_15815.Field_15818) {
                return;
            }
            if (this.Field_6189 == null) {
                return;
            }
            class_46187 = new Class_46187(this.Field_6189, class_4751.Method_4791(-1 & -1, -1 & -1, -1 & -1), class_47512.Method_4791(17441 & -32447, -16295 & 1, 10563 & -31559), -15479 & 65, arrclass_4810);
            class_17594.Method_17606(class_26579);
        }
        finally {
            class_17594.Method_17609().unlock();
        }
        Class_11308 class_11308 = new Class_11308();
        HashSet hashSet = Sets.newHashSet();
        if (!class_46187.\u0000strictfp()) {
            \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ . native private ` final ] 2 extends float ? boolean  native private ` final ] 2 extends float ? boolean2;
            Field_6205 += 2107 & 18053;
            object = new boolean[Class_17531.Field_17536.length];
            object2 = Class_18.Field_89.Method_214();
            Iterator iterator = \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ . native private ` final ] 2 extends float ? boolean.\u0000= final((Class_4751)class_4751, (Class_4751)class_47512).iterator();
            boolean bl = Class_14610.Field_14613.Method_13570();
            boolean bl2 = Class_14610.Field_14621.Method_13570();
            while (iterator.hasNext()) {
                boolean bl3;
                Object object3;
                 native private ` final ] 2 extends float ? boolean2 = (\u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ . native private ` final ] 2 extends float ? boolean)iterator.next();
                Class_3436 class_3436 = class_46187.Method_46192((Class_4751) native private ` final ] 2 extends float ? boolean2);
                Class_3238 class_3238 = class_3436.Method_3442();
                if (class_3238.Method_3375()) {
                    class_11308.Method_11317((Class_4751) native private ` final ] 2 extends float ? boolean2);
                }
                if (bl) {
                    Object[] arrobject = new Object[13057 & 1107];
                    arrobject[3072 & 4096] = object2;
                    bl3 = Class_14610.Method_14674(iterator, Class_14610.Field_14613, arrobject);
                } else {
                    bl3 = class_3238.Method_3339();
                }
                if (bl3) {
                    object3 = class_46187.Method_46194(new Class_4751((Class_4792) native private ` final ] 2 extends float ? boolean2));
                    Class_11681 class_11681 = Class_26692.Field_26697.Method_26707((Class_4879)object3);
                    if (object3 != null && class_11681 != null) {
                        class_26579.Method_26593((Class_4879)object3);
                        if (class_11681.Method_11687()) {
                            hashSet.add(object3);
                        }
                    }
                }
                if (bl2) {
                    object3 = Field_6180;
                } else {
                    object3 = this.Field_6186;
                    object3[772 & -32654] = class_3238.Method_3286();
                }
                for (int i = -28528 & 10; i < ((Class_17531[])object3).length; ++i) {
                    int n2;
                    Class_17531 class_17531 = object3[i];
                    if (bl2) {
                        Object[] arrobject = new Object[13321 & 16677];
                        arrobject[115 & -32120] = class_17531;
                        n2 = Class_14610.Method_14674(class_3238, Class_14610.Field_14621, arrobject) ? 1 : 0;
                        if (n2 == 0) continue;
                    }
                    class_17531 = this.Method_6230(class_3238, class_17531);
                    n2 = class_17531.ordinal();
                    if (class_3238.Method_3316() == (-1 & -1)) continue;
                    Class_22385 class_22385 = class_17594.Method_17611().Method_9688(n2);
                    class_22385.Method_22430(class_17531);
                    if (!class_26579.Method_26598(class_17531)) {
                        class_26579.Method_26588(class_17531);
                        this.Method_6234(class_22385, class_4751);
                    }
                    Object object4 = object;
                    int n3 = n2;
                    object4[n3] = object4[n3] | ((Class_36704)object2).Method_36720(class_3436, (Class_4751) native private ` final ] 2 extends float ? boolean2, class_46187, class_22385, arrclass_4810);
                }
            }
             native private ` final ] 2 extends float ? boolean2 = Class_17531.Field_17536;
            int n4 = ((\u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ . native private ` final ] 2 extends float ? boolean) native private ` final ] 2 extends float ? boolean2).length;
            for (int i = 25412 & 0; i < n4; ++i) {
                \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ . native private ` final ] 2 extends float ? boolean  native private ` final ] 2 extends float ? boolean3 =  native private ` final ] 2 extends float ? boolean2[i];
                if (object[ native private ` final ] 2 extends float ? boolean3.ordinal()] != false) {
                    class_26579.Method_26596((Class_17531) native private ` final ] 2 extends float ? boolean3);
                }
                if (!class_26579.Method_26598((Class_17531) native private ` final ] 2 extends float ? boolean3)) continue;
                if (Class_19426.Method_19570()) {
                    Class_34286.Method_34301(class_17594.Method_17611().Method_9686((Class_17531) native private ` final ] 2 extends float ? boolean3));
                }
                this.Method_6227((Class_17531) native private ` final ] 2 extends float ? boolean3, f, f2, f3, class_17594.Method_17611().Method_9686((Class_17531) native private ` final ] 2 extends float ? boolean3), class_26579);
            }
        }
        class_26579.Method_26590(class_11308.Method_11320());
        this.Field_6199.lock();
        try {
            object = Sets.newHashSet((Iterable)hashSet);
            object2 = Sets.newHashSet((Iterable)this.Field_6191);
            ((AbstractSet)object).removeAll(this.Field_6191);
            ((AbstractSet)object2).removeAll(hashSet);
            this.Field_6191.clear();
            this.Field_6191.addAll(hashSet);
            this.Field_6181.Method_25097((Collection)object2, (Collection)object);
        }
        finally {
            this.Field_6199.unlock();
        }
    }

    public void Method_6225() {
        this.Method_6235();
        Class_6176 class_6176 = this.Field_6181.Method_25121(this, Class_4595.Field_4603);
        if (class_6176 != null) {
            class_6176.Method_6235();
        }
        if ((class_6176 = this.Field_6181.Method_25121(this, Class_4595.Field_4602)) != null) {
            class_6176.Method_6235();
        }
        if ((class_6176 = this.Field_6181.Method_25121(this, Class_4595.Field_4613)) != null) {
            class_6176.Method_6235();
        }
        if ((class_6176 = this.Field_6181.Method_25121(this, Class_4595.Field_4598)) != null) {
            class_6176.Method_6235();
        }
        if ((class_6176 = this.Field_6181.Method_25121(this, Class_4595.Field_4601)) != null) {
            class_6176.Method_6235();
        }
        if ((class_6176 = this.Field_6181.Method_25121(this, Class_4595.Field_4615)) != null) {
            class_6176.Method_6235();
        }
    }

    public final Class_4751 Method_6226() {
        return this.Field_6190;
    }

    private void Method_6227(Class_17531 class_17531, float f, float f2, float f3, Class_22385 class_22385, Class_26579 class_26579) {
        if (class_17531 == Class_17531.Field_17537 && !class_26579.Method_26597(class_17531)) {
            class_22385.Method_22429(f, f2, f3);
            class_26579.Method_26591(class_22385.Method_22426());
        }
        class_22385.Method_22419();
    }

    public void Method_6228(Class_4751 class_4751) {
        this.Method_6232();
        this.Field_6190 = class_4751;
        this.Method_6221((-29143 & 8193) != 0);
        this.Field_6201 = class_4751.\u0000= final() >> (1604 & -32636);
        this.Field_6187 = class_4751.\u0000strictfp() >> (28444 & -28537);
        this.Field_6194 = new Class_10997(class_4751, class_4751.Method_4791(536 & 2064, 25360 & 48, -20368 & 19608));
        this.Field_6208 = (float)this.Field_6194.Field_10999;
        this.Field_6178 = (float)this.Field_6194.Field_11000;
        this.Field_6195 = (float)this.Field_6194.Field_11001;
        this.Field_6202 = (float)this.Field_6194.Field_11002;
        this.Field_6182 = (float)this.Field_6194.Field_10998;
        this.Field_6196 = (float)this.Field_6194.Field_11003;
        this.Field_6200 = (this.Field_6208 + this.Field_6202) * (2.6666667f * 0.1875f);
        this.Field_6188 = (this.Field_6178 + this.Field_6182) * (3.1111112f * 0.16071428f);
        this.Field_6197 = (this.Field_6195 + this.Field_6196) * (0.33846155f * 1.4772727f);
        this.Method_6229();
        for (int i = 200 & -18944; i < this.Field_6179.length; ++i) {
            this.Field_6179[i] = null;
        }
    }

    private void Method_6229() {
        Class_16867.Method_16961();
        Class_16867.Method_16962();
        float f = 6.5000057f * 0.15384616f;
        Class_16867.Method_16943(-18.162163f * 0.44047618f, -14.4f * 0.5555556f, 37.0f * -0.21621622f);
        Class_16867.Method_16973(f, f, f);
        Class_16867.Method_16943(0.8181818f * 9.777778f, 6.344827f * 1.2608696f, 6.0487804f * 1.3225807f);
        Class_16867.Method_16917(11174 & -29778, this.Field_6204);
        Class_16867.Method_16945();
    }

    private Class_17531 Method_6230(Class_3238 class_3238, Class_17531 class_17531) {
        return class_17531 == Class_17531.Field_17538 ? (class_3238 instanceof Class_17176 ? class_17531 : (class_3238 instanceof Class_21807 ? class_17531 : Class_17531.Field_17539)) : class_17531;
    }

    public Class_13574 Method_6231(int n) {
        return this.Field_6206[n];
    }

    public void Method_6232() {
        this.Method_6220();
        this.Field_6209 = Class_26579.Field_26582;
    }

    public final Class_26579 Method_6233() {
        return this.Field_6209;
    }

    private void Method_6234(Class_22385 class_22385, Class_4751 class_4751) {
        class_22385.Method_22417(791 & 16615, Class_29585.Field_29597);
        class_22385.Method_22444(-class_4751.\u0000= final(), -class_4751.\u0000, `(), -class_4751.\u0000strictfp());
    }

    public void Method_6235() {
        this.Field_6203 = !this.Method_6211() ? 1089 & 14339 : 4224 & 16426;
    }

    public Class_4751 Method_6236(Class_4595 class_4595) {
        int n = class_4595.Method_4648();
        Class_4751 class_4751 = this.Field_6179[n];
        if (class_4751 == null) {
            this.Field_6179[n] = class_4751 = this.Method_6226().Method_4776(class_4595, 1392 & -26086);
        }
        return class_4751;
    }
}

