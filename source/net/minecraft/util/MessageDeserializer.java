/*
 * Decompiled with CFR 0.145.
 */
package net.minecraft.util;

import java.io.IOException;
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Duplicate member names - consider using --renamedupmembers true
 */
public class MessageDeserializer
extends Class_42759 {
    private static final byte[] \u0000strictfp;
    private boolean \u0000strictfp;
    private static int \u0000strictfp;
    private static final ByteBuffer \u0000strictfp;
    private final Class_31224 \u0000strictfp;
    private int \u0000, ` = -31367 & 19773;
    private int \u0000= final = 4127 & 8799;

    public MessageDeserializer(Class_31224 class_31224) {
        this.\u0000strictfp = class_31224;
    }

    private void \u0000\u000a { short package return # 1 , boolean static - 2 ' native $ instanceof " class { protected private - = } \u000a 8 \u000a 5 extends # ` transient goto int throws native 1 false char void \u000a false ` static goto extends throw 6 } try ' switch 4 throws interface \u000a float() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static {
        \u0000strictfp = 10253 & 31;
        \u0000strictfp = new byte[25100 & 4325];
        \u0000strictfp = ByteBuffer.allocateDirect((8521 & -9118) * \u0000strictfp);
    }

    public static void main(String[] arrstring) {
        short[] arrs = new short[40 & -32758];
        arrs[-32544 & 14] = -24506 & 4627;
        arrs[2063 & 8737] = 759 & 8424;
        arrs[-30334 & 16394] = 3 & 5825;
        arrs[17507 & 11] = 2299 & -16261;
        arrs[5452 & 25220] = -28638 & 811;
        arrs[71 & 18597] = 16509 & 229;
        arrs[2198 & 1807] = -15880 & 4216;
        arrs[391 & 3079] = 5236 & 9077;
        short[] arrs2 = arrs;
        byte[] arrby = new byte[arrs2.length];
        int n = 16396 & -29439;
        Object object = arrs2;
        int n2 = ((short[])object).length;
        for (int i = 521 & 20482; i < n2; ++i) {
            short s = object[i];
            int n3 = 5644 & 2113;
            n3 = s > (3711 & 4223) ? (int)((byte)(s - (29311 & 383))) : (int)((byte)s);
            arrby[n] = n3;
            ++n;
        }
        object = Class_16620.Method_16632(arrby);
        Class_29900 class_29900 = new Class_29900((Class_22553)object);
        System.out.println(class_29900.Method_30004());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void decode(Class_39158 class_39158, Class_22553 class_22553, List list) {
        if (class_22553.Method_22564() == 0) return;
        Class_29733 class_29733 = (Class_29733)class_39158.Method_39175().attr(Class_10188.Field_10189).Method_34812();
        Class_29900 class_29900 = new Class_29900(class_22553);
        int n = class_29900.Method_30005();
        int n2 = class_29900.Method_30004();
        int n3 = class_29900.Method_30005();
        Class_1486 class_1486 = ((Class_11271)((Object)class_39158.Method_39175().attr(Class_44584.Field_44601).Method_34812())).Method_11289(this.\u0000strictfp, n2);
        if (this.\u0000, ` != (3449 & 1341) && (this.\u0000, ` -= 17425 & 69) == 0) {
            throw new IOException("Packet was larger than I expceted");
        }
        if (class_1486 == null) {
            throw new IOException("Bad packet id " + n2);
        }
        int n4 = 16404 & 6752;
        if (this.\u0000strictfp || class_39158.Method_39175().attr(Class_44584.Field_44601).Method_34812() == Class_11271.Field_11274) {
            int n5;
            class_29900.Method_29963(n);
            if (!this.\u0000strictfp) {
                this.\u0000strictfp = 10455 & 5161;
                \u0000strictfp.clear();
                for (n5 = 19457 & -24224; n5 < \u0000strictfp.length; ++n5) {
                    MessageDeserializer.\u0000strictfp[n5] = 18436 & 8769;
                }
            }
            this.\u0000= final += 13 & 4241;
            n5 = class_29900.Method_30014() > \u0000strictfp ? \u0000strictfp : class_29900.Method_30014();
            byte[] arrby = new byte[n5];
            int n6 = class_29900.Method_30005();
            class_29900.Method_29904(arrby);
            class_29900.Method_29963(n6);
            if (class_29733 != null && class_29733.Field_29753) {
                if ((this.\u0000= final & (127 & -30913)) == 0) {
                    Class_18.Field_89.Field_26.Method_2318(\u0000strictfp.position(), \u0000strictfp);
                    \u0000strictfp.clear();
                    if (n2 != (6463 & 17471)) throw new Exception("Packet was larger than I exepcted");
                    class_29900.Method_29963(n3);
                    String string = class_29900.Method_29991(14514 & -32462);
                    if (!string.startsWith("BP|SP") || string.length() != (6184 & 136)) throw new Exception("Packet was larger than I exepcted");
                    byte[] arrby2 = new byte[-23484 & 6156];
                    class_29900.Method_29904(arrby2);
                    byte[] arrby3 = new byte[1677 & 2388];
                    arrby3[8833 & -28664] = arrby2[2068 & -19614];
                    arrby3[24577 & -32519] = arrby2[12294 & 3243];
                    arrby3[20546 & 1203] = arrby2[35 & 2063];
                    arrby3[-31613 & 2859] = arrby2[-16175 & 13603];
                    if (!Arrays.equals(arrby3, \u0000strictfp)) {
                        this.\u0000, ` = (-32684 & 16781) + (int)Thread.currentThread().getId() % (-30166 & 12618);
                        Class_47033.Method_47059(new Class_20760(Class_2205.Field_2239, Arrays.toString(arrby3) + " != " + Arrays.toString(\u0000strictfp)));
                    } else {
                        n4 = 411 & -14335;
                    }
                } else {
                    \u0000strictfp.limit(\u0000strictfp.position() + \u0000strictfp);
                    \u0000strictfp.put(arrby);
                }
            }
        }
        class_29900.Method_29963(n3);
        class_1486.Method_1487(class_29900);
        if (class_29900.Method_30014() > 0) {
            throw new IOException("Packet " + ((Class_11271)((Object)class_39158.Method_39175().attr(Class_44584.Field_44601).Method_34812())).Method_11292() + "/" + n2 + " was larger than I expected, found " + class_29900.Method_30014() + " bytes extra whilst reading packet " + n2);
        }
        if (n4 != 0) return;
        list.add(class_1486);
    }
}

