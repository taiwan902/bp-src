/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_24204 {
    private static boolean Field_24205;
    private static boolean Field_24206;
    private static boolean Field_24207;
    private static Class_31211 Field_24208;
    private static Class_11372 Field_24209;
    private static boolean Field_24210;
    private static Class_31211 Field_24211;
    private static boolean Field_24212;
    private static Class_31211 Field_24213;
    private static Class_11372 Field_24214;
    private static Class_31211 Field_24215;
    private static boolean Field_24216;
    private static Class_11372 Field_24217;
    private static boolean Field_24218;
    private static boolean Field_24219;
    private static Class_11372 Field_24220;
    private static boolean Field_24221;
    private static Class_11372 Field_24222;

    public static List Method_24223(Class_561 class_561, Class_3436 class_3436, Class_4751 class_4751, Class_4595 class_4595, List list) {
        if (class_4595 != Class_4595.Field_4601 && class_4595 != Class_4595.Field_4615) {
            if (!Field_24205) {
                return list;
            }
            Class_3238 class_3238 = class_3436.Method_3442();
            return class_3238 instanceof Class_34441 ? Class_24204.Method_24226(class_561, class_3436, class_4751, class_4595, list) : (class_3238 instanceof Class_4180 ? Class_24204.Method_24230(class_561, class_3436, class_4751, class_4595, list) : (class_3238 instanceof Class_4157 ? Class_24204.Method_24227(class_561, class_3436, class_4751, class_4595, list) : list));
        }
        return list;
    }

    private void Method_24224() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void Method_24225() {
        if (Field_24216) {
            Field_24213 = Class_7447.Method_7449(Field_24209, 1025 & 20512);
            if (Field_24206) {
                Class_31211 class_31211 = Class_7447.Method_7449(Field_24214, -1 & -1);
                Field_24213 = Class_7447.Method_7450(class_31211, Field_24213);
            }
            Field_24208 = Class_7447.Method_7449(Field_24222, -1 & -1);
            Field_24211 = Class_7447.Method_7449(Field_24220, 1028 & -30384);
            Field_24215 = Class_7447.Method_7449(Field_24217, -1 & -1);
            Field_24205 = 1025 & -8189;
        }
    }

    private static List Method_24226(Class_561 class_561, Class_3436 class_3436, Class_4751 class_4751, Class_4595 class_4595, List list) {
        int n;
        Class_3238 class_3238 = class_561.Method_568(class_4751.Method_4769()).Method_3442();
        int n2 = n = class_3238 == Class_9265.Field_9413 || class_3238 == Class_9265.Field_9458 ? 3437 & -32111 : -27510 & 8800;
        if (Class_19426.Method_19587()) {
            if (n != 0) {
                if (Field_24218 && Class_24204.Method_24229(class_4751, class_4595, class_561) == Class_9265.Field_9458) {
                    return Class_24204.Method_24228(Field_24215, class_4595);
                }
            } else if (Field_24207 && Class_24204.Method_24229(class_4751.Method_4782(), class_4595, class_561) == Class_9265.Field_9436) {
                return Class_24204.Method_24228(Field_24208, class_4595);
            }
        } else if (n != 0) {
            if (Field_24218) {
                return Class_24204.Method_24228(Field_24215, class_4595);
            }
        } else if (Field_24207) {
            return Class_24204.Method_24228(Field_24208, class_4595);
        }
        return list;
    }

    private static List Method_24227(Class_561 class_561, Class_3436 class_3436, Class_4751 class_4751, Class_4595 class_4595, List list) {
        int n;
        Class_3238 class_3238 = class_561.Method_568(class_4751.Method_4769()).Method_3442();
        int n2 = n = class_3238 == Class_9265.Field_9413 || class_3238 == Class_9265.Field_9458 ? 2585 & -15355 : 66 & -12287;
        if (Class_19426.Method_19587()) {
            if (n != 0) {
                if (Field_24210 && Class_24204.Method_24229(class_4751, class_4595, class_561) == Class_9265.Field_9458) {
                    return Class_24204.Method_24228(Field_24215, class_4595);
                }
            } else if (Field_24221 && Class_24204.Method_24229(class_4751.Method_4782(), class_4595, class_561) == Class_9265.Field_9319) {
                return Class_24204.Method_24228(Field_24213, class_4595);
            }
        } else if (n != 0) {
            if (Field_24210) {
                return Class_24204.Method_24228(Field_24215, class_4595);
            }
        } else if (Field_24221) {
            return Class_24204.Method_24228(Field_24213, class_4595);
        }
        return list;
    }

    private static List Method_24228(Class_31211 class_31211, Class_4595 class_4595) {
        return class_4595 == null ? class_31211.Method_31214() : class_31211.Method_31218(class_4595);
    }

    static {
        Field_24221 = 28801 & -32163;
        Field_24207 = -32101 & 13637;
        Field_24219 = -28015 & 2113;
        Field_24210 = 6795 & 65;
        Field_24218 = 225 & 12559;
        Field_24212 = 16533 & -19445;
        Field_24206 = 2084 & 16897;
        Field_24209 = null;
        Field_24214 = null;
        Field_24222 = null;
        Field_24220 = null;
        Field_24217 = null;
        Field_24216 = -16382 & 4400;
        Field_24213 = null;
        Field_24208 = null;
        Field_24211 = null;
        Field_24215 = null;
        Field_24205 = 17424 & -32702;
    }

    private static Class_3238 Method_24229(Class_4751 class_4751, Class_4595 class_4595, Class_561 class_561) {
        Class_4751 class_47512 = class_4751.Method_4765(class_4595);
        Class_3238 class_3238 = class_561.Method_568(class_47512).Method_3442();
        return class_3238;
    }

    private static List Method_24230(Class_561 class_561, Class_3436 class_3436, Class_4751 class_4751, Class_4595 class_4595, List list) {
        int n;
        Class_3238 class_3238 = Class_24204.Method_24229(class_4751, Class_4595.Field_4601, class_561);
        if (class_3436.Method_3440(Class_4180.Field_4181) != Class_4194.Field_4199) {
            return list;
        }
        int n2 = n = class_3238 == Class_9265.Field_9413 || class_3238 == Class_9265.Field_9458 ? 209 & 8459 : 256 & 26656;
        if (Class_19426.Method_19587()) {
            Class_4751 class_47512;
            Class_3436 class_34362;
            if (n != 0) {
                if (Field_24212 && Class_24204.Method_24229(class_4751, class_4595, class_561) == Class_9265.Field_9458) {
                    return Class_24204.Method_24228(Field_24215, class_4595);
                }
            } else if (Field_24219 && (class_34362 = class_561.Method_568(class_47512 = class_4751.Method_4782().Method_4765(class_4595))).Method_3442() == Class_9265.Field_9272 && class_34362.Method_3440(Class_4180.Field_4181) == Class_4194.Field_4199) {
                return Class_24204.Method_24228(Field_24211, class_4595);
            }
        } else if (n != 0) {
            if (Field_24212) {
                return Class_24204.Method_24228(Field_24215, class_4595);
            }
        } else if (Field_24219) {
            return Class_24204.Method_24228(Field_24211, class_4595);
        }
        return list;
    }
}

