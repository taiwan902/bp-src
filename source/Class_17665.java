/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Queues
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Predicate;
import com.google.common.collect.Queues;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_17665 {
    public final int Field_17666;
    public boolean Field_17667;
    public final int Field_17668;
    private boolean Field_17669;
    private long Field_17670;
    private final int[] Field_17671 = new int[12048 & 16641];
    private boolean Field_17672;
    private int Field_17673 = -18432 & 21008;
    private long Field_17674;
    private final Class_283 Field_17675;
    private boolean Field_17676;
    private final Map Field_17677 = new HashMap();
    private final boolean[] Field_17678 = new boolean[-21056 & 816];
    public boolean Field_17679;
    private boolean Field_17680;
    private ConcurrentLinkedQueue Field_17681 = Queues.newConcurrentLinkedQueue();
    private boolean Field_17682;
    public long Field_17683;
    private final int[] Field_17684;
    private boolean Field_17685;
    private boolean Field_17686;
    public AtomicInteger Field_17687 = new AtomicInteger();
    private static final Logger Field_17688 = LogManager.getLogger();
    private int Field_17689;
    private final Class_30238[] Field_17690 = new Class_30238[1468 & -5614];
    public boolean Field_17691;
    private final byte[] Field_17692 = new byte[-30372 & 21376];
    private final Class_30043[] Field_17693 = new Class_30043[-32624 & 6198];

    public void Method_17694(Class_1061 class_1061, int n) {
        if (n < 0) {
            n = 19000 & -27389;
        }
        if (n >= this.Field_17693.length) {
            n = this.Field_17693.length - (1057 & -28413);
        }
        this.Field_17693[n].Method_30055(class_1061);
    }

    private void Method_17695() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private int Method_17696(int n, int n2, int n3) {
        if (n2 >> (2156 & 132) >= this.Field_17690.length) {
            return 8200 & 1060;
        }
        Class_30238 class_30238 = this.Field_17690[n2 >> (108 & -28540)];
        return class_30238 != null ? class_30238.Method_30260(n, n2 & (1055 & -22257), n3) : -30366 & 16408;
    }

    private void Method_17697(int n, int n2, int n3) {
        int n4 = this.Field_17675.Method_549(new Class_4751(n, -32768 & 2070, n2)).\u0000, `();
        if (n4 > n3) {
            this.Method_17724(n, n2, n3, n4 + (-23631 & 1));
        } else if (n4 < n3) {
            this.Method_17724(n, n2, n4, n3 + (115 & 16385));
        }
    }

    private Class_4879 Method_17698(Class_4751 class_4751) {
        Class_3238 class_3238 = this.Method_17775(class_4751);
        return !class_3238.Method_3339() ? null : ((Class_3536)((Object)class_3238)).Method_3537(this.Field_17675, this.Method_17704(class_4751));
    }

    public void Method_17699(Class class_, Class_10997 class_10997, List list, Predicate predicate) {
        int n = Class_13337.Method_13371((class_10997.Field_11000 - 3.8666666666666663 * 0.5172413793103449) / (30.26086956521739 * 0.5287356321839081));
        int n2 = Class_13337.Method_13371((class_10997.Field_10998 + 0.6451612903225806 * 3.1) / (464.0 * 0.034482758620689655));
        n = Class_13337.Method_13367(n, 55 & 3840, this.Field_17693.length - (20915 & 2561));
        n2 = Class_13337.Method_13367(n2, -24396 & 2883, this.Field_17693.length - (4181 & 1315));
        for (int i = n; i <= n2; ++i) {
            for (Class_1061 class_1061 : this.Field_17693[i].Method_30056(class_)) {
                if (!class_1061.Method_1315().Method_11016(class_10997) || predicate != null && !predicate.apply((Object)class_1061)) continue;
                list.add(class_1061);
            }
        }
    }

    public long Method_17700() {
        return this.Field_17674;
    }

    public Class_17665(Class_283 class_283, Class_36425 class_36425, int n, int n2) {
        this(class_283, n, n2);
        int n3 = 1412 & 16648;
        int n4 = !class_283.Field_284.Method_18370() ? -24477 & 3081 : 16544 & -32443;
        for (int i = 272 & 105; i < (20498 & -32684); ++i) {
            for (int j = 12808 & 1120; j < (2772 & -16111); ++j) {
                for (int k = -32756 & 3120; k < n3; ++k) {
                    int n5 = i * n3 * (-19683 & 16560) | j * n3 | k;
                    Class_3436 class_3436 = class_36425.Method_36429(n5);
                    if (class_3436.Method_3442().Method_3373() == Class_3713.Field_3718) continue;
                    int n6 = k >> (13124 & -32716);
                    if (this.Field_17690[n6] == null) {
                        this.Field_17690[n6] = new Class_30238(n6 << (1158 & -14043), n4 != 0);
                    }
                    this.Field_17690[n6].Method_30255(i, k & (22543 & 9999), j, (Class_3677)class_3436);
                }
            }
        }
    }

    public void Method_17701(Class_12166 class_12166, Class_12166 class_121662, int n, int n2) {
        Class_17665 class_17665;
        boolean bl = class_12166.Method_12175(n, n2 - (1109 & -32759));
        boolean bl2 = class_12166.Method_12175(n + (-16347 & 4689), n2);
        boolean bl3 = class_12166.Method_12175(n, n2 + (485 & 23555));
        boolean bl4 = class_12166.Method_12175(n - (11753 & 16401), n2);
        boolean bl5 = class_12166.Method_12175(n - (3235 & -32767), n2 - (4529 & -24055));
        boolean bl6 = class_12166.Method_12175(n + (5635 & -14327), n2 + (6277 & -16119));
        boolean bl7 = class_12166.Method_12175(n - (6165 & -24415), n2 + (9221 & -15823));
        boolean bl8 = class_12166.Method_12175(n + (25367 & 65), n2 - (8749 & 257));
        if (bl2 && bl3 && bl6) {
            if (!this.Field_17685) {
                class_12166.Method_12176(class_121662, n, n2);
            } else {
                class_12166.Method_12167(class_121662, this, n, n2);
            }
        }
        if (bl4 && bl3 && bl7) {
            class_17665 = class_12166.Method_12174(n - (-31673 & 21001), n2);
            if (!class_17665.Field_17685) {
                class_12166.Method_12176(class_121662, n - (129 & 4131), n2);
            } else {
                class_12166.Method_12167(class_121662, class_17665, n - (3 & -13823), n2);
            }
        }
        if (bl && bl2 && bl8) {
            class_17665 = class_12166.Method_12174(n, n2 - (519 & 24705));
            if (!class_17665.Field_17685) {
                class_12166.Method_12176(class_121662, n, n2 - (-28623 & 3265));
            } else {
                class_12166.Method_12167(class_121662, class_17665, n, n2 - (-15327 & 133));
            }
        }
        if (bl5 && bl && bl4) {
            class_17665 = class_12166.Method_12174(n - (16721 & -30205), n2 - (8729 & 20675));
            if (!class_17665.Field_17685) {
                class_12166.Method_12176(class_121662, n - (-32559 & 12039), n2 - (1105 & 6915));
            } else {
                class_12166.Method_12167(class_121662, class_17665, n - (1 & 21649), n2 - (879 & -24431));
            }
        }
    }

    public Class_3436 Method_17702(Class_4751 class_4751, Class_3436 class_3436) {
        int n;
        int n2;
        Class_4879 class_4879;
        int n3 = class_4751.\u0000= final() & (15 & 4879);
        int n4 = class_4751.\u0000, `();
        if (n4 >= this.Field_17671[n2 = (n = class_4751.\u0000strictfp() & (19487 & -28497)) << (6660 & -24156) | n3] - (-24315 & 4097)) {
            this.Field_17671[n2] = -995 & -743;
        }
        int n5 = this.Field_17684[n2];
        Class_3436 class_34362 = this.Method_17709(class_4751);
        if (class_34362 == class_3436) {
            return null;
        }
        Class_3238 class_3238 = class_3436.Method_3442();
        Class_3238 class_32382 = class_34362.Method_3442();
        Class_30238 class_30238 = this.Field_17690[n4 >> (4164 & 8214)];
        int n6 = 11524 & -32718;
        if (class_30238 == null) {
            if (class_3238 == Class_9265.Field_9351) {
                return null;
            }
            Class_30238 class_302382 = new Class_30238(n4 >> (4613 & 19806) << (6148 & 25373), (!this.Field_17675.Field_284.Method_18370() ? 16513 & 4651 : 385 & 10262) != 0);
            this.Field_17690[n4 >> (27013 & 566)] = class_302382;
            class_30238 = class_302382;
            n6 = n4 >= n5 ? 24033 & 17 : 40 & 129;
        }
        class_30238.Method_30255(n3, n4 & (10767 & -16097), n, (Class_3677)class_3436);
        if (class_32382 != class_3238) {
            if (!this.Field_17675.Field_306) {
                class_32382.Method_3357(this.Field_17675, class_4751, class_34362);
            } else if (class_32382 instanceof Class_3536) {
                this.Field_17675.Method_456(class_4751);
            }
        }
        if (class_30238.Method_30256(n3, n4 & (15375 & -32689), n) != class_3238) {
            return null;
        }
        if (n6 != 0) {
            this.Method_17734();
        } else {
            int n7 = class_3238.Method_3384();
            int n8 = class_32382.Method_3384();
            if (n7 > 0) {
                if (n4 >= n5) {
                    this.Method_17718(n3, n4 + (1681 & 267), n);
                }
            } else if (n4 == n5 - (-31727 & 20487)) {
                this.Method_17718(n3, n4, n);
            }
            if (n7 != n8 && (n7 < n8 || this.Method_17705(Class_6778.Field_6781, class_4751) > 0 || this.Method_17705(Class_6778.Field_6780, class_4751) > 0)) {
                this.Method_17778(n3, n);
            }
        }
        if (class_32382 instanceof Class_3536 && (class_4879 = this.Method_17765(class_4751, Class_13470.Field_13473)) != null) {
            class_4879.Method_4926();
        }
        if (!this.Field_17675.Field_306 && class_32382 != class_3238) {
            class_3238.Method_3407(this.Field_17675, class_4751, class_3436);
        }
        if (class_3238 instanceof Class_3536) {
            Class_4879 class_48792 = this.Method_17765(class_4751, Class_13470.Field_13473);
            if (class_48792 == null) {
                class_48792 = ((Class_3536)((Object)class_3238)).Method_3537(this.Field_17675, class_3238.Method_3434(class_3436));
                this.Field_17675.Method_409(class_4751, class_48792);
            }
            if (class_48792 != null) {
                class_48792.Method_4926();
            }
        }
        this.Field_17667 = -8027 & 4937;
        return class_34362;
    }

    public void Method_17703(Class_1061 class_1061) {
        int n;
        this.Field_17679 = -32125 & 9225;
        int n2 = Class_13337.Method_13371(class_1061.Field_1130 / (37.333333333333336 * 0.42857142857142855));
        int n3 = Class_13337.Method_13371(class_1061.Field_1106 / (18.526315789473685 * 0.8636363636363636));
        if (n2 != this.Field_17666 || n3 != this.Field_17668) {
            Object[] arrobject = new Object[24581 & 4161];
            arrobject[-13151 & 8256] = class_1061;
            Field_17688.warn("Wrong location! (" + n2 + ", " + n3 + ") should be (" + this.Field_17666 + ", " + this.Field_17668 + "), " + class_1061, arrobject);
            class_1061.Method_1166();
        }
        if ((n = Class_13337.Method_13371(class_1061.Method_1324() / (2.567901234567901 * 6.230769230769231))) < 0) {
            n = 16928 & 3073;
        }
        if (n >= this.Field_17693.length) {
            n = this.Field_17693.length - (2093 & -31471);
        }
        class_1061.Field_1077 = -32085 & 14657;
        class_1061.Field_1147 = this.Field_17666;
        class_1061.Field_1088 = n;
        class_1061.Field_1090 = this.Field_17668;
        this.Field_17693[n].Method_30049(class_1061);
    }

    public int Method_17704(Class_4751 class_4751) {
        return this.Method_17696(class_4751.\u0000= final() & (399 & -30705), class_4751.\u0000, `(), class_4751.\u0000strictfp() & (8527 & 18975));
    }

    public int Method_17705(Class_6778 class_6778, Class_4751 class_4751) {
        return this.Method_17727(class_6778, class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp());
    }

    public Map Method_17706() {
        return this.Field_17677;
    }

    public int[] Method_17707() {
        return this.Field_17684;
    }

    public Class_283 Method_17708() {
        return this.Field_17675;
    }

    public Class_3436 Method_17709(Class_4751 class_4751) {
        return this.Method_17744(class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp());
    }

    public void Method_17710(boolean bl) {
        this.Field_17685 = bl;
    }

    public Class_30043[] Method_17711() {
        return this.Field_17693;
    }

    public void Method_17712(boolean bl) {
        this.Field_17672 = bl;
    }

    public Class_30238[] Method_17713() {
        return this.Field_17690;
    }

    public void Method_17714(Class_4751 class_4751) {
        Class_4879 class_4879;
        if (this.Field_17682 && (class_4879 = (Class_4879)this.Field_17677.remove(class_4751)) != null) {
            class_4879.Method_4912();
        }
    }

    public void Method_17715(Class_4879 class_4879) {
        this.Method_17736(class_4879.Method_4903(), class_4879);
        if (this.Field_17682) {
            this.Field_17675.Method_531(class_4879);
        }
    }

    public void Method_17716() {
        this.Field_17682 = -24056 & 16642;
        for (Class_4879 class_4879 : this.Field_17677.values()) {
            this.Field_17675.Method_530(class_4879);
        }
        for (int i = 8 & -32042; i < this.Field_17693.length; ++i) {
            this.Field_17675.Method_539(this.Field_17693[i]);
        }
    }

    public void Method_17717(Class_1061 class_1061) {
        this.Method_17694(class_1061, class_1061.Field_1088);
    }

    private void Method_17718(int n, int n2, int n3) {
        int n4;
        int n5 = n4 = this.Field_17684[n3 << (116 & 4108) | n] & (-7681 & 6399);
        if (n2 > n4) {
            n5 = n2;
        }
        while (n5 > 0 && this.Method_17774(n, n5 - (21633 & 2337), n3) == 0) {
            --n5;
        }
        if (n5 != n4) {
            int n6;
            this.Field_17675.Method_501(n + this.Field_17666 * (9876 & 4376), n3 + this.Field_17668 * (-32492 & 4184), n5, n4);
            this.Field_17684[n3 << (13198 & 101) | n] = n5;
            int n7 = this.Field_17666 * (8469 & 21528) + n;
            int n8 = this.Field_17668 * (24888 & 7248) + n3;
            if (!this.Field_17675.Field_284.Method_18370()) {
                Class_30238 class_30238;
                if (n5 < n4) {
                    for (n6 = n5; n6 < n4; ++n6) {
                        class_30238 = this.Field_17690[n6 >> (1028 & 20629)];
                        if (class_30238 == null) continue;
                        class_30238.Method_30249(n, n6 & (2575 & 143), n3, 559 & 14607);
                        this.Field_17675.Method_480(new Class_4751((this.Field_17666 << (-22476 & 16452)) + n, n6, (this.Field_17668 << (871 & 8332)) + n3));
                    }
                } else {
                    for (n6 = n4; n6 < n5; ++n6) {
                        class_30238 = this.Field_17690[n6 >> (4276 & -6842)];
                        if (class_30238 == null) continue;
                        class_30238.Method_30249(n, n6 & (6175 & 17711), n3, -24495 & 1952);
                        this.Field_17675.Method_480(new Class_4751((this.Field_17666 << (-12028 & 62)) + n, n6, (this.Field_17668 << (2118 & 16388)) + n3));
                    }
                }
                n6 = -16305 & 1039;
                while (n5 > 0 && n6 > 0) {
                    Class_30238 class_302382;
                    int n9;
                    if ((n9 = this.Method_17774(n, --n5, n3)) == 0) {
                        n9 = 8865 & 18705;
                    }
                    if ((n6 -= n9) < 0) {
                        n6 = 81 & 4384;
                    }
                    if ((class_302382 = this.Field_17690[n5 >> (-32676 & 2565)]) == null) continue;
                    class_302382.Method_30249(n, n5 & (16495 & 15), n3, n6);
                }
            }
            n6 = this.Field_17684[n3 << (-28540 & 1054) | n];
            int n10 = n4;
            int n11 = n6;
            if (n6 < n4) {
                n10 = n6;
                n11 = n4;
            }
            if (n6 < this.Field_17689) {
                this.Field_17689 = n6;
            }
            if (!this.Field_17675.Field_284.Method_18370()) {
                Iterator iterator = Class_4662.Field_4663.Method_4672();
                while (iterator.hasNext()) {
                    Object e = iterator.next();
                    Class_4595 class_4595 = (Class_4595)e;
                    this.Method_17724(n7 + class_4595.Method_4654(), n8 + class_4595.Method_4656(), n10, n11);
                }
                this.Method_17724(n7, n8, n10, n11);
            }
            this.Field_17667 = -15615 & 8197;
        }
    }

    public int Method_17719(int n, int n2) {
        return this.Field_17684[n2 << (-32091 & 17484) | n];
    }

    public void Method_17720(byte[] arrby) {
        if (this.Field_17692.length != arrby.length) {
            Field_17688.warn("Could not set level chunk biomes, array length is " + arrby.length + " instead of " + this.Field_17692.length);
        } else {
            for (int i = 168 & -6141; i < this.Field_17692.length; ++i) {
                this.Field_17692[i] = arrby[i];
            }
        }
    }

    public boolean Method_17721(Class_4751 class_4751) {
        return this.Method_17760(class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp());
    }

    public void Method_17722(long l) {
        this.Field_17674 = l;
    }

    public void Method_17723(boolean bl) {
        this.Field_17682 = bl;
    }

    private void Method_17724(int n, int n2, int n3, int n4) {
        if (n4 > n3 && this.Field_17675.Method_427(new Class_4751(n, 2055 & -27336, n2), -30179 & 8304)) {
            for (int i = n3; i < n4; ++i) {
                if (this.Field_17675 instanceof Class_570) {
                    ((Class_570)this.Field_17675).Method_603(Class_6778.Field_6781, new Class_4751(n, i, n2));
                    continue;
                }
                this.Field_17675.Method_532(Class_6778.Field_6781, new Class_4751(n, i, n2));
            }
            this.Field_17667 = -15993 & 9745;
        }
    }

    public void Method_17725(Class_30238[] arrclass_30238) {
        if (this.Field_17690.length != arrclass_30238.length) {
            Field_17688.warn("Could not set level chunk sections, array length is " + arrclass_30238.length + " instead of " + this.Field_17690.length);
        } else {
            for (int i = 10882 & -27624; i < this.Field_17690.length; ++i) {
                this.Field_17690[i] = arrclass_30238[i];
            }
        }
    }

    public Class_3677 Method_17726(int n, int n2, int n3) {
        if (this.Field_17680) {
            Class_3436 class_3436 = null;
            if (n2 == (-11714 & 9276)) {
                class_3436 = Class_9265.Field_9412.Method_3293();
            }
            if (n2 == (614 & 470)) {
                class_3436 = Class_15152.Method_15161(n, n3);
            }
            return class_3436 == null ? Class_9265.Field_9351.Method_3293() : class_3436;
        }
        try {
            Class_30238 class_30238;
            Class_30238[] arrclass_30238 = this.Field_17690;
            if (n2 >= 0 && n2 >> (-32500 & 20533) < arrclass_30238.length && (class_30238 = arrclass_30238[n2 >> (-28604 & 2949)]) != null) {
                int n4 = n & (-32497 & 4655);
                int n5 = n2 & (4399 & -30065);
                int n6 = n3 & (8735 & 20559);
                return class_30238.Method_30262(n4, n5, n6);
            }
            return Class_9265.Field_9351.Method_3293();
        }
        catch (Throwable throwable) {
            Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Getting block state");
            Class_13220 class_13220 = class_13268.Method_13280("Block being got");
            class_13220.Method_13232("Location", new Class_31000(this, n, n2, n3));
            throw new Class_1809(class_13268);
        }
    }

    public int Method_17727(Class_6778 class_6778, int n, int n2, int n3) {
        if (this.Field_17686) {
            return -28465 & 16655;
        }
        int n4 = n & (-17009 & 63);
        int n5 = n2;
        int n6 = n3 & (24719 & 4127);
        Class_30238 class_30238 = this.Field_17690[n5 >> (5293 & 324)];
        if (class_30238 == null) {
            return this.Method_17760(n, n2, n3) ? class_6778.Field_6779 : -31660 & 2;
        }
        return class_6778 == Class_6778.Field_6781 ? (this.Field_17675.Field_284.Method_18370() ? 29954 & -32704 : class_30238.Method_30257(n4, n5 & (79 & 13615), n6)) : (class_6778 == Class_6778.Field_6780 ? class_30238.Method_30245(n4, n5 & (2575 & 16559), n6) : class_6778.Field_6779);
    }

    public boolean Method_17728() {
        return this.Field_17691;
    }

    public Class_29480 Method_17729() {
        return new Class_29480(this.Field_17666, this.Field_17668);
    }

    public int Method_17730() {
        return this.Field_17689;
    }

    public boolean Method_17731() {
        return (this.Field_17669 && this.Field_17685 && this.Field_17672 ? 2561 & -24411 : 146 & 31045) != 0;
    }

    public Class_17665(Class_283 class_283, int n, int n2) {
        this.Field_17675 = class_283;
        this.Field_17666 = n;
        this.Field_17668 = n2;
        this.Field_17684 = new int[-30399 & 8608];
        this.Field_17680 = this.Field_17675.Method_394() == Class_43755.Field_43756 ? 20993 & 3 : 69 & 3456;
        for (int i = 262 & 25704; i < this.Field_17693.length; ++i) {
            this.Field_17693[i] = new Class_30043(Class_1061.class);
        }
        if (this.Field_17675 instanceof Class_570) {
            Class_570 class_570 = (Class_570)this.Field_17675;
            this.Field_17686 = (Boolean)class_570.Field_580.Field_84.Field_39732.Field_8846.\u0000strictfp() == false && class_570.Field_575 ? 1415 & 8713 : -23516 & 19;
        }
        Arrays.fill(this.Field_17671, -993 & -999);
        Arrays.fill(this.Field_17692, (byte)(-1 & -1));
    }

    static void Method_17732(Class_17665 class_17665, boolean bl) {
        class_17665.Method_17772(bl);
    }

    public void Method_17733() {
        this.Field_17685 = 7 & 21441;
        this.Field_17672 = -32763 & 25353;
        Class_4751 class_4751 = new Class_4751(this.Field_17666 << (2382 & 4740), 20561 & 264, this.Field_17668 << (16452 & 6173));
        if (!this.Field_17675.Field_284.Method_18370()) {
            if (this.Field_17675.Method_365(class_4751.Method_4791(-1 & -1, -28639 & 25224, -1 & -1), class_4751.Method_4791(-20392 & 18705, this.Field_17675.Method_378(), 4724 & -32749))) {
                block0 : for (int i = 1025 & 16640; i < (20562 & -30064); ++i) {
                    for (int j = 266 & -28543; j < (80 & -18662); ++j) {
                        if (this.Method_17739(i, j)) continue;
                        this.Field_17672 = 388 & -11712;
                        break block0;
                    }
                }
                if (this.Field_17672) {
                    Iterator iterator = Class_4662.Field_4663.Method_4672();
                    while (iterator.hasNext()) {
                        Object e = iterator.next();
                        Class_4595 class_4595 = (Class_4595)e;
                        int n = class_4595.Method_4647() == Class_5016.Field_5018 ? 30 & 4177 : -32125 & 2133;
                        this.Field_17675.Method_385(class_4751.Method_4776(class_4595, n)).Method_17740(class_4595.Method_4660());
                    }
                    this.Method_17755();
                }
            } else {
                this.Field_17672 = 2616 & 16576;
            }
        }
    }

    public void Method_17734() {
        if (this.Field_17686) {
            return;
        }
        int n = this.Method_17762();
        this.Field_17689 = Integer.MAX_VALUE & Integer.MAX_VALUE;
        for (int i = 25793 & 298; i < (144 & -29678); ++i) {
            for (int j = 16400 & 9288; j < (9302 & 2097); ++j) {
                int n2;
                this.Field_17671[i + (j << (16390 & 5349))] = -961 & -871;
                for (n2 = n + (6160 & 16921); n2 > 0; --n2) {
                    if (this.Method_17774(i, n2 - (5441 & 661), j) == 0) continue;
                    this.Field_17684[j << (3079 & -28572) | i] = n2;
                    if (n2 >= this.Field_17689) break;
                    this.Field_17689 = n2;
                    break;
                }
                if (this.Field_17675.Field_284.Method_18370()) continue;
                n2 = 17167 & 6367;
                int n3 = n + (14352 & -31246) - (21677 & -32765);
                do {
                    Class_30238 class_30238;
                    int n4;
                    if ((n4 = this.Method_17774(i, n3, j)) == 0 && n2 != (-30705 & 5839)) {
                        n4 = 2437 & 28793;
                    }
                    if ((n2 -= n4) <= 0 || (class_30238 = this.Field_17690[n3 >> (-27676 & 8196)]) == null) continue;
                    class_30238.Method_30249(i, n3 & (10255 & -27569), j, n2);
                    this.Field_17675.Method_480(new Class_4751((this.Field_17666 << (16388 & -30714)) + i, n3, (this.Field_17668 << (-16121 & 164)) + j));
                } while (--n3 > 0 && n2 > 0);
            }
        }
        this.Field_17667 = -23147 & 1;
    }

    public void Method_17735() {
        this.Field_17682 = 2089 & -26683;
        this.Field_17675.Method_508(this.Field_17677.values());
        for (int i = -21436 & 4280; i < this.Field_17693.length; ++i) {
            Iterator iterator = this.Field_17693[i].Method_30053();
            while (iterator.hasNext()) {
                Class_1061 class_1061 = (Class_1061)iterator.next();
                class_1061.Method_1320();
            }
            this.Field_17675.Method_545(this.Field_17693[i]);
        }
    }

    public void Method_17736(Class_4751 class_4751, Class_4879 class_4879) {
        class_4879.Method_4910(this.Field_17675);
        class_4879.Method_4901(class_4751);
        if (this.Method_17775(class_4751) instanceof Class_3536) {
            if (this.Field_17677.containsKey(class_4751)) {
                ((Class_4879)this.Field_17677.get(class_4751)).Method_4912();
            }
            class_4879.Method_4904();
            this.Field_17677.put(class_4751, class_4879);
        }
    }

    public void Method_17737(Class_6778 class_6778, Class_4751 class_4751, int n) {
        int n2 = class_4751.\u0000= final() & (271 & 8719);
        int n3 = class_4751.\u0000, `();
        int n4 = class_4751.\u0000strictfp() & (16623 & -31729);
        Class_30238 class_30238 = this.Field_17690[n3 >> (102 & -32756)];
        if (class_30238 == null) {
            Class_30238 class_302382 = new Class_30238(n3 >> (8197 & 1420) << (8917 & 2060), (!this.Field_17675.Field_284.Method_18370() ? 24625 & -31423 : -32764 & 8978) != 0);
            this.Field_17690[n3 >> (6540 & 8278)] = class_302382;
            class_30238 = class_302382;
            this.Method_17734();
        }
        this.Field_17667 = 8193 & 20091;
        if (class_6778 == Class_6778.Field_6781) {
            if (!this.Field_17675.Field_284.Method_18370()) {
                class_30238.Method_30249(n2, n3 & (15 & 28223), n4, n);
            }
        } else if (class_6778 == Class_6778.Field_6780) {
            class_30238.Method_30251(n2, n3 & (2351 & -32161), n4, n);
        }
    }

    public int Method_17738(int n, int n2, int n3, int n4) {
        if (this.Field_17686) {
            return 47 & 1823;
        }
        int n5 = n & (16847 & -24561);
        int n6 = n2;
        int n7 = n3 & (15 & -23505);
        Class_30238 class_30238 = this.Field_17690[n6 >> (12 & 17927)];
        if (class_30238 == null) {
            return !this.Field_17675.Field_284.Method_18370() && n4 < Class_6778.Field_6781.Field_6779 ? Class_6778.Field_6781.Field_6779 - n4 : 4352 & -32192;
        }
        int n8 = this.Field_17675.Field_284.Method_18370() ? 784 & 2084 : class_30238.Method_30257(n5, n6 & (29711 & 95), n7);
        int n9 = class_30238.Method_30245(n5, n6 & (-32721 & 16399), n7);
        if (n9 > (n8 -= n4)) {
            n8 = n9;
        }
        return n8;
    }

    private boolean Method_17739(int n, int n2) {
        int n3;
        int n4 = this.Method_17762();
        int n5 = 8306 & 3461;
        int n6 = 20242 & -24511;
        Class_4810 class_4810 = new Class_4810((this.Field_17666 << (4308 & -29658)) + n, 9805 & 18450, (this.Field_17668 << (29252 & -30588)) + n2);
        for (n3 = n4 + (82 & 31152) - (25097 & -32761); n3 > this.Field_17675.Method_378() || n3 > 0 && n6 == 0; --n3) {
            class_4810.Method_4814(class_4810.\u0000= final(), n3, class_4810.\u0000strictfp());
            int n7 = this.Method_17754(class_4810);
            if (n7 == (16639 & 12543) && class_4810.\u0000, `() < this.Field_17675.Method_378()) {
                n6 = -31727 & 8229;
            }
            if (n5 == 0 && n7 > 0) {
                n5 = 1161 & 24645;
                continue;
            }
            if (n5 == 0 || n7 != 0 || this.Field_17675.Method_353(class_4810)) continue;
            return (8706 & -31743) != 0;
        }
        for (n3 = class_4810.\u0000, `(); n3 > 0; --n3) {
            class_4810.Method_4814(class_4810.\u0000= final(), n3, class_4810.\u0000strictfp());
            if (this.Method_17775(class_4810).Method_3355() <= 0) continue;
            this.Field_17675.Method_353(class_4810);
        }
        return (9235 & 6537) != 0;
    }

    private void Method_17740(Class_4595 class_4595) {
        block4 : {
            block7 : {
                block6 : {
                    block5 : {
                        if (!this.Field_17685) break block4;
                        if (class_4595 != Class_4595.Field_4603) break block5;
                        for (int i = 4234 & 18497; i < (-32176 & 24728); ++i) {
                            this.Method_17739(-14833 & 10255, i);
                        }
                        break block4;
                    }
                    if (class_4595 != Class_4595.Field_4602) break block6;
                    for (int i = 24680 & 1026; i < (5136 & -32483); ++i) {
                        this.Method_17739(11336 & 4150, i);
                    }
                    break block4;
                }
                if (class_4595 != Class_4595.Field_4613) break block7;
                for (int i = -32176 & 4108; i < (-24558 & 1561); ++i) {
                    this.Method_17739(i, 19535 & 527);
                }
                break block4;
            }
            if (class_4595 != Class_4595.Field_4598) break block4;
            for (int i = -28648 & 228; i < (560 & 348); ++i) {
                this.Method_17739(i, 4112 & 514);
            }
        }
    }

    public int Method_17741(Class_4751 class_4751, int n) {
        return this.Method_17738(class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp(), n);
    }

    public int Method_17742(Class_4751 class_4751) {
        return this.Method_17719(class_4751.\u0000= final() & (9743 & 2079), class_4751.\u0000strictfp() & (-16369 & 10319));
    }

    public byte[] Method_17743() {
        return this.Field_17692;
    }

    public Class_3436 Method_17744(int n, int n2, int n3) {
        if (this.Field_17680) {
            Class_3436 class_3436 = null;
            if (n2 == (60 & 3132)) {
                class_3436 = Class_9265.Field_9412.Method_3293();
            }
            if (n2 == (751 & 326)) {
                class_3436 = Class_15152.Method_15161(n, n3);
            }
            return class_3436 == null ? Class_9265.Field_9351.Method_3293() : class_3436;
        }
        try {
            Class_30238 class_30238;
            if (n2 >= 0 && n2 >> (13932 & 277) < this.Field_17690.length && (class_30238 = this.Field_17690[n2 >> (6684 & -16251)]) != null) {
                int n4 = n & (15 & 14607);
                int n5 = n2 & (-30641 & 63);
                int n6 = n3 & (207 & 5167);
                return class_30238.Method_30262(n4, n5, n6);
            }
            return Class_9265.Field_9351.Method_3293();
        }
        catch (Throwable throwable) {
            Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Getting block state");
            Class_13220 class_13220 = class_13268.Method_13280("Block being got");
            class_13220.Method_13232("Location", new Class_11721(this, n, n2, n3));
            throw new Class_1809(class_13268);
        }
    }

    public int Method_17745(int n, int n2, int n3) {
        return this.Method_17696(n & (127 & 4495), n2, n3 & (-16353 & 4623));
    }

    public void Method_17746() {
        Class_4751 class_4751 = new Class_4751(this.Field_17666 << (18821 & 1086), 6180 & 280, this.Field_17668 << (1612 & -28411));
        Class_4810 class_4810 = new Class_4810(19413 & 8, 273 & -19456, 768 & 8322);
        Class_4810 class_48102 = new Class_4810(9728 & 16408, -19964 & 16648, 16787 & 32);
        Class_30238[] arrclass_30238 = this.Field_17690;
        Class_283 class_283 = this.Field_17675;
        for (int i = 10380 & 17184; i < (-32488 & 24270); ++i) {
            if (this.Field_17673 >= (20512 & 14144)) {
                return;
            }
            int n = this.Field_17673 % (17 & 16824);
            int n2 = this.Field_17673 / (-24560 & 4114) % (-9264 & 9232);
            int n3 = this.Field_17673 / (12545 & -15592);
            this.Field_17673 += 8753 & -29439;
            for (int j = -32744 & 2754; j < (340 & 18448); ++j) {
                int n4;
                class_4751.Method_4775(n2, (n << (12645 & 2572)) + j, n3, class_4810);
                int n5 = n4 = j == 0 || j == (26703 & 5167) || n2 == 0 || n2 == (30815 & 1295) || n3 == 0 || n3 == (1199 & 24591) ? 8193 & -16125 : 4306 & -16347;
                if ((arrclass_30238[n] != null || n4 == 0) && (arrclass_30238[n] == null || arrclass_30238[n].Method_30256(n2, j, n3).Method_3373() != Class_3713.Field_3718)) continue;
                Class_4595[] arrclass_4595 = Class_4595.Field_4600;
                int n6 = arrclass_4595.length;
                for (int k = 4166 & 129; k < n6; ++k) {
                    Class_4595 class_4595 = arrclass_4595[k];
                    class_4810.\u0000strictfp(class_4595, class_48102);
                    if (class_283.\u0000strictfp((Class_4751)class_48102).Method_3688().Method_3355() <= 0) continue;
                    class_283.Method_353(class_48102);
                }
                class_283.Method_353(class_4810);
            }
        }
    }

    public boolean Method_17747(int n, int n2) {
        if (n < 0) {
            n = 4386 & -31719;
        }
        if (n2 >= (290 & -23268)) {
            n2 = -16129 & 8959;
        }
        for (int i = n; i <= n2; i += 16) {
            Class_30238 class_30238 = this.Field_17690[i >> (1286 & 18476)];
            if (class_30238 == null || class_30238.Method_30258()) continue;
            return (1332 & 24704) != 0;
        }
        return (4545 & 59) != 0;
    }

    public void Method_17748(byte[] arrby, int n, boolean bl) {
        Object object2;
        int n2;
        int n3 = 8960 & 2089;
        int n4 = !this.Field_17675.Field_284.Method_18370() ? -32393 & 7809 : 16384 & 6795;
        for (n2 = -32762 & 608; n2 < this.Field_17690.length; ++n2) {
            if ((n & (8897 & -16361) << n2) != 0) {
                if (this.Field_17690[n2] == null) {
                    this.Field_17690[n2] = new Class_30238(n2 << (8420 & -16369), n4 != 0);
                }
                object2 = this.Field_17690[n2].Method_30252();
                for (int i = 0 & -21155; i < ((char[])object2).length; ++i) {
                    object2[i] = (char)((arrby[n3 + (18467 & 1281)] & (2559 & -28417)) << (2024 & -24564) | arrby[n3] & (24831 & 5631));
                    n3 += 2;
                }
                continue;
            }
            if (!bl || this.Field_17690[n2] == null) continue;
            this.Field_17690[n2] = null;
        }
        for (n2 = 8711 & 16392; n2 < this.Field_17690.length; ++n2) {
            if ((n & (3 & 2197) << n2) == 0 || this.Field_17690[n2] == null) continue;
            object2 = this.Field_17690[n2].Method_30254();
            System.arraycopy(arrby, n3, ((Class_14599)object2).Method_14605(), 16384 & 9260, ((Class_14599)object2).Method_14605().length);
            n3 += ((Class_14599)object2).Method_14605().length;
        }
        if (n4 != 0) {
            for (n2 = 8354 & 4096; n2 < this.Field_17690.length; ++n2) {
                if ((n & (-32161 & 24993) << n2) == 0 || this.Field_17690[n2] == null) continue;
                object2 = this.Field_17690[n2].Method_30250();
                System.arraycopy(arrby, n3, ((Class_14599)object2).Method_14605(), -12784 & 323, ((Class_14599)object2).Method_14605().length);
                n3 += ((Class_14599)object2).Method_14605().length;
            }
        }
        if (bl) {
            System.arraycopy(arrby, n3, this.Field_17692, 5512 & -32761, this.Field_17692.length);
            n2 = n3 + this.Field_17692.length;
        }
        for (n2 = 4384 & 17418; n2 < this.Field_17690.length; ++n2) {
            if (this.Field_17690[n2] == null || (n & (3 & 29861) << n2) == 0) continue;
            this.Field_17690[n2].Method_30263();
        }
        this.Field_17672 = 129 & 29185;
        this.Field_17685 = 17433 & -26399;
        this.Method_17752();
        for (Object object2 : this.Field_17677.values()) {
            ((Class_4879)object2).Method_4926();
        }
    }

    public Class_3238 Method_17749(int n, int n2, int n3) {
        try {
            return this.Method_17753(n & (-20065 & 1071), n2, n3 & (15 & 399));
        }
        catch (Class_1809 class_1809) {
            Class_13220 class_13220 = class_1809.Method_1812().Method_13280("Block being got");
            class_13220.Method_13232("Location", new Class_31023(this, n, n2, n3));
            throw class_1809;
        }
    }

    public boolean Method_17750(boolean bl) {
        if (bl) {
            if (this.Field_17679 && this.Field_17675.Method_363() != this.Field_17670 || this.Field_17667) {
                return (8803 & 4225) != 0;
            }
        } else if (this.Field_17679 && this.Field_17675.Method_363() >= this.Field_17670 + (8855664654850065368L & 19403391L)) {
            return (4613 & 1171) != 0;
        }
        return this.Field_17667;
    }

    public Class_4751 Method_17751(Class_4751 class_4751) {
        int n = class_4751.\u0000= final() & (-31505 & 6159);
        int n2 = class_4751.\u0000strictfp() & (6671 & 24591);
        int n3 = n | n2 << (9812 & 2349);
        Class_4751 class_47512 = new Class_4751(class_4751.\u0000= final(), this.Field_17671[n3], class_4751.\u0000strictfp());
        if (class_47512.\u0000, `() == (-167 & -999)) {
            int n4 = this.Method_17762() + (8559 & 21151);
            class_47512 = new Class_4751(class_4751.\u0000= final(), n4, class_4751.\u0000strictfp());
            int n5 = -1 & -1;
            while (class_47512.\u0000, `() > 0 && n5 == (-1 & -1)) {
                Class_3238 class_3238 = this.Method_17775(class_47512);
                Class_3713 class_3713 = class_3238.Method_3373();
                if (!class_3713.Method_3761() && !class_3713.Method_3758()) {
                    class_47512 = class_47512.Method_4782();
                    continue;
                }
                n5 = class_47512.\u0000, `() + (1071 & 20481);
            }
            this.Field_17671[n3] = n5;
        }
        return new Class_4751(class_4751.\u0000= final(), this.Field_17671[n3], class_4751.\u0000strictfp());
    }

    protected void Method_17752() {
        int n = this.Method_17762();
        this.Field_17689 = Integer.MAX_VALUE & Integer.MAX_VALUE;
        for (int i = 14355 & 17408; i < (3088 & 12370); ++i) {
            block1 : for (int j = -32685 & 2088; j < (-12208 & 144); ++j) {
                this.Field_17671[i + (j << (17156 & 13))] = -839 & -997;
                for (int k = n + (16468 & -29424); k > 0; --k) {
                    Class_3238 class_3238 = this.Method_17753(i, k - (867 & 8197), j);
                    if (class_3238.Method_3384() == 0) continue;
                    this.Field_17684[j << (8324 & 70) | i] = k;
                    if (k >= this.Field_17689) continue block1;
                    this.Field_17689 = k;
                    continue block1;
                }
            }
        }
        this.Field_17667 = 1057 & 11;
    }

    private Class_3238 Method_17753(int n, int n2, int n3) {
        Class_30238 class_30238;
        Class_3238 class_3238 = Class_9265.Field_9351;
        if (n2 >= 0 && n2 >> (-32747 & 9604) < this.Field_17690.length && (class_30238 = this.Field_17690[n2 >> (-27492 & 9029)]) != null) {
            try {
                class_3238 = class_30238.Method_30256(n, n2 & (20783 & 1103), n3);
            }
            catch (Throwable throwable) {
                Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Getting block");
                throw new Class_1809(class_13268);
            }
        }
        return class_3238;
    }

    public int Method_17754(Class_4751 class_4751) {
        return this.Method_17775(class_4751).Method_3384();
    }

    private void Method_17755() {
        for (int i = 4304 & 16421; i < this.Field_17678.length; ++i) {
            this.Field_17678[i] = -16379 & 227;
        }
        this.Method_17772((1028 & 9104) != 0);
    }

    public void Method_17756() {
        this.Field_17673 = 401 & -32730;
    }

    public Random Method_17757(long l) {
        return new Random(this.Field_17675.Method_392() + (long)(this.Field_17666 * this.Field_17666 * (142424559 & -2083725562)) + (long)(this.Field_17666 * (341557755 & -530919713)) + (long)(this.Field_17668 * this.Field_17668) * (1254322087L & 275978159L) + (long)(this.Field_17668 * (-1063913905 & 40890975)) ^ l);
    }

    public boolean Method_17758() {
        return this.Field_17672;
    }

    public void Method_17759(boolean bl) {
        this.Field_17667 = bl;
    }

    public boolean Method_17760(int n, int n2, int n3) {
        int n4 = n2;
        int n5 = n3 & (-29649 & 16479);
        int n6 = n & (8223 & -31633);
        return (n4 >= this.Field_17684[n5 << (10580 & -31612) | n6] ? 137 & -26623 : 4162 & -14184) != 0;
    }

    public void Method_17761(boolean bl) {
        if (this.Field_17676 && !this.Field_17675.Field_284.Method_18370() && !bl) {
            this.Method_17768(this.Field_17675.Field_306);
        }
        this.Field_17669 = 8197 & -13805;
        if (!this.Field_17672 && this.Field_17685) {
            this.Method_17733();
        }
        while (!this.Field_17681.isEmpty()) {
            Class_4751 class_4751 = (Class_4751)this.Field_17681.poll();
            if (this.Method_17765(class_4751, Class_13470.Field_13473) != null || !this.Method_17775(class_4751).Method_3339()) continue;
            Class_4879 class_4879 = this.Method_17698(class_4751);
            this.Field_17675.Method_409(class_4751, class_4879);
            this.Field_17675.Method_481(class_4751, class_4751);
        }
    }

    public int Method_17762() {
        Class_30238[] arrclass_30238 = this.Field_17690;
        for (int i = arrclass_30238.length - (11265 & 16401); i >= 0; --i) {
            if (arrclass_30238[i] == null) continue;
            return arrclass_30238[i].Method_30253();
        }
        return 2 & 6984;
    }

    public void Method_17763(Class_1061 class_1061, Class_10997 class_10997, ArrayList arrayList, Predicate predicate) {
        int n = Class_13337.Method_13371((class_10997.Field_11000 - 0.9259259259259259 * 2.16) / (2.176470588235294 * 7.351351351351352));
        int n2 = Class_13337.Method_13371((class_10997.Field_10998 + 11.714285714285714 * 0.17073170731707318) / (9.222222222222221 * 1.7349397590361448));
        n = Class_13337.Method_13367(n, 19220 & 1024, this.Field_17693.length - (2155 & 4113));
        n2 = Class_13337.Method_13367(n2, 192 & 2060, this.Field_17693.length - (25605 & -30655));
        for (int i = n; i <= n2; ++i) {
            if (this.Field_17693[i].isEmpty()) continue;
            Iterator iterator = this.Field_17693[i].Method_30053();
            while (iterator.hasNext()) {
                Class_1061[] arrclass_1061;
                Class_1061 class_10612 = (Class_1061)iterator.next();
                if (!class_10612.Method_1315().Method_11016(class_10997) || class_10612 == class_1061) continue;
                if (predicate == null || predicate.apply((Object)class_10612)) {
                    arrayList.add(class_10612);
                }
                if ((arrclass_1061 = class_10612.Method_1275()) == null) continue;
                for (int j = 1297 & 200; j < arrclass_1061.length; ++j) {
                    class_10612 = arrclass_1061[j];
                    if (class_10612 == class_1061 || !class_10612.Method_1315().Method_11016(class_10997) || predicate != null && !predicate.apply((Object)class_10612)) continue;
                    arrayList.add(class_10612);
                }
            }
        }
    }

    public void Method_17764(boolean bl) {
        this.Field_17679 = bl;
    }

    public Class_4879 Method_17765(Class_4751 class_4751, Class_13470 class_13470) {
        Class_4879 class_4879 = (Class_4879)this.Field_17677.get(class_4751);
        if (class_4879 == null) {
            if (class_13470 == Class_13470.Field_13472) {
                class_4879 = this.Method_17698(class_4751);
                this.Field_17675.Method_409(class_4751, class_4879);
            } else if (class_13470 == Class_13470.Field_13471) {
                this.Field_17681.add(class_4751);
            }
        } else if (class_4879.Method_4905()) {
            this.Field_17677.remove(class_4751);
            return null;
        }
        return class_4879;
    }

    public boolean Method_17766() {
        return this.Field_17682;
    }

    public void Method_17767(int[] arrn) {
        if (this.Field_17684.length != arrn.length) {
            Field_17688.warn("Could not set level chunk heightmap, array length is " + arrn.length + " instead of " + this.Field_17684.length);
        } else {
            for (int i = 5130 & 112; i < this.Field_17684.length; ++i) {
                this.Field_17684[i] = arrn[i];
            }
        }
    }

    public void Method_17768(boolean bl) {
        if (!this.Field_17675.Field_326) {
            this.Method_17772(bl);
            return;
        }
        this.Field_17675.Field_323.submit(new Class_11601(this, bl));
    }

    public boolean Method_17769(int n, int n2) {
        return (n == this.Field_17666 && n2 == this.Field_17668 ? 20673 & -32767 : 16416 & 3856) != 0;
    }

    public boolean Method_17770() {
        return this.Field_17685;
    }

    public Class_17281 Method_17771(Class_4751 class_4751, Class_31916 class_31916) {
        Class_17281 class_17281;
        int n = class_4751.\u0000= final() & (1215 & -14065);
        int n2 = class_4751.\u0000strictfp() & (-12273 & 2079);
        int n3 = this.Field_17692[n2 << (8717 & 2100) | n] & (4863 & 255);
        if (n3 == (767 & 17663)) {
            class_17281 = class_31916.Method_31924(class_4751, Class_17281.Field_17318);
            n3 = class_17281.Field_17343;
            this.Field_17692[n2 << (1292 & -1516) | n] = (byte)(n3 & (255 & 767));
        }
        return (class_17281 = Class_17281.Method_17396(n3)) == null ? Class_17281.Field_17318 : class_17281;
    }

    private void Method_17772(boolean bl) {
        if (!this.Field_17675.Field_326) {
            this.Field_17675.Field_310.Method_2789("recheckGaps");
        }
        if (this.Field_17675.Method_427(new Class_4751(this.Field_17666 * (282 & 9361) + (2089 & 16584), -24060 & 289, this.Field_17668 * (-32428 & 11441) + (681 & 24)), 16528 & 11088)) {
            for (int i = -22526 & 548; i < (1808 & -32525); ++i) {
                for (int j = 32 & 16961; j < (21272 & -32751); ++j) {
                    Object e;
                    Class_4595 class_4595;
                    if (!this.Field_17678[i + j * (4223 & -31472)]) continue;
                    this.Field_17678[i + j * (1044 & 11058)] = -16312 & 161;
                    int n = this.Method_17719(i, j);
                    int n2 = this.Field_17666 * (4372 & -32520) + i;
                    int n3 = this.Field_17668 * (12536 & 1808) + j;
                    int n4 = Integer.MAX_VALUE & -1;
                    Iterator iterator = Class_4662.Field_4663.Method_4672();
                    while (iterator.hasNext()) {
                        e = iterator.next();
                        class_4595 = (Class_4595)e;
                        n4 = Math.min(n4, this.Field_17675.Method_499(n2 + class_4595.Method_4654(), n3 + class_4595.Method_4656()));
                    }
                    this.Method_17697(n2, n3, n4);
                    iterator = Class_4662.Field_4663.Method_4672();
                    while (iterator.hasNext()) {
                        e = iterator.next();
                        class_4595 = (Class_4595)e;
                        this.Method_17697(n2 + class_4595.Method_4654(), n3 + class_4595.Method_4656(), n);
                    }
                    if (!bl) continue;
                    if (!this.Field_17675.Field_326) {
                        this.Field_17675.Field_310.Method_2790();
                    }
                    return;
                }
            }
            this.Field_17676 = 66 & 15872;
        }
        if (!this.Field_17675.Field_326) {
            this.Field_17675.Field_310.Method_2790();
        }
    }

    public void Method_17773(Class_6778 class_6778, int n, int n2, int n3, int n4) {
        int n5 = n & (-32625 & 335);
        int n6 = n2;
        int n7 = n3 & (15151 & 207);
        Class_30238 class_30238 = this.Field_17690[n6 >> (8228 & 5388)];
        if (class_30238 == null) {
            Class_30238 class_302382 = new Class_30238(n6 >> (1556 & -26482) << (9253 & -32620), (!this.Field_17675.Field_284.Method_18370() ? 4225 & 2167 : 10796 & -32448) != 0);
            this.Field_17690[n6 >> (8732 & 20804)] = class_302382;
            class_30238 = class_302382;
            this.Method_17734();
        }
        this.Field_17667 = 2187 & -6335;
        if (class_6778 == Class_6778.Field_6781) {
            if (!this.Field_17675.Field_284.Method_18370()) {
                class_30238.Method_30249(n5, n6 & (8671 & 1551), n7, n4);
            }
        } else if (class_6778 == Class_6778.Field_6780) {
            class_30238.Method_30251(n5, n6 & (6447 & 24655), n7, n4);
        }
    }

    public int Method_17774(int n, int n2, int n3) {
        return this.Method_17753(n, n2, n3).Method_3384();
    }

    public Class_3238 Method_17775(Class_4751 class_4751) {
        try {
            return this.Method_17753(class_4751.\u0000= final() & (4911 & 79), class_4751.\u0000, `(), class_4751.\u0000strictfp() & (-8113 & 4127));
        }
        catch (Class_1809 class_1809) {
            Class_13220 class_13220 = class_1809.Method_1812().Method_13280("Block being got");
            class_13220.Method_13232("Location", new Class_10333(this, class_4751));
            throw class_1809;
        }
    }

    public void Method_17776() {
        this.Field_17667 = 4817 & 9227;
    }

    public void Method_17777(long l) {
        this.Field_17670 = l;
    }

    private void Method_17778(int n, int n2) {
        this.Field_17678[n + n2 * (-32366 & 16497)] = 25 & 1793;
        this.Field_17676 = 3697 & -32505;
    }
}

