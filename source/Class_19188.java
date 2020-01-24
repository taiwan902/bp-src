/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.gson.JsonParseException;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_19188
extends Class_15594 {
    private final Class_2035 Field_19189;
    private static final Logger Field_19190 = LogManager.getLogger();
    private final Class_2080 Field_19191;

    protected boolean Method_19192() {
        return (24594 & -31231) != 0;
    }

    protected void Method_19193() {
        this.\u0000strictfp.Method_253().Method_34707(this.Field_19191);
    }

    protected String Method_19194() {
        return "Default";
    }

    protected boolean Method_19195() {
        return (34 & 6224) != 0;
    }

    protected boolean Method_19196() {
        return (-31724 & 16384) != 0;
    }

    protected String Method_19197() {
        try {
            Class_30227 class_30227 = (Class_30227)this.Field_19189.Method_2040(this.\u0000strictfp.Method_200().Field_10507, "pack");
            if (class_30227 != null) {
                return class_30227.Method_30231().Method_1783();
            }
        }
        catch (JsonParseException jsonParseException) {
            Field_19190.error("Couldn't load metadata info", (Throwable)jsonParseException);
        }
        catch (IOException iOException) {
            Field_19190.error("Couldn't load metadata info", (Throwable)iOException);
        }
        return (Object)((Object)Class_5478.Field_5505) + "Missing pack.mcmeta :(";
    }

    protected int Method_19198() {
        return -32439 & 1537;
    }

    private void Method_19199() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_19188(Class_24685 class_24685) {
        super(class_24685);
        Class_47630 class_47630;
        this.Field_19189 = this.\u0000strictfp.Method_200().Field_10509;
        try {
            class_47630 = new Class_47630(this.Field_19189.Method_2038());
        }
        catch (IOException iOException) {
            class_47630 = Class_18695.Field_18702;
        }
        this.Field_19191 = this.\u0000strictfp.Method_253().Method_34708("texturepackicon", class_47630);
    }

    protected boolean Method_19200() {
        return (-32726 & 28225) != 0;
    }

    protected boolean Method_19201() {
        return (13872 & 329) != 0;
    }
}

