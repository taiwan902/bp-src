/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.minecraft.util.Vec3;

public abstract class Class_283
implements Class_561 {
    public final Class_18343 Field_284;
    protected boolean Field_285;
    protected boolean Field_286 = 9257 & -11581;
    private boolean Field_287;
    private static Vec3 Field_288;
    protected boolean Field_289 = 53 & -30591;
    protected Class_44898 Field_290 = new Class_44898(19586 & 1028);
    protected float Field_291;
    public static Class_4452 Field_292;
    protected float Field_293;
    protected Class_31717 Field_294;
    private final ArrayList Field_295 = Lists.newArrayList();
    private final ArrayList Field_296 = Lists.newArrayList();
    private final Calendar Field_297 = Calendar.getInstance();
    public final ArrayList Field_298 = Lists.newArrayList();
    public static Class_36606 Field_299;
    protected Class_35273 Field_300;
    protected Class_20976 Field_301 = new Class_20976();
    protected int[] Field_302 = new int[338735873 & 12746896];
    private static Class_4452 Field_303;
    private final Class_31457 Field_304;
    public final ArrayList Field_305 = Lists.newArrayList();
    public final boolean Field_306;
    public final Random Field_307 = new Random();
    private int Field_308;
    protected final Class_26655 Field_309;
    public final Class_2767 Field_310;
    public final ArrayList Field_311 = Lists.newArrayList();
    protected float Field_312;
    private int Field_313 = this.Field_307.nextInt(28384 & -16648);
    protected float Field_314;
    public final ArrayList Field_315 = Lists.newArrayList();
    private long Field_316 = 335544319L & 6466421953816166399L;
    protected boolean Field_317;
    protected final int Field_318 = 1030681439 & -1132530721;
    protected int Field_319;
    protected Class_12166 Field_320;
    protected int Field_321 = new Random().nextInt();
    protected final ArrayList Field_322 = Lists.newArrayList();
    public final ExecutorService Field_323 = new ThreadPoolExecutor(25473 & -28669, 33 & 601, 1147455359L & 6804240116929865916L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
    protected Class_41901 Field_324;
    public final ArrayList Field_325 = Lists.newArrayList();
    public boolean Field_326 = 20563 & 10017;
    protected List Field_327 = Lists.newArrayList();
    private int Field_328 = 1599 & 4351;
    protected final Class_29437 Field_329 = new Class_29437();

    public int Method_330() {
        return this.Field_319;
    }

    public boolean Method_331(Class_4751 class_4751, boolean bl) {
        return (!this.Method_390(class_4751) ? 16489 & -32496 : this.Method_428(class_4751.\u0000= final() >> (4645 & 16404), class_4751.\u0000strictfp() >> (517 & -12186), bl)) != 0;
    }

    public float Method_332(float f) {
        return this.Field_312 + (this.Field_293 - this.Field_312) * f;
    }

    public boolean Method_333(boolean bl) {
        return (8425 & -16110) != 0;
    }

    public boolean Method_334(Class_31457 class_31457, Class_1061 class_1061) {
        double d = class_31457.Method_31473();
        double d2 = class_31457.Method_31474();
        double d3 = class_31457.Method_31489();
        double d4 = class_31457.Method_31491();
        if (class_1061.Method_1168()) {
            d += 1.0;
            d2 += 1.0;
            d3 -= 1.0;
            d4 -= 1.0;
        } else {
            d -= 1.0;
            d2 -= 1.0;
            d3 += 1.0;
            d4 += 1.0;
        }
        return (class_1061.Field_1130 > d && class_1061.Field_1130 < d3 && class_1061.Field_1106 > d2 && class_1061.Field_1106 < d4 ? 24645 & -27639 : 16518 & 776) != 0;
    }

    public boolean Method_335(Class_626 class_626, Class_4751 class_4751) {
        return (1287 & -19959) != 0;
    }

    public boolean Method_336(Class_4751 class_4751) {
        Class_17281 class_17281 = this.Method_547(class_4751);
        return class_17281.Method_17426();
    }

    protected void Method_337(int n, int n2, Class_17665 class_17665) {
        this.Field_310.Method_2783("moodSound");
        if (this.Field_313 == 0 && !this.Field_306) {
            Class_626 class_626;
            this.Field_321 = this.Field_321 * (20739 & 2291) + (-1133578401 & 1031730015);
            int n3 = this.Field_321 >> (6178 & -8054);
            int n4 = n3 & (207 & -2017);
            int n5 = n3 >> (-31462 & 520) & (3119 & 4111);
            int n6 = n3 >> (2260 & -22728) & (1023 & 20735);
            Class_4751 class_4751 = new Class_4751(n4, n6, n5);
            Class_3238 class_3238 = class_17665.Method_17775(class_4751);
            if (class_3238.Method_3373() == Class_3713.Field_3718 && this.Method_381(class_4751) <= this.Field_307.nextInt(3080 & -24355) && this.Method_443(Class_6778.Field_6781, class_4751) <= 0 && (class_626 = this.Method_491((double)(n4 += n) + 2.0555555555555554 * 0.24324324324324326, (double)n6 + 0.7575757575757576 * 0.66, (double)(n5 += n2) + 0.15476190476190477 * 3.230769230769231, 7.58974358974359 * 1.054054054054054)) != null && class_626.\u0000strictfp((double)n4 + 0.21875 * 2.2857142857142856, (double)n6 + 2.6285714285714286 * 0.19021739130434784, (double)n5 + 0.03723404255319149 * 13.428571428571429) > 2.6 * 1.5384615384615383) {
                this.Method_475((double)n4 + 0.17857142857142858 * 2.8, (double)n6 + 0.971830985915493 * 0.5144927536231884, (double)n5 + 0.024096385542168676 * 20.75, "ambient.cave.cave", 1.0982758f * 0.63736266f, 0.4923077f * 1.625f + this.Field_307.nextFloat() * (1.24f * 0.16129032f));
                this.Field_313 = this.Field_307.nextInt(12008 & 28390) + (-24708 & 30576);
            }
        }
        this.Field_310.Method_2783("checkLight");
        class_17665.Method_17746();
    }

    public void Method_338(Class_2638 class_2638) {
        this.Field_327.remove(class_2638);
    }

    protected int Method_339(Class_4751 class_4751, Class_6778 class_6778) {
        if (class_6778 == Class_6778.Field_6781 && this.Method_398(class_4751)) {
            return 4239 & 10335;
        }
        Class_3238 class_3238 = this.Method_375(class_4751).Method_3442();
        int n = class_6778 == Class_6778.Field_6781 ? 2048 & 8529 : class_3238.Method_3355();
        int n2 = class_3238.Method_3384();
        if (n2 >= (5263 & 24655) && class_3238.Method_3355() > 0) {
            n2 = 2207 & -3071;
        }
        if (n2 < (4097 & -24541)) {
            n2 = 19985 & 329;
        }
        if (n2 >= (575 & 19471)) {
            return 16960 & -31728;
        }
        if (n >= (2350 & 29726)) {
            return n;
        }
        Class_4595[] arrclass_4595 = Class_4595.Method_4630();
        int n3 = arrclass_4595.length;
        for (int i = 5572 & -13784; i < n3; ++i) {
            Class_4595 class_4595 = arrclass_4595[i];
            Class_4751 class_47512 = class_4751.Method_4765(class_4595);
            int n4 = this.Method_443(class_6778, class_47512) - n2;
            if (n4 > n) {
                n = n4;
            }
            if (n < (19727 & 8238)) continue;
            return n;
        }
        return n;
    }

    public List Method_340(Class_17665 class_17665, boolean bl) {
        return null;
    }

    public void Method_341(Class_1061 class_1061) {
        int n = Class_13337.Method_13371(class_1061.Field_1130 / (0.32558139534883723 * 49.14285714285714));
        int n2 = Class_13337.Method_13371(class_1061.Field_1106 / (10.114942528735632 * 1.5818181818181818));
        int n3 = -24573 & 21070;
        for (int i = n - n3; i <= n + n3; ++i) {
            for (int j = n2 - n3; j <= n2 + n3; ++j) {
                this.Method_346(i, j);
            }
        }
        if (!this.Field_305.contains(class_1061)) {
            this.Field_305.add(class_1061);
        }
    }

    public void Method_342(Class_4751 class_4751, Class_3238 class_3238, int n, int n2) {
    }

    public Class_1061 Method_343(int n) {
        return (Class_1061)this.Field_329.Method_29447(n);
    }

    static {
        Field_299 = new Class_36606();
        Field_292 = new Class_4452();
        Field_303 = new Class_4452();
        Field_288 = new Vec3(0.0, 0.0, 0.0);
    }

    public Class_17665 Method_344(int n, int n2) {
        return this.Method_346(n >> (8327 & -26332), n2 >> (-31419 & 20));
    }

    public void Method_345(Class_4751 class_4751, Class_4879 class_4879) {
        if (this.Method_368(class_4751)) {
            this.Method_385(class_4751).Method_17776();
        }
    }

    public Class_17665 Method_346(int n, int n2) {
        return this.Field_320.Method_12174(n, n2);
    }

    public boolean Method_347() {
        return (this.Field_319 < (-21810 & 5) ? 269 & 145 : 16384 & 129) != 0;
    }

    public void Method_348() {
    }

    public float Method_349(float f) {
        return (this.Field_314 + (this.Field_291 - this.Field_314) * f) * this.Method_332(f);
    }

    public boolean Method_350(Class_1061 class_1061) {
        int n = Class_13337.Method_13371(class_1061.Field_1130 / (0.68 * 23.52941176470588));
        int n2 = Class_13337.Method_13371(class_1061.Field_1106 / (8.615384615384615 * 1.8571428571428572));
        int n3 = class_1061.Field_1114;
        if (class_1061 instanceof Class_626) {
            n3 = 1671 & 2369;
        }
        if (n3 == 0 && !this.Method_428(n, n2, (-29503 & 16435) != 0)) {
            return (10496 & 80) != 0;
        }
        if (class_1061 instanceof Class_626) {
            Class_626 class_626 = (Class_626)class_1061;
            this.Field_325.add(class_626);
            this.Method_534();
        }
        this.Method_346(n, n2).Method_17703(class_1061);
        this.Field_305.add(class_1061);
        this.Method_468(class_1061);
        return (1027 & -15919) != 0;
    }

    public boolean Method_351(Class_626 class_626, Class_4751 class_4751, Class_4595 class_4595) {
        if (this.Method_375(class_4751 = class_4751.Method_4765(class_4595)).Method_3442() == Class_9265.Field_9342) {
            this.Method_358(class_626, -23570 & 3068, class_4751, -20413 & 544);
            this.Method_472(class_4751);
            return (18449 & -27893) != 0;
        }
        return (4224 & 3079) != 0;
    }

    public float Method_352(float f) {
        float f2 = this.Method_447(f);
        float f3 = 1.0f - (Class_13337.Method_13350(f2 * (1.1710526f * 2.6827085f) * 2.0f) * 2.0f + 0.5f * 0.5f);
        f3 = Class_13337.Method_13360(f3, 0.0f, 1.0f);
        return f3 * f3 * (0.56f * 0.89285713f);
    }

    public boolean Method_353(Class_4751 class_4751) {
        int n;
        boolean bl = 16386 & -19403;
        if (!this.Field_284.Method_18370()) {
            n = this instanceof Class_570 ? ((Class_570)this).Method_603(Class_6778.Field_6781, class_4751) : this.Method_532(Class_6778.Field_6781, class_4751);
            bl |= n;
        }
        n = this instanceof Class_570 ? ((Class_570)this).Method_603(Class_6778.Field_6780, class_4751) : this.Method_532(Class_6778.Field_6780, class_4751);
        return bl |= n;
    }

    public void Method_354(Class_40274 class_40274, boolean bl, double d, double d2, double d3, double d4, double d5, double d6, int ... arrn) {
        this.Method_463(class_40274.Method_40336(), class_40274.Method_40339() | bl, d, d2, d3, d4, d5, d6, arrn);
    }

    public int Method_355(Class_4751 class_4751, Class_4595 class_4595) {
        Class_3436 class_3436 = this.Method_375(class_4751);
        Class_3238 class_3238 = class_3436.Method_3442();
        return class_3238.Method_3400() ? this.Method_366(class_4751) : class_3238.Method_3297(this, class_4751, class_3436, class_4595);
    }

    public void Method_356(Class_3238 class_3238, Class_4751 class_4751, Random random) {
        this.Field_317 = 16417 & 12801;
        class_3238.Method_3413(this, class_4751, this.Method_375(class_4751), random);
        this.Field_317 = -24575 & 16400;
    }

    public Class_20976 Method_357() {
        return this.Field_301;
    }

    public void Method_358(Class_626 class_626, int n, Class_4751 class_4751, int n2) {
        try {
            for (int i = -15967 & 4104; i < this.Field_327.size(); ++i) {
                ((Class_2638)this.Field_327.get(i)).Method_2644(class_626, n, class_4751, n2);
            }
        }
        catch (Throwable throwable) {
            Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Playing level event");
            Class_13220 class_13220 = class_13268.Method_13280("Level event being played");
            class_13220.Method_13231("Block coordinates", Class_13220.Method_13237(class_4751));
            class_13220.Method_13231("Event source", class_626);
            class_13220.Method_13231("Event type", n);
            class_13220.Method_13231("Event data", n2);
            throw new Class_1809(class_13268);
        }
    }

    public boolean Method_359(Class_1061 class_1061) {
        this.Field_298.add(class_1061);
        return (18497 & -23271) != 0;
    }

    public int Method_360(Class_4751 class_4751, Class_4595 class_4595) {
        Class_3436 class_3436 = this.Method_375(class_4751);
        return class_3436.Method_3442().Method_3313(this, class_4751, class_3436, class_4595);
    }

    public Class_4751 Method_361(Class_4751 class_4751) {
        return this.Method_385(class_4751).Method_17751(class_4751);
    }

    public int Method_362(Class class_) {
        int n = 1288 & 21058;
        for (Class_1061 class_1061 : this.Field_305) {
            if (class_1061 instanceof Class_34093 && ((Class_34093)class_1061).Method_34124() || !class_.isAssignableFrom(class_1061.getClass())) continue;
            ++n;
        }
        return n;
    }

    public long Method_363() {
        return this.Field_294.Method_31812();
    }

    public Class_33888 Method_364(Class_4751 class_4751) {
        long l = -6800296007443676800L & 570727448L;
        float f = 0.0f;
        if (this.Method_368(class_4751)) {
            f = this.Method_516();
            l = this.Method_385(class_4751).Method_17700();
        }
        return new Class_33888(this.Method_487(), this.Method_511(), l, f);
    }

    public boolean Method_365(Class_4751 class_4751, Class_4751 class_47512) {
        return this.Method_370(class_4751, class_47512, (-27643 & 1) != 0);
    }

    public int Method_366(Class_4751 class_4751) {
        int n = -31230 & 16;
        if ((n = Math.max(n, this.Method_360(class_4751.Method_4782(), Class_4595.Field_4615))) >= (15 & 143)) {
            return n;
        }
        if ((n = Math.max(n, this.Method_360(class_4751.Method_4769(), Class_4595.Field_4601))) >= (-32177 & 3471)) {
            return n;
        }
        if ((n = Math.max(n, this.Method_360(class_4751.Method_4778(), Class_4595.Field_4598))) >= (-20081 & 2079)) {
            return n;
        }
        if ((n = Math.max(n, this.Method_360(class_4751.Method_4784(), Class_4595.Field_4613))) >= (17375 & 1071)) {
            return n;
        }
        if ((n = Math.max(n, this.Method_360(class_4751.Method_4771(), Class_4595.Field_4602))) >= (3087 & 95)) {
            return n;
        }
        return (n = Math.max(n, this.Method_360(class_4751.Method_4770(), Class_4595.Field_4603))) >= (-15281 & 10271) ? n : n;
    }

    public void Method_367(boolean bl, boolean bl2) {
        this.Field_289 = bl;
        this.Field_286 = bl2;
    }

    public boolean Method_368(Class_4751 class_4751) {
        return this.Method_331(class_4751, (18437 & 9729) != 0);
    }

    public void Method_369(int n, Class_4751 class_4751, int n2) {
        for (int i = -30442 & 25600; i < this.Field_327.size(); ++i) {
            Class_2638 class_2638 = (Class_2638)this.Field_327.get(i);
            class_2638.Method_2647(n, class_4751, n2);
        }
    }

    public boolean Method_370(Class_4751 class_4751, Class_4751 class_47512, boolean bl) {
        return this.Method_512(class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp(), class_47512.\u0000= final(), class_47512.\u0000, `(), class_47512.\u0000strictfp(), bl);
    }

    public Class_31916 Method_371() {
        return this.Field_284.Method_18376();
    }

    public Class_4751 Method_372() {
        Class_4751 class_4751 = new Class_4751(this.Field_294.Method_31787(), this.Field_294.Method_31838(), this.Field_294.Method_31763());
        if (!this.Method_523().Method_31498(class_4751)) {
            class_4751 = this.Method_549(new Class_4751(this.Method_523().Method_31500(), 0.0, this.Method_523().Method_31495()));
        }
        return class_4751;
    }

    public void Method_373() {
        this.Method_438();
    }

    public boolean Method_374(Class_10997 class_10997) {
        return this.Method_542(class_10997, null);
    }

    public Class_3436 Method_375(Class_4751 class_4751) {
        return this.Method_413(class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp());
    }

    public double Method_376() {
        return this.Field_294.Method_31833() == Class_43755.Field_43769 ? 0.0 : 2.0789473684210527 * 30.30379746835443;
    }

    public int Method_377(float f) {
        float f2 = this.Method_447(f);
        float f3 = 1.0f - (Class_13337.Method_13350(f2 * (0.7761582f * 4.047619f) * 2.0f) * 2.0f + 1.875f * 0.26666668f);
        f3 = Class_13337.Method_13360(f3, 0.0f, 1.0f);
        f3 = 1.0f - f3;
        f3 = (float)((double)f3 * (1.0 - (double)(this.Method_332(f) * (4.866667f * 1.0273973f)) / (22.0 * 0.7272727272727273)));
        f3 = (float)((double)f3 * (1.0 - (double)(this.Method_349(f) * (0.78431374f * 6.375f)) / (3.9047619047619047 * 4.097560975609756)));
        f3 = 1.0f - f3;
        return (int)(f3 * (1.7111111f * 6.4285717f));
    }

    public int Method_378() {
        return this.Field_328;
    }

    public void Method_379() {
        int n;
        Object object;
        reference var2_5;
        Object object222;
        this.Field_310.Method_2789("entities");
        this.Field_310.Method_2789("global");
        for (int i = 8192 & 16456; i < this.Field_298.size(); ++i) {
            var2_5 = (Class_1061)this.Field_298.get(i);
            try {
                var2_5.Field_1084 += 37 & 4369;
                var2_5.Method_1181();
            }
            catch (Throwable object222) {
                object = Class_13268.Method_13285((Throwable)object222, "Ticking entity");
                Class_13220 class_13220 = ((Class_13268)object).Method_13280("Entity being ticked");
                if (var2_5 == null) {
                    class_13220.Method_13231("Entity", "~~NULL~~");
                } else {
                    var2_5.Method_1284(class_13220);
                }
                throw new Class_1809((Class_13268)object);
            }
            if (!var2_5.Field_1110) continue;
            this.Field_298.remove(i--);
        }
        this.Field_310.Method_2783("remove");
        HashSet hashSet = Sets.newHashSet((Iterable)this.Field_322);
        for (int i = 6144 & 352; i < this.Field_305.size(); ++i) {
            Class_1061 class_1061 = (Class_1061)this.Field_305.get(i);
            if (!hashSet.contains(class_1061)) continue;
            Class_1061 class_10612 = (Class_1061)this.Field_305.get(this.Field_305.size() - (9537 & 2561));
            this.Field_305.set(i, class_10612);
            this.Field_305.remove(this.Field_305.size() - (-9135 & 165));
            --i;
        }
        for (n = 33 & 17490; n < this.Field_322.size(); ++n) {
            Class_1061 class_1061 = (Class_1061)this.Field_322.get(n);
            int n2 = class_1061.Field_1147;
            int n3 = class_1061.Field_1090;
            if (!class_1061.Field_1077 || !this.Method_428(n2, n3, (-2079 & 7) != 0)) continue;
            this.Method_346(n2, n3).Method_17717(class_1061);
        }
        for (n = 11777 & 4240; n < this.Field_322.size(); ++n) {
            this.Method_543((Class_1061)this.Field_322.get(n));
        }
        this.Field_322.clear();
        this.Field_310.Method_2783("regular");
        for (n = 29216 & -32438; n < this.Field_305.size(); ++n) {
            Class_1061 class_1061 = (Class_1061)this.Field_305.get(n);
            if (class_1061.Field_1095 != null) {
                if (!class_1061.Field_1095.Field_1110 && class_1061.Field_1095.Field_1099 == class_1061) continue;
                class_1061.Field_1095.Field_1099 = null;
                class_1061.Field_1095 = null;
            }
            this.Field_310.Method_2789("tick");
            if (!class_1061.Field_1110) {
                try {
                    this.Method_439(class_1061);
                }
                catch (Throwable throwable) {
                    object = Class_13268.Method_13285(throwable, "Ticking entity");
                    Class_13220 class_13220 = ((Class_13268)object).Method_13280("Entity being ticked");
                    class_1061.Method_1284(class_13220);
                    throw new Class_1809((Class_13268)object);
                }
            }
            this.Field_310.Method_2790();
            this.Field_310.Method_2789("remove");
            if (class_1061.Field_1110) {
                int n4 = class_1061.Field_1147;
                int n5 = class_1061.Field_1090;
                if (class_1061.Field_1077 && this.Method_428(n4, n5, (2179 & 21) != 0)) {
                    this.Method_346(n4, n5).Method_17717(class_1061);
                }
                this.Field_305.remove(n--);
                this.Method_543(class_1061);
            }
            this.Field_310.Method_2790();
        }
        this.Field_310.Method_2783("blockEntities");
        this.Field_287 = 8199 & -15871;
        Iterator iterator = this.Field_311.iterator();
        while (iterator.hasNext()) {
            Class_4879 class_4879 = (Class_4879)iterator.next();
            if (!class_4879.Method_4905() && class_4879.Method_4920() && this.Method_368((Class_4751)(object222 = class_4879.Method_4903())) && this.Field_304.Method_31498((Class_4751)object222)) {
                try {
                    ((Class_5591)((Object)class_4879)).Method_5592();
                }
                catch (Throwable throwable) {
                    Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Ticking block entity");
                    Class_13220 class_13220 = class_13268.Method_13280("Block entity being ticked");
                    class_4879.Method_4932(class_13220);
                    throw new Class_1809(class_13268);
                }
            }
            if (!class_4879.Method_4905()) continue;
            iterator.remove();
            this.Field_315.remove(class_4879);
            if (!this.Method_368(class_4879.Method_4903())) continue;
            this.Method_385(class_4879.Method_4903()).Method_17714(class_4879.Method_4903());
        }
        this.Field_287 = 18564 & 8227;
        if (!this.Field_296.isEmpty()) {
            Class_4879 class_4879;
            int n6;
            HashSet hashSet2 = Sets.newHashSet((Iterable)this.Field_296);
            for (n6 = 8602 & 577; n6 < this.Field_311.size(); ++n6) {
                object = (Class_4879)this.Field_311.get(n6);
                if (!hashSet2.contains(object)) continue;
                class_4879 = (Class_4879)this.Field_311.get(this.Field_311.size() - (9217 & 16405));
                this.Field_311.set(n6, class_4879);
                this.Field_311.remove(this.Field_311.size() - (21377 & 10265));
                --n6;
            }
            for (n6 = 2 & 19496; n6 < this.Field_315.size(); ++n6) {
                object = (Class_4879)this.Field_315.get(n6);
                if (!hashSet2.contains(object)) continue;
                class_4879 = (Class_4879)this.Field_315.get(this.Field_315.size() - (16385 & 1377));
                this.Field_315.set(n6, class_4879);
                this.Field_315.remove(this.Field_315.size() - (775 & -3935));
                --n6;
            }
            this.Field_296.clear();
        }
        this.Field_310.Method_2783("pendingBlockEntities");
        if (!this.Field_295.isEmpty()) {
            for (var2_5 = (reference)(-16302 & 4652); var2_5 < this.Field_295.size(); ++var2_5) {
                Class_4879 class_4879 = (Class_4879)this.Field_295.get((int)var2_5);
                if (class_4879.Method_4905()) continue;
                if (!this.Field_315.contains(class_4879)) {
                    this.Method_531(class_4879);
                }
                if (this.Method_368(class_4879.Method_4903())) {
                    this.Method_385(class_4879.Method_4903()).Method_17736(class_4879.Method_4903(), class_4879);
                }
                this.Method_416(class_4879.Method_4903());
            }
            this.Field_295.clear();
        }
        this.Field_310.Method_2790();
        this.Field_310.Method_2790();
    }

    public String Method_380() {
        return "All: " + this.Field_305.size();
    }

    public int Method_381(Class_4751 class_4751) {
        if (class_4751.\u0000, `() < 0) {
            return 2048 & -23510;
        }
        if (class_4751.\u0000, `() >= (17680 & -32446)) {
            class_4751 = new Class_4751(class_4751.\u0000= final(), 6399 & 8447, class_4751.\u0000strictfp());
        }
        return this.Method_385(class_4751).Method_17741(class_4751, 36 & -11136);
    }

    public boolean Method_382(Class_10997 class_10997, Class_3713 class_3713, Class_1061 class_1061) {
        int n;
        int n2 = Class_13337.Method_13371(class_10997.Field_10999);
        int n3 = Class_13337.Method_13371(class_10997.Field_11002 + 1.0);
        int n4 = Class_13337.Method_13371(class_10997.Field_11000);
        int n5 = Class_13337.Method_13371(class_10997.Field_10998 + 1.0);
        int n6 = Class_13337.Method_13371(class_10997.Field_11001);
        if (!this.Method_512(n2, n4, n6, n3, n5, n = Class_13337.Method_13371(class_10997.Field_11003 + 1.0), (20483 & 293) != 0)) {
            return (-24576 & 513) != 0;
        }
        int n7 = 5184 & -7903;
        Vec3 vec3 = Field_288;
        Class_4810 class_4810 = (Class_4810)Field_303.get();
        for (int i = n2; i < n3; ++i) {
            for (int j = n4; j < n5; ++j) {
                for (int k = n6; k < n; ++k) {
                    double d;
                    class_4810.Method_4814(i, j, k);
                    Class_3677 class_3677 = this.\u0000strictfp((Class_4751)class_4810);
                    Class_3238 class_3238 = class_3677.Method_3688();
                    if (class_3238.Method_3373() != class_3713 || !((double)n5 >= (d = (double)((float)(j + (517 & -16319)) - Class_4415.Method_4426((Integer)class_3677.Method_3691(Class_4415.Field_4417)))))) continue;
                    n7 = -32735 & 2131;
                    vec3 = class_3238.Method_3376(this, class_4810, class_1061, vec3);
                }
            }
        }
        if (vec3.\u0000strictfp() > 0.0 && class_1061.Method_1231()) {
            vec3 = vec3.\u0000strictfp();
            double d = 0.896 * 0.015625;
            class_1061.Field_1071 += vec3.\u0000= final * d;
            class_1061.Method_1161(class_1061.Method_1224() + vec3.\u0000strictfp * d);
            class_1061.Field_1072 += vec3.\u0000, ` * d;
        }
        return n7 != 0;
    }

    public boolean Method_383(double d, double d2, double d3) {
        return this.Method_490(Class_13337.Method_13371(d), Class_13337.Method_13371(d2), Class_13337.Method_13371(d3));
    }

    public boolean Method_384(Class_4751 class_4751) {
        if (class_4751.\u0000, `() >= this.Method_378()) {
            return this.Method_398(class_4751);
        }
        Class_4751 class_47512 = new Class_4751(class_4751.\u0000= final(), this.Method_378(), class_4751.\u0000strictfp());
        if (!this.Method_398(class_47512)) {
            return (0 & -29472) != 0;
        }
        class_47512 = class_47512.Method_4782();
        while (class_47512.\u0000, `() > class_4751.\u0000, `()) {
            Class_3238 class_3238 = this.Method_375(class_47512).Method_3442();
            if (class_3238.Method_3384() > 0 && !class_3238.Method_3373().Method_3758()) {
                return (1028 & -3840) != 0;
            }
            class_47512 = class_47512.Method_4782();
        }
        return (1097 & -30427) != 0;
    }

    public Class_17665 Method_385(Class_4751 class_4751) {
        return this.Method_346(class_4751.\u0000= final() >> (-15540 & 11398), class_4751.\u0000strictfp() >> (25924 & -30188));
    }

    public Class_31717 Method_386() {
        return this.Field_294;
    }

    public int Method_387(Class_6778 class_6778, int n, int n2, int n3) {
        if (n2 < 0) {
            n2 = -30656 & 13972;
        }
        if (!this.Method_445(n, n2, n3)) {
            return class_6778.Field_6779;
        }
        if (!this.Method_490(n, n2, n3)) {
            return class_6778.Field_6779;
        }
        Class_17665 class_17665 = this.Method_344(n, n3);
        return class_17665.Method_17727(class_6778, n, n2, n3);
    }

    public boolean Method_388(Class_4751 class_4751, boolean bl) {
        if (!this.Method_390(class_4751)) {
            return bl;
        }
        Class_17665 class_17665 = this.Field_320.Method_12171(class_4751);
        if (class_17665.Method_17728()) {
            return bl;
        }
        Class_3238 class_3238 = this.Method_375(class_4751).Method_3442();
        return (class_3238.Method_3373().Method_3769() && class_3238.Method_3319() ? 17445 & 8219 : 10240 & 1156) != 0;
    }

    public int Method_389() {
        return this.Field_284.Method_18370() ? 27271 & -31248 : 32032 & 832;
    }

    private boolean Method_390(Class_4751 class_4751) {
        return (class_4751.\u0000, `() >= 0 && class_4751.\u0000, `() < (17281 & 4448) && class_4751.\u0000= final() >= (-8962416 & -21594976) && class_4751.\u0000strictfp() >= (-29999948 & -13189182) && class_4751.\u0000= final() < (567002026 & -1714822256) && class_4751.\u0000strictfp() < (-2083658876 & 164355968) ? -29693 & 4593 : 0 & 23552) != 0;
    }

    public void Method_391(int n) {
        this.Field_319 = n;
    }

    public long Method_392() {
        return this.Field_294.Method_31827();
    }

    protected abstract int Method_393();

    public Class_43755 Method_394() {
        return this.Field_294.Method_31833();
    }

    public List Method_395(Class class_, Class_10997 class_10997, Predicate predicate) {
        int n = Class_13337.Method_13371((class_10997.Field_10999 - 0.2702702702702703 * 7.3999999999999995) / (75.42857142857143 * 0.21212121212121213));
        int n2 = Class_13337.Method_13371((class_10997.Field_11002 + 0.7362637362637363 * 2.716417910447761) / (0.13414634146341464 * 119.27272727272727));
        int n3 = Class_13337.Method_13371((class_10997.Field_11001 - 1.037037037037037 * 1.9285714285714286) / (23.34426229508197 * 0.6853932584269663));
        int n4 = Class_13337.Method_13371((class_10997.Field_11003 + 2.2399999999999998 * 0.8928571428571429) / (17.454545454545457 * 0.9166666666666666));
        ArrayList arrayList = Lists.newArrayList();
        for (int i = n; i <= n2; ++i) {
            for (int j = n3; j <= n4; ++j) {
                if (!this.Method_428(i, j, (22189 & -24319) != 0)) continue;
                this.Method_346(i, j).Method_17699(class_, class_10997, arrayList, predicate);
            }
        }
        return arrayList;
    }

    public void Method_396(int n) {
        this.Field_328 = n;
    }

    public float Method_397(Class_4751 class_4751) {
        return this.Field_284.Method_18375()[this.Method_451(class_4751)];
    }

    public boolean Method_398(Class_4751 class_4751) {
        return this.Method_385(class_4751).Method_17721(class_4751);
    }

    public List Method_399(Class_10997 class_10997) {
        ArrayList arrayList = Lists.newArrayList();
        int n = Class_13337.Method_13371(class_10997.Field_10999);
        int n2 = Class_13337.Method_13371(class_10997.Field_11002 + 1.0);
        int n3 = Class_13337.Method_13371(class_10997.Field_11000);
        int n4 = Class_13337.Method_13371(class_10997.Field_10998 + 1.0);
        int n5 = Class_13337.Method_13371(class_10997.Field_11001);
        int n6 = Class_13337.Method_13371(class_10997.Field_11003 + 1.0);
        Class_4810 class_4810 = new Class_4810();
        for (int i = n; i < n2; ++i) {
            for (int j = n5; j < n6; ++j) {
                if (!this.Method_368(class_4810.Method_4814(i, -32192 & 17616, j))) continue;
                for (int k = n3 - (16659 & 7177); k < n4; ++k) {
                    class_4810.Method_4814(i, k, j);
                    Class_3436 class_3436 = i >= (-8504192 & -29983569) && i < (298577828 & 568972168) && j >= (-29901689 & -4834112) && j < (63560580 & 1375462280) ? this.Method_375(class_4810) : Class_9265.Field_9414.Method_3293();
                    class_3436.Method_3442().Method_3423(this, class_4810, class_3436, class_10997, arrayList, null);
                }
            }
        }
        return arrayList;
    }

    public Calendar Method_400() {
        if (this.Method_363() % (67703386L & 3236897677516212984L) == (76021786L & 442680160L)) {
            this.Field_297.setTimeInMillis(Class_2457.Method_2513());
        }
        return this.Field_297;
    }

    public boolean Method_401(Class_4751 class_4751) {
        return this.Method_432(class_4751, (-31629 & 16385) != 0);
    }

    public void Method_402() {
        this.Method_517(new Class_4751(-32755 & 8280, 12622 & -31007, 2137 & 5388));
    }

    public Class_283 Method_403() {
        return this;
    }

    public int Method_404(Class_4751 class_4751, int n) {
        return this.Method_521(class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp(), n);
    }

    public Class_37110 Method_405(Vec3 vec3, Vec3 vec32, boolean bl, boolean bl2, boolean bl3) {
        if (!(Double.isNaN(vec3.\u0000= final) || Double.isNaN(vec3.\u0000strictfp) || Double.isNaN(vec3.\u0000, `))) {
            if (!(Double.isNaN(vec32.\u0000= final) || Double.isNaN(vec32.\u0000strictfp) || Double.isNaN(vec32.\u0000, `))) {
                Class_37110 class_37110;
                int n = Class_13337.Method_13371(vec32.\u0000= final);
                int n2 = Class_13337.Method_13371(vec32.\u0000strictfp);
                int n3 = Class_13337.Method_13371(vec32.\u0000, `);
                int n4 = Class_13337.Method_13371(vec3.\u0000= final);
                int n5 = Class_13337.Method_13371(vec3.\u0000strictfp);
                int n6 = Class_13337.Method_13371(vec3.\u0000, `);
                Class_4751 class_4751 = new Class_4751(n4, n5, n6);
                Class_3677 class_3677 = this.\u0000strictfp(class_4751);
                Class_3238 class_3238 = class_3677.Method_3688();
                if ((!bl2 || class_3238.Method_3285(this, class_4751, class_3677) != null) && class_3238.Method_3354(class_3677, bl) && (class_37110 = class_3238.Method_3372(this, class_4751, vec3, vec32)) != null) {
                    return class_37110;
                }
                class_37110 = null;
                int n7 = 16872 & -32051;
                while (n7-- >= 0) {
                    Class_4595 class_4595;
                    if (Double.isNaN(vec3.\u0000= final) || Double.isNaN(vec3.\u0000strictfp) || Double.isNaN(vec3.\u0000, `)) {
                        return null;
                    }
                    if (n4 == n && n5 == n2 && n6 == n3) {
                        return bl3 ? class_37110 : null;
                    }
                    int n8 = 515 & 2113;
                    int n9 = -11901 & 97;
                    int n10 = 8193 & 18615;
                    double d = 4.588235294117647 * 217.73076923076925;
                    double d2 = 0.4444444444444444 * 2247.75;
                    double d3 = 245.90769230769232 * 4.0625;
                    if (n > n4) {
                        d = (double)n4 + 1.0;
                    } else if (n < n4) {
                        d = (double)n4 + 0.0;
                    } else {
                        n8 = -22960 & 34;
                    }
                    if (n2 > n5) {
                        d2 = (double)n5 + 1.0;
                    } else if (n2 < n5) {
                        d2 = (double)n5 + 0.0;
                    } else {
                        n9 = -14256 & 4865;
                    }
                    if (n3 > n6) {
                        d3 = (double)n6 + 1.0;
                    } else if (n3 < n6) {
                        d3 = (double)n6 + 0.0;
                    } else {
                        n10 = 8704 & 98;
                    }
                    double d4 = 0.8842105263157894 * 1129.8214285714287;
                    double d5 = 1887.0 * 0.5294117647058824;
                    double d6 = 119.28358208955224 * 8.375;
                    double d7 = vec32.\u0000= final - vec3.\u0000= final;
                    double d8 = vec32.\u0000strictfp - vec3.\u0000strictfp;
                    double d9 = vec32.\u0000, ` - vec3.\u0000, `;
                    if (n8 != 0) {
                        d4 = (d - vec3.\u0000= final) / d7;
                    }
                    if (n9 != 0) {
                        d5 = (d2 - vec3.\u0000strictfp) / d8;
                    }
                    if (n10 != 0) {
                        d6 = (d3 - vec3.\u0000, `) / d9;
                    }
                    if (d4 == -0.0 * 0.3559322033898305) {
                        d4 = -0.0015400000000000001 * 0.06493506493506493;
                    }
                    if (d5 == 0.30864197530864196 * -0.0) {
                        d5 = -8.860759493670886E-6 * 11.285714285714286;
                    }
                    if (d6 == -0.0 * 0.9666666666666667) {
                        d6 = -9.411764705882353E-5 * 1.0625;
                    }
                    if (d4 < d5 && d4 < d6) {
                        class_4595 = n > n4 ? Class_4595.Field_4602 : Class_4595.Field_4603;
                        vec3 = new Vec3(d, vec3.\u0000strictfp + d8 * d4, vec3.\u0000, ` + d9 * d4);
                    } else if (d5 < d6) {
                        class_4595 = n2 > n5 ? Class_4595.Field_4615 : Class_4595.Field_4601;
                        vec3 = new Vec3(vec3.\u0000= final + d7 * d5, d2, vec3.\u0000, ` + d9 * d5);
                    } else {
                        class_4595 = n3 > n6 ? Class_4595.Field_4598 : Class_4595.Field_4613;
                        vec3 = new Vec3(vec3.\u0000= final + d7 * d6, vec3.\u0000strictfp + d8 * d6, d3);
                    }
                    n4 = Class_13337.Method_13371(vec3.\u0000= final) - (class_4595 == Class_4595.Field_4603 ? 16407 & 8769 : 5233 & 8970);
                    n5 = Class_13337.Method_13371(vec3.\u0000strictfp) - (class_4595 == Class_4595.Field_4601 ? 2953 & -23467 : -24408 & 272);
                    n6 = Class_13337.Method_13371(vec3.\u0000, `) - (class_4595 == Class_4595.Field_4613 ? -32491 & 4771 : 16437 & 2176);
                    class_4751 = new Class_4751(n4, n5, n6);
                    Class_3677 class_36772 = this.\u0000strictfp(class_4751);
                    Class_3238 class_32382 = class_36772.Method_3688();
                    if (bl2 && class_32382.Method_3285(this, class_4751, class_36772) == null) continue;
                    if (class_32382.Method_3354(class_36772, bl)) {
                        Class_37110 class_371102 = class_32382.Method_3372(this, class_4751, vec3, vec32);
                        if (class_371102 == null) continue;
                        return class_371102;
                    }
                    class_37110 = new Class_37110(Class_7192.Field_7194, vec3, class_4595, class_4751);
                }
                return bl3 ? class_37110 : null;
            }
            return null;
        }
        return null;
    }

    public Class_4751 Method_406(Class_4751 class_4751) {
        Class_4751 class_47512;
        Class_3713 class_3713;
        Class_17665 class_17665 = this.Method_385(class_4751);
        Class_4751 class_47513 = new Class_4751(class_4751.\u0000= final(), class_17665.Method_17762() + (5296 & 8720), class_4751.\u0000strictfp());
        while (!(class_47513.\u0000, `() < 0 || (class_3713 = class_17665.Method_17775(class_47512 = class_47513.Method_4782()).Method_3373()).Method_3761() && class_3713 != Class_3713.Field_3729)) {
            class_47513 = class_47512;
        }
        return class_47513;
    }

    public void Method_407(Class_40274 class_40274, double d, double d2, double d3, double d4, double d5, double d6, int ... arrn) {
        this.Method_463(class_40274.Method_40336(), class_40274.Method_40339(), d, d2, d3, d4, d5, d6, arrn);
    }

    public void Method_408(int n) {
        this.Field_308 = n;
    }

    public void Method_409(Class_4751 class_4751, Class_4879 class_4879) {
        if (class_4879 != null && !class_4879.Method_4905()) {
            if (this.Field_287) {
                class_4879.Method_4901(class_4751);
                Iterator<E> iterator = this.Field_295.iterator();
                while (iterator.hasNext()) {
                    Class_4879 class_48792 = (Class_4879)iterator.next();
                    if (!class_48792.Method_4903().equals(class_4751)) continue;
                    class_48792.Method_4912();
                    iterator.remove();
                }
                this.Field_295.add(class_4879);
            } else {
                this.Method_531(class_4879);
                this.Method_385(class_4751).Method_17736(class_4751, class_4879);
            }
        }
    }

    public Vec3 Method_410(float f) {
        float f2;
        float f3;
        float f4 = this.Method_447(f);
        float f5 = Class_13337.Method_13350(f4 * (1.7636364f * 1.7813154f) * 2.0f) * 2.0f + 0.36f * 1.3888888f;
        f5 = Class_13337.Method_13360(f5, 0.0f, 1.0f);
        float f6 = (float)(this.Field_316 >> (14618 & -32239) & (554696959L & 1077945599L)) / (77.41071f * 3.2941177f);
        float f7 = (float)(this.Field_316 >> (137 & -32712) & (2621695L & 738264319L)) / (363.6111f * 0.7012987f);
        float f8 = (float)(this.Field_316 & (3542733981781610751L & 704718079L)) / (2.5405405f * 100.372345f);
        float f9 = this.Method_332(f);
        if (f9 > 0.0f) {
            f3 = (f6 * (1.5882353f * 0.1888889f) + f7 * (2.478f * 0.23809524f) + f8 * (0.95f * 0.11578947f)) * (0.5487805f * 1.0933334f);
            f2 = 1.0f - f9 * (0.4636905f * 2.0487804f);
            f6 = f6 * f2 + f3 * (1.0f - f2);
            f7 = f7 * f2 + f3 * (1.0f - f2);
            f8 = f8 * f2 + f3 * (1.0f - f2);
        }
        f6 *= f5 * (0.6229508f * 1.4447368f) + 0.077922076f * 1.2833334f;
        f7 *= f5 * (0.5368421f * 1.6764705f) + 0.17169811f * 0.5824176f;
        f8 *= f5 * (1.40625f * 0.60444444f) + 0.058474578f * 2.5652175f;
        f3 = this.Method_349(f);
        if (f3 > 0.0f) {
            f2 = (f6 * (0.23333335f * 1.2857143f) + f7 * (0.091309525f * 6.4615383f) + f8 * (0.19344826f * 0.5686275f)) * (0.21587302f * 0.9264706f);
            float f10 = 1.0f - f3 * (0.03015873f * 31.5f);
            f6 = f6 * f10 + f2 * (1.0f - f10);
            f7 = f7 * f10 + f2 * (1.0f - f10);
            f8 = f8 * f10 + f2 * (1.0f - f10);
        }
        return new Vec3(f6, f7, f8);
    }

    public void Method_411(Class_2638 class_2638) {
        this.Field_327.add(class_2638);
    }

    public void Method_412(float f) {
        this.Field_314 = f;
        this.Field_291 = f;
    }

    public Class_3436 Method_413(int n, int n2, int n3) {
        if (!this.Method_445(n, n2, n3)) {
            return Class_9265.Field_9351.Method_3293();
        }
        Class_17665 class_17665 = this.Method_344(n, n3);
        return class_17665.Method_17726(n, n2, n3);
    }

    public boolean Method_414(Class_4751 class_4751) {
        return (this.Method_355(class_4751.Method_4782(), Class_4595.Field_4615) > 0 ? -27903 & 16507 : (this.Method_355(class_4751.Method_4769(), Class_4595.Field_4601) > 0 ? 18765 & 9217 : (this.Method_355(class_4751.Method_4778(), Class_4595.Field_4598) > 0 ? 129 & 16387 : (this.Method_355(class_4751.Method_4784(), Class_4595.Field_4613) > 0 ? -32751 & 1315 : (this.Method_355(class_4751.Method_4771(), Class_4595.Field_4602) > 0 ? 11283 & -27839 : (this.Method_355(class_4751.Method_4770(), Class_4595.Field_4603) > 0 ? 11265 & 197 : 8224 & 4608)))))) != 0;
    }

    public boolean Method_415(Class_10997 class_10997) {
        int n;
        int n2 = Class_13337.Method_13371(class_10997.Field_10999);
        int n3 = Class_13337.Method_13371(class_10997.Field_11002 + 1.0);
        int n4 = Class_13337.Method_13371(class_10997.Field_11000);
        int n5 = Class_13337.Method_13371(class_10997.Field_10998 + 1.0);
        int n6 = Class_13337.Method_13371(class_10997.Field_11001);
        if (this.Method_512(n2, n4, n6, n3, n5, n = Class_13337.Method_13371(class_10997.Field_11003 + 1.0), (4109 & 2067) != 0)) {
            Class_4810 class_4810 = new Class_4810();
            for (int i = n2; i < n3; ++i) {
                for (int j = n4; j < n5; ++j) {
                    for (int k = n6; k < n; ++k) {
                        Class_3238 class_3238 = this.Method_375(class_4810.Method_4814(i, j, k)).Method_3442();
                        if (class_3238 != Class_9265.Field_9342 && class_3238 != Class_9265.Field_9403 && class_3238 != Class_9265.Field_9358) continue;
                        return (26645 & 425) != 0;
                    }
                }
            }
        }
        return (-10044 & 8193) != 0;
    }

    public void Method_416(Class_4751 class_4751) {
        for (int i = 16864 & -32248; i < this.Field_327.size(); ++i) {
            ((Class_2638)this.Field_327.get(i)).Method_2639(class_4751);
        }
    }

    public Class_1061 Method_417(Class class_, Class_10997 class_10997, Class_1061 class_1061) {
        List list = this.Method_488(class_, class_10997);
        Class_1061 class_10612 = null;
        double d = 6.067214330160316E307 * 2.962962962962963;
        for (int i = -32426 & 2601; i < list.size(); ++i) {
            double d2;
            Class_1061 class_10613 = (Class_1061)list.get(i);
            if (class_10613 == class_1061 || !Class_28857.Field_28860.apply((Object)class_10613) || !((d2 = class_1061.Method_1356(class_10613)) <= d)) continue;
            class_10612 = class_10613;
            d = d2;
        }
        return class_10612;
    }

    public void Method_418(Class_1061 class_1061, boolean bl) {
        int n = Class_13337.Method_13371(class_1061.Field_1130);
        int n2 = Class_13337.Method_13371(class_1061.Field_1106);
        int n3 = 16434 & 1569;
        if (!bl || this.Method_512(n - n3, 14480 & 1028, n2 - n3, n + n3, -28672 & 357, n2 + n3, (19 & 1) != 0)) {
            class_1061.Field_1126 = class_1061.Field_1130;
            class_1061.Field_1102 = class_1061.Method_1324();
            class_1061.Field_1125 = class_1061.Field_1106;
            class_1061.Field_1145 = class_1061.Field_1079;
            class_1061.Field_1078 = class_1061.Field_1093;
            if (bl && class_1061.Field_1077) {
                class_1061.Field_1084 += -30717 & 673;
                if (class_1061.Field_1095 != null) {
                    class_1061.Method_1274();
                } else {
                    class_1061.Method_1181();
                }
            }
            this.Field_310.Method_2789("chunkCheck");
            if (Double.isNaN(class_1061.Field_1130) || Double.isInfinite(class_1061.Field_1130)) {
                class_1061.Field_1130 = class_1061.Field_1126;
            }
            if (Double.isNaN(class_1061.Method_1324()) || Double.isInfinite(class_1061.Method_1324())) {
                class_1061.Method_1241(class_1061.Field_1102);
            }
            if (Double.isNaN(class_1061.Field_1106) || Double.isInfinite(class_1061.Field_1106)) {
                class_1061.Field_1106 = class_1061.Field_1125;
            }
            if (Double.isNaN(class_1061.Field_1093) || Double.isInfinite(class_1061.Field_1093)) {
                class_1061.Field_1093 = class_1061.Field_1078;
            }
            if (Double.isNaN(class_1061.Field_1079) || Double.isInfinite(class_1061.Field_1079)) {
                class_1061.Field_1079 = class_1061.Field_1145;
            }
            int n4 = Class_13337.Method_13371(class_1061.Field_1130 / (0.525 * 30.476190476190474));
            int n5 = Class_13337.Method_13371(class_1061.Method_1324() / (624.0 * 0.02564102564102564));
            int n6 = Class_13337.Method_13371(class_1061.Field_1106 / (0.7528089887640449 * 21.253731343283583));
            if (!class_1061.Field_1077 || class_1061.Field_1147 != n4 || class_1061.Field_1088 != n5 || class_1061.Field_1090 != n6) {
                if (class_1061.Field_1077 && this.Method_428(class_1061.Field_1147, class_1061.Field_1090, (8961 & 18443) != 0)) {
                    this.Method_346(class_1061.Field_1147, class_1061.Field_1090).Method_17694(class_1061, class_1061.Field_1088);
                }
                if (this.Method_428(n4, n6, (5157 & 259) != 0)) {
                    class_1061.Field_1077 = 3105 & 4353;
                    this.Method_346(n4, n6).Method_17703(class_1061);
                } else {
                    class_1061.Field_1077 = 17065 & 1300;
                }
            }
            this.Field_310.Method_2790();
            if (bl && class_1061.Field_1077 && class_1061.Field_1099 != null) {
                if (!class_1061.Field_1099.Field_1110 && class_1061.Field_1099.Field_1095 == class_1061) {
                    this.Method_439(class_1061.Field_1099);
                } else {
                    class_1061.Field_1099.Field_1095 = null;
                    class_1061.Field_1099 = null;
                }
            }
        }
    }

    public float Method_419(Vec3 vec3, Class_10997 class_10997) {
        double d = 1.0 / ((class_10997.Field_11002 - class_10997.Field_10999) * (0.5925925925925926 * 3.375) + 1.0);
        double d2 = 1.0 / ((class_10997.Field_10998 - class_10997.Field_11000) * (0.5833333333333334 * 3.4285714285714284) + 1.0);
        double d3 = 1.0 / ((class_10997.Field_11003 - class_10997.Field_11001) * (0.28205128205128205 * 7.090909090909091) + 1.0);
        double d4 = (1.0 - Math.floor(1.0 / d) * d) / (11.818181818181818 * 0.16923076923076924);
        double d5 = (1.0 - Math.floor(1.0 / d3) * d3) / (0.9 * 2.2222222222222223);
        if (d >= 0.0 && d2 >= 0.0 && d3 >= 0.0) {
            int n = 17760 & -24548;
            int n2 = 32 & 2049;
            float f = 0.0f;
            while (f <= 1.0f) {
                float f2 = 0.0f;
                while (f2 <= 1.0f) {
                    float f3 = 0.0f;
                    while (f3 <= 1.0f) {
                        double d6 = class_10997.Field_10999 + (class_10997.Field_11002 - class_10997.Field_10999) * (double)f;
                        double d7 = class_10997.Field_11000 + (class_10997.Field_10998 - class_10997.Field_11000) * (double)f2;
                        double d8 = class_10997.Field_11001 + (class_10997.Field_11003 - class_10997.Field_11001) * (double)f3;
                        if (this.Method_527(new Vec3(d6 + d4, d7, d8 + d5), vec3) == null) {
                            ++n;
                        }
                        ++n2;
                        f3 = (float)((double)f3 + d3);
                    }
                    f2 = (float)((double)f2 + d2);
                }
                f = (float)((double)f + d);
            }
            return (float)n / (float)n2;
        }
        return 0.0f;
    }

    public boolean Method_420(Class_4751 class_4751, Class_4595 class_4595) {
        return (this.Method_355(class_4751, class_4595) > 0 ? 16517 & 6145 : 12289 & 1856) != 0;
    }

    public boolean Method_421(Class_10997 class_10997) {
        int n = Class_13337.Method_13371(class_10997.Field_10999);
        int n2 = Class_13337.Method_13371(class_10997.Field_11002);
        int n3 = Class_13337.Method_13371(class_10997.Field_11000);
        int n4 = Class_13337.Method_13371(class_10997.Field_10998);
        int n5 = Class_13337.Method_13371(class_10997.Field_11001);
        int n6 = Class_13337.Method_13371(class_10997.Field_11003);
        Class_4810 class_4810 = new Class_4810();
        for (int i = n; i <= n2; ++i) {
            for (int j = n3; j <= n4; ++j) {
                for (int k = n5; k <= n6; ++k) {
                    Class_3238 class_3238 = this.Method_375(class_4810.Method_4814(i, j, k)).Method_3442();
                    if (class_3238.Method_3373() == Class_3713.Field_3718) continue;
                    return (5505 & 10341) != 0;
                }
            }
        }
        return (516 & 7265) != 0;
    }

    public Class_626 Method_422(UUID uUID) {
        for (int i = -24576 & 16644; i < this.Field_325.size(); ++i) {
            Class_626 class_626 = (Class_626)this.Field_325.get(i);
            if (!uUID.equals(class_626.\u0000strictfp())) continue;
            return class_626;
        }
        return null;
    }

    public Class_35273 Method_423() {
        return this.Field_300;
    }

    public Random Method_424(int n, int n2, int n3) {
        long l = (long)n * (341873259816L & 342485759817L) + (long)n2 * (132900085719L & 132931640277L) + this.Method_386().Method_31827() + (long)n3;
        this.Field_307.setSeed(l);
        return this.Field_307;
    }

    public boolean Method_425(double d, double d2, double d3, double d4) {
        for (int i = 10304 & -32255; i < this.Field_325.size(); ++i) {
            Class_626 class_626 = (Class_626)this.Field_325.get(i);
            if (!Class_28857.Field_28860.apply((Object)class_626)) continue;
            double d5 = class_626.\u0000strictfp(d, d2, d3);
            if (!(d4 < 0.0) && !(d5 < d4 * d4)) continue;
            return (6145 & -31711) != 0;
        }
        return (25106 & 2304) != 0;
    }

    public ArrayList Method_426(Class_1061 class_1061, Class_10997 class_10997, boolean bl) {
        ArrayList arrayList = (ArrayList)Field_299.get();
        arrayList.clear();
        int n = Class_13337.Method_13371(class_10997.Field_10999);
        int n2 = Class_13337.Method_13371(class_10997.Field_11002 + 1.0);
        int n3 = Class_13337.Method_13371(class_10997.Field_11000);
        int n4 = Class_13337.Method_13371(class_10997.Field_10998 + 1.0);
        int n5 = Class_13337.Method_13371(class_10997.Field_11001);
        int n6 = Class_13337.Method_13371(class_10997.Field_11003 + 1.0);
        Class_31457 class_31457 = this.Method_523();
        boolean bl2 = class_1061.Method_1168();
        boolean bl3 = this.Method_334(class_31457, class_1061);
        Class_3677 class_3677 = Class_9265.Field_9446.Method_3293();
        Class_4810 class_4810 = (Class_4810)Field_292.get();
        for (int i = n; i < n2; ++i) {
            for (int j = n5; j < n6; ++j) {
                if (!this.Method_368(class_4810.Method_4814(i, 13262 & -32688, j))) continue;
                for (int k = n3 - (-30843 & 4097); k < n4; ++k) {
                    class_4810.Method_4814(i, k, j);
                    if (bl2 && bl3) {
                        class_1061.Method_1353((-31978 & 33) != 0);
                    } else if (!bl2 && !bl3) {
                        class_1061.Method_1353((-30079 & 1043) != 0);
                    }
                    Class_3677 class_36772 = class_3677;
                    if (class_31457.Method_31498(class_4810) || !bl3) {
                        class_36772 = this.\u0000strictfp((Class_4751)class_4810);
                    }
                    class_36772.Method_3688().Method_3423(this, class_4810, class_36772, class_10997, arrayList, class_1061);
                }
            }
        }
        if (!bl) {
            return arrayList;
        }
        double d = 14.0 * 0.017857142857142856;
        ArrayList arrayList2 = this.Method_473(class_1061, class_10997.Method_11017(d, d, d));
        for (int i = 2178 & 5161; i < arrayList2.size(); ++i) {
            Class_10997 class_109972 = ((Class_1061)arrayList2.get(i)).Method_1197();
            if (class_109972 != null && class_109972.Method_11016(class_10997)) {
                arrayList.add(class_109972);
            }
            if ((class_109972 = class_1061.Method_1156((Class_1061)arrayList2.get(i))) == null || !class_109972.Method_11016(class_10997)) continue;
            arrayList.add(class_109972);
        }
        return arrayList;
    }

    public boolean Method_427(Class_4751 class_4751, int n) {
        return this.Method_465(class_4751, n, (16385 & 1601) != 0);
    }

    protected boolean Method_428(int n, int n2, boolean bl) {
        return (this.Field_320.Method_12175(n, n2) && (bl || !this.Field_320.Method_12174(n, n2).Method_17728()) ? 16389 & 10673 : 20546 & 8457) != 0;
    }

    public Class_4879 Method_429(Class_4751 class_4751) {
        int n;
        Class_4879 class_4879;
        if (!this.Method_390(class_4751)) {
            return null;
        }
        Class_4879 class_48792 = null;
        if (this.Field_287) {
            for (n = -24402 & 21776; n < this.Field_295.size(); ++n) {
                class_4879 = (Class_4879)this.Field_295.get(n);
                if (class_4879.Method_4905() || !class_4879.Method_4903().equals(class_4751)) continue;
                class_48792 = class_4879;
                break;
            }
        }
        if (class_48792 == null) {
            class_48792 = this.Method_385(class_4751).Method_17765(class_4751, Class_13470.Field_13472);
        }
        if (class_48792 == null) {
            for (n = 243 & 7680; n < this.Field_295.size(); ++n) {
                class_4879 = (Class_4879)this.Field_295.get(n);
                if (class_4879.Method_4905() || !class_4879.Method_4903().equals(class_4751)) continue;
                class_48792 = class_4879;
                break;
            }
        }
        return class_48792;
    }

    public boolean Method_430(Class_42666 class_42666) {
        return this.Method_434(class_42666, (8233 & -25979) != 0);
    }

    protected abstract Class_12166 Method_431();

    public boolean Method_432(Class_4751 class_4751, boolean bl) {
        Class_3238 class_3238;
        Class_3436 class_3436;
        Class_17281 class_17281 = this.Method_547(class_4751);
        float f = class_17281.Method_17407(class_4751);
        if (f > 0.016129032f * 9.3f) {
            return (6144 & -32213) != 0;
        }
        if (class_4751.\u0000, `() >= 0 && class_4751.\u0000, `() < (1314 & 2836) && this.Method_443(Class_6778.Field_6780, class_4751) < (2442 & -27638) && ((class_3238 = (class_3436 = this.Method_375(class_4751)).Method_3442()) == Class_9265.Field_9286 || class_3238 == Class_9265.Field_9281) && (Integer)class_3436.Method_3440(Class_4415.Field_4417) == 0) {
            int n;
            if (!bl) {
                return (1 & 10635) != 0;
            }
            int n2 = n = this.Method_450(class_4751.Method_4771()) && this.Method_450(class_4751.Method_4770()) && this.Method_450(class_4751.Method_4778()) && this.Method_450(class_4751.Method_4784()) ? 2197 & -16383 : 1312 & -20349;
            if (n == 0) {
                return (1259 & 14341) != 0;
            }
        }
        return (15394 & 0) != 0;
    }

    public void Method_433(Class_6778 class_6778, int n, int n2, int n3, int n4) {
        if (this.Method_445(n, n2, n3) && this.Method_490(n, n2, n3)) {
            Class_17665 class_17665 = this.Method_344(n, n3);
            class_17665.Method_17773(class_6778, n, n2, n3, n4);
            this.Method_480(new Class_4751(n, n2, n3));
        }
    }

    public boolean Method_434(Class_42666 class_42666, boolean bl) {
        return this.Method_512(class_42666.Field_42668, class_42666.Field_42672, class_42666.Field_42669, class_42666.Field_42670, class_42666.Field_42671, class_42666.Field_42667, bl);
    }

    public boolean Method_435(Class_4751 class_4751, Class_3436 class_3436) {
        return this.Method_462(class_4751, class_3436, 323 & 12807);
    }

    public boolean Method_436(Class_4751 class_4751, Class_3238 class_3238) {
        return (388 & 601) != 0;
    }

    public boolean Method_437(Class_3238 class_3238, Class_4751 class_4751, boolean bl, Class_4595 class_4595, Class_1061 class_1061, Class_23823 class_23823) {
        Class_10997 class_10997;
        Class_3238 class_32382 = this.Method_375(class_4751).Method_3442();
        Class_10997 class_109972 = class_10997 = bl ? null : class_3238.Method_3285(this, class_4751, class_3238.Method_3293());
        return (class_10997 != null && !this.Method_542(class_10997, class_1061) ? 65 & 12568 : (class_32382.Method_3373() == Class_3713.Field_3751 && class_3238 == Class_9265.Field_9376 ? 30977 & 1 : (class_32382.Method_3373().Method_3770() && class_3238.Method_3329(this, class_4751, class_4595, class_23823) ? 22795 & 8289 : 1413 & 4674))) != 0;
    }

    protected void Method_438() {
        if (!this.Field_284.Method_18370() && !this.Field_306) {
            int n;
            int n2 = this.Field_294.Method_31802();
            if (n2 > 0) {
                this.Field_294.Method_31825(--n2);
                this.Field_294.Method_31775(this.Field_294.Method_31815() ? 12361 & 1793 : 3718 & 16402);
                this.Field_294.Method_31799(this.Field_294.Method_31764() ? -15319 & 14471 : -19421 & 74);
            }
            if ((n = this.Field_294.Method_31840()) <= 0) {
                if (this.Field_294.Method_31815()) {
                    this.Field_294.Method_31775(this.Field_307.nextInt(16097 & 28640) + (3608 & -25065));
                } else {
                    this.Field_294.Method_31775(this.Field_307.nextInt(19060288 & 33993028) + (12016 & 12000));
                }
            } else {
                this.Field_294.Method_31775(--n);
                if (n <= 0) {
                    this.Field_294.Method_31818((!this.Field_294.Method_31815() ? -8061 & 1033 : -24320 & 20992) != 0);
                }
            }
            this.Field_314 = this.Field_291;
            this.Field_291 = this.Field_294.Method_31815() ? (float)((double)this.Field_291 + 1.2424242424242424 * 0.008048780487804878) : (float)((double)this.Field_291 - 6.777777777777778 * 0.0014754098360655738);
            this.Field_291 = Class_13337.Method_13360(this.Field_291, 0.0f, 1.0f);
            int n3 = this.Field_294.Method_31798();
            if (n3 <= 0) {
                if (this.Field_294.Method_31764()) {
                    this.Field_294.Method_31799(this.Field_307.nextInt(28388 & 12003) + (-287 & 12016));
                } else {
                    this.Field_294.Method_31799(this.Field_307.nextInt(21147718 & -2136829631) + (-20756 & 12003));
                }
            } else {
                this.Field_294.Method_31799(--n3);
                if (n3 <= 0) {
                    this.Field_294.Method_31828((!this.Field_294.Method_31764() ? -32191 & 11 : 17104 & 6434) != 0);
                }
            }
            this.Field_312 = this.Field_293;
            this.Field_293 = this.Field_294.Method_31764() ? (float)((double)this.Field_293 + 0.024857142857142855 * 0.40229885057471265) : (float)((double)this.Field_293 - 0.0016666666666666668 * 6.0);
            this.Field_293 = Class_13337.Method_13360(this.Field_293, 0.0f, 1.0f);
        }
    }

    public void Method_439(Class_1061 class_1061) {
        this.Method_418(class_1061, (4801 & -7109) != 0);
    }

    public boolean Method_440(Class_10997 class_10997, Class_3713 class_3713) {
        int n = Class_13337.Method_13371(class_10997.Field_10999);
        int n2 = Class_13337.Method_13371(class_10997.Field_11002 + 1.0);
        int n3 = Class_13337.Method_13371(class_10997.Field_11000);
        int n4 = Class_13337.Method_13371(class_10997.Field_10998 + 1.0);
        int n5 = Class_13337.Method_13371(class_10997.Field_11001);
        int n6 = Class_13337.Method_13371(class_10997.Field_11003 + 1.0);
        Class_4810 class_4810 = new Class_4810();
        for (int i = n; i < n2; ++i) {
            for (int j = n3; j < n4; ++j) {
                for (int k = n5; k < n6; ++k) {
                    if (this.\u0000strictfp((Class_4751)class_4810.Method_4814(i, j, k)).Method_3688().Method_3373() != class_3713) continue;
                    return (65 & -32633) != 0;
                }
            }
        }
        return (11072 & 1030) != 0;
    }

    public void Method_441(Class_4751 class_4751, Class_3238 class_3238, int n) {
    }

    public void Method_442(Class_4751 class_4751, String string) {
        for (int i = 32 & -13040; i < this.Field_327.size(); ++i) {
            ((Class_2638)this.Field_327.get(i)).Method_2649(string, class_4751);
        }
    }

    public int Method_443(Class_6778 class_6778, Class_4751 class_4751) {
        return this.Method_387(class_6778, class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp());
    }

    public boolean Method_444(int n, int n2) {
        Class_4751 class_4751 = this.Method_372();
        int n3 = n * (12304 & -32400) + (266 & 25720) - class_4751.\u0000= final();
        int n4 = n2 * (-21802 & 16665) + (-6136 & 172) - class_4751.\u0000strictfp();
        int n5 = 4512 & 3200;
        return (n3 >= -n5 && n3 <= n5 && n4 >= -n5 && n4 <= n5 ? -32765 & 25617 : 128 & 2128) != 0;
    }

    protected boolean Method_445(int n, int n2, int n3) {
        return (n2 >= 0 && n2 < (2304 & 4878) && n >= (-29966924 & -17351487) && n3 >= (-25264252 & -21611392) && n < (332004225 & 1711130500) && n3 < (-1577458752 & 1103872898) ? 20529 & -32703 : 18466 & 1604) != 0;
    }

    public void Method_446(Class_4751 class_4751, Class_3238 class_3238, int n, int n2) {
    }

    public float Method_447(float f) {
        return this.Field_284.Method_18360(this.Field_294.Method_31806(), f);
    }

    public List Method_448(Class class_, Predicate predicate) {
        ArrayList arrayList = Lists.newArrayList();
        for (Class_1061 class_1061 : this.Field_325) {
            if (!class_.isAssignableFrom(class_1061.getClass()) || !predicate.apply((Object)class_1061)) continue;
            arrayList.add(class_1061);
        }
        return arrayList;
    }

    public int Method_449() {
        return 24902 & -24695;
    }

    private boolean Method_450(Class_4751 class_4751) {
        return (this.Method_375(class_4751).Method_3442().Method_3373() == Class_3713.Field_3734 ? -32763 & 10771 : 560 & 3469) != 0;
    }

    public int Method_451(Class_4751 class_4751) {
        return this.Method_510(class_4751, (21827 & 8217) != 0);
    }

    public int Method_452(double d, double d2, double d3, int n) {
        return this.Method_521(Class_13337.Method_13371(d), Class_13337.Method_13371(d2), Class_13337.Method_13371(d3), n);
    }

    public void Method_453() {
        int n = this.Method_377(1.0f);
        if (n != this.Field_319) {
            this.Field_319 = n;
        }
    }

    public boolean Method_454() {
        return ((double)this.Method_332(1.0f) > 7.076923076923077 * 0.028260869565217395 ? 529 & 32137 : -23951 & 142) != 0;
    }

    public void Method_455(Class_4751 class_4751, Class_3238 class_3238, Class_4595 class_4595) {
        if (class_4595 != Class_4595.Field_4602) {
            this.Method_459(class_4751.Method_4771(), class_3238);
        }
        if (class_4595 != Class_4595.Field_4603) {
            this.Method_459(class_4751.Method_4770(), class_3238);
        }
        if (class_4595 != Class_4595.Field_4615) {
            this.Method_459(class_4751.Method_4782(), class_3238);
        }
        if (class_4595 != Class_4595.Field_4601) {
            this.Method_459(class_4751.Method_4769(), class_3238);
        }
        if (class_4595 != Class_4595.Field_4598) {
            this.Method_459(class_4751.Method_4778(), class_3238);
        }
        if (class_4595 != Class_4595.Field_4613) {
            this.Method_459(class_4751.Method_4784(), class_3238);
        }
    }

    public void Method_456(Class_4751 class_4751) {
        Class_4879 class_4879 = this.Method_429(class_4751);
        if (class_4879 != null && this.Field_287) {
            class_4879.Method_4912();
            this.Field_295.remove(class_4879);
        } else {
            if (class_4879 != null) {
                this.Field_295.remove(class_4879);
                this.Field_315.remove(class_4879);
                this.Field_311.remove(class_4879);
            }
            this.Method_385(class_4751).Method_17714(class_4751);
        }
    }

    public void Method_457(Class_4751 class_4751, Class_3238 class_3238) {
        if (this.Field_294.Method_31833() != Class_43755.Field_43756) {
            this.Method_525(class_4751, class_3238);
        }
    }

    public int Method_458(int n, int n2, int n3) {
        return this.Method_484(n, n2, n3, (2305 & 16521) != 0);
    }

    public void Method_459(Class_4751 class_4751, Class_3238 class_3238) {
        if (!this.Field_306) {
            Class_3436 class_3436 = this.Method_375(class_4751);
            try {
                class_3436.Method_3442().Method_3336(this, class_4751, class_3436, class_3238);
            }
            catch (Throwable throwable) {
                Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Exception while updating neighbours");
                Class_13220 class_13220 = class_13268.Method_13280("Block being updated");
                class_13220.Method_13232("Source block type", new Class_25520(this, class_3238));
                Class_13220.Method_13234(class_13220, class_4751, class_3436);
                throw new Class_1809(class_13268);
            }
        }
    }

    public int Method_460(String string) {
        return this.Field_300.Method_35278(string);
    }

    public ArrayList Method_461(Class_1061 class_1061, Class_10997 class_10997) {
        return this.Method_426(class_1061, class_10997, (16643 & 10833) != 0);
    }

    public boolean Method_462(Class_4751 class_4751, Class_3436 class_3436, int n) {
        if (!this.Method_390(class_4751)) {
            return (16 & 15680) != 0;
        }
        if (!this.Field_306 && this.Field_294.Method_31833() == Class_43755.Field_43756) {
            return (512 & 6535) != 0;
        }
        Class_17665 class_17665 = this.Method_385(class_4751);
        Class_3238 class_3238 = class_3436.Method_3442();
        Class_3436 class_34362 = class_17665.Method_17702(class_4751, class_3436);
        if (class_34362 == null) {
            return (-18998 & 548) != 0;
        }
        Class_3238 class_32382 = class_34362.Method_3442();
        if (class_3238.Method_3384() != class_32382.Method_3384() || class_3238.Method_3355() != class_32382.Method_3355()) {
            this.Field_310.Method_2789("checkLight");
            this.Method_353(class_4751);
            this.Field_310.Method_2790();
        }
        if ((n & (611 & 11402)) != 0 && (!this.Field_306 || (n & (22022 & -24571)) == 0) && class_17665.Method_17731()) {
            this.Method_416(class_4751);
        }
        if (!this.Field_306 && (n & (25729 & 2133)) != 0) {
            this.Method_457(class_4751, class_34362.Method_3442());
            if (class_3238.Method_3418()) {
                this.Method_520(class_4751, class_3238);
            }
        }
        return (1025 & 12969) != 0;
    }

    private void Method_463(int n, boolean bl, double d, double d2, double d3, double d4, double d5, double d6, int ... arrn) {
        for (int i = 1059 & -14072; i < this.Field_327.size(); ++i) {
            ((Class_2638)this.Field_327.get(i)).Method_2648(n, bl, d, d2, d3, d4, d5, d6, arrn);
        }
    }

    public float Method_464(float f) {
        float f2 = this.Method_447(f);
        float f3 = 1.0f - (Class_13337.Method_13350(f2 * (1.8928572f * 1.6597093f) * 2.0f) * 2.0f + 2.0833333f * 0.09600001f);
        f3 = Class_13337.Method_13360(f3, 0.0f, 1.0f);
        f3 = 1.0f - f3;
        f3 = (float)((double)f3 * (1.0 - (double)(this.Method_332(f) * (2.4848485f * 2.012195f)) / (26.48275862068966 * 0.6041666666666666)));
        f3 = (float)((double)f3 * (1.0 - (double)(this.Method_349(f) * (1.1363636f * 4.4f)) / (0.14666666666666667 * 109.0909090909091)));
        return f3 * (7.733333f * 0.10344828f) + 0.11594203f * 1.725f;
    }

    public boolean Method_465(Class_4751 class_4751, int n, boolean bl) {
        return this.Method_512(class_4751.\u0000= final() - n, class_4751.\u0000, `() - n, class_4751.\u0000strictfp() - n, class_4751.\u0000= final() + n, class_4751.\u0000, `() + n, class_4751.\u0000strictfp() + n, bl);
    }

    public void Method_466(Class_4751 class_4751, Class_3238 class_3238, int n, int n2) {
        class_3238.Method_3406(this, class_4751, this.Method_375(class_4751), n, n2);
    }

    public boolean Method_467(int n, int n2, int n3, boolean bl) {
        return (!this.Method_445(n, n2, n3) ? -27343 & 19008 : this.Method_428(n >> (2068 & 13572), n3 >> (-32460 & 17412), bl)) != 0;
    }

    protected void Method_468(Class_1061 class_1061) {
        for (int i = 118 & -13312; i < this.Field_327.size(); ++i) {
            ((Class_2638)this.Field_327.get(i)).Method_2642(class_1061);
        }
    }

    public Class_626 Method_469(Class_1061 class_1061, double d) {
        return this.Method_491(class_1061.Field_1130, class_1061.Method_1324(), class_1061.Field_1106, d);
    }

    public Class_4751 Method_470(String string, Class_4751 class_4751) {
        return this.Method_478().Method_12179(this, string, class_4751);
    }

    public boolean Method_471() {
        return this.Field_285;
    }

    public boolean Method_472(Class_4751 class_4751) {
        return this.Method_462(class_4751, Class_9265.Field_9351.Method_3293(), 2099 & 16899);
    }

    public ArrayList Method_473(Class_1061 class_1061, Class_10997 class_10997) {
        return this.Method_506(class_1061, class_10997, Class_28857.Field_28860);
    }

    public void Method_474(Class_1061 class_1061) {
        if (class_1061.Field_1099 != null) {
            class_1061.Field_1099.Method_1163(null);
        }
        if (class_1061.Field_1095 != null) {
            class_1061.Method_1163(null);
        }
        class_1061.Method_1166();
        if (class_1061 instanceof Class_626) {
            this.Field_325.remove(class_1061);
            this.Method_534();
            this.Method_543(class_1061);
        }
    }

    public void Method_475(double d, double d2, double d3, String string, float f, float f2) {
        for (int i = 24576 & -32764; i < this.Field_327.size(); ++i) {
            ((Class_2638)this.Field_327.get(i)).Method_2646(string, d, d2, d3, f, f2);
        }
    }

    private void Method_476() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_477(double d, double d2, double d3, double d4, double d5, double d6, Class_1699 class_1699) {
    }

    public Class_12166 Method_478() {
        return this.Field_320;
    }

    public String Method_479() {
        return this.Field_320.Method_12177();
    }

    public void Method_480(Class_4751 class_4751) {
        for (int i = 0 & -23864; i < this.Field_327.size(); ++i) {
            ((Class_2638)this.Field_327.get(i)).Method_2645(class_4751);
        }
    }

    public void Method_481(Class_4751 class_4751, Class_4751 class_47512) {
        this.Method_497(class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp(), class_47512.\u0000= final(), class_47512.\u0000, `(), class_47512.\u0000strictfp());
    }

    public void Method_482(double d, double d2, double d3, String string, float f, float f2, boolean bl) {
    }

    public void Method_483(Class_1061 class_1061, byte by) {
    }

    public int Method_484(int n, int n2, int n3, boolean bl) {
        if (n >= (-29475648 & -29999736) && n3 >= (-29983614 & -25280876) && n < (637137861 & 164614064) && n3 < (-2116435007 & 1170854800)) {
            if (bl && this.Method_413(n, n2, n3).Method_3442().Method_3304()) {
                int n4 = this.Method_484(n, n2 + (515 & 23681), n3, (20480 & 134) != 0);
                int n5 = this.Method_484(n + (4685 & 25601), n2, n3, (3080 & 512) != 0);
                int n6 = this.Method_484(n - (20805 & -30575), n2, n3, (24594 & 1280) != 0);
                int n7 = this.Method_484(n, n2, n3 + (81 & 517), (-32173 & 10368) != 0);
                int n8 = this.Method_484(n, n2, n3 - (-32511 & 18955), (4358 & 1584) != 0);
                if (n5 > n4) {
                    n4 = n5;
                }
                if (n6 > n4) {
                    n4 = n6;
                }
                if (n7 > n4) {
                    n4 = n7;
                }
                if (n8 > n4) {
                    n4 = n8;
                }
                return n4;
            }
            if (n2 < 0) {
                return 9248 & 16576;
            }
            if (n2 >= (-13056 & 788)) {
                n2 = 22783 & 255;
            }
            Class_17665 class_17665 = this.Method_344(n, n3);
            return class_17665.Method_17738(n, n2, n3, this.Field_319);
        }
        return -32481 & 15;
    }

    public float Method_485(float f) {
        float f2 = this.Method_447(f);
        return f2 * (3.75f * 0.83775806f) * 2.0f;
    }

    public List Method_486(Class_42666 class_42666, boolean bl) {
        return null;
    }

    public Class_26801 Method_487() {
        return this.Method_386().Method_31800();
    }

    public List Method_488(Class class_, Class_10997 class_10997) {
        return this.Method_395(class_, class_10997, Class_28857.Field_28860);
    }

    public Class_626 Method_489(String string) {
        for (int i = 8229 & -11006; i < this.Field_325.size(); ++i) {
            Class_626 class_626 = (Class_626)this.Field_325.get(i);
            if (!string.equals(class_626.Method_825())) continue;
            return class_626;
        }
        return null;
    }

    public boolean Method_490(int n, int n2, int n3) {
        return this.Method_467(n, n2, n3, (2437 & 1) != 0);
    }

    public Class_626 Method_491(double d, double d2, double d3, double d4) {
        double d5 = 2.3684210526315788 * -0.4222222222222223;
        Class_626 class_626 = null;
        for (int i = 2392 & 643; i < this.Field_325.size(); ++i) {
            Class_626 class_6262 = (Class_626)this.Field_325.get(i);
            if (!Class_28857.Field_28860.apply((Object)class_6262)) continue;
            double d6 = class_6262.\u0000strictfp(d, d2, d3);
            if (!(d4 < 0.0) && !(d6 < d4 * d4) || d5 != -1.4909090909090907 * 0.6707317073170732 && !(d6 < d5)) continue;
            d5 = d6;
            class_626 = class_6262;
        }
        return class_626;
    }

    public Class_27841 Method_492(Class class_, String string) {
        return this.Field_300.Method_35279(class_, string);
    }

    public boolean Method_493(Class_1061 class_1061) {
        return this.Method_383(class_1061.Field_1130, class_1061.Method_1324(), class_1061.Field_1106);
    }

    public int Method_494(Class_4751 class_4751) {
        int n = -32691 & 18594;
        Class_4595[] arrclass_4595 = Class_4595.Field_4600;
        int n2 = arrclass_4595.length;
        for (int i = 18432 & -32764; i < n2; ++i) {
            Class_4595 class_4595 = arrclass_4595[i];
            int n3 = this.Method_355(class_4751.Method_4765(class_4595), class_4595);
            if (n3 >= (15 & 16399)) {
                return 12367 & 655;
            }
            if (n3 <= n) continue;
            n = n3;
        }
        return n;
    }

    public void Method_495(Class_9780 class_9780) {
        this.Field_294.Method_31813((8723 & -13983) != 0);
    }

    public boolean Method_496(Class_4751 class_4751) {
        if (!this.Method_454()) {
            return (32 & 136) != 0;
        }
        if (!this.Method_398(class_4751)) {
            return (3077 & 152) != 0;
        }
        if (this.Method_361(class_4751).\u0000, `() > class_4751.\u0000, `()) {
            return (32 & 4806) != 0;
        }
        Class_17281 class_17281 = this.Method_547(class_4751);
        return (class_17281.Method_17383() ? -31488 & 19091 : (this.Method_498(class_4751, (3276 & 16928) != 0) ? 24704 & 4118 : class_17281.Method_17400())) != 0;
    }

    public void Method_497(int n, int n2, int n3, int n4, int n5, int n6) {
        for (int i = 24656 & 2568; i < this.Field_327.size(); ++i) {
            ((Class_2638)this.Field_327.get(i)).Method_2640(n, n2, n3, n4, n5, n6);
        }
    }

    public boolean Method_498(Class_4751 class_4751, boolean bl) {
        Class_3238 class_3238;
        Class_17281 class_17281 = this.Method_547(class_4751);
        float f = class_17281.Method_17407(class_4751);
        if (f > 0.036000002f * 4.1666665f) {
            return (-32692 & 21024) != 0;
        }
        if (!bl) {
            return (-21501 & 577) != 0;
        }
        if (class_4751.\u0000, `() >= 0 && class_4751.\u0000, `() < (329 & 23440) && this.Method_443(Class_6778.Field_6780, class_4751) < (4234 & 16906) && (class_3238 = this.Method_375(class_4751).Method_3442()).Method_3373() == Class_3713.Field_3718 && Class_9265.Field_9458.Method_3368(this, class_4751)) {
            return (19461 & -28143) != 0;
        }
        return (6154 & 1716) != 0;
    }

    public int Method_499(int n, int n2) {
        if (n >= (-29999680 & -16876354) && n2 >= (-25805692 & -29918078) && n < (1573507977 & -2083798140) && n2 < (-1041382454 & 1037682576)) {
            if (!this.Method_428(n >> (20 & 16484), n2 >> (260 & 8831), (6409 & 9233) != 0)) {
                return 8193 & 4122;
            }
            Class_17665 class_17665 = this.Method_346(n >> (20613 & 68), n2 >> (16982 & -30716));
            return class_17665.Method_17730();
        }
        return this.Method_378() + (3329 & 129);
    }

    public Vec3 Method_500(float f) {
        float f2 = this.Method_447(f);
        return this.Field_284.Method_18378(f2, f);
    }

    public void Method_501(int n, int n2, int n3, int n4) {
        int n5;
        if (n3 > n4) {
            n5 = n4;
            n4 = n3;
            n3 = n5;
        }
        if (!this.Field_284.Method_18370()) {
            for (n5 = n3; n5 <= n4; ++n5) {
                if (this instanceof Class_570) {
                    ((Class_570)this).Method_603(Class_6778.Field_6781, new Class_4751(n, n5, n2));
                    continue;
                }
                this.Method_532(Class_6778.Field_6781, new Class_4751(n, n5, n2));
            }
        }
        this.Method_497(n, n3, n2, n, n4, n2);
    }

    public void Method_502(int n, Class_4751 class_4751, int n2) {
        this.Method_358(null, n, class_4751, n2);
    }

    public void Method_503(int n, Class_4751 class_4751, int n2) {
        for (int i = 16415 & 9600; i < this.Field_327.size(); ++i) {
            ((Class_2638)this.Field_327.get(i)).Method_2650(n, class_4751, n2);
        }
    }

    public Class_13220 Method_504(Class_13268 class_13268) {
        Class_13220 class_13220 = class_13268.Method_13284("Affected level", 8209 & -31997);
        class_13220.Method_13231("Level name", this.Field_294 == null ? "????" : this.Field_294.Method_31831());
        class_13220.Method_13232("All players", new Class_29076(this));
        class_13220.Method_13232("Chunk stats", new Class_9697(this));
        try {
            this.Field_294.Method_31809(class_13220);
        }
        catch (Throwable throwable) {
            class_13220.Method_13228("Level Data Unobtainable", throwable);
        }
        return class_13220;
    }

    public float Method_505(int n, int n2, int n3) {
        return this.Field_284.Method_18375()[this.Method_458(n, n2, n3)];
    }

    public ArrayList Method_506(Class_1061 class_1061, Class_10997 class_10997, Predicate predicate) {
        ArrayList arrayList = Lists.newArrayList();
        int n = Class_13337.Method_13371((class_10997.Field_10999 - 2.761904761904762 * 0.7241379310344828) / (0.7272727272727273 * 22.0));
        int n2 = Class_13337.Method_13371((class_10997.Field_11002 + 1.7209302325581397 * 1.162162162162162) / (3.4285714285714284 * 4.666666666666667));
        int n3 = Class_13337.Method_13371((class_10997.Field_11001 - 0.7831325301204819 * 2.553846153846154) / (144.0 * 0.1111111111111111));
        int n4 = Class_13337.Method_13371((class_10997.Field_11003 + 0.8705882352941177 * 2.2972972972972974) / (73.60000000000001 * 0.21739130434782608));
        for (int i = n; i <= n2; ++i) {
            for (int j = n3; j <= n4; ++j) {
                if (!this.Method_428(i, j, (2133 & 17419) != 0)) continue;
                this.Method_346(i, j).Method_17763(class_1061, class_10997, arrayList, predicate);
            }
        }
        return arrayList;
    }

    public boolean Method_507(Class_4751 class_4751) {
        return (this.Method_375(class_4751).Method_3442().Method_3373() == Class_3713.Field_3718 ? 49 & 28993 : -28672 & 152) != 0;
    }

    public void Method_508(Collection collection) {
        if (this.Field_287) {
            this.Field_295.addAll(collection);
        } else {
            for (Class_4879 class_4879 : collection) {
                this.Field_315.add(class_4879);
                if (!(class_4879 instanceof Class_5591)) continue;
                this.Field_311.add(class_4879);
            }
        }
    }

    public boolean Method_509(Class_10997 class_10997) {
        int n = Class_13337.Method_13371(class_10997.Field_10999);
        int n2 = Class_13337.Method_13371(class_10997.Field_11002);
        int n3 = Class_13337.Method_13371(class_10997.Field_11000);
        int n4 = Class_13337.Method_13371(class_10997.Field_10998);
        int n5 = Class_13337.Method_13371(class_10997.Field_11001);
        int n6 = Class_13337.Method_13371(class_10997.Field_11003);
        Class_4810 class_4810 = new Class_4810();
        for (int i = n; i <= n2; ++i) {
            for (int j = n3; j <= n4; ++j) {
                for (int k = n5; k <= n6; ++k) {
                    Class_3238 class_3238 = this.Method_375(class_4810.Method_4814(i, j, k)).Method_3442();
                    if (!class_3238.Method_3373().Method_3758()) continue;
                    return (-20479 & 17677) != 0;
                }
            }
        }
        return (1056 & 6146) != 0;
    }

    public int Method_510(Class_4751 class_4751, boolean bl) {
        return this.Method_484(class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp(), bl);
    }

    public long Method_511() {
        return this.Field_294.Method_31806();
    }

    private boolean Method_512(int n, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        if (n5 >= 0 && n2 < (17152 & 272)) {
            n3 >>= 4268 & -30971;
            n6 >>= 20484 & -32347;
            for (int i = n >>= -32729 & 1028; i <= (n4 >>= -14748 & 10246); ++i) {
                for (int j = n3; j <= n6; ++j) {
                    if (this.Method_428(i, j, bl)) continue;
                    return (-29695 & 4480) != 0;
                }
            }
            return (801 & 15363) != 0;
        }
        return (1164 & 4179) != 0;
    }

    public int Method_513() {
        return this.Field_308;
    }

    public void Method_514(long l) {
        this.Field_294.Method_31803(l);
    }

    public Class_25529 Method_515(Class_1061 class_1061, double d, double d2, double d3, float f, boolean bl) {
        return this.Method_559(class_1061, d, d2, d3, f, (1552 & 10348) != 0, bl);
    }

    public float Method_516() {
        return Class_18343.Field_18346[this.Field_284.Method_18355(this.Field_294.Method_31806())];
    }

    public void Method_517(Class_4751 class_4751) {
        this.Field_294.Method_31785(class_4751);
    }

    public Class_3238 Method_518(Class_4751 class_4751) {
        Class_4751 class_47512 = new Class_4751(class_4751.\u0000= final(), this.Method_378(), class_4751.\u0000strictfp());
        while (!this.Method_507(class_47512.Method_4769())) {
            class_47512 = class_47512.Method_4769();
        }
        return this.Method_375(class_47512).Method_3442();
    }

    public void Method_519(Class_1061 class_1061, String string, float f, float f2) {
        for (int i = -15486 & 6244; i < this.Field_327.size(); ++i) {
            ((Class_2638)this.Field_327.get(i)).Method_2646(string, class_1061.Field_1130, class_1061.Method_1324(), class_1061.Field_1106, f, f2);
        }
    }

    public void Method_520(Class_4751 class_4751, Class_3238 class_3238) {
        Iterator iterator = Class_4662.Field_4663.Method_4672();
        while (iterator.hasNext()) {
            E e = iterator.next();
            Class_4751 class_47512 = class_4751.Method_4765((Class_4595)e);
            if (!this.Method_368(class_47512)) continue;
            Class_3436 class_3436 = this.Method_375(class_47512);
            if (Class_9265.Field_9435.\u0000, `(class_3436.Method_3442())) {
                class_3436.Method_3442().Method_3336(this, class_47512, class_3436, class_3238);
                continue;
            }
            if (!class_3436.Method_3442().Method_3400() || !Class_9265.Field_9435.\u0000, `((class_3436 = this.Method_375(class_47512 = class_47512.Method_4765((Class_4595)e))).Method_3442())) continue;
            class_3436.Method_3442().Method_3336(this, class_47512, class_3436, class_3238);
        }
    }

    public int Method_521(int n, int n2, int n3, int n4) {
        int n5 = this.Method_540(Class_6778.Field_6781, n, n2, n3);
        int n6 = this.Method_540(Class_6778.Field_6780, n, n2, n3);
        if (n6 < n4) {
            n6 = n4;
        }
        return n5 << (8764 & 23572) | n6 << (2892 & -16380);
    }

    public Class_7523 Method_522() {
        return this.Field_294.Method_31772();
    }

    public Class_31457 Method_523() {
        return this.Field_304;
    }

    public boolean Method_524() {
        return ((double)this.Method_349(1.0f) > 32.0 * 0.028125 ? 1281 & 10789 : 17700 & 8272) != 0;
    }

    public void Method_525(Class_4751 class_4751, Class_3238 class_3238) {
        this.Method_459(class_4751.Method_4771(), class_3238);
        this.Method_459(class_4751.Method_4770(), class_3238);
        this.Method_459(class_4751.Method_4782(), class_3238);
        this.Method_459(class_4751.Method_4769(), class_3238);
        this.Method_459(class_4751.Method_4778(), class_3238);
        this.Method_459(class_4751.Method_4784(), class_3238);
    }

    protected void Method_526() {
        if (this.Field_294.Method_31764()) {
            this.Field_293 = 1.0f;
            if (this.Field_294.Method_31815()) {
                this.Field_291 = 1.0f;
            }
        }
    }

    public Class_37110 Method_527(Vec3 vec3, Vec3 vec32) {
        return this.Method_405(vec3, vec32, (2054 & 25864) != 0, (-32639 & 8450) != 0, (5348 & 521) != 0);
    }

    protected void Method_528() {
        int n;
        Class_626 class_626;
        int n2;
        int n3;
        int n4;
        Class_44898 class_44898 = this.Field_290;
        class_44898.Method_44924();
        this.Field_310.Method_2789("buildList");
        Class_1378 class_1378 = null;
        boolean bl = this instanceof Class_570;
        if (bl) {
            class_1378 = Class_18.Field_89.Field_48;
        }
        ArrayList arrayList = this.Field_325;
        for (n2 = -30336 & 122; n2 < arrayList.size(); ++n2) {
            class_626 = (Class_626)arrayList.get(n2);
            if (bl && class_626 != class_1378) continue;
            n4 = Class_13337.Method_13371(class_626.\u0000= package / (11.946666666666667 * 1.3392857142857142));
            n = Class_13337.Method_13371(class_626.\u0000= switch / (0.17142857142857143 * 93.33333333333333));
            n3 = this.Method_393();
            for (int i = -n3; i <= n3; ++i) {
                for (int j = -n3; j <= n3; ++j) {
                    class_44898.Method_44925(new Class_29480(i + n4, j + n));
                }
            }
        }
        this.Field_310.Method_2790();
        if (this.Field_313 > 0) {
            this.Field_313 -= -6117 & 4289;
        }
        this.Field_310.Method_2789("playerCheckLight");
        if (!this.Field_325.isEmpty()) {
            n2 = this.Field_307.nextInt(this.Field_325.size());
            class_626 = (Class_626)this.Field_325.get(n2);
            n4 = Class_13337.Method_13371(class_626.\u0000= package) + this.Field_307.nextInt(-30965 & 75) - (2085 & 4295);
            n = Class_13337.Method_13371(class_626.\u0000, for()) + this.Field_307.nextInt(16555 & 15) - (4679 & 16517);
            n3 = Class_13337.Method_13371(class_626.\u0000= switch) + this.Field_307.nextInt(22603 & 795) - (2053 & -32593);
            this.Method_353(new Class_4751(n4, n, n3));
        }
        this.Field_310.Method_2790();
    }

    public void Method_529() {
        this.Field_309.Method_26665();
    }

    public void Method_530(Class_4879 class_4879) {
        this.Field_296.add(class_4879);
    }

    public boolean Method_531(Class_4879 class_4879) {
        boolean bl = this.Field_315.add(class_4879);
        if (bl && class_4879 instanceof Class_5591) {
            this.Field_311.add(class_4879);
        }
        return bl;
    }

    public boolean Method_532(Class_6778 class_6778, Class_4751 class_4751) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        if (!this.Method_465(class_4751, 6293 & 529, (10816 & -15324) != 0)) {
            return (16532 & 8224) != 0;
        }
        int n9 = 23752 & 532;
        int n10 = 8 & 23408;
        this.Field_310.Method_2789("getBrightness");
        int n11 = this.Method_443(class_6778, class_4751);
        int n12 = this.Method_339(class_4751, class_6778);
        int n13 = class_4751.\u0000= final();
        int n14 = class_4751.\u0000, `();
        int n15 = class_4751.\u0000strictfp();
        int[] arrn = this.Field_302;
        if (n12 > n11) {
            arrn[n10++] = -1583206924 & 340171299;
        } else if (n12 < n11) {
            arrn[n10++] = 3397986 & -1203631043 | n11 << (5918 & 18578);
            while (n9 < n10) {
                n4 = arrn[n9++];
                n8 = (n4 & (-32129 & 2367)) - (10273 & 124) + n13;
                n2 = (n4 >> (-32753 & 9734) & (2111 & -14593)) - (-11741 & 176) + n14;
                n3 = (n4 >> (18445 & 8844) & (-27457 & 2367)) - (1057 & 2098) + n15;
                int n16 = n4 >> (7698 & -24173) & (1103 & -24433);
                Class_4751 class_47512 = new Class_4751(n8, n2, n3);
                n5 = this.Method_443(class_6778, class_47512);
                if (n5 != n16) continue;
                this.Method_556(class_6778, class_47512, 2176 & 16657);
                if (n16 <= 0 || (n = Class_13337.Method_13382(n8 - n13)) + (n7 = Class_13337.Method_13382(n2 - n14)) + (n6 = Class_13337.Method_13382(n3 - n15)) >= (27417 & -32687)) continue;
                Class_4810 class_4810 = new Class_4810();
                Class_4595[] arrclass_4595 = Class_4595.Method_4630();
                int n17 = arrclass_4595.length;
                for (int i = 6918 & 1033; i < n17; ++i) {
                    Class_4595 class_4595 = arrclass_4595[i];
                    int n18 = n8 + class_4595.Method_4654();
                    int n19 = n2 + class_4595.Method_4633();
                    int n20 = n3 + class_4595.Method_4656();
                    class_4810.Method_4814(n18, n19, n20);
                    int n21 = Math.max(-20353 & 16897, this.Method_375(class_4810).Method_3442().Method_3384());
                    n5 = this.Method_443(class_6778, class_4810);
                    if (n5 != n16 - n21 || n10 >= arrn.length) continue;
                    arrn[n10++] = n18 - n13 + (2144 & -14416) | n19 - n14 + (9016 & -16281) << (2615 & 13574) | n20 - n15 + (1392 & 18470) << (22044 & 8271) | n16 - n21 << (442 & -31209);
                }
            }
            n9 = 8321 & 80;
        }
        this.Field_310.Method_2790();
        this.Field_310.Method_2789("checkedPosition < toCheckCount");
        while (n9 < n10) {
            int n22;
            n4 = arrn[n9++];
            n8 = (n4 & (63 & -17281)) - (-29400 & 12324) + n13;
            n2 = (n4 >> (3142 & 527) & (21183 & -32705)) - (2400 & 20538) + n14;
            n3 = (n4 >> (4142 & -6708) & (575 & 1215)) - (100 & 810) + n15;
            Class_4751 class_47513 = new Class_4751(n8, n2, n3);
            int n23 = this.Method_443(class_6778, class_47513);
            n5 = this.Method_339(class_47513, class_6778);
            if (n5 == n23) continue;
            this.Method_556(class_6778, class_47513, n5);
            if (n5 <= n23) continue;
            n = Math.abs(n8 - n13);
            n7 = Math.abs(n2 - n14);
            n6 = Math.abs(n3 - n15);
            int n24 = n22 = n10 < arrn.length - (614 & -31738) ? -32751 & 24801 : -15528 & 12325;
            if (n + n7 + n6 >= (49 & 23641) || n22 == 0) continue;
            if (this.Method_443(class_6778, class_47513.Method_4771()) < n5) {
                arrn[n10++] = n8 - (13337 & 19301) - n13 + (-25952 & 8237) + (n2 - n14 + (162 & 21024) << (4103 & 8902)) + (n3 - n15 + (5170 & 2728) << (6413 & 9324));
            }
            if (this.Method_443(class_6778, class_47513.Method_4770()) < n5) {
                arrn[n10++] = n8 + (18625 & 13829) - n13 + (25128 & 368) + (n2 - n14 + (-20442 & 3488) << (2567 & -16122)) + (n3 - n15 + (16568 & 8738) << (-22116 & 4110));
            }
            if (this.Method_443(class_6778, class_47513.Method_4782()) < n5) {
                arrn[n10++] = n8 - n13 + (31524 & -32735) + (n2 - (8769 & -29661) - n14 + (688 & 1385) << (14367 & 17382)) + (n3 - n15 + (16480 & -27098) << (4364 & -24386));
            }
            if (this.Method_443(class_6778, class_47513.Method_4769()) < n5) {
                arrn[n10++] = n8 - n13 + (3680 & -28638) + (n2 + (7247 & 16785) - n14 + (1257 & -24544) << (1286 & 16399)) + (n3 - n15 + (3108 & 312) << (25372 & 4206));
            }
            if (this.Method_443(class_6778, class_47513.Method_4778()) < n5) {
                arrn[n10++] = n8 - n13 + (26656 & -28640) + (n2 - n14 + (9761 & -30688) << (6 & 9310)) + (n3 - (16665 & 8711) - n15 + (15089 & -32728) << (4140 & 348));
            }
            if (this.Method_443(class_6778, class_47513.Method_4784()) >= n5) continue;
            arrn[n10++] = n8 - n13 + (16809 & 2594) + (n2 - n14 + (8353 & 4640) << (807 & 21646)) + (n3 + (8265 & -25599) - n15 + (11632 & -16221) << (525 & -14036));
        }
        this.Field_310.Method_2790();
        return (-32735 & 24595) != 0;
    }

    protected void Method_533() {
        this.Method_528();
    }

    public void Method_534() {
    }

    public void Method_535(long l) {
        this.Field_294.Method_31820(l);
    }

    protected Class_283(Class_26655 class_26655, Class_31717 class_31717, Class_18343 class_18343, Class_2767 class_2767, boolean bl) {
        this.Field_309 = class_26655;
        this.Field_310 = class_2767;
        this.Field_294 = class_31717;
        this.Field_284 = class_18343;
        this.Field_306 = bl;
        this.Field_304 = class_18343.Method_18374();
    }

    public Vec3 Method_536(Class_1061 class_1061, float f) {
        float f2;
        float f3;
        float f4 = this.Method_447(f);
        float f5 = Class_13337.Method_13350(f4 * (1.36f * 2.3099947f) * 2.0f) * 2.0f + 3.2592592f * 0.1534091f;
        f5 = Class_13337.Method_13360(f5, 0.0f, 1.0f);
        int n = Class_13337.Method_13371(class_1061.Field_1130);
        int n2 = Class_13337.Method_13371(class_1061.Method_1324());
        int n3 = Class_13337.Method_13371(class_1061.Field_1106);
        Class_4751 class_4751 = new Class_4751(n, n2, n3);
        Class_17281 class_17281 = this.Method_547(class_4751);
        float f6 = class_17281.Method_17407(class_4751);
        int n4 = class_17281.Method_17416(f6);
        float f7 = (float)(n4 >> (49 & 10256) & (4351 & 1279)) / (575.80646f * 0.44285715f);
        float f8 = (float)(n4 >> (-23540 & 2057) & (1279 & -32513)) / (274.6154f * 0.9285714f);
        float f9 = (float)(n4 & (-31233 & 6399)) / (79.87952f * 3.1923077f);
        f7 *= f5;
        f8 *= f5;
        f9 *= f5;
        float f10 = this.Method_332(f);
        if (f10 > 0.0f) {
            f3 = (f7 * (0.15357144f * 1.9534883f) + f8 * (2.55f * 0.23137255f) + f9 * (0.11161765f * 0.98550725f)) * (0.60227275f * 0.99622643f);
            f2 = 1.0f - f10 * (0.11597938f * 6.4666667f);
            f7 = f7 * f2 + f3 * (1.0f - f2);
            f8 = f8 * f2 + f3 * (1.0f - f2);
            f9 = f9 * f2 + f3 * (1.0f - f2);
        }
        if ((f3 = this.Method_349(f)) > 0.0f) {
            f2 = (f7 * (0.16363637f * 1.8333334f) + f8 * (1.0151515f * 0.581194f) + f9 * (0.1925f * 0.5714286f)) * (0.8915663f * 0.22432433f);
            float f11 = 1.0f - f3 * (0.9336735f * 0.8032787f);
            f7 = f7 * f11 + f2 * (1.0f - f11);
            f8 = f8 * f11 + f2 * (1.0f - f11);
            f9 = f9 * f11 + f2 * (1.0f - f11);
        }
        if (this.Field_308 > 0) {
            f2 = (float)this.Field_308 - f;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            f7 = f7 * (1.0f - (f2 *= 0.39929578f * 1.1269841f)) + 0.88648653f * 0.902439f * f2;
            f8 = f8 * (1.0f - f2) + 0.50526315f * 1.5833334f * f2;
            f9 = f9 * (1.0f - f2) + 1.0f * f2;
        }
        return new Vec3(f7, f8, f9);
    }

    public List Method_537() {
        return this.Field_305;
    }

    public static boolean Method_538(Class_561 class_561, Class_4751 class_4751) {
        Class_3436 class_3436 = class_561.Method_568(class_4751);
        Class_3238 class_3238 = class_3436.Method_3442();
        return (class_3238.Method_3373().Method_3769() && class_3238.Method_3319() ? 14377 & -16367 : (class_3238 instanceof Class_11027 ? (class_3436.Method_3440(Class_11027.Field_11031) == Class_37983.Field_37986 ? 13379 & -16231 : 2208 & 1281) : (class_3238 instanceof Class_5717 ? (class_3436.Method_3440(Class_5717.Field_5718) == Class_5736.Field_5737 ? 1 & 21513 : 3584 & 225) : (class_3238 instanceof Class_15219 ? 24705 & 4681 : (class_3238 instanceof Class_16211 ? ((Integer)class_3436.Method_3440(Class_16211.Field_16212) == (135 & 3111) ? 12841 & 18499 : 1665 & 4104) : 18456 & 13636))))) != 0;
    }

    public void Method_539(Collection collection) {
        this.Field_322.addAll(collection);
    }

    public int Method_540(Class_6778 class_6778, int n, int n2, int n3) {
        if (this.Field_284.Method_18370() && class_6778 == Class_6778.Field_6781) {
            return 8387 & 21504;
        }
        if (n2 < 0) {
            n2 = 145 & 3848;
        }
        if (!this.Method_445(n, n2, n3)) {
            return class_6778.Field_6779;
        }
        if (!this.Method_490(n, n2, n3)) {
            return class_6778.Field_6779;
        }
        if (this.Method_413(n, n2, n3).Method_3442().Method_3304()) {
            int n4 = this.Method_387(class_6778, n, n2 + (6209 & -32501), n3);
            int n5 = this.Method_387(class_6778, n + (-16365 & 11329), n2, n3);
            int n6 = this.Method_387(class_6778, n - (-23421 & 1), n2, n3);
            int n7 = this.Method_387(class_6778, n, n2, n3 + (519 & -32383));
            int n8 = this.Method_387(class_6778, n, n2, n3 - (279 & -22367));
            if (n5 > n4) {
                n4 = n5;
            }
            if (n6 > n4) {
                n4 = n6;
            }
            if (n7 > n4) {
                n4 = n7;
            }
            if (n8 > n4) {
                n4 = n8;
            }
            return n4;
        }
        Class_17665 class_17665 = this.Method_344(n, n3);
        return class_17665.Method_17727(class_6778, n, n2, n3);
    }

    public boolean Method_541(Class_4751 class_4751, boolean bl) {
        Class_3436 class_3436 = this.Method_375(class_4751);
        Class_3238 class_3238 = class_3436.Method_3442();
        if (class_3238.Method_3373() == Class_3713.Field_3718) {
            return (2821 & 1064) != 0;
        }
        this.Method_502(2033 & 12253, class_4751, Class_3238.Method_3367(class_3436));
        if (bl) {
            class_3238.Method_3331(this, class_4751, class_3436, 1856 & -28534);
        }
        return this.Method_462(class_4751, Class_9265.Field_9351.Method_3293(), 7 & 1155);
    }

    public boolean Method_542(Class_10997 class_10997, Class_1061 class_1061) {
        ArrayList arrayList = this.Method_473(null, class_10997);
        for (int i = 704 & 2321; i < arrayList.size(); ++i) {
            Class_1061 class_10612 = (Class_1061)arrayList.get(i);
            if (class_10612.Field_1110 || !class_10612.Field_1154 || class_10612 == class_1061 || class_1061 != null && (class_1061.Field_1095 == class_10612 || class_1061.Field_1099 == class_10612)) continue;
            return (5761 & 16394) != 0;
        }
        return (1153 & 4673) != 0;
    }

    protected void Method_543(Class_1061 class_1061) {
        for (int i = -1536 & 272; i < this.Field_327.size(); ++i) {
            ((Class_2638)this.Field_327.get(i)).Method_2641(class_1061);
        }
    }

    public boolean Method_544(Class_4751 class_4751) {
        Class_3436 class_3436 = this.Method_375(class_4751);
        Class_10997 class_10997 = class_3436.Method_3442().Method_3285(this, class_4751, class_3436);
        return (class_10997 != null && class_10997.Method_11025() >= 1.0 ? 3 & 16753 : 10400 & 73) != 0;
    }

    public void Method_545(Collection collection) {
        this.Field_305.addAll(collection);
        for (Class_1061 class_1061 : collection) {
            this.Method_468(class_1061);
        }
    }

    public boolean Method_546(Class_10997 class_10997, Class_3713 class_3713) {
        int n = Class_13337.Method_13371(class_10997.Field_10999);
        int n2 = Class_13337.Method_13371(class_10997.Field_11002 + 1.0);
        int n3 = Class_13337.Method_13371(class_10997.Field_11000);
        int n4 = Class_13337.Method_13371(class_10997.Field_10998 + 1.0);
        int n5 = Class_13337.Method_13371(class_10997.Field_11001);
        int n6 = Class_13337.Method_13371(class_10997.Field_11003 + 1.0);
        Class_4810 class_4810 = new Class_4810();
        for (int i = n; i < n2; ++i) {
            for (int j = n3; j < n4; ++j) {
                for (int k = n5; k < n6; ++k) {
                    Class_3436 class_3436 = this.Method_375(class_4810.Method_4814(i, j, k));
                    Class_3238 class_3238 = class_3436.Method_3442();
                    if (class_3238.Method_3373() != class_3713) continue;
                    int n7 = (Integer)class_3436.Method_3440(Class_4415.Field_4417);
                    double d = j + (643 & 5489);
                    if (n7 < (14396 & 16968)) {
                        d = (double)(j + (-30719 & 545)) - (double)n7 / (6.309859154929578 * 1.2678571428571428);
                    }
                    if (!(d >= class_10997.Field_11000)) continue;
                    return (17411 & -28527) != 0;
                }
            }
        }
        return (2244 & 16416) != 0;
    }

    public Class_17281 Method_547(Class_4751 class_4751) {
        if (this.Method_368(class_4751)) {
            Class_17665 class_17665 = this.Method_385(class_4751);
            try {
                return class_17665.Method_17771(class_4751, this.Field_284.Method_18376());
            }
            catch (Throwable throwable) {
                Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Getting biome");
                Class_13220 class_13220 = class_13268.Method_13280("Coordinates of biome request");
                class_13220.Method_13232("Location", new Class_15331(this, class_4751));
                throw new Class_1809(class_13268);
            }
        }
        return this.Field_284.Method_18376().Method_31924(class_4751, Class_17281.Field_17318);
    }

    public void Method_548(float f) {
        this.Field_312 = f;
        this.Field_293 = f;
    }

    public Class_4751 Method_549(Class_4751 class_4751) {
        int n = class_4751.\u0000= final() >= (-29983600 & -21545788) && class_4751.\u0000strictfp() >= (-29999932 & -29999472) && class_4751.\u0000= final() < (99212160 & 567264140) && class_4751.\u0000strictfp() < (1979312028 & 30000065) ? (this.Method_428(class_4751.\u0000= final() >> (3430 & -15844), class_4751.\u0000strictfp() >> (-30458 & 29252), (3353 & 3) != 0) ? this.Method_346(class_4751.\u0000= final() >> (8260 & -29532), class_4751.\u0000strictfp() >> (-24026 & 5148)).Method_17719(class_4751.\u0000= final() & (11535 & 111), class_4751.\u0000strictfp() & (-15345 & 2607)) : 14337 & -15960) : this.Method_378() + (-31613 & 4417);
        return new Class_4751(class_4751.\u0000= final(), n, class_4751.\u0000strictfp());
    }

    public List Method_550(Class class_, Predicate predicate) {
        ArrayList arrayList = Lists.newArrayList();
        for (Class_1061 class_1061 : this.Field_305) {
            if (!class_.isAssignableFrom(class_1061.getClass()) || !predicate.apply((Object)class_1061)) continue;
            arrayList.add(class_1061);
        }
        return arrayList;
    }

    public void Method_551(Class_1061 class_1061) {
        class_1061.Method_1166();
        if (class_1061 instanceof Class_626) {
            this.Field_325.remove(class_1061);
            this.Method_534();
        }
        int n = class_1061.Field_1147;
        int n2 = class_1061.Field_1090;
        if (class_1061.Field_1077 && this.Method_428(n, n2, (16931 & 65) != 0)) {
            this.Method_346(n, n2).Method_17717(class_1061);
        }
        this.Field_305.remove(class_1061);
        this.Method_543(class_1061);
    }

    public void Method_552(Class_626 class_626, String string, float f, float f2) {
        for (int i = 4169 & -29824; i < this.Field_327.size(); ++i) {
            ((Class_2638)this.Field_327.get(i)).Method_2643(class_626, string, class_626.\u0000= package, class_626.\u0000, for(), class_626.\u0000= switch, f, f2);
        }
    }

    public Class_26655 Method_553() {
        return this.Field_309;
    }

    public boolean Method_554(Class_4751 class_4751) {
        return this.Method_432(class_4751, (16645 & 9216) != 0);
    }

    public int Method_555() {
        return this.Field_284.Method_18355(this.Field_294.Method_31806());
    }

    public void Method_556(Class_6778 class_6778, Class_4751 class_4751, int n) {
        if (this.Method_390(class_4751) && this.Method_368(class_4751)) {
            Class_17665 class_17665 = this.Method_385(class_4751);
            class_17665.Method_17737(class_6778, class_4751, n);
            this.Method_480(class_4751);
        }
    }

    public void Method_557(String string, Class_27841 class_27841) {
        this.Field_300.Method_35284(string, class_27841);
    }

    public Class_41901 Method_558() {
        return this.Field_324;
    }

    public Class_25529 Method_559(Class_1061 class_1061, double d, double d2, double d3, float f, boolean bl, boolean bl2) {
        Class_25529 class_25529 = new Class_25529(this, class_1061, d, d2, d3, f, bl, bl2);
        class_25529.Method_25546();
        class_25529.Method_25544((177 & 17477) != 0);
        return class_25529;
    }

    public Class_37110 Method_560(Vec3 vec3, Vec3 vec32, boolean bl) {
        return this.Method_405(vec3, vec32, bl, (10242 & 520) != 0, (8193 & 14) != 0);
    }
}

