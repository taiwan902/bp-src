/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_30483
extends Class_4291 {
    private static final String[] Field_30484;
    private static final Logger Field_30485;
    private static final List Field_30486;

    private void Method_30487() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_30488(String string) {
        int n = 11876;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30483.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_30489(String string) {
        int n = 16186;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30483.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_30490(String string) {
        int n = 19514;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30483.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_30485 = LogManager.getLogger();
        String[] arrstring = new String[-16137 & 4];
        arrstring[1216 & 16644] = Class_30483.Method_30488("\u2018\u2020\u2028\u2020\u202e\u203e\u2026\u2026");
        arrstring[19 & 1061] = Class_30483.Method_30490("\u20a0\u2081\u2082\u2083\u2084\u2085");
        arrstring[-32754 & 130] = Class_30483.Method_30493("\u8241\u8241\u8242\u8242\u8244\u8245");
        arrstring[179 & 8715] = Class_30483.Method_30489("\u850a\u8509\u8500\u8509\u850c\u850f");
        Field_30484 = arrstring;
        Object[] arrobject = new Class_36948[10255 & 18159];
        arrobject[17156 & 9233] = new Class_36948(Class_10527.Field_10594, 25 & -32640, 4257 & 24579, 17 & 16581, -32182 & 30);
        arrobject[4097 & 2677] = new Class_36948(Class_10527.Field_10565, 105 & 17408, 16465 & -24535, 20 & 2126, 25054 & -31222);
        arrobject[24838 & 3139] = new Class_36948(Class_10527.Field_10630, 384 & 6146, 16785 & 555, -32685 & 25129, 810 & -27558);
        arrobject[16451 & -29681] = new Class_36948(Class_10527.Field_10621, 8192 & -31805, -32767 & 8711, -24060 & 1030, 266 & 523);
        arrobject[172 & 5446] = new Class_36948(Class_10527.Field_10579, 8321 & 24324, 77 & 20609, 6532 & 524, 8202 & 23818);
        arrobject[17477 & -28379] = new Class_36948(Class_10527.Field_10624, -26040 & 8453, -32247 & 2307, 16420 & 1430, 4206 & -29814);
        arrobject[2054 & -12161] = new Class_36948(Class_10527.Field_10639, 8836 & -31664, 7047 & 1, -16249 & 9, 17291 & 58);
        arrobject[17551 & -30393] = new Class_36948(Class_10527.Field_10669, 0 & -11456, -29631 & 21, -23477 & 16513, 385 & 6171);
        arrobject[6664 & 444] = new Class_36948(Class_10527.Field_10564, -31220 & 18451, 8209 & -14711, -4948 & 4, 16394 & 8714);
        arrobject[-28243 & 2587] = new Class_36948(Class_10527.Field_10650, 20576 & 130, -32431 & 19461, 19593 & 8519, -32652 & 2062);
        arrobject[28842 & 2318] = new Class_36948(Class_10527.Field_10700, 16560 & -32512, 17923 & 8497, -20397 & 1157, -29692 & 116);
        arrobject[2059 & 9327] = new Class_36948(Class_10527.Field_10668, 4368 & 3748, 4641 & 1027, 11913 & 257, 90 & 142);
        arrobject[6221 & 16956] = new Class_36948(Class_10527.Field_10647, 16384 & -29820, 2149 & 513, -23295 & 2785, 3110 & 8603);
        arrobject[20623 & 2109] = new Class_36948(Class_10527.Field_10562, 64 & 1544, 743 & -5119, 35 & -30315, 9895 & 21);
        arrobject[5230 & 10910] = new Class_36948(Class_10527.Field_10542, 20570 & 388, 8241 & 16907, 8449 & 19471, 1603 & -24315);
        Field_30486 = Lists.newArrayList((Object[])arrobject);
    }

    public boolean Method_30491(Class_283 class_283, Random random, Class_4751 class_4751) {
        int n;
        int n2;
        Object object;
        int n3;
        Object object2;
        Object object3;
        int n4 = 9931 & 3;
        int n5 = random.nextInt(2771 & 13578) + (22674 & -32445);
        int n6 = -n5 - (16417 & 3977);
        int n7 = n5 + (12453 & -32191);
        int n8 = -1 & -1;
        int n9 = 1159 & 4116;
        int n10 = random.nextInt(24738 & -31485) + (3 & -32422);
        int n11 = -n10 - (20633 & -24253);
        int n12 = n10 + (9233 & 4259);
        int n13 = 8228 & 3520;
        for (n = n6; n <= n7; ++n) {
            for (n3 = -1 & -1; n3 <= (16390 & 7236); ++n3) {
                for (n2 = n11; n2 <= n12; ++n2) {
                    object = class_4751.Method_4791(n, n3, n2);
                    object2 = class_283.Method_375((Class_4751)object).Method_3442().Method_3373();
                    object3 = object2.Method_3762();
                    if (n3 == (-1 & -1) && object3 == false) {
                        return (18472 & -23994) != 0;
                    }
                    if (n3 == (16452 & -30443) && object3 == false) {
                        return (17028 & 32) != 0;
                    }
                    if (n != n6 && n != n7 && n2 != n11 && n2 != n12 || n3 != 0 || !class_283.Method_507((Class_4751)object) || !class_283.Method_507(object.Method_4769())) continue;
                    ++n13;
                }
            }
        }
        if (n13 >= (-4093 & 25) && n13 <= (-23211 & 2567)) {
            for (n = n6; n <= n7; ++n) {
                for (n3 = 9747 & -28569; n3 >= (-1 & -1); --n3) {
                    for (n2 = n11; n2 <= n12; ++n2) {
                        object = class_4751.Method_4791(n, n3, n2);
                        if (n != n6 && n3 != (-1 & -1) && n2 != n11 && n != n7 && n3 != (4581 & 11782) && n2 != n12) {
                            if (class_283.Method_375((Class_4751)object).Method_3442() == Class_9265.Field_9420) continue;
                            class_283.Method_472((Class_4751)object);
                            continue;
                        }
                        if (object.\u0000, `() >= 0 && !class_283.Method_375(object.Method_4782()).Method_3442().Method_3373().Method_3762()) {
                            class_283.Method_472((Class_4751)object);
                            continue;
                        }
                        if (!class_283.Method_375((Class_4751)object).Method_3442().Method_3373().Method_3762() || class_283.Method_375((Class_4751)object).Method_3442() == Class_9265.Field_9420) continue;
                        if (n3 == (-1 & -1) && random.nextInt(7244 & 150) != 0) {
                            class_283.Method_462((Class_4751)object, Class_9265.Field_9410.Method_3293(), -21950 & 39);
                            continue;
                        }
                        class_283.Method_462((Class_4751)object, Class_9265.Field_9373.Method_3293(), 2570 & 12578);
                    }
                }
            }
            block6 : for (n = 16944 & 2055; n < (7458 & -16190); ++n) {
                for (n3 = -29102 & 8; n3 < (16395 & 4419); ++n3) {
                    Object object4;
                    n2 = class_4751.\u0000= final() + random.nextInt(n5 * (119 & -15358) + (1353 & -28667)) - n5;
                    object3 = new Class_4751(n2, (int)(object = (Object)class_4751.\u0000, `()), (int)(object2 = (Object)(class_4751.\u0000strictfp() + random.nextInt(n10 * (13395 & 2) + (-27433 & 8737)) - n10)));
                    if (!class_283.Method_507((Class_4751)object3)) continue;
                    int n14 = 17408 & -32512;
                    Object object5 = Class_4662.Field_4663.Method_4672();
                    while (object5.hasNext()) {
                        object4 = object5.next();
                        Class_4595 class_4595 = (Class_4595)object4;
                        if (!class_283.Method_375(((Class_4751)object3).Method_4765(class_4595)).Method_3442().Method_3373().Method_3762()) continue;
                        ++n14;
                    }
                    if (n14 != (-27383 & 2679)) continue;
                    class_283.Method_462((Class_4751)object3, Class_9265.Field_9420.Method_4147(class_283, (Class_4751)object3, Class_9265.Field_9420.\u0000strictfp()), 18434 & -31817);
                    Class_36948[] arrclass_36948 = new Class_36948[22597 & 9217];
                    arrclass_36948[-28544 & 2593] = Class_10527.Field_10625.Method_21687(random);
                    object5 = Class_36948.Method_36955(Field_30486, arrclass_36948);
                    object4 = class_283.Method_429((Class_4751)object3);
                    if (!(object4 instanceof Class_36146)) continue block6;
                    Class_36948.Method_36952(random, (List)object5, (Class_36146)object4, 8792 & 3368);
                    continue block6;
                }
            }
            class_283.Method_462(class_4751, Class_9265.Field_9279.Method_3293(), 1674 & 16486);
            Class_4879 class_4879 = class_283.Method_429(class_4751);
            if (class_4879 instanceof Class_36325) {
                ((Class_36325)class_4879).Method_36333().Method_20894(this.Method_30492(random));
            } else {
                Field_30485.error("Failed to fetch mob spawner entity at (" + class_4751.\u0000= final() + ", " + class_4751.\u0000, `() + ", " + class_4751.\u0000strictfp() + ")");
            }
            return (-32759 & 753) != 0;
        }
        return (4673 & 300) != 0;
    }

    private String Method_30492(Random random) {
        return Field_30484[random.nextInt(Field_30484.length)];
    }

    private static String Method_30493(String string) {
        int n = 9820;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30483.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

