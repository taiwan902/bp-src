/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_36610 {
    private int Field_36611;
    final Class_13151 Field_36612;
    private final List Field_36613;
    private int Field_36614;
    private final Class_29480 Field_36615;
    private short[] Field_36616;
    private long Field_36617;

    private void Method_36618(Class_17665 class_17665) {
        class_17665.Method_17722(class_17665.Method_17700() + Class_13151.Method_13177(this.Field_36612).\u0000, `() - this.Field_36617);
        this.Field_36617 = Class_13151.Method_13177(this.Field_36612).\u0000, `();
    }

    public void Method_36619() {
        this.Method_36618(Class_13151.Method_13177(this.Field_36612).\u0000strictfp(this.Field_36615.Field_29483, this.Field_36615.Field_29482));
    }

    private void Method_36620(Class_4879 class_4879) {
        Class_1486 class_1486;
        if (class_4879 != null && (class_1486 = class_4879.Method_4889()) != null) {
            this.Method_36628(class_1486);
        }
    }

    public void Method_36621(\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2) {
        if (this.Field_36613.contains((Object)\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2)) {
            Object[] arrobject = new Object[27663 & -32653];
            arrobject[4356 & 2176] = \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2;
            arrobject[11785 & 20547] = this.Field_36615.Field_29483;
            arrobject[3395 & 28682] = this.Field_36615.Field_29482;
            Class_13151.Method_13169().debug("Failed to add player. {} already is in chunk {}, {}", arrobject);
        } else {
            if (this.Field_36613.isEmpty()) {
                this.Field_36617 = Class_13151.Method_13177(this.Field_36612).\u0000, `();
            }
            this.Field_36613.add(\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2);
            \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp.add(this.Field_36615);
        }
    }

    public Class_36610(Class_13151 class_13151, int n, int n2) {
        this.Field_36612 = class_13151;
        this.Field_36613 = Lists.newArrayList();
        this.Field_36616 = new short[96 & -32309];
        this.Field_36615 = new Class_29480(n, n2);
        class_13151.Method_13168().Field_2661.Method_18666(n, n2);
    }

    public void Method_36622(int n, int n2, int n3) {
        if (this.Field_36614 == 0) {
            Class_13151.Method_13164(this.Field_36612).add(this);
        }
        this.Field_36611 |= (581 & 10385) << (n2 >> (-32636 & 3388));
        if (this.Field_36614 < (19650 & 4161)) {
            short s = (short)(n << (575 & 1164) | n3 << (-31672 & 31016) | n2);
            for (int i = 8221 & -31808; i < this.Field_36614; ++i) {
                if (this.Field_36616[i] != s) continue;
                return;
            }
            int n4 = this.Field_36614;
            this.Field_36614 = n4 + (-15285 & 11185);
            this.Field_36616[n4] = s;
        }
    }

    public void Method_36623(\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2) {
        if (this.Field_36613.contains((Object)\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2)) {
            Class_17665 class_17665 = Class_13151.Method_13177(this.Field_36612).\u0000strictfp(this.Field_36615.Field_29483, this.Field_36615.Field_29482);
            if (class_17665.Method_17731()) {
                \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp.Method_20821(new Class_36853(class_17665, (3187 & 8201) != 0, -24063 & 2186));
            }
            this.Field_36613.remove((Object)\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2);
            \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp.remove(this.Field_36615);
            if (this.Field_36613.isEmpty()) {
                long l = (long)this.Field_36615.Field_29483 + (4880465752563384319L & -4880465750415900673L) | (long)this.Field_36615.Field_29482 + (4083862963990036479L & -4083862961842552833L) << (8608 & 4733);
                this.Method_36618(class_17665);
                Class_13151.Method_13170(this.Field_36612).Method_14387(l);
                Class_13151.Method_13161(this.Field_36612).remove(this);
                if (this.Field_36614 > 0) {
                    Class_13151.Method_13164(this.Field_36612).remove(this);
                }
                this.Field_36612.Method_13168().Field_2661.Method_18676(this.Field_36615.Field_29483, this.Field_36615.Field_29482);
            }
        }
    }

    public void Method_36624() {
        if (this.Field_36614 != 0) {
            if (this.Field_36614 == (409 & -22011)) {
                int n = (this.Field_36616[4736 & -14063] >> (4172 & -8017) & (21519 & 223)) + this.Field_36615.Field_29483 * (8276 & -30568);
                int n2 = this.Field_36616[4 & 24673] & (-32513 & 16639);
                int n3 = (this.Field_36616[6276 & -31720] >> (8730 & 2092) & (4431 & 26287)) + this.Field_36615.Field_29482 * (152 & 16721);
                Class_4751 class_4751 = new Class_4751(n, n2, n3);
                this.Method_36628(new Class_26313(Class_13151.Method_13177(this.Field_36612), class_4751));
                if (Class_13151.Method_13177(this.Field_36612).\u0000strictfp(class_4751).Method_3442().Method_3339()) {
                    this.Method_36620(Class_13151.Method_13177(this.Field_36612).\u0000strictfp(class_4751));
                }
            } else if (this.Field_36614 == (31955 & 352)) {
                int n = this.Field_36615.Field_29483 * (2197 & -28368);
                int n4 = this.Field_36615.Field_29482 * (10265 & -32490);
                this.Method_36628(new Class_36853(Class_13151.Method_13177(this.Field_36612).\u0000strictfp(this.Field_36615.Field_29483, this.Field_36615.Field_29482), (-12287 & 1528) != 0, this.Field_36611));
                for (int i = 2250 & -24272; i < (1936 & 12370); ++i) {
                    if ((this.Field_36611 & (1403 & -30207) << i) == 0) continue;
                    int n5 = i << (16454 & 9116);
                    List list = Class_13151.Method_13177(this.Field_36612).Method_2692(n, n5, n4, n + (176 & -16039), n5 + (53 & 80), n4 + (1236 & 16402));
                    for (int j = 576 & 14380; j < list.size(); ++j) {
                        this.Method_36620((Class_4879)list.get(j));
                    }
                }
            } else {
                this.Method_36628(new Class_24560(this.Field_36614, this.Field_36616, Class_13151.Method_13177(this.Field_36612).\u0000strictfp(this.Field_36615.Field_29483, this.Field_36615.Field_29482)));
                for (int i = 8432 & 18700; i < this.Field_36614; ++i) {
                    int n = (this.Field_36616[i] >> (-15474 & 1085) & (271 & -24545)) + this.Field_36615.Field_29483 * (11026 & 5264);
                    int n6 = this.Field_36616[i] & (26367 & -30465);
                    int n7 = (this.Field_36616[i] >> (587 & -16372) & (2095 & 17679)) + this.Field_36615.Field_29482 * (13714 & 18456);
                    Class_4751 class_4751 = new Class_4751(n, n6, n7);
                    if (!Class_13151.Method_13177(this.Field_36612).\u0000strictfp(class_4751).Method_3442().Method_3339()) continue;
                    this.Method_36620(Class_13151.Method_13177(this.Field_36612).\u0000strictfp(class_4751));
                }
            }
            this.Field_36614 = 1808 & -28570;
            this.Field_36611 = 576 & 17408;
        }
    }

    private void Method_36625() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static Class_29480 Method_36626(Class_36610 class_36610) {
        return class_36610.Field_36615;
    }

    static List Method_36627(Class_36610 class_36610) {
        return class_36610.Field_36613;
    }

    public void Method_36628(Class_1486 class_1486) {
        for (int i = 132 & 848; i < this.Field_36613.size(); ++i) {
            \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 = (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)this.Field_36613.get(i);
            if (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp.contains(this.Field_36615)) continue;
            \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp.Method_20821(class_1486);
        }
    }
}

