/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_38466
extends Class_1956 {
    public void Method_38467(Class_23823 class_23823, Class_626 class_626, List list, boolean bl) {
        if (class_23823.Method_23842()) {
            Class_1699 class_1699 = class_23823.Method_23845();
            String string = class_1699.Method_1708("author");
            if (!Class_35310.Method_35315(string)) {
                Object[] arrobject = new Object[30853 & -32143];
                arrobject[129 & 14850] = string;
                list.add((Object)((Object)Class_5478.Field_5480) + Class_7594.Method_7597("book.byAuthor", arrobject));
            }
            list.add((Object)((Object)Class_5478.Field_5480) + Class_7594.Method_7602("book.generation." + class_1699.Method_1738("generation")));
        }
    }

    private void Method_38468(Class_23823 class_23823, Class_626 class_626) {
        Class_1699 class_1699;
        if (class_23823 != null && class_23823.Method_23845() != null && !(class_1699 = class_23823.Method_23845()).Method_1733("resolved")) {
            class_1699.Method_1706("resolved", (20035 & 8193) != 0);
            if (Class_38466.Method_38470(class_1699)) {
                Class_1758 class_1758 = class_1699.Method_1735("pages", 16392 & 232);
                for (int i = 16128 & 106; i < class_1758.Method_1772(); ++i) {
                    Class_1782 class_1782;
                    String string = class_1758.Method_1771(i);
                    try {
                        class_1782 = Class_2814.Method_2819(string);
                        class_1782 = Class_21303.Method_21304(class_626, class_1782, class_626);
                    }
                    catch (Exception exception) {
                        class_1782 = new Class_2840(string);
                    }
                    class_1758.Method_1780(i, new Class_1746(Class_2814.Method_2821(class_1782)));
                }
                class_1699.Method_1744("pages", class_1758);
                if (class_626 instanceof \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true && class_626.Method_792() == class_23823) {
                    Class_26421 class_26421 = class_626.Field_665.Method_8334(class_626.Field_628, class_626.Field_628.Field_37782);
                    ((\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)class_626).\u0000strictfp.Method_20821(new Class_35914(-20414 & 2216, class_26421.Field_26423, class_23823));
                }
            }
        }
    }

    private void Method_38469() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static boolean Method_38470(Class_1699 class_1699) {
        if (!Class_33817.Method_33820(class_1699)) {
            return (12290 & 16580) != 0;
        }
        if (!class_1699.Method_1715("title", -31688 & 11018)) {
            return (-29440 & 1) != 0;
        }
        String string = class_1699.Method_1708("title");
        return string != null && string.length() <= (560 & 8360) ? class_1699.Method_1715("author", -14324 & 1673) : 1154 & -8184;
    }

    public String Method_38471(Class_23823 class_23823) {
        String string;
        Class_1699 class_1699;
        if (class_23823.Method_23842() && !Class_35310.Method_35315(string = (class_1699 = class_23823.Method_23845()).Method_1708("title"))) {
            return string;
        }
        return super.Method_2030(class_23823);
    }

    public static int Method_38472(Class_23823 class_23823) {
        return class_23823.Method_23845().Method_1738("generation");
    }

    public Class_38466() {
        this.\u0000, `(13345 & 16521);
    }

    public boolean Method_38473(Class_23823 class_23823) {
        return (547 & 9345) != 0;
    }

    public Class_23823 Method_38474(Class_23823 class_23823, Class_283 class_283, Class_626 class_626) {
        if (!class_283.Field_306) {
            this.Method_38468(class_23823, class_626);
        }
        class_626.Method_801(class_23823);
        class_626.Method_750(Class_19863.Field_19917[Class_1956.Method_1986(this)]);
        return class_23823;
    }
}

