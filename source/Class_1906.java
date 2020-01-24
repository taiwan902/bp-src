/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  internal.org.lwjgl.input.Keyboard
 */
import com.google.common.collect.Sets;
import internal.org.lwjgl.input.Keyboard;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Set;

public abstract class Class_1906
extends Class_1490 {
    private int Field_1907;
    protected int Field_1908 = 176 & 22713;
    protected final Set Field_1909 = Sets.newHashSet();
    protected boolean Field_1910;
    private int Field_1911;
    private Class_23823 Field_1912;
    private long Field_1913;
    public Class_8295 Field_1914;
    private Class_26421 Field_1915;
    private Class_26421 Field_1916;
    private boolean Field_1917;
    private boolean Field_1918;
    private boolean Field_1919;
    private Class_23823 Field_1920;
    private int Field_1921;
    private long Field_1922;
    protected static final Class_2080 Field_1923 = new Class_2080(Class_1906.Method_1954("\u2988\u2999\u2980\u2989\u2988\u298b\u2998\u298b\u299a\u2993\u2980\u2999\u299a\u2993\u299a\u299b\u2988\u2999\u2990\u2993\u2998\u298b\u2992\u2991\u299a\u2983\u2990\u299b\u2980\u299b\u2982\u2989\u29b2\u29a9\u29b2\u29bb"));
    private Class_26421 Field_1924;
    protected int Field_1925 = -32530 & 12470;
    private Class_26421 Field_1926;
    protected int Field_1927;
    private int Field_1928;
    private Class_26421 Field_1929;
    private int Field_1930;
    private int Field_1931;
    private Class_23823 Field_1932;
    private long Field_1933;
    protected int Field_1934;

    private void Method_1935() {
        Class_23823 class_23823 = this.\u0000strictfp.Field_48.\u0000strictfp.Method_37812();
        if (class_23823 != null && this.Field_1910) {
            this.Field_1907 = class_23823.Field_23826;
            for (Class_26421 class_26421 : this.Field_1909) {
                Class_23823 class_238232 = class_23823.Method_23850();
                int n = class_26421.Method_26430() == null ? 5633 & 8218 : class_26421.Method_26430().Field_23826;
                Class_8295.Method_8309(this.Field_1909, this.Field_1930, class_238232, n);
                if (class_238232.Field_23826 > class_238232.Method_23837()) {
                    class_238232.Field_23826 = class_238232.Method_23837();
                }
                if (class_238232.Field_23826 > class_26421.Method_26434(class_238232)) {
                    class_238232.Field_23826 = class_26421.Method_26434(class_238232);
                }
                this.Field_1907 -= class_238232.Field_23826 - n;
            }
        }
    }

    protected boolean Method_1936(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = this.Field_1927;
        int n8 = this.Field_1934;
        return ((n5 -= n7) >= n - (-32759 & 17747) && n5 < n + n3 + (33 & -22511) && (n6 -= n8) >= n2 - (71 & 16513) && n6 < n2 + n4 + (17607 & -20447) ? 705 & -32735 : -21504 & 4899) != 0;
    }

    protected void Method_1937(int n, int n2, int n3, long l) {
        Class_26421 class_26421 = this.Method_1944(n, n2);
        Class_23823 class_23823 = this.\u0000strictfp.Field_48.\u0000strictfp.Method_37812();
        if (this.Field_1924 != null && this.\u0000strictfp.Field_84.Field_39870) {
            if (n3 == 0 || n3 == (9241 & 2087)) {
                if (this.Field_1932 == null) {
                    if (class_26421 != this.Field_1924 && this.Field_1924.Method_26430() != null) {
                        this.Field_1932 = this.Field_1924.Method_26430().Method_23850();
                    }
                } else if (this.Field_1932.Field_23826 > (2185 & 28677) && class_26421 != null && Class_8295.Method_8335(class_26421, this.Field_1932, (-16327 & 14850) != 0)) {
                    long l2 = Class_18.Method_207();
                    if (this.Field_1929 == class_26421) {
                        if (l2 - this.Field_1933 > (1078266364L & 211821047L)) {
                            this.Method_1941(this.Field_1924, this.Field_1924.Field_26423, 3120 & 28994, 12296 & -15739);
                            this.Method_1941(class_26421, class_26421.Field_26423, 1 & 4661, 1038 & 29281);
                            this.Method_1941(this.Field_1924, this.Field_1924.Field_26423, 50 & 8260, 2560 & 273);
                            this.Field_1933 = l2 + (1703355083812520702L & 849186542L);
                            this.Field_1932.Field_23826 -= 6361 & 1283;
                        }
                    } else {
                        this.Field_1929 = class_26421;
                        this.Field_1933 = l2;
                    }
                }
            }
        } else if (this.Field_1910 && class_26421 != null && class_23823 != null && class_23823.Field_23826 > this.Field_1909.size() && Class_8295.Method_8335(class_26421, class_23823, (2601 & -12159) != 0) && class_26421.Method_26435(class_23823) && this.Field_1914.Method_8305(class_26421)) {
            this.Field_1909.add(class_26421);
            this.Method_1935();
        }
    }

    protected boolean Method_1938(int n) {
        if (this.\u0000strictfp.Field_48.\u0000strictfp.Method_37812() == null && this.Field_1915 != null) {
            for (int i = 19712 & 8201; i < (2141 & -19831); ++i) {
                if (n != this.\u0000strictfp.Field_84.Field_39705[i].Method_8274()) continue;
                this.Method_1941(this.Field_1915, this.Field_1915.Field_26423, i, 2082 & -31850);
                return (35 & 27669) != 0;
            }
        }
        return (1420 & 96) != 0;
    }

    protected void Method_1939(char c, int n) {
        if (n == (1189 & 2577) || n == this.\u0000strictfp.Field_84.Field_39818.Method_8274()) {
            this.\u0000strictfp.Field_48.Method_1417();
        }
        this.Method_1938(n);
        if (this.Field_1915 != null && this.Field_1915.Method_26439()) {
            if (n == this.\u0000strictfp.Field_84.Field_39728.Method_8274()) {
                this.Method_1941(this.Field_1915, this.Field_1915.Field_26423, 2902 & -24543, 2051 & 8967);
            } else if (n == this.\u0000strictfp.Field_84.Field_39856.Method_8274()) {
                this.Method_1941(this.Field_1915, this.Field_1915.Field_26423, Class_1906.\u0000= final() ? 97 & 6801 : 20130 & -28404, -32764 & 30308);
            }
        }
    }

    protected void Method_1940(int n, int n2, int n3) {
        Class_26421 class_26421 = this.Method_1944(n, n2);
        int n4 = this.Field_1927;
        int n5 = this.Field_1934;
        int n6 = n < n4 || n2 < n5 || n >= n4 + this.Field_1908 || n2 >= n5 + this.Field_1925 ? 3725 & 8465 : 6149 & -31744;
        int n7 = -1 & -1;
        if (class_26421 != null) {
            n7 = class_26421.Field_26423;
        }
        if (n6 != 0) {
            n7 = -615 & -423;
        }
        if (this.Field_1918 && class_26421 != null && n3 == 0 && this.Field_1914.Method_8310(null, class_26421)) {
            if (Class_1906.\u0000
            ()) {
                if (class_26421 != null && class_26421.Field_26425 != null && this.Field_1920 != null) {
                    for (Class_26421 class_264212 : this.Field_1914.Field_8299) {
                        if (class_264212 == null || !class_264212.Method_26440(this.\u0000strictfp.Field_48) || !class_264212.Method_26439() || class_264212.Field_26425 != class_26421.Field_26425 || !Class_8295.Method_8335(class_264212, this.Field_1920, (1043 & -28127) != 0)) continue;
                        this.Method_1941(class_264212, class_264212.Field_26423, n3, 20623 & -23439);
                    }
                }
            } else {
                this.Method_1941(class_26421, n7, n3, 13319 & 62);
            }
            this.Field_1918 = 776 & -32637;
            this.Field_1913 = -3024333324142638800L & 2424835L;
        } else {
            if (this.Field_1910 && this.Field_1911 != n3) {
                this.Field_1910 = 2560 & 4105;
                this.Field_1909.clear();
                this.Field_1917 = 549 & -30335;
                return;
            }
            if (this.Field_1917) {
                this.Field_1917 = -28670 & 10304;
                return;
            }
            if (this.Field_1924 != null && this.\u0000strictfp.Field_84.Field_39870) {
                if (n3 == 0 || n3 == (-11759 & 2185)) {
                    if (this.Field_1932 == null && class_26421 != this.Field_1924) {
                        this.Field_1932 = this.Field_1924.Method_26430();
                    }
                    boolean bl = Class_8295.Method_8335(class_26421, this.Field_1932, (11776 & 16472) != 0);
                    if (n7 != (-1 & -1) && this.Field_1932 != null && bl) {
                        this.Method_1941(this.Field_1924, this.Field_1924.Field_26423, n3, 4096 & -22058);
                        this.Method_1941(class_26421, n7, 2050 & 13313, 7180 & 8289);
                        if (this.\u0000strictfp.Field_48.\u0000strictfp.Method_37812() != null) {
                            this.Method_1941(this.Field_1924, this.Field_1924.Field_26423, n3, -30648 & 4996);
                            this.Field_1931 = n - n4;
                            this.Field_1921 = n2 - n5;
                            this.Field_1916 = this.Field_1924;
                            this.Field_1912 = this.Field_1932;
                            this.Field_1922 = Class_18.Method_207();
                        } else {
                            this.Field_1912 = null;
                        }
                    } else if (this.Field_1932 != null) {
                        this.Field_1931 = n - n4;
                        this.Field_1921 = n2 - n5;
                        this.Field_1916 = this.Field_1924;
                        this.Field_1912 = this.Field_1932;
                        this.Field_1922 = Class_18.Method_207();
                    }
                    this.Field_1932 = null;
                    this.Field_1924 = null;
                }
            } else if (this.Field_1910 && !this.Field_1909.isEmpty()) {
                this.Method_1941(null, -903 & -743, Class_8295.Method_8327(11812 & -28517, this.Field_1930), -32115 & 14613);
                for (Class_26421 class_264213 : this.Field_1909) {
                    this.Method_1941(class_264213, class_264213.Field_26423, Class_8295.Method_8327(1089 & 8377, this.Field_1930), 1573 & 8325);
                }
                this.Method_1941(null, -741 & -419, Class_8295.Method_8327(4354 & 8194, this.Field_1930), 11589 & 175);
            } else if (this.\u0000strictfp.Field_48.\u0000strictfp.Method_37812() != null) {
                if (n3 == this.\u0000strictfp.Field_84.Field_39728.Method_8274() + (7399 & 24676)) {
                    this.Method_1941(class_26421, n7, n3, 1027 & 12459);
                } else {
                    int n8;
                    int n9 = n8 = n7 != (-997 & -963) && (Keyboard.isKeyDown((int)(16426 & 4670)) || Keyboard.isKeyDown((int)(-4041 & 566))) ? 12937 & 16659 : 7184 & -32764;
                    if (n8 != 0) {
                        this.Field_1920 = class_26421 != null && class_26421.Method_26439() ? class_26421.Method_26430() : null;
                    }
                    this.Method_1941(class_26421, n7, n3, n8 != 0 ? 5141 & -30463 : -32758 & 2577);
                }
            }
        }
        if (this.\u0000strictfp.Field_48.\u0000strictfp.Method_37812() == null) {
            this.Field_1913 = 4861308794271959304L & -4861308794974996988L;
        }
        this.Field_1910 = 1280 & -24448;
    }

    protected void Method_1941(Class_26421 class_26421, int n, int n2, int n3) {
        if (class_26421 != null) {
            n = class_26421.Field_26423;
        }
        this.\u0000strictfp.Field_61.Method_11769(this.Field_1914.Field_8298, n, n2, n3, this.\u0000strictfp.Field_48);
    }

    public void Method_1942() {
        super.Method_1517();
        if (!this.\u0000strictfp.Field_48.\u0000volatile() || this.\u0000strictfp.Field_48.\u0000= float) {
            this.\u0000strictfp.Field_48.Method_1417();
        }
    }

    private void Method_1943(Class_26421 class_26421) {
        String string;
        int n = class_26421.Field_26426;
        int n2 = class_26421.Field_26422;
        Class_23823 class_23823 = class_26421.Method_26430();
        int n3 = 640 & 72;
        int n4 = class_26421 == this.Field_1924 && this.Field_1932 != null && !this.Field_1919 ? -26227 & 1585 : 16416 & -23551;
        Class_23823 class_238232 = this.\u0000strictfp.Field_48.\u0000strictfp.Method_37812();
        String string2 = null;
        if (class_26421 == this.Field_1924 && this.Field_1932 != null && this.Field_1919 && class_23823 != null) {
            class_23823 = class_23823.Method_23850();
            class_23823.Field_23826 /= 1034 & 14466;
        } else if (this.Field_1910 && this.Field_1909.contains(class_26421) && class_238232 != null) {
            if (this.Field_1909.size() == (-32749 & 4129)) {
                return;
            }
            if (Class_8295.Method_8335(class_26421, class_238232, (-8177 & 6465) != 0) && this.Field_1914.Method_8305(class_26421)) {
                class_23823 = class_238232.Method_23850();
                n3 = 4763 & 24577;
                Class_8295.Method_8309(this.Field_1909, this.Field_1930, class_23823, class_26421.Method_26430() == null ? 522 & 81 : class_26421.Method_26430().Field_23826);
                if (class_23823.Field_23826 > class_23823.Method_23837()) {
                    string2 = (Object)((Object)Class_5478.Field_5485) + "" + class_23823.Method_23837();
                    class_23823.Field_23826 = class_23823.Method_23837();
                }
                if (class_23823.Field_23826 > class_26421.Method_26434(class_23823)) {
                    string2 = (Object)((Object)Class_5478.Field_5485) + "" + class_26421.Method_26434(class_23823);
                    class_23823.Field_23826 = class_26421.Method_26434(class_23823);
                }
            } else {
                this.Field_1909.remove(class_26421);
                this.Method_1935();
            }
        }
        this.\u0000strictfp = 0.4814815f * 207.6923f;
        this.\u0000strictfp.Field_44259 = 25.396826f * 3.9375f;
        if (class_23823 == null && (string = class_26421.Method_26429()) != null) {
            Class_11372 class_11372 = this.\u0000strictfp.Method_189().Method_24109(string);
            Class_16867.Method_16931();
            this.\u0000strictfp.Method_253().Method_34707(Class_24069.Field_24084);
            this.\u0000strictfp(n, n2, class_11372, -16296 & 54, 12372 & 1432);
            Class_16867.Method_16918();
            n4 = 18449 & 13061;
        }
        if (n4 == 0) {
            if (n3 != 0) {
                Class_1906.\u0000, `((int)n, (int)n2, (int)(n + (13585 & -15664)), (int)(n2 + (1042 & 16400)), (int)(-1795162113 & -2080374785));
            }
            Class_16867.Method_16927();
            this.\u0000strictfp.Method_44287(class_23823, n, n2);
            this.\u0000strictfp.Method_44271(this.\u0000strictfp, class_23823, n, n2, string2);
        }
        this.\u0000strictfp.Field_44259 = 0.0f;
        this.\u0000strictfp = 0.0f;
    }

    private Class_26421 Method_1944(int n, int n2) {
        for (int i = -7166 & 49; i < this.Field_1914.Field_8299.size(); ++i) {
            Class_26421 class_26421 = (Class_26421)this.Field_1914.Field_8299.get(i);
            if (!this.Method_1945(class_26421, n, n2)) continue;
            return class_26421;
        }
        return null;
    }

    private boolean Method_1945(Class_26421 class_26421, int n, int n2) {
        return this.Method_1936(class_26421.Field_26426, class_26421.Field_26422, 49 & 5652, -15432 & 8212, n, n2);
    }

    public Class_1906(Class_8295 class_8295) {
        this.Field_1914 = class_8295;
        this.Field_1917 = 3 & -1263;
    }

    public void Method_1946() {
        super.Method_1513();
        this.\u0000strictfp.Field_48.\u0000, ` = this.Field_1914;
        this.Field_1927 = (this.\u0000= final - this.Field_1908) / (2178 & -23541);
        this.Field_1934 = (this.\u0000, ` - this.Field_1925) / (-31550 & 29186);
    }

    public boolean Method_1947() {
        return (-8095 & 1160) != 0;
    }

    public void Method_1948(int n, int n2, float f) {
        int n3;
        int n4;
        Object object;
        this.\u0000, 2();
        int n5 = this.Field_1927;
        int n6 = this.Field_1934;
        this.Method_1951(f, n, n2);
        Class_16867.Method_16942();
        Class_39477.Method_39484();
        Class_16867.Method_16931();
        Class_16867.Method_16944();
        super.Method_1545(n, n2, f);
        Class_39477.Method_39485();
        Class_16867.Method_16961();
        Class_16867.Method_16943(n5, n6, 0.0f);
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        Class_16867.Method_16957();
        this.Field_1915 = null;
        int n7 = 2800 & 5618;
        int n8 = 8946 & 4345;
        Class_32876.Method_32943(Class_32876.Field_32911, (float)n7 / 1.0f, (float)n8 / 1.0f);
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        for (int i = 16400 & 513; i < this.Field_1914.Field_8299.size(); ++i) {
            object = (Class_26421)this.Field_1914.Field_8299.get(i);
            this.Method_1943((Class_26421)object);
            if (!this.Method_1945((Class_26421)object, n, n2) || !((Class_26421)object).Method_26442()) continue;
            this.Field_1915 = object;
            Class_16867.Method_16931();
            Class_16867.Method_16944();
            n4 = ((Class_26421)object).Field_26426;
            n3 = ((Class_26421)object).Field_26422;
            Class_16867.Method_16923((-8175 & 37) != 0, (5401 & -24063) != 0, (617 & 2053) != 0, (5141 & 2562) != 0);
            this.\u0000, `(n4, n3, n4 + (5297 & 16920), n3 + (17936 & 10297), -2046820353 & -788529153, -2030043137 & -1191182337);
            Class_16867.Method_16923((-11517 & 8217) != 0, (2059 & -24507) != 0, (1033 & -24169) != 0, (4121 & 2049) != 0);
            Class_16867.Method_16918();
            Class_16867.Method_16927();
        }
        Class_39477.Method_39484();
        this.Method_1949(n, n2);
        Class_39477.Method_39485();
        Class_37781 class_37781 = this.\u0000strictfp.Field_48.\u0000strictfp;
        Object object2 = object = this.Field_1932 == null ? class_37781.Method_37812() : this.Field_1932;
        if (object != null) {
            n4 = -32740 & 26121;
            n3 = this.Field_1932 == null ? 8984 & -26612 : 24600 & -30383;
            String string = null;
            if (this.Field_1932 != null && this.Field_1919) {
                object = ((Class_23823)object).Method_23850();
                ((Class_23823)object).Field_23826 = Class_13337.Method_13362((float)((Class_23823)object).Field_23826 / 2.0f);
            } else if (this.Field_1910 && this.Field_1909.size() > (-10713 & 8273)) {
                object = ((Class_23823)object).Method_23850();
                ((Class_23823)object).Field_23826 = this.Field_1907;
                if (((Class_23823)object).Field_23826 == 0) {
                    string = "" + (Object)((Object)Class_5478.Field_5485) + "0";
                }
            }
            this.Method_1950((Class_23823)object, n - n5 - n4, n2 - n6 - n3, string);
        }
        if (this.Field_1912 != null) {
            float f2 = (float)(Class_18.Method_207() - this.Field_1922) / (205.0f * 0.4878049f);
            if (f2 >= 1.0f) {
                f2 = 1.0f;
                this.Field_1912 = null;
            }
            n3 = this.Field_1916.Field_26426 - this.Field_1931;
            int n9 = this.Field_1916.Field_26422 - this.Field_1921;
            int n10 = this.Field_1931 + (int)((float)n3 * f2);
            int n11 = this.Field_1921 + (int)((float)n9 * f2);
            this.Method_1950(this.Field_1912, n10, n11, null);
        }
        Class_16867.Method_16945();
        if (class_37781.Method_37812() == null && this.Field_1915 != null && this.Field_1915.Method_26439()) {
            Class_23823 class_23823 = this.Field_1915.Method_26430();
            this.\u0000strictfp(class_23823, n, n2);
        }
        Class_16867.Method_16918();
        Class_16867.Method_16927();
        Class_39477.Method_39482();
    }

    protected void Method_1949(int n, int n2) {
    }

    private void Method_1950(Class_23823 class_23823, int n, int n2, String string) {
        Class_16867.Method_16943(0.0f, 0.0f, 0.9878049f * 32.39506f);
        this.\u0000strictfp = 4600.0f * 0.04347826f;
        this.\u0000strictfp.Field_44259 = 1.137931f * 175.75758f;
        this.\u0000strictfp.Method_44287(class_23823, n, n2);
        this.\u0000strictfp.Method_44271(this.\u0000strictfp, class_23823, n, n2 - (this.Field_1932 == null ? 0 & 6144 : 31816 & -32760), string);
        this.\u0000strictfp = 0.0f;
        this.\u0000strictfp.Field_44259 = 0.0f;
    }

    protected abstract void Method_1951(float var1, int var2, int var3);

    protected void Method_1952(int n, int n2, int n3) {
        super.Method_1537(n, n2, n3);
        int n4 = n3 == this.\u0000strictfp.Field_84.Field_39728.Method_8274() + (869 & 19572) ? -7799 & 545 : 148 & 5376;
        Class_26421 class_26421 = this.Method_1944(n, n2);
        long l = Class_18.Method_207();
        this.Field_1918 = this.Field_1926 == class_26421 && l - this.Field_1913 < (305285374L & 271866L) && this.Field_1928 == n3 ? 4483 & -31167 : 1252 & 528;
        this.Field_1917 = 3395 & 12320;
        if (n3 == 0 || n3 == (11 & -31835) || n4 != 0) {
            int n5 = this.Field_1927;
            int n6 = this.Field_1934;
            int n7 = n < n5 || n2 < n6 || n >= n5 + this.Field_1908 || n2 >= n6 + this.Field_1925 ? -14717 & 4449 : 1100 & 20784;
            int n8 = -1 & -1;
            if (class_26421 != null) {
                n8 = class_26421.Field_26423;
            }
            if (n7 != 0) {
                n8 = -997 & -679;
            }
            if (this.\u0000strictfp.Field_84.Field_39870 && n7 != 0 && this.\u0000strictfp.Field_48.\u0000strictfp.Method_37812() == null) {
                this.\u0000strictfp.Method_218(null);
                return;
            }
            if (n8 != (-1 & -1)) {
                if (this.\u0000strictfp.Field_84.Field_39870) {
                    if (class_26421 != null && class_26421.Method_26439()) {
                        this.Field_1924 = class_26421;
                        this.Field_1932 = null;
                        this.Field_1919 = n3 == (24673 & 4105) ? 4105 & 9221 : 20612 & 1041;
                    } else {
                        this.Field_1924 = null;
                    }
                } else if (!this.Field_1910) {
                    if (this.\u0000strictfp.Field_48.\u0000strictfp.Method_37812() == null) {
                        if (n3 == this.\u0000strictfp.Field_84.Field_39728.Method_8274() + (1380 & -30108)) {
                            this.Method_1941(class_26421, n8, n3, -28029 & 8291);
                        } else {
                            int n9 = n8 != (-481 & -743) && (Keyboard.isKeyDown((int)(43 & 16442)) || Keyboard.isKeyDown((int)(4150 & 19710))) ? 2177 & 5169 : -27615 & 8384;
                            int n10 = -19705 & 1240;
                            if (n9 != 0) {
                                this.Field_1920 = class_26421 != null && class_26421.Method_26439() ? class_26421.Method_26430() : null;
                                n10 = 9029 & -11231;
                            } else if (n8 == (-803 & -999)) {
                                n10 = -24476 & 20740;
                            }
                            this.Method_1941(class_26421, n8, n3, n10);
                        }
                        this.Field_1917 = 773 & 29873;
                    } else {
                        this.Field_1910 = 17 & -32191;
                        this.Field_1911 = n3;
                        this.Field_1909.clear();
                        if (n3 == 0) {
                            this.Field_1930 = 2114 & 16556;
                        } else if (n3 == (16657 & -23005)) {
                            this.Field_1930 = 17667 & 8305;
                        } else if (n3 == this.\u0000strictfp.Field_84.Field_39728.Method_8274() + (4333 & 100)) {
                            this.Field_1930 = -19390 & 17042;
                        }
                    }
                }
            }
        }
        this.Field_1926 = class_26421;
        this.Field_1913 = l;
        this.Field_1928 = n3;
    }

    private void Method_1953() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_1954(String string) {
        int n = 6015;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_1906.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_1955() {
        if (this.\u0000strictfp.Field_48 != null) {
            this.Field_1914.Method_8320(this.\u0000strictfp.Field_48);
        }
    }
}

