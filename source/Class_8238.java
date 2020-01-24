/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_8238 {
    static int Field_8239;
    private static final Class_31449[] Field_8240;
    private static List Field_8241;
    private static final Class_19385 Field_8242;
    private static Class Field_8243;

    private static Class_36381 Method_8244(Class_45837 class_45837, List list, Random random, int n, int n2, int n3, Class_4595 class_4595, int n4) {
        if (!Class_8238.Method_8252()) {
            return null;
        }
        if (Field_8243 != null) {
            Class_36381 class_36381 = Class_8238.Method_8249(Field_8243, list, random, n, n2, n3, class_4595, n4);
            Field_8243 = null;
            if (class_36381 != null) {
                return class_36381;
            }
        }
        int n5 = 20 & 18178;
        block0 : while (n5 < (17447 & -24443)) {
            ++n5;
            int n6 = random.nextInt(Field_8239);
            for (Class_31449 class_31449 : Field_8241) {
                if ((n6 -= class_31449.Field_31450) >= 0) continue;
                if (!class_31449.Method_31456(n4) || class_31449 == class_45837.Field_45838) continue block0;
                Class_36381 class_36381 = Class_8238.Method_8249(class_31449.Field_31451, list, random, n, n2, n3, class_4595, n4);
                if (class_36381 == null) continue;
                class_31449.Field_31453 += 4737 & 19733;
                class_45837.Field_45838 = class_31449;
                if (!class_31449.Method_31454()) {
                    Field_8241.remove(class_31449);
                }
                return class_36381;
            }
        }
        Class_42666 class_42666 = Class_40767.Method_40773(list, random, n, n2, n3, class_4595);
        if (class_42666 != null && class_42666.Field_42672 > (16393 & -30715)) {
            return new Class_40767(n4, random, class_42666, class_4595);
        }
        return null;
    }

    private static Class_13400 Method_8245(Class_45837 class_45837, List list, Random random, int n, int n2, int n3, Class_4595 class_4595, int n4) {
        if (n4 > (50 & 18747)) {
            return null;
        }
        if (Math.abs(n - class_45837.\u0000strictfp().Field_42668) <= (120 & 114) && Math.abs(n3 - class_45837.\u0000strictfp().Field_42669) <= (374 & -3976)) {
            Class_36381 class_36381 = Class_8238.Method_8244(class_45837, list, random, n, n2, n3, class_4595, n4 + (17045 & 9281));
            if (class_36381 != null) {
                list.add(class_36381);
                class_45837.Field_45840.add(class_36381);
            }
            return class_36381;
        }
        return null;
    }

    public static void Method_8246() {
        Class_34391.Method_34406(Class_46166.class, "SHCC");
        Class_34391.Method_34406(Class_40767.class, "SHFC");
        Class_34391.Method_34406(Class_45558.class, "SH5C");
        Class_34391.Method_34406(Class_41314.class, "SHLT");
        Class_34391.Method_34406(Class_41551.class, "SHLi");
        Class_34391.Method_34406(Class_39140.class, "SHPR");
        Class_34391.Method_34406(Class_42585.class, "SHPH");
        Class_34391.Method_34406(Class_47626.class, "SHRT");
        Class_34391.Method_34406(Class_38804.class, "SHRC");
        Class_34391.Method_34406(Class_41462.class, "SHSD");
        Class_34391.Method_34406(Class_45837.class, "SHStart");
        Class_34391.Method_34406(Class_45176.class, "SHS");
        Class_34391.Method_34406(Class_36567.class, "SHSSD");
    }

    static Class Method_8247(Class class_) {
        Field_8243 = class_;
        return Field_8243;
    }

    private void Method_8248() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static Class_36381 Method_8249(Class class_, List list, Random random, int n, int n2, int n3, Class_4595 class_4595, int n4) {
        Class_36381 class_36381 = null;
        if (class_ == Class_45176.class) {
            class_36381 = Class_45176.Method_45184(list, random, n, n2, n3, class_4595, n4);
        } else if (class_ == Class_42585.class) {
            class_36381 = Class_42585.Method_42586(list, random, n, n2, n3, class_4595, n4);
        } else if (class_ == Class_41314.class) {
            class_36381 = Class_41314.Method_41318(list, random, n, n2, n3, class_4595, n4);
        } else if (class_ == Class_47626.class) {
            class_36381 = Class_47626.\u0000strictfp((List)list, (Random)random, (int)n, (int)n2, (int)n3, (Class_4595)class_4595, (int)n4);
        } else if (class_ == Class_38804.class) {
            class_36381 = Class_38804.Method_38808(list, random, n, n2, n3, class_4595, n4);
        } else if (class_ == Class_36567.class) {
            class_36381 = Class_36567.Method_36569(list, random, n, n2, n3, class_4595, n4);
        } else if (class_ == Class_41462.class) {
            class_36381 = Class_41462.Method_41469(list, random, n, n2, n3, class_4595, n4);
        } else if (class_ == Class_45558.class) {
            class_36381 = Class_45558.Method_45564(list, random, n, n2, n3, class_4595, n4);
        } else if (class_ == Class_46166.class) {
            class_36381 = Class_46166.Method_46171(list, random, n, n2, n3, class_4595, n4);
        } else if (class_ == Class_41551.class) {
            class_36381 = Class_41551.Method_41554(list, random, n, n2, n3, class_4595, n4);
        } else if (class_ == Class_39140.class) {
            class_36381 = Class_39140.Method_39144(list, random, n, n2, n3, class_4595, n4);
        }
        return class_36381;
    }

    static Class_19385 Method_8250() {
        return Field_8242;
    }

    public static void Method_8251() {
        Field_8241 = Lists.newArrayList();
        Class_31449[] arrclass_31449 = Field_8240;
        int n = arrclass_31449.length;
        for (int i = -29664 & 25094; i < n; ++i) {
            Class_31449 class_31449 = arrclass_31449[i];
            class_31449.Field_31453 = 6144 & 8229;
            Field_8241.add(class_31449);
        }
        Field_8243 = null;
    }

    static {
        Class_31449[] arrclass_31449 = new Class_31449[4187 & 18475];
        arrclass_31449[12812 & -32621] = new Class_31449(Class_45176.class, 40 & 10344, 4609 & 18832);
        arrclass_31449[1 & -23547] = new Class_31449(Class_42585.class, 2133 & 261, 45 & -28155);
        arrclass_31449[-32762 & 4258] = new Class_31449(Class_41314.class, 52 & -26404, -32190 & 2048);
        arrclass_31449[-31605 & 31523] = new Class_31449(Class_47626.class, -32708 & 8340, 2128 & 9252);
        arrclass_31449[12357 & 2230] = new Class_31449(Class_38804.class, -24182 & 1050, 8199 & 2686);
        arrclass_31449[-13771 & 5] = new Class_31449(Class_36567.class, 1039 & -4027, 16549 & 8735);
        arrclass_31449[4366 & 18647] = new Class_31449(Class_41462.class, -32763 & 2935, 541 & 4421);
        arrclass_31449[2127 & -31337] = new Class_31449(Class_45558.class, 4103 & 24717, 8212 & 3108);
        arrclass_31449[300 & 27784] = new Class_31449(Class_46166.class, 8261 & -12155, -32692 & 7349);
        arrclass_31449[23561 & 285] = new Class_37008(Class_41551.class, -31477 & 20490, 8306 & 1670);
        arrclass_31449[10315 & -15698] = new Class_36190(Class_39140.class, 53 & 4374, 18049 & 4169);
        Field_8240 = arrclass_31449;
        Field_8242 = new Class_19385(null);
    }

    private static boolean Method_8252() {
        int n = -32254 & 4201;
        Field_8239 = -32760 & 3138;
        for (Class_31449 class_31449 : Field_8241) {
            if (class_31449.Field_31452 > 0 && class_31449.Field_31453 < class_31449.Field_31452) {
                n = 4099 & -31743;
            }
            Field_8239 += class_31449.Field_31450;
        }
        return n != 0;
    }

    static Class_13400 Method_8253(Class_45837 class_45837, List list, Random random, int n, int n2, int n3, Class_4595 class_4595, int n4) {
        return Class_8238.Method_8245(class_45837, list, random, n, n2, n3, class_4595, n4);
    }
}

