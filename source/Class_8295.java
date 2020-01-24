/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class Class_8295 {
    private int Field_8296 = -1 & -1;
    private final Set Field_8297 = Sets.newHashSet();
    public int Field_8298;
    public List Field_8299 = Lists.newArrayList();
    protected List Field_8300 = Lists.newArrayList();
    public List Field_8301 = Lists.newArrayList();
    private short Field_8302;
    private int Field_8303;
    private Set Field_8304 = Sets.newHashSet();

    public boolean Method_8305(Class_26421 class_26421) {
        return (3 & -3543) != 0;
    }

    public void Method_8306(Class_37497 class_37497) {
        if (this.Field_8300.contains(class_37497)) {
            throw new IllegalArgumentException("Listener already listening");
        }
        this.Field_8300.add(class_37497);
        class_37497.Method_37501(this, this.Method_8333());
        this.Method_8322();
    }

    protected void Method_8307() {
        this.Field_8303 = -32767 & 20518;
        this.Field_8297.clear();
    }

    public Class_23823 Method_8308(int n, int n2, int n3, Class_626 class_626) {
        Class_23823 class_23823 = null;
        Class_37781 class_37781 = class_626.Field_628;
        if (n3 == (519 & -32747)) {
            int n4 = this.Field_8303;
            this.Field_8303 = Class_8295.Method_8314(n2);
            if ((n4 != (25601 & 91) || this.Field_8303 != (-30206 & 20966)) && n4 != this.Field_8303) {
                this.Method_8307();
            } else if (class_37781.Method_37812() == null) {
                this.Method_8307();
            } else if (this.Field_8303 == 0) {
                this.Field_8296 = Class_8295.Method_8315(n2);
                if (Class_8295.Method_8319(this.Field_8296, class_626)) {
                    this.Field_8303 = -21999 & 1513;
                    this.Field_8297.clear();
                } else {
                    this.Method_8307();
                }
            } else if (this.Field_8303 == (19075 & -32503)) {
                Class_26421 class_26421 = (Class_26421)this.Field_8299.get(n);
                if (class_26421 != null && Class_8295.Method_8335(class_26421, class_37781.Method_37812(), (18497 & -23153) != 0) && class_26421.Method_26435(class_37781.Method_37812()) && class_37781.Method_37812().Field_23826 > this.Field_8297.size() && this.Method_8305(class_26421)) {
                    this.Field_8297.add(class_26421);
                }
            } else if (this.Field_8303 == (-30642 & 9474)) {
                if (!this.Field_8297.isEmpty()) {
                    Class_23823 class_238232 = class_37781.Method_37812().Method_23850();
                    int n5 = class_37781.Method_37812().Field_23826;
                    for (Class_26421 class_26421 : this.Field_8297) {
                        if (class_26421 == null || !Class_8295.Method_8335(class_26421, class_37781.Method_37812(), (385 & 25677) != 0) || !class_26421.Method_26435(class_37781.Method_37812()) || class_37781.Method_37812().Field_23826 < this.Field_8297.size() || !this.Method_8305(class_26421)) continue;
                        Class_23823 class_238233 = class_238232.Method_23850();
                        int n6 = class_26421.Method_26439() ? class_26421.Method_26430().Field_23826 : 23136 & -32620;
                        Class_8295.Method_8309(this.Field_8297, this.Field_8296, class_238233, n6);
                        if (class_238233.Field_23826 > class_238233.Method_23837()) {
                            class_238233.Field_23826 = class_238233.Method_23837();
                        }
                        if (class_238233.Field_23826 > class_26421.Method_26434(class_238233)) {
                            class_238233.Field_23826 = class_26421.Method_26434(class_238233);
                        }
                        n5 -= class_238233.Field_23826 - n6;
                        class_26421.Method_26437(class_238233);
                    }
                    class_238232.Field_23826 = n5;
                    if (class_238232.Field_23826 <= 0) {
                        class_238232 = null;
                    }
                    class_37781.Method_37804(class_238232);
                }
                this.Method_8307();
            } else {
                this.Method_8307();
            }
        } else if (this.Field_8303 != 0) {
            this.Method_8307();
        } else if (!(n3 != 0 && n3 != (8265 & 4481) || n2 != 0 && n2 != (11907 & -12275))) {
            if (n == (-899 & -485)) {
                if (class_37781.Method_37812() != null) {
                    if (n2 == 0) {
                        class_626.Method_733(class_37781.Method_37812(), (19 & 8269) != 0);
                        class_37781.Method_37804(null);
                    }
                    if (n2 == (-32759 & 22533)) {
                        class_626.Method_733(class_37781.Method_37812().Method_23857(-32767 & 10791), (16577 & 1043) != 0);
                        if (class_37781.Method_37812().Field_23826 == 0) {
                            class_37781.Method_37804(null);
                        }
                    }
                }
            } else if (n3 == (19073 & -31699)) {
                Class_23823 class_238234;
                if (n < 0) {
                    return null;
                }
                Class_26421 class_26421 = (Class_26421)this.Field_8299.get(n);
                if (class_26421 != null && class_26421.Method_26440(class_626) && (class_238234 = this.Method_8329(class_626, n)) != null) {
                    Class_1956 class_1956 = class_238234.Method_23844();
                    class_23823 = class_238234.Method_23850();
                    if (class_26421.Method_26430() != null && class_26421.Method_26430().Method_23844() == class_1956) {
                        this.Method_8318(n, n2, (4097 & 17779) != 0, class_626);
                    }
                }
            } else {
                if (n < 0) {
                    return null;
                }
                Class_26421 class_26421 = (Class_26421)this.Field_8299.get(n);
                if (class_26421 != null) {
                    Class_23823 class_238235 = class_26421.Method_26430();
                    Class_23823 class_238236 = class_37781.Method_37812();
                    if (class_238235 != null) {
                        class_23823 = class_238235.Method_23850();
                    }
                    if (class_238235 == null) {
                        if (class_238236 != null && class_26421.Method_26435(class_238236)) {
                            int n7;
                            int n8 = n7 = n2 == 0 ? class_238236.Field_23826 : 18691 & 641;
                            if (n7 > class_26421.Method_26434(class_238236)) {
                                n7 = class_26421.Method_26434(class_238236);
                            }
                            if (class_238236.Field_23826 >= n7) {
                                class_26421.Method_26437(class_238236.Method_23857(n7));
                            }
                            if (class_238236.Field_23826 == 0) {
                                class_37781.Method_37804(null);
                            }
                        }
                    } else if (class_26421.Method_26440(class_626)) {
                        int n9;
                        if (class_238236 == null) {
                            int n10 = n2 == 0 ? class_238235.Field_23826 : (class_238235.Field_23826 + (1059 & 10833)) / (-31678 & 24763);
                            Class_23823 class_238237 = class_26421.Method_26427(n10);
                            class_37781.Method_37804(class_238237);
                            if (class_238235.Field_23826 == 0) {
                                class_26421.Method_26437(null);
                            }
                            class_26421.Method_26441(class_626, class_37781.Method_37812());
                        } else if (class_26421.Method_26435(class_238236)) {
                            if (class_238235.Method_23844() == class_238236.Method_23844() && class_238235.Method_23843() == class_238236.Method_23843() && Class_23823.Method_23895(class_238235, class_238236)) {
                                int n11;
                                int n12 = n11 = n2 == 0 ? class_238236.Field_23826 : -30463 & 153;
                                if (n11 > class_26421.Method_26434(class_238236) - class_238235.Field_23826) {
                                    n11 = class_26421.Method_26434(class_238236) - class_238235.Field_23826;
                                }
                                if (n11 > class_238236.Method_23837() - class_238235.Field_23826) {
                                    n11 = class_238236.Method_23837() - class_238235.Field_23826;
                                }
                                class_238236.Method_23857(n11);
                                if (class_238236.Field_23826 == 0) {
                                    class_37781.Method_37804(null);
                                }
                                class_238235.Field_23826 += n11;
                            } else if (class_238236.Field_23826 <= class_26421.Method_26434(class_238236)) {
                                class_26421.Method_26437(class_238236);
                                class_37781.Method_37804(class_238235);
                            }
                        } else if (class_238235.Method_23844() == class_238236.Method_23844() && class_238236.Method_23837() > (69 & 13577) && (!class_238235.Method_23877() || class_238235.Method_23843() == class_238236.Method_23843()) && Class_23823.Method_23895(class_238235, class_238236) && (n9 = class_238235.Field_23826) > 0 && n9 + class_238236.Field_23826 <= class_238236.Method_23837()) {
                            class_238236.Field_23826 += n9;
                            class_238235 = class_26421.Method_26427(n9);
                            if (class_238235.Field_23826 == 0) {
                                class_26421.Method_26437(null);
                            }
                            class_26421.Method_26441(class_626, class_37781.Method_37812());
                        }
                    }
                    class_26421.Method_26431();
                }
            }
        } else if (n3 == (-32766 & 7222) && n2 >= 0 && n2 < (20809 & 2189)) {
            Class_26421 class_26421 = (Class_26421)this.Field_8299.get(n);
            if (class_26421.Method_26440(class_626)) {
                Class_23823 class_238238 = class_37781.Method_37794(n2);
                int n13 = class_238238 == null || class_26421.Field_26425 == class_37781 && class_26421.Method_26435(class_238238) ? -30713 & 4353 : 702 & 2048;
                int n14 = -1 & -1;
                if (n13 == 0) {
                    n14 = class_37781.Method_37805();
                    n13 |= n14 > (-1 & -1) ? 14401 & 385 : 18640 & 8717;
                }
                if (class_26421.Method_26439() && n13 != 0) {
                    Class_23823 class_238239 = class_26421.Method_26430();
                    class_37781.Method_37796(n2, class_238239.Method_23850());
                    if (!(class_26421.Field_26425 == class_37781 && class_26421.Method_26435(class_238238) || class_238238 == null)) {
                        if (n14 > (-1 & -1)) {
                            class_37781.Method_37824(class_238238);
                            class_26421.Method_26427(class_238239.Field_23826);
                            class_26421.Method_26437(null);
                            class_26421.Method_26441(class_626, class_238239);
                        }
                    } else {
                        class_26421.Method_26427(class_238239.Field_23826);
                        class_26421.Method_26437(class_238238);
                        class_26421.Method_26441(class_626, class_238239);
                    }
                } else if (!class_26421.Method_26439() && class_238238 != null && class_26421.Method_26435(class_238238)) {
                    class_37781.Method_37796(n2, null);
                    class_26421.Method_26437(class_238238);
                }
            }
        } else if (n3 == (-28517 & 835) && class_626.Field_694.Method_18094() && class_37781.Method_37812() == null && n >= 0) {
            Class_26421 class_26421 = (Class_26421)this.Field_8299.get(n);
            if (class_26421 != null && class_26421.Method_26439()) {
                Class_23823 class_2382310 = class_26421.Method_26430().Method_23850();
                class_2382310.Field_23826 = class_2382310.Method_23837();
                class_37781.Method_37804(class_2382310);
            }
        } else if (n3 == (16567 & 1100) && class_37781.Method_37812() == null && n >= 0) {
            Class_26421 class_26421 = (Class_26421)this.Field_8299.get(n);
            if (class_26421 != null && class_26421.Method_26439() && class_26421.Method_26440(class_626)) {
                Class_23823 class_2382311 = class_26421.Method_26427(n2 == 0 ? 24915 & -27615 : class_26421.Method_26430().Field_23826);
                class_26421.Method_26441(class_626, class_2382311);
                class_626.Method_733(class_2382311, (16673 & 15505) != 0);
            }
        } else if (n3 == (270 & 8790) && n >= 0) {
            Class_26421 class_26421 = (Class_26421)this.Field_8299.get(n);
            Class_23823 class_2382312 = class_37781.Method_37812();
            if (!(class_2382312 == null || class_26421 != null && class_26421.Method_26439() && class_26421.Method_26440(class_626))) {
                int n15 = n2 == 0 ? 10503 & 8 : this.Field_8299.size() - (2241 & 4129);
                int n16 = n2 == 0 ? -27613 & 8321 : -1 & -1;
                for (int i = -6972 & 2617; i < (8451 & 7874); ++i) {
                    for (int j = n15; j >= 0 && j < this.Field_8299.size() && class_2382312.Field_23826 < class_2382312.Method_23837(); j += n16) {
                        Class_26421 class_264212 = (Class_26421)this.Field_8299.get(j);
                        if (!class_264212.Method_26439() || !Class_8295.Method_8335(class_264212, class_2382312, (16385 & -29273) != 0) || !class_264212.Method_26440(class_626) || !this.Method_8310(class_2382312, class_264212) || i == 0 && class_264212.Method_26430().Field_23826 == class_264212.Method_26430().Method_23837()) continue;
                        int n17 = Math.min(class_2382312.Method_23837() - class_2382312.Field_23826, class_264212.Method_26430().Field_23826);
                        Class_23823 class_2382313 = class_264212.Method_26427(n17);
                        class_2382312.Field_23826 += n17;
                        if (class_2382313.Field_23826 <= 0) {
                            class_264212.Method_26437(null);
                        }
                        class_264212.Method_26441(class_626, class_2382313);
                    }
                }
            }
            this.Method_8322();
        }
        return class_23823;
    }

    public static void Method_8309(Set set, int n, Class_23823 class_23823, int n2) {
        switch (n) {
            case 0: {
                class_23823.Field_23826 = Class_13337.Method_13377((float)class_23823.Field_23826 / (float)set.size());
                break;
            }
            case 1: {
                class_23823.Field_23826 = 16393 & -32221;
                break;
            }
            case 2: {
                class_23823.Field_23826 = class_23823.Method_23844().Method_1976();
            }
        }
        class_23823.Field_23826 += n2;
    }

    public boolean Method_8310(Class_23823 class_23823, Class_26421 class_26421) {
        return (2567 & 5521) != 0;
    }

    public void Method_8311(int n, int n2) {
    }

    public void Method_8312(Class_4961 class_4961) {
        this.Method_8322();
    }

    public short Method_8313(Class_37781 class_37781) {
        this.Field_8302 = (short)(this.Field_8302 + (-27801 & 16385));
        return this.Field_8302;
    }

    public static int Method_8314(int n) {
        return n & (-32381 & 6183);
    }

    public static int Method_8315(int n) {
        return n >> (-31930 & 4115) & (3 & 4315);
    }

    public void Method_8316(Class_37497 class_37497) {
        this.Field_8300.remove(class_37497);
    }

    public void Method_8317(Class_626 class_626, boolean bl) {
        if (bl) {
            this.Field_8304.remove(class_626);
        } else {
            this.Field_8304.add(class_626);
        }
    }

    protected void Method_8318(int n, int n2, boolean bl, Class_626 class_626) {
        this.Method_8308(n, n2, 8705 & 2193, class_626);
    }

    public static boolean Method_8319(int n, Class_626 class_626) {
        return (n == 0 ? 6145 & 17187 : (n == (513 & 16479) ? -14311 & 1057 : (n == (-32557 & 24870) && class_626.Field_694.Method_18094() ? -32703 & 1041 : 136 & 24592))) != 0;
    }

    public void Method_8320(Class_626 class_626) {
        Class_37781 class_37781 = class_626.Field_628;
        if (class_37781.Method_37812() != null) {
            class_626.Method_733(class_37781.Method_37812(), (-12123 & 9242) != 0);
            class_37781.Method_37804(null);
        }
    }

    public void Method_8321(int n, Class_23823 class_23823) {
        this.Method_8324(n).Method_26437(class_23823);
    }

    public void Method_8322() {
        for (int i = -28172 & 9217; i < this.Field_8299.size(); ++i) {
            Class_23823 class_23823 = ((Class_26421)this.Field_8299.get(i)).Method_26430();
            Class_23823 class_238232 = (Class_23823)this.Field_8301.get(i);
            if (Class_23823.Method_23880(class_238232, class_23823)) continue;
            class_238232 = class_23823 == null ? null : class_23823.Method_23850();
            this.Field_8301.set(i, class_238232);
            for (int j = 2592 & -14896; j < this.Field_8300.size(); ++j) {
                ((Class_37497)this.Field_8300.get(j)).Method_37500(this, i, class_238232);
            }
        }
    }

    public static int Method_8323(Class_4879 class_4879) {
        return class_4879 instanceof Class_4961 ? Class_8295.Method_8337((Class_4961)((Object)class_4879)) : 34 & 8580;
    }

    public Class_26421 Method_8324(int n) {
        return (Class_26421)this.Field_8299.get(n);
    }

    public abstract boolean Method_8325(Class_626 var1);

    private void Method_8326() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static int Method_8327(int n, int n2) {
        return n & (771 & 20655) | (n2 & (259 & -23405)) << (5346 & -30710);
    }

    public boolean Method_8328(Class_626 class_626, int n) {
        return (8192 & 0) != 0;
    }

    public Class_23823 Method_8329(Class_626 class_626, int n) {
        Class_26421 class_26421 = (Class_26421)this.Field_8299.get(n);
        return class_26421 != null ? class_26421.Method_26430() : null;
    }

    public boolean Method_8330(Class_626 class_626) {
        return (!this.Field_8304.contains(class_626) ? 25 & 31745 : 3718 & -24552) != 0;
    }

    protected Class_26421 Method_8331(Class_26421 class_26421) {
        class_26421.Field_26423 = this.Field_8299.size();
        this.Field_8299.add(class_26421);
        this.Field_8301.add(null);
        return class_26421;
    }

    public void Method_8332(Class_23823[] arrclass_23823) {
        for (int i = 31272 & 1174; i < arrclass_23823.length; ++i) {
            this.Method_8324(i).Method_26437(arrclass_23823[i]);
        }
    }

    public List Method_8333() {
        ArrayList arrayList = Lists.newArrayList();
        for (int i = -16263 & 8966; i < this.Field_8299.size(); ++i) {
            arrayList.add(((Class_26421)this.Field_8299.get(i)).Method_26430());
        }
        return arrayList;
    }

    public Class_26421 Method_8334(Class_4961 class_4961, int n) {
        for (int i = 1044 & 16649; i < this.Field_8299.size(); ++i) {
            Class_26421 class_26421 = (Class_26421)this.Field_8299.get(i);
            if (!class_26421.Method_26443(class_4961, n)) continue;
            return class_26421;
        }
        return null;
    }

    public static boolean Method_8335(Class_26421 class_26421, Class_23823 class_23823, boolean bl) {
        int n;
        int n2 = n = class_26421 == null || !class_26421.Method_26439() ? -28275 & 513 : -10237 & 1184;
        if (class_26421 != null && class_26421.Method_26439() && class_23823 != null && class_23823.Method_23865(class_26421.Method_26430()) && Class_23823.Method_23895(class_26421.Method_26430(), class_23823)) {
            n |= class_26421.Method_26430().Field_23826 + (bl ? 1033 & -9518 : class_23823.Field_23826) <= class_23823.Method_23837() ? 20517 & -32631 : 17172 & -32608;
        }
        return n != 0;
    }

    protected boolean Method_8336(Class_23823 class_23823, int n, int n2, boolean bl) {
        Class_23823 class_238232;
        Class_26421 class_26421;
        int n3 = 2481 & -31736;
        int n4 = n;
        if (bl) {
            n4 = n2 - (4617 & 24901);
        }
        if (class_23823.Method_23898()) {
            while (class_23823.Field_23826 > 0 && (!bl && n4 < n2 || bl && n4 >= n)) {
                class_26421 = (Class_26421)this.Field_8299.get(n4);
                class_238232 = class_26421.Method_26430();
                if (class_238232 != null && class_238232.Method_23844() == class_23823.Method_23844() && (!class_23823.Method_23877() || class_23823.Method_23843() == class_238232.Method_23843()) && Class_23823.Method_23895(class_23823, class_238232)) {
                    int n5 = class_238232.Field_23826 + class_23823.Field_23826;
                    if (n5 <= class_23823.Method_23837()) {
                        class_23823.Field_23826 = 16412 & 4290;
                        class_238232.Field_23826 = n5;
                        class_26421.Method_26431();
                        n3 = -28095 & 16385;
                    } else if (class_238232.Field_23826 < class_23823.Method_23837()) {
                        class_23823.Field_23826 -= class_23823.Method_23837() - class_238232.Field_23826;
                        class_238232.Field_23826 = class_23823.Method_23837();
                        class_26421.Method_26431();
                        n3 = 4373 & 2049;
                    }
                }
                if (bl) {
                    --n4;
                    continue;
                }
                ++n4;
            }
        }
        if (class_23823.Field_23826 > 0) {
            n4 = bl ? n2 - (1875 & -20479) : n;
            while (!bl && n4 < n2 || bl && n4 >= n) {
                class_26421 = (Class_26421)this.Field_8299.get(n4);
                class_238232 = class_26421.Method_26430();
                if (class_238232 == null) {
                    class_26421.Method_26437(class_23823.Method_23850());
                    class_26421.Method_26431();
                    class_23823.Field_23826 = -8192 & 1684;
                    n3 = 65 & -10203;
                    break;
                }
                if (bl) {
                    --n4;
                    continue;
                }
                ++n4;
            }
        }
        return n3 != 0;
    }

    public static int Method_8337(Class_4961 class_4961) {
        if (class_4961 == null) {
            return 2099 & -8184;
        }
        int n = 273 & 4106;
        float f = 0.0f;
        for (int i = 11059 & 68; i < class_4961.Method_4968(); ++i) {
            Class_23823 class_23823 = class_4961.Method_4964(i);
            if (class_23823 == null) continue;
            f += (float)class_23823.Field_23826 / (float)Math.min(class_4961.Method_4975(), class_23823.Method_23837());
            ++n;
        }
        return Class_13337.Method_13377((f /= (float)class_4961.Method_4968()) * (35.5f * 0.3943662f)) + (n > 0 ? -7033 & 17 : 16387 & 8192);
    }
}

