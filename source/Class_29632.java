/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class_29632
extends Thread {
    final Class_32489 Field_29633;
    final Class_29733 Field_29634;

    Class_29632(Class_32489 class_32489, String string, Class_29733 class_29733) {
        this.Field_29633 = class_32489;
        this.Field_29634 = class_29733;
        super(string);
    }

    public void Method_29635() {
        InetAddress inetAddress = null;
        int n = 1221 & 8192;
        int n2 = 648 & 8448;
        int n3 = 16416 & 4754;
        n2 = 8336 & 3876;
        ++n;
        try {
            Object object;
            if (Class_1641.Method_1672(this.Field_29633.Field_32492)) {
                return;
            }
            if (this.Field_29634.Field_29735) {
                object = this.Field_29634.Method_29761();
                if (object != null) {
                    inetAddress = InetAddress.getByName(((Class_18731)object).Field_18733);
                    n2 = 12325 & 73;
                } else if (this.Field_29633.Field_32492.Method_1671()) {
                    this.Field_29633.Field_32492.\u0000strictfp.Method_218(new Class_20136(Class_1641.Method_1666(this.Field_29633.Field_32492), "connect.failed", new Class_2840("Cannot connect with server! (tried  " + n + "x)")));
                }
            } else {
                inetAddress = InetAddress.getByName(this.Field_29633.Field_32491);
            }
            if (this.Field_29634.Method_29789()) {
                Class_18.Field_60 = -28535 & 1045;
                if (this.Field_29634.Method_29767()) {
                    int n4;
                    if (this.Field_29633.Field_32492.\u0000strictfp.Field_62 != null) {
                        n4 = this.Field_29633.Field_32492.\u0000strictfp.Field_62 != false ? 17349 & 4139 : -18172 & 155;
                    } else {
                        this.Field_29633.Field_32492.Field_1647.Method_6822(5218 & 262);
                        try {
                            boolean bl = Class_1641.Method_1667(this.Field_29633.Field_32492.\u0000strictfp.Method_265().Method_2116());
                            this.Field_29633.Field_32492.\u0000strictfp.Field_62 = bl;
                            n4 = this.Field_29633.Field_32492.\u0000strictfp.Field_62 != false ? 1057 & 17043 : -31077 & 256;
                        }
                        catch (Throwable throwable) {
                            n4 = 16387 & 8278;
                        }
                        this.Field_29633.Field_32492.Field_1647.Method_6822(73 & 25473);
                    }
                    object = n4 == 0 ? this.Field_29633.Field_32491 + "\u0000BlazingPackNonPremium" : (n4 == (2067 & 26249) ? this.Field_29633.Field_32491 + "\u0000BlazingPackPremium" : this.Field_29633.Field_32491 + "\u0000BlazingPackErrorPremium");
                } else {
                    object = this.Field_29633.Field_32491 + "\u0000BlazingPack";
                }
            } else {
                object = this.Field_29633.Field_32491;
            }
            Class_1641.Method_1669(this.Field_29633.Field_32492, Class_44584.Method_44618(inetAddress, this.Field_29633.Field_32490, this.Field_29633.Field_32492.\u0000strictfp.Field_84.Method_39899(), (16393 & -32733) != 0, this.Field_29634, this.Field_29633.Field_32492.Field_1647, (1289 & -8187) != 0));
            Class_1641.Method_1657((Class_1641)this.Field_29633.Field_32492).Field_44593 = this.Field_29633.Field_32492.Field_1647;
            Class_1641.Method_1657(this.Field_29633.Field_32492).Method_44630(new Class_26487(Class_1641.Method_1657(this.Field_29633.Field_32492), this.Field_29633.Field_32492.\u0000strictfp, Class_1641.Method_1666(this.Field_29633.Field_32492)));
            Class_1641.Method_1657(this.Field_29633.Field_32492).Method_44629(new Class_36280(-7377 & 47, (String)object, this.Field_29633.Field_32490, Class_11271.Field_11282));
            Class_1641.Method_1657(this.Field_29633.Field_32492).Method_44629(new Class_27421(this.Field_29633.Field_32492.\u0000strictfp.Method_265().Method_2117(), this.Field_29634.Field_29749));
        }
        catch (UnknownHostException unknownHostException) {
            Class_18.Field_60 = 580 & -23422;
            if (Class_1641.Method_1672(this.Field_29633.Field_32492)) {
                return;
            }
            Class_1641.Method_1658().error("Couldn't connect to server", (Throwable)unknownHostException);
            if (this.Field_29633.Field_32492.Method_1671()) {
                Object[] arrobject = new Object[8725 & 5281];
                arrobject[6160 & 24582] = "Unknown host";
                this.Field_29633.Field_32492.\u0000strictfp.Method_218(new Class_20136(Class_1641.Method_1666(this.Field_29633.Field_32492), "connect.failed", new Class_2849("disconnect.genericReason", arrobject)));
            }
        }
        catch (Exception exception) {
            Class_18.Field_60 = -14320 & 8193;
            if (Class_1641.Method_1672(this.Field_29633.Field_32492)) {
                return;
            }
            Class_1641.Method_1658().error("Couldn't connect to server", (Throwable)exception);
            String string = exception.toString();
            if (inetAddress != null) {
                String string2 = inetAddress.toString() + ":" + this.Field_29633.Field_32490;
                string = string.replaceAll(string2, "");
            }
            if (this.Field_29633.Field_32492.Method_1671()) {
                if (exception instanceof Class_12190) {
                    this.Field_29633.Field_32492.\u0000strictfp.Method_218(new Class_20136(Class_1641.Method_1666(this.Field_29633.Field_32492), "connect.failed", new Class_2849("disconnect.timeout", new Object[4772 & 8450])));
                } else if (exception instanceof ConnectException || exception instanceof SocketException) {
                    Object[] arrobject = new Object[2637 & -32351];
                    arrobject[5888 & -24564] = string;
                    this.Field_29633.Field_32492.\u0000strictfp.Method_218(new Class_20136(Class_1641.Method_1666(this.Field_29633.Field_32492), "connect.failed", new Class_2849("disconnect.genericReason", arrobject)));
                }
            }
            try {
                Thread.sleep(8868258701283251145L & -8868258702568180854L);
            }
            catch (InterruptedException interruptedException) {
                Logger.getLogger(Class_1641.class.getName()).log(Level.SEVERE, null, interruptedException);
            }
        }
    }

    private void Method_29636() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

