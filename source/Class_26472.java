/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.FileUtils
 */
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;

public class Class_26472
extends Thread {
    final Class_26211 Field_26473;

    Class_26472(Class_26211 class_26211, String string) {
        this.Field_26473 = class_26211;
        super(string);
    }

    private void Method_26474() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_26475() {
        HttpURLConnection httpURLConnection;
        byte[] arrby;
        block15 : {
            block16 : {
                arrby = this.Field_26473.Method_26225();
                httpURLConnection = null;
                Object[] arrobject = new Object[131 & 2122];
                arrobject[25920 & 561] = Class_26211.Method_26230(this.Field_26473);
                arrobject[8201 & 1345] = Class_26211.Method_26232(this.Field_26473);
                Class_26211.Method_26235().debug("Downloading http texture from {} to {}", arrobject);
                httpURLConnection = (HttpURLConnection)new URL(Class_26211.Method_26230(this.Field_26473)).openConnection(Class_18.Field_89.Method_236());
                httpURLConnection.setDoInput((-14815 & 4107) != 0);
                httpURLConnection.setDoOutput((-32192 & 154) != 0);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() / (-24211 & 21220) == (14598 & 16467)) break block15;
                if (httpURLConnection == null) break block16;
                httpURLConnection.disconnect();
            }
            this.Field_26473.Field_26221 = (Class_26211.Method_26231(this.Field_26473) != null ? 28709 & 1171 : -29440 & 513) != 0;
            return;
        }
        try {
            BufferedImage bufferedImage;
            if (Class_26211.Method_26232(this.Field_26473) != null) {
                FileUtils.copyInputStreamToFile((InputStream)httpURLConnection.getInputStream(), (File)Class_26211.Method_26232(this.Field_26473));
                bufferedImage = ImageIO.read(Class_26211.Method_26232(this.Field_26473));
            } else {
                bufferedImage = Class_18695.Method_18726(httpURLConnection.getInputStream());
            }
            if (Class_26211.Method_26229(this.Field_26473) && Class_26211.Method_26228(this.Field_26473) != null) {
                bufferedImage = Class_26211.Method_26228(this.Field_26473).Method_7059(bufferedImage);
            }
            if (arrby != null) {
                int n;
                Object object;
                int n2;
                Class_11109 class_11109 = new Class_11109(arrby);
                int n3 = bufferedImage.getMinX();
                int n4 = bufferedImage.getMinY();
                int n5 = bufferedImage.getWidth();
                int n6 = bufferedImage.getHeight();
                byte[] arrby2 = new byte[(n5 - n3) * (n6 - n4) * (21652 & 836)];
                int n7 = 96 & 2056;
                for (n = n3; n < n3 + n5; ++n) {
                    for (n2 = n4; n2 < n4 + n6; ++n2) {
                        object = bufferedImage.getRGB(n, n2);
                        Color color = new Color((int)object, (-28031 & 25883) != 0);
                        byte by = (byte)color.getRed();
                        byte by2 = (byte)color.getGreen();
                        byte by3 = (byte)color.getBlue();
                        byte by4 = (byte)color.getAlpha();
                        arrby2[n7++] = by;
                        arrby2[n7++] = by2;
                        arrby2[n7++] = by3;
                        arrby2[n7++] = by4;
                    }
                }
                arrby2 = class_11109.Method_11115(arrby2);
                n7 = 7556 & 113;
                for (n = n3; n < n3 + n5; ++n) {
                    for (n2 = n3; n2 < n4 + n6; ++n2) {
                        object = new Color(arrby2[n7++] & (1535 & 20735), arrby2[n7++] & (-32257 & 8959), arrby2[n7++] & (3327 & 511), arrby2[n7++] & (2303 & 8447));
                        bufferedImage.setRGB(n, n2, ((Color)object).getRGB());
                    }
                }
            }
            this.Field_26473.Method_26224(bufferedImage);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
        catch (Exception exception) {
            block17 : {
                try {
                    Class_26211.Method_26235().error("Couldn't download http texture", (Throwable)exception);
                    if (httpURLConnection == null) break block17;
                    httpURLConnection.disconnect();
                }
                catch (Throwable throwable) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.Field_26473.Field_26221 = (Class_26211.Method_26231(this.Field_26473) != null ? 18589 & -31455 : 9541 & -10184) != 0;
                    throw throwable;
                }
            }
            this.Field_26473.Field_26221 = (Class_26211.Method_26231(this.Field_26473) != null ? 2067 & 8193 : 2072 & -24060) != 0;
            return;
        }
        this.Field_26473.Field_26221 = (Class_26211.Method_26231(this.Field_26473) != null ? 137 & -18315 : -32631 & 26626) != 0;
    }
}

