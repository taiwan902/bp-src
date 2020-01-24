/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class Class_31961 {
    public float Field_31962 = 0.2173913f * 147.20001f;
    public boolean Field_31963 = 514 & -13296;
    public List Field_31964 = new ArrayList();
    public boolean Field_31965;
    public List Field_31966;
    public boolean Field_31967 = -24441 & 7217;
    public float Field_31968;
    public float Field_31969;
    public float Field_31970 = 0.59183675f * 108.13793f;
    public float Field_31971;
    public float Field_31972;
    private Class_33781 Field_31973;
    private int Field_31974;
    public final String Field_31975;
    public float Field_31976;
    private boolean Field_31977;
    public float Field_31978;
    private int Field_31979;
    private float Field_31980;
    private Class_24997 Field_31981 = Class_19426.Method_19470();
    private int Field_31982;
    public boolean Field_31983;
    public float Field_31984;
    public float Field_31985;
    public List Field_31986 = new ArrayList();
    public float Field_31987;

    public Class_31961 Method_31988(int n, int n2) {
        this.Field_31974 = n;
        this.Field_31982 = n2;
        return this;
    }

    public void Method_31989(float f, float f2, float f3, int n, int n2, int n3, float f4) {
        this.Field_31964.add(new Class_7325(this, this.Field_31974, this.Field_31982, f, f2, f3, n, n2, n3, f4));
    }

    public void Method_31990(Class_31961 class_31961) {
        if (this.Field_31966 == null) {
            this.Field_31966 = new ArrayList();
        }
        this.Field_31966.add(class_31961);
    }

    public Class_31961 Method_31991(int n, int n2) {
        this.Field_31970 = n;
        this.Field_31962 = n2;
        return this;
    }

    public void Method_31992(float f) {
        if (!this.Field_31983 && this.Field_31967) {
            if (!this.Field_31977) {
                this.Method_31997(f);
            }
            Class_16867.Method_16961();
            Class_16867.Method_16943(this.Field_31976 * f, this.Field_31971 * f, this.Field_31972 * f);
            if (this.Field_31968 != 0.0f) {
                Class_16867.Method_16940(this.Field_31968 * (37.777435f * 1.5166667f), 0.0f, 1.0f, 0.0f);
            }
            if (this.Field_31984 != 0.0f) {
                Class_16867.Method_16940(this.Field_31984 * (1.4117647f * 40.584507f), 1.0f, 0.0f, 0.0f);
            }
            if (this.Field_31969 != 0.0f) {
                Class_16867.Method_16940(this.Field_31969 * (2.0f * 28.647888f), 0.0f, 0.0f, 1.0f);
            }
            Class_16867.Method_16929(this.Field_31979);
            Class_16867.Method_16945();
        }
    }

    public void Method_31993(float f, float f2, float f3) {
        this.Field_31976 = f;
        this.Field_31971 = f2;
        this.Field_31972 = f3;
    }

    public Class_31961 Method_31994(String string, float f, float f2, float f3, int n, int n2, int n3) {
        string = this.Field_31975 + "." + string;
        Class_28853 class_28853 = this.Field_31973.Method_33796(string);
        this.Method_31988(class_28853.Field_28855, class_28853.Field_28854);
        this.Field_31986.add(new Class_16826(this, this.Field_31974, this.Field_31982, f, f2, f3, n, n2, n3, 0.0f).Method_16836(string));
        return this;
    }

    public Class_31961 Method_31995(float f, float f2, float f3, int n, int n2, int n3, boolean bl) {
        this.Field_31986.add(new Class_16826(this, this.Field_31974, this.Field_31982, f, f2, f3, n, n2, n3, 0.0f, bl));
        return this;
    }

    public Class_31961(Class_33781 class_33781) {
        this(class_33781, null);
    }

    public Class_31961(Class_33781 class_33781, String string) {
        this.Field_31973 = class_33781;
        class_33781.Field_33788.add(this);
        this.Field_31975 = string;
        this.Method_31991(class_33781.Field_33787, class_33781.Field_33786);
    }

    public void Method_31996(float f) {
        if (!this.Field_31983 && this.Field_31967) {
            if (!this.Field_31977) {
                this.Method_31997(f);
            }
            if (this.Field_31984 == 0.0f && this.Field_31968 == 0.0f && this.Field_31969 == 0.0f) {
                if (this.Field_31976 != 0.0f || this.Field_31971 != 0.0f || this.Field_31972 != 0.0f) {
                    Class_16867.Method_16943(this.Field_31976 * f, this.Field_31971 * f, this.Field_31972 * f);
                }
            } else {
                Class_16867.Method_16943(this.Field_31976 * f, this.Field_31971 * f, this.Field_31972 * f);
                if (this.Field_31969 != 0.0f) {
                    Class_16867.Method_16940(this.Field_31969 * (1.4210526f * 40.319252f), 0.0f, 0.0f, 1.0f);
                }
                if (this.Field_31968 != 0.0f) {
                    Class_16867.Method_16940(this.Field_31968 * (1.68f * 34.10463f), 0.0f, 1.0f, 0.0f);
                }
                if (this.Field_31984 != 0.0f) {
                    Class_16867.Method_16940(this.Field_31984 * (1.4f * 40.925556f), 1.0f, 0.0f, 0.0f);
                }
            }
        }
    }

    private void Method_31997(float f) {
        int n;
        if (this.Field_31979 == 0) {
            this.Field_31980 = f;
            this.Field_31979 = Class_11552.Method_11554(25121 & 6469);
        }
        GL11.glNewList((int)this.Field_31979, (int)(29571 & 8012));
        Class_22385 class_22385 = Class_7644.Method_7649().Method_7648();
        for (n = -30648 & 20486; n < this.Field_31986.size(); ++n) {
            ((Class_16826)this.Field_31986.get(n)).Method_16837(class_22385, f);
        }
        for (n = -32631 & 12640; n < this.Field_31964.size(); ++n) {
            Class_7325 class_7325 = (Class_7325)this.Field_31964.get(n);
            class_7325.Method_7341(Class_7644.Method_7649(), f);
        }
        GL11.glEndList();
        this.Field_31977 = -32755 & 9555;
    }

    public void Method_31998(float f, float f2, float f3, int n, int n2, int n3, float f4) {
        this.Field_31986.add(new Class_16826(this, this.Field_31974, this.Field_31982, f, f2, f3, n, n2, n3, f4));
    }

    public void Method_31999(float f) {
        if (!this.Field_31983 && this.Field_31967) {
            if (!this.Field_31977) {
                this.Method_31997(f);
            }
            Class_16867.Method_16943(this.Field_31985, this.Field_31978, this.Field_31987);
            if (this.Field_31984 == 0.0f && this.Field_31968 == 0.0f && this.Field_31969 == 0.0f) {
                if (this.Field_31976 == 0.0f && this.Field_31971 == 0.0f && this.Field_31972 == 0.0f) {
                    Class_16867.Method_16929(this.Field_31979);
                    if (this.Field_31966 != null) {
                        for (int i = 1568 & -32507; i < this.Field_31966.size(); ++i) {
                            ((Class_31961)this.Field_31966.get(i)).Method_31999(f);
                        }
                    }
                } else {
                    Class_16867.Method_16943(this.Field_31976 * f, this.Field_31971 * f, this.Field_31972 * f);
                    Class_16867.Method_16929(this.Field_31979);
                    if (this.Field_31966 != null) {
                        for (int i = 437 & 31240; i < this.Field_31966.size(); ++i) {
                            ((Class_31961)this.Field_31966.get(i)).Method_31999(f);
                        }
                    }
                    Class_16867.Method_16943(-this.Field_31976 * f, -this.Field_31971 * f, -this.Field_31972 * f);
                }
            } else {
                Class_16867.Method_16961();
                Class_16867.Method_16943(this.Field_31976 * f, this.Field_31971 * f, this.Field_31972 * f);
                if (this.Field_31969 != 0.0f) {
                    Class_16867.Method_16940(this.Field_31969 * (0.8235294f * 69.57344f), 0.0f, 0.0f, 1.0f);
                }
                if (this.Field_31968 != 0.0f) {
                    Class_16867.Method_16940(this.Field_31968 * (63.025352f * 0.90909094f), 0.0f, 1.0f, 0.0f);
                }
                if (this.Field_31984 != 0.0f) {
                    Class_16867.Method_16940(this.Field_31984 * (1.1666666f * 49.11067f), 1.0f, 0.0f, 0.0f);
                }
                Class_16867.Method_16929(this.Field_31979);
                if (this.Field_31966 != null) {
                    for (int i = -31742 & 2065; i < this.Field_31966.size(); ++i) {
                        ((Class_31961)this.Field_31966.get(i)).Method_31999(f);
                    }
                }
                Class_16867.Method_16945();
            }
            Class_16867.Method_16943(-this.Field_31985, -this.Field_31978, -this.Field_31987);
        }
    }

    public void Method_32000() {
        if (this.Field_31977) {
            this.Field_31977 = -30656 & 17724;
            this.Method_31997(this.Field_31980);
        }
    }

    public Class_31961(Class_33781 class_33781, int n, int n2) {
        this(class_33781);
        this.Method_31988(n, n2);
    }

    private void Method_32001() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_31961 Method_32002(float f, float f2, float f3, int n, int n2, int n3) {
        this.Field_31986.add(new Class_16826(this, this.Field_31974, this.Field_31982, f, f2, f3, n, n2, n3, 0.0f));
        return this;
    }
}

