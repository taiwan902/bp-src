/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.apache.commons.io.FilenameUtils
 */
import com.mojang.authlib.GameProfile;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.io.FilenameUtils;

public abstract class Class_1456
extends Class_626 {
    private long Field_1457 = 4658946730728902912L & -4658946732430719886L;
    public Class_2080 Field_1458 = null;
    public Class_9738 Field_1459;
    private AtomicBoolean Field_1460 = new AtomicBoolean((5699 & -32480) != 0);

    public boolean Method_1461() {
        Class_9738 class_9738 = Class_18.Field_89.Method_271().Method_20195(this.\u0000strictfp().getId());
        return (class_9738 != null && class_9738.Method_9754() == Class_35650.Field_35654 ? -32095 & 9483 : -4608 & 268) != 0;
    }

    public Class_2080 Method_1462() {
        if (!Class_19426.Method_19506()) {
            return null;
        }
        if (this.Field_1458 != null && this.Field_1460.get()) {
            return this.Field_1458;
        }
        Class_9738 class_9738 = this.Method_1470();
        return class_9738 == null ? null : class_9738.Method_9779();
    }

    public boolean Method_1463() {
        return (this.Method_1470() != null ? 5 & 5299 : -30588 & 22081) != 0;
    }

    public float Method_1464() {
        float f = 1.0f;
        if (this.\u0000strictfp.Method_18090()) {
            f *= 5.8f * 0.18965517f;
        }
        Class_16547 class_16547 = this.\u0000strictfp(Class_21716.Field_21722);
        f = (float)((double)f * ((class_16547.Method_16554() / (double)this.\u0000strictfp.Method_18101() + 1.0) / (6.0 * 0.3333333333333333)));
        if (this.\u0000strictfp.Method_18101() == 0.0f || Float.isNaN(f) || Float.isInfinite(f)) {
            f = 1.0f;
        }
        if (this.\u0000= 5() && this.\u0000, `().Method_23844() == Class_10527.Field_10690) {
            int n = this.\u0000= float();
            float f2 = (float)n / (0.7804878f * 25.625002f);
            f2 = f2 > 1.0f ? 1.0f : (f2 *= f2);
            f *= 1.0f - f2 * (0.43529412f * 0.3445946f);
        }
        return f;
    }

    public static Class_2080 Method_1465(String string) {
        return new Class_2080("skins/" + Class_35310.Method_35314(string));
    }

    public static BufferedImage Method_1466(BufferedImage bufferedImage) {
        int n;
        int n2 = 240 & 1088;
        int n3 = bufferedImage.getWidth();
        int n4 = bufferedImage.getHeight();
        for (n = 16930 & 8681; n2 < n3 || n < n4; n2 *= 522 & 6279, n *= 16583 & 1034) {
        }
        BufferedImage bufferedImage2 = new BufferedImage(n2, n, 834 & -28654);
        Graphics graphics = bufferedImage2.getGraphics();
        graphics.drawImage(bufferedImage, -30588 & 13408, -24062 & 17456, null);
        graphics.dispose();
        return bufferedImage2;
    }

    public boolean Method_1467() {
        Class_9738 class_9738 = this.Method_1470();
        return (class_9738 != null && class_9738.Method_9762() ? 325 & 513 : 26638 & 1696) != 0;
    }

    public void Method_1468() {
        long l = System.currentTimeMillis();
        if (l - this.Field_1457 < (1258994589L & 76889816L)) {
            return;
        }
        this.Field_1457 = l;
        this.Method_1472(this.\u0000strictfp().getName(), (-31412 & 25122) != 0);
    }

    public static Class_26211 Method_1469(Class_2080 class_2080, String string) {
        Class_34695 class_34695 = Class_18.Field_89.Method_253();
        Class_2062 class_2062 = class_34695.Method_34709(class_2080);
        if (class_2062 == null) {
            Object[] arrobject = new Object[25699 & -32767];
            arrobject[3104 & 518] = Class_35310.Method_35314(string);
            class_2062 = new Class_26211(null, String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", arrobject), Class_13490.Method_13499(Class_1456.\u0000strictfp((String)string)), new Class_15993());
            class_34695.Method_34704(class_2080, class_2062);
        }
        return (Class_26211)class_2062;
    }

    protected Class_9738 Method_1470() {
        if (this.Field_1459 == null) {
            this.Field_1459 = Class_18.Field_89.Method_271().Method_20195(this.\u0000strictfp());
        }
        return this.Field_1459;
    }

    public Class_2080 Method_1471() {
        Class_9738 class_9738 = this.Method_1470();
        return class_9738 == null ? Class_13490.Method_13499(this.\u0000strictfp()) : class_9738.Method_9776();
    }

    private void Method_1472(String string, boolean bl) {
        if (string != null && !string.isEmpty()) {
            Object object;
            string = Class_35310.Method_35314(string);
            String string2 = "http://s.optifine.net/capes/" + string + ".png";
            String string3 = FilenameUtils.getBaseName((String)string2);
            Class_2080 class_2080 = new Class_2080("capeof/" + string3);
            Class_34695 class_34695 = Class_18.Field_89.Method_253();
            Class_2062 class_2062 = class_34695.Method_34709(class_2080);
            if (bl && class_2062 != null && class_2062 instanceof Class_26211) {
                object = (Class_26211)class_2062;
                if (((Class_26211)object).Field_26221 != null) {
                    if (((Class_26211)object).Field_26221.booleanValue()) {
                        this.Field_1458 = class_2080;
                        this.Field_1460.set((2401 & -28669) != 0);
                    }
                    return;
                }
            }
            object = new Class_18331(class_2080, this.Field_1460);
            this.Field_1458 = class_2080;
            Class_26211 class_26211 = new Class_26211(null, string2, null, (Class_7057)object);
            class_34695.Method_34704(class_2080, class_26211);
        }
    }

    public String Method_1473() {
        Class_9738 class_9738 = this.Method_1470();
        return class_9738 == null ? Class_13490.Method_13495(this.\u0000strictfp()) : class_9738.Method_9752();
    }

    public Class_1456(Class_283 class_283, GameProfile gameProfile) {
        super(class_283, gameProfile);
        String string = gameProfile.getName();
        this.Method_1472(string, (-28509 & 329) != 0);
        Class_20842.Method_20848(this);
    }

    private void Method_1474() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

