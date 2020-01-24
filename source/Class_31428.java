/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;

public abstract class Class_31428
extends Class_11117 {
    private Class_14376 Field_31429 = new Class_14376();
    protected Map Field_31430 = new HashMap();
    private Class_47711 Field_31431;

    protected final void Method_31432(Class_283 class_283, int n, int n2, int n3, int n4, Class_36425 class_36425) {
        this.Method_31440(class_283);
        if (!this.Field_31429.Method_14394(Class_29480.Method_29490(n, n2))) {
            this.\u0000strictfp.nextInt();
            try {
                if (this.Method_31433(n, n2)) {
                    Class_18019 class_18019 = this.Method_31436(n, n2);
                    this.Field_31430.put(Class_29480.Method_29490(n, n2), class_18019);
                    this.Field_31429.Method_14393(Class_29480.Method_29490(n, n2), class_18019);
                    this.Method_31442(n, n2, class_18019);
                }
            }
            catch (Throwable throwable) {
                Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Exception preparing structure feature");
                Class_13220 class_13220 = class_13268.Method_13280("Feature being prepared");
                class_13220.Method_13232("Is feature chunk", new Class_25647(this, n, n2));
                Object[] arrobject = new Object[9138 & 10];
                arrobject[16516 & -30710] = n;
                arrobject[6289 & 37] = n2;
                class_13220.Method_13231("Chunk location", String.format("%d,%d", arrobject));
                class_13220.Method_13232("Chunk pos hash", new Class_16333(this, n, n2));
                class_13220.Method_13232("Structure type", new Class_16586(this));
                throw new Class_1809(class_13268);
            }
        }
    }

    protected abstract boolean Method_31433(int var1, int var2);

    public boolean Method_31434(Class_283 class_283, Random random, Class_29480 class_29480) {
        this.Method_31440(class_283);
        int n = (class_29480.Field_29483 << (2566 & 12)) + (6283 & 16696);
        int n2 = (class_29480.Field_29482 << (8732 & 36)) + (7499 & -8008);
        int n3 = 12 & -21311;
        for (V v : this.Field_31430.values()) {
            Class_18019 class_18019 = (Class_18019)v;
            if (!class_18019.Method_18026() || !class_18019.Method_18034(class_29480) || !class_18019.Method_18035().Method_42679(n, n2, n + (8207 & 16687), n2 + (11023 & -32625))) continue;
            class_18019.Method_18039(class_283, random, new Class_42666(n, n2, n + (-23505 & 2319), n2 + (63 & 2127)));
            class_18019.Method_18032(class_29480);
            n3 = 3281 & -24569;
            this.Method_31442(class_18019.Method_18036(), class_18019.Method_18037(), class_18019);
        }
        return n3 != 0;
    }

    public Class_4751 Method_31435(Class_283 class_283, Class_4751 class_4751) {
        Object object;
        Class_13400 class_13400;
        this.\u0000strictfp = class_283;
        this.Method_31440(class_283);
        this.\u0000strictfp.setSeed(class_283.Method_392());
        long l = this.\u0000strictfp.nextLong();
        long l2 = this.\u0000strictfp.nextLong();
        long l3 = (long)(class_4751.\u0000= final() >> (-24380 & 3620)) * l;
        long l4 = (long)(class_4751.\u0000strictfp() >> (24965 & -32228)) * l2;
        this.\u0000strictfp.setSeed(l3 ^ l4 ^ class_283.Method_392());
        this.Method_31432(class_283, class_4751.\u0000= final() >> (-31932 & 16422), class_4751.\u0000strictfp() >> (25140 & 132), 810 & -20399, 12549 & 626, null);
        double d = 1.6778469258714947E308 * 1.0714285714285714;
        Class_4751 class_47512 = null;
        for (Object object2 : this.Field_31430.values()) {
            Class_4751 class_47513;
            double d2;
            object = (Class_18019)object2;
            if (!((Class_18019)object).Method_18026() || !((d2 = (class_47513 = (class_13400 = (Class_13400)((Class_18019)object).Method_18030().get(5228 & 10241)).Method_13410()).\u0000strictfp((Class_4792)class_4751)) < d)) continue;
            d = d2;
            class_47512 = class_47513;
        }
        if (class_47512 != null) {
            return class_47512;
        }
        List list = this.Method_31439();
        if (list != null) {
            Object object2;
            object2 = null;
            object = list.iterator();
            while (object.hasNext()) {
                class_13400 = object.next();
                double d3 = ((Class_4751)((Object)class_13400)).\u0000strictfp((Class_4792)class_4751);
                if (!(d3 < d)) continue;
                d = d3;
                object2 = (Class_4751)((Object)class_13400);
            }
            return object2;
        }
        return null;
    }

    protected abstract Class_18019 Method_31436(int var1, int var2);

    private void Method_31437() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_31438(Class_4751 class_4751) {
        this.Method_31440(this.\u0000strictfp);
        return (this.Method_31444(class_4751) != null ? 19 & 16705 : 0 & -27659) != 0;
    }

    protected List Method_31439() {
        return null;
    }

    private void Method_31440(Class_283 class_283) {
        if (this.Field_31431 == null) {
            Object object;
            if (Class_14610.Field_14623.Method_13570()) {
                object = (Class_35273)Class_14610.Method_14650(class_283, Class_14610.Field_14623, new Object[1024 & 21013]);
                this.Field_31431 = (Class_47711)((Class_35273)object).Method_35279(Class_47711.class, this.Method_31441());
            } else {
                this.Field_31431 = (Class_47711)class_283.Method_492(Class_47711.class, this.Method_31441());
            }
            if (this.Field_31431 == null) {
                this.Field_31431 = new Class_47711(this.Method_31441());
                if (Class_14610.Field_14623.Method_13570()) {
                    object = (Class_35273)Class_14610.Method_14650(class_283, Class_14610.Field_14623, new Object[3425 & -4080]);
                    ((Class_35273)object).Method_35284(this.Method_31441(), this.Field_31431);
                } else {
                    class_283.Method_557(this.Method_31441(), this.Field_31431);
                }
            } else {
                object = this.Field_31431.Method_47718();
                for (String string : ((Class_1699)object).Method_1710()) {
                    Class_1699 class_1699;
                    Class_1674 class_1674 = ((Class_1699)object).Method_1720(string);
                    if (class_1674.Method_1683() != (-22002 & 4138) || !(class_1699 = (Class_1699)class_1674).Method_1707("ChunkX") || !class_1699.Method_1707("ChunkZ")) continue;
                    int n = class_1699.Method_1738("ChunkX");
                    int n2 = class_1699.Method_1738("ChunkZ");
                    Class_18019 class_18019 = Class_34391.Method_34407(class_1699, class_283);
                    if (class_18019 == null) continue;
                    this.Field_31430.put(Class_29480.Method_29490(n, n2), class_18019);
                    this.Field_31429.Method_14393(Class_29480.Method_29490(n, n2), class_18019);
                }
            }
        }
    }

    public abstract String Method_31441();

    private void Method_31442(int n, int n2, Class_18019 class_18019) {
        this.Field_31431.Method_47715(class_18019.Method_18029(n, n2), n, n2);
        this.Field_31431.\u0000, `();
    }

    public boolean Method_31443(Class_283 class_283, Class_4751 class_4751) {
        this.Method_31440(class_283);
        for (V v : this.Field_31430.values()) {
            Class_18019 class_18019 = (Class_18019)v;
            if (!class_18019.Method_18026() || !class_18019.Method_18035().Method_42683(class_4751)) continue;
            return (4417 & 26641) != 0;
        }
        return (-31548 & 18443) != 0;
    }

    protected Class_18019 Method_31444(Class_4751 class_4751) {
        for (V v : this.Field_31430.values()) {
            Class_18019 class_18019 = (Class_18019)v;
            if (!class_18019.Method_18026() || !class_18019.Method_18035().Method_42683(class_4751)) continue;
            for (Class_13400 class_13400 : class_18019.Method_18030()) {
                if (!class_13400.Method_13415().Method_42683(class_4751)) continue;
                return class_18019;
            }
        }
        return null;
    }
}

