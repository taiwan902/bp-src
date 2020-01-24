/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  internal.org.lwjgl.input.Keyboard
 *  internal.org.lwjgl.input.Mouse
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  tv.twitch.chat.ChatUserInfo
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import internal.org.lwjgl.input.Keyboard;
import internal.org.lwjgl.input.Mouse;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tv.twitch.chat.ChatUserInfo;

public abstract class Class_1490
extends Class_1551
implements Class_1549 {
    private long Field_1491;
    private float Field_1492;
    public int Field_1493;
    protected List Field_1494 = Lists.newArrayList();
    public boolean Field_1495;
    protected Class_28636 Field_1496;
    private URI Field_1497;
    private static final Logger Field_1498 = LogManager.getLogger();
    private int Field_1499;
    private Class_42376 Field_1500;
    private int Field_1501;
    private static final Set Field_1502;
    private static final Splitter Field_1503;
    public Class_18 Field_1504;
    protected Class_44252 Field_1505;
    protected List Field_1506 = Lists.newArrayList();
    public int Field_1507;

    public void Method_1508(int n) {
        if (this.Field_1504.Field_72 != null) {
            if (((Boolean)this.Field_1504.Field_84.Field_39732.Field_8856.\u0000strictfp()).booleanValue()) {
                this.Field_1492 = (float)((double)this.Field_1492 + 0.7142857142857143 * 8.4 * this.Field_1504.Method_248().Field_2180);
                if (this.Field_1492 > 1.0f) {
                    this.Field_1492 = 1.0f;
                }
                int n2 = Class_14952.Method_14955((int)(this.Field_1492 * (0.4623656f * 475.81393f)), 2066 & -32743, 561 & 17424, -32712 & 17427);
                int n3 = Class_14952.Method_14955((int)(this.Field_1492 * (1.0769231f * 178.2857f)), 5212 & 19250, 27412 & -27631, 8336 & -32392);
                this.\u0000, `(388 & -32256, 9738 & 4144, this.Field_1507, this.Field_1493, n2, n3);
            } else {
                this.\u0000, `(-27648 & 1, 771 & 1092, this.Field_1507, this.Field_1493, -1072162795 & -1049587632, -803727330 & -724503120);
            }
        } else {
            this.Method_1541(n);
        }
    }

    protected void Method_1509(String string, boolean bl) {
    }

    public static boolean Method_1510() {
        return (Keyboard.isKeyDown((int)(686 & 5419)) || Keyboard.isKeyDown((int)(1151 & 6838)) ? 129 & -30719 : 260 & -30720) != 0;
    }

    protected void Method_1511(List list, int n, int n2) {
        if (!list.isEmpty()) {
            int n3;
            Class_16867.Method_16942();
            Class_39477.Method_39484();
            Class_16867.Method_16931();
            Class_16867.Method_16944();
            int n4 = 64 & -27638;
            for (String string : list) {
                n3 = this.Field_1496.Method_28715(string);
                if (n3 <= n4) continue;
                n4 = n3;
            }
            int n5 = n + (1420 & 2159);
            int n6 = n2 - (604 & 269);
            n3 = 329 & 10906;
            if (list.size() > (-24343 & 2561)) {
                n3 += (43 & 6534) + (list.size() - (10499 & 4689)) * (8875 & 5390);
            }
            if (n5 + n4 > this.Field_1507) {
                n5 -= (-15012 & 2079) + n4;
            }
            if (n6 + n3 + (16422 & 1366) > this.Field_1493) {
                n6 = this.Field_1493 - n3 - (14 & 30726);
            }
            this.\u0000strictfp = 1.0425532f * 287.7551f;
            this.Field_1505.Field_44259 = 0.8181818f * 366.66666f;
            int n7 = -183399911 & -133152714;
            this.\u0000, `(n5 - (20515 & 11), n6 - (-29676 & 12868), n5 + n4 + (8227 & 20295), n6 - (6147 & 399), n7, n7);
            this.\u0000, `(n5 - (7939 & 3), n6 + n3 + (1831 & 3), n5 + n4 + (4979 & -23545), n6 + n3 + (11284 & -32372), n7, n7);
            this.\u0000, `(n5 - (20743 & 1667), n6 - (6187 & 24967), n5 + n4 + (3 & 8323), n6 + n3 + (-32477 & 1539), n7, n7);
            this.\u0000, `(n5 - (17444 & 12317), n6 - (5039 & -15341), n5 - (16483 & 8455), n6 + n3 + (-15205 & 3), n7, n7);
            this.\u0000, `(n5 + n4 + (10795 & 17415), n6 - (-32521 & 267), n5 + n4 + (12 & 196), n6 + n3 + (12803 & 187), n7, n7);
            int n8 = 1364238591 & -791412225;
            int n9 = (n8 & (16776958 & 419364606)) >> (8199 & 33) | n8 & (-16701884 & -16646000);
            this.\u0000, `(n5 - (1159 & 20515), n6 - (12583 & 16395) + (-32063 & 1309), n5 - (24587 & 7095) + (4369 & 591), n6 + n3 + (16615 & 19) - (2177 & 16685), n8, n9);
            this.\u0000, `(n5 + n4 + (1283 & 2794), n6 - (-23477 & 16387) + (1281 & 28709), n5 + n4 + (-27517 & 7), n6 + n3 + (-19433 & 16579) - (-16123 & 579), n8, n9);
            this.\u0000, `(n5 - (1551 & 3), n6 - (179 & 25091), n5 + n4 + (-29661 & 17039), n6 - (12439 & 355) + (-26815 & 25), n8, n8);
            this.\u0000, `(n5 - (8851 & 3), n6 + n3 + (16742 & 4738), n5 + n4 + (-30237 & 16391), n6 + n3 + (8239 & -14317), n9, n9);
            for (int i = -22912 & 16470; i < list.size(); ++i) {
                String string = (String)list.get(i);
                this.Field_1496.Method_28729(string, n5, n6, -1 & -1);
                if (i == 0) {
                    n6 += 2;
                }
                n6 += 10;
            }
            this.\u0000strictfp = 0.0f;
            this.Field_1505.Field_44259 = 0.0f;
            Class_16867.Method_16918();
            Class_16867.Method_16927();
            Class_39477.Method_39482();
            Class_16867.Method_16957();
        }
    }

    public static boolean Method_1512(int n) {
        return (n == (10287 & 5487) && Class_1490.Method_1538() && !Class_1490.Method_1510() && !Class_1490.Method_1515() ? 9233 & -15985 : 3085 & 13072) != 0;
    }

    public void Method_1513() {
    }

    protected boolean Method_1514(Class_1782 class_1782) {
        if (class_1782 == null) {
            return (3934 & 129) != 0;
        }
        Class_21230 class_21230 = class_1782.Method_1789().Method_2913();
        if (Class_1490.Method_1510()) {
            if (class_1782.Method_1789().Method_2931() != null) {
                this.Method_1509(class_1782.Method_1789().Method_2931(), (8844 & -14013) != 0);
            }
        } else if (class_21230 != null) {
            block23 : {
                if (class_21230.Method_21236() == Class_17245.Field_17248) {
                    if (!this.Field_1504.Field_84.Field_39833) {
                        return (1284 & 6385) != 0;
                    }
                    try {
                        URI uRI = new URI(class_21230.Method_21237());
                        String string = uRI.getScheme();
                        if (string == null) {
                            throw new URISyntaxException(class_21230.Method_21237(), "Missing protocol");
                        }
                        if (!Field_1502.contains(string.toLowerCase())) {
                            throw new URISyntaxException(class_21230.Method_21237(), "Unsupported protocol: " + string.toLowerCase());
                        }
                        if (this.Field_1504.Field_84.Field_39783) {
                            this.Field_1497 = uRI;
                            this.Field_1504.Method_218(new Class_26170(this, class_21230.Method_21237(), 33461565 & -2049190279, (1200 & -7677) != 0));
                            break block23;
                        }
                        this.Method_1526(uRI);
                    }
                    catch (URISyntaxException uRISyntaxException) {
                        Field_1498.error("Can't open url for " + class_21230, (Throwable)uRISyntaxException);
                    }
                } else if (class_21230.Method_21236() == Class_17245.Field_17255) {
                    URI uRI = new File(class_21230.Method_21237()).toURI();
                    this.Method_1526(uRI);
                } else if (class_21230.Method_21236() == Class_17245.Field_17253) {
                    this.Method_1509(class_21230.Method_21237(), (-22399 & 4127) != 0);
                } else if (class_21230.Method_21236() == Class_17245.Field_17246) {
                    this.Method_1531(class_21230.Method_21237(), (-26579 & 464) != 0);
                } else if (class_21230.Method_21236() == Class_17245.Field_17251) {
                    ChatUserInfo chatUserInfo = this.Field_1504.Method_242().Method_1843(class_21230.Method_21237());
                    if (chatUserInfo != null) {
                        this.Field_1504.Method_218(new Class_45878(this.Field_1504.Method_242(), chatUserInfo));
                    } else {
                        Field_1498.error("Tried to handle twitch user but couldn't find them!");
                    }
                } else {
                    Field_1498.error("Don't know how to handle " + class_21230);
                }
            }
            return (-32671 & 273) != 0;
        }
        return (4289 & -24576) != 0;
    }

    public static boolean Method_1515() {
        return (Keyboard.isKeyDown((int)(-26562 & 56)) || Keyboard.isKeyDown((int)(8380 & 1530)) ? 3345 & -32119 : 18 & -7520) != 0;
    }

    public void Method_1516() {
        if (Keyboard.getEventKeyState()) {
            this.Method_1525(Keyboard.getEventCharacter(), Keyboard.getEventKey());
        }
        this.Field_1504.Method_143();
    }

    public void Method_1517() {
    }

    protected void Method_1518(int n, int n2, int n3) {
        if (this.Field_1500 != null && n3 == 0) {
            this.Field_1500.Method_42393(n, n2);
            this.Field_1500 = null;
        }
    }

    protected void Method_1519(String string, int n, int n2) {
        String[] arrstring = new String[24579 & 1025];
        arrstring[5124 & 2512] = string;
        this.Method_1511(Arrays.asList(arrstring), n, n2);
    }

    public static boolean Method_1520(int n) {
        return (n == (20542 & -23906) && Class_1490.Method_1538() && !Class_1490.Method_1510() && !Class_1490.Method_1515() ? 24833 & 513 : 1584 & 12421) != 0;
    }

    public boolean Method_1521() {
        return (16615 & 513) != 0;
    }

    public static void Method_1522(String string) {
        if (!StringUtils.isEmpty((CharSequence)string)) {
            try {
                StringSelection stringSelection = new StringSelection(string);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public static String Method_1523() {
        try {
            Transferable transferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
            if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                return (String)transferable.getTransferData(DataFlavor.stringFlavor);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return "";
    }

    protected void Method_1524(Class_1782 class_1782, int n, int n2) {
        if (class_1782 != null && class_1782.Method_1789().Method_2921() != null) {
            block21 : {
                Class_44868 class_44868 = class_1782.Method_1789().Method_2921();
                if (class_44868.Method_44873() == Class_14202.Field_14206) {
                    Class_23823 class_23823 = null;
                    try {
                        Class_1699 class_1699 = Class_10981.Method_10996(class_44868.Method_44874().Method_1788());
                        if (class_1699 instanceof Class_1699) {
                            class_23823 = Class_23823.Method_23840(class_1699);
                        }
                    }
                    catch (Class_34310 class_34310) {
                        // empty catch block
                    }
                    if (class_23823 != null) {
                        this.Method_1546(class_23823, n, n2);
                    } else {
                        this.Method_1519((Object)((Object)Class_5478.Field_5505) + "Invalid Item!", n, n2);
                    }
                } else if (class_44868.Method_44873() == Class_14202.Field_14207) {
                    if (this.Field_1504.Field_84.Field_39795) {
                        try {
                            Class_1699 class_1699 = Class_10981.Method_10996(class_44868.Method_44874().Method_1788());
                            if (class_1699 instanceof Class_1699) {
                                ArrayList arrayList = Lists.newArrayList();
                                Class_1699 class_16992 = class_1699;
                                arrayList.add(class_16992.Method_1708("name"));
                                if (class_16992.Method_1715("type", 12 & 17672)) {
                                    String string = class_16992.Method_1708("type");
                                    arrayList.add("Type: " + string + " (" + Class_15516.Method_15537(string) + ")");
                                }
                                arrayList.add(class_16992.Method_1708("id"));
                                this.Method_1511(arrayList, n, n2);
                                break block21;
                            }
                            this.Method_1519((Object)((Object)Class_5478.Field_5505) + "Invalid Entity!", n, n2);
                        }
                        catch (Class_34310 class_34310) {
                            this.Method_1519((Object)((Object)Class_5478.Field_5505) + "Invalid Entity!", n, n2);
                        }
                    }
                } else if (class_44868.Method_44873() == Class_14202.Field_14205) {
                    this.Method_1511(Field_1503.splitToList((CharSequence)class_44868.Method_44874().Method_1783()), n, n2);
                } else if (class_44868.Method_44873() == Class_14202.Field_14210) {
                    Class_13017 class_13017 = Class_19863.Method_20025(class_44868.Method_44874().Method_1788());
                    if (class_13017 != null) {
                        Class_1782 class_17822 = class_13017.Method_13040();
                        Class_2849 class_2849 = new Class_2849("stats.tooltip.type." + (class_13017.Method_13036() ? "achievement" : "statistic"), new Object[4608 & 26689]);
                        class_2849.Method_1789().Method_2928((2177 & 20769) != 0);
                        String string = class_13017 instanceof Class_14225 ? ((Class_14225)class_13017).Method_14241() : null;
                        Object[] arrobject = new String[-31710 & 799];
                        arrobject[8532 & 3075] = class_17822.Method_1783();
                        arrobject[305 & -14205] = class_2849.Method_1783();
                        ArrayList arrayList = Lists.newArrayList((Object[])arrobject);
                        if (string != null) {
                            arrayList.addAll(this.Field_1496.Method_28733(string, 18334 & -28490));
                        }
                        this.Method_1511(arrayList, n, n2);
                    } else {
                        this.Method_1519((Object)((Object)Class_5478.Field_5505) + "Invalid statistic/achievement!", n, n2);
                    }
                }
            }
            Class_16867.Method_16931();
        }
    }

    protected void Method_1525(char c, int n) {
        if (n == (-14073 & 73)) {
            this.Field_1504.Method_218(null);
            if (this.Field_1504.Field_36 == null) {
                this.Field_1504.Method_269();
            }
        }
    }

    protected final void Method_1526(URI uRI) {
        try {
            Class<?> class_ = Class.forName("java.awt.Desktop");
            Object object = class_.getMethod("getDesktop", new Class[8192 & -32752]).invoke(null, new Object[17292 & 4211]);
            Class[] arrclass = new Class[-32435 & 4625];
            arrclass[9221 & 66] = URI.class;
            Object[] arrobject = new Object[449 & -13811];
            arrobject[1544 & -32634] = uRI;
            class_.getMethod("browse", arrclass).invoke(object, arrobject);
        }
        catch (Throwable throwable) {
            Field_1498.error("Couldn't open link", throwable);
        }
    }

    public void Method_1527() {
        this.Method_1508(4236 & -32446);
    }

    public void Method_1528() {
        if (Mouse.isCreated()) {
            while (Mouse.next()) {
                this.Method_1544();
            }
        }
        if (Keyboard.isCreated()) {
            while (Keyboard.next()) {
                this.Method_1516();
            }
        }
    }

    public void Method_1529(boolean bl, int n) {
        if (n == (1105188091 & 601528125)) {
            if (bl) {
                this.Method_1526(this.Field_1497);
            }
            this.Field_1497 = null;
            this.Field_1504.Method_218(this);
        }
    }

    public void Method_1530(Class_18 class_18, int n, int n2) {
        this.Field_1504 = class_18;
        this.Field_1505 = class_18.Method_270();
        this.Field_1496 = class_18.Field_27;
        this.Field_1507 = n;
        this.Field_1493 = n2;
        this.Field_1506.clear();
        this.Method_1513();
    }

    public void Method_1531(String string, boolean bl) {
        if (bl) {
            this.Field_1504.Field_105.Method_45458().Method_41187(string);
        }
        this.Field_1504.Field_48.Method_1414(string);
    }

    public static boolean Method_1532(int n) {
        return (n == (8237 & 23103) && Class_1490.Method_1538() && !Class_1490.Method_1510() && !Class_1490.Method_1515() ? 11329 & 257 : 16640 & -30683) != 0;
    }

    public void Method_1533() {
    }

    private static String Method_1534(String string) {
        int n = 23203;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_1490.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_1535(String string) {
        this.Method_1531(string, (181 & 259) != 0);
    }

    public void Method_1536(float f) {
        this.Field_1492 = f;
    }

    protected void Method_1537(int n, int n2, int n3) {
        if (n3 == 0) {
            for (int i = 2084 & 5128; i < this.Field_1506.size(); ++i) {
                Class_42376 class_42376 = (Class_42376)this.Field_1506.get(i);
                if (!class_42376.Method_42404(this.Field_1504, n, n2)) continue;
                this.Field_1500 = class_42376;
                class_42376.Method_42402(this.Field_1504.Method_245());
                this.Method_1547(class_42376);
            }
        }
    }

    public static boolean Method_1538() {
        return (Class_18.Field_124 ? (Keyboard.isKeyDown((int)(2299 & 25819)) || Keyboard.isKeyDown((int)(4574 & -31011)) ? -30675 & 24833 : 1301 & 8194) : (Keyboard.isKeyDown((int)(1183 & 285)) || Keyboard.isKeyDown((int)(-23395 & 5053)) ? -28671 & 25109 : 3086 & 784)) != 0;
    }

    private static String Method_1539(String string) {
        int n = 28742;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_1490.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static boolean Method_1540(int n) {
        return (n == (814 & -24402) && Class_1490.Method_1538() && !Class_1490.Method_1510() && !Class_1490.Method_1515() ? 3073 & 4609 : 321 & -32126) != 0;
    }

    public void Method_1541(int n) {
        Class_16867.Method_16931();
        Class_16867.Method_16954();
        if (((Boolean)this.Field_1504.Field_84.Field_39732.Field_8856.\u0000strictfp()).booleanValue()) {
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            this.Field_1504.Method_253().Method_34707(Class_1551.Field_1557);
            Class_1551.Method_1560(8192 & 225, 4471 & -31608, 0.0f, 0.0f, -18488 & 1958, 5113 & -31749, this.Field_1507, this.Field_1493, 8116.364f * 0.23655914f, 455.89658f * 2.2307692f);
        } else {
            Class_7644 class_7644 = Class_7644.Method_7649();
            Class_22385 class_22385 = class_7644.Method_7648();
            this.Field_1504.Method_253().Method_34707(\u0000, `);
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            float f = 163.76471f * 0.1954023f;
            class_22385.Method_22417(8455 & 17495, Class_29585.Field_29586);
            class_22385.Method_22443(0.0, this.Field_1493, 0.0).Method_22433(0.0, (float)this.Field_1493 / (3.125f * 10.24f) + (float)n).Method_22424(-27435 & 64, 3648 & -8096, 17476 & 2128, 2303 & 17663).Method_22451();
            class_22385.Method_22443(this.Field_1507, this.Field_1493, 0.0).Method_22433((float)this.Field_1507 / (41.6f * 0.7692308f), (float)this.Field_1493 / (37.0f * 0.8648649f) + (float)n).Method_22424(6257 & 8644, 72 & 3265, 1089 & -32694, 17663 & 255).Method_22451();
            class_22385.Method_22443(this.Field_1507, 0.0, 0.0).Method_22433((float)this.Field_1507 / (0.8333333f * 38.4f), n).Method_22424(-23974 & 19908, 880 & 6338, 10574 & 16577, 2815 & 1279).Method_22451();
            class_22385.Method_22443(0.0, 0.0, 0.0).Method_22433(0.0, n).Method_22424(-32672 & 16592, 4160 & 25680, 5224 & 16836, 18687 & 8447).Method_22451();
            class_7644.Method_7647();
        }
    }

    protected void Method_1542(int n, int n2, int n3, long l) {
    }

    private void Method_1543() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_1544() {
        int n = Mouse.getEventX() * this.Field_1507 / this.Field_1504.Field_80;
        int n2 = this.Field_1493 - Mouse.getEventY() * this.Field_1493 / this.Field_1504.Field_44 - (-30783 & 17);
        int n3 = Mouse.getEventButton();
        if (Mouse.getEventButtonState()) {
            if (this.Field_1504.Field_84.Field_39870) {
                int n4 = this.Field_1499;
                this.Field_1499 = n4 + (9217 & 18483);
                if (n4 > 0) {
                    return;
                }
            }
            this.Field_1501 = n3;
            this.Field_1491 = Class_18.Method_207();
            this.Method_1537(n, n2, this.Field_1501);
        } else if (n3 != (-1 & -1)) {
            if (this.Field_1504.Field_84.Field_39870 && (this.Field_1499 -= 4105 & 3363) > 0) {
                return;
            }
            this.Field_1501 = -1 & -1;
            this.Method_1518(n, n2, n3);
        } else if (this.Field_1501 != (-1 & -1) && this.Field_1491 > (33641234L & 1157892165L)) {
            long l = Class_18.Method_207() - this.Field_1491;
            this.Method_1542(n, n2, this.Field_1501, l);
        }
    }

    public void Method_1545(int n, int n2, float f) {
        int n3;
        for (n3 = 16 & 8260; n3 < this.Field_1506.size(); ++n3) {
            ((Class_42376)this.Field_1506.get(n3)).Method_42401(this.Field_1504, n, n2);
        }
        for (n3 = 74 & 5777; n3 < this.Field_1494.size(); ++n3) {
            ((Class_36766)this.Field_1494.get(n3)).Method_36784(this.Field_1504, n, n2);
        }
    }

    protected void Method_1546(Class_23823 class_23823, int n, int n2) {
        List list = class_23823.Method_23862(this.Field_1504.Field_48, this.Field_1504.Field_84.Field_39795);
        for (int i = 513 & 26786; i < list.size(); ++i) {
            if (i == 0) {
                list.set(i, (Object)((Object)class_23823.Method_23884().Field_41144) + (String)list.get(i));
                continue;
            }
            list.set(i, (Object)((Object)Class_5478.Field_5480) + (String)list.get(i));
        }
        this.Method_1511(list, n, n2);
    }

    static {
        Object[] arrobject = new String[16658 & 706];
        arrobject[6156 & -31712] = Class_1490.Method_1534("\u5191\u5181\u5181\u5181");
        arrobject[129 & 8211] = Class_1490.Method_1539("\u6853\u684a\u684b\u684a\u6848");
        Field_1502 = Sets.newHashSet((Object[])arrobject);
        Field_1503 = Splitter.on((char)(28906 & -32758));
    }

    protected void Method_1547(Class_42376 class_42376) {
    }

    public void Method_1548(Class_18 class_18, int n, int n2) {
        this.Method_1530(class_18, n, n2);
    }
}

