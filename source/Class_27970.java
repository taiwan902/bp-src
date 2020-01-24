/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 *  com.google.common.base.Objects
 *  com.google.common.base.Objects$ToStringHelper
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 *  com.mojang.authlib.properties.PropertyMap
 */
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class Class_27970
implements Class_1486 {
    private Class_21288 Field_27971;
    private final List Field_27972 = Lists.newArrayList();

    public String Method_27973() {
        return Objects.toStringHelper((Object)this).add("action", (Object)this.Field_27971).add("entries", (Object)this.Field_27972).toString();
    }

    public void Method_27974(Class_29900 class_29900) {
        this.Field_27971 = (Class_21288)class_29900.Method_30009(Class_21288.class);
        int n = class_29900.Method_30004();
        for (int i = 27248 & 8; i < n; ++i) {
            GameProfile gameProfile = null;
            int n2 = -24544 & 768;
            Class_35650 class_35650 = null;
            Class_1782 class_1782 = null;
            switch (Class_6788.Field_6789[this.Field_27971.ordinal()]) {
                case 1: {
                    gameProfile = new GameProfile(class_29900.Method_30011(), class_29900.Method_29991(18776 & 4752));
                    int n3 = class_29900.Method_30004();
                    for (int j = 25092 & 32; j < n3; ++j) {
                        String string = class_29900.Method_29991(32767 & 32767);
                        String string2 = class_29900.Method_29991(-1 & 32767);
                        if (class_29900.Method_29962()) {
                            gameProfile.getProperties().put((Object)string, (Object)new Property(string, string2, class_29900.Method_29991(-1 & 32767)));
                            continue;
                        }
                        gameProfile.getProperties().put((Object)string, (Object)new Property(string, string2));
                    }
                    class_35650 = Class_35650.Method_35659(class_29900.Method_30004());
                    n2 = class_29900.Method_30004();
                    if (!class_29900.Method_29962()) break;
                    class_1782 = class_29900.Method_30020();
                    break;
                }
                case 2: {
                    gameProfile = new GameProfile(class_29900.Method_30011(), (String)null);
                    class_35650 = Class_35650.Method_35659(class_29900.Method_30004());
                    break;
                }
                case 3: {
                    gameProfile = new GameProfile(class_29900.Method_30011(), (String)null);
                    n2 = class_29900.Method_30004();
                    break;
                }
                case 4: {
                    gameProfile = new GameProfile(class_29900.Method_30011(), (String)null);
                    if (!class_29900.Method_29962()) break;
                    class_1782 = class_29900.Method_30020();
                    break;
                }
                case 5: {
                    gameProfile = new GameProfile(class_29900.Method_30011(), (String)null);
                }
            }
            this.Field_27972.add(new Class_14932(this, gameProfile, n2, class_35650, class_1782));
        }
    }

    public void Method_27975(Class_29900 class_29900) {
        class_29900.Method_29964(this.Field_27971);
        class_29900.Method_29982(this.Field_27972.size());
        for (Class_14932 class_14932 : this.Field_27972) {
            switch (Class_6788.Field_6789[this.Field_27971.ordinal()]) {
                case 1: {
                    class_29900.Method_29997(class_14932.Method_14943().getId());
                    class_29900.Method_29960(class_14932.Method_14943().getName());
                    class_29900.Method_29982(class_14932.Method_14943().getProperties().size());
                    for (Property property : class_14932.Method_14943().getProperties().values()) {
                        class_29900.Method_29960(property.getName());
                        class_29900.Method_29960(property.getValue());
                        if (property.hasSignature()) {
                            class_29900.Method_29980((593 & 3461) != 0);
                            class_29900.Method_29960(property.getSignature());
                            continue;
                        }
                        class_29900.Method_29980((0 & -26612) != 0);
                    }
                    class_29900.Method_29982(class_14932.Method_14940().Method_35660());
                    class_29900.Method_29982(class_14932.Method_14939());
                    if (class_14932.Method_14941() == null) {
                        class_29900.Method_29980((2818 & 4153) != 0);
                        break;
                    }
                    class_29900.Method_29980((12437 & 259) != 0);
                    class_29900.Method_29930(class_14932.Method_14941());
                    break;
                }
                case 2: {
                    class_29900.Method_29997(class_14932.Method_14943().getId());
                    class_29900.Method_29982(class_14932.Method_14940().Method_35660());
                    break;
                }
                case 3: {
                    class_29900.Method_29997(class_14932.Method_14943().getId());
                    class_29900.Method_29982(class_14932.Method_14939());
                    break;
                }
                case 4: {
                    class_29900.Method_29997(class_14932.Method_14943().getId());
                    if (class_14932.Method_14941() == null) {
                        class_29900.Method_29980((16392 & 448) != 0);
                        break;
                    }
                    class_29900.Method_29980((1297 & -26109) != 0);
                    class_29900.Method_29930(class_14932.Method_14941());
                    break;
                }
                case 5: {
                    class_29900.Method_29997(class_14932.Method_14943().getId());
                }
            }
        }
    }

    public List Method_27976() {
        return this.Field_27972;
    }

    public Class_27970() {
    }

    private void Method_27977() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_27970(Class_21288 class_21288, Iterable iterable) {
        this.Field_27971 = class_21288;
        for (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 : iterable) {
            this.Field_27972.add(new Class_14932(this, \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp(), \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp, \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp.Method_38767(), \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000, `()));
        }
    }

    public void Method_27978(Class_14856 class_14856) {
        class_14856.Method_14870(this);
    }

    public Class_21288 Method_27979() {
        return this.Field_27971;
    }

    public Class_27970(Class_21288 class_21288, \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true ... arr\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true) {
        this.Field_27971 = class_21288;
        \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true[] arr\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 = arr\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true;
        int n = arr\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.length;
        for (int i = -20032 & 34; i < n; ++i) {
            \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 = arr\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2[i];
            this.Field_27972.add(new Class_14932(this, \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp(), \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp, \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp.Method_38767(), \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000, `()));
        }
    }

    public void Method_27980(Class_10954 class_10954) {
        this.Method_27978((Class_14856)class_10954);
    }
}

