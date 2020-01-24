/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.common.util.concurrent.ListenableFuture
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import net.minecraft.util.Vec3;
import net.minecraft.world.NextTickListEntry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_2651
extends Class_283
implements Class_276 {
    private int Field_2652;
    private final TreeSet Field_2653 = new TreeSet();
    private static final List Field_2654;
    private final Class_2457 Field_2655;
    private boolean Field_2656;
    private int Field_2657;
    private final Class_36756 Field_2658;
    private final Map Field_2659 = Maps.newHashMap();
    private static final Logger Field_2660;
    public Class_18649 Field_2661;
    private final Class_7961 Field_2662;
    private final Class_13151 Field_2663;
    private Class_14597[] Field_2664;
    private final Set Field_2665 = Sets.newHashSet();
    private List Field_2666;
    protected final Class_42361 Field_2667 = new Class_42361(this);
    private final Class_7184 Field_2668 = new Class_7184();
    public boolean Field_2669;

    protected int Method_2670() {
        return this.Field_2655.Method_2616().Method_3151();
    }

    private boolean Method_2671() {
        return this.Field_2655.Method_2637();
    }

    public List Method_2672(Class_17665 class_17665, boolean bl) {
        Class_29480 class_29480 = class_17665.Method_17729();
        int n = (class_29480.Field_29483 << (16900 & 12365)) - (71 & 6418);
        int n2 = n + (23568 & -24527) + (8706 & -28542);
        int n3 = (class_29480.Field_29482 << (22821 & 8772)) - (-7662 & 386);
        int n4 = n3 + (-16015 & 2192) + (1190 & -12286);
        return this.Method_2678(new Class_42666(n, 524 & -24384, n3, n2, 12676 & 3352, n4), bl);
    }

    public Class_283 Method_2673() {
        this.\u0000strictfp = new Class_35273(this.\u0000strictfp);
        String string = Class_41901.Method_41907(this.\u0000strictfp);
        Class_41901 class_41901 = (Class_41901)this.\u0000strictfp.Method_35279(Class_41901.class, string);
        if (class_41901 == null) {
            this.\u0000strictfp = new Class_41901(this);
            this.\u0000strictfp.Method_35284(string, this.\u0000strictfp);
        } else {
            this.\u0000strictfp = class_41901;
            this.\u0000strictfp.Method_41924(this);
        }
        this.\u0000strictfp = new Class_29497(this.Field_2655);
        Class_44927 class_44927 = (Class_44927)this.\u0000strictfp.Method_35279(Class_44927.class, "scoreboard");
        if (class_44927 == null) {
            class_44927 = new Class_44927();
            this.\u0000strictfp.Method_35284("scoreboard", class_44927);
        }
        class_44927.Method_44940(this.\u0000strictfp);
        ((Class_29497)this.\u0000strictfp).Method_29519(class_44927);
        this.\u0000strictfp().Method_31478(this.\u0000strictfp.Method_31832(), this.\u0000strictfp.Method_31810());
        this.\u0000strictfp().Method_31483(this.\u0000strictfp.Method_31766());
        this.\u0000strictfp().Method_31471(this.\u0000strictfp.Method_31788());
        this.\u0000strictfp().Method_31487(this.\u0000strictfp.Method_31765());
        this.\u0000strictfp().Method_31472(this.\u0000strictfp.Method_31790());
        if (this.\u0000strictfp.Method_31770() > (6182117726446882618L & 7655424L)) {
            this.\u0000strictfp().Method_31481(this.\u0000strictfp.Method_31822(), this.\u0000strictfp.Method_31792(), this.\u0000strictfp.Method_31770());
        } else {
            this.\u0000strictfp().Method_31501(this.\u0000strictfp.Method_31822());
        }
        return this;
    }

    public void Method_2674() {
        if (this.\u0000strictfp.Method_31838() <= 0) {
            this.\u0000strictfp.Method_31816(this.\u0000%() + (9217 & 16389));
        }
        int n = this.\u0000strictfp.Method_31787();
        int n2 = this.\u0000strictfp.Method_31763();
        int n3 = 264 & 2081;
        while (this.\u0000strictfp(new Class_4751(n, -32416 & 16396, n2)).Method_3373() == Class_3713.Field_3718) {
            n += this.\u0000strictfp.nextInt(-16360 & 362) - this.\u0000strictfp.nextInt(2136 & 520);
            n2 += this.\u0000strictfp.nextInt(25 & 428) - this.\u0000strictfp.nextInt(268 & 5194);
            if (++n3 != (26384 & 10008)) continue;
        }
        this.\u0000strictfp.Method_31808(n);
        this.\u0000strictfp.Method_31819(n2);
    }

    public Class_1061 Method_2675(UUID uUID) {
        return (Class_1061)this.Field_2659.get(uUID);
    }

    public Class_3677 Method_2676(int n, int n2, int n3) {
        if (!this.\u0000, `(n, n2, n3)) {
            return Class_9265.Field_9351.Method_3293();
        }
        Class_17665 class_17665 = this.\u0000, `(n, n3);
        return class_17665.Method_17726(n, n2, n3);
    }

    public Class_2651(Class_2457 class_2457, Class_26655 class_26655, Class_31717 class_31717, int n, Class_2767 class_2767) {
        super(class_26655, class_31717, Class_18343.Method_18354(n), class_2767, (0 & 18552) != 0);
        Class_14597[] arrclass_14597 = new Class_14597[2178 & 22274];
        arrclass_14597[17456 & 2882] = new Class_14597(null);
        arrclass_14597[-15871 & 6201] = new Class_14597(null);
        this.Field_2664 = arrclass_14597;
        this.Field_2666 = Lists.newArrayList();
        this.Field_2655 = class_2457;
        this.Field_2662 = new Class_7961(this);
        this.Field_2663 = new Class_13151(this);
        this.\u0000strictfp.Method_18359(this);
        this.\u0000strictfp = this.Method_2685();
        this.Field_2658 = new Class_36756(this);
        this.\u0000= switch();
        this.\u0000, 2();
        this.\u0000strictfp().Method_31496(class_2457.Method_2567());
    }

    public void Method_2677() {
        this.Field_2657 = 512 & 16560;
    }

    public List Method_2678(Class_42666 class_42666, boolean bl) {
        ArrayList arrayList = null;
        for (int i = 580 & 16400; i < (26723 & 5146); ++i) {
            Iterator iterator = i == 0 ? this.Field_2653.iterator() : this.Field_2666.iterator();
            while (iterator.hasNext()) {
                NextTickListEntry nextTickListEntry = (NextTickListEntry)iterator.next();
                Class_4751 class_4751 = nextTickListEntry.position;
                if (class_4751.\u0000= final() < class_42666.Field_42668 || class_4751.\u0000= final() >= class_42666.Field_42670 || class_4751.\u0000strictfp() < class_42666.Field_42669 || class_4751.\u0000strictfp() >= class_42666.Field_42667) continue;
                if (bl) {
                    this.Field_2665.remove(nextTickListEntry);
                    iterator.remove();
                }
                if (arrayList == null) {
                    arrayList = Lists.newArrayList();
                }
                arrayList.add(nextTickListEntry);
            }
        }
        return arrayList;
    }

    protected void Method_2679() {
        this.Field_2656 = -26090 & 8192;
        for (Class_626 class_626 : this.\u0000strictfp) {
            if (!class_626.Method_822()) continue;
            class_626.Method_813((-30630 & 1697) != 0, (192 & -32765) != 0, (261 & -4093) != 0);
        }
        this.Method_2724();
    }

    public void Method_2680(Class_1061 class_1061, boolean bl) {
        if (!this.Method_2671() && (class_1061 instanceof Class_43406 || class_1061 instanceof Class_38054)) {
            class_1061.Method_1166();
        }
        if (!this.Method_2690() && class_1061 instanceof Class_31502) {
            class_1061.Method_1166();
        }
        super.Method_418(class_1061, bl);
    }

    public void Method_2681() {
        this.Field_2656 = -32565 & 10240;
        if (!this.\u0000strictfp.isEmpty()) {
            int n = 8224 & 3463;
            int n2 = 774 & -16336;
            for (Class_626 class_626 : this.\u0000strictfp) {
                if (class_626.Method_752()) {
                    ++n;
                    continue;
                }
                if (!class_626.Method_822()) continue;
                ++n2;
            }
            this.Field_2656 = n2 > 0 && n2 >= this.\u0000strictfp.size() - n ? 389 & 49 : 21986 & 10256;
        }
    }

    public void Method_2682(Class_9780 class_9780) {
        if (!this.\u0000strictfp.Method_31771()) {
            try {
                this.Method_2720(class_9780);
                if (this.\u0000strictfp.Method_31833() == Class_43755.Field_43756) {
                    this.Method_2714();
                }
                super.Method_495(class_9780);
            }
            catch (Throwable throwable) {
                Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Exception initializing level");
                try {
                    this.\u0000strictfp(class_13268);
                }
                catch (Throwable throwable2) {
                    // empty catch block
                }
                throw new Class_1809(class_13268);
            }
            this.\u0000strictfp.Method_31813((13041 & -32765) != 0);
        }
    }

    public void Method_2683(boolean bl, Class_2748 class_2748) {
        if (this.\u0000strictfp.Method_12172()) {
            if (class_2748 != null) {
                class_2748.Method_2752("Saving level");
            }
            this.Method_2707();
            if (class_2748 != null) {
                class_2748.Method_2751("Saving chunks");
            }
            this.\u0000strictfp.Method_12169(bl, class_2748);
            for (Class_17665 class_17665 : Lists.newArrayList((Iterable)this.Field_2661.Method_18672())) {
                if (class_17665 == null || this.Field_2663.Method_13175(class_17665.Field_17666, class_17665.Field_17668)) continue;
                this.Field_2661.Method_18676(class_17665.Field_17666, class_17665.Field_17668);
            }
        }
    }

    public void Method_2684(Class_1061 class_1061, byte by) {
        this.Method_2711().Method_7974(class_1061, new Class_23464(class_1061, by));
    }

    protected Class_12166 Method_2685() {
        Class_15769 class_15769 = this.\u0000strictfp.Method_26658(this.\u0000strictfp);
        this.Field_2661 = new Class_18649(this, class_15769, this.\u0000strictfp.Method_18373());
        return this.Field_2661;
    }

    public void Method_2686(Class_4751 class_4751, Class_3238 class_3238, int n, int n2) {
        NextTickListEntry nextTickListEntry = new NextTickListEntry(class_4751, class_3238);
        nextTickListEntry.setPriority(n2);
        if (class_3238.Method_3373() != Class_3713.Field_3718) {
            nextTickListEntry.setScheduledTime((long)n + this.\u0000strictfp.Method_31812());
        }
        if (!this.Field_2665.contains(nextTickListEntry) && this.Field_2665.add(nextTickListEntry)) {
            this.Field_2653.add(nextTickListEntry);
        }
    }

    public boolean Method_2687(Class_626 class_626, Class_4751 class_4751) {
        return (!this.Field_2655.Method_2636(this, class_4751, class_626) && this.\u0000strictfp().Method_31498(class_4751) ? -7921 & 641 : -32255 & 2152) != 0;
    }

    public Class_31871 Method_2688(Class_13693 class_13693, Class_4751 class_4751) {
        List list = this.\u0000, `().Method_12178(class_13693, class_4751);
        return list != null && !list.isEmpty() ? (Class_31871)Class_27139.Method_27144(this.\u0000strictfp, list) : null;
    }

    public void Method_2689(Class_40274 class_40274, boolean bl, double d, double d2, double d3, int n, double d4, double d5, double d6, double d7, int ... arrn) {
        Class_21029 class_21029 = new Class_21029(class_40274, bl, (float)d, (float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, n, arrn);
        for (int i = 17 & 14628; i < this.\u0000strictfp.size(); ++i) {
            \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 = (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)this.\u0000strictfp.get(i);
            Class_4751 class_4751 = \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp();
            double d8 = class_4751.\u0000, `(d, d2, d3);
            if (!(d8 <= 0.6935483870967742 * 369.1162790697674) && (!bl || !(d8 <= 4.2 * 15603.809523809523))) continue;
            \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp.Method_20821(class_21029);
        }
    }

    private boolean Method_2690() {
        return this.Field_2655.Method_2552();
    }

    public void Method_2691() {
        super.Method_373();
        if (this.\u0000strictfp().Method_31839() && this.\u0000strictfp() != Class_26801.Field_26804) {
            this.\u0000strictfp().Method_31801(Class_26801.Field_26804);
        }
        this.\u0000strictfp.Method_18376().Method_31932();
        if (this.Method_2701()) {
            if (this.\u0000strictfp().Method_7529("doDaylightCycle")) {
                long l = this.\u0000strictfp.Method_31806() + (-433474309281784384L & 433474307459415493L);
                this.\u0000strictfp.Method_31820(l - l % (3830268187934482379L & -3830268189606773296L));
            }
            this.Method_2679();
        }
        this.\u0000strictfp.Method_2789("mobSpawner");
        if (this.\u0000strictfp().Method_7529("doMobSpawning") && this.\u0000strictfp.Method_31833() != Class_43755.Field_43756) {
            this.Field_2668.Method_7187(this, this.\u0000%, this.\u0000, for, (this.\u0000strictfp.Method_31812() % (8946914010958136721L & 4723162L) == (44325380L & -2370314934954162848L) ? 13441 & 16385 : 16770 & -24532) != 0);
        }
        this.\u0000strictfp.Method_2783("chunkSource");
        this.\u0000strictfp.Method_12170();
        int n = this.\u0000strictfp(1.0f);
        if (n != this.\u0000, `()) {
            this.\u0000, `(n);
        }
        this.\u0000strictfp.Method_31803(this.\u0000strictfp.Method_31812() + (1177162817L & 8877547612236947723L));
        if (this.\u0000strictfp().Method_7529("doDaylightCycle")) {
            this.\u0000strictfp.Method_31820(this.\u0000strictfp.Method_31806() + (7865889361863170823L & 546112513L));
        }
        this.\u0000strictfp.Method_2783("tickPending");
        this.Method_2725((5136 & 2381) != 0);
        this.\u0000strictfp.Method_2783("tickBlocks");
        this.Method_2703();
        this.\u0000strictfp.Method_2783("chunkMap");
        this.Field_2663.Method_13172();
        this.\u0000strictfp.Method_2783("village");
        this.\u0000strictfp.Method_41919();
        this.Field_2667.Method_42375();
        this.\u0000strictfp.Method_2783("portalForcer");
        this.Field_2658.Method_36762(this.\u0000, `());
        this.\u0000strictfp.Method_2790();
        this.Method_2726();
    }

    public List Method_2692(int n, int n2, int n3, int n4, int n5, int n6) {
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 25218 & 1280; i < this.\u0000, `.size(); ++i) {
            Class_4879 class_4879 = (Class_4879)this.\u0000, `.get(i);
            Class_4751 class_4751 = class_4879.Method_4903();
            if (class_4751.\u0000= final() < n || class_4751.\u0000, `() < n2 || class_4751.\u0000strictfp() < n3 || class_4751.\u0000= final() >= n4 || class_4751.\u0000, `() >= n5 || class_4751.\u0000strictfp() >= n6) continue;
            arrayList.add(class_4879);
        }
        return arrayList;
    }

    public boolean Method_2693(Class_4751 class_4751, Class_3238 class_3238) {
        NextTickListEntry nextTickListEntry = new NextTickListEntry(class_4751, class_3238);
        return this.Field_2666.contains(nextTickListEntry);
    }

    public Class_4751 Method_2694() {
        return this.\u0000strictfp.Method_18369();
    }

    public void Method_2695() {
        if (this.\u0000strictfp.Method_12172()) {
            this.\u0000strictfp.Method_12173();
        }
    }

    public void Method_2696() {
        if (this.\u0000strictfp.isEmpty()) {
            int n = this.Field_2657;
            this.Field_2657 = n + (513 & 163);
            if (n >= (-26960 & 1524)) {
                return;
            }
        } else {
            this.Method_2677();
        }
        super.Method_379();
    }

    protected void Method_2697() {
        Class_4751 class_4751;
        int n;
        int n2;
        Class_29569 class_29569 = new Class_29569(Field_2654, 1498 & 21007);
        for (int i = -14832 & 2511; i < (24586 & 222) && !class_29569.Method_29572(this, this.\u0000strictfp, class_4751 = this.\u0000= final(new Class_4751(n = this.\u0000strictfp.Method_31787() + this.\u0000strictfp.nextInt(102 & 5383) - this.\u0000strictfp.nextInt(2078 & 25702), 13217 & 2112, n2 = this.\u0000strictfp.Method_31763() + this.\u0000strictfp.nextInt(1046 & 19206) - this.\u0000strictfp.nextInt(-13658 & 4182))).Method_4769()); ++i) {
        }
    }

    public void Method_2698(Class_40274 class_40274, double d, double d2, double d3, int n, double d4, double d5, double d6, double d7, int ... arrn) {
        this.Method_2689(class_40274, (323 & 148) != 0, d, d2, d3, n, d4, d5, d6, d7, arrn);
    }

    public void Method_2699(Class_4751 class_4751, Class_3238 class_3238, int n) {
        this.Method_2723(class_4751, class_3238, n, -31199 & 2452);
    }

    public Class_25529 Method_2700(Class_1061 class_1061, double d, double d2, double d3, float f, boolean bl, boolean bl2) {
        Class_25529 class_25529 = new Class_25529(this, class_1061, d, d2, d3, f, bl, bl2);
        class_25529.Method_25546();
        class_25529.Method_25544((17412 & 14355) != 0);
        if (!bl2) {
            class_25529.Method_25541();
        }
        for (Class_626 class_626 : this.\u0000strictfp) {
            if (!(class_626.\u0000strictfp(d, d2, d3) < 131072.0 * 0.03125)) continue;
            ((\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)class_626).\u0000strictfp.Method_20821(new Class_34227(d, d2, d3, f, class_25529.Method_25542(), (Vec3)class_25529.Method_25543().get(class_626)));
        }
        return class_25529;
    }

    public boolean Method_2701() {
        if (this.Field_2656 && !this.\u0000, `) {
            for (Class_626 class_626 : this.\u0000strictfp) {
                if (!class_626.Method_752() && class_626.Method_765()) continue;
                return (16913 & -32702) != 0;
            }
            return (2307 & 4145) != 0;
        }
        return (16640 & 8737) != 0;
    }

    public boolean Method_2702(Class_13693 class_13693, Class_31871 class_31871, Class_4751 class_4751) {
        List list = this.\u0000, `().Method_12178(class_13693, class_4751);
        return list != null && !list.isEmpty() ? list.contains(class_31871) : 12288 & 1160;
    }

    protected void Method_2703() {
        super.Method_533();
        if (this.\u0000strictfp.Method_31833() == Class_43755.Field_43756) {
            Class_20759 class_20759 = this.\u0000strictfp.Method_44923();
            while (class_20759.hasNext()) {
                Class_29480 class_29480 = (Class_29480)class_20759.next();
                this.\u0000strictfp(class_29480.Field_29483, class_29480.Field_29482).Method_17761((-32637 & 296) != 0);
            }
        } else {
            int n = 26820 & 512;
            int n2 = 0 & -19127;
            Class_20759 class_20759 = this.\u0000strictfp.Method_44923();
            while (class_20759.hasNext()) {
                Object object;
                int n3;
                Class_29480 class_29480 = (Class_29480)class_20759.next();
                int n4 = class_29480.Field_29483 * (6710 & 16528);
                int n5 = class_29480.Field_29482 * (10514 & 4660);
                this.\u0000strictfp.Method_2789("getChunk");
                Class_17665 class_17665 = this.\u0000strictfp(class_29480.Field_29483, class_29480.Field_29482);
                this.\u0000strictfp(n4, n5, class_17665);
                this.\u0000strictfp.Method_2783("tickChunk");
                class_17665.Method_17761((-31743 & 512) != 0);
                this.\u0000strictfp.Method_2783("thunder");
                if (this.\u0000strictfp.nextInt(-818553114 & 541173409) == 0 && this.\u0000
                () && this.\u0000strictfp()) {
                    this.\u0000strictfp = this.\u0000strictfp * (-32221 & 6155) + (1013904223 & 1014953983);
                    n3 = this.\u0000strictfp >> (18210 & 2138);
                    object = this.Method_2705(new Class_4751(n4 + (n3 & (31 & -32753)), 8456 & 5767, n5 + (n3 >> (2568 & 20920) & (5135 & 24607))));
                    if (this.\u0000%((Class_4751)object)) {
                        this.Method_2708(new Class_27363(this, object.\u0000= final(), object.\u0000, `(), object.\u0000strictfp()));
                    }
                }
                this.\u0000strictfp.Method_2783("iceandsnow");
                if (this.\u0000strictfp.nextInt(-28492 & 9043) == 0) {
                    this.\u0000strictfp = this.\u0000strictfp * (6275 & -7925) + (2087648095 & -1133579425);
                    n3 = this.\u0000strictfp >> (-24446 & 16422);
                    object = this.\u0000, `(new Class_4751(n4 + (n3 & (-2033 & 527)), 1042 & 15040, n5 + (n3 >> (15642 & 140) & (-23873 & 6159))));
                    Class_4751 class_4751 = ((Class_4751)object).Method_4782();
                    if (this.\u0000, #(class_4751)) {
                        this.\u0000, `(class_4751, (Class_3436)Class_9265.Field_9298.Method_3293());
                    }
                    if (this.\u0000
                    () && this.\u0000, `((Class_4751)object, (1089 & -28619) != 0)) {
                        this.\u0000, `((Class_4751)object, (Class_3436)Class_9265.Field_9458.Method_3293());
                    }
                    if (this.\u0000
                    () && this.\u0000strictfp(class_4751).Method_17400()) {
                        this.\u0000strictfp(class_4751).Method_3442().Method_3358(this, class_4751);
                    }
                }
                this.\u0000strictfp.Method_2783("tickBlocks");
                n3 = this.\u0000strictfp().Method_7531("randomTickSpeed");
                if (n3 > 0) {
                    object = class_17665.Method_17713();
                    int n6 = ((Class_30238[])object).length;
                    for (int i = 8192 & -31998; i < n6; ++i) {
                        Class_30238 class_30238 = object[i];
                        if (class_30238 == null || !class_30238.Method_30259()) continue;
                        for (int j = 4096 & 1300; j < n3; ++j) {
                            this.\u0000strictfp = this.\u0000strictfp * (-26397 & 9219) + (-1133579425 & 2113861599);
                            int n7 = this.\u0000strictfp >> (-13310 & 12866);
                            int n8 = n7 & (-24433 & 4959);
                            int n9 = n7 >> (6153 & 17976) & (29967 & -32753);
                            int n10 = n7 >> (1306 & -16239) & (47 & -14241);
                            ++n2;
                            Class_3677 class_3677 = class_30238.Method_30262(n8, n10, n9);
                            Class_3238 class_3238 = class_3677.Method_3442();
                            if (!class_3238.Method_3417()) continue;
                            ++n;
                            class_3238.Method_3300(this, new Class_4751(n8 + n4, n10 + class_30238.Method_30253(), n9 + n5), class_3677, this.\u0000strictfp);
                        }
                    }
                }
                this.\u0000strictfp.Method_2790();
            }
        }
    }

    protected void Method_2704(Class_1061 class_1061) {
        super.Method_543(class_1061);
        this.\u0000strictfp.Method_29446(class_1061.Method_1311());
        this.Field_2659.remove(class_1061.Method_1194());
        Class_1061[] arrclass_1061 = class_1061.Method_1275();
        if (arrclass_1061 != null) {
            for (int i = 832 & 3111; i < arrclass_1061.length; ++i) {
                this.\u0000strictfp.Method_29446(arrclass_1061[i].Method_1311());
            }
        }
    }

    protected Class_4751 Method_2705(Class_4751 class_4751) {
        Class_4751 class_47512 = this.\u0000, `(class_4751);
        Class_10997 class_10997 = new Class_10997(class_47512, new Class_4751(class_47512.\u0000= final(), this.\u0000= int(), class_47512.\u0000strictfp())).Method_11017(0.8372093023255814 * 3.583333333333333, 0.631578947368421 * 4.75, 2.930232558139535 * 1.0238095238095237);
        List list = this.\u0000strictfp(Class_859.class, class_10997, (Predicate)new Class_10497(this));
        return !list.isEmpty() ? ((Class_859)list.get(this.\u0000strictfp.nextInt(list.size()))).\u0000strictfp() : class_47512;
    }

    public Class_2457 Method_2706() {
        return this.Field_2655;
    }

    protected void Method_2707() {
        this.\u0000, #();
        this.\u0000strictfp.Method_31756(this.\u0000strictfp().Method_31475());
        this.\u0000strictfp.Method_31780(this.\u0000strictfp().Method_31500());
        this.\u0000strictfp.Method_31786(this.\u0000strictfp().Method_31495());
        this.\u0000strictfp.Method_31783(this.\u0000strictfp().Method_31470());
        this.\u0000strictfp.Method_31842(this.\u0000strictfp().Method_31488());
        this.\u0000strictfp.Method_31836(this.\u0000strictfp().Method_31486());
        this.\u0000strictfp.Method_31830(this.\u0000strictfp().Method_31482());
        this.\u0000strictfp.Method_31826(this.\u0000strictfp().Method_31497());
        this.\u0000strictfp.Method_31793(this.\u0000strictfp().Method_31480());
        this.\u0000strictfp.Method_26659(this.\u0000strictfp, this.Field_2655.Method_2616().Method_3154());
        this.\u0000strictfp.Method_35280();
    }

    public boolean Method_2708(Class_1061 class_1061) {
        if (super.Method_359(class_1061)) {
            this.Field_2655.Method_2616().Method_3109(class_1061.Field_1130, class_1061.Method_1324(), class_1061.Field_1106, 2.096774193548387 * 244.1846153846154, this.\u0000strictfp.Method_18379(), new Class_30898(class_1061));
            return (-31663 & 20995) != 0;
        }
        return (4352 & -16384) != 0;
    }

    protected void Method_2709() {
        boolean bl = this.\u0000
        ();
        super.Method_438();
        if (this.\u0000
         != this.\u0000= final) {
            this.Field_2655.Method_2616().Method_3108(new Class_27146(527 & 21943, this.\u0000= final), this.\u0000strictfp.Method_18379());
        }
        if (this.\u0000strictfp != this.\u0000, `) {
            this.Field_2655.Method_2616().Method_3108(new Class_27146(8713 & -11156, this.\u0000, `), this.\u0000strictfp.Method_18379());
        }
        if (bl != this.\u0000
        ()) {
            if (bl) {
                this.Field_2655.Method_2616().Method_3091(new Class_27146(130 & -25998, 0.0f));
            } else {
                this.Field_2655.Method_2616().Method_3091(new Class_27146(-6079 & 153, 0.0f));
            }
            this.Field_2655.Method_2616().Method_3091(new Class_27146(-32185 & 8615, this.\u0000= final));
            this.Field_2655.Method_2616().Method_3091(new Class_27146(22169 & 44, this.\u0000, `));
        }
    }

    public boolean Method_2710() {
        return this.Field_2655.Method_2564();
    }

    public Class_7961 Method_2711() {
        return this.Field_2662;
    }

    public void Method_2712(Class_4751 class_4751, Class_3238 class_3238, int n, int n2) {
        Class_23014 class_23014 = new Class_23014(class_4751, class_3238, n, n2);
        for (Class_23014 class_230142 : this.Field_2664[this.Field_2652]) {
            if (!class_230142.Method_23019(class_23014)) continue;
            return;
        }
        this.Field_2664[this.Field_2652].add(class_23014);
    }

    public Class_3677 Method_2713(Class_4751 class_4751) {
        return this.Method_2676(class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp());
    }

    private void Method_2714() {
        this.\u0000strictfp.Method_31823((8323 & 304) != 0);
        this.\u0000strictfp.Method_31807((8193 & 21505) != 0);
        this.\u0000strictfp.Method_31828((20992 & -32268) != 0);
        this.\u0000strictfp.Method_31818((4484 & -13823) != 0);
        this.\u0000strictfp.Method_31825(1004198440 & 1000262339);
        this.\u0000strictfp.Method_31820(-5888557824320415885L & 5888557823564191600L);
        this.\u0000strictfp.Method_31757(Class_35650.Field_35654);
        this.\u0000strictfp.Method_31829((-21995 & 138) != 0);
        this.\u0000strictfp.Method_31801(Class_26801.Field_26803);
        this.\u0000strictfp.Method_31837((16455 & -23751) != 0);
        this.\u0000strictfp().Method_7528("doDaylightCycle", "false");
    }

    protected void Method_2715(Class_1061 class_1061) {
        super.Method_468(class_1061);
        this.\u0000strictfp.Method_29453(class_1061.Method_1311(), class_1061);
        this.Field_2659.put(class_1061.Method_1194(), class_1061);
        Class_1061[] arrclass_1061 = class_1061.Method_1275();
        if (arrclass_1061 != null) {
            for (int i = -30714 & 5121; i < arrclass_1061.length; ++i) {
                this.\u0000strictfp.Method_29453(arrclass_1061[i].Method_1311(), arrclass_1061[i]);
            }
        }
    }

    static {
        Field_2660 = LogManager.getLogger();
        Object[] arrobject = new Class_36948[-6902 & 587];
        arrobject[17415 & 40] = new Class_36948(Class_10527.Field_10616, 17908 & -24056, 1027 & 133, 8259 & -32625, 8266 & -16213);
        arrobject[323 & 12321] = new Class_36948(Class_1956.Method_1981(Class_9265.Field_9379), -30608 & 20485, -15039 & 8229, 16535 & -32669, -30517 & 1306);
        arrobject[8710 & 17554] = new Class_36948(Class_1956.Method_1981(Class_9265.Field_9383), 320 & 674, 2069 & 16905, 9283 & 23335, -15858 & 5531);
        arrobject[16963 & -29677] = new Class_36948(Class_10527.Field_10685, 1056 & -28656, -31799 & 24581, 5443 & 2053, -24565 & 7367);
        arrobject[4 & -31098] = new Class_36948(Class_10527.Field_10608, 96 & -31092, -32667 & 8459, -32239 & 12577, 16423 & -18683);
        arrobject[9349 & 2375] = new Class_36948(Class_10527.Field_10592, 20561 & 10504, 897 & 3, 517 & -29437, -29565 & 16963);
        arrobject[-32762 & 17294] = new Class_36948(Class_10527.Field_10571, 14384 & 1028, 2131 & -16243, -20183 & 18451, 2053 & -23323);
        arrobject[-2289 & 2103] = new Class_36948(Class_10527.Field_10676, -26594 & 8897, -28670 & 17186, 26915 & -32189, 4965 & 16533);
        arrobject[24584 & 4698] = new Class_36948(Class_10527.Field_10630, 2306 & -7136, 8250 & 18946, 3 & 2323, 3107 & 17159);
        arrobject[-31975 & 26639] = new Class_36948(Class_1956.Method_1981(Class_9265.Field_9447), 4492 & 16419, 513 & 17633, 395 & -32221, 6187 & -31158);
        Field_2654 = Lists.newArrayList((Object[])arrobject);
    }

    public Class_13151 Method_2716() {
        return this.Field_2663;
    }

    public void Method_2717() {
        this.\u0000strictfp.Method_26656();
    }

    private void Method_2718() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public ListenableFuture Method_2719(Runnable runnable) {
        return this.Field_2655.Method_2526(runnable);
    }

    private void Method_2720(Class_9780 class_9780) {
        if (!this.\u0000strictfp.Method_18362()) {
            this.\u0000strictfp.Method_31785(Class_4751.Field_4760.Method_4766(this.\u0000strictfp.Method_18363()));
        } else if (this.\u0000strictfp.Method_31833() == Class_43755.Field_43756) {
            this.\u0000strictfp.Method_31785(Class_4751.Field_4760.Method_4769());
        } else {
            this.\u0000= final = 33 & -30523;
            Class_31916 class_31916 = this.\u0000strictfp.Method_18376();
            List list = class_31916.Method_31923();
            Random random = new Random(this.\u0000strictfp());
            Class_4751 class_4751 = class_31916.Method_31933(140 & 4130, 22659 & 1280, 1281 & -29902, list, random);
            int n = -31552 & 2586;
            int n2 = this.\u0000strictfp.Method_18363();
            int n3 = 10390 & -31743;
            if (class_4751 != null) {
                n = class_4751.\u0000= final();
                n3 = class_4751.\u0000strictfp();
            } else {
                Field_2660.warn("Unable to find spawn biome");
            }
            int n4 = 0 & -11447;
            while (!this.\u0000strictfp.Method_18356(n, n3)) {
                n += random.nextInt(17475 & 4160) - random.nextInt(192 & -3008);
                n3 += random.nextInt(324 & 15082) - random.nextInt(4202 & 17617);
                if (++n4 != (1022 & 4072)) continue;
            }
            this.\u0000strictfp.Method_31785(new Class_4751(n, n2, n3));
            this.\u0000= final = 16977 & -28540;
            if (class_9780.Method_9801()) {
                this.Method_2697();
            }
        }
    }

    public Class_36756 Method_2721() {
        return this.Field_2658;
    }

    private boolean Method_2722(Class_23014 class_23014) {
        Class_3436 class_3436 = this.\u0000strictfp(class_23014.Method_23021());
        return class_3436.Method_3442() == class_23014.Method_23025() ? class_3436.Method_3442().Method_3406(this, class_23014.Method_23021(), class_3436, class_23014.Method_23020(), class_23014.Method_23024()) : -12285 & 8452;
    }

    public void Method_2723(Class_4751 class_4751, Class_3238 class_3238, int n, int n2) {
        NextTickListEntry nextTickListEntry = new NextTickListEntry(class_4751, class_3238);
        int n3 = 256 & 600;
        if (this.\u0000= int && class_3238.Method_3373() != Class_3713.Field_3718) {
            if (class_3238.Method_3294()) {
                Class_3436 class_3436;
                n3 = 3213 & 840;
                if (this.\u0000strictfp(nextTickListEntry.position.Method_4791(-n3, -n3, -n3), nextTickListEntry.position.Method_4791(n3, n3, n3)) && (class_3436 = this.\u0000strictfp(nextTickListEntry.position)).Method_3442().Method_3373() != Class_3713.Field_3718 && class_3436.Method_3442() == nextTickListEntry.getBlock()) {
                    class_3436.Method_3442().Method_3413(this, nextTickListEntry.position, class_3436, this.\u0000strictfp);
                }
                return;
            }
            n = -19933 & 257;
        }
        if (this.\u0000strictfp(class_4751.Method_4791(-n3, -n3, -n3), class_4751.Method_4791(n3, n3, n3))) {
            if (class_3238.Method_3373() != Class_3713.Field_3718) {
                nextTickListEntry.setScheduledTime((long)n + this.\u0000strictfp.Method_31812());
                nextTickListEntry.setPriority(n2);
            }
            if (!this.Field_2665.contains(nextTickListEntry) && this.Field_2665.add(nextTickListEntry)) {
                this.Field_2653.add(nextTickListEntry);
            }
        }
    }

    private void Method_2724() {
        this.\u0000strictfp.Method_31799(16386 & 1552);
        this.\u0000strictfp.Method_31828((198 & -19192) != 0);
        this.\u0000strictfp.Method_31775(804 & 6211);
        this.\u0000strictfp.Method_31818((-32704 & 129) != 0);
    }

    public boolean Method_2725(boolean bl) {
        NextTickListEntry nextTickListEntry;
        if (this.\u0000strictfp.Method_31833() == Class_43755.Field_43756) {
            return (18440 & 8448) != 0;
        }
        int n = this.Field_2653.size();
        if (n != this.Field_2665.size()) {
            throw new IllegalStateException("TickNextTick list out of synch");
        }
        if (n > (25578 & 5097)) {
            n = -31766 & 19452;
        }
        this.\u0000strictfp.Method_2789("cleaning");
        for (int i = -28588 & 801; i < n; ++i) {
            nextTickListEntry = (NextTickListEntry)this.Field_2653.first();
            if (!bl && nextTickListEntry.scheduledTime > this.\u0000strictfp.Method_31812()) break;
            this.Field_2653.remove(nextTickListEntry);
            this.Field_2665.remove(nextTickListEntry);
            this.Field_2666.add(nextTickListEntry);
        }
        this.\u0000strictfp.Method_2790();
        this.\u0000strictfp.Method_2789("ticking");
        Iterator iterator = this.Field_2666.iterator();
        while (iterator.hasNext()) {
            nextTickListEntry = (NextTickListEntry)iterator.next();
            iterator.remove();
            int n2 = 320 & 16920;
            if (this.\u0000strictfp(nextTickListEntry.position.Method_4791(-n2, -n2, -n2), nextTickListEntry.position.Method_4791(n2, n2, n2))) {
                Class_3436 class_3436 = this.\u0000strictfp(nextTickListEntry.position);
                if (class_3436.Method_3442().Method_3373() == Class_3713.Field_3718 || !Class_3238.Method_3335(class_3436.Method_3442(), nextTickListEntry.getBlock())) continue;
                try {
                    class_3436.Method_3442().Method_3413(this, nextTickListEntry.position, class_3436, this.\u0000strictfp);
                    continue;
                }
                catch (Throwable throwable) {
                    Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Exception while ticking a block");
                    Class_13220 class_13220 = class_13268.Method_13280("Block being ticked");
                    Class_13220.Method_13234(class_13220, nextTickListEntry.position, class_3436);
                    throw new Class_1809(class_13268);
                }
            }
            this.Method_2699(nextTickListEntry.position, nextTickListEntry.getBlock(), 18689 & 4);
        }
        this.\u0000strictfp.Method_2790();
        this.Field_2666.clear();
        return (!this.Field_2653.isEmpty() ? 8237 & -28799 : -6587 & 4154) != 0;
    }

    private void Method_2726() {
        while (!this.Field_2664[this.Field_2652].isEmpty()) {
            int n = this.Field_2652;
            this.Field_2652 ^= -26591 & 651;
            for (Class_23014 class_23014 : this.Field_2664[n]) {
                if (!this.Method_2722(class_23014)) continue;
                this.Field_2655.Method_2616().Method_3109(class_23014.Method_23021().\u0000= final(), class_23014.Method_23021().\u0000, `(), class_23014.Method_23021().\u0000strictfp(), 137.84615384615384 * 0.4642857142857143, this.\u0000strictfp.Method_18379(), new Class_30753(class_23014.Method_23021(), class_23014.Method_23025(), class_23014.Method_23020(), class_23014.Method_23024()));
            }
            this.Field_2664[n].clear();
        }
    }
}

