/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  internal.org.lwjgl.input.Keyboard
 *  internal.org.lwjgl.input.Mouse
 */
import com.google.common.collect.Lists;
import internal.org.lwjgl.input.Keyboard;
import internal.org.lwjgl.input.Mouse;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class_33634
extends Class_1899 {
    private List Field_33635;
    private Class_38813 Field_33636;
    private static final Class_2080 Field_33637 = new Class_2080(Class_33634.Method_33668("\ua041\ua041\ua041\ua040\ua040\ua040\ua040\ua041\ua008\ua049\ua048\ua049\ua008\ua049\ua048\ua048\ua041\ua041\ua040\ua040\ua040\ua040\ua000\ua041\ua049\ua049\ua048\ua048\ua048\ua048\ua048\ua049\ua040\ua040\ua041\ua041\ua041\ua040\ua040\ua040\ua048\ua009\ua049\ua049\ua049\ua049\ua009\ua048\ua041\ua041"));
    private float Field_33638;
    private static Class_43634 Field_33639 = new Class_43634(Class_33634.Method_33651("\u2008\u2010\u200e"), (3355 & -28671) != 0, -26577 & 25405);
    private boolean Field_33640;
    private boolean Field_33641;
    private static int Field_33642 = Class_3987.Field_3993.Method_4023();
    private Class_26421 Field_33643;
    private Class_37490 Field_33644;
    private boolean Field_33645;

    public void Method_33646() {
        if (this.\u0000strictfp.Field_61.Method_11768()) {
            super.Method_1902();
            this.\u0000strictfp.clear();
            Keyboard.enableRepeatEvents((49 & -7039) != 0);
            this.Field_33636 = new Class_38813(16550 & 1816, this.\u0000strictfp, this.\u0000
             + (94 & 4306), this.\u0000% + (-24218 & 17950), 1117 & -20101, 21561 & 521);
            this.Field_33636.Method_38859(9007 & -26593);
            this.Field_33636.Method_38837((4808 & 16676) != 0);
            this.Field_33636.Method_38864((20736 & -30704) != 0);
            this.Field_33636.Method_38863(67108863 & 620756991);
            int n = Field_33642;
            Field_33642 = -1 & -1;
            this.Method_33664(Class_3987.Field_4005[n]);
            this.Field_33644 = new Class_37490(this.\u0000strictfp);
            this.\u0000strictfp.Field_48.\u0000strictfp.Method_8306(this.Field_33644);
        } else {
            this.\u0000strictfp.Method_218(new Class_1888(this.\u0000strictfp.Field_48));
        }
    }

    protected void Method_33647(int n, int n2) {
        Class_3987 class_3987 = Class_3987.Field_4005[Field_33642];
        if (class_3987.Method_4025()) {
            Class_16867.Method_16952();
            this.\u0000strictfp.Method_28692(Class_9802.Method_9806(class_3987.Method_4033(), new Object[320 & 23200]), 5273 & 2572, 6 & 12566, 960578810 & 4343876);
        }
    }

    protected void Method_33648(Class_42376 class_42376) {
        if (class_42376.Field_42392 == 0) {
            this.\u0000strictfp.Method_218(new Class_23262(this, this.\u0000strictfp.Field_48.Method_1405()));
        }
        if (class_42376.Field_42392 == (25345 & -32751)) {
            this.\u0000strictfp.Method_218(new Class_16456(this, this.\u0000strictfp.Field_48.Method_1405()));
        }
    }

    private boolean Method_33649() {
        return (Field_33642 != Class_3987.Field_4001.Method_4023() && Class_3987.Field_4005[Field_33642].Method_4012() && ((Class_16606)this.\u0000strictfp).Method_16611() ? 23091 & 137 : -32512 & 23089) != 0;
    }

    public Class_33634(Class_626 class_626) {
        super(new Class_16606(class_626));
        class_626.Field_665 = this.\u0000strictfp;
        this.\u0000strictfp = 8209 & 1031;
        this.\u0000= int = 18056 & 6282;
        this.\u0000, for = 14531 & 227;
    }

    public void Method_33650() {
        if (!this.\u0000strictfp.Field_61.Method_11768()) {
            this.\u0000strictfp.Method_218(new Class_1888(this.\u0000strictfp.Field_48));
        }
        this.Method_33659();
    }

    private static String Method_33651(String string) {
        int n = 8114;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33634.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_33652() {
        Class_16606 class_16606 = (Class_16606)this.\u0000strictfp;
        class_16606.Field_16607.clear();
        Object object = Class_1956.Field_1961.Method_3651();
        while (object.hasNext()) {
            Class_1956 class_1956 = (Class_1956)object.next();
            if (class_1956 == null || class_1956.Method_2025() == null) continue;
            class_1956.Method_2016(class_1956, null, class_16606.Field_16607);
        }
        object = Class_30635.Field_30648;
        int n = ((Class_30635[])object).length;
        for (int i = 4115 & -8056; i < n; ++i) {
            Class_30635 class_30635 = object[i];
            if (class_30635 == null || class_30635.Field_30667 == null) continue;
            Class_10527.Field_10625.Method_21692(class_30635, class_16606.Field_16607);
        }
        object = class_16606.Field_16607.iterator();
        String string = this.Field_33636.Method_38848().toLowerCase();
        while (object.hasNext()) {
            Class_23823 class_23823 = (Class_23823)object.next();
            int n2 = -28464 & 18948;
            for (String string2 : class_23823.Method_23862(this.\u0000strictfp.Field_48, this.\u0000strictfp.Field_84.Field_39795)) {
                if (!Class_5478.Method_5555(string2).toLowerCase().contains(string)) continue;
                n2 = 18641 & 803;
                break;
            }
            if (n2 != 0) continue;
            object.remove();
        }
        this.Field_33638 = 0.0f;
        class_16606.Method_16610(0.0f);
    }

    protected boolean Method_33653(Class_3987 class_3987, int n, int n2) {
        int n3 = class_3987.Method_4014();
        int n4 = (-16356 & 8382) * n3;
        int n5 = -21468 & 4376;
        if (n3 == (10341 & 4109)) {
            n4 = this.\u0000, for - (1276 & 28702) + (-32686 & 3110);
        } else if (n3 > 0) {
            n4 += n3;
        }
        n5 = class_3987.Method_4015() ? (n5 -= -31693 & 25120) : (n5 += this.\u0000= int);
        if (this.\u0000strictfp(n4 + (3 & -29941), n5 + (11 & 2179), 95 & 2199, 1307 & 155, n, n2)) {
            this.\u0000strictfp(Class_9802.Method_9806(class_3987.Method_4033(), new Object[135 & -31232]), n, n2);
            return (8449 & 18053) != 0;
        }
        return (-32768 & 25696) != 0;
    }

    public void Method_33654(int n, int n2, float f) {
        Class_3987 class_3987;
        boolean bl = Mouse.isButtonDown((int)(-21488 & 4300));
        int n3 = this.\u0000;
        int n4 = this.\u0000%;
        int n5 = n3 + (943 & 175);
        int n6 = n4 + (542 & 18);
        int n7 = n5 + (12814 & -32498);
        int n8 = n6 + (18544 & -24335);
        if (!this.Field_33640 && bl && n >= n5 && n2 >= n6 && n < n7 && n2 < n8) {
            this.Field_33645 = this.Method_33649();
        }
        if (!bl) {
            this.Field_33645 = 12832 & 328;
        }
        this.Field_33640 = bl;
        if (this.Field_33645) {
            this.Field_33638 = ((float)(n2 - n6) - 1.1754386f * 6.3805966f) / ((float)(n8 - n6) - 77.0f * 0.19480519f);
            this.Field_33638 = Class_13337.Method_13360(this.Field_33638, 0.0f, 1.0f);
            ((Class_16606)this.\u0000strictfp).Method_16610(this.Field_33638);
        }
        super.Method_1905(n, n2, f);
        Class_3987[] arrclass_3987 = Class_3987.Field_4005;
        int n9 = arrclass_3987.length;
        for (int i = 16642 & 4672; i < n9 && !this.Method_33653(class_3987 = arrclass_3987[i], n, n2); ++i) {
        }
        if (this.Field_33643 != null && Field_33642 == Class_3987.Field_4001.Method_4023() && this.\u0000strictfp(this.Field_33643.Field_26426, this.Field_33643.Field_26422, 144 & 18485, 20632 & 11538, n, n2)) {
            this.\u0000strictfp(Class_9802.Method_9806("inventory.binSlot", new Object[16385 & 9234]), n, n2);
        }
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        Class_16867.Method_16931();
    }

    protected void Method_33655(char c, int n) {
        if (Field_33642 != Class_3987.Field_4007.Method_4023()) {
            if (Class_39702.Method_39906(this.\u0000strictfp.Field_84.Field_39722)) {
                this.Method_33664(Class_3987.Field_4007);
            } else {
                super.\u0000strictfp(c, n);
            }
        } else {
            if (this.Field_33641) {
                this.Field_33641 = -28654 & 24704;
                this.Field_33636.Method_38853("");
            }
            if (!this.\u0000%(n)) {
                if (this.Field_33636.Method_38854(c, n)) {
                    this.Method_33652();
                } else {
                    super.\u0000strictfp(c, n);
                }
            }
        }
    }

    public int Method_33656() {
        return Field_33642;
    }

    public void Method_33657() {
        super.\u0000c_();
        if (this.\u0000strictfp.Field_48 != null && this.\u0000strictfp.Field_48.\u0000strictfp != null) {
            this.\u0000strictfp.Field_48.\u0000strictfp.Method_8316(this.Field_33644);
        }
        Keyboard.enableRepeatEvents((12320 & -32766) != 0);
    }

    protected void Method_33658(Class_3987 class_3987) {
        int n = class_3987.Method_4023() == Field_33642 ? 25601 & 2321 : 3603 & 24612;
        boolean bl = class_3987.Method_4015();
        int n2 = class_3987.Method_4014();
        int n3 = n2 * (-30532 & 1310);
        int n4 = 9344 & 2117;
        int n5 = this.\u0000
         + (8477 & 20604) * n2;
        int n6 = this.\u0000%;
        int n7 = 29739 & -30112;
        if (n != 0) {
            n4 += 32;
        }
        if (n2 == (26695 & -32243)) {
            n5 = this.\u0000
             + this.\u0000, for - (14044 & 61);
        } else if (n2 > 0) {
            n5 += n2;
        }
        if (bl) {
            n6 -= -23524 & 17020;
        } else {
            n4 += 64;
            n6 += this.\u0000= int - (100 & -28668);
        }
        Class_16867.Method_16931();
        this.\u0000strictfp(n5, n6, n3, n4, 9598 & -30180, n7);
        this.\u0000strictfp = 1.2222222f * 81.818184f;
        this.\u0000strictfp.Field_44259 = 0.625f * 160.0f;
        n6 = n6 + (12 & -7877) + (bl ? -29695 & 25449 : -1 & -1);
        Class_16867.Method_16918();
        Class_16867.Method_16957();
        Class_23823 class_23823 = class_3987.Method_4020();
        this.\u0000strictfp.Method_44287(class_23823, n5 += 4678 & 11526, n6);
        this.\u0000strictfp.Method_44284(this.\u0000strictfp, class_23823, n5, n6);
        Class_16867.Method_16931();
        this.\u0000strictfp.Field_44259 = 0.0f;
        this.\u0000strictfp = 0.0f;
    }

    protected void Method_33659() {
        int n = this.\u0000;
        super.Method_1903();
        if (this.Field_33636 != null && this.\u0000
         != n) {
            this.Field_33636.Field_38822 = this.\u0000
             + (16727 & 8402);
        }
    }

    protected boolean Method_33660(Class_3987 class_3987, int n, int n2) {
        int n3 = class_3987.Method_4014();
        int n4 = (19677 & -32740) * n3;
        int n5 = 18601 & 4356;
        if (n3 == (1047 & -2003)) {
            n4 = this.\u0000, for - (10782 & 16572) + (-8117 & 258);
        } else if (n3 > 0) {
            n4 += n3;
        }
        n5 = class_3987.Method_4015() ? (n5 -= 168 & -26507) : (n5 += this.\u0000= int);
        return (n >= n4 && n <= n4 + (-24354 & 1821) && n2 >= n5 && n2 <= n5 + (33 & 16438) ? 26701 & 4257 : 25985 & 58) != 0;
    }

    public void Method_33661() {
        super.\u0000, for();
        int n = Mouse.getEventDWheel();
        if (n != 0 && this.Method_33649()) {
            int n2 = ((Class_16606)this.\u0000strictfp).Field_16607.size() / (-30707 & 1563) - (-22203 & 4783);
            if (n > 0) {
                n = -18399 & 17285;
            }
            if (n < 0) {
                n = -1 & -1;
            }
            this.Field_33638 = (float)((double)this.Field_33638 - (double)n / (double)n2);
            this.Field_33638 = Class_13337.Method_13360(this.Field_33638, 0.0f, 1.0f);
            ((Class_16606)this.\u0000strictfp).Method_16610(this.Field_33638);
        }
    }

    protected void Method_33662(float f, int n, int n2) {
        int n3;
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        Class_39477.Method_39485();
        Class_3987 class_3987 = Class_3987.Field_4005[Field_33642];
        Class_3987[] arrclass_3987 = Class_3987.Field_4005;
        int n4 = arrclass_3987.length;
        for (n3 = 20 & 6401; n3 < n4; ++n3) {
            Class_3987 class_39872 = arrclass_3987[n3];
            this.\u0000strictfp.Method_253().Method_34707(Field_33637);
            if (class_39872.Method_4023() == Field_33642) continue;
            this.Method_33658(class_39872);
        }
        this.\u0000strictfp.Method_253().Method_34707(new Class_2080("textures/gui/container/creative_inventory/tab_" + class_3987.Method_4013()));
        this.\u0000strictfp(this.\u0000
        , this.\u0000%, -26488 & 9223, 5 & 17442, this.\u0000, for, this.\u0000= int);
        this.Field_33636.Method_38849();
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        int n5 = this.\u0000
         + (2223 & 8879);
        n4 = this.\u0000% + (16467 & 9526);
        n3 = n4 + (3698 & -32528);
        this.\u0000strictfp.Method_253().Method_34707(Field_33637);
        if (class_3987.Method_4012()) {
            this.\u0000strictfp(n5, n4 + (int)((float)(n3 - n4 - (2129 & 4889)) * this.Field_33638), (-28952 & 4586) + (this.Method_33649() ? 88 & 3107 : 8718 & -14228), -31488 & 10893, 5165 & 24588, 1039 & 29455);
        }
        this.Method_33658(class_3987);
        if (class_3987 == Class_3987.Field_4001) {
            Class_1888.Method_1892(this.\u0000
             + (4223 & 8235), this.\u0000% + (-12163 & 8237), 5660 & 26709, this.\u0000
             + (43 & 8379) - n, this.\u0000% + (-28625 & 1085) - (-29378 & 542) - n2, this.\u0000strictfp.Field_48);
        }
    }

    private void Method_33663() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_33664(Class_3987 class_3987) {
        int n = Field_33642;
        Field_33642 = class_3987.Method_4023();
        Class_16606 class_16606 = (Class_16606)this.\u0000strictfp;
        this.\u0000strictfp.clear();
        class_16606.Field_16607.clear();
        class_3987.Method_4035(class_16606.Field_16607);
        if (class_3987 == Class_3987.Field_4001) {
            Class_8295 class_8295 = this.\u0000strictfp.Field_48.\u0000strictfp;
            if (this.Field_33635 == null) {
                this.Field_33635 = class_16606.\u0000, `;
            }
            class_16606.\u0000, ` = Lists.newArrayList();
            for (int i = 2112 & 12320; i < class_8295.Field_8299.size(); ++i) {
                int n2;
                int n3;
                int n4;
                Class_27618 class_27618 = new Class_27618(this, (Class_26421)class_8295.Field_8299.get(i), i);
                class_16606.\u0000, `.add(class_27618);
                if (i >= (-16315 & 6965) && i < (24585 & 313)) {
                    n4 = i - (-24443 & 573);
                    n2 = n4 / (4378 & 1539);
                    n3 = n4 % (-32754 & 4146);
                    class_27618.Field_26426 = (26893 & 649) + n2 * (6327 & -16322);
                    class_27618.Field_26422 = (54 & 18950) + n3 * (18847 & 8731);
                    continue;
                }
                if (i >= 0 && i < (8205 & 5221)) {
                    class_27618.Field_26422 = -334 & -1988;
                    class_27618.Field_26426 = -972 & -1798;
                    continue;
                }
                if (i >= class_8295.Field_8299.size()) continue;
                n4 = i - (8617 & 3145);
                n2 = n4 % (7241 & 8619);
                n3 = n4 / (16459 & 6701);
                class_27618.Field_26426 = (18569 & 541) + n2 * (21522 & -32174);
                class_27618.Field_26422 = i >= (1076 & 36) ? -27406 & 8305 : (22070 & -32457) + n3 * (-32174 & 1174);
            }
            this.Field_33643 = new Class_26421(Field_33639, 4104 & 32, -32595 & 429, 4720 & 9592);
            class_16606.\u0000, `.add(this.Field_33643);
        } else if (n == Class_3987.Field_4001.Method_4023()) {
            class_16606.\u0000, ` = this.Field_33635;
            this.Field_33635 = null;
        }
        if (this.Field_33636 != null) {
            if (class_3987 == Class_3987.Field_4007) {
                this.Field_33636.Method_38864((-11691 & 297) != 0);
                this.Field_33636.Method_38868((4 & -14335) != 0);
                this.Field_33636.Method_38858((-28343 & 16437) != 0);
                this.Field_33636.Method_38853("");
                this.Method_33652();
            } else {
                this.Field_33636.Method_38864((1281 & 16906) != 0);
                this.Field_33636.Method_38868((8835 & -27647) != 0);
                this.Field_33636.Method_38858((-14334 & 257) != 0);
            }
        }
        this.Field_33638 = 0.0f;
        class_16606.Method_16610(0.0f);
    }

    protected void Method_33665(int n, int n2, int n3) {
        if (n3 == 0) {
            int n4 = n - this.\u0000;
            int n5 = n2 - this.\u0000%;
            Class_3987[] arrclass_3987 = Class_3987.Field_4005;
            int n6 = arrclass_3987.length;
            for (int i = 6320 & 16960; i < n6; ++i) {
                Class_3987 class_3987 = arrclass_3987[i];
                if (!this.Method_33660(class_3987, n4, n5)) continue;
                this.Method_33664(class_3987);
                return;
            }
        }
        super.\u0000, `(n, n2, n3);
    }

    protected void Method_33666(Class_26421 class_26421, int n, int n2, int n3) {
        this.Field_33641 = 4403 & 13;
        int n4 = n3 == (-15599 & 2081) ? 263 & 20993 : 1024 & 4898;
        int n5 = n3 = n == (-485 & -679) && n3 == 0 ? -32684 & 19084 : n3;
        if (class_26421 == null && Field_33642 != Class_3987.Field_4001.Method_4023() && n3 != (16517 & 1295)) {
            Class_37781 class_37781 = this.\u0000strictfp.Field_48.\u0000strictfp;
            if (class_37781.Method_37812() != null) {
                if (n2 == 0) {
                    this.\u0000strictfp.Field_48.\u0000strictfp(class_37781.Method_37812(), (73 & -29039) != 0);
                    this.\u0000strictfp.Field_61.Method_11763(class_37781.Method_37812());
                    class_37781.Method_37804(null);
                }
                if (n2 == (-15737 & 4385)) {
                    Class_23823 class_23823 = class_37781.Method_37812().Method_23857(1021 & 1025);
                    this.\u0000strictfp.Field_48.\u0000strictfp(class_23823, (4679 & 24849) != 0);
                    this.\u0000strictfp.Field_61.Method_11763(class_23823);
                    if (class_37781.Method_37812().Field_23826 == 0) {
                        class_37781.Method_37804(null);
                    }
                }
            }
        } else if (class_26421 == this.Field_33643 && n4 != 0) {
            for (int i = 20 & 2144; i < this.\u0000strictfp.Field_48.\u0000strictfp.Method_8333().size(); ++i) {
                this.\u0000strictfp.Field_61.Method_11772(null, i);
            }
        } else if (Field_33642 == Class_3987.Field_4001.Method_4023()) {
            if (class_26421 == this.Field_33643) {
                this.\u0000strictfp.Field_48.\u0000strictfp.Method_37804(null);
            } else if (n3 == (14340 & 16790) && class_26421 != null && class_26421.Method_26439()) {
                Class_23823 class_23823 = class_26421.Method_26427(n2 == 0 ? 201 & 8209 : class_26421.Method_26430().Method_23837());
                this.\u0000strictfp.Field_48.\u0000strictfp(class_23823, (17665 & 1) != 0);
                this.\u0000strictfp.Field_61.Method_11763(class_23823);
            } else if (n3 == (1172 & -28665) && this.\u0000strictfp.Field_48.\u0000strictfp.Method_37812() != null) {
                this.\u0000strictfp.Field_48.\u0000strictfp(this.\u0000strictfp.Field_48.\u0000strictfp.Method_37812(), (153 & -28639) != 0);
                this.\u0000strictfp.Field_61.Method_11763(this.\u0000strictfp.Field_48.\u0000strictfp.Method_37812());
                this.\u0000strictfp.Field_48.\u0000strictfp.Method_37804(null);
            } else {
                this.\u0000strictfp.Field_48.\u0000strictfp.Method_8308(class_26421 == null ? n : Class_27618.Method_27633((Class_27618)((Class_27618)class_26421)).Field_26423, n2, n3, this.\u0000strictfp.Field_48);
                this.\u0000strictfp.Field_48.\u0000strictfp.Method_8322();
            }
        } else if (n3 != (21727 & 773) && class_26421.Field_26425 == Field_33639) {
            Class_37781 class_37781 = this.\u0000strictfp.Field_48.\u0000strictfp;
            Class_23823 class_23823 = class_37781.Method_37812();
            Class_23823 class_238232 = class_26421.Method_26430();
            if (n3 == (4630 & -32733)) {
                if (class_238232 != null && n2 >= 0 && n2 < (45 & 4107)) {
                    Class_23823 class_238233 = class_238232.Method_23850();
                    class_238233.Field_23826 = class_238233.Method_23837();
                    this.\u0000strictfp.Field_48.\u0000strictfp.Method_37796(n2, class_238233);
                    this.\u0000strictfp.Field_48.\u0000strictfp.Method_8322();
                }
                return;
            }
            if (n3 == (-24541 & 17487)) {
                if (class_37781.Method_37812() == null && class_26421.Method_26439()) {
                    Class_23823 class_238234 = class_26421.Method_26430().Method_23850();
                    class_238234.Field_23826 = class_238234.Method_23837();
                    class_37781.Method_37804(class_238234);
                }
                return;
            }
            if (n3 == (1548 & -32716)) {
                if (class_238232 != null) {
                    Class_23823 class_238235 = class_238232.Method_23850();
                    class_238235.Field_23826 = n2 == 0 ? -25915 & 25865 : class_238235.Method_23837();
                    this.\u0000strictfp.Field_48.\u0000strictfp(class_238235, (4099 & 2649) != 0);
                    this.\u0000strictfp.Field_61.Method_11763(class_238235);
                }
                return;
            }
            if (class_23823 != null && class_238232 != null && class_23823.Method_23865(class_238232)) {
                if (n2 == 0) {
                    if (n4 != 0) {
                        class_23823.Field_23826 = class_23823.Method_23837();
                    } else if (class_23823.Field_23826 < class_23823.Method_23837()) {
                        class_23823.Field_23826 += 2247 & -24015;
                    }
                } else if (class_23823.Field_23826 <= (4651 & 9361)) {
                    class_37781.Method_37804(null);
                } else {
                    class_23823.Field_23826 -= 16385 & 11397;
                }
            } else if (class_238232 != null && class_23823 == null) {
                class_37781.Method_37804(Class_23823.Method_23855(class_238232));
                class_23823 = class_37781.Method_37812();
                if (n4 != 0) {
                    class_23823.Field_23826 = class_23823.Method_23837();
                }
            } else {
                class_37781.Method_37804(null);
            }
        } else {
            this.\u0000strictfp.Method_8308(class_26421 == null ? n : class_26421.Field_26423, n2, n3, this.\u0000strictfp.Field_48);
            if (Class_8295.Method_8314(n2) == (27 & 17122)) {
                for (int i = 417 & 514; i < (4665 & -32503); ++i) {
                    this.\u0000strictfp.Field_61.Method_11772(this.\u0000strictfp.Method_8324((18477 & 5807) + i).Method_26430(), (292 & 20582) + i);
                }
            } else if (class_26421 != null) {
                Class_23823 class_23823 = this.\u0000strictfp.Method_8324(class_26421.Field_26423).Method_26430();
                this.\u0000strictfp.Field_61.Method_11772(class_23823, class_26421.Field_26423 - this.\u0000strictfp.Field_8299.size() + (1113 & 777) + (12068 & 52));
            }
        }
    }

    static Class_43634 Method_33667() {
        return Field_33639;
    }

    private static String Method_33668(String string) {
        int n = 17402;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33634.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_33669(int n, int n2, int n3) {
        if (n3 == 0) {
            int n4 = n - this.\u0000;
            int n5 = n2 - this.\u0000%;
            Class_3987[] arrclass_3987 = Class_3987.Field_4005;
            int n6 = arrclass_3987.length;
            for (int i = 7936 & 97; i < n6; ++i) {
                Class_3987 class_3987 = arrclass_3987[i];
                if (!this.Method_33660(class_3987, n4, n5)) continue;
                return;
            }
        }
        super.\u0000strictfp(n, n2, n3);
    }

    protected void Method_33670(Class_23823 class_23823, int n, int n2) {
        if (Field_33642 == Class_3987.Field_4007.Method_4023()) {
            Map map;
            List list = class_23823.Method_23862(this.\u0000strictfp.Field_48, this.\u0000strictfp.Field_84.Field_39795);
            Class_3987 class_3987 = class_23823.Method_23844().Method_2025();
            if (class_3987 == null && class_23823.Method_23844() == Class_10527.Field_10625 && (map = Class_29642.Method_29665(class_23823)).size() == (5283 & 5)) {
                Class_30635 class_30635 = Class_30635.Method_30685((Integer)map.keySet().iterator().next());
                Class_3987[] arrclass_3987 = Class_3987.Field_4005;
                int n3 = arrclass_3987.length;
                for (int i = 23553 & -32722; i < n3; ++i) {
                    Class_3987 class_39872 = arrclass_3987[i];
                    if (!class_39872.Method_4034(class_30635.Field_30667)) continue;
                    class_3987 = class_39872;
                    break;
                }
            }
            if (class_3987 != null) {
                list.add(10241 & 43, "" + (Object)((Object)Class_5478.Field_5486) + (Object)((Object)Class_5478.Field_5498) + Class_9802.Method_9806(class_3987.Method_4033(), new Object[1665 & 32]));
            }
            for (int i = 16418 & 8256; i < list.size(); ++i) {
                if (i == 0) {
                    list.set(i, (Object)((Object)class_23823.Method_23884().Field_41144) + (String)list.get(i));
                    continue;
                }
                list.set(i, (Object)((Object)Class_5478.Field_5480) + (String)list.get(i));
            }
            this.\u0000strictfp(list, n, n2);
        } else {
            super.\u0000strictfp(class_23823, n, n2);
        }
    }
}

