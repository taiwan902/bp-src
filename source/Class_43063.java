/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.exceptions.InvalidCredentialsException
 *  com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.math.BigInteger;
import java.net.URI;
import java.util.List;
import java.util.Random;

public class Class_43063
extends Class_30038 {
    private String Field_43064;
    private final Class_1490 Field_43065;
    private String Field_43066;
    private long Field_43067;

    public Class_43063(Class_1490 class_1490) {
        this.Field_43065 = class_1490;
    }

    private void Method_43068(String string, long l) {
        this.Field_43066 = string;
        this.Field_43067 = System.currentTimeMillis() + l;
    }

    public void Method_43069(int n, int n2, float f) {
        this.\u0000, 2();
        this.\u0000strictfp(this.\u0000strictfp, this.Field_43064, this.\u0000= final / (-32710 & 3843), 2102 & 24789, 570425343 & 1090519039);
        if (this.Field_43066 != null) {
            this.\u0000strictfp(this.\u0000strictfp, this.Field_43066, this.\u0000= final / (18002 & -30589), this.\u0000, ` / (2086 & 5262) + (1660 & 24637), 83886079 & 553648127);
            if (System.currentTimeMillis() > this.Field_43067) {
                this.Field_43066 = null;
            }
        }
        super.\u0000strictfp(n, n2, f);
    }

    protected void Method_43070(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            if (class_42376.Field_42392 == (16600 & 5866)) {
                this.\u0000strictfp.Method_218(this.Field_43065);
            }
            if (class_42376.Field_42392 == (10746 & 4310)) {
                try {
                    String string = this.\u0000strictfp.Method_265().Method_2116();
                    String string2 = this.\u0000strictfp.Method_265().Method_2115().toString().replace("-", "");
                    String string3 = this.\u0000strictfp.Method_265().Method_2114();
                    Random random = new Random();
                    Random random2 = new Random(System.identityHashCode(new Object()));
                    BigInteger bigInteger = new BigInteger(5262 & 17056, random);
                    BigInteger bigInteger2 = new BigInteger(2440 & 5766, random2);
                    BigInteger bigInteger3 = bigInteger.xor(bigInteger2);
                    String string4 = bigInteger3.toString(786 & 8220);
                    this.\u0000strictfp.Method_141().joinServer(this.\u0000strictfp.Method_265().Method_2117(), string3, string4);
                    String string5 = "https://optifine.net/capeChange?u=" + string2 + "&n=" + string + "&s=" + string4;
                    this.\u0000strictfp(new URI(string5));
                    this.Method_43068("The OptiFine cape editor should open in a web browser.", 1418733360L & 534352L);
                }
                catch (InvalidCredentialsException invalidCredentialsException) {
                    Class_19426.Method_19611("Mojang authentication failed.", "Error: " + invalidCredentialsException.getMessage());
                    Class_19426.Method_19610("Mojang authentication failed");
                    Class_19426.Method_19610(((Object)((Object)invalidCredentialsException)).getClass().getName() + ": " + invalidCredentialsException.getMessage());
                }
                catch (Exception exception) {
                    Class_19426.Method_19610("Error opening OptiFine cape link");
                    Class_19426.Method_19610(exception.getClass().getName() + ": " + exception.getMessage());
                }
            }
            if (class_42376.Field_42392 == (10460 & -12067)) {
                this.Method_43068("The cape will be reloaded in 15 seconds.", -6721058613294073157L & 302004892L);
                if (this.\u0000strictfp.Field_48 != null) {
                    this.\u0000strictfp.Field_48.\u0000strictfp();
                }
            }
        }
    }

    public void Method_43071() {
        int n = -27264 & 8706;
        this.Field_43064 = "OptiFine Cape";
        this.\u0000strictfp.add(new Class_42376(16595 & 254, this.\u0000= final / (683 & -22510) - (1243 & 12699), this.\u0000, ` / (2566 & 29030) + (-32552 & 4124) * ((n += 2) >> (12997 & -15359)), 10998 & 20887, 16533 & -24298, "Open Cape Editor"));
        this.\u0000strictfp.add(new Class_42376(8924 & 221, this.\u0000= final / (7 & -28286) - (17083 & 6299) + (441 & -27484), this.\u0000, ` / (4134 & 2566) + (29720 & 571) * (n >> (-23799 & 16561)), 190 & 727, -32484 & 27159, "Reload Cape"));
        this.\u0000strictfp.add(new Class_42376(-32536 & 29401, this.\u0000= final / (27014 & 634) - (10341 & 5988), this.\u0000, ` / (398 & 551) + (4760 & 1118) * ((n += 8) >> (65 & 20533)), Class_9802.Method_9806("gui.done", new Object[4112 & 16428])));
    }

    private void Method_43072() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

