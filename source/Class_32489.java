/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;
import java.util.concurrent.TimeoutException;

public class Class_32489
extends Class_21665 {
    final int Field_32490;
    final String Field_32491;
    final Class_1641 Field_32492;

    public void Method_32493(Class_24929 class_24929) {
        if (this.Field_32492.\u0000strictfp.Field_48 != null && Class_1641.Method_1663(this.Field_32492) != null) {
            return;
        }
        if (class_24929 == null) {
            Class_1641.Method_1658().error("Couldn't connect to server", (Throwable)new TimeoutException());
            if (this.Field_32492.Method_1671()) {
                Object[] arrobject = new Object[4131 & 645];
                arrobject[12483 & 52] = "Couldn't connect to server";
                this.Field_32492.\u0000strictfp.Method_218(new Class_20136(Class_1641.Method_1666(this.Field_32492), "connect.failed", new Class_2849("connect.failed", arrobject)));
            }
            return;
        }
        Class_29733 class_29733 = (Class_29733)class_24929;
        if (class_29733.Field_29736 != null) {
            Class_14775.Field_14780 = new Class_14775(class_29733.Field_29736);
        }
        if (class_29733.Method_29796()) {
            this.Field_32492.\u0000strictfp.Method_218(new Class_20136(Class_1641.Method_1666(this.Field_32492), "connect.failed", new Class_2840(class_29733.Method_29786())));
            return;
        }
        if (Class_1641.Method_1663(this.Field_32492) == null) {
            Object object;
            Object object2;
            Class_26655 class_26655 = this.Field_32492.\u0000strictfp.Field_81.Method_2048(this.Field_32492.Field_1642, (-31663 & 256) != 0);
            Class_31717 class_31717 = class_26655.Method_26657();
            if (class_31717 == null && this.Field_32492.Field_1643 != null) {
                class_31717 = new Class_31717(this.Field_32492.Field_1643, this.Field_32492.Field_1642);
                class_26655.Method_26664(class_31717);
            }
            if (this.Field_32492.Field_1643 == null) {
                this.Field_32492.Field_1643 = new Class_9780(class_31717);
            }
            try {
                this.Field_32492.\u0000strictfp.Field_137 = new Class_3013(this.Field_32492.\u0000strictfp, this.Field_32492.Field_1642, this.Field_32492.Field_1645, this.Field_32492.Field_1643);
                this.Field_32492.\u0000strictfp.Field_137.\u0000
                ();
                this.Field_32492.\u0000strictfp.Field_20 = 1 & 3473;
            }
            catch (Throwable throwable) {
                Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Starting integrated server");
                Class_13220 class_13220 = class_13268.Method_13280("Starting integrated server");
                class_13220.Method_13231("Level ID", this.Field_32492.Field_1642);
                class_13220.Method_13231("Level Name", this.Field_32492.Field_1645);
                throw new Class_1809(class_13268);
            }
            this.Field_32492.Field_1647.Field_6817 = -1 & -1;
            Class_1641.Method_1664(this.Field_32492, Class_9802.Method_9806("menu.loadingLevel", new Object[2306 & -32743]));
            while (!this.Field_32492.\u0000strictfp.Field_137.\u0000%()) {
                object2 = this.Field_32492.\u0000strictfp.Field_137.\u0000= switch();
                if (object2 != null) {
                    String string;
                    if (this.Field_32492.\u0000strictfp.Field_137.\u0000strictfp != null) {
                        Object[] arrobject = new Object[1283 & 2577];
                        arrobject[16464 & 8457] = this.Field_32492.\u0000strictfp.Field_137.\u0000strictfp;
                        string = String.format(" (%.2f%%)", arrobject);
                    } else {
                        string = "";
                    }
                    object = string;
                    Class_1641.Method_1664(this.Field_32492, Class_9802.Method_9806((String)object2, new Object[16768 & -18416]) + (String)object);
                } else {
                    Class_1641.Method_1664(this.Field_32492, "");
                }
                try {
                    Thread.sleep(1209144423L & 3343282812154823268L);
                }
                catch (InterruptedException interruptedException) {}
            }
            object2 = this.Field_32492.\u0000strictfp.Field_137.\u0000strictfp().Method_15023();
            object = Class_44584.Method_44625((SocketAddress)object2);
            ((Class_44584)object).Method_44630(new Class_26487((Class_44584)object, this.Field_32492.\u0000strictfp, null));
            ((Class_44584)object).Method_44629(new Class_36280(47 & 18495, object2.toString(), 520 & 32004, Class_11271.Field_11282));
            ((Class_44584)object).Method_44629(new Class_27421(this.Field_32492.\u0000strictfp.Method_265().Method_2117(), (64 & 12312) != 0));
            this.Field_32492.\u0000strictfp.Field_130 = object;
            return;
        }
        this.Field_32492.Field_1647.Method_6822(1349 & -16359);
        new Class_29632(this, "Server Connector #" + Class_1641.Method_1673().incrementAndGet(), class_29733).start();
    }

    Class_32489(Class_1641 class_1641, String string, int n) {
        this.Field_32492 = class_1641;
        this.Field_32491 = string;
        this.Field_32490 = n;
    }

    private void Method_32494() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

