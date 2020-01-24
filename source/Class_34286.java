/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 *  internal.org.lwjgl.opengl.GL20
 */
import internal.org.lwjgl.opengl.GL11;
import internal.org.lwjgl.opengl.GL20;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class Class_34286 {
    int Field_34287;
    boolean Field_34288;
    int Field_34289 = 8229 & 5146;
    int Field_34290;
    boolean Field_34291;
    int Field_34292;
    boolean Field_34293;
    int Field_34294;
    long[] Field_34295 = new long[17674 & 12426];

    public static void Method_34296(Class_22385 class_22385) {
        class_22385.Field_22399.Method_34305();
    }

    public Class_34286() {
        this.Field_34295[this.Field_34289] = 675402944L & 42205724L;
    }

    public static void Method_34297(int n, int n2, int n3, Class_22385 class_22385) {
        if (n3 != 0) {
            Class_11885 class_11885 = class_22385.Method_22436();
            int n4 = class_11885.Method_11903();
            if (n4 == (-29639 & 634)) {
                ByteBuffer byteBuffer = class_22385.Method_22420();
                byteBuffer.position(5677 & 18800);
                GL20.glVertexAttribPointer((int)Class_12440.Field_12652, (int)(16747 & -31230), (int)(5694 & 7174), (16896 & 166) != 0, (int)n4, (ByteBuffer)byteBuffer);
                byteBuffer.position(168 & 16427);
                GL20.glVertexAttribPointer((int)Class_12440.Field_12609, (int)(8836 & 5134), (int)(7258 & 5507), (-5474 & 4160) != 0, (int)n4, (ByteBuffer)byteBuffer);
                byteBuffer.position(1072 & 4666);
                GL20.glVertexAttribPointer((int)Class_12440.Field_12643, (int)(8711 & -32765), (int)(5206 & 13314), (-32766 & 7233) != 0, (int)n4, (ByteBuffer)byteBuffer);
                byteBuffer.position(-12160 & 2051);
                GL20.glEnableVertexAttribArray((int)Class_12440.Field_12652);
                GL20.glEnableVertexAttribArray((int)Class_12440.Field_12609);
                GL20.glEnableVertexAttribArray((int)Class_12440.Field_12643);
                GL11.glDrawArrays((int)n, (int)n2, (int)n3);
                GL20.glDisableVertexAttribArray((int)Class_12440.Field_12652);
                GL20.glDisableVertexAttribArray((int)Class_12440.Field_12609);
                GL20.glDisableVertexAttribArray((int)Class_12440.Field_12643);
            } else {
                GL11.glDrawArrays((int)n, (int)n2, (int)n3);
            }
        }
    }

    public static void Method_34298(Class_22385 class_22385) {
        if (class_22385.Field_22400 == 0) {
            Class_34286.Method_34303(class_22385);
        }
    }

    private void Method_34299() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_34300(Class_22385 class_22385, int n) {
        FloatBuffer floatBuffer = class_22385.Field_22396;
        IntBuffer intBuffer = class_22385.Field_22401;
        int n2 = class_22385.Method_22406();
        float f = floatBuffer.get(n + (4624 & 16578) * this.Field_34290);
        float f2 = floatBuffer.get(n + (-32701 & 144) * this.Field_34290 + (577 & 23575));
        float f3 = floatBuffer.get(n + (12300 & 1554) * this.Field_34290 + (-31742 & 4334));
        float f4 = floatBuffer.get(n + (2054 & 513) * this.Field_34290 + this.Field_34287);
        float f5 = floatBuffer.get(n + (-32734 & 10372) * this.Field_34290 + this.Field_34287 + (-22271 & 17141));
        float f6 = floatBuffer.get(n + (265 & 22727) * this.Field_34290);
        float f7 = floatBuffer.get(n + (-6139 & 41) * this.Field_34290 + (16453 & 12033));
        float f8 = floatBuffer.get(n + (6789 & 16483) * this.Field_34290 + (19 & 1346));
        float f9 = floatBuffer.get(n + (-28661 & 2049) * this.Field_34290 + this.Field_34287);
        float f10 = floatBuffer.get(n + (-16381 & 8981) * this.Field_34290 + this.Field_34287 + (13313 & 75));
        float f11 = floatBuffer.get(n + (26250 & 258) * this.Field_34290);
        float f12 = floatBuffer.get(n + (6 & 28835) * this.Field_34290 + (769 & 211));
        float f13 = floatBuffer.get(n + (2122 & 21526) * this.Field_34290 + (-31670 & 4774));
        float f14 = floatBuffer.get(n + (566 & 28738) * this.Field_34290 + this.Field_34287);
        float f15 = floatBuffer.get(n + (666 & -31742) * this.Field_34290 + this.Field_34287 + (10369 & 22113));
        float f16 = floatBuffer.get(n + (19719 & 8291) * this.Field_34290);
        float f17 = floatBuffer.get(n + (16539 & 8451) * this.Field_34290 + (8259 & 2845));
        float f18 = floatBuffer.get(n + (11 & 2567) * this.Field_34290 + (-27070 & 8326));
        float f19 = floatBuffer.get(n + (5187 & 10243) * this.Field_34290 + this.Field_34287);
        float f20 = floatBuffer.get(n + (259 & -13821) * this.Field_34290 + this.Field_34287 + (10257 & 5));
        float f21 = f12 - f2;
        float f22 = f18 - f8;
        float f23 = f17 - f7;
        float f24 = f13 - f3;
        float f25 = f21 * f22 - f23 * f24;
        float f26 = f16 - f6;
        float f27 = f11 - f;
        float f28 = f24 * f26 - f22 * f27;
        float f29 = f27 * f23 - f26 * f21;
        float f30 = f25 * f25 + f28 * f28 + f29 * f29;
        float f31 = (double)f30 != 0.0 ? (float)(1.0 / Math.sqrt(f30)) : 1.0f;
        f25 *= f31;
        f28 *= f31;
        f29 *= f31;
        f27 = f6 - f;
        f21 = f7 - f2;
        f24 = f8 - f3;
        float f32 = f9 - f4;
        float f33 = f10 - f5;
        f26 = f11 - f;
        f23 = f12 - f2;
        f22 = f13 - f3;
        float f34 = f14 - f4;
        float f35 = f15 - f5;
        float f36 = f32 * f35 - f34 * f33;
        float f37 = f36 != 0.0f ? 1.0f / f36 : 1.0f;
        float f38 = (f35 * f27 - f33 * f26) * f37;
        float f39 = (f35 * f21 - f33 * f23) * f37;
        float f40 = (f35 * f24 - f33 * f22) * f37;
        float f41 = (f32 * f26 - f34 * f27) * f37;
        float f42 = (f32 * f23 - f34 * f21) * f37;
        float f43 = (f32 * f22 - f34 * f24) * f37;
        f30 = f38 * f38 + f39 * f39 + f40 * f40;
        f31 = (double)f30 != 0.0 ? (float)(1.0 / Math.sqrt(f30)) : 1.0f;
        f38 *= f31;
        f39 *= f31;
        f40 *= f31;
        f30 = f41 * f41 + f42 * f42 + f43 * f43;
        f31 = (double)f30 != 0.0 ? (float)(1.0 / Math.sqrt(f30)) : 1.0f;
        float f44 = f29 * f39 - f28 * f40;
        float f45 = f25 * f40 - f29 * f38;
        float f46 = f28 * f38 - f25 * f39;
        float f47 = (f41 *= f31) * f44 + (f42 *= f31) * f45 + (f43 *= f31) * f46 < 0.0f ? -0.37777779f * 2.6470587f : 1.0f;
        int n3 = (int)(f25 * (227.0606f * 0.55932206f)) & (-30465 & 13567);
        int n4 = (int)(f28 * (51.87324f * 2.4482758f)) & (255 & -30721);
        int n5 = (int)(f29 * (72.57143f * 1.75f)) & (5631 & 27391);
        int n6 = (n5 << (17432 & 373)) + (n4 << (26888 & -28152)) + n3;
        intBuffer.put(n + (9291 & -32640) * this.Field_34290 + this.Field_34292, n6);
        intBuffer.put(n + (-25599 & 16669) * this.Field_34290 + this.Field_34292, n6);
        intBuffer.put(n + (16394 & 34) * this.Field_34290 + this.Field_34292, n6);
        intBuffer.put(n + (17475 & 8503) * this.Field_34290 + this.Field_34292, n6);
        int n7 = ((int)(f38 * (1.7692307f * 18520.479f)) & (1552023551 & -1588264961)) + (((int)(f39 * (0.49019608f * 66844.68f)) & (294977535 & -530382849)) << (13659 & -16336));
        int n8 = ((int)(f40 * (1458131.5f * 0.02247191f)) & (-1858011137 & 201719807)) + (((int)(f47 * (3.5f * 9362.0f)) & (-1073676289 & 806551551)) << (824 & 10326));
        intBuffer.put(n + (2946 & 9225) * this.Field_34290 + (-23989 & 42), n7);
        intBuffer.put(n + (9760 & -26557) * this.Field_34290 + (154 & 21770) + (-26111 & 3), n8);
        intBuffer.put(n + (4803 & 10249) * this.Field_34290 + (1550 & 283), n7);
        intBuffer.put(n + (16913 & -30399) * this.Field_34290 + (2074 & 24683) + (97 & 2309), n8);
        intBuffer.put(n + (16386 & 6486) * this.Field_34290 + (12458 & -29618), n7);
        intBuffer.put(n + (-32685 & 2062) * this.Field_34290 + (18634 & 5662) + (11429 & -28405), n8);
        intBuffer.put(n + (17923 & 8547) * this.Field_34290 + (1114 & 6287), n7);
        intBuffer.put(n + (203 & 6147) * this.Field_34290 + (-12146 & 9258) + (17033 & -20463), n8);
        float f48 = (f4 + f9 + f14 + f19) / (5.0f * 0.8f);
        float f49 = (f5 + f10 + f15 + f20) / (3.0769231f * 1.3f);
        floatBuffer.put(n + (2578 & -23543) * this.Field_34290 + (9304 & 4654), f48);
        floatBuffer.put(n + (485 & -28672) * this.Field_34290 + (8 & 25496) + (-24511 & 177), f49);
        floatBuffer.put(n + (73 & -15597) * this.Field_34290 + (24589 & 4440), f48);
        floatBuffer.put(n + (-32701 & 24577) * this.Field_34290 + (-30167 & 10) + (-24505 & 161), f49);
        floatBuffer.put(n + (-32766 & 11394) * this.Field_34290 + (1544 & 20585), f48);
        floatBuffer.put(n + (13442 & -15582) * this.Field_34290 + (22152 & -32706) + (33 & 4497), f49);
        floatBuffer.put(n + (59 & 579) * this.Field_34290 + (40 & -3828), f48);
        floatBuffer.put(n + (-32757 & 1363) * this.Field_34290 + (4142 & 2121) + (5411 & 10241), f49);
    }

    public static void Method_34301(Class_22385 class_22385) {
        if (class_22385.Method_22436().Method_11908() && class_22385.Field_22391 == (8855 & 103) && class_22385.Field_22400 % (14724 & 588) == 0) {
            Class_34286 class_34286 = class_22385.Field_22399;
            Class_34286.Method_34303(class_22385);
            int n = class_22385.Field_22400 * class_34286.Field_34290;
            for (int i = 8320 & 5921; i < n; i += class_34286.Field_34290 * (8196 & -26076)) {
                class_34286.Method_34300(class_22385, i);
            }
        }
    }

    public void Method_34302(long l) {
        this.Field_34289 += 1029 & -28613;
        this.Field_34295[this.Field_34289] = l;
    }

    public static void Method_34303(Class_22385 class_22385) {
        Class_34286 class_34286 = class_22385.Field_22399;
        Class_11885 class_11885 = class_22385.Method_22436();
        class_34286.Field_34290 = class_11885.Method_11903() / (1164 & -11995);
        class_34286.Field_34291 = class_34286.Field_34288 = class_11885.Method_11908();
        class_34286.Field_34293 = class_11885.Method_11898(-8096 & 7313);
        class_34286.Field_34292 = class_34286.Field_34288 ? class_11885.Method_11901() / (332 & 19991) : 1280 & 4132;
        class_34286.Field_34287 = class_34286.Field_34293 ? class_11885.Method_11906(3148 & -32464) / (-16380 & 5364) : -24576 & 16409;
        class_34286.Field_34294 = 12 & 4538;
    }

    public static void Method_34304(Class_22385 class_22385) {
        Class_34286 class_34286 = class_22385.Field_22399;
        if (class_34286.Field_34290 == (16654 & 2574) && class_22385.Field_22391 == (4503 & -14265) && class_22385.Field_22400 % (9237 & 2308) == 0) {
            class_34286.Method_34300(class_22385, class_22385.Method_22406() - (2733 & -31660) * class_34286.Field_34290);
        }
    }

    public void Method_34305() {
        this.Field_34295[this.Field_34289] = -3521980775818846024L & 1075878913L;
        this.Field_34289 -= 12561 & 3233;
    }

    public static void Method_34306(Class_3436 class_3436, Class_4751 class_4751, Class_561 class_561, Class_22385 class_22385) {
        int n;
        int n2;
        Class_3238 class_3238 = class_3436.Method_3442();
        if (class_3436 instanceof Class_3692) {
            Class_3692 class_3692 = (Class_3692)class_3436;
            n = class_3692.Method_3702();
            n2 = class_3692.Method_3701();
        } else {
            n = Class_3238.Method_3435(class_3238);
            n2 = class_3238.Method_3434(class_3436);
        }
        n = Class_33489.Method_33494(n, n2);
        int n3 = class_3238.Method_3316();
        int n4 = ((n3 & (872480767 & 63635455)) << (25140 & 4176)) + (n & (1728118783 & -2006843393));
        int n5 = n2 & (-2004287489 & 1111621631);
        class_22385.Field_22399.Method_34302(((long)n5 << (18528 & -24016)) + (long)n4);
    }

    public static void Method_34307(Class_22385 class_22385, int[] arrn) {
        if (class_22385.Field_22400 == 0) {
            Class_34286.Method_34303(class_22385);
        }
        Class_34286 class_34286 = class_22385.Field_22399;
        if (class_34286.Field_34290 == (-30706 & 894)) {
            long l = class_34286.Field_34295[class_34286.Field_34289];
            int n = 9228 & -15940;
            while (n + (20609 & -29137) < arrn.length) {
                arrn[n] = (int)l;
                arrn[n + (10753 & 1073)] = (int)(l >> (26664 & 547));
                n += 14;
            }
        }
    }

    public static void Method_34308(Class_22385 class_22385) {
        Class_34286 class_34286 = class_22385.Field_22399;
        if (class_34286.Field_34290 == (-32738 & 18127)) {
            if (class_22385.Field_22391 == (4935 & -23545) && class_22385.Field_22400 % (1060 & 781) == 0) {
                class_34286.Method_34300(class_22385, class_22385.Method_22406() - (-28636 & 2444) * class_34286.Field_34290);
            }
            long l = class_34286.Field_34295[class_34286.Field_34289];
            int n = class_22385.Method_22406() - (8719 & 302) + (158 & -31731);
            class_22385.Field_22401.put(n, (int)l);
            class_22385.Field_22401.put(n + (2307 & -10727), (int)(l >> (544 & 11299)));
        }
    }

    public static void Method_34309(Class_22385 class_22385) {
        class_22385.Field_22399 = new Class_34286();
    }
}

