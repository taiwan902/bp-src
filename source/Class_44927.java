/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_44927
extends Class_27841 {
    private Class_20976 Field_44928;
    private Class_1699 Field_44929;
    private static final Logger Field_44930 = LogManager.getLogger();

    protected Class_1758 Method_44931() {
        Class_1758 class_1758 = new Class_1758();
        for (Class_22057 class_22057 : this.Field_44928.Method_20994()) {
            Class_1699 class_1699 = new Class_1699();
            class_1699.Method_1702("Name", class_22057.Method_22075());
            class_1699.Method_1702("DisplayName", class_22057.Method_22080());
            if (class_22057.Method_22081().Method_5548() >= 0) {
                class_1699.Method_1702("TeamColor", class_22057.Method_22081().Method_5563());
            }
            class_1699.Method_1702("Prefix", class_22057.Method_22083());
            class_1699.Method_1702("Suffix", class_22057.Method_22089());
            class_1699.Method_1706("AllowFriendlyFire", class_22057.Method_22079());
            class_1699.Method_1706("SeeFriendlyInvisibles", class_22057.Method_22090());
            class_1699.Method_1702("NameTagVisibility", class_22057.Method_22088().Field_31358);
            class_1699.Method_1702("DeathMessageVisibility", class_22057.Method_22069().Field_31358);
            Class_1758 class_17582 = new Class_1758();
            for (String string : class_22057.Method_22087()) {
                class_17582.Method_1781(new Class_1746(string));
            }
            class_1699.Method_1744("Players", class_17582);
            class_1758.Method_1781(class_1699);
        }
        return class_1758;
    }

    private void Method_44932() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_44933(Class_1699 class_1699) {
        for (int i = -24560 & 20608; i < (8851 & 1075); ++i) {
            if (!class_1699.Method_1715("slot_" + i, 4185 & 9384)) continue;
            String string = class_1699.Method_1708("slot_" + i);
            Class_7873 class_7873 = this.Field_44928.Method_21003(string);
            this.Field_44928.Method_20999(i, class_7873);
        }
    }

    public void Method_44934(Class_1699 class_1699) {
        if (this.Field_44928 == null) {
            this.Field_44929 = class_1699;
        } else {
            this.Method_44935(class_1699.Method_1735("Objectives", 12330 & 18778));
            this.Method_44939(class_1699.Method_1735("PlayerScores", 10271 & 20618));
            if (class_1699.Method_1715("DisplaySlots", 266 & 2762)) {
                this.Method_44933(class_1699.Method_1703("DisplaySlots"));
            }
            if (class_1699.Method_1715("Teams", 12809 & 2057)) {
                this.Method_44937(class_1699.Method_1735("Teams", 7178 & -15826));
            }
        }
    }

    protected void Method_44935(Class_1758 class_1758) {
        for (int i = -32766 & 2156; i < class_1758.Method_1772(); ++i) {
            Class_1699 class_1699 = class_1758.Method_1768(i);
            Class_27930 class_27930 = (Class_27930)Class_27930.Field_27937.get(class_1699.Method_1708("CriteriaName"));
            if (class_27930 == null) continue;
            String string = class_1699.Method_1708("Name");
            if (string.length() > Class_12340.Field_12341) {
                string = string.substring(14381 & -31726, Class_12340.Field_12341);
            }
            Class_7873 class_7873 = this.Field_44928.Method_21000(string, class_27930);
            class_7873.Method_7879(class_1699.Method_1708("DisplayName"));
            class_7873.Method_7882(Class_43298.Method_43305(class_1699.Method_1708("RenderType")));
        }
    }

    protected Class_1758 Method_44936() {
        Class_1758 class_1758 = new Class_1758();
        for (Class_21696 class_21696 : this.Field_44928.Method_21015()) {
            if (class_21696.Method_21711() == null) continue;
            Class_1699 class_1699 = new Class_1699();
            class_1699.Method_1702("Name", class_21696.Method_21715());
            class_1699.Method_1702("Objective", class_21696.Method_21711().Method_7881());
            class_1699.Method_1739("Score", class_21696.Method_21706());
            class_1699.Method_1706("Locked", class_21696.Method_21714());
            class_1758.Method_1781(class_1699);
        }
        return class_1758;
    }

    protected void Method_44937(Class_1758 class_1758) {
        for (int i = -28617 & 3200; i < class_1758.Method_1772(); ++i) {
            Class_31355 class_31355;
            Class_1699 class_1699 = class_1758.Method_1768(i);
            String string = class_1699.Method_1708("Name");
            if (string.length() > Class_12340.Field_12341) {
                string = string.substring(-18816 & 77, Class_12340.Field_12341);
            }
            Class_22057 class_22057 = this.Field_44928.Method_21008(string);
            String string2 = class_1699.Method_1708("DisplayName");
            if (string2.length() > (2345 & 9318)) {
                string2 = string2.substring(9260 & 2051, 22650 & 1057);
            }
            class_22057.Method_22076(string2);
            if (class_1699.Method_1715("TeamColor", 2616 & 21576)) {
                class_22057.Method_22074(Class_5478.Method_5527(class_1699.Method_1708("TeamColor")));
            }
            class_22057.Method_22072(class_1699.Method_1708("Prefix"));
            class_22057.Method_22071(class_1699.Method_1708("Suffix"));
            if (class_1699.Method_1715("AllowFriendlyFire", -32529 & 6499)) {
                class_22057.Method_22085(class_1699.Method_1733("AllowFriendlyFire"));
            }
            if (class_1699.Method_1715("SeeFriendlyInvisibles", 8827 & 99)) {
                class_22057.Method_22091(class_1699.Method_1733("SeeFriendlyInvisibles"));
            }
            if (class_1699.Method_1715("NameTagVisibility", -31672 & 6281) && (class_31355 = Class_31355.Method_31373(class_1699.Method_1708("NameTagVisibility"))) != null) {
                class_22057.Method_22073(class_31355);
            }
            if (class_1699.Method_1715("DeathMessageVisibility", 12680 & -30596) && (class_31355 = Class_31355.Method_31373(class_1699.Method_1708("DeathMessageVisibility"))) != null) {
                class_22057.Method_22086(class_31355);
            }
            this.Method_44943(class_22057, class_1699.Method_1735("Players", 8458 & -30664));
        }
    }

    public Class_44927() {
        this("scoreboard");
    }

    public void Method_44938(Class_1699 class_1699) {
        if (this.Field_44928 == null) {
            Field_44930.warn("Tried to save scoreboard without having a scoreboard...");
        } else {
            class_1699.Method_1744("Objectives", this.Method_44941());
            class_1699.Method_1744("PlayerScores", this.Method_44936());
            class_1699.Method_1744("Teams", this.Method_44931());
            this.Method_44942(class_1699);
        }
    }

    protected void Method_44939(Class_1758 class_1758) {
        for (int i = -32252 & 10560; i < class_1758.Method_1772(); ++i) {
            Class_1699 class_1699 = class_1758.Method_1768(i);
            Class_7873 class_7873 = this.Field_44928.Method_21003(class_1699.Method_1708("Objective"));
            String string = class_1699.Method_1708("Name");
            if (string.length() > (-32196 & 16680)) {
                string = string.substring(4702 & -8063, 1320 & 16616);
            }
            Class_21696 class_21696 = this.Field_44928.Method_20993(string, class_7873);
            class_21696.Method_21709(class_1699.Method_1738("Score"));
            if (!class_1699.Method_1707("Locked")) continue;
            class_21696.Method_21705(class_1699.Method_1733("Locked"));
        }
    }

    public Class_44927(String string) {
        super(string);
    }

    public void Method_44940(Class_20976 class_20976) {
        this.Field_44928 = class_20976;
        if (this.Field_44929 != null) {
            this.Method_44934(this.Field_44929);
        }
    }

    protected Class_1758 Method_44941() {
        Class_1758 class_1758 = new Class_1758();
        for (Class_7873 class_7873 : this.Field_44928.Method_20996()) {
            if (class_7873.Method_7883() == null) continue;
            Class_1699 class_1699 = new Class_1699();
            class_1699.Method_1702("Name", class_7873.Method_7881());
            class_1699.Method_1702("CriteriaName", class_7873.Method_7883().Method_27940());
            class_1699.Method_1702("DisplayName", class_7873.Method_7886());
            class_1699.Method_1702("RenderType", class_7873.Method_7880().Method_43304());
            class_1758.Method_1781(class_1699);
        }
        return class_1758;
    }

    protected void Method_44942(Class_1699 class_1699) {
        Class_1699 class_16992 = new Class_1699();
        int n = 18976 & 9667;
        for (int i = 3424 & 8193; i < (10267 & 55); ++i) {
            Class_7873 class_7873 = this.Field_44928.Method_20997(i);
            if (class_7873 == null) continue;
            class_16992.Method_1702("slot_" + i, class_7873.Method_7881());
            n = 4101 & 18809;
        }
        if (n != 0) {
            class_1699.Method_1744("DisplaySlots", class_16992);
        }
    }

    protected void Method_44943(Class_22057 class_22057, Class_1758 class_1758) {
        for (int i = 785 & 8194; i < class_1758.Method_1772(); ++i) {
            this.Field_44928.Method_20998(class_1758.Method_1771(i), class_22057.Method_22075());
        }
    }
}

