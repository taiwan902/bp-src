/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_27170
extends Class_1490 {
    private static final Class_2080 Field_27171;
    private static final Logger Field_27172;

    private static String Method_27173(String string) {
        int n = 23243;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27170.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_27174(int n, int n2, float f) {
        this.Method_27177();
        int n3 = (this.\u0000= final - (27134 & 248)) / (-22782 & 16582) + (-24390 & 19727);
        int n4 = (this.\u0000, ` - (246 & 2478)) / (258 & 25735) + (168 & 18968);
        this.\u0000strictfp.Method_28692(Class_9802.Method_9806("demo.help.title", new Object[12340 & -30328]), n3, n4, -1874895009 & 1210007359);
        Class_39702 class_39702 = this.\u0000strictfp.Field_84;
        Object[] arrobject = new Object[-24564 & 4484];
        arrobject[16385 & -25966] = Class_39702.Method_39914(class_39702.Field_39772.Method_8274());
        arrobject[4229 & 51] = Class_39702.Method_39914(class_39702.Field_39726.Method_8274());
        arrobject[8355 & -32766] = Class_39702.Method_39914(class_39702.Field_39803.Method_8274());
        arrobject[71 & -32765] = Class_39702.Method_39914(class_39702.Field_39759.Method_8274());
        this.\u0000strictfp.Method_28692(Class_9802.Method_9806("demo.help.movementShort", arrobject), n3, n4 += 22604 & 543, 309292895 & -1060151473);
        this.\u0000strictfp.Method_28692(Class_9802.Method_9806("demo.help.movementMouse", new Object[-30464 & 4128]), n3, n4 + (19086 & 269), -931147809 & 374300527);
        Object[] arrobject2 = new Object[17153 & 1025];
        arrobject2[-21472 & 16384] = Class_39702.Method_39914(class_39702.Field_39703.Method_8274());
        this.\u0000strictfp.Method_28692(Class_9802.Method_9806("demo.help.jump", arrobject2), n3, n4 + (26651 & -28648), -1605415089 & 1191137231);
        Object[] arrobject3 = new Object[3 & -28483];
        arrobject3[-32760 & 16400] = Class_39702.Method_39914(class_39702.Field_39818.Method_8274());
        this.\u0000strictfp.Method_28692(Class_9802.Method_9806("demo.help.inventory", arrobject3), n3, n4 + (13484 & 16740), 1884249935 & -2073047217);
        this.\u0000strictfp.Method_28688(Class_9802.Method_9806("demo.help.fullWrapped", new Object[3588 & 20608]), n3, n4 + (9814 & 4301), 218 & 1019, 37707551 & -530604257);
        super.Method_1545(n, n2, f);
    }

    public void Method_27175() {
        super.Method_1517();
    }

    protected void Method_27176(Class_42376 class_42376) {
        switch (class_42376.Field_42392) {
            case 1: {
                class_42376.Field_42388 = -32632 & 14436;
                try {
                    Class<?> class_ = Class.forName("java.awt.Desktop");
                    Object object = class_.getMethod("getDesktop", new Class[8352 & 4609]).invoke(null, new Object[6400 & -16285]);
                    Class[] arrclass = new Class[2185 & 20481];
                    arrclass[-32760 & 2432] = URI.class;
                    Object[] arrobject = new Object[-32505 & 2689];
                    arrobject[1776 & 16386] = new URI("http://www.minecraft.net/store?source=demo");
                    class_.getMethod("browse", arrclass).invoke(object, arrobject);
                }
                catch (Throwable throwable) {
                    Field_27172.error("Couldn't open link", throwable);
                }
                break;
            }
            case 2: {
                this.\u0000strictfp.Method_218(null);
                this.\u0000strictfp.Method_269();
            }
        }
    }

    public void Method_27177() {
        super.Method_1527();
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        this.\u0000strictfp.Method_253().Method_34707(Field_27171);
        int n = (this.\u0000= final - (2552 & 8957)) / (1026 & 8898);
        int n2 = (this.\u0000, ` - (1710 & 4326)) / (4803 & -31710);
        this.\u0000strictfp(n, n2, 5000 & 1, 16395 & 10624, 16636 & 3067, 238 & 7590);
    }

    static {
        Field_27172 = LogManager.getLogger();
        Field_27171 = new Class_2080(Class_27170.Method_27173("\uc004\uc005\uc000\uc005\uc004\uc003\uc004\uc003\uc046\uc007\uc004\uc001\uc046\uc005\uc004\uc005\uc006\uc007\uc002\uc001\uc002\uc003\uc006\uc003\uc006\uc005\uc006\uc005\uc046\uc001\uc006\uc007"));
    }

    private void Method_27178() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_27179() {
        this.\u0000strictfp.clear();
        int n = -11 & -16;
        this.\u0000strictfp.add(new Class_42376(-32765 & 8481, this.\u0000= final / (10 & 29186) - (630 & 20596), this.\u0000, ` / (16930 & 1106) + (-28546 & 191) + n, -26885 & 24694, 8222 & -30188, Class_9802.Method_9806("demo.help.buy", new Object[-32448 & 2110])));
        this.\u0000strictfp.add(new Class_42376(21123 & 354, this.\u0000= final / (22667 & 9026) + (16467 & -17918), this.\u0000, ` / (-30718 & 1323) + (1086 & 16702) + n, 3454 & -24462, 9238 & -32708, Class_9802.Method_9806("demo.help.later", new Object[769 & 17416])));
    }
}

