/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
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

public class Class_32754
extends Class_23424 {
    public final List Field_32755;
    private static final Logger Field_32756 = LogManager.getLogger();

    public void Method_32757(Class_279 class_279) {
        this.\u0000= final();
        BufferedImage bufferedImage = null;
        try {
            for (String string : this.Field_32755) {
                if (string == null) continue;
                InputStream inputStream = class_279.Method_282(new Class_2080(string)).Method_9958();
                BufferedImage bufferedImage2 = Class_18695.Method_18726(inputStream);
                if (bufferedImage == null) {
                    bufferedImage = new BufferedImage(bufferedImage2.getWidth(), bufferedImage2.getHeight(), 1166 & 16466);
                }
                bufferedImage.getGraphics().drawImage(bufferedImage2, -28524 & 11, 257 & -22528, null);
            }
        }
        catch (IOException iOException) {
            Field_32756.error("Couldn't load layered image", (Throwable)iOException);
            return;
        }
        Class_18695.Method_18713(this.\u0000strictfp(), bufferedImage);
    }

    private void Method_32758() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_32754(String ... arrstring) {
        this.Field_32755 = Lists.newArrayList((Object[])arrstring);
    }
}

