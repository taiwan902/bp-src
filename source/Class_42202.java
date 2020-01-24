/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_42202
extends Class_36787 {
    public String Method_42203(Class_1367 class_1367) {
        return "commands.compare.usage";
    }

    public String Method_42204() {
        return "testforblocks";
    }

    private void Method_42205() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void Method_42206(Class_1367 class_1367, String[] arrstring) {
        if (arrstring.length < (2317 & 8779)) {
            throw new Class_34974("commands.compare.usage", new Object[-17774 & 360]);
        }
        class_1367.Method_1374(Class_26261.Field_26265, 4642 & 16728);
        Class_4751 class_4751 = Class_42202.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(8320 & 17472), (17417 & 64) != 0);
        Class_4751 class_47512 = Class_42202.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(-7737 & 1043), (4216 & -7424) != 0);
        Class_4751 class_47513 = Class_42202.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(2182 & 9247), (24725 & 2346) != 0);
        Class_42666 class_42666 = new Class_42666(class_4751, class_47512);
        Class_42666 class_426662 = new Class_42666(class_47513, class_47513.Method_4790(class_42666.Method_42675()));
        int n = class_42666.Method_42687() * class_42666.Method_42686() * class_42666.Method_42676();
        if (n > (1380647305 & 690784256)) {
            Object[] arrobject = new Object[-30589 & 6];
            arrobject[-15360 & 12865] = n;
            arrobject[-32765 & 21697] = 873013424 & 1208896512;
            throw new Class_30034("commands.compare.tooManyBlocks", arrobject);
        }
        if (class_42666.Field_42672 < 0 || class_42666.Field_42671 >= (4437 & 27008) || class_426662.Field_42672 < 0 || class_426662.Field_42671 >= (20768 & 855)) throw new Class_30034("commands.compare.outOfWorld", new Object[25120 & 4296]);
        Class_283 class_283 = class_1367.Method_1375();
        if (!class_283.Method_430(class_42666) || !class_283.Method_430(class_426662)) throw new Class_30034("commands.compare.outOfWorld", new Object[2144 & 4224]);
        int n2 = 0 & 28674;
        if (arrstring.length > (18959 & 41) && arrstring[10601 & 539].equals("masked")) {
            n2 = 1061 & 2329;
        }
        n = 17265 & 2050;
        Class_4751 class_47514 = new Class_4751(class_426662.Field_42668 - class_42666.Field_42668, class_426662.Field_42672 - class_42666.Field_42672, class_426662.Field_42669 - class_42666.Field_42669);
        Class_4810 class_4810 = new Class_4810();
        Class_4810 class_48102 = new Class_4810();
        for (int i = class_42666.Field_42669; i <= class_42666.Field_42667; ++i) {
            for (int j = class_42666.Field_42672; j <= class_42666.Field_42671; ++j) {
                for (int k = class_42666.Field_42668; k <= class_42666.Field_42670; ++k) {
                    class_4810.Method_4814(k, j, i);
                    class_48102.Method_4814(k + class_47514.\u0000= final(), j + class_47514.\u0000, `(), i + class_47514.\u0000strictfp());
                    int n3 = 24722 & -31743;
                    Class_3436 class_3436 = class_283.Method_375(class_4810);
                    if (n2 != 0 && class_3436.Method_3442() == Class_9265.Field_9351) continue;
                    if (class_3436 == class_283.Method_375(class_48102)) {
                        Class_4879 class_4879 = class_283.Method_429(class_4810);
                        Class_4879 class_48792 = class_283.Method_429(class_48102);
                        if (class_4879 != null && class_48792 != null) {
                            Class_1699 class_1699 = new Class_1699();
                            class_4879.Method_4929(class_1699);
                            class_1699.Method_1740("x");
                            class_1699.Method_1740("y");
                            class_1699.Method_1740("z");
                            Class_1699 class_16992 = new Class_1699();
                            class_48792.Method_4929(class_16992);
                            class_16992.Method_1740("x");
                            class_16992.Method_1740("y");
                            class_16992.Method_1740("z");
                            if (!class_1699.Method_1734(class_16992)) {
                                n3 = -29149 & 24585;
                            }
                        } else if (class_4879 != null) {
                            n3 = 5123 & 8797;
                        }
                    } else {
                        n3 = 35 & -32447;
                    }
                    ++n;
                    if (n3 == 0) continue;
                    throw new Class_30034("commands.compare.failed", new Object[64 & 14340]);
                }
            }
        }
        class_1367.Method_1374(Class_26261.Field_26265, n);
        Object[] arrobject = new Object[8453 & 20513];
        arrobject[5450 & 26624] = n;
        Class_42202.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.compare.success", (Object[])arrobject);
    }

    public int Method_42207() {
        return 2050 & -24058;
    }

    public List Method_42208(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        List list;
        if (arrstring.length > 0 && arrstring.length <= (615 & 16523)) {
            list = Class_42202.\u0000strictfp((String[])arrstring, (int)(608 & 12314), (Class_4751)class_4751);
        } else if (arrstring.length > (6275 & 17527) && arrstring.length <= (-15482 & 14342)) {
            list = Class_42202.\u0000strictfp((String[])arrstring, (int)(17515 & 14727), (Class_4751)class_4751);
        } else if (arrstring.length > (1030 & 2150) && arrstring.length <= (6413 & 25337)) {
            list = Class_42202.\u0000strictfp((String[])arrstring, (int)(1294 & 25094), (Class_4751)class_4751);
        } else if (arrstring.length == (15370 & 138)) {
            String[] arrstring2 = new String[35 & -13818];
            arrstring2[24836 & 4656] = "masked";
            arrstring2[16969 & -32733] = "all";
            list = Class_42202.\u0000strictfp((String[])arrstring, (String[])arrstring2);
        } else {
            list = null;
        }
        return list;
    }
}

