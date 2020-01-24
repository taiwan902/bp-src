/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.EXTFramebufferObject
 *  internal.org.lwjgl.opengl.GL11
 *  internal.org.lwjgl.opengl.GL20
 *  internal.org.lwjgl.opengl.GL30
 */
import internal.org.lwjgl.opengl.EXTFramebufferObject;
import internal.org.lwjgl.opengl.GL11;
import internal.org.lwjgl.opengl.GL20;
import internal.org.lwjgl.opengl.GL30;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.IntBuffer;

public class Class_25377 {
    private static final Class_2080 Field_25378 = new Class_2080(Class_25377.Method_25398("\u4238\u4228\u4236\u423a\u4238\u423e\u422a\u423c\u422a\u4220\u4228\u4232\u422c\u4230\u423e\u4228\u4238\u4232\u423a\u4200\u422c\u4232\u422c\u422a\u4234\u4238\u4238\u4226\u423a\u4232"));

    public static void Method_25379(Class_22849 class_22849, int n, float f, long l) {
        if (Class_12440.Field_12680 > 0 && (Class_12440.Field_12455 -= 16523 & 1029) <= 0) {
            Class_18 class_18 = Class_18.Field_89;
            class_18.Field_25.Method_2783("shadow pass");
            Class_24997 class_24997 = class_18.Field_33;
            Class_12440.Field_12441 = 1 & 12581;
            Class_12440.Field_12455 = Class_12440.Field_12599;
            Class_12440.Field_12509 = class_18.Field_84.Field_39802;
            class_18.Field_84.Field_39802 = 717 & 17409;
            Class_12440.Method_12988("pre shadow");
            GL11.glMatrixMode((int)(5921 & -8375));
            GL11.glPushMatrix();
            GL11.glMatrixMode((int)(5888 & 5968));
            GL11.glPushMatrix();
            class_18.Field_25.Method_2783("shadow clear");
            EXTFramebufferObject.glBindFramebufferEXT((int)(-66859072 & 39882084), (int)Class_12440.Field_12470);
            Class_12440.Method_12988("shadow bind sfb");
            Class_12440.Method_12981(1054 & 127);
            class_18.Field_25.Method_2783("shadow camera");
            class_22849.Method_22949(f, 16422 & 14338);
            Class_12440.Method_12972(f);
            Class_41473.Method_41487(class_18.Field_48, (class_18.Field_84.Field_39802 == (394 & -32765) ? -20471 & 545 : 15875 & 192) != 0, f);
            Class_12440.Method_12988("shadow camera");
            GL20.glDrawBuffers((IntBuffer)Class_12440.Field_12577);
            Class_12440.Method_12988("shadow drawbuffers");
            GL11.glReadBuffer((int)(12292 & 1683));
            Class_12440.Method_12988("shadow readbuffer");
            EXTFramebufferObject.glFramebufferTexture2DEXT((int)(2021829962 & 51482464), (int)(-1543402239 & 1129353000), (int)(-21023 & 24035), (int)Class_12440.Field_12579.get(20484 & 2363), (int)(-32768 & 2561));
            if (Class_12440.Field_12542 != 0) {
                EXTFramebufferObject.glFramebufferTexture2DEXT((int)(-1793028254 & 173718856), (int)(-1023361824 & 805474025), (int)(-4111 & 7649), (int)Class_12440.Field_12532.get(24579 & 348), (int)(1028 & -15863));
            }
            Class_12440.Method_12923("shadow fb");
            GL11.glClearColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glClear((int)(Class_12440.Field_12542 != 0 ? 26058 & 21248 : 3330 & 25345));
            Class_12440.Method_12988("shadow clear");
            class_18.Field_25.Method_2783("shadow frustum");
            Class_13481 class_13481 = Class_23485.Method_23497();
            class_18.Field_25.Method_2783("shadow culling");
            Class_34375 class_34375 = new Class_34375(class_13481);
            Class_1061 class_1061 = class_18.Method_246();
            double d = class_1061.Field_1126 + (class_1061.Field_1130 - class_1061.Field_1126) * (double)f;
            double d2 = class_1061.Field_1102 + (class_1061.Method_1324() - class_1061.Field_1102) * (double)f;
            double d3 = class_1061.Field_1125 + (class_1061.Field_1106 - class_1061.Field_1125) * (double)f;
            class_34375.Method_34387(d, d2, d3);
            Class_16867.Method_16972(7441 & 32197);
            Class_16867.Method_16927();
            Class_16867.Method_16936(-32249 & 5763);
            Class_16867.Method_16930((-31727 & 647) != 0);
            Class_16867.Method_16923((-10175 & 155) != 0, (1025 & -10023) != 0, (27653 & -28543) != 0, (-32639 & 27201) != 0);
            Class_16867.Method_16969();
            class_18.Field_25.Method_2783("shadow prepareterrain");
            class_18.Method_253().Method_34707(Class_24069.Field_24084);
            class_18.Field_25.Method_2783("shadow setupterrain");
            int n2 = 1185 & -31992;
            n2 = class_22849.Field_22923;
            class_22849.Field_22923 = n2 + (2839 & -31551);
            class_24997.Method_25093(class_1061, f, class_34375, n2, class_18.Field_48.\u0000c_());
            class_18.Field_25.Method_2783("shadow updatechunks");
            class_18.Field_25.Method_2783("shadow terrain");
            Class_16867.Method_16934(-24830 & 30464);
            Class_16867.Method_16961();
            Class_16867.Method_16985();
            class_24997.Method_25099(Class_17531.Field_17532, f, -32766 & 5154, class_1061);
            Class_12440.Method_12988("shadow terrain solid");
            Class_16867.Method_16913();
            class_24997.Method_25099(Class_17531.Field_17539, f, 20482 & -21182, class_1061);
            Class_12440.Method_12988("shadow terrain cutoutmipped");
            class_18.Method_253().Method_34709(Class_24069.Field_24084).Method_2065((-23550 & 19393) != 0, (8705 & -13230) != 0);
            class_24997.Method_25099(Class_17531.Field_17538, f, 5810 & 6, class_1061);
            Class_12440.Method_12988("shadow terrain cutout");
            class_18.Method_253().Method_34709(Class_24069.Field_24084).Method_2067();
            Class_16867.Method_16972(-16447 & 7424);
            Class_16867.Method_16967(4663 & 19084, 0.030107528f * 3.3214285f);
            Class_16867.Method_16934(7946 & 30549);
            Class_16867.Method_16945();
            Class_16867.Method_16961();
            class_18.Field_25.Method_2783("shadow entities");
            class_24997.Method_25112(class_1061, class_34375, f);
            Class_12440.Method_12988("shadow entities");
            Class_16867.Method_16934(5904 & 24449);
            Class_16867.Method_16945();
            Class_16867.Method_16930((10325 & -31095) != 0);
            Class_16867.Method_16952();
            Class_16867.Method_16979();
            Class_16867.Method_16984(8994 & 24450, 5991 & 25355, 8997 & 1, 139 & 24640);
            Class_16867.Method_16967(21333 & 1540, 0.09102564f * 1.0985916f);
            if (Class_12440.Field_12680 >= (-32502 & 578)) {
                Class_16867.Method_16960(18271445 & -2004319027);
                Class_12440.Method_12988("pre copy shadow depth");
                GL11.glCopyTexSubImage2D((int)(3557 & 8169), (int)(24822 & -32000), (int)(-17405 & 52), (int)(130 & -28575), (int)(912 & 16421), (int)(-29758 & 8), (int)Class_12440.Field_12450, (int)Class_12440.Field_12568);
                Class_12440.Method_12988("copy shadow depth");
                Class_16867.Method_16960(1351650810 & -1593776956);
            }
            Class_16867.Method_16952();
            Class_16867.Method_16930((-32599 & 9731) != 0);
            class_18.Method_253().Method_34707(Class_24069.Field_24084);
            Class_16867.Method_16972(8129 & 7479);
            Class_12440.Method_12988("shadow pre-translucent");
            GL20.glDrawBuffers((IntBuffer)Class_12440.Field_12577);
            Class_12440.Method_12988("shadow drawbuffers pre-translucent");
            Class_12440.Method_12923("shadow pre-translucent");
            if (Class_12440.Method_12774()) {
                class_18.Field_25.Method_2783("shadow translucent");
                class_24997.Method_25099(Class_17531.Field_17537, f, 5127 & 8642, class_1061);
                Class_12440.Method_12988("shadow translucent");
            }
            Class_16867.Method_16972(7431 & -8256);
            Class_16867.Method_16930((-32767 & 1193) != 0);
            Class_16867.Method_16979();
            Class_16867.Method_16952();
            GL11.glFlush();
            Class_12440.Method_12988("shadow flush");
            Class_12440.Field_12441 = 14784 & 28;
            class_18.Field_84.Field_39802 = Class_12440.Field_12509;
            class_18.Field_25.Method_2783("shadow postprocess");
            if (Class_12440.Field_12606) {
                if (Class_12440.Field_12680 >= (16499 & 4489)) {
                    if (Class_12440.Field_12707[13392 & 2574]) {
                        Class_16867.Method_16960(1145611726 & -1598962491);
                        Class_16867.Method_16963(Class_12440.Field_12579.get(16384 & -32696));
                        GL30.glGenerateMipmap((int)(-29209 & 32737));
                        GL11.glTexParameteri((int)(3573 & 32233), (int)(26673 & 10881), (int)(Class_12440.Field_12656[16640 & 24] ? 26528 & -16636 : 26371 & -22709));
                    }
                    if (Class_12440.Field_12680 >= (8450 & 4114) && Class_12440.Field_12707[1 & 4425]) {
                        Class_16867.Method_16960(1342217711 & 2139845);
                        Class_16867.Method_16963(Class_12440.Field_12579.get(2313 & -24511));
                        GL30.glGenerateMipmap((int)(-21023 & 7665));
                        GL11.glTexParameteri((int)(-8719 & 12259), (int)(30743 & 11049), (int)(Class_12440.Field_12656[18953 & 1091] ? 12064 & -2159 : -6393 & 10011));
                    }
                    Class_16867.Method_16960(-1912162584 & 1080657360);
                }
                if (Class_12440.Field_12542 >= (-32637 & 8297)) {
                    if (Class_12440.Field_12525[-31615 & 24662]) {
                        Class_16867.Method_16960(1615120077 & 495490301);
                        Class_16867.Method_16963(Class_12440.Field_12532.get(-8127 & 1026));
                        GL30.glGenerateMipmap((int)(24043 & 11765));
                        GL11.glTexParameteri((int)(8163 & -20995), (int)(10689 & -17917), (int)(Class_12440.Field_12511[84 & 15619] ? -22638 & 14149 : 14219 & -22717));
                    }
                    if (Class_12440.Field_12542 >= (-28606 & 2346) && Class_12440.Field_12525[545 & 4119]) {
                        Class_16867.Method_16960(620799199 & 1108385518);
                        Class_16867.Method_16963(Class_12440.Field_12532.get(257 & 2075));
                        GL30.glGenerateMipmap((int)(15855 & -12319));
                        GL11.glTexParameteri((int)(7673 & 28135), (int)(-21975 & 30785), (int)(Class_12440.Field_12511[-30639 & 133] ? 10182 & 32545 : 12075 & 26499));
                    }
                    Class_16867.Method_16960(48268483 & -1071870752);
                }
            }
            Class_12440.Method_12988("shadow postprocess");
            EXTFramebufferObject.glBindFramebufferEXT((int)(306505 & 1107856738), (int)Class_12440.Field_12562);
            GL11.glViewport((int)(-28415 & 40), (int)(-32768 & 6), (int)Class_12440.Field_12681, (int)Class_12440.Field_12490);
            Class_12440.Field_12538 = null;
            class_18.Method_253().Method_34707(Class_24069.Field_24084);
            Class_12440.Method_12981(1031 & -32553);
            GL11.glMatrixMode((int)(14126 & 6080));
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)(7939 & 14305));
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)(5920 & -18544));
            Class_12440.Method_12988("shadow end");
        }
    }

    public static void Method_25380() {
        if (Class_12440.Field_12673) {
            Class_12440.Method_12981(-18429 & 16667);
        }
    }

    public static void Method_25381(Class_22849 class_22849, float f, int n) {
        if (!Class_12440.Field_12441 && !Class_12440.Method_12817()) {
            Class_12440.Method_12733();
            Class_16867.Method_16947();
            Class_12440.Method_12833((12425 & -32763) != 0);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            class_22849.Method_22987(f, n, (-31825 & 17425) != 0, (-24192 & 16451) != 0, (5 & 547) != 0);
            Class_12440.Method_12979();
            Class_12440.Method_12823((1089 & 8473) != 0);
        }
    }

    public static void Method_25382() {
        int n = 16414 & 5646;
        GL11.glVertexPointer((int)(-32765 & 8135), (int)(5198 & -18906), (int)(-7304 & 6202), (long)(1429734283L & -590867711098040284L));
        GL11.glColorPointer((int)(901 & 21510), (int)(21513 & 5649), (int)(2104 & 957), (long)(71894540L & 134369597L));
        GL11.glTexCoordPointer((int)(16386 & 9866), (int)(7254 & -11258), (int)(19066 & 12729), (long)(338247929L & 6150616050925971728L));
        Class_32876.Method_32970(Class_32876.Field_32911);
        GL11.glTexCoordPointer((int)(16966 & 6450), (int)(5995 & 15490), (int)(-32200 & 1080), (long)(35752696L & 1208238104L));
        Class_32876.Method_32970(Class_32876.Field_32931);
        GL11.glNormalPointer((int)(-27455 & 5132), (int)(-26564 & 1082), (long)(-4599913513067065252L & 922748829L));
        GL20.glVertexAttribPointer((int)Class_12440.Field_12652, (int)(16386 & -23542), (int)(-17081 & 5670), (17729 & 8322) != 0, (int)(18044 & 186), (long)(4498157049107989536L & -4498157050717859354L));
        GL20.glVertexAttribPointer((int)Class_12440.Field_12609, (int)(140 & 6), (int)(5987 & -27518), (2609 & 1152) != 0, (int)(8441 & -31432), (long)(273681080L & 67420456L));
        GL20.glVertexAttribPointer((int)Class_12440.Field_12643, (int)(531 & -23453), (int)(5250 & 5642), (-32638 & 23848) != 0, (int)(16504 & 12474), (long)(-2674133109032550352L & 2674133108001493816L));
    }

    public static void Method_25383() {
        if (Class_12440.Field_12673) {
            Class_12440.Method_12981(-13941 & 12363);
            if (Class_12440.Field_12548[25355 & 15] == Class_12440.Field_12548[24679 & -30449]) {
                Class_12440.Method_12977(Class_12440.Field_12690);
                Class_16867.Method_16930((1024 & 10740) != 0);
            }
        }
    }

    public static void Method_25384(Class_6918 class_6918, float f, boolean bl) {
        Class_12440.Method_12873((-28637 & 11869) != 0);
        Class_16867.Method_16930((11335 & 16529) != 0);
        if (bl) {
            Class_16867.Method_16936(17927 & 13135);
            GL11.glPushMatrix();
            IntBuffer intBuffer = Class_12440.Field_12538;
            Class_12440.Method_12977(Class_12440.Field_12659);
            Class_12440.Field_12676 = -28669 & 18661;
            class_6918.Method_6950(f);
            Class_12440.Field_12676 = 584 & 3344;
            Class_12440.Method_12977(intBuffer);
            GL11.glPopMatrix();
        }
        Class_16867.Method_16936(-32101 & 15139);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_6918.Method_6950(f);
        Class_12440.Method_12873((25729 & 2080) != 0);
    }

    public static void Method_25385() {
        if (Class_12440.Field_12673) {
            if (Class_12440.Method_12959() && Class_12440.Method_12819()) {
                Class_12440.Method_12981(5139 & 2263);
            } else {
                Class_12440.Method_12981(85 & 3354);
            }
        } else {
            Class_12440.Method_12981(-24573 & 19480);
        }
    }

    public static void Method_25386(Class_22849 class_22849, float f, int n) {
        boolean bl;
        if (!Class_12440.Field_12441 && !(bl = Class_12440.Method_12797())) {
            Class_12440.Method_12733();
            Class_12440.Method_12833((14114 & -32764) != 0);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            class_22849.Method_22987(f, n, (453 & 515) != 0, (17028 & 9481) != 0, (9216 & -32632) != 0);
            Class_12440.Method_12979();
            Class_12440.Method_12823((3605 & 1) != 0);
        }
    }

    public static void Method_25387() {
        if (Class_12440.Field_12673) {
            Class_12440.Method_12981(14563 & 18195);
        }
    }

    public static void Method_25388(Class_22849 class_22849, float f, int n) {
        if (!Class_12440.Field_12441) {
            Class_12440.Method_12964();
            class_22849.Method_22987(f, n, (16556 & 0) != 0, (2113 & -27991) != 0, (-32754 & 144) != 0);
            Class_12440.Method_12885();
        }
    }

    public static void Method_25389(Class_17531 class_17531) {
        if (Class_12440.Method_12806(class_17531)) {
            Class_16867.Method_16969();
        }
        if (Class_32876.Method_32939()) {
            GL11.glEnableClientState((int)(1074844021 & 120171637));
            GL20.glEnableVertexAttribArray((int)Class_12440.Field_12652);
            GL20.glEnableVertexAttribArray((int)Class_12440.Field_12609);
            GL20.glEnableVertexAttribArray((int)Class_12440.Field_12643);
        }
    }

    public static void Method_25390(Class_17531 class_17531) {
        if (Class_32876.Method_32939()) {
            GL11.glDisableClientState((int)(2130175 & 1468703093));
            GL20.glDisableVertexAttribArray((int)Class_12440.Field_12652);
            GL20.glDisableVertexAttribArray((int)Class_12440.Field_12609);
            GL20.glDisableVertexAttribArray((int)Class_12440.Field_12643);
        }
        if (Class_12440.Method_12806(class_17531)) {
            Class_16867.Method_16979();
        }
    }

    public static void Method_25391() {
        Class_12440.Method_12981(14397 & -31535);
    }

    public static void Method_25392(Class_34375 class_34375, double d, double d2, double d3) {
        class_34375.Method_34387(d, d2, d3);
    }

    public static void Method_25393() {
        if (Class_12440.Field_12673) {
            Class_12440.Method_12981(2583 & 24783);
        }
    }

    public static void Method_25394() {
        if (Class_12440.Field_12673) {
            Class_16867.Method_16930((8293 & 20617) != 0);
            Class_12440.Method_12981(22343 & 163);
        }
    }

    public static void Method_25395(Class_24997 class_24997, Class_1061 class_1061, double d, Class_23708 class_23708, int n, boolean bl) {
        class_24997.Method_25093(class_1061, d, class_23708, n, bl);
    }

    public static boolean Method_25396(Class_38552 class_38552, double d, double d2, double d3, float f, int n, float f2) {
        if (!Class_12440.Field_12441 && Class_12440.Field_12548[Class_12440.Field_12498] == 0) {
            return (5186 & -32511) != 0;
        }
        Class_16867.Method_16931();
        Class_19426.Method_19532().Method_34707(Field_25378);
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        class_22385.Method_22417(9759 & 20487, Class_29585.Field_29597);
        float f3 = 0.056603774f * 8.833333f;
        float f4 = f3 * (0.40200004f * 0.37313432f);
        float f5 = f3 * (0.04494382f * 6.675f);
        float f6 = f3 * (0.019277109f * 20.75f);
        float f7 = 0.0f;
        float f8 = 0.114285715f * 1.75f;
        float f9 = (float)(System.currentTimeMillis() % (72470176L & 27363058L)) / (80000.0f * 1.25f);
        int n2 = -7952 & 5374;
        class_22385.Method_22443(d, d2 + (double)f2, d3 + 1.0).Method_22427(f4, f5, f6, 1.0f).Method_22433(f7 + f9, f7 + f9).Method_22418(n2, n2).Method_22451();
        class_22385.Method_22443(d + 1.0, d2 + (double)f2, d3 + 1.0).Method_22427(f4, f5, f6, 1.0f).Method_22433(f7 + f9, f8 + f9).Method_22418(n2, n2).Method_22451();
        class_22385.Method_22443(d + 1.0, d2 + (double)f2, d3).Method_22427(f4, f5, f6, 1.0f).Method_22433(f8 + f9, f8 + f9).Method_22418(n2, n2).Method_22451();
        class_22385.Method_22443(d, d2 + (double)f2, d3).Method_22427(f4, f5, f6, 1.0f).Method_22433(f8 + f9, f7 + f9).Method_22418(n2, n2).Method_22451();
        class_7644.Method_7647();
        Class_16867.Method_16918();
        return (16961 & -25341) != 0;
    }

    private void Method_25397() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_25398(String string) {
        int n = 3905;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25377.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_25399() {
        if (Class_12440.Field_12673) {
            Class_12440.Field_12653 = 8193 & 65;
            Class_12440.Method_12981(3127 & 28879);
        }
    }

    public static void Method_25400() {
        if (Class_12440.Field_12673) {
            Class_12440.Method_12981(4367 & -22457);
        }
    }

    public static void Method_25401() {
        if (Class_12440.Field_12673) {
            Class_12440.Method_12981(4576 & -16376);
        }
    }
}

