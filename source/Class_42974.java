/*
 * Decompiled with CFR 0.145.
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;

public class Class_42974
extends Class_42759 {
    private boolean Field_42975;
    private int Field_42976;
    private byte[] Field_42977 = new byte[28 & 18729];
    private Boolean Field_42978;
    private long Field_42979 = -1630888325000589306L & 1630888323771812633L;
    private boolean Field_42980;
    private static final char[] Field_42981 = Class_42974.Method_42983("\ud423\ud422\ud423\ud422\ud423\ud422\ud423\ud422\ud42b\ud42a\ud468\ud46b\ud468\ud46b\ud468\ud46b").toCharArray();
    private int Field_42982 = 22659 & 9;

    private static String Method_42983(String string) {
        int n = 4627;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42974.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_42984() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static String Method_42985(byte[] arrby) {
        char[] arrc = new char[arrby.length * (19203 & -23505)];
        for (int i = 1040 & 4160; i < arrby.length; ++i) {
            int n = arrby[i] & (-31489 & 255);
            arrc[i * (8739 & 3475)] = Field_42981[n >>> (-1004 & 580)];
            arrc[i * (26115 & -32505) + (19537 & -20465)] = Field_42981[n & (527 & 17679)];
            arrc[i * (1295 & 16403) + (12731 & 1538)] = -30552 & 4647;
        }
        return new String(arrc);
    }

    protected void Method_42986(Class_39158 class_39158, Class_22553 class_22553, List list) {
        Object object;
        if (!this.Field_42975 && class_39158.Method_39175().attr(Class_44584.Field_44601).Method_34812() == Class_11271.Field_11274) {
            this.Field_42975 = 2081 & 131;
        }
        if (!class_22553.Method_22583()) {
            return;
        }
        if (!this.Field_42975) {
            list.add(class_22553.Method_22601(class_22553.Method_22564()));
            return;
        }
        if (this.Field_42978 == null) {
            object = (Class_29733)class_39158.Method_39175().attr(Class_10188.Field_10189).Method_34812();
            this.Field_42978 = (object != null && ((Class_29733)object).Field_29745 ? 4365 & 3665 : 3152 & 16393) != 0;
        }
        try {
            if (this.Field_42978.booleanValue()) {
                byte[] arrby;
                this.Field_42976 += 16947 & 261;
                object = new Class_29900(class_22553);
                ((Class_29900)object).Method_29945();
                int n = ((Class_29900)object).Method_30004();
                String string = null;
                if (n == (639 & 26047)) {
                    string = ((Class_29900)object).Method_29991(32767 & 32767);
                }
                if (this.Field_42976 > (14653 & 692)) {
                    if (System.currentTimeMillis() - this.Field_42979 > (-8159191219144988848L & 537147292L)) {
                        this.Field_42979 = System.currentTimeMillis();
                        Class_47033.Method_47059(new Class_20760(Class_2205.Field_2210, "no packet recieved " + ((Class_29733)class_39158.Method_39175().attr((Class_28213)Class_10188.Field_10189).Method_34812()).Field_29737));
                    }
                    throw new IOException("Packet was smaller then I expceted");
                }
                int n2 = 9474 & 2124;
                if (n == (2943 & 21567) && "MC|SUZI_GSXR_1000_K5".equals(string)) {
                    n2 = 23601 & -32763;
                    byte[] arrby2 = new byte[((Class_29900)object).Method_30014()];
                    ((Class_29900)object).Method_29904(arrby2);
                    if (arrby2.length == 0) {
                        if (this.Field_42980) {
                            Class_47033.Method_47059(new Class_20760(Class_2205.Field_2210, "double reset " + ((Class_29733)class_39158.Method_39175().attr((Class_28213)Class_10188.Field_10189).Method_34812()).Field_29737));
                            throw new IOException("Packet was larger then I expceted");
                        }
                        this.Field_42980 = 12933 & 17777;
                        this.Field_42976 = 512 & 26649;
                        this.Field_42982 = 4691 & -21363;
                        this.Field_42977 = new byte[12505 & 10];
                    } else if (this.Field_42976 % (4157 & -32204) == 0) {
                        if (!Arrays.equals(arrby2, this.Field_42977)) {
                            Class_47033.Method_47059(new Class_20760(Class_2205.Field_2210, "invalid checksum " + ((Class_29733)class_39158.Method_39175().attr((Class_28213)Class_10188.Field_10189).Method_34812()).Field_29737));
                            throw new IOException("Packet was larger then I expected");
                        }
                        this.Field_42976 = -1 & -1;
                    } else {
                        Class_47033.Method_47059(new Class_20760(Class_2205.Field_2210, "interval not synchronized " + ((Class_29733)class_39158.Method_39175().attr((Class_28213)Class_10188.Field_10189).Method_34812()).Field_29737));
                        throw new IOException("Packet was larger then I expected");
                    }
                    return;
                }
                ((Class_29900)object).Method_29937();
                this.Field_42982 += -24493 & 16513;
                int n3 = ((Class_29900)object).Method_30014();
                if (n3 > (3097 & -24276)) {
                    arrby = new byte[2057 & 520];
                    int n4 = n3 - (-16374 & 13468);
                    if (n4 > (-32598 & 1026)) {
                        n4 = 66 & 17927;
                    }
                    ((Class_29900)object).Method_29919(((Class_29900)object).Method_30005() + n4, arrby);
                } else {
                    arrby = new byte[n3];
                    ((Class_29900)object).Method_29919(((Class_29900)object).Method_30005(), arrby);
                }
                String string2 = Class_42974.Method_42985(this.Field_42977);
                for (int i = 17412 & -24383; i < arrby.length; ++i) {
                    byte[] arrby3 = this.Field_42977;
                    int n5 = i;
                    arrby3[n5] = (byte)(arrby3[n5] + arrby[arrby.length - i - (1 & 8345)]);
                }
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        list.add(class_22553.Method_22636().Method_22637());
        class_22553.Method_22609(class_22553.Method_22582());
    }
}

