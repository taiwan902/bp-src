/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  internal.org.lwjgl.input.Keyboard
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import internal.org.lwjgl.input.Keyboard;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_27772
extends Class_1490
implements Class_1549 {
    private static final Logger Field_27773 = LogManager.getLogger();
    private boolean Field_27774;
    private Class_19711 Field_27775;
    private boolean Field_27776;
    private boolean Field_27777;
    private boolean Field_27778 = 24576 & 3154;
    private boolean Field_27779;
    private Class_42376 Field_27780;
    private boolean Field_27781;
    private Class_46127 Field_27782;
    private final Class_29456 Field_27783 = new Class_29456();
    private Class_1490 Field_27784;
    private String Field_27785;
    private Class_42376 Field_27786;
    private Class_15474 Field_27787;
    private Class_31105 Field_27788;
    private Class_22674 Field_27789;
    private Class_42376 Field_27790;

    protected void Method_27791(char c, int n) {
        Class_14246 class_14246;
        int n2 = this.Field_27782.Method_46138();
        Class_14246 class_142462 = class_14246 = n2 < 0 ? null : this.Field_27782.Method_46135(n2);
        if (n == (575 & 3199)) {
            this.Method_27801();
        } else if (n2 >= 0) {
            if (n == (-32551 & 3272)) {
                if (Class_27772.\u0000
                ()) {
                    if (n2 > 0 && class_14246 instanceof Class_20310) {
                        Class_20310 class_20310 = (Class_20310)class_14246;
                        Class_20310 class_203102 = (Class_20310)this.Field_27782.Method_46135(n2 - (8841 & 22597));
                        this.Method_27808(this.Field_27782.Method_46138() - (25109 & -32479));
                        this.Field_27782.\u0000, `(-this.Field_27782.\u0000= int());
                        this.Field_27782.Method_46137(this.Field_27789);
                    }
                } else if (n2 > 0) {
                    this.Method_27808(this.Field_27782.Method_46138() - (-30569 & 4161));
                    this.Field_27782.\u0000, `(-this.Field_27782.\u0000= int());
                    if (this.Field_27782.Method_46135(this.Field_27782.Method_46138()) instanceof Class_15466) {
                        if (this.Field_27782.Method_46138() > 0) {
                            this.Method_27808(this.Field_27782.Method_46133() - (-14975 & 4169));
                            this.Field_27782.\u0000, `(-this.Field_27782.\u0000= int());
                        } else {
                            this.Method_27808(-1 & -1);
                        }
                    }
                } else {
                    this.Method_27808(-1 & -1);
                }
            } else if (n == (216 & 18385)) {
                if (Class_27772.\u0000
                ()) {
                    if (n2 < this.Field_27789.Method_22685() - (24697 & 2821) && class_14246 instanceof Class_20310) {
                        Class_20310 class_20310 = (Class_20310)class_14246;
                        Class_20310 class_203103 = (Class_20310)this.Field_27782.Method_46135(n2 + (-32751 & 9761));
                        this.Method_27808(n2 + (16389 & 5443));
                        this.Field_27782.\u0000, `(this.Field_27782.\u0000= int());
                        this.Field_27782.Method_46137(this.Field_27789);
                    }
                } else if (n2 < this.Field_27782.Method_46133()) {
                    this.Method_27808(this.Field_27782.Method_46138() + (8201 & 19249));
                    this.Field_27782.\u0000, `(this.Field_27782.\u0000= int());
                    if (this.Field_27782.Method_46135(this.Field_27782.Method_46138()) instanceof Class_15466) {
                        if (this.Field_27782.Method_46138() < this.Field_27782.Method_46133() - (-11007 & 8227)) {
                            this.Method_27808(this.Field_27782.Method_46133() + (18563 & -32755));
                            this.Field_27782.\u0000, `(this.Field_27782.\u0000= int());
                        } else {
                            this.Method_27808(-1 & -1);
                        }
                    }
                } else {
                    this.Method_27808(-1 & -1);
                }
            } else if (n != (956 & 28) && n != (-31332 & 2206)) {
                super.Method_1525(c, n);
            } else {
                this.Method_27804((Class_42376)this.\u0000strictfp.get(-3934 & 1090));
            }
        } else {
            super.Method_1525(c, n);
        }
    }

    public void Method_27792(boolean bl, int n) {
        Class_14246 class_14246;
        Class_14246 class_142462 = class_14246 = this.Field_27782.Method_46138() < 0 ? null : this.Field_27782.Method_46135(this.Field_27782.Method_46138());
        if (this.Field_27774) {
            this.Field_27774 = 12458 & -31484;
            if (bl && class_14246 instanceof Class_20310) {
                this.Field_27789.Method_22679(((Class_20310)class_14246).Field_20317);
                this.Field_27789.Method_22686();
                this.Field_27782.Method_46134(-1 & -1);
                this.Field_27782.Method_46137(this.Field_27789);
            }
            this.\u0000strictfp.Method_218(this);
        } else if (this.Field_27779) {
            this.Field_27779 = 439 & -31744;
            if (bl) {
                this.Method_27805(this.Field_27787);
            } else {
                this.\u0000strictfp.Method_218(this);
            }
        } else if (this.Field_27777) {
            this.Field_27777 = 9472 & -30523;
            if (bl) {
                this.Field_27789.Method_22688(this.Field_27787);
                this.Field_27789.Method_22686();
                this.Field_27782.Method_46134(-1 & -1);
                this.Field_27782.Method_46137(this.Field_27789);
            }
            this.\u0000strictfp.Method_218(this);
        } else if (this.Field_27776) {
            this.Field_27776 = 12807 & 2528;
            if (bl && class_14246 instanceof Class_20310) {
                Class_15474 class_15474 = ((Class_20310)class_14246).Method_20338();
                class_15474.Field_15482 = this.Field_27787.Field_15482;
                class_15474.Field_15484 = this.Field_27787.Field_15484;
                class_15474.Method_15495(this.Field_27787);
                this.Field_27789.Method_22686();
                this.Field_27782.Method_46137(this.Field_27789);
            }
            this.\u0000strictfp.Method_218(this);
        }
    }

    public boolean Method_27793(Class_20310 class_20310, int n) {
        return (n > 0 ? 13739 & 16453 : 19482 & 4677) != 0;
    }

    public Class_22674 Method_27794() {
        return this.Field_27789;
    }

    public void Method_27795() {
        Keyboard.enableRepeatEvents((3081 & 8912) != 0);
        if (this.Field_27788 != null) {
            this.Field_27788.interrupt();
            this.Field_27788 = null;
        }
        this.Field_27783.Method_29464();
    }

    public void Method_27796() {
        Class_14246 class_14246;
        if (this.Field_27778) {
            return;
        }
        this.Field_27778 = -15939 & 14915;
        Class_14246 class_142462 = class_14246 = this.Field_27782.Method_46138() < 0 ? null : this.Field_27782.Method_46135(this.Field_27782.Method_46138());
        if (class_14246 instanceof Class_20310) {
            Class_15474 class_15474 = ((Class_20310)class_14246).Method_20338();
            if (class_15474.Method_15510() && !class_15474.Method_15505()) {
                class_15474.Method_15503((525 & 18563) != 0);
                this.Field_27789.Method_22686();
            }
            this.Method_27805(class_15474);
        } else if (class_14246 instanceof Class_32533) {
            Class_32525 class_32525 = ((Class_32533)class_14246).Method_32538();
            this.Method_27805(new Class_15474(class_32525.Method_32529(), class_32525.Method_32532(), (16485 & 9875) != 0));
        }
    }

    protected void Method_27797(int n, int n2, int n3) {
        super.Method_1518(n, n2, n3);
        this.Field_27782.\u0000strictfp(n, n2, n3);
    }

    public void Method_27798() {
        super.Method_1544();
        this.Field_27782.\u0000, for();
    }

    public void Method_27799() {
        super.Method_1517();
        if (this.Field_27775.Method_19716()) {
            List list = this.Field_27775.Method_19717();
            this.Field_27775.Method_19715();
            this.Field_27782.Method_46136(list);
        }
        this.Field_27783.Method_29461();
    }

    public Class_29456 Method_27800() {
        return this.Field_27783;
    }

    public void Method_27801() {
        this.Field_27781 = 23564 & 512;
        this.Method_27807();
    }

    public void Method_27802(String string) {
        this.Field_27785 = string;
    }

    public Class_27772(Class_1490 class_1490) {
        this.Field_27784 = class_1490;
    }

    public Class_46127 Method_27803() {
        return this.Field_27782;
    }

    protected void Method_27804(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            Class_14246 class_14246;
            Class_14246 class_142462 = class_14246 = this.Field_27782.Method_46138() < 0 ? null : this.Field_27782.Method_46135(this.Field_27782.Method_46138());
            if (class_42376.Field_42392 == (4103 & 27618) && class_14246 instanceof Class_20310) {
                String string = ((Class_20310)class_14246).Method_20338().Field_15482;
                if (string != null) {
                    this.Field_27774 = -14735 & 12679;
                    String string2 = Class_9802.Method_9806("selectServer.deleteQuestion", new Object[24580 & 3113]);
                    String string3 = "'" + string + "' " + Class_9802.Method_9806("selectServer.deleteWarning", new Object[10240 & -12288]);
                    String string4 = Class_9802.Method_9806("selectServer.deleteButton", new Object[192 & -32750]);
                    String string5 = Class_9802.Method_9806("gui.cancel", new Object[17184 & -23552]);
                    Class_1792 class_1792 = new Class_1792(this, string2, string3, string4, string5, this.Field_27782.Method_46138());
                    this.\u0000strictfp.Method_218(class_1792);
                }
            } else if (class_42376.Field_42392 == (17681 & -24507)) {
                this.Method_27796();
            } else if (class_42376.Field_42392 == (6214 & -30931)) {
                this.Field_27779 = 537 & -31359;
                this.Field_27787 = new Class_15474(Class_9802.Method_9806("selectServer.defaultName", new Object[-17856 & 16512]), "", (20600 & 8193) != 0);
                this.\u0000strictfp.Method_218(new Class_17912(this, this.Field_27787));
            } else if (class_42376.Field_42392 == (16915 & 8611)) {
                this.Field_27777 = -27647 & 353;
                this.Field_27787 = new Class_15474(Class_9802.Method_9806("selectServer.defaultName", new Object[10644 & 16960]), "", (1472 & 26) != 0);
                this.\u0000strictfp.Method_218(new Class_20150(this, this.Field_27787));
            } else if (class_42376.Field_42392 == (-19817 & 103) && class_14246 instanceof Class_20310) {
                this.Field_27776 = -20399 & 175;
                Class_15474 class_15474 = ((Class_20310)class_14246).Method_20338();
                this.Field_27787 = new Class_15474(class_15474.Field_15482, class_15474.Field_15484, (9384 & 2323) != 0);
                this.Field_27787.Method_15495(class_15474);
                this.\u0000strictfp.Method_218(new Class_20150(this, this.Field_27787));
            } else if (class_42376.Field_42392 == 0) {
                this.\u0000strictfp.Method_218(this.Field_27784);
            } else if (class_42376.Field_42392 == (16655 & 15368)) {
                this.Method_27801();
            }
        }
    }

    private void Method_27805(Class_15474 class_15474) {
        this.\u0000strictfp.Method_218(new Class_1641(this, this.\u0000strictfp, class_15474));
    }

    private void Method_27806() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_27807() {
        this.Field_27778 = 12490 & -15856;
        Keyboard.enableRepeatEvents((129 & 4415) != 0);
        this.\u0000strictfp.clear();
        if (!this.Field_27781) {
            this.Field_27781 = 2217 & 16385;
            this.Field_27789 = new Class_22674(this.\u0000strictfp);
            this.Field_27789.Method_22684();
            this.Field_27775 = new Class_19711();
            try {
                this.Field_27788 = new Class_31105(this.Field_27775);
                this.Field_27788.start();
            }
            catch (Exception exception) {
                Field_27773.warn("Unable to start LAN server detection: " + exception.getMessage());
            }
            if (this.Field_27782 == null) {
                this.Field_27782 = new Class_46127(this, this.\u0000strictfp, this.\u0000= final, this.\u0000, `, -29280 & 545, this.\u0000, ` - (-32172 & 10312), 1270 & 549);
            } else {
                this.Field_27782.\u0000strictfp(this.\u0000= final, this.\u0000, `, -31700 & 12640, this.\u0000, ` - (13120 & 3152));
            }
            this.Field_27782.Method_46137(this.Field_27789);
        } else {
            this.Field_27782.\u0000strictfp(this.\u0000= final, this.\u0000, `, 800 & -10206, this.\u0000, ` - (1088 & 16714));
        }
        this.Method_27810();
    }

    public void Method_27808(int n) {
        this.Field_27782.Method_46134(n);
        Class_14246 class_14246 = n < 0 ? null : this.Field_27782.Method_46135(n);
        this.Field_27790.Field_42388 = 3457 & 98;
        this.Field_27786.Field_42388 = 8784 & 2088;
        this.Field_27780.Field_42388 = 8224 & 18066;
        if (class_14246 != null && !(class_14246 instanceof Class_15466)) {
            this.Field_27790.Field_42388 = 2849 & 8193;
            if (class_14246 instanceof Class_20310) {
                if (((Class_20310)class_14246).Field_20324.Method_15510()) {
                    this.Field_27786.Field_42388 = 30720 & 18;
                    this.Field_27780.Field_42388 = 385 & 1066;
                } else {
                    this.Field_27786.Field_42388 = 12321 & 17673;
                    this.Field_27780.Field_42388 = 17201 & 5;
                }
            }
        }
    }

    protected void Method_27809(int n, int n2, int n3) {
        super.Method_1537(n, n2, n3);
        this.Field_27782.\u0000, `(n, n2, n3);
    }

    public void Method_27810() {
        this.Field_27786 = new Class_42376(8231 & 1295, this.\u0000= final / (8423 & 18434) - (8347 & 1182), this.\u0000, ` - (-16196 & 9820), 4711 & -5818, 277 & 1686, Class_9802.Method_9806("selectServer.edit", new Object[16596 & -22518]));
        this.\u0000strictfp.add(this.Field_27786);
        this.Field_27780 = new Class_42376(-16382 & 13482, this.\u0000= final / (-31725 & 17154) - (16714 & -29462), this.\u0000, ` - (3295 & 316), -5946 & 327, 5397 & 596, Class_9802.Method_9806("selectServer.delete", new Object[-30720 & 1664]));
        this.\u0000strictfp.add(this.Field_27780);
        this.Field_27790 = new Class_42376(14371 & 517, this.\u0000= final / (-6206 & 2054) - (-29542 & 218), this.\u0000, ` - (8564 & -10058), 2660 & -6809, 16414 & -23468, Class_9802.Method_9806("selectServer.select", new Object[-32448 & 8758]));
        this.\u0000strictfp.add(this.Field_27790);
        this.\u0000strictfp.add(new Class_42376(22612 & -31963, this.\u0000= final / (-30649 & 21554) - (24882 & 1151), this.\u0000, ` - (950 & -10188), 10341 & 20604, 19732 & 92, Class_9802.Method_9806("selectServer.direct", new Object[88 & -16381])));
        this.\u0000strictfp.add(new Class_42376(8323 & 1831, this.\u0000= final / (10506 & 1538) + (10308 & 1060) + (11314 & 20786), this.\u0000, ` - (24636 & 1590), 28404 & 100, 20 & 9748, Class_9802.Method_9806("selectServer.add", new Object[17969 & 8334])));
        this.\u0000strictfp.add(new Class_42376(12 & -30696, this.\u0000= final / (5370 & -24317) + (8773 & -11004), this.\u0000, ` - (5181 & 8286), 214 & 18022, 18455 & -31204, Class_9802.Method_9806("selectServer.refresh", new Object[9281 & 6146])));
        this.\u0000strictfp.add(new Class_42376(-32511 & 8298, this.\u0000= final / (578 & 17802) + (2332 & 21124) + (8798 & 17484), this.\u0000, ` - (20508 & 2172), 2127 & 17003, 12060 & -28458, Class_9802.Method_9806("gui.cancel", new Object[4150 & 18753])));
        this.Method_27808(this.Field_27782.Method_46138());
    }

    public boolean Method_27811(Class_20310 class_20310, int n) {
        return (n < this.Field_27789.Method_22685() - (-32765 & 225) ? 935 & -27647 : 256 & -24057) != 0;
    }

    public void Method_27812(int n, int n2, float f) {
        this.Field_27785 = null;
        this.\u0000, 2();
        this.Field_27782.\u0000strictfp(n, n2, f);
        this.\u0000strictfp(this.\u0000strictfp, Class_9802.Method_9806("multiplayer.title", new Object[24705 & 526]), this.\u0000= final / (-32197 & 7554), 12340 & -31714, 1694498815 & 150994943);
        super.Method_1545(n, n2, f);
        if (this.Field_27785 != null) {
            this.\u0000strictfp((List)Lists.newArrayList((Iterable)Splitter.on((String)"\n").split((CharSequence)this.Field_27785)), n, n2);
        }
    }
}

