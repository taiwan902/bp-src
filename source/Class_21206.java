/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_21206
implements Class_19219 {
    private Class_23823 Field_21207;

    public int Method_21208() {
        return 2827 & 1166;
    }

    public boolean Method_21209(Class_43010 class_43010, Class_283 class_283) {
        Object object;
        this.Field_21207 = null;
        int n = 144 & 20590;
        int n2 = 23056 & -24156;
        int n3 = 785 & 18506;
        int n4 = 16672 & 2128;
        int n5 = 268 & 22083;
        int n6 = 13364 & 2624;
        for (int i = 6224 & 803; i < class_43010.Method_43028(); ++i) {
            object = class_43010.Method_43032(i);
            if (object == null) continue;
            if (((Class_23823)object).Method_23844() == Class_10527.Field_10579) {
                ++n2;
                continue;
            }
            if (((Class_23823)object).Method_23844() == Class_10527.Field_10535) {
                ++n4;
                continue;
            }
            if (((Class_23823)object).Method_23844() == Class_10527.Field_10623) {
                ++n3;
                continue;
            }
            if (((Class_23823)object).Method_23844() == Class_10527.Field_10703) {
                ++n;
                continue;
            }
            if (((Class_23823)object).Method_23844() == Class_10527.Field_10712) {
                ++n5;
                continue;
            }
            if (((Class_23823)object).Method_23844() == Class_10527.Field_10673) {
                ++n5;
                continue;
            }
            if (((Class_23823)object).Method_23844() == Class_10527.Field_10627) {
                ++n6;
                continue;
            }
            if (((Class_23823)object).Method_23844() == Class_10527.Field_10658) {
                ++n6;
                continue;
            }
            if (((Class_23823)object).Method_23844() == Class_10527.Field_10581) {
                ++n6;
                continue;
            }
            if (((Class_23823)object).Method_23844() != Class_10527.Field_10702) {
                return (-16368 & 6188) != 0;
            }
            ++n6;
        }
        n5 = n5 + n3 + n6;
        if (n2 <= (203 & 21539) && n <= (8385 & 20771)) {
            if (n2 >= (-26495 & 117) && n == (16917 & -28383) && n5 == 0) {
                this.Field_21207 = new Class_23823(Class_10527.Field_10583);
                if (n4 > 0) {
                    Class_1699 class_1699 = new Class_1699();
                    object = new Class_1699();
                    Class_1758 class_1758 = new Class_1758();
                    for (int i = 5653 & 40; i < class_43010.Method_43028(); ++i) {
                        Class_23823 class_23823 = class_43010.Method_43032(i);
                        if (class_23823 == null || class_23823.Method_23844() != Class_10527.Field_10535 || !class_23823.Method_23842() || !class_23823.Method_23845().Method_1715("Explosion", 8238 & 91)) continue;
                        class_1758.Method_1781(class_23823.Method_23845().Method_1703("Explosion"));
                    }
                    ((Class_1699)object).Method_1744("Explosions", class_1758);
                    ((Class_1699)object).Method_1724("Flight", (byte)n2);
                    class_1699.Method_1744("Fireworks", (Class_1674)object);
                    this.Field_21207.Method_23869(class_1699);
                }
                return (16385 & 4167) != 0;
            }
            if (n2 == (-7739 & 523) && n == 0 && n4 == 0 && n3 > 0 && n6 <= (-24563 & 5121)) {
                this.Field_21207 = new Class_23823(Class_10527.Field_10535);
                Class_1699 class_1699 = new Class_1699();
                object = new Class_1699();
                int n7 = -27588 & 24576;
                ArrayList arrayList = Lists.newArrayList();
                for (int i = 24594 & -29492; i < class_43010.Method_43028(); ++i) {
                    Class_23823 class_23823 = class_43010.Method_43032(i);
                    if (class_23823 == null) continue;
                    if (class_23823.Method_23844() == Class_10527.Field_10623) {
                        arrayList.add(Class_24451.Field_24452[class_23823.Method_23843() & (20527 & 527)]);
                        continue;
                    }
                    if (class_23823.Method_23844() == Class_10527.Field_10712) {
                        ((Class_1699)object).Method_1706("Flicker", (8321 & 4705) != 0);
                        continue;
                    }
                    if (class_23823.Method_23844() == Class_10527.Field_10673) {
                        ((Class_1699)object).Method_1706("Trail", (321 & 8377) != 0);
                        continue;
                    }
                    if (class_23823.Method_23844() == Class_10527.Field_10627) {
                        n7 = 137 & 16451;
                        continue;
                    }
                    if (class_23823.Method_23844() == Class_10527.Field_10658) {
                        n7 = -27642 & 92;
                        continue;
                    }
                    if (class_23823.Method_23844() == Class_10527.Field_10581) {
                        n7 = 8323 & 2306;
                        continue;
                    }
                    if (class_23823.Method_23844() != Class_10527.Field_10702) continue;
                    n7 = -28541 & 531;
                }
                int[] arrn = new int[arrayList.size()];
                for (int i = 16896 & 8195; i < arrn.length; ++i) {
                    arrn[i] = (Integer)arrayList.get(i);
                }
                ((Class_1699)object).Method_1725("Colors", arrn);
                ((Class_1699)object).Method_1724("Type", (byte)n7);
                class_1699.Method_1744("Explosion", (Class_1674)object);
                this.Field_21207.Method_23869(class_1699);
                return (81 & 1289) != 0;
            }
            if (n2 == 0 && n == 0 && n4 == (269 & 6179) && n3 > 0 && n3 == n5) {
                ArrayList arrayList = Lists.newArrayList();
                for (int i = 8724 & 16585; i < class_43010.Method_43028(); ++i) {
                    Class_23823 class_23823 = class_43010.Method_43032(i);
                    if (class_23823 == null) continue;
                    if (class_23823.Method_23844() == Class_10527.Field_10623) {
                        arrayList.add(Class_24451.Field_24452[class_23823.Method_23843() & (5135 & 2591)]);
                        continue;
                    }
                    if (class_23823.Method_23844() != Class_10527.Field_10535) continue;
                    this.Field_21207 = class_23823.Method_23850();
                    this.Field_21207.Field_23826 = 2073 & 1;
                }
                int[] arrn = new int[arrayList.size()];
                for (int i = 9293 & 146; i < arrn.length; ++i) {
                    arrn[i] = (Integer)arrayList.get(i);
                }
                if (this.Field_21207 != null && this.Field_21207.Method_23842()) {
                    Class_1699 class_1699 = this.Field_21207.Method_23845().Method_1703("Explosion");
                    if (class_1699 == null) {
                        return (6161 & -16306) != 0;
                    }
                    class_1699.Method_1725("FadeColors", arrn);
                    return (16525 & 12385) != 0;
                }
                return (24592 & 162) != 0;
            }
            return (1114 & -32736) != 0;
        }
        return (1216 & 25092) != 0;
    }

    public Class_23823[] Method_21210(Class_43010 class_43010) {
        Class_23823[] arrclass_23823 = new Class_23823[class_43010.Method_43028()];
        for (int i = -31997 & 76; i < arrclass_23823.length; ++i) {
            Class_23823 class_23823 = class_43010.Method_43032(i);
            if (class_23823 == null || !class_23823.Method_23844().Method_2024()) continue;
            arrclass_23823[i] = new Class_23823(class_23823.Method_23844().Method_1991());
        }
        return arrclass_23823;
    }

    public Class_23823 Method_21211() {
        return this.Field_21207;
    }

    private void Method_21212() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_23823 Method_21213(Class_43010 class_43010) {
        return this.Field_21207.Method_23850();
    }
}

