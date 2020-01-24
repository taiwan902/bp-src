/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  internal.org.lwjgl.Sys
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import internal.org.lwjgl.Sys;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_24685
extends Class_1490 {
    private Class_39440 Field_24686;
    private Class_41401 Field_24687;
    private boolean Field_24688 = 6280 & -30960;
    private final Class_1490 Field_24689;
    private static final Logger Field_24690 = LogManager.getLogger();
    private List Field_24691;
    private List Field_24692;

    private void Method_24693() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public List Method_24694(Class_15594 class_15594) {
        return this.Method_24695(class_15594) ? this.Field_24691 : this.Field_24692;
    }

    public boolean Method_24695(Class_15594 class_15594) {
        return this.Field_24691.contains(class_15594);
    }

    public Class_24685(Class_1490 class_1490) {
        this.Field_24689 = class_1490;
    }

    protected void Method_24696(int n, int n2, int n3) {
        super.Method_1518(n, n2, n3);
    }

    public void Method_24697() {
        super.Method_1544();
        this.Field_24687.\u0000, for();
        this.Field_24686.\u0000, for();
    }

    public List Method_24698() {
        return this.Field_24691;
    }

    protected void Method_24699(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            if (class_42376.Field_42392 == (12418 & -32762)) {
                File file = this.\u0000strictfp.Method_200().Method_10519();
                String string = file.getAbsolutePath();
                if (Class_2090.Method_2091() == Class_2094.Field_2095) {
                    try {
                        Field_24690.info(string);
                        String[] arrstring = new String[24582 & 515];
                        arrstring[4960 & 11] = "/usr/bin/open";
                        arrstring[2177 & -14835] = string;
                        Runtime.getRuntime().exec(arrstring);
                        return;
                    }
                    catch (IOException iOException) {
                        Field_24690.error("Couldn't open file", (Throwable)iOException);
                    }
                } else if (Class_2090.Method_2091() == Class_2094.Field_2099) {
                    Object[] arrobject = new Object[-31999 & 4147];
                    arrobject[-28608 & 8596] = string;
                    String string2 = String.format("cmd.exe /C start \"Open file\" \"%s\"", arrobject);
                    try {
                        Runtime.getRuntime().exec(string2);
                        return;
                    }
                    catch (IOException iOException) {
                        Field_24690.error("Couldn't open file", (Throwable)iOException);
                    }
                }
                int n = 0 & -16315;
                try {
                    Class<?> class_ = Class.forName("java.awt.Desktop");
                    Object object = class_.getMethod("getDesktop", new Class[12737 & 12]).invoke(null, new Object[2720 & 9228]);
                    Class[] arrclass = new Class[4517 & 8705];
                    arrclass[4276 & -30653] = URI.class;
                    Object[] arrobject = new Object[2113 & -28633];
                    arrobject[2 & 12] = file.toURI();
                    class_.getMethod("browse", arrclass).invoke(object, arrobject);
                }
                catch (Throwable throwable) {
                    Field_24690.error("Couldn't open link", throwable);
                    n = 6157 & 16401;
                }
                if (n != 0) {
                    Field_24690.info("Opening via system class!");
                    Sys.openURL((String)("file://" + string));
                }
            } else if (class_42376.Field_42392 == (4113 & 8449)) {
                if (this.Field_24688) {
                    ArrayList arrayList = Lists.newArrayList();
                    for (Object object : this.Field_24691) {
                        if (!(object instanceof Class_26997)) continue;
                        arrayList.add(((Class_26997)object).Method_27001());
                    }
                    Collections.reverse(arrayList);
                    this.\u0000strictfp.Method_200().Method_10514(arrayList);
                    this.\u0000strictfp.Field_84.Field_39875.clear();
                    this.\u0000strictfp.Field_84.Field_39737.clear();
                    for (Object object : arrayList) {
                        this.\u0000strictfp.Field_84.Field_39875.add(((Class_10400)object).Method_10411());
                        if (((Class_10400)object).Method_10415() == (18433 & 891)) continue;
                        this.\u0000strictfp.Field_84.Field_39737.add(((Class_10400)object).Method_10411());
                    }
                    this.\u0000strictfp.Field_84.Method_39903();
                    this.\u0000strictfp.Method_225();
                }
                this.\u0000strictfp.Method_218(this.Field_24689);
            }
        }
    }

    protected void Method_24700(int n, int n2, int n3, int n4) {
        this.\u0000strictfp.Method_253().Method_34707(Class_1551.Field_1557);
        Class_16867.Method_16924(0.5f * 1.6f, 4.3846154f * 0.18245614f, 0.9814815f * 0.81509435f, 1.0f);
        Class_1551.Method_1566(2200 & -28411, n, 0.0f, n, this.\u0000= final, n2, this.\u0000= final, this.\u0000, `);
    }

    public void Method_24701() {
        this.\u0000strictfp.add(new Class_43202(-28414 & 10370, this.\u0000= final / (643 & 8214) - (-32614 & 2459), this.\u0000, ` - (-23885 & 48), Class_9802.Method_9806("resourcePack.openFolder", new Object[16384 & -28704])));
        this.\u0000strictfp.add(new Class_43202(-30639 & 21897, this.\u0000= final / (4354 & -7014) + (16749 & -28668), this.\u0000, ` - (2097 & 18296), Class_9802.Method_9806("gui.done", new Object[-28210 & 8193])));
        if (!this.Field_24688) {
            this.Field_24692 = Lists.newArrayList();
            this.Field_24691 = Lists.newArrayList();
            Class_10502 class_10502 = this.\u0000strictfp.Method_200();
            class_10502.Method_10517();
            ArrayList arrayList = Lists.newArrayList((Iterable)class_10502.Method_10515());
            arrayList.removeAll(class_10502.Method_10520());
            for (Class_10400 class_10400 : arrayList) {
                this.Field_24692.add(new Class_26997(this, class_10400));
            }
            for (Class_10400 class_10400 : Lists.reverse((List)class_10502.Method_10520())) {
                this.Field_24691.add(new Class_26997(this, class_10400));
            }
            this.Field_24691.add(new Class_19188(this));
        }
        this.Field_24686 = new Class_39440(this.\u0000strictfp, 16888 & -16696, this.\u0000, `, this.Field_24692);
        this.Field_24686.\u0000= final(this.\u0000= final / (-32638 & 18) - (1372 & 2052) - (8648 & 2298));
        this.Field_24686.\u0000strictfp(311 & 2119, 5435 & 24588);
        this.Field_24687 = new Class_41401(this.\u0000strictfp, 17868 & 712, this.\u0000, `, this.Field_24691);
        this.Field_24687.\u0000= final(this.\u0000= final / (-29113 & 12290) + (-32250 & 16548));
        this.Field_24687.\u0000strictfp(647 & 13623, -31057 & 88);
    }

    public void Method_24702(int n, int n2, float f) {
        this.\u0000= final(21512 & 8804);
        boolean bl = 325 & 8209;
        if (((Boolean)this.\u0000strictfp.Field_84.Field_39732.Field_8856.\u0000strictfp()).booleanValue()) {
            bl = 1096 & -3963;
        }
        this.Field_24686.\u0000strictfp(n, n2, f, bl);
        this.Field_24687.\u0000strictfp(n, n2, f, bl);
        if (((Boolean)this.\u0000strictfp.Field_84.Field_39732.Field_8856.\u0000strictfp()).booleanValue()) {
            this.Method_24700(801 & -25390, 8224 & 5493, 20735 & 1791, 4351 & 25343);
            this.Method_24700(this.\u0000, ` - (8755 & -14217), this.\u0000, `, 4607 & -23297, 2559 & 8447);
        }
        this.\u0000strictfp(this.\u0000strictfp, Class_9802.Method_9806("resourcePack.title", new Object[8452 & -32768]), this.\u0000= final / (30730 & 1430), 401 & -21998, 1258291199 & 16777215);
        this.\u0000strictfp(this.\u0000strictfp, Class_9802.Method_9806("resourcePack.folderInfo", new Object[6 & 4161]), this.\u0000= final / (42 & 17602) - (381 & -15795), this.\u0000, ` - (11034 & 17562), 1152029836 & 281379232);
        super.Method_1545(n, n2, f);
    }

    protected void Method_24703(int n, int n2, int n3) {
        super.Method_1537(n, n2, n3);
        this.Field_24686.\u0000, `(n, n2, n3);
        this.Field_24687.\u0000, `(n, n2, n3);
    }

    public List Method_24704() {
        return this.Field_24692;
    }

    public void Method_24705() {
        this.Field_24688 = 8467 & -30679;
    }
}

