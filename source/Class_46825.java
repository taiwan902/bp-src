/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public abstract class Class_46825
extends Class_43742 {
    protected final boolean Field_46826;
    private long Field_46827;
    private final Class_26462 Field_46828 = new Class_26462(this, this.Field_46831);
    private final int Field_46829;
    static final boolean Field_46830 = !Class_46825.class.desiredAssertionStatus() ? 9217 & 4489 : 3952 & 134;
    private final Class_8601 Field_46831 = new Class_8601(8897 & -28286);
    private final int Field_46832;
    private final boolean Field_46833;
    private Class_32692 Field_46834;
    private int Field_46835;
    private final Class_37085 Field_46836 = new Class_37085(this, this.Field_46831);
    private long Field_46837 = -8062429601900523192L & -9223372036811390284L;
    private final int Field_46838;

    static int Method_46839(Class_46825 class_46825) {
        return class_46825.Field_46832;
    }

    private void Method_46840() {
        Class_37974 class_37974;
        Class_32692 class_32692 = this.Field_46834;
        this.Field_46834 = null;
        this.Field_46837 = -9223372035377807220L & -6537597345879551744L;
        if (!this.Method_46859() && (class_37974 = (Class_37974)class_32692) != null && class_37974.Method_37975().Method_7129() == (-14235 & 8421)) {
            this.checkpoint((Object)Class_14530.Field_14533);
            return;
        }
        this.checkpoint((Object)Class_14530.Field_14539);
    }

    private static String[] Method_46841(Class_8601 class_8601) {
        int n = Class_46825.Method_46858(class_8601, -27985 & 1024);
        int n2 = Class_46825.Method_46843(class_8601, n);
        int n3 = Class_46825.Method_46858(class_8601, n2);
        int n4 = Class_46825.Method_46843(class_8601, n3);
        int n5 = Class_46825.Method_46858(class_8601, n4);
        int n6 = Class_46825.Method_46849(class_8601);
        String[] arrstring = new String[5319 & 787];
        arrstring[897 & 6144] = class_8601.Method_8616(n, n2);
        arrstring[17449 & 2177] = class_8601.Method_8616(n3, n4);
        arrstring[-16382 & 1158] = n5 < n6 ? class_8601.Method_8616(n5, n6) : "";
        return arrstring;
    }

    private static String[] Method_46842(Class_8601 class_8601) {
        int n;
        int n2;
        int n3;
        int n4;
        char c;
        int n5 = class_8601.Method_8608();
        for (n = n3 = Class_46825.Method_46858((CharSequence)class_8601, (int)(18900 & -28639)); n < n5 && (c = class_8601.Method_8606(n)) != (-28358 & 1087) && !Character.isWhitespace(c); ++n) {
        }
        for (n4 = n; n4 < n5; ++n4) {
            if (class_8601.Method_8606(n4) != (-5445 & 5498)) continue;
            ++n4;
            break;
        }
        if ((n2 = Class_46825.Method_46858(class_8601, n4)) == n5) {
            String[] arrstring = new String[24834 & 4610];
            arrstring[480 & -32767] = class_8601.Method_8616(n3, n);
            arrstring[16391 & 897] = "";
            return arrstring;
        }
        int n6 = Class_46825.Method_46849(class_8601);
        String[] arrstring = new String[1035 & 4114];
        arrstring[17460 & 2048] = class_8601.Method_8616(n3, n);
        arrstring[2821 & 8227] = class_8601.Method_8616(n2, n6);
        return arrstring;
    }

    private static int Method_46843(CharSequence charSequence, int n) {
        int n2;
        for (n2 = n; n2 < charSequence.length() && !Character.isWhitespace(charSequence.charAt(n2)); ++n2) {
        }
        return n2;
    }

    static int Method_46844(Class_46825 class_46825) {
        return class_46825.Field_46838;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void Method_46845(Class_39158 class_39158, Class_22553 class_22553, List list) {
        switch (Class_16076.Field_16077[((Class_14530)((Object)this.state())).ordinal()]) {
            case 1: {
                try {
                    Class_46825.Method_46846(class_22553);
                    this.checkpoint((Object)Class_14530.Field_14531);
                }
                finally {
                    this.checkpoint();
                }
            }
            case 2: {
                String[] arrstring;
                try {
                    arrstring = Class_46825.Method_46841(this.Field_46828.Method_26466(class_22553));
                    if (arrstring.length < (35 & 14347)) {
                        this.checkpoint((Object)Class_14530.Field_14539);
                        return;
                    }
                    this.Field_46834 = this.Method_46848(arrstring);
                    this.checkpoint((Object)Class_14530.Field_14541);
                }
                catch (Exception exception) {
                    list.add(this.Method_46855(exception));
                    return;
                }
            }
            case 3: {
                String[] arrstring;
                try {
                    arrstring = this.Method_46851(class_22553);
                    this.checkpoint((Object)arrstring);
                    if (arrstring == Class_14530.Field_14537) {
                        if (!this.Field_46833) {
                            throw new IllegalArgumentException("Chunked messages not supported");
                        }
                        list.add(this.Field_46834);
                        return;
                    }
                    if (arrstring == Class_14530.Field_14539) {
                        list.add(this.Field_46834);
                        list.add(Class_44416.Field_44417);
                        this.Method_46840();
                        return;
                    }
                    long l = this.Method_46853();
                    if (l == (-5931779731929067416L & 5931779730481375760L) || l == (-1L & -1L) && this.Method_46859()) {
                        list.add(this.Field_46834);
                        list.add(Class_44416.Field_44417);
                        this.Method_46840();
                        return;
                    }
                    if (!Field_46830 && arrstring != Class_14530.Field_14538 && arrstring != Class_14530.Field_14534) {
                        throw new AssertionError();
                    }
                    list.add(this.Field_46834);
                    if (arrstring == Class_14530.Field_14538) {
                        this.Field_46827 = l;
                    }
                    return;
                }
                catch (Exception exception) {
                    list.add(this.Method_46855(exception));
                    return;
                }
            }
            case 4: {
                int n = Math.min(this.actualReadableBytes(), this.Field_46829);
                if (n > 0) {
                    Class_22553 class_225532 = Class_10346.Method_10372(class_39158.Method_39170(), class_22553, n);
                    if (class_22553.Method_22583()) {
                        list.add(new Class_45052(class_225532));
                    } else {
                        list.add(new Class_46406(class_225532, this.Field_46826));
                        this.Method_46840();
                    }
                } else if (!class_22553.Method_22583()) {
                    list.add(Class_44416.Field_44417);
                    this.Method_46840();
                }
                return;
            }
            case 5: {
                int n = this.actualReadableBytes();
                if (n == 0) {
                    return;
                }
                int n2 = Math.min(n, this.Field_46829);
                if ((long)n2 > this.Field_46827) {
                    n2 = (int)this.Field_46827;
                }
                Class_22553 class_225533 = Class_10346.Method_10372(class_39158.Method_39170(), class_22553, n2);
                this.Field_46827 -= (long)n2;
                if (this.Field_46827 == (3305395805832351880L & 83968353L)) {
                    list.add(new Class_46406(class_225533, this.Field_46826));
                    this.Method_46840();
                } else {
                    list.add(new Class_45052(class_225533));
                }
                return;
            }
            case 6: {
                try {
                    Class_8601 class_8601 = this.Field_46828.Method_26466(class_22553);
                    int n = Class_46825.Method_46850(class_8601.Method_8614());
                    this.Field_46827 = n;
                    if (n == 0) {
                        this.checkpoint((Object)Class_14530.Field_14540);
                        return;
                    }
                    this.checkpoint((Object)Class_14530.Field_14536);
                }
                catch (Exception exception) {
                    list.add(this.Method_46862(exception));
                    return;
                }
            }
            case 7: {
                if (!Field_46830 && this.Field_46827 > (-3656865095754973185L & Integer.MAX_VALUE)) {
                    throw new AssertionError();
                }
                int n = Math.min((int)this.Field_46827, this.Field_46829);
                Class_45052 class_45052 = new Class_45052(Class_10346.Method_10372(class_39158.Method_39170(), class_22553, n));
                this.Field_46827 -= (long)n;
                list.add(class_45052);
                if (this.Field_46827 == (6490290371746209809L & -6490290372390615740L)) {
                    this.checkpoint((Object)Class_14530.Field_14532);
                } else {
                    return;
                }
            }
            case 8: {
                int n;
                do {
                    if ((n = class_22553.Method_22555()) == (525 & 1293)) {
                        if (class_22553.Method_22555() != (-31989 & 2122)) continue;
                        this.checkpoint((Object)Class_14530.Field_14537);
                        return;
                    }
                    if (n == (-28214 & 2074)) {
                        this.checkpoint((Object)Class_14530.Field_14537);
                        return;
                    }
                    this.checkpoint();
                } while (true);
            }
            case 9: {
                try {
                    Class_44416 class_44416 = this.Method_46852(class_22553);
                    list.add(class_44416);
                    this.Method_46840();
                    return;
                }
                catch (Exception exception) {
                    list.add(this.Method_46862(exception));
                    return;
                }
            }
            case 10: {
                class_22553.Method_22593(this.actualReadableBytes());
                break;
            }
            case 11: {
                int n = this.actualReadableBytes();
                if (n <= 0) break;
                list.add(class_22553.Method_22601(this.actualReadableBytes()));
                break;
            }
        }
    }

    private static void Method_46846(Class_22553 class_22553) {
        char c;
        while (Character.isISOControl(c = (char)class_22553.Method_22648()) || Character.isWhitespace(c)) {
        }
        class_22553.Method_22590(class_22553.Method_22582() - (2049 & -32247));
    }

    protected Class_46825() {
        this(4480 & 12354, 8192 & 8323, -24125 & 12336, (2049 & -3647) != 0);
    }

    protected Class_46825(int n, int n2, int n3, boolean bl, boolean bl2) {
        super((Object)Class_14530.Field_14539);
        if (n <= 0) {
            throw new IllegalArgumentException("maxInitialLineLength must be a positive integer: " + n);
        }
        if (n2 <= 0) {
            throw new IllegalArgumentException("maxHeaderSize must be a positive integer: " + n2);
        }
        if (n3 <= 0) {
            throw new IllegalArgumentException("maxChunkSize must be a positive integer: " + n3);
        }
        this.Field_46838 = n;
        this.Field_46832 = n2;
        this.Field_46829 = n3;
        this.Field_46833 = bl;
        this.Field_46826 = bl2;
    }

    protected boolean Method_46847(Class_32692 class_32692) {
        if (class_32692 instanceof Class_37974) {
            Class_37974 class_37974 = (Class_37974)class_32692;
            int n = class_37974.Method_37975().Method_7129();
            if (n >= (100 & -14724) && n < (5832 & 10472)) {
                return (n != (21095 & 9341) || class_37974.headers().Method_17167("Sec-WebSocket-Accept") ? 69 & 4609 : -25340 & 16912) != 0;
            }
            switch (n) {
                case 204: 
                case 205: 
                case 304: {
                    return (513 & -7833) != 0;
                }
            }
        }
        return (5221 & -32232) != 0;
    }

    protected abstract Class_32692 Method_46848(String[] var1);

    private static int Method_46849(CharSequence charSequence) {
        int n;
        for (n = charSequence.length(); n > 0 && Character.isWhitespace(charSequence.charAt(n - (-26463 & 16657))); --n) {
        }
        return n;
    }

    private static int Method_46850(String string) {
        string = string.trim();
        for (int i = 2248 & 306; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c != (315 & 12987) && !Character.isWhitespace(c) && !Character.isISOControl(c)) continue;
            string = string.substring(20566 & 8705, i);
            break;
        }
        return Integer.parseInt(string, 4241 & -16302);
    }

    private Class_14530 Method_46851(Class_22553 class_22553) {
        Class_14530 class_14530;
        this.Field_46835 = -30462 & 8256;
        Class_32692 class_32692 = this.Field_46834;
        Class_17103 class_17103 = class_32692.Method_32694();
        Class_8601 class_8601 = this.Field_46836.Method_37090(class_22553);
        String string = null;
        String string2 = null;
        if (class_8601.Method_8608() > 0) {
            class_17103.Method_17170();
            do {
                char c = class_8601.Method_8606(20612 & 1136);
                if (string != null && (c == (4128 & -15503) || c == (-12245 & 11353))) {
                    string2 = string2 + (char)(2084 & 20771) + class_8601.Method_8614().trim();
                    continue;
                }
                if (string != null) {
                    class_17103.Method_17129(string, string2);
                }
                String[] arrstring = Class_46825.Method_46842(class_8601);
                string = arrstring[16640 & -22364];
                string2 = arrstring[-31487 & 8213];
            } while ((class_8601 = this.Field_46836.Method_37090(class_22553)).Method_8608() > 0);
            if (string != null) {
                class_17103.Method_17129(string, string2);
            }
        }
        if (this.Method_46847(class_32692)) {
            Class_17103.Method_17145(class_32692);
            class_14530 = Class_14530.Field_14539;
        } else {
            class_14530 = Class_17103.Method_17122(class_32692) ? Class_14530.Field_14537 : (this.Method_46853() >= (1630685312L & -6287228154385787273L) ? Class_14530.Field_14538 : Class_14530.Field_14534);
        }
        return class_14530;
    }

    private Class_44416 Method_46852(Class_22553 class_22553) {
        this.Field_46835 = 4368 & 8225;
        Class_8601 class_8601 = this.Field_46836.Method_37090(class_22553);
        String string = null;
        if (class_8601.Method_8608() > 0) {
            Class_46406 class_46406 = new Class_46406(Class_16620.Field_16622, this.Field_46826);
            do {
                Object object;
                char c = class_8601.Method_8606(-16120 & 10272);
                if (string != null && (c == (1064 & 2100) || c == (16409 & 13039))) {
                    object = class_46406.Method_44422().Method_17126(string);
                    if (object.isEmpty()) continue;
                    int n = object.size() - (-29437 & 8193);
                    String string2 = (String)object.get(n) + class_8601.Method_8614().trim();
                    object.set(n, string2);
                    continue;
                }
                object = Class_46825.Method_46842(class_8601);
                String string3 = object[1724 & 4096];
                if (!(Class_17103.Method_17159(string3, "Content-Length") || Class_17103.Method_17159(string3, "Transfer-Encoding") || Class_17103.Method_17159(string3, "Trailer"))) {
                    class_46406.Method_44422().Method_17129(string3, object[16469 & -20989]);
                }
                string = string3;
            } while ((class_8601 = this.Field_46836.Method_37090(class_22553)).Method_8608() > 0);
            return class_46406;
        }
        return Class_44416.Field_44417;
    }

    private long Method_46853() {
        if (this.Field_46837 == (-9223372036842716684L & -4557252329673252350L)) {
            this.Field_46837 = Class_17103.Method_17142(this.Field_46834, -1L & -1L);
        }
        return this.Field_46837;
    }

    static int Method_46854(Class_46825 class_46825) {
        int n = class_46825.Field_46835;
        class_46825.Field_46835 = n + (29121 & 515);
        return n;
    }

    private Class_32692 Method_46855(Exception exception) {
        this.checkpoint((Object)((Object)Class_14530.Field_14542));
        if (this.Field_46834 != null) {
            this.Field_46834.setDecoderResult(Class_20385.Method_20392(exception));
        } else {
            this.Field_46834 = this.Method_46856();
            this.Field_46834.setDecoderResult(Class_20385.Method_20392(exception));
        }
        Class_32692 class_32692 = this.Field_46834;
        this.Field_46834 = null;
        return class_32692;
    }

    protected abstract Class_32692 Method_46856();

    static int Method_46857(Class_46825 class_46825) {
        return class_46825.Field_46835;
    }

    protected Class_46825(int n, int n2, int n3, boolean bl) {
        this(n, n2, n3, bl, (28681 & 1601) != 0);
    }

    private static int Method_46858(CharSequence charSequence, int n) {
        int n2;
        for (n2 = n; n2 < charSequence.length() && Character.isWhitespace(charSequence.charAt(n2)); ++n2) {
        }
        return n2;
    }

    protected abstract boolean Method_46859();

    protected void Method_46860(Class_39158 class_39158, Class_22553 class_22553, List list) {
        this.Method_46845(class_39158, class_22553, list);
        if (this.Field_46834 != null) {
            int n = this.Method_46859() ? 129 & 10257 : (this.Method_46853() > (113246339L & -748435579391934392L) ? 259 & 513 : 1026 & 997);
            this.Method_46840();
            if (n == 0) {
                list.add(Class_44416.Field_44417);
            }
        }
    }

    static int Method_46861(Class_46825 class_46825, int n) {
        class_46825.Field_46835 = n;
        return class_46825.Field_46835;
    }

    private Class_41723 Method_46862(Exception exception) {
        this.checkpoint((Object)((Object)Class_14530.Field_14542));
        Class_46406 class_46406 = new Class_46406(Class_16620.Field_16622);
        class_46406.setDecoderResult(Class_20385.Method_20392(exception));
        this.Field_46834 = null;
        return class_46406;
    }

    private void Method_46863() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

