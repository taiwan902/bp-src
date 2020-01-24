/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_25761
extends Class_23424 {
    private static final Logger Field_25762 = LogManager.getLogger();
    private final Class_2080 Field_25763;
    private final List Field_25764;
    private final List Field_25765;

    public Class_25761(Class_2080 class_2080, List list, List list2) {
        this.Field_25763 = class_2080;
        this.Field_25764 = list;
        this.Field_25765 = list2;
    }

    public void Method_25766(Class_279 class_279) {
        BufferedImage bufferedImage;
        this.\u0000= final();
        try {
            BufferedImage bufferedImage2 = Class_18695.Method_18726(class_279.Method_282(this.Field_25763).Method_9958());
            int n = bufferedImage2.getType();
            if (n == 0) {
                n = 11278 & 390;
            }
            bufferedImage = new BufferedImage(bufferedImage2.getWidth(), bufferedImage2.getHeight(), n);
            Graphics graphics = bufferedImage.getGraphics();
            graphics.drawImage(bufferedImage2, 20488 & 11413, 39 & 10880, null);
            for (int i = 10008 & 4192; i < (22867 & 1553) && i < this.Field_25764.size() && i < this.Field_25765.size(); ++i) {
                BufferedImage bufferedImage3;
                InputStream inputStream;
                String string = (String)this.Field_25764.get(i);
                Class_3779 class_3779 = ((Class_5393)this.Field_25765.get(i)).Method_5426();
                if (string == null || (bufferedImage3 = Class_18695.Method_18726(inputStream = class_279.Method_282(new Class_2080(string)).Method_9958())).getWidth() != bufferedImage.getWidth() || bufferedImage3.getHeight() != bufferedImage.getHeight() || bufferedImage3.getType() != (27166 & -31610)) continue;
                for (int j = 768 & 40; j < bufferedImage3.getHeight(); ++j) {
                    for (int k = 23808 & -32768; k < bufferedImage3.getWidth(); ++k) {
                        int n2 = bufferedImage3.getRGB(k, j);
                        if ((n2 & (-15461088 & -6199149)) == 0) continue;
                        int n3 = (n2 & (553583491 & 167706672)) << (10620 & -16376) & (-9956060 & -16577968);
                        int n4 = bufferedImage2.getRGB(k, j);
                        int n5 = Class_13337.Method_13364(n4, class_3779.Field_3812) & (100663295 & -1828716545);
                        bufferedImage3.setRGB(k, j, n3 | n5);
                    }
                }
                bufferedImage.getGraphics().drawImage(bufferedImage3, -28000 & 258, 4485 & 8240, null);
            }
        }
        catch (IOException iOException) {
            Field_25762.error("Couldn't load layered image", (Throwable)iOException);
            return;
        }
        Class_18695.Method_18713(this.\u0000strictfp(), bufferedImage);
    }

    private void Method_25767() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

