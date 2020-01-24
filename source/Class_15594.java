/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public abstract class Class_15594
implements Class_14246 {
    private static final Class_1782 Field_15595;
    private static final Class_1782 Field_15596;
    private static final Class_1782 Field_15597;
    protected final Class_24685 Field_15598;
    protected final Class_18 Field_15599;
    private static final Class_2080 Field_15600;

    public void Method_15601(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        int n8;
        int n9 = this.Method_15617();
        if (n9 != (22915 & -24475)) {
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            Class_1551.Method_1558(n2 - (-32719 & 1737), n3 - (9755 & -32571), n2 + n4 - (24601 & 1065), n3 + n5 + (1105 & 18433), -8956537 & -8452056);
        }
        this.Method_15609();
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        Class_1551.Method_1566(n2, n3, 0.0f, 0.0f, 162 & 20769, 6241 & -31312, 26.800001f * 1.1940298f, 45.639347f * 0.7011494f);
        String string = this.Method_15606();
        String string2 = this.Method_15608();
        if ((this.Field_15599.Field_84.Field_39870 || bl) && this.Method_15605()) {
            this.Field_15599.Method_253().Method_34707(Field_15600);
            Class_1551.Method_1558(n2, n3, n2 + (305 & -5596), n3 + (1057 & 12512), -1198467950 & -1594846564);
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            n8 = n6 - n2;
            int n10 = n7 - n3;
            if (n9 < (17 & -31191)) {
                string = Field_15595.Method_1783();
                string2 = Field_15597.Method_1783();
            } else if (n9 > (2433 & 1089)) {
                string = Field_15595.Method_1783();
                string2 = Field_15596.Method_1783();
            }
            if (this.Method_15604()) {
                if (n8 < (738 & 24884)) {
                    Class_1551.Method_1566(n2, n3, 0.0f, 5.2727275f * 6.0689654f, -29968 & 5408, -22216 & 4132, 218.53659f * 1.1714286f, 0.2777778f * 921.6f);
                } else {
                    Class_1551.Method_1566(n2, n3, 0.0f, 0.0f, 5280 & -32671, 16608 & 1582, 294.78787f * 0.8684211f, 0.7529412f * 340.0f);
                }
            } else {
                if (this.Method_15607()) {
                    if (n8 < (-11727 & 80)) {
                        Class_1551.Method_1566(n2, n3, 13.666667f * 2.3414633f, 0.77011496f * 41.55224f, 288 & -32599, 2088 & 1184, 1.3846154f * 184.88889f, 115.2f * 2.2222223f);
                    } else {
                        Class_1551.Method_1566(n2, n3, 1.2285714f * 26.046513f, 0.0f, 306 & 1573, 20512 & 1141, 9.833333f * 26.0339f, 0.5f * 512.0f);
                    }
                }
                if (this.Method_15611()) {
                    if (n8 < (628 & -5085) && n8 > (16409 & 4688) && n10 < (-12272 & 316)) {
                        Class_1551.Method_1566(n2, n3, 61.866665f * 1.5517242f, 17.37143f * 1.8421053f, 8864 & 3188, 8243 & 1960, 2706.2856f * 0.0945946f, 329.14285f * 0.7777778f);
                    } else {
                        Class_1551.Method_1566(n2, n3, 0.8210526f * 116.92308f, 0.0f, 608 & 16440, 48 & -32278, 2.9615386f * 86.44156f, 10.222222f * 25.043478f);
                    }
                }
                if (this.Method_15614()) {
                    if (n8 < (2098 & 12588) && n8 > (10256 & -30987) && n10 > (-32164 & 12336)) {
                        Class_1551.Method_1566(n2, n3, 0.5154639f * 124.16f, 0.4477612f * 71.46667f, -32096 & 26676, 4138 & -30619, 23.272728f * 11.0f, 1.2714286f * 201.34831f);
                    } else {
                        Class_1551.Method_1566(n2, n3, 225.18518f * 0.28421053f, 0.0f, 4129 & 17520, 18464 & -28253, 796.44446f * 0.32142857f, 264.8276f * 0.96666664f);
                    }
                }
            }
        }
        if ((n8 = this.Field_15599.Field_27.Method_28715(string)) > (18653 & 8605)) {
            string = this.Field_15599.Field_27.Method_28691(string, (1213 & -10083) - this.Field_15599.Field_27.Method_28715("...")) + "...";
        }
        this.Field_15599.Field_27.Method_28729(string, n2 + (-14235 & 1696) + (98 & -24042), n3 + (2337 & 4097), 419430399 & 50331647);
        List list = this.Field_15599.Field_27.Method_28733(string2, 4253 & -32323);
        for (int i = 6282 & -32668; i < (-7157 & 4694) && i < list.size(); ++i) {
            this.Field_15599.Field_27.Method_28729((String)list.get(i), n2 + (100 & 18464) + (17994 & 162), n3 + (6188 & 16911) + (3098 & -15409) * i, 12683428 & -1669299821);
        }
    }

    private static String Method_15602(String string) {
        int n = 29437;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15594.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_15603(int n, int n2, int n3) {
    }

    protected boolean Method_15604() {
        return (!this.Field_15598.Method_24695(this) ? -15709 & 12369 : -32766 & 17100) != 0;
    }

    protected boolean Method_15605() {
        return (1315 & 10241) != 0;
    }

    protected abstract String Method_15606();

    protected boolean Method_15607() {
        return this.Field_15598.Method_24695(this);
    }

    protected abstract String Method_15608();

    protected abstract void Method_15609();

    private static String Method_15610(String string) {
        int n = 18483;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15594.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_15600 = new Class_2080(Class_15594.Method_15602("\u4040\u4051\u404e\u4043\u4044\u4043\u4056\u4041\u401a\u4053\u4042\u405f\u401e\u4043\u4056\u4041\u405a\u4041\u4044\u4055\u4054\u406f\u4042\u4053\u4056\u405f\u4044\u4019\u4040\u405f\u4054"));
        Field_15595 = new Class_2849(Class_15594.Method_15612("\u5a02\u5a14\u5a01\u5a14\u5a05\u5a03\u5a11\u5a16\u5a20\u5a10\u5a11\u5a10\u5a56\u5a10\u5a14\u5a10\u5a17\u5a14\u5a02\u5a12\u5a04\u5a10\u5a10\u5a17\u5a15"), new Object[-32383 & 8290]);
        Field_15597 = new Class_2849(Class_15594.Method_15615("\u5070\u5065\u5070\u506d\u5070\u5075\u5064\u5061\u5058\u5069\u5068\u5061\u5020\u5065\u5060\u506d\u507c\u507d\u5060\u5071\u5060\u507d\u5074\u5079\u507c\u5035\u5074\u5075\u5078"), new Object[9296 & -11776]);
        Field_15596 = new Class_2849(Class_15594.Method_15610("\u4016\u4001\u4015\u4009\u4015\u4012\u4001\u4007\u4014\u4005\u4005\u400d\u400e\u4009\u400c\u4001\u401b\u4019\u4006\u4017\u4004\u4019\u4010\u401e\u4011\u401a\u4018\u4013\u4007"), new Object[24576 & -28615]);
    }

    protected boolean Method_15611() {
        List list = this.Field_15598.Method_24694(this);
        int n = list.indexOf(this);
        return (n > 0 && ((Class_15594)list.get(n - (-32767 & 26759))).Method_15605() ? -16383 & 7699 : 8256 & 17194) != 0;
    }

    private static String Method_15612(String string) {
        int n = 18774;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15594.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_15613() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected boolean Method_15614() {
        List list = this.Field_15598.Method_24694(this);
        int n = list.indexOf(this);
        return (n >= 0 && n < list.size() - (163 & 29265) && ((Class_15594)list.get(n + (-30199 & 8305))).Method_15605() ? 4423 & -32239 : 4912 & -32691) != 0;
    }

    public Class_15594(Class_24685 class_24685) {
        this.Field_15598 = class_24685;
        this.Field_15599 = Class_18.Field_89;
    }

    private static String Method_15615(String string) {
        int n = 7482;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15594.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_15616(int n, int n2, int n3, int n4, int n5, int n6) {
        if (this.Method_15605() && n5 <= (-32400 & 24744)) {
            if (this.Method_15604()) {
                this.Field_15598.Method_24705();
                int n7 = this.Method_15617();
                if (n7 != (-22527 & 16529)) {
                    String string = Class_9802.Method_9806("resourcePack.incompatible.confirm.title", new Object[17025 & 2124]);
                    String string2 = Class_9802.Method_9806("resourcePack.incompatible.confirm." + (n7 > (-27899 & 8297) ? "new" : "old"), new Object[512 & 4096]);
                    this.Field_15599.Method_218(new Class_1792(new Class_35240(this), string, string2, 2881 & -16252));
                } else {
                    this.Field_15598.Method_24694(this).remove(this);
                    this.Field_15598.Method_24698().add(-23536 & 20672, this);
                }
                return (257 & -23455) != 0;
            }
            if (n5 < (-32622 & 9492) && this.Method_15607()) {
                this.Field_15598.Method_24694(this).remove(this);
                this.Field_15598.Method_24704().add(260 & 17929, this);
                this.Field_15598.Method_24705();
                return (28329 & 273) != 0;
            }
            if (n5 > (12626 & -32199) && n6 < (2320 & -14821) && this.Method_15611()) {
                List list = this.Field_15598.Method_24694(this);
                int n8 = list.indexOf(this);
                list.remove(this);
                list.add(n8 - (-28413 & 9733), this);
                this.Field_15598.Method_24705();
                return (1 & 8247) != 0;
            }
            if (n5 > (4177 & 412) && n6 > (1168 & 21104) && this.Method_15614()) {
                List list = this.Field_15598.Method_24694(this);
                int n9 = list.indexOf(this);
                list.remove(this);
                list.add(n9 + (713 & -32491), this);
                this.Field_15598.Method_24705();
                return (2567 & -32639) != 0;
            }
        }
        return (-32399 & 5128) != 0;
    }

    protected abstract int Method_15617();

    public void Method_15618(int n, int n2, int n3, int n4, int n5, int n6) {
    }
}

