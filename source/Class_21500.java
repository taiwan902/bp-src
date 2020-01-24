/*
 * Decompiled with CFR 0.145.
 */
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import sun.misc.Unsafe;

public class Class_21500
implements Serializable,
ConcurrentMap {
    private static final long Field_21501;
    private transient int Field_21502;
    private static final long Field_21503;
    private static final int Field_21504;
    private transient Class_26851[] Field_21505;
    transient Class_26851[] Field_21506;
    private transient int Field_21507;
    static final AtomicInteger Field_21508;
    private transient long Field_21509;
    private transient Class_33227 Field_21510;
    static final int Field_21511;
    private static final ObjectStreamField[] Field_21512;
    private static final long Field_21513;
    private transient Class_30072 Field_21514;
    private static final long Field_21515;
    private static final Unsafe Field_21516;
    private transient Class_25890 Field_21517;
    private transient int Field_21518;
    private static final long Field_21519;
    private static final long Field_21520;
    private static final long Field_21521;
    private transient Class_17171[] Field_21522;
    private transient int Field_21523;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    final Object Method_21524(Object object, Object object2, boolean bl) {
        int n;
        block19 : {
            Object object3;
            int n2;
            if (object == null || object2 == null) {
                throw new NullPointerException();
            }
            int n3 = Class_21500.Method_21535(object.hashCode());
            n = 20889 & -22528;
            Class_26851[] arrclass_26851 = this.Field_21506;
            do {
                int n4;
                if (arrclass_26851 == null || (n4 = arrclass_26851.length) == 0) {
                    arrclass_26851 = this.Method_21546();
                    continue;
                }
                n2 = n4 - (11329 & 1) & n3;
                Class_26851 class_26851 = Class_21500.Method_21573(arrclass_26851, n2);
                if (class_26851 == null) {
                    if (!Class_21500.Method_21536(arrclass_26851, n2, null, new Class_26851(n3, object, object2, null))) continue;
                    break block19;
                }
                int n5 = class_26851.Field_26852;
                if (n5 == (-1 & -1)) {
                    arrclass_26851 = this.Method_21537(arrclass_26851, class_26851);
                    continue;
                }
                object3 = null;
                Class_26851 class_268512 = class_26851;
                synchronized (class_268512) {
                    block20 : {
                        if (Class_21500.Method_21573(arrclass_26851, n2) == class_26851) {
                            Class_26851 class_268513;
                            if (n5 >= 0) {
                                n = 27915 & -28655;
                                class_268513 = class_26851;
                                do {
                                    Object object4;
                                    if (class_268513.Field_26852 == n3 && ((object4 = class_268513.Field_26855) == object || object4 != null && object.equals(object4))) {
                                        object3 = class_268513.Field_26853;
                                        if (!bl) {
                                            class_268513.Field_26853 = object2;
                                        }
                                        break block20;
                                    }
                                    Class_26851 class_268514 = class_268513;
                                    class_268513 = class_268513.Field_26854;
                                    if (class_268513 == null) {
                                        class_268514.Field_26854 = new Class_26851(n3, object, object2, null);
                                        break block20;
                                    }
                                    ++n;
                                } while (true);
                            }
                            if (class_26851 instanceof Class_29689) {
                                n = -32381 & 27138;
                                class_268513 = ((Class_29689)class_26851).Method_29703(n3, object, object2);
                                if (class_268513 != null) {
                                    object3 = class_268513.Field_26853;
                                    if (!bl) {
                                        class_268513.Field_26853 = object2;
                                    }
                                }
                            }
                        }
                    }
                }
                if (n != 0) break;
            } while (true);
            if (n >= (154 & -31124)) {
                this.Method_21528(arrclass_26851, n2);
            }
            if (object3 != null) {
                return object3;
            }
        }
        this.Method_21554(6897477300997063209L & 16951361L, n);
        return null;
    }

    private static String Method_21525(String string) {
        int n = 4103;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21500.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static int Method_21526(Class class_, Object object, Object object2) {
        return object2 == null || object2.getClass() != class_ ? 7016 & -31609 : ((Comparable)object).compareTo(object2);
    }

    public Collection Method_21527() {
        Class_30072 class_30072 = this.Field_21514;
        return class_30072 != null ? class_30072 : (this.Field_21514 = new Class_30072(this));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void Method_21528(Class_26851[] arrclass_26851, int n) {
        if (arrclass_26851 != null) {
            int n2 = arrclass_26851.length;
            if (n2 < (18496 & 8904)) {
                int n3;
                if (arrclass_26851 == this.Field_21506 && (n3 = this.Field_21518) >= 0 && Field_21516.compareAndSwapInt(this, Field_21503, n3, -1 & -2)) {
                    this.Method_21534(arrclass_26851, null);
                }
            } else {
                Class_26851 class_26851 = Class_21500.Method_21573(arrclass_26851, n);
                if (class_26851 != null && class_26851.Field_26852 >= 0) {
                    Class_26851 class_268512 = class_26851;
                    synchronized (class_268512) {
                        if (Class_21500.Method_21573(arrclass_26851, n) == class_26851) {
                            Class_37570 class_37570 = null;
                            Class_37570 class_375702 = null;
                            Class_26851 class_268513 = class_26851;
                            while (class_268513 != null) {
                                Class_37570 class_375703 = new Class_37570(class_268513.Field_26852, class_268513.Field_26855, class_268513.Field_26853, null, null);
                                class_375703.Field_37575 = class_375702;
                                if (class_375703.Field_37575 == null) {
                                    class_37570 = class_375703;
                                } else {
                                    class_375702.next = class_375703;
                                }
                                class_375702 = class_375703;
                                class_268513 = class_268513.Field_26854;
                            }
                            Class_21500.Method_21552(arrclass_26851, n, new Class_29689(class_37570));
                        }
                    }
                }
            }
        }
    }

    private static String Method_21529(String string) {
        int n = 12325;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21500.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_21530(String string) {
        int n = 4458;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21500.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_21531(String string) {
        int n = 29529;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21500.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_21532(Map map) {
        this.Method_21560(map.size());
        for (Map.Entry entry : map.entrySet()) {
            this.Method_21524(entry.getKey(), entry.getValue(), (17060 & 5184) != 0);
        }
    }

    private static String Method_21533(String string) {
        int n = 27499;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21500.class, 2);
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
    private final void Method_21534(Class_26851[] arrclass_26851, Class_26851[] arrclass_268512) {
        int n;
        int n2;
        int n3 = arrclass_26851.length;
        int n4 = Field_21511 > (16899 & 393) ? (n3 >>> (2051 & -31893)) / Field_21511 : n3;
        if (n4 < (18198 & 2136)) {
            n4 = 20568 & 22;
        }
        if (arrclass_268512 == null) {
            Object object;
            try {
                object = new Class_26851[n3 << (4099 & 16801)];
                arrclass_268512 = object;
            }
            catch (Throwable throwable) {
                this.Field_21518 = -1 & Integer.MAX_VALUE;
                return;
            }
            this.Field_21505 = arrclass_268512;
            this.Field_21502 = n3;
            this.Field_21507 = n3;
            object = new Class_44580(arrclass_26851);
            int n5 = n3;
            while (n5 > 0) {
                for (n2 = n = n5 > n4 ? n5 - n4 : 8 & 16935; n2 < n5; ++n2) {
                    arrclass_268512[n2] = object;
                }
                for (n2 = n3 + n; n2 < n3 + n5; ++n2) {
                    arrclass_268512[n2] = object;
                }
                n5 = n;
                Field_21516.putOrderedInt(this, Field_21520, n5);
            }
        }
        int n6 = arrclass_268512.length;
        Class_44580 class_44580 = new Class_44580(arrclass_268512);
        n = 16641 & 6215;
        n2 = 24710 & 2584;
        int n7 = 24578 & 4212;
        int n8 = 4712 & 9360;
        do {
            if (n != 0) {
                if (--n7 >= n8 || n2 != 0) {
                    n = -27903 & 19460;
                    continue;
                }
                int n9 = this.Field_21507;
                if (n9 <= this.Field_21502) {
                    n7 = -1 & -1;
                    n = 15376 & -32160;
                    continue;
                }
                int n10 = n9 > n4 ? n9 - n4 : 11312 & -27903;
                if (!Field_21516.compareAndSwapInt(this, Field_21519, n9, n10)) continue;
                n8 = n10;
                n7 = n9 - (16401 & -28857);
                n = -32255 & 2332;
                continue;
            }
            if (n7 < 0 || n7 >= n3 || n7 + n3 >= n6) {
                int n11;
                int n12;
                if (n2 != 0) {
                    this.Field_21505 = null;
                    this.Field_21506 = arrclass_268512;
                    this.Field_21518 = (n3 << (147 & -16375)) - (n3 >>> (-29687 & 4993));
                    return;
                }
                do {
                    n12 = n11 = this.Field_21518;
                } while (!Field_21516.compareAndSwapInt(this, Field_21503, n12, ++n11));
                if (n11 != (-1 & -1)) {
                    return;
                }
                n2 = n = 2117 & 8465;
                n7 = n3;
                continue;
            }
            Class_26851 class_26851 = Class_21500.Method_21573(arrclass_26851, n7);
            if (class_26851 == null) {
                if (!Class_21500.Method_21536(arrclass_26851, n7, null, class_44580)) continue;
                Class_21500.Method_21552(arrclass_268512, n7, null);
                Class_21500.Method_21552(arrclass_268512, n7 + n3, null);
                n = 1057 & 6341;
                continue;
            }
            int n13 = class_26851.Field_26852;
            if (n13 == (-1 & -1)) {
                n = 201 & 14595;
                continue;
            }
            Class_26851 class_268512 = class_26851;
            synchronized (class_268512) {
                if (Class_21500.Method_21573(arrclass_26851, n7) == class_26851) {
                    Class_26851 class_268513;
                    Class_26851 class_268514;
                    Object object;
                    Class_26851 class_268515;
                    Object object2;
                    Class_37570 class_37570;
                    Class_26851 class_268516;
                    if (n13 >= 0) {
                        Object object3 = n13 & n3;
                        class_268513 = class_26851;
                        class_268515 = class_26851.Field_26854;
                        while (class_268515 != null) {
                            class_37570 = (Class_37570)(class_268515.Field_26852 & n3);
                            if (class_37570 != object3) {
                                object3 = class_37570;
                                class_268513 = class_268515;
                            }
                            class_268515 = class_268515.Field_26854;
                        }
                        if (object3 == 0) {
                            class_268516 = class_268513;
                            class_268514 = null;
                        } else {
                            class_268514 = class_268513;
                            class_268516 = null;
                        }
                        class_268515 = class_26851;
                        while (class_268515 != class_268513) {
                            class_37570 = (Class_37570)class_268515.Field_26852;
                            object = class_268515.Field_26855;
                            object2 = class_268515.Field_26853;
                            if ((class_37570 & n3) == 0) {
                                class_268516 = new Class_26851((int)class_37570, object, object2, class_268516);
                            } else {
                                class_268514 = new Class_26851((int)class_37570, object, object2, class_268514);
                            }
                            class_268515 = class_268515.Field_26854;
                        }
                        Class_21500.Method_21552(arrclass_268512, n7, class_268516);
                        Class_21500.Method_21552(arrclass_268512, n7 + n3, class_268514);
                        Class_21500.Method_21552(arrclass_26851, n7, class_44580);
                        n = -32253 & 12313;
                    } else if (class_26851 instanceof Class_29689) {
                        Class_29689 class_29689 = (Class_29689)class_26851;
                        class_268513 = null;
                        class_268515 = null;
                        class_37570 = null;
                        object = null;
                        object2 = 68 & 12435;
                        int n14 = 649 & 17408;
                        Class_26851 class_268517 = class_29689.Field_29691;
                        while (class_268517 != null) {
                            int n15 = class_268517.Field_26852;
                            Class_37570 class_375702 = new Class_37570(n15, class_268517.Field_26855, class_268517.Field_26853, null, null);
                            if ((n15 & n3) == 0) {
                                class_375702.Field_37575 = class_268515;
                                if (class_375702.Field_37575 == null) {
                                    class_268513 = class_375702;
                                } else {
                                    ((Class_37570)class_268515).next = class_375702;
                                }
                                class_268515 = class_375702;
                                ++object2;
                            } else {
                                class_375702.Field_37575 = object;
                                if (class_375702.Field_37575 == null) {
                                    class_37570 = class_375702;
                                } else {
                                    ((Class_37570)object).next = class_375702;
                                }
                                object = class_375702;
                                ++n14;
                            }
                            class_268517 = class_268517.Field_26854;
                        }
                        Class_26851 class_268518 = object2 <= (175 & -22458) ? Class_21500.Method_21561(class_268513) : (class_268516 = n14 != 0 ? new Class_29689((Class_37570)class_268513) : class_29689);
                        class_268514 = n14 <= (19750 & -20457) ? Class_21500.Method_21561(class_37570) : (object2 != 0 ? new Class_29689(class_37570) : class_29689);
                        Class_21500.Method_21552(arrclass_268512, n7, class_268516);
                        Class_21500.Method_21552(arrclass_268512, n7 + n3, class_268514);
                        Class_21500.Method_21552(arrclass_26851, n7, class_44580);
                        n = 17495 & 2089;
                    }
                }
            }
        } while (true);
    }

    static final int Method_21535(int n) {
        return (n ^ n >>> (662 & 113)) & (Integer.MAX_VALUE & Integer.MAX_VALUE);
    }

    static final boolean Method_21536(Class_26851[] arrclass_26851, int n, Class_26851 class_26851, Class_26851 class_268512) {
        return Field_21516.compareAndSwapObject(arrclass_26851, ((long)n << Field_21504) + Field_21515, class_26851, class_268512);
    }

    final Class_26851[] Method_21537(Class_26851[] arrclass_26851, Class_26851 class_26851) {
        Class_26851[] arrclass_268512;
        if (class_26851 instanceof Class_44580 && (arrclass_268512 = ((Class_44580)class_26851).Field_44581) != null) {
            int n;
            if (arrclass_268512 == this.Field_21505 && arrclass_26851 == this.Field_21506 && this.Field_21507 > this.Field_21502 && (n = this.Field_21518) < (-1 & -1) && Field_21516.compareAndSwapInt(this, Field_21503, n, n - (16433 & -24309))) {
                this.Method_21534(arrclass_26851, arrclass_268512);
            }
            return arrclass_268512;
        }
        return this.Field_21506;
    }

    public boolean Method_21538(Object object, Object object2) {
        if (object == null) {
            throw new NullPointerException();
        }
        return (object2 != null && this.Method_21564(object, null, object2) != null ? -17741 & 16389 : -12288 & 1025) != 0;
    }

    private void Method_21539() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void Method_21540(Class_32728 class_32728, long l, Class_43471 class_43471, boolean bl) {
        int n;
        int n2;
        if (class_43471 == null) {
            class_43471 = new Class_43471();
            n = Field_21508.addAndGet(1742243399 & -104012185);
            class_43471.Field_43472 = n == 0 ? 12305 & 259 : n;
            n2 = class_43471.Field_43472;
            class_32728.Method_32753(class_43471);
        } else {
            n2 = class_43471.Field_43472;
        }
        n = 1612 & -24573;
        do {
            Class_17171[] arrclass_17171;
            int n3;
            long l2;
            if ((arrclass_17171 = this.Field_21522) != null && (n3 = arrclass_17171.length) > 0) {
                int n4;
                Class_17171[] arrclass_171712;
                Class_17171 class_17171 = arrclass_17171[n3 - (-30587 & 1105) & n2];
                if (class_17171 == null) {
                    if (this.Field_21523 == 0) {
                        arrclass_171712 = new Class_17171(l);
                        if (this.Field_21523 == 0 && Field_21516.compareAndSwapInt(this, Field_21513, 516 & -21247, 329 & 30209)) {
                            n4 = 16916 & -28253;
                            try {
                                int n5;
                                int n6;
                                Class_17171[] arrclass_171713 = this.Field_21522;
                                if (arrclass_171713 != null && (n5 = arrclass_171713.length) > 0 && arrclass_171713[n6 = n5 - (2453 & 9) & n2] == null) {
                                    arrclass_171713[n6] = arrclass_171712;
                                    n4 = 14745 & -16383;
                                }
                            }
                            catch (Throwable throwable) {
                                this.Field_21523 = -29411 & 8192;
                                throw throwable;
                            }
                            this.Field_21523 = 8208 & -15858;
                            if (n4 == 0) continue;
                            break;
                        }
                    }
                    n = 17938 & 2341;
                } else if (!bl) {
                    bl = 137 & 2087;
                } else {
                    l2 = class_17171.Field_17172;
                    if (Field_21516.compareAndSwapLong(class_17171, Field_21521, l2, l2 + l)) break;
                    if (this.Field_21522 != arrclass_17171 || n3 >= Field_21511) {
                        n = 4284 & 9218;
                    } else if (n == 0) {
                        n = -11773 & 11553;
                    } else if (this.Field_21523 == 0 && Field_21516.compareAndSwapInt(this, Field_21513, 16503 & -32512, -30975 & 8291)) {
                        try {
                            if (this.Field_21522 == arrclass_17171) {
                                arrclass_171712 = new Class_17171[n3 << (-27647 & 33)];
                                for (n4 = 10520 & 16580; n4 < n3; ++n4) {
                                    arrclass_171712[n4] = arrclass_17171[n4];
                                }
                                this.Field_21522 = arrclass_171712;
                            }
                        }
                        catch (Throwable throwable) {
                            this.Field_21523 = -21760 & 5;
                            throw throwable;
                        }
                        this.Field_21523 = 1045 & 18530;
                        n = 274 & 1024;
                        continue;
                    }
                }
                n2 ^= n2 << (6207 & 16397);
                n2 ^= n2 >>> (-13743 & 4127);
                n2 ^= n2 << (17685 & 2639);
                continue;
            }
            if (this.Field_21523 == 0 && this.Field_21522 == arrclass_17171 && Field_21516.compareAndSwapInt(this, Field_21513, -11775 & 284, 16387 & -24519)) {
                int n7 = 5120 & -32672;
                try {
                    if (this.Field_21522 == arrclass_17171) {
                        Class_17171[] arrclass_171714 = new Class_17171[16402 & -28338];
                        arrclass_171714[n2 & (4809 & -30683)] = new Class_17171(l);
                        this.Field_21522 = arrclass_171714;
                        n7 = 837 & -32623;
                    }
                }
                catch (Throwable throwable) {
                    this.Field_21523 = -6080 & 406;
                    throw throwable;
                }
                this.Field_21523 = 21120 & 9288;
                if (n7 == 0) continue;
                break;
            }
            l2 = this.Field_21509;
            if (Field_21516.compareAndSwapLong(this, Field_21501, l2, l2 + l)) break;
        } while (true);
        class_43471.Field_43472 = n2;
    }

    private static String Method_21541(String string) {
        int n = 28537;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21500.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Object Method_21542(Object object, Object object2) {
        if (object == null || object2 == null) {
            throw new NullPointerException();
        }
        return this.Method_21564(object, object2, null);
    }

    public long Method_21543() {
        long l = this.Method_21570();
        return l < (-1172111102661786496L & 1172111101246046976L) ? 2528245112577534080L & -2528245112773769976L : l;
    }

    public Set Method_21544() {
        Class_33227 class_33227 = this.Field_21510;
        return class_33227 != null ? class_33227 : (this.Field_21510 = new Class_33227(this));
    }

    public int Method_21545() {
        long l = this.Method_21570();
        return l < (-1875208793894122822L & 1875208791985750021L) ? 8200 & -31647 : (l > (115331927870799871L & -115331925723316225L) ? -1 & Integer.MAX_VALUE : (int)l);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final Class_26851[] Method_21546() {
        Class_26851[] arrclass_26851;
        while ((arrclass_26851 = this.Field_21506) == null || arrclass_26851.length == 0) {
            int n = this.Field_21518;
            if (n < 0) {
                Thread.yield();
                continue;
            }
            if (!Field_21516.compareAndSwapInt(this, Field_21503, n, -1 & -1)) continue;
            try {
                arrclass_26851 = this.Field_21506;
                if (arrclass_26851 != null && arrclass_26851.length != 0) break;
                int n2 = n > 0 ? n : 8531 & -14828;
                Class_26851[] arrclass_268512 = new Class_26851[n2];
                arrclass_26851 = arrclass_268512;
                this.Field_21506 = arrclass_26851;
                n = n2 - (n2 >>> (-27646 & 2379));
                break;
            }
            finally {
                this.Field_21518 = n;
            }
        }
        return arrclass_26851;
    }

    private static String Method_21547(String string) {
        int n = 6251;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21500.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static Unsafe Method_21548() {
        return Class_21500.Method_21550();
    }

    private static String Method_21549(String string) {
        int n = 4751;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21500.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static Unsafe Method_21550() {
        try {
            return Unsafe.getUnsafe();
        }
        catch (SecurityException securityException) {
            try {
                return (Unsafe)AccessController.doPrivileged(new Class_6266());
            }
            catch (PrivilegedActionException privilegedActionException) {
                throw new RuntimeException("Could not initialize intrinsics", privilegedActionException.getCause());
            }
        }
    }

    public Set Method_21551() {
        return this.Method_21574();
    }

    static final void Method_21552(Class_26851[] arrclass_26851, int n, Class_26851 class_26851) {
        Field_21516.putObjectVolatile(arrclass_26851, ((long)n << Field_21504) + Field_21515, class_26851);
    }

    private static String Method_21553(String string) {
        int n = 19791;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21500.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private final void Method_21554(long l, int n) {
        long l2;
        Class_26851[] arrclass_26851;
        Class_26851[] arrclass_268512;
        long l3;
        Class_17171[] arrclass_17171 = this.Field_21522;
        if (arrclass_17171 != null || !Field_21516.compareAndSwapLong(this, Field_21501, l2 = this.Field_21509, l3 = l2 + l)) {
            long l4;
            int n2;
            boolean bl = 101 & 2065;
            Class_32728 class_32728 = Class_32728.Method_32743();
            arrclass_26851 = class_32728.Method_32738();
            if (arrclass_26851 == null || arrclass_17171 == null || (n2 = arrclass_17171.length - (18475 & 4673)) < 0 || (arrclass_268512 = arrclass_17171[n2 & arrclass_26851.Field_43472]) == null || !(bl = Field_21516.compareAndSwapLong(arrclass_268512, Field_21521, l4 = arrclass_268512.Field_17172, l4 + l))) {
                this.Method_21540(class_32728, l, (Class_43471)arrclass_26851, bl);
                return;
            }
            if (n <= (2241 & 1537)) {
                return;
            }
            l3 = this.Method_21570();
        }
        if (n >= 0) {
            int n3;
            while (l3 >= (long)(n3 = this.Field_21518) && (arrclass_26851 = this.Field_21506) != null && arrclass_26851.length < (-760930304 & 1750075717)) {
                if (n3 < 0) {
                    if (n3 == (-1 & -1) || this.Field_21507 <= this.Field_21502 || (arrclass_268512 = this.Field_21505) == null) break;
                    if (Field_21516.compareAndSwapInt(this, Field_21503, n3, n3 - (27649 & 4483))) {
                        this.Method_21534(arrclass_26851, arrclass_268512);
                    }
                } else if (Field_21516.compareAndSwapInt(this, Field_21503, n3, -2 & -1)) {
                    this.Method_21534(arrclass_26851, null);
                }
                l3 = this.Method_21570();
            }
        }
    }

    private static String Method_21555(String string) {
        int n = 5300;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_21500.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_21556(Object object) {
        if (object == null) {
            throw new NullPointerException();
        }
        Class_26851[] arrclass_26851 = this.Field_21506;
        if (arrclass_26851 != null) {
            Class_26851 class_26851;
            Class_24767 class_24767 = new Class_24767(arrclass_26851, arrclass_26851.length, 4162 & 17440, arrclass_26851.length);
            while ((class_26851 = class_24767.Method_24775()) != null) {
                Object object2 = class_26851.Field_26853;
                if (object2 != object && (object2 == null || !object.equals(object2))) continue;
                return (16843 & 10753) != 0;
            }
        }
        return (-32512 & 31873) != 0;
    }

    public Object Method_21557(Object object, Object object2) {
        Object object3 = this.Method_21559(object);
        return object3 == null ? object2 : object3;
    }

    public boolean Method_21558(Object object) {
        if (object != this) {
            Object object2;
            Object object3;
            if (!(object instanceof Map)) {
                return (-29032 & 16679) != 0;
            }
            Map map = (Map)object;
            Class_26851[] arrclass_26851 = this.Field_21506;
            int n = arrclass_26851 == null ? -26552 & 132 : arrclass_26851.length;
            Class_24767 class_24767 = new Class_24767(arrclass_26851, n, 3076 & 16393, n);
            while ((object2 = class_24767.Method_24775()) != null) {
                Object object4 = ((Class_26851)object2).Field_26853;
                object3 = map.get(((Class_26851)object2).Field_26855);
                if (object3 != null && (object3 == object4 || object3.equals(object4))) continue;
                return (64 & 5921) != 0;
            }
            for (Map.Entry entry : map.entrySet()) {
                Object object4;
                Object v;
                object3 = entry.getKey();
                if (object3 != null && (v = entry.getValue()) != null && (object4 = this.Method_21559(object3)) != null && (v == object4 || v.equals(object4))) continue;
                return (8240 & 5196) != 0;
            }
        }
        return (8545 & 2061) != 0;
    }

    static {
        Field_21511 = Runtime.getRuntime().availableProcessors();
        ObjectStreamField[] arrobjectStreamField = new ObjectStreamField[1155 & 2395];
        arrobjectStreamField[2 & 9329] = new ObjectStreamField(Class_21500.Method_21525("\u340a\u3408\u340a\u3400\u3408\u3402\u3408\u340a"), Class_16986[].class);
        arrobjectStreamField[49 & -21885] = new ObjectStreamField(Class_21500.Method_21533("\u1800\u1811\u1810\u1811\u1814\u1815\u1804\u1835\u1810\u1801\u1810"), Integer.TYPE);
        arrobjectStreamField[3210 & 16658] = new ObjectStreamField(Class_21500.Method_21529("\u11c8\u11c8\u11ca\u11c2\u11cc\u11c5\u11cf\u11ee\u11c1\u11c0\u11cb\u11cb"), Integer.TYPE);
        Field_21512 = arrobjectStreamField;
        Field_21508 = new AtomicInteger();
        try {
            Field_21516 = Class_21500.Method_21550();
            Class<Class_21500> class_ = Class_21500.class;
            Field_21503 = Field_21516.objectFieldOffset(class_.getDeclaredField(Class_21500.Method_21553("\u1665\u1674\u1664\u1670\u1655\u1661\u1670")));
            Field_21519 = Field_21516.objectFieldOffset(class_.getDeclaredField(Class_21500.Method_21547("\u8438\u843a\u842a\u8420\u843e\u842e\u842e\u843c\u8400\u8422\u842a\u842a\u8434")));
            Field_21520 = Field_21516.objectFieldOffset(class_.getDeclaredField(Class_21500.Method_21549("\u824c\u8249\u8248\u8245\u8248\u824d\u824c\u8249\u824c\u8241\u8248\u8245\u8248\u824d")));
            Field_21501 = Field_21516.objectFieldOffset(class_.getDeclaredField(Class_21500.Method_21531("\u806c\u806c\u807d\u8068\u804d\u8060\u8079\u8061\u8070")));
            Field_21513 = Field_21516.objectFieldOffset(class_.getDeclaredField(Class_21500.Method_21555("\u4168\u416c\u4167\u4167\u417c\u414d\u417a\u417e\u4178")));
            Class<Class_17171> class_2 = Class_17171.class;
            Field_21521 = Field_21516.objectFieldOffset(class_2.getDeclaredField(Class_21500.Method_21541("\u3492\u3481\u3480\u3491\u3480")));
            Class<Class_26851[]> class_3 = Class_26851[].class;
            Field_21515 = Field_21516.arrayBaseOffset(class_3);
            int n = Field_21516.arrayIndexScale(class_3);
            if ((n & n - (577 & 16385)) != 0) {
                throw new Error(Class_21500.Method_21530("\u4008\u4009\u401a\u400b\u400c\u401d\u4016\u401f\u4000\u4001\u4010\u4001\u4004\u400d\u4006\u4007\u4012\u4013\u400a\u401b\u401c\u401d\u400e\u4015\u4002\u4011\u4000\u4013\u401e\u4017\u4016\u4007\u403a\u4023"));
            }
            Field_21504 = (11615 & -32737) - Integer.numberOfLeadingZeros(n);
        }
        catch (Exception exception) {
            throw new Error(exception);
        }
    }

    public Object Method_21559(Object object) {
        Class_26851 class_26851;
        int n;
        int n2 = Class_21500.Method_21535(object.hashCode());
        Class_26851[] arrclass_26851 = this.Field_21506;
        if (arrclass_26851 != null && (n = arrclass_26851.length) > 0 && (class_26851 = Class_21500.Method_21573(arrclass_26851, n - (49 & -25973) & n2)) != null) {
            Object object2;
            int n3 = class_26851.Field_26852;
            if (n3 == n2) {
                object2 = class_26851.Field_26855;
                if (object2 == object || object2 != null && object.equals(object2)) {
                    return class_26851.Field_26853;
                }
            } else if (n3 < 0) {
                Class_26851 class_268512 = class_26851.Method_26860(n2, object);
                return class_268512 != null ? class_268512.Field_26853 : null;
            }
            while ((class_26851 = class_26851.Field_26854) != null) {
                if (class_26851.Field_26852 != n2 || (object2 = class_26851.Field_26855) != object && (object2 == null || !object.equals(object2))) continue;
                return class_26851.Field_26853;
            }
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void Method_21560(int n) {
        int n2;
        int n3;
        int n4 = n3 = n >= (-520093012 & 941623296) ? 1074135297 & 1176511560 : Class_21500.Method_21563(n + (n >>> (17481 & 12805)) + (141 & -15359));
        while ((n2 = this.Field_21518) >= 0) {
            int n5;
            Class_26851[] arrclass_26851 = this.Field_21506;
            if (arrclass_26851 == null || (n5 = arrclass_26851.length) == 0) {
                int n6 = n5 = n2 > n3 ? n2 : n3;
                if (!Field_21516.compareAndSwapInt(this, Field_21503, n2, -1 & -1)) continue;
                try {
                    if (this.Field_21506 != arrclass_26851) continue;
                    Class_26851[] arrclass_268512 = new Class_26851[n5];
                    this.Field_21506 = arrclass_268512;
                    n2 = n5 - (n5 >>> (19591 & 12290));
                    continue;
                }
                finally {
                    this.Field_21518 = n2;
                    continue;
                }
            }
            if (n3 <= n2 || n5 >= (1211244626 & 1611176992)) break;
            if (arrclass_26851 != this.Field_21506 || !Field_21516.compareAndSwapInt(this, Field_21503, n2, -2 & -2)) continue;
            this.Method_21534(arrclass_26851, null);
        }
    }

    static Class_26851 Method_21561(Class_26851 class_26851) {
        Class_26851 class_268512 = null;
        Class_26851 class_268513 = null;
        Class_26851 class_268514 = class_26851;
        while (class_268514 != null) {
            Class_26851 class_268515 = new Class_26851(class_268514.Field_26852, class_268514.Field_26855, class_268514.Field_26853, null);
            if (class_268513 == null) {
                class_268512 = class_268515;
            } else {
                class_268513.Field_26854 = class_268515;
            }
            class_268513 = class_268515;
            class_268514 = class_268514.Field_26854;
        }
        return class_268512;
    }

    public int Method_21562() {
        int n = 912 & -8192;
        Class_26851[] arrclass_26851 = this.Field_21506;
        if (arrclass_26851 != null) {
            Class_26851 class_26851;
            Class_24767 class_24767 = new Class_24767(arrclass_26851, arrclass_26851.length, 17035 & -30364, arrclass_26851.length);
            while ((class_26851 = class_24767.Method_24775()) != null) {
                n += class_26851.Field_26855.hashCode() ^ class_26851.Field_26853.hashCode();
            }
        }
        return n;
    }

    private static final int Method_21563(int n) {
        int n2 = n - (13 & 9235);
        n2 |= n2 >>> (1 & -15801);
        n2 |= n2 >>> (-31742 & 8283);
        n2 |= n2 >>> (16460 & -30073);
        n2 |= n2 >>> (14122 & 140);
        return (n2 |= n2 >>> (16917 & -19408)) < 0 ? 8967 & -16383 : (n2 >= (1619108132 & 1494878864) ? 1375735813 & -938991600 : n2 + (-32507 & 569));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    final Object Method_21564(Object object, Object object2, Object object3) {
        int n;
        int n2;
        Class_26851 class_26851;
        int n3 = Class_21500.Method_21535(object.hashCode());
        Class_26851[] arrclass_26851 = this.Field_21506;
        while (arrclass_26851 != null && (n = arrclass_26851.length) != 0 && (class_26851 = Class_21500.Method_21573(arrclass_26851, n2 = n - (22541 & 33) & n3)) != null) {
            int n4 = class_26851.Field_26852;
            if (n4 == (-1 & -1)) {
                arrclass_26851 = this.Method_21537(arrclass_26851, class_26851);
                continue;
            }
            Object object4 = null;
            int n5 = 16896 & 3082;
            Class_26851 class_268512 = class_26851;
            synchronized (class_268512) {
                if (Class_21500.Method_21573(arrclass_26851, n2) == class_26851) {
                    Object object5;
                    Class_26851 class_268513;
                    Class_26851 class_268514;
                    Object object6;
                    if (n4 >= 0) {
                        n5 = 4611 & 277;
                        class_268513 = class_26851;
                        class_268514 = null;
                        do {
                            if (class_268513.Field_26852 == n3 && ((object6 = class_268513.Field_26855) == object || object6 != null && object.equals(object6))) {
                                object5 = class_268513.Field_26853;
                                if (object3 == null || object3 == object5 || object5 != null && object3.equals(object5)) {
                                    object4 = object5;
                                    if (object2 != null) {
                                        class_268513.Field_26853 = object2;
                                    } else if (class_268514 != null) {
                                        class_268514.Field_26854 = class_268513.Field_26854;
                                    } else {
                                        Class_21500.Method_21552(arrclass_26851, n2, class_268513.Field_26854);
                                    }
                                }
                                break;
                            }
                            class_268514 = class_268513;
                        } while ((class_268513 = class_268513.Field_26854) != null);
                    } else if (class_26851 instanceof Class_29689) {
                        n5 = 3139 & -28403;
                        class_268513 = (Class_29689)class_26851;
                        class_268514 = ((Class_29689)class_268513).Field_29692;
                        if (class_268514 != null && (object6 = ((Class_37570)class_268514).Method_37578(n3, object, null)) != null) {
                            object5 = ((Class_37570)object6).val;
                            if (object3 == null || object3 == object5 || object5 != null && object3.equals(object5)) {
                                object4 = object5;
                                if (object2 != null) {
                                    ((Class_37570)object6).val = object2;
                                } else if (((Class_29689)class_268513).Method_29706((Class_37570)object6)) {
                                    Class_21500.Method_21552(arrclass_26851, n2, Class_21500.Method_21561(((Class_29689)class_268513).Field_29691));
                                }
                            }
                        }
                    }
                }
            }
            if (n5 == 0) continue;
            if (object4 == null) break;
            if (object2 == null) {
                this.Method_21554(-1L & -1L, -1 & -1);
            }
            return object4;
        }
        return null;
    }

    public Object Method_21565(Object object) {
        return this.Method_21564(object, null, null);
    }

    public boolean Method_21566(Object object) {
        return (this.Method_21559(object) != null ? -32483 & 4673 : 26766 & 800) != 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_21567() {
        long l = 1108417614L & 8883295408273523200L;
        int n = 8192 & 127;
        Class_26851[] arrclass_26851 = this.Field_21506;
        while (arrclass_26851 != null && n < arrclass_26851.length) {
            Class_26851 class_26851 = Class_21500.Method_21573(arrclass_26851, n);
            if (class_26851 == null) {
                ++n;
                continue;
            }
            int n2 = class_26851.Field_26852;
            if (n2 == (-1 & -1)) {
                arrclass_26851 = this.Method_21537(arrclass_26851, class_26851);
                n = 21126 & -24503;
                continue;
            }
            Class_26851 class_268512 = class_26851;
            synchronized (class_268512) {
                if (Class_21500.Method_21573(arrclass_26851, n) == class_26851) {
                    Class_26851 class_268513;
                    Class_26851 class_268514 = n2 >= 0 ? class_26851 : (class_268513 = class_26851 instanceof Class_29689 ? ((Class_29689)class_26851).Field_29691 : null);
                    while (class_268513 != null) {
                        l -= 1348998209L & 135283209L;
                        class_268513 = class_268513.Field_26854;
                    }
                    Class_21500.Method_21552(arrclass_26851, n++, null);
                }
            }
        }
        if (l != (5752132292306804764L & -5752132293311234045L)) {
            this.Method_21554(l, -1 & -1);
        }
    }

    public boolean Method_21568() {
        return (this.Method_21570() <= (8500878250502392406L & -8500878250763783936L) ? 5641 & -16383 : 9344 & 18439) != 0;
    }

    public Object Method_21569(Object object, Object object2) {
        return this.Method_21524(object, object2, (8265 & 18949) != 0);
    }

    final long Method_21570() {
        Class_17171[] arrclass_17171 = this.Field_21522;
        long l = this.Field_21509;
        if (arrclass_17171 != null) {
            for (int i = 8706 & 256; i < arrclass_17171.length; ++i) {
                Class_17171 class_17171 = arrclass_17171[i];
                if (class_17171 == null) continue;
                l += class_17171.Field_17172;
            }
        }
        return l;
    }

    public String Method_21571() {
        Class_26851[] arrclass_26851 = this.Field_21506;
        int n = arrclass_26851 == null ? 8966 & 5200 : arrclass_26851.length;
        Class_24767 class_24767 = new Class_24767(arrclass_26851, n, 28757 & -32726, n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((char)(16763 & -21249));
        Class_26851 class_26851 = class_24767.Method_24775();
        if (class_26851 != null) {
            do {
                Object object = class_26851.Field_26855;
                Object object2 = class_26851.Field_26853;
                stringBuilder.append(object == this ? "(this Map)" : object);
                stringBuilder.append((char)(6205 & 63));
                stringBuilder.append(object2 == this ? "(this Map)" : object2);
                class_26851 = class_24767.Method_24775();
                if (class_26851 == null) break;
                stringBuilder.append((char)(172 & -28612)).append((char)(486 & -19415));
            } while (true);
        }
        return stringBuilder.append((char)(5757 & 18813)).toString();
    }

    static Class Method_21572(Object object) {
        if (object instanceof Comparable) {
            Class<?> class_ = object.getClass();
            if (class_ == String.class) {
                return class_;
            }
            Type[] arrtype = class_.getGenericInterfaces();
            if (arrtype != null) {
                for (int i = 10 & 15364; i < arrtype.length; ++i) {
                    ParameterizedType parameterizedType;
                    Type[] arrtype2;
                    Type type = arrtype[i];
                    if (!(type instanceof ParameterizedType) || (parameterizedType = (ParameterizedType)type).getRawType() != Comparable.class || (arrtype2 = parameterizedType.getActualTypeArguments()) == null || arrtype2.length != (-7499 & 257) || arrtype2[16960 & 4105] != class_) continue;
                    return class_;
                }
            }
        }
        return null;
    }

    static final Class_26851 Method_21573(Class_26851[] arrclass_26851, int n) {
        return (Class_26851)Field_21516.getObjectVolatile(arrclass_26851, ((long)n << Field_21504) + Field_21515);
    }

    public Class_25890 Method_21574() {
        Class_25890 class_25890 = this.Field_21517;
        return class_25890 != null ? class_25890 : (this.Field_21517 = new Class_25890(this, null));
    }

    public Object Method_21575(Object object, Object object2) {
        return this.Method_21524(object, object2, (12364 & -15840) != 0);
    }

    public boolean Method_21576(Object object, Object object2, Object object3) {
        if (object == null || object2 == null || object3 == null) {
            throw new NullPointerException();
        }
        return (this.Method_21564(object, object3, object2) != null ? -27383 & 129 : -32736 & 287) != 0;
    }
}

