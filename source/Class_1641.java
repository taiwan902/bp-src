/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_1641
extends Class_1490 {
    public String Field_1642;
    public Class_9780 Field_1643;
    private long Field_1644;
    public String Field_1645;
    private static final AtomicInteger Field_1646 = new AtomicInteger(24616 & 448);
    public Class_6816 Field_1647 = new Class_6816();
    private Class_44584 Field_1648;
    private static final Logger Field_1649 = LogManager.getLogger();
    private final Class_1490 Field_1650;
    private boolean Field_1651;
    private String Field_1652 = null;
    private String Field_1653 = "";
    private Class_15474 Field_1654;

    public void Method_1655() {
        this.\u0000strictfp.clear();
        this.\u0000strictfp.add(new Class_42376(-4094 & 3189, this.\u0000= final / (16402 & -27550) - (5476 & 119), this.\u0000, ` / (25092 & 6422) + (16505 & 3966) + (558 & -32691), Class_9802.Method_9806("gui.cancel", new Object[8385 & 16650]) + " (" + this.Method_1656() + ")"));
        this.Field_1653 = Class_9802.Method_9806("gui.cancel", new Object[2942 & 12416]);
    }

    private String Method_1656() {
        return this.Method_1660() / (1765835753L & 3974759513940960234L) + "s";
    }

    static Class_44584 Method_1657(Class_1641 class_1641) {
        return class_1641.Field_1648;
    }

    public Class_1641(Class_1490 class_1490, Class_18 class_18, Class_15474 class_15474) {
        this.\u0000strictfp = class_18;
        this.Field_1654 = class_15474;
        this.Field_1650 = class_1490;
        Class_15411 class_15411 = Class_15411.Method_15414(class_15474.Field_15484);
        class_18.Method_199(null);
        class_18.Method_153(class_15474);
        this.Method_1668(class_15411.Method_15418(), class_15411.Method_15416());
        this.Field_1644 = System.currentTimeMillis();
    }

    static Logger Method_1658() {
        return Field_1649;
    }

    private void Method_1659() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1641(Class_1490 class_1490, Class_18 class_18, String string, String string2, Class_9780 class_9780) {
        this.\u0000strictfp = class_18;
        this.Field_1650 = class_1490;
        class_18.Method_199(null);
        this.Field_1642 = string;
        this.Field_1645 = string2;
        this.Field_1643 = class_9780;
        this.Method_1668("", 4112 & 10368);
    }

    public long Method_1660() {
        return (141334413L & -7035311296621694072L) - (System.currentTimeMillis() - this.Field_1644);
    }

    public void Method_1661() {
        if (this.Field_1648 != null) {
            if (this.Field_1648.Method_44604()) {
                this.Field_1648.Method_44631();
            } else {
                this.Field_1648.Method_44605();
            }
        }
    }

    public Class_1641(Class_1490 class_1490, Class_18 class_18, String string, int n) {
        this.\u0000strictfp = class_18;
        this.Field_1650 = class_1490;
        class_18.Method_199(null);
        this.Method_1668(string, n);
        this.Field_1644 = System.currentTimeMillis();
    }

    protected void Method_1662(Class_42376 class_42376) {
        if (class_42376.Field_42392 == 0) {
            if (this.Method_1660() > (17041032L & 1626898467L)) {
                return;
            }
            this.Field_1651 = 9355 & -26319;
            if (this.Field_1648 != null) {
                this.Field_1648.Method_44622(new Class_2840("Aborted"));
            }
            Class_18.Field_60 = 2581 & 4128;
            this.\u0000strictfp.Method_218(this.Field_1650);
        }
    }

    static Class_15474 Method_1663(Class_1641 class_1641) {
        return class_1641.Field_1654;
    }

    static String Method_1664(Class_1641 class_1641, String string) {
        class_1641.Field_1652 = string;
        return class_1641.Field_1652;
    }

    protected void Method_1665(char c, int n) {
    }

    static Class_1490 Method_1666(Class_1641 class_1641) {
        return class_1641.Field_1650;
    }

    public static boolean Method_1667(String string) {
        try {
            URL uRL = new URL("https://api.mojang.com/users/profiles/minecraft/" + URLEncoder.encode(string, "UTF-8"));
            HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(23420 & 7129);
            httpURLConnection.setReadTimeout(10064 & 12050);
            int n = httpURLConnection.getResponseCode();
            byte[] arrby = IOUtils.toByteArray((InputStream)httpURLConnection.getInputStream());
            httpURLConnection.disconnect();
            if (n == (-3892 & 200)) {
                if (new String(arrby, StandardCharsets.UTF_8).contains("name")) {
                    return (24837 & -31613) != 0;
                }
                return (-32720 & 28162) != 0;
            }
            if (n == (1260 & 23246)) {
                return (-32764 & 5883) != 0;
            }
            throw new IOException("Reponse code != 200");
        }
        catch (MalformedURLException malformedURLException) {
            throw malformedURLException;
        }
        catch (IOException iOException) {
            throw iOException;
        }
    }

    private void Method_1668(String string, int n) {
        String string2;
        String string3 = string2 = this.Field_1654 == null ? "" : this.Field_1654.Field_15484;
        if (this.Field_1654 != null) {
            Field_1649.info("Connecting to (" + string2 + ")" + string + ", " + n);
        }
        Class_30934.Method_30941().Method_30948(new Class_24976(string2, string, n), 12050 & -6311, new Class_32489(this, string, n));
    }

    static Class_44584 Method_1669(Class_1641 class_1641, Class_44584 class_44584) {
        class_1641.Field_1648 = class_44584;
        return class_1641.Field_1648;
    }

    public void Method_1670(int n, int n2, float f) {
        this.\u0000, 2();
        int n3 = this.Field_1647.Method_6820();
        boolean bl = "pl_PL".equals(Class_9802.Method_9806("language.code", new Object[-10872 & 50]));
        String string = n3 == 0 ? (bl ? "BP: Weryfikowanie..." : "BP: Verifying...") : (n3 == (-32759 & 19733) ? Class_9802.Method_9806("connect.connecting", new Object[16 & 28675]) : (n3 == (-7770 & 5203) ? (bl ? "Sprawdzanie premium..." : "Checking premium...") : (n3 == (16419 & 131) ? (bl ? "Wywolywanie hosta..." : "Dial...") : (n3 == (-31691 & 2564) ? (bl ? "Wyslano handshake..." : "Handshake sent...") : (n3 == (-30515 & 28981) ? (bl ? "Informowanie Mojang API..." : "Mojang API join...") : (n3 == (13750 & -30714) ? (bl ? "Zaszyfrowano, oczekiwanie na 'sukces'..." : "Encryption set, waiting for 'success'...") : (n3 == (-28089 & 31) ? (bl ? "Oczekiwanie na 'joingame'..." : "Waiting for 'join game'...") : (n3 == (-31736 & 12732) ? (bl ? "Oczekiwanie na teleportacje..." : "Waiting for teleport...") : (n3 == (532 & 55) ? "Mojang API SYN/ACK..." : (n3 == (17173 & -32683) ? (bl ? "Wysylanie POST do API Mojangu..." : "Writing Mojang API POST...") : (n3 == (22 & -15874) ? (bl ? "Czytanie API Mojangu..." : "Mojang API read...") : (n3 == (18615 & -24041) ? "Mojang API success..." : (n3 == (124 & 27290) ? "Mojang API error..." : (n3 == (4383 & -13794) ? (bl ? "Sprawdzanie domeny..." : "Resolving domain...") : (this.Field_1652 != null ? this.Field_1652 : Class_9802.Method_9806("connect.authorizing", new Object[-32760 & 7360]))))))))))))))));
        this.\u0000strictfp(this.\u0000strictfp, string, this.\u0000= final / (-28538 & 2626), this.\u0000, ` / (2335 & -31230) - (1082 & -24138), 553648127 & -1996488705);
        if (!this.Field_1651 && !this.\u0000strictfp.isEmpty()) {
            if (this.Method_1660() <= (262673L & 3224884453693451558L)) {
                ((Class_42376)this.\u0000strictfp.get((int)(2092 & -28672))).Field_42381 = this.Field_1653;
                ((Class_42376)this.\u0000strictfp.get((int)(-3198 & 3096))).Field_42388 = 16641 & 2049;
            } else {
                ((Class_42376)this.\u0000strictfp.get((int)(1024 & 6284))).Field_42381 = this.Field_1653 + " (" + this.Method_1656() + ")";
                ((Class_42376)this.\u0000strictfp.get((int)(6714 & 9473))).Field_42388 = 2724 & 16457;
            }
        }
        super.Method_1545(n, n2, f);
    }

    public boolean Method_1671() {
        return (this.\u0000strictfp.Field_36 == this ? -32381 & 2153 : 16642 & -24428) != 0;
    }

    static boolean Method_1672(Class_1641 class_1641) {
        return class_1641.Field_1651;
    }

    static AtomicInteger Method_1673() {
        return Field_1646;
    }
}

