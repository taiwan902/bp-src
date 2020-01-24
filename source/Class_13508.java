/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.apache.commons.lang3.ArrayUtils
 */
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.apache.commons.lang3.ArrayUtils;

public class Class_13508
implements Class_12113 {
    private boolean Field_13509;
    final Class_44584 Field_13510;
    private long Field_13511;
    final Class_29456 Field_13512;
    final Class_15474 Field_13513;
    private boolean Field_13514;

    Class_13508(Class_29456 class_29456, Class_44584 class_44584, Class_15474 class_15474) {
        this.Field_13512 = class_29456;
        this.Field_13510 = class_44584;
        this.Field_13513 = class_15474;
        this.Field_13514 = 7 & 12544;
        this.Field_13509 = -29692 & 512;
        this.Field_13511 = 950135097062381697L & -950135098313531062L;
    }

    private void Method_13515() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_13516(Class_1782 class_1782) {
        if (!this.Field_13514) {
            Class_29456.Method_29463().error("Can't ping " + this.Field_13513.Field_15484 + ": " + class_1782.Method_1788());
            this.Field_13513.Field_15479 = (Object)((Object)Class_5478.Field_5502) + "Can't connect to server.";
            this.Field_13513.Field_15483 = "";
            this.Field_13513.Field_15485 = -1L & -1L;
        }
    }

    public void Method_13517(Class_39383 class_39383) {
        long l = this.Field_13511;
        long l2 = Class_18.Method_207();
        this.Field_13513.Field_15485 = l2 - l;
        this.Field_13510.Method_44622(new Class_2840("Finished"));
    }

    public void Method_13518(Class_32003 class_32003) {
        if (this.Field_13509) {
            this.Field_13510.Method_44622(new Class_2840("Received unrequested status"));
        } else {
            CharSequence charSequence;
            this.Field_13509 = -20447 & 2049;
            Class_3166 class_3166 = class_32003.Method_32008();
            this.Field_13513.Field_15479 = class_3166.Method_3175() != null ? class_3166.Method_3175().Method_1783() : "";
            if (class_3166.Method_3176() != null) {
                this.Field_13513.Field_15487 = class_3166.Method_3176().Method_13312();
                this.Field_13513.Field_15480 = class_3166.Method_3176().Method_13310();
            } else {
                this.Field_13513.Field_15487 = "Old";
                this.Field_13513.Field_15480 = -24574 & 19536;
            }
            if (class_3166.Method_3174() != null) {
                this.Field_13513.Field_15483 = (Object)((Object)Class_5478.Field_5480) + "" + class_3166.Method_3174().Method_21336() + "" + (Object)((Object)Class_5478.Field_5488) + "/" + (Object)((Object)Class_5478.Field_5480) + class_3166.Method_3174().Method_21338();
                if (ArrayUtils.isNotEmpty((Object[])class_3166.Method_3174().Method_21337())) {
                    charSequence = new StringBuilder();
                    GameProfile[] arrgameProfile = class_3166.Method_3174().Method_21337();
                    int n = arrgameProfile.length;
                    for (int i = 5120 & 8193; i < n; ++i) {
                        GameProfile gameProfile = arrgameProfile[i];
                        if (((StringBuilder)charSequence).length() > 0) {
                            ((StringBuilder)charSequence).append("\n");
                        }
                        ((StringBuilder)charSequence).append(gameProfile.getName());
                    }
                    if (class_3166.Method_3174().Method_21337().length < class_3166.Method_3174().Method_21336()) {
                        if (((StringBuilder)charSequence).length() > 0) {
                            ((StringBuilder)charSequence).append("\n");
                        }
                        ((StringBuilder)charSequence).append("... and ").append(class_3166.Method_3174().Method_21336() - class_3166.Method_3174().Method_21337().length).append(" more ...");
                    }
                    this.Field_13513.Field_15489 = ((StringBuilder)charSequence).toString();
                }
            } else {
                this.Field_13513.Field_15483 = (Object)((Object)Class_5478.Field_5488) + "???";
            }
            if (class_3166.Method_3172() != null) {
                charSequence = class_3166.Method_3172();
                if (((String)charSequence).startsWith("data:image/png;base64,")) {
                    this.Field_13513.Method_15501(((String)charSequence).substring("data:image/png;base64,".length()));
                } else {
                    Class_29456.Method_29463().error("Invalid server icon (unknown format)");
                }
            } else {
                this.Field_13513.Method_15501(null);
            }
            this.Field_13511 = Class_18.Method_207();
            this.Field_13510.Method_44629(new Class_30378(this.Field_13511));
            this.Field_13514 = -11519 & 9347;
        }
    }
}

