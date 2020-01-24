/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 *  com.google.common.base.Charsets
 *  com.mojang.authlib.GameProfile
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;
import java.nio.charset.Charset;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.SecretKey;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_30118
implements Class_5591,
Class_12050 {
    private String Field_30119 = "";
    private int Field_30120;
    private static final Logger Field_30121;
    private final Class_2457 Field_30122;
    private static final AtomicInteger Field_30123;
    private Class_26562 Field_30124 = Class_26562.Field_26568;
    private GameProfile Field_30125;
    private static final Random Field_30126;
    public final Class_44584 Field_30127;
    private SecretKey Field_30128;
    private final byte[] Field_30129 = new byte[-9468 & 1069];
    private \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true Field_30130;

    protected GameProfile Method_30131(GameProfile gameProfile) {
        UUID uUID = UUID.nameUUIDFromBytes(("OfflinePlayer:" + gameProfile.getName()).getBytes(Charsets.UTF_8));
        return new GameProfile(uUID, gameProfile.getName());
    }

    static SecretKey Method_30132(Class_30118 class_30118) {
        return class_30118.Field_30128;
    }

    public String Method_30133() {
        return this.Field_30125 != null ? this.Field_30125.toString() + " (" + this.Field_30127.Method_44612().toString() + ")" : String.valueOf(this.Field_30127.Method_44612());
    }

    static String Method_30134(Class_30118 class_30118) {
        return class_30118.Field_30119;
    }

    public void Method_30135() {
        \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2;
        if (this.Field_30124 == Class_26562.Field_26565) {
            this.Method_30140();
        } else if (this.Field_30124 == Class_26562.Field_26566 && (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 = this.Field_30122.Method_2616().Method_3112(this.Field_30125.getId())) == null) {
            this.Field_30124 = Class_26562.Field_26565;
            this.Field_30122.Method_2616().Method_3147(this.Field_30127, this.Field_30130);
            this.Field_30130 = null;
        }
        int n = this.Field_30120;
        this.Field_30120 = n + (8467 & -16351);
        if (n == (-32040 & 2651)) {
            this.Method_30142("Took too long to log in");
        }
    }

    static Class_26562 Method_30136(Class_30118 class_30118, Class_26562 class_26562) {
        class_30118.Field_30124 = class_26562;
        return class_30118.Field_30124;
    }

    static Logger Method_30137() {
        return Field_30121;
    }

    public void Method_30138(Class_1782 class_1782) {
        Field_30121.info(this.Method_30133() + " lost connection: " + class_1782.Method_1788());
    }

    public void Method_30139(Class_32180 class_32180) {
        Validate.validState((this.Field_30124 == Class_26562.Field_26569 ? -27581 & 2581 : 8450 & -30496) != 0, (String)"Unexpected key packet", (Object[])new Object[5120 & -31935]);
        PrivateKey privateKey = this.Field_30122.Method_2598().getPrivate();
        if (!Arrays.equals(this.Field_30129, class_32180.Method_32189(privateKey))) {
            throw new IllegalStateException("Invalid nonce!");
        }
        this.Field_30128 = class_32180.Method_32186(privateKey);
        this.Field_30124 = Class_26562.Field_26564;
        this.Field_30127.Method_44603(this.Field_30128);
        new Class_7786(this, "User Authenticator #" + Field_30123.incrementAndGet()).start();
    }

    public void Method_30140() {
        String string;
        if (!this.Field_30125.isComplete()) {
            this.Field_30125 = this.Method_30131(this.Field_30125);
        }
        if ((string = this.Field_30122.Method_2616().Method_3126(this.Field_30127.Method_44612(), this.Field_30125)) != null) {
            this.Method_30142(string);
        } else {
            this.Field_30124 = Class_26562.Field_26567;
            if (this.Field_30122.Method_2580() >= 0 && !this.Field_30127.Method_44609()) {
                this.Field_30127.Method_44606(new Class_22160(this.Field_30122.Method_2580()), new Class_22155(this), new Class_18600[24608 & 6088]);
            }
            this.Field_30127.Method_44629(new Class_32367(this.Field_30125));
            \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 = this.Field_30122.Method_2616().Method_3112(this.Field_30125.getId());
            if (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 != null) {
                this.Field_30124 = Class_26562.Field_26566;
                this.Field_30130 = this.Field_30122.Method_2616().Method_3139(this.Field_30125);
            } else {
                this.Field_30122.Method_2616().Method_3147(this.Field_30127, this.Field_30122.Method_2616().Method_3139(this.Field_30125));
            }
        }
    }

    static GameProfile Method_30141(Class_30118 class_30118, GameProfile gameProfile) {
        class_30118.Field_30125 = gameProfile;
        return class_30118.Field_30125;
    }

    public void Method_30142(String string) {
        try {
            Field_30121.info("Disconnecting " + this.Method_30133() + ": " + string);
            Class_2840 class_2840 = new Class_2840(string);
            this.Field_30127.Method_44629(new Class_27494(class_2840));
            this.Field_30127.Method_44622(class_2840);
        }
        catch (Exception exception) {
            Field_30121.error("Error whilst disconnecting player", (Throwable)exception);
        }
    }

    static GameProfile Method_30143(Class_30118 class_30118) {
        return class_30118.Field_30125;
    }

    public Class_30118(Class_2457 class_2457, Class_44584 class_44584) {
        this.Field_30122 = class_2457;
        this.Field_30127 = class_44584;
        Field_30126.nextBytes(this.Field_30129);
    }

    private void Method_30144() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static Class_2457 Method_30145(Class_30118 class_30118) {
        return class_30118.Field_30122;
    }

    static {
        Field_30123 = new AtomicInteger(32 & 2);
        Field_30121 = LogManager.getLogger();
        Field_30126 = new Random();
    }

    public void Method_30146(Class_27421 class_27421) {
        Validate.validState((this.Field_30124 == Class_26562.Field_26568 ? 1 & -16109 : 27649 & -32720) != 0, (String)"Unexpected hello packet", (Object[])new Object[28678 & 1600]);
        this.Field_30125 = class_27421.Method_27425();
        if (this.Field_30122.Method_2600() && !this.Field_30127.Method_44609()) {
            this.Field_30124 = Class_26562.Field_26569;
            this.Field_30127.Method_44629(new Class_24778(this.Field_30119, this.Field_30122.Method_2598().getPublic(), this.Field_30129));
        } else {
            this.Field_30124 = Class_26562.Field_26565;
        }
    }
}

