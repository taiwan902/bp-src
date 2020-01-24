/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

public final class Class_29689
extends Class_26851 {
    int Field_29690;
    Class_37570 Field_29691;
    Class_37570 Field_29692;
    Thread Field_29693;
    private static final long Field_29694;
    static final boolean Field_29695;
    private static final Unsafe Field_29696;

    static {
        Field_29695 = !Class_21500.class.desiredAssertionStatus() ? -32121 & 25697 : 17608 & 18;
        try {
            Field_29696 = Class_21500.Method_21548();
            Class<Class_29689> class_ = Class_29689.class;
            Field_29694 = Field_29696.objectFieldOffset(class_.getDeclaredField(Class_29689.Method_29705("\ua809\ua80a\ua800\ua808\ua812\ua811\ua802\ua813\ua808")));
        }
        catch (Exception exception) {
            throw new Error(exception);
        }
    }

    private final void Method_29697() {
        int n = 179 & -6912;
        do {
            int n2;
            if (((n2 = this.Field_29690) & (819 & 16457)) == 0) {
                if (!Field_29696.compareAndSwapInt(this, Field_29694, n2, 8697 & 3587)) continue;
                if (n != 0) {
                    this.Field_29693 = null;
                }
                return;
            }
            if ((n2 & (16911 & 5138)) == 0) {
                if (!Field_29696.compareAndSwapInt(this, Field_29694, n2, n2 | 10 & 26610)) continue;
                n = 16419 & 6157;
                this.Field_29693 = Thread.currentThread();
                continue;
            }
            if (n == 0) continue;
            LockSupport.park(this);
        } while (true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    final Class_26851 Method_29698(int n, Object object) {
        if (object != null) {
            Class_26851 class_26851 = this.Field_29691;
            while (class_26851 != null) {
                int n2 = this.Field_29690;
                if ((n2 & (-24533 & 3651)) != 0) {
                    Object object2;
                    if (class_26851.Field_26852 == n && ((object2 = class_26851.Field_26855) == object || object2 != null && object.equals(object2))) {
                        return class_26851;
                    }
                } else if (Field_29696.compareAndSwapInt(this, Field_29694, n2, n2 + (18468 & 13462))) {
                    Class_37570 class_37570;
                    try {
                        Class_37570 class_375702 = this.Field_29692;
                        class_37570 = class_375702 == null ? null : class_375702.Method_37578(n, object, null);
                    }
                    finally {
                        Thread thread;
                        int n3;
                        while (!Field_29696.compareAndSwapInt(this, Field_29694, n3 = this.Field_29690, n3 - (3076 & 8470))) {
                        }
                        if (n3 == (16750 & 23) && (thread = this.Field_29693) != null) {
                            LockSupport.unpark(thread);
                        }
                    }
                    return class_37570;
                }
                class_26851 = class_26851.Field_26854;
            }
        }
        return null;
    }

    private final void Method_29699() {
        this.Field_29690 = 1864 & 4128;
    }

    static Class_37570 Method_29700(Class_37570 class_37570, Class_37570 class_375702) {
        while (class_375702 != null && class_375702 != class_37570) {
            Class_37570 class_375703;
            Class_37570 class_375704;
            Class_37570 class_375705 = class_375702.Field_37573;
            if (class_375705 == null) {
                class_375702.Field_37574 = 18528 & 9740;
                return class_375702;
            }
            if (class_375702.Field_37574) {
                class_375702.Field_37574 = 1034 & 16741;
                return class_37570;
            }
            Class_37570 class_375706 = class_375705.Field_37571;
            if (class_375706 == class_375702) {
                Class_37570 class_375707 = class_375705.Field_37572;
                if (class_375707 != null && class_375707.Field_37574) {
                    class_375707.Field_37574 = 17649 & 8202;
                    class_375705.Field_37574 = 16625 & 5;
                    class_37570 = Class_29689.Method_29709(class_37570, class_375705);
                    class_375705 = class_375702.Field_37573;
                    Class_37570 class_375708 = class_375707 = class_375705 == null ? null : class_375705.Field_37572;
                }
                if (class_375707 == null) {
                    class_375702 = class_375705;
                    continue;
                }
                class_375704 = class_375707.Field_37571;
                class_375703 = class_375707.Field_37572;
                if (!(class_375703 != null && class_375703.Field_37574 || class_375704 != null && class_375704.Field_37574)) {
                    class_375707.Field_37574 = 3105 & 4289;
                    class_375702 = class_375705;
                    continue;
                }
                if (class_375703 == null || !class_375703.Field_37574) {
                    if (class_375704 != null) {
                        class_375704.Field_37574 = -27613 & 2448;
                    }
                    class_375707.Field_37574 = -30551 & 8257;
                    class_37570 = Class_29689.Method_29707(class_37570, class_375707);
                    class_375705 = class_375702.Field_37573;
                    Class_37570 class_375709 = class_375707 = class_375705 == null ? null : class_375705.Field_37572;
                }
                if (class_375707 != null) {
                    class_375707.Field_37574 = class_375705 == null ? 16488 & 4610 : class_375705.Field_37574;
                    class_375703 = class_375707.Field_37572;
                    if (class_375703 != null) {
                        class_375703.Field_37574 = 16384 & 736;
                    }
                }
                if (class_375705 != null) {
                    class_375705.Field_37574 = -26365 & 120;
                    class_37570 = Class_29689.Method_29709(class_37570, class_375705);
                }
                class_375702 = class_37570;
                continue;
            }
            if (class_375706 != null && class_375706.Field_37574) {
                class_375706.Field_37574 = 1024 & -28254;
                class_375705.Field_37574 = 8375 & 2049;
                class_37570 = Class_29689.Method_29707(class_37570, class_375705);
                class_375705 = class_375702.Field_37573;
                Class_37570 class_3757010 = class_375706 = class_375705 == null ? null : class_375705.Field_37571;
            }
            if (class_375706 == null) {
                class_375702 = class_375705;
                continue;
            }
            class_375704 = class_375706.Field_37571;
            class_375703 = class_375706.Field_37572;
            if (!(class_375704 != null && class_375704.Field_37574 || class_375703 != null && class_375703.Field_37574)) {
                class_375706.Field_37574 = 13825 & 2313;
                class_375702 = class_375705;
                continue;
            }
            if (class_375704 == null || !class_375704.Field_37574) {
                if (class_375703 != null) {
                    class_375703.Field_37574 = 5121 & 16516;
                }
                class_375706.Field_37574 = 81 & -28625;
                class_37570 = Class_29689.Method_29709(class_37570, class_375706);
                class_375705 = class_375702.Field_37573;
                Class_37570 class_3757011 = class_375706 = class_375705 == null ? null : class_375705.Field_37571;
            }
            if (class_375706 != null) {
                class_375706.Field_37574 = class_375705 == null ? 14336 & 16460 : class_375705.Field_37574;
                class_375704 = class_375706.Field_37571;
                if (class_375704 != null) {
                    class_375704.Field_37574 = 11012 & -27640;
                }
            }
            if (class_375705 != null) {
                class_375705.Field_37574 = -32703 & 2100;
                class_37570 = Class_29689.Method_29707(class_37570, class_375705);
            }
            class_375702 = class_37570;
        }
        return class_37570;
    }

    private final void Method_29701() {
        if (!Field_29696.compareAndSwapInt(this, Field_29694, 4691 & 0, 10241 & 199)) {
            this.Method_29697();
        }
    }

    static boolean Method_29702(Class_37570 class_37570) {
        Class_37570 class_375702 = class_37570.Field_37573;
        Class_37570 class_375703 = class_37570.Field_37571;
        Class_37570 class_375704 = class_37570.Field_37572;
        Class_37570 class_375705 = class_37570.Field_37575;
        Class_37570 class_375706 = (Class_37570)class_37570.next;
        if (class_375705 != null && class_375705.next != class_37570) {
            return (-30624 & 9232) != 0;
        }
        if (class_375706 != null && class_375706.Field_37575 != class_37570) {
            return (609 & 14720) != 0;
        }
        if (class_375702 != null && class_37570 != class_375702.Field_37571 && class_37570 != class_375702.Field_37572) {
            return (17154 & -29560) != 0;
        }
        if (class_375703 != null && (class_375703.Field_37573 != class_37570 || class_375703.hash > class_37570.hash)) {
            return (168 & 336) != 0;
        }
        if (class_375704 != null && (class_375704.Field_37573 != class_37570 || class_375704.hash < class_37570.hash)) {
            return (8736 & -29554) != 0;
        }
        if (class_37570.Field_37574 && class_375703 != null && class_375703.Field_37574 && class_375704 != null && class_375704.Field_37574) {
            return (14404 & 160) != 0;
        }
        if (class_375703 != null && !Class_29689.Method_29702(class_375703)) {
            return (2417 & 9738) != 0;
        }
        if (class_375704 != null && !Class_29689.Method_29702(class_375704)) {
            return (104 & -19324) != 0;
        }
        return (1089 & 1) != 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    final Class_37570 Method_29703(int n, Object object, Object object2) {
        block21 : {
            Class_37570 class_37570;
            int n2;
            Class_37570 class_375702;
            Class class_ = null;
            Class_37570 class_375703 = this.Field_29692;
            do {
                if (class_375703 == null) {
                    this.Field_29691 = this.Field_29692 = new Class_37570(n, object, object2, null, null);
                    break block21;
                }
                int n3 = class_375703.hash;
                if (n3 > n) {
                    n2 = -1 & -1;
                } else if (n3 < n) {
                    n2 = 16393 & -31743;
                } else {
                    Object object3 = class_375703.key;
                    if (object3 == object || object3 != null && object.equals(object3)) {
                        return class_375703;
                    }
                    if (class_ == null && (class_ = Class_21500.Method_21572(object)) == null || (n2 = Class_21500.Method_21526(class_, object, object3)) == 0) {
                        if (class_375703.Field_37571 == null) {
                            n2 = 25683 & 385;
                        } else {
                            Class_37570 class_375704;
                            Class_37570 class_375705 = class_375703.Field_37572;
                            if (class_375705 == null || (class_375704 = class_375705.Method_37578(n, object, class_)) == null) {
                                n2 = -1 & -1;
                            } else {
                                return class_375704;
                            }
                        }
                    }
                }
                class_375702 = class_375703;
            } while ((class_375703 = n2 < 0 ? class_375703.Field_37571 : class_375703.Field_37572) != null);
            Class_37570 class_375706 = this.Field_29691;
            this.Field_29691 = class_37570 = new Class_37570(n, object, object2, class_375706, class_375702);
            if (class_375706 != null) {
                class_375706.Field_37575 = class_37570;
            }
            if (n2 < 0) {
                class_375702.Field_37571 = class_37570;
            } else {
                class_375702.Field_37572 = class_37570;
            }
            if (!class_375702.Field_37574) {
                class_37570.Field_37574 = 20513 & 2185;
            } else {
                this.Method_29701();
                try {
                    this.Field_29692 = Class_29689.Method_29704(this.Field_29692, class_37570);
                }
                finally {
                    this.Method_29699();
                }
            }
        }
        if (!Field_29695 && !Class_29689.Method_29702(this.Field_29692)) {
            throw new AssertionError();
        }
        return null;
    }

    static Class_37570 Method_29704(Class_37570 class_37570, Class_37570 class_375702) {
        class_375702.Field_37574 = -30141 & 8205;
        do {
            Class_37570 class_375703;
            Class_37570 class_375704;
            if ((class_375704 = class_375702.Field_37573) == null) {
                class_375702.Field_37574 = 330 & 4132;
                return class_375702;
            }
            if (!class_375704.Field_37574 || (class_375703 = class_375704.Field_37573) == null) {
                return class_37570;
            }
            Class_37570 class_375705 = class_375703.Field_37571;
            if (class_375704 == class_375705) {
                Class_37570 class_375706 = class_375703.Field_37572;
                if (class_375706 != null && class_375706.Field_37574) {
                    class_375706.Field_37574 = 2576 & -28664;
                    class_375704.Field_37574 = -30328 & 26118;
                    class_375703.Field_37574 = 17993 & 421;
                    class_375702 = class_375703;
                    continue;
                }
                if (class_375702 == class_375704.Field_37572) {
                    class_375702 = class_375704;
                    class_37570 = Class_29689.Method_29709(class_37570, class_375702);
                    class_375704 = class_375702.Field_37573;
                    Class_37570 class_375707 = class_375703 = class_375704 == null ? null : class_375704.Field_37573;
                }
                if (class_375704 == null) continue;
                class_375704.Field_37574 = -32380 & 1073;
                if (class_375703 == null) continue;
                class_375703.Field_37574 = 6473 & 643;
                class_37570 = Class_29689.Method_29707(class_37570, class_375703);
                continue;
            }
            if (class_375705 != null && class_375705.Field_37574) {
                class_375705.Field_37574 = 25760 & 514;
                class_375704.Field_37574 = 6551 & 16416;
                class_375703.Field_37574 = -29597 & 141;
                class_375702 = class_375703;
                continue;
            }
            if (class_375702 == class_375704.Field_37571) {
                class_375702 = class_375704;
                class_37570 = Class_29689.Method_29707(class_37570, class_375702);
                class_375704 = class_375702.Field_37573;
                Class_37570 class_375708 = class_375703 = class_375704 == null ? null : class_375704.Field_37573;
            }
            if (class_375704 == null) continue;
            class_375704.Field_37574 = 12361 & 2048;
            if (class_375703 == null) continue;
            class_375703.Field_37574 = 1163 & 6165;
            class_37570 = Class_29689.Method_29709(class_37570, class_375703);
        } while (true);
    }

    Class_29689(Class_37570 class_37570) {
        super(-2 & -1, null, null, null);
        this.Field_29691 = class_37570;
        Class_37570 class_375702 = null;
        Class_37570 class_375703 = class_37570;
        while (class_375703 != null) {
            Class_37570 class_375704 = (Class_37570)class_375703.next;
            class_375703.Field_37572 = null;
            class_375703.Field_37571 = null;
            if (class_375702 == null) {
                class_375703.Field_37573 = null;
                class_375703.Field_37574 = -28671 & 474;
                class_375702 = class_375703;
            } else {
                int n;
                Class_37570 class_375705;
                Object object = class_375703.key;
                int n2 = class_375703.hash;
                Class class_ = null;
                Class_37570 class_375706 = class_375702;
                do {
                    int n3;
                    n = (n3 = class_375706.hash) > n2 ? -1 & -1 : (n3 < n2 ? -32703 & 4881 : (class_ != null || (class_ = Class_21500.Method_21572(object)) != null ? Class_21500.Method_21526(class_, object, class_375706.key) : -16087 & 512));
                    class_375705 = class_375706;
                } while ((class_375706 = n <= 0 ? class_375706.Field_37571 : class_375706.Field_37572) != null);
                class_375703.Field_37573 = class_375705;
                if (n <= 0) {
                    class_375705.Field_37571 = class_375703;
                } else {
                    class_375705.Field_37572 = class_375703;
                }
                class_375702 = Class_29689.Method_29704(class_375702, class_375703);
            }
            class_375703 = class_375704;
        }
        this.Field_29692 = class_375702;
    }

    private static String Method_29705(String string) {
        int n = 6017;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_29689.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    final boolean Method_29706(Class_37570 class_37570) {
        Class_37570 class_375702;
        Class_37570 class_375703 = (Class_37570)class_37570.next;
        Class_37570 class_375704 = class_37570.Field_37575;
        if (class_375704 == null) {
            this.Field_29691 = class_375703;
        } else {
            class_375704.next = class_375703;
        }
        if (class_375703 != null) {
            class_375703.Field_37575 = class_375704;
        }
        if (this.Field_29691 == null) {
            this.Field_29692 = null;
            return (24673 & 6153) != 0;
        }
        Class_37570 class_375705 = this.Field_29692;
        if (class_375705 == null || class_375705.Field_37572 == null || (class_375702 = class_375705.Field_37571) == null || class_375702.Field_37571 == null) {
            return (-30717 & 273) != 0;
        }
        this.Method_29701();
        try {
            Class_37570 class_375706;
            Class_37570 class_375707;
            Class_37570 class_375708 = class_37570.Field_37571;
            Class_37570 class_375709 = class_37570.Field_37572;
            if (class_375708 != null && class_375709 != null) {
                Class_37570 class_3757010;
                class_375706 = class_375709;
                while ((class_3757010 = class_375706.Field_37571) != null) {
                    class_375706 = class_3757010;
                }
                boolean bl = class_375706.Field_37574;
                class_375706.Field_37574 = class_37570.Field_37574;
                class_37570.Field_37574 = bl;
                Class_37570 class_3757011 = class_375706.Field_37572;
                Class_37570 class_3757012 = class_37570.Field_37573;
                if (class_375706 == class_375709) {
                    class_37570.Field_37573 = class_375706;
                    class_375706.Field_37572 = class_37570;
                } else {
                    Class_37570 class_3757013 = class_375706.Field_37573;
                    class_37570.Field_37573 = class_3757013;
                    if (class_37570.Field_37573 != null) {
                        if (class_375706 == class_3757013.Field_37571) {
                            class_3757013.Field_37571 = class_37570;
                        } else {
                            class_3757013.Field_37572 = class_37570;
                        }
                    }
                    class_375706.Field_37572 = class_375709;
                    class_375709.Field_37573 = class_375706;
                }
                class_37570.Field_37571 = null;
                class_375706.Field_37571 = class_375708;
                class_375708.Field_37573 = class_375706;
                class_37570.Field_37572 = class_3757011;
                if (class_37570.Field_37572 != null) {
                    class_3757011.Field_37573 = class_37570;
                }
                if ((class_375706.Field_37573 = class_3757012) == null) {
                    class_375705 = class_375706;
                } else if (class_37570 == class_3757012.Field_37571) {
                    class_3757012.Field_37571 = class_375706;
                } else {
                    class_3757012.Field_37572 = class_375706;
                }
                class_375707 = class_3757011 != null ? class_3757011 : class_37570;
            } else {
                class_375707 = class_375708 != null ? class_375708 : (class_375709 != null ? class_375709 : class_37570);
            }
            if (class_375707 != class_37570) {
                class_375707.Field_37573 = class_37570.Field_37573;
                class_375706 = class_375707.Field_37573;
                if (class_375706 == null) {
                    class_375705 = class_375707;
                } else if (class_37570 == class_375706.Field_37571) {
                    class_375706.Field_37571 = class_375707;
                } else {
                    class_375706.Field_37572 = class_375707;
                }
                class_37570.Field_37573 = null;
                class_37570.Field_37572 = null;
                class_37570.Field_37571 = null;
            }
            Class_37570 class_3757014 = this.Field_29692 = class_37570.Field_37574 ? class_375705 : Class_29689.Method_29700(class_375705, class_375707);
            if (class_37570 == class_375707 && (class_375706 = class_37570.Field_37573) != null) {
                if (class_37570 == class_375706.Field_37571) {
                    class_375706.Field_37571 = null;
                } else if (class_37570 == class_375706.Field_37572) {
                    class_375706.Field_37572 = null;
                }
                class_37570.Field_37573 = null;
            }
        }
        finally {
            this.Method_29699();
        }
        if (!Field_29695 && !Class_29689.Method_29702(this.Field_29692)) {
            throw new AssertionError();
        }
        return (-13307 & 12418) != 0;
    }

    static Class_37570 Method_29707(Class_37570 class_37570, Class_37570 class_375702) {
        Class_37570 class_375703;
        if (class_375702 != null && (class_375703 = class_375702.Field_37571) != null) {
            Class_37570 class_375704 = class_375702.Field_37571 = class_375703.Field_37572;
            if (class_375702.Field_37571 != null) {
                class_375704.Field_37573 = class_375702;
            }
            Class_37570 class_375705 = class_375703.Field_37573 = class_375702.Field_37573;
            if (class_375703.Field_37573 == null) {
                class_37570 = class_375703;
                class_375703.Field_37574 = 8713 & -10208;
            } else if (class_375705.Field_37572 == class_375702) {
                class_375705.Field_37572 = class_375703;
            } else {
                class_375705.Field_37571 = class_375703;
            }
            class_375703.Field_37572 = class_375702;
            class_375702.Field_37573 = class_375703;
        }
        return class_37570;
    }

    private void Method_29708() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static Class_37570 Method_29709(Class_37570 class_37570, Class_37570 class_375702) {
        Class_37570 class_375703;
        if (class_375702 != null && (class_375703 = class_375702.Field_37572) != null) {
            Class_37570 class_375704 = class_375702.Field_37572 = class_375703.Field_37571;
            if (class_375702.Field_37572 != null) {
                class_375704.Field_37573 = class_375702;
            }
            Class_37570 class_375705 = class_375703.Field_37573 = class_375702.Field_37573;
            if (class_375703.Field_37573 == null) {
                class_37570 = class_375703;
                class_375703.Field_37574 = 512 & -29687;
            } else if (class_375705.Field_37571 == class_375702) {
                class_375705.Field_37571 = class_375703;
            } else {
                class_375705.Field_37572 = class_375703;
            }
            class_375703.Field_37571 = class_375702;
            class_375702.Field_37573 = class_375703;
        }
        return class_37570;
    }
}

