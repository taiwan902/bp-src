/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_7961 {
    private Class_29437 Field_7962 = new Class_29437();
    private int Field_7963;
    private static final Logger Field_7964 = LogManager.getLogger();
    private final Class_2651 Field_7965;
    private Set Field_7966 = Sets.newHashSet();

    public void Method_7967(Class_1061 class_1061) {
        Object object;
        if (class_1061 instanceof \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true) {
            object = (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)class_1061;
            for (Class_16506 class_16506 : this.Field_7966) {
                class_16506.Method_16541((\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)object);
            }
        }
        if ((object = (Class_16506)this.Field_7962.Method_29446(class_1061.Method_1311())) != null) {
            this.Field_7966.remove(object);
            ((Class_16506)object).Method_16542();
        }
    }

    private void Method_7968() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_7969(\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2) {
        for (Class_16506 class_16506 : this.Field_7966) {
            class_16506.Method_16540(\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2);
        }
    }

    public void Method_7970(Class_1061 class_1061, Class_1486 class_1486) {
        Class_16506 class_16506 = (Class_16506)this.Field_7962.Method_29447(class_1061.Method_1311());
        if (class_16506 != null) {
            class_16506.Method_16534(class_1486);
        }
    }

    public void Method_7971(Class_1061 class_1061, int n, int n2, boolean bl) {
        if (n > this.Field_7963) {
            n = this.Field_7963;
        }
        try {
            if (this.Field_7962.Method_29455(class_1061.Method_1311())) {
                throw new IllegalStateException("Entity is already tracked!");
            }
            Class_16506 class_16506 = new Class_16506(class_1061, n, n2, bl);
            this.Field_7966.add(class_16506);
            this.Field_7962.Method_29453(class_1061.Method_1311(), class_16506);
            class_16506.Method_16536(this.Field_7965.\u0000strictfp);
        }
        catch (Throwable throwable) {
            Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Adding entity to track");
            Class_13220 class_13220 = class_13268.Method_13280("Entity To Track");
            class_13220.Method_13231("Tracking range", n + " blocks");
            class_13220.Method_13232("Update interval", new Class_15389(this, n2));
            class_1061.Method_1284(class_13220);
            Class_13220 class_132202 = class_13268.Method_13280("Entity That Is Already Tracked");
            ((Class_16506)this.Field_7962.Method_29447((int)class_1061.Method_1311())).Field_16517.Method_1284(class_132202);
            try {
                throw new Class_1809(class_13268);
            }
            catch (Class_1809 class_1809) {
                Field_7964.error("\"Silently\" catching entity tracking error.", (Throwable)class_1809);
            }
        }
    }

    public void Method_7972(Class_1061 class_1061, int n, int n2) {
        this.Method_7971(class_1061, n, n2, (8218 & 128) != 0);
    }

    public Class_7961(Class_2651 class_2651) {
        this.Field_7965 = class_2651;
        this.Field_7963 = class_2651.Method_2706().Method_2616().Method_3100();
    }

    public void Method_7973() {
        ArrayList arrayList = Lists.newArrayList();
        for (Class_16506 class_16506 : this.Field_7966) {
            class_16506.Method_16538(this.Field_7965.\u0000strictfp);
            if (!class_16506.Field_16513 || !(class_16506.Field_16517 instanceof \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)) continue;
            arrayList.add((\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)class_16506.Field_16517);
        }
        for (int i = 16785 & -26584; i < arrayList.size(); ++i) {
            Class_16506 class_16506;
            class_16506 = (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)arrayList.get(i);
            for (Class_16506 class_165062 : this.Field_7966) {
                if (class_165062.Field_16517 == class_16506) continue;
                class_165062.Method_16544((\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)class_16506);
            }
        }
    }

    public void Method_7974(Class_1061 class_1061, Class_1486 class_1486) {
        Class_16506 class_16506 = (Class_16506)this.Field_7962.Method_29447(class_1061.Method_1311());
        if (class_16506 != null) {
            class_16506.Method_16545(class_1486);
        }
    }

    public void Method_7975(\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2, Class_17665 class_17665) {
        for (Class_16506 class_16506 : this.Field_7966) {
            if (class_16506.Field_16517 == \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 || class_16506.Field_16517.Field_1147 != class_17665.Field_17666 || class_16506.Field_16517.Field_1090 != class_17665.Field_17668) continue;
            class_16506.Method_16544(\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2);
        }
    }

    public void Method_7976(\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2) {
        for (Class_16506 class_16506 : this.Field_7966) {
            if (class_16506.Field_16517 == \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2) {
                class_16506.Method_16536(this.Field_7965.\u0000strictfp);
                continue;
            }
            class_16506.Method_16544(\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2);
        }
    }

    public void Method_7977(Class_1061 class_1061) {
        if (class_1061 instanceof \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true) {
            this.Method_7972(class_1061, 536 & 515, 31 & 1570);
            \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 = (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true)class_1061;
            for (Class_16506 class_16506 : this.Field_7966) {
                if (class_16506.Field_16517 == \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2) continue;
                class_16506.Method_16544(\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2);
            }
        } else if (class_1061 instanceof Class_32050) {
            this.Method_7971(class_1061, 1744 & -10176, 4677 & 18821, (6281 & 1825) != 0);
        } else if (class_1061 instanceof Class_41498) {
            this.Method_7971(class_1061, 13632 & 17003, 11284 & -28644, (132 & 2424) != 0);
        } else if (class_1061 instanceof Class_36739) {
            this.Method_7971(class_1061, 580 & 16728, 158 & 7274, (-31648 & 16512) != 0);
        } else if (class_1061 instanceof Class_26026) {
            this.Method_7971(class_1061, 25681 & 4802, 4730 & 24587, (-24572 & 6210) != 0);
        } else if (class_1061 instanceof Class_34918) {
            this.Method_7971(class_1061, 64 & 452, 1114 & 25102, (647 & 1073) != 0);
        } else if (class_1061 instanceof Class_34203) {
            this.Method_7971(class_1061, -30648 & 580, -30690 & 13578, (-11199 & 8833) != 0);
        } else if (class_1061 instanceof Class_25548) {
            this.Method_7971(class_1061, -29755 & 16480, 164 & -27899, (25603 & 4125) != 0);
        } else if (class_1061 instanceof Class_47588) {
            this.Method_7971(class_1061, 5185 & 832, 26122 & -32706, (-32255 & 8493) != 0);
        } else if (class_1061 instanceof Class_43663) {
            this.Method_7971(class_1061, -28318 & 16580, 2154 & -19698, (8673 & 539) != 0);
        } else if (class_1061 instanceof Class_35722) {
            this.Method_7971(class_1061, 64 & 6224, 25146 & -32757, (8199 & 7745) != 0);
        } else if (class_1061 instanceof Class_41709) {
            this.Method_7971(class_1061, 3184 & -3518, 4426 & 26638, (8835 & 16649) != 0);
        } else if (class_1061 instanceof Class_3443) {
            this.Method_7971(class_1061, 12889 & 66, 31 & 212, (17441 & -32361) != 0);
        } else if (class_1061 instanceof Class_15933) {
            this.Method_7971(class_1061, 80 & 16504, 1027 & 4547, (-28671 & 26761) != 0);
        } else if (class_1061 instanceof Class_25683) {
            this.Method_7971(class_1061, -10926 & 88, -28157 & 2323, (-31471 & 193) != 0);
        } else if (class_1061 instanceof Class_38719) {
            this.Method_7971(class_1061, 2401 & 13396, 9495 & 21123, (16517 & 17) != 0);
        } else if (class_1061 instanceof Class_42901) {
            this.Method_7971(class_1061, 212 & -16302, 16403 & -29053, (-11631 & 11520) != 0);
        } else if (class_1061 instanceof Class_47097) {
            this.Method_7971(class_1061, 465 & -14252, 131 & -21949, (2056 & 1714) != 0);
        } else if (class_1061 instanceof Class_34590) {
            this.Method_7971(class_1061, -22083 & 22176, 19 & 2115, (6033 & -24509) != 0);
        } else if (class_1061 instanceof Class_18003) {
            this.Method_7971(class_1061, 210 & -23952, 18651 & 12839, (15377 & 941) != 0);
        } else if (class_1061 instanceof Class_5813) {
            this.Method_7971(class_1061, 1267 & -22108, -12130 & 75, (1413 & -24063) != 0);
        } else if (class_1061 instanceof Class_4486) {
            this.Method_7971(class_1061, -32581 & 21664, 9236 & -32649, (16449 & -26587) != 0);
        } else if (class_1061 instanceof Class_25768) {
            this.Method_7971(class_1061, 2725 & -27152, Integer.MAX_VALUE & Integer.MAX_VALUE, (12480 & 24) != 0);
        } else if (class_1061 instanceof Class_27288) {
            this.Method_7971(class_1061, 10418 & -16212, 83 & -14333, (8723 & 2309) != 0);
        } else if (class_1061 instanceof Class_3481) {
            this.Method_7971(class_1061, 18600 & 228, 8220 & 1175, (-32365 & 8197) != 0);
        } else if (class_1061 instanceof Class_14845) {
            this.Method_7971(class_1061, 8469 & 424, Integer.MAX_VALUE & Integer.MAX_VALUE, (-24544 & 16925) != 0);
        }
    }
}

