/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  internal.org.lwjgl.input.Keyboard
 *  internal.org.lwjgl.input.Mouse
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import internal.org.lwjgl.input.Keyboard;
import internal.org.lwjgl.input.Mouse;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_1864
extends Class_1490 {
    private String Field_1865 = "";
    protected static Class_38813 Field_1866;
    private String Field_1867 = "";
    private int Field_1868 = -1 & -1;
    private static final Logger Field_1869;
    private boolean Field_1870;
    private boolean Field_1871;
    private List Field_1872 = Lists.newArrayList();
    private int Field_1873;

    public Class_1864() {
        if (Field_1866 != null) {
            String string = Field_1866.Method_38848().trim();
            if (string.length() > 0) {
                Class_18.Field_89.Field_105.Method_45458().Method_41187(string);
            }
            Field_1866.Method_38853("");
        }
    }

    public void Method_1874() {
        if (this.Field_1870) {
            Field_1866.Method_38836(Field_1866.Method_38843(-1 & -1, Field_1866.Method_38850(), (-31735 & 8852) != 0) - Field_1866.Method_38850());
            if (this.Field_1873 >= this.Field_1872.size()) {
                this.Field_1873 = 1092 & 392;
            }
        } else {
            int n = Field_1866.Method_38843(-1 & -1, Field_1866.Method_38850(), (21249 & 2176) != 0);
            this.Field_1872.clear();
            this.Field_1873 = 28676 & 3200;
            String string = Field_1866.Method_38848().substring(n).toLowerCase();
            String string2 = Field_1866.Method_38848().substring(9248 & 4, Field_1866.Method_38850());
            this.Method_1883(string2, string);
            if (this.Field_1872.isEmpty()) {
                return;
            }
            this.Field_1870 = 33 & -32055;
            Field_1866.Method_38836(n - Field_1866.Method_38850());
        }
        if (this.Field_1872.size() > (-30655 & 4113)) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String string2 : this.Field_1872) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(string2);
            }
            this.\u0000strictfp.Field_105.Method_45458().Method_41172(new Class_2840(stringBuilder.toString()), 353 & 3221);
        }
        int n = this.Field_1873;
        this.Field_1873 = n + (577 & 11267);
        Field_1866.Method_38835((String)this.Field_1872.get(n));
    }

    public void Method_1875() {
        Field_1866.Method_38847();
    }

    protected void Method_1876(int n, int n2, int n3) {
        Class_1782 class_1782;
        if (n3 == 0 && this.\u0000strictfp(class_1782 = this.\u0000strictfp.Field_105.Method_45458().Method_41174(Mouse.getX(), Mouse.getY()))) {
            return;
        }
        Field_1866.Method_38855(n, n2, n3);
        super.Method_1537(n, n2, n3);
    }

    public void Method_1877() {
        super.Method_1544();
        int n = Mouse.getEventDWheel();
        if (n != 0) {
            if (n > (1 & -29149)) {
                n = 1409 & 10803;
            }
            if (n < (-1 & -1)) {
                n = -1 & -1;
            }
            if (!Class_1864.\u0000
            ()) {
                n *= 1095 & -9833;
            }
            this.\u0000strictfp.Field_105.Method_45458().Method_41189(n);
        }
    }

    private void Method_1878() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static {
        Field_1869 = LogManager.getLogger();
    }

    public void Method_1879() {
        Keyboard.enableRepeatEvents((572 & -28543) != 0);
        this.\u0000strictfp.Field_105.Method_45458().Method_41175();
    }

    public void Method_1880(int n) {
        int n2 = this.Field_1868 + n;
        int n3 = this.\u0000strictfp.Field_105.Method_45458().Method_41178().size();
        if ((n2 = Class_13337.Method_13367(n2, -15420 & 10258, n3)) != this.Field_1868) {
            if (n2 == n3) {
                this.Field_1868 = n3;
                Field_1866.Method_38853(this.Field_1867);
            } else {
                if (this.Field_1868 == n3) {
                    this.Field_1867 = Field_1866.Method_38848();
                }
                Field_1866.Method_38853((String)this.\u0000strictfp.Field_105.Method_45458().Method_41178().get(n2));
                this.Field_1868 = n2;
            }
        }
    }

    public boolean Method_1881() {
        return (6662 & 16401) != 0;
    }

    public void Method_1882() {
        Keyboard.enableRepeatEvents((16401 & -22143) != 0);
        this.Field_1868 = this.\u0000strictfp.Field_105.Method_45458().Method_41178().size();
        String string = "";
        if (Field_1866 != null) {
            string = Field_1866.Method_38848();
        }
        Field_1866 = new Class_38813(-30591 & 8196, this.\u0000strictfp, 16535 & 8268, this.\u0000, ` - (188 & 11276), this.\u0000= final - (17390 & 21), 24716 & 4143);
        Field_1866.Method_38859(4855 & 100);
        Field_1866.Method_38837((4371 & 27720) != 0);
        Field_1866.Method_38858((269 & 4099) != 0);
        if (this.Field_1865.length() > 0) {
            Field_1866.Method_38853(this.Field_1865);
        } else {
            Field_1866.Method_38853(string);
        }
        Field_1866.Method_38868((133 & 12872) != 0);
    }

    private void Method_1883(String string, String string2) {
        if (string.length() >= (30043 & 673)) {
            Class_4751 class_4751 = null;
            if (this.\u0000strictfp.Field_57 != null && this.\u0000strictfp.Field_57.Field_37112 == Class_7192.Field_7193) {
                class_4751 = this.\u0000strictfp.Field_57.Method_37118();
            }
            this.\u0000strictfp.Field_48.Field_1390.Method_20245(new Class_47014(string, class_4751));
            this.Field_1871 = 33 & 1105;
        }
    }

    public void Method_1884(int n, int n2, float f) {
        Class_1864.\u0000, `((int)(226 & -20478), (int)(this.\u0000, ` - (5134 & 2127)), (int)(this.\u0000= final - (46 & 19)), (int)(this.\u0000, ` - (2818 & -16317)), (int)(-1942484912 & -1857780448));
        Field_1866.Method_38849();
        Class_1782 class_1782 = this.\u0000strictfp.Field_105.Method_45458().Method_41174(Mouse.getX(), Mouse.getY());
        if (class_1782 != null && class_1782.Method_1789().Method_2921() != null) {
            this.\u0000strictfp(class_1782, n, n2);
        }
        super.Method_1545(n, n2, f);
    }

    public Class_1864(String string) {
        this();
        this.Field_1865 = string;
    }

    public void Method_1885(String[] arrstring) {
        if (this.Field_1871) {
            this.Field_1870 = -18304 & 1028;
            this.Field_1872.clear();
            Object object = arrstring;
            int n = ((String[])object).length;
            for (int i = 20480 & 1032; i < n; ++i) {
                String string = object[i];
                if (string.length() <= 0) continue;
                this.Field_1872.add(string);
            }
            object = Field_1866.Method_38848().substring(Field_1866.Method_38843(-1 & -1, Field_1866.Method_38850(), (1553 & 4098) != 0));
            String string = StringUtils.getCommonPrefix((String[])arrstring);
            if (string.length() > 0 && !((String)object).equalsIgnoreCase(string)) {
                Field_1866.Method_38836(Field_1866.Method_38843(-1 & -1, Field_1866.Method_38850(), (0 & -30704) != 0) - Field_1866.Method_38850());
                Field_1866.Method_38835(string);
            } else if (this.Field_1872.size() > 0) {
                this.Field_1870 = 4707 & 9221;
                this.Method_1874();
            }
        }
    }

    protected void Method_1886(String string, boolean bl) {
        if (bl) {
            Field_1866.Method_38853(string);
        } else {
            Field_1866.Method_38835(string);
        }
    }

    protected void Method_1887(char c, int n) {
        this.Field_1871 = 389 & 1064;
        if (n == (-30705 & 16959)) {
            this.Method_1874();
        } else {
            this.Field_1870 = -14702 & 4353;
        }
        if (n == (51 & 9)) {
            this.\u0000strictfp.Method_218(null);
        } else if (n != (-31428 & 16476) && n != (24764 & 1948)) {
            if (n == (200 & -28449)) {
                this.Method_1880(-1 & -1);
            } else if (n == (17364 & -32560)) {
                this.Method_1880(391 & -25023);
            } else if (n == (207 & 14073)) {
                this.\u0000strictfp.Field_105.Method_45458().Method_41189(this.\u0000strictfp.Field_105.Method_45458().Method_41173() - (10661 & 579));
            } else if (n == (12497 & 1523)) {
                this.\u0000strictfp.Field_105.Method_45458().Method_41189(-this.\u0000strictfp.Field_105.Method_45458().Method_41173() + (12547 & 17137));
            } else {
                Field_1866.Method_38854(c, n);
            }
        } else {
            String string = Field_1866.Method_38848().trim();
            if (string.length() > 0) {
                this.\u0000%(string);
            }
            Field_1866.Method_38853("");
            this.\u0000strictfp.Method_218(null);
        }
    }
}

