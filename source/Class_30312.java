/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;

public class Class_30312 {
    public Class_11372[] Field_30313 = null;
    public Class_30305[] Field_30314 = null;
    public int Field_30315 = -24302 & 3616;
    public boolean Field_30316 = 4865 & 8406;
    public Class_27481 Field_30317 = null;
    public String Field_30318 = null;
    public int[] Field_30319 = null;
    public int Field_30320 = 16641 & 79;
    public int[] Field_30321 = null;
    public int Field_30322 = 8467 & 16909;
    public String[] Field_30323 = null;
    public boolean Field_30324 = 5317 & 16416;
    public String[] Field_30325 = null;
    public int Field_30326 = 96 & 8834;
    public Class_11372[] Field_30327 = null;
    public int Field_30328 = 19539 & -20472;
    public String Field_30329 = null;
    public int[] Field_30330 = null;
    public int Field_30331 = -30687 & 1112;
    public Class_17281[] Field_30332 = null;
    public int Field_30333 = 12613 & 18064;
    public int Field_30334 = 6783 & 319;

    private boolean Method_30335(String string) {
        if (this.Field_30323 == null) {
            this.Field_30323 = this.Method_30359("0-11 16-27 32-43 48-58");
        }
        if (this.Field_30323.length < (20527 & -24513)) {
            Class_19426.Method_19610("Invalid tiles, must be at least 47: " + string);
            return (11392 & -32475) != 0;
        }
        return (-32751 & 13571) != 0;
    }

    private boolean Method_30336(String string) {
        if (this.Field_30323 == null) {
            this.Field_30323 = this.Method_30359("66");
        }
        if (this.Field_30323.length != (13341 & 3)) {
            Class_19426.Method_19610("Invalid tiles, must be exactly 1: " + string);
            return (86 & 4097) != 0;
        }
        return (-26463 & 65) != 0;
    }

    private boolean Method_30337(String string) {
        if (this.Field_30323 == null) {
            Class_19426.Method_19610("No tiles defined for vertical: " + string);
            return (16388 & 10434) != 0;
        }
        if (this.Field_30323.length != (28677 & 1420)) {
            Class_19426.Method_19610("Invalid tiles, must be exactly 4: " + string);
            return (-29658 & 17232) != 0;
        }
        return (16385 & 2129) != 0;
    }

    private boolean Method_30338(String string) {
        if (this.Field_30323 != null && this.Field_30323.length > 0) {
            if (this.Field_30321 != null) {
                int n;
                int[] arrn;
                if (this.Field_30321.length > this.Field_30323.length) {
                    Class_19426.Method_19610("More weights defined than tiles, trimming weights: " + string);
                    arrn = new int[this.Field_30323.length];
                    System.arraycopy(this.Field_30321, 772 & 18512, arrn, 2054 & -32447, arrn.length);
                    this.Field_30321 = arrn;
                }
                if (this.Field_30321.length < this.Field_30323.length) {
                    Class_19426.Method_19610("Less weights defined than tiles, expanding weights: " + string);
                    arrn = new int[this.Field_30323.length];
                    System.arraycopy(this.Field_30321, -9727 & 32, arrn, 16800 & 1027, this.Field_30321.length);
                    n = Class_8832.Method_8836(this.Field_30321);
                    for (int i = this.Field_30321.length; i < arrn.length; ++i) {
                        arrn[i] = n;
                    }
                    this.Field_30321 = arrn;
                }
                this.Field_30319 = new int[this.Field_30321.length];
                int n2 = 20608 & 8744;
                for (n = 1065 & -14336; n < this.Field_30321.length; ++n) {
                    this.Field_30319[n] = n2 += this.Field_30321[n];
                }
                this.Field_30322 = n2;
                if (this.Field_30322 <= 0) {
                    Class_19426.Method_19610("Invalid sum of all weights: " + n2);
                    this.Field_30322 = 10421 & -12021;
                }
            }
            return (12589 & 579) != 0;
        }
        Class_19426.Method_19610("Tiles not defined: " + string);
        return (31072 & -31732) != 0;
    }

    private static Class_11372[] Method_30339(String[] arrstring, Class_24069 class_24069) {
        if (arrstring == null) {
            return null;
        }
        ArrayList<Class_11372> arrayList = new ArrayList<Class_11372>();
        for (int i = 17184 & -31737; i < arrstring.length; ++i) {
            boolean bl;
            String string;
            Class_2080 class_2080;
            String string2 = arrstring[i];
            Class_2080 class_20802 = new Class_2080(string2);
            String string3 = class_20802.Method_2085();
            String string4 = class_20802.Method_2084();
            if (!string4.contains("/")) {
                string4 = "textures/blocks/" + string4;
            }
            if (!(bl = Class_19426.Method_19594(class_2080 = new Class_2080(string3, string = string4 + ".png")))) {
                Class_19426.Method_19610("File not found: " + string);
            }
            String string5 = "textures/";
            String string6 = string4;
            if (string4.startsWith(string5)) {
                string6 = string4.substring(string5.length());
            }
            Class_2080 class_20803 = new Class_2080(string3, string6);
            Class_11372 class_11372 = class_24069.Method_24105(class_20803);
            arrayList.add(class_11372);
        }
        Class_11372[] arrclass_11372 = arrayList.toArray(new Class_11372[arrayList.size()]);
        return arrclass_11372;
    }

    private boolean Method_30340(String string) {
        if (this.Field_30323 == null) {
            Class_19426.Method_19610("Tiles not defined: " + string);
            return (17184 & 4109) != 0;
        }
        if (this.Field_30323.length != (41 & 8193)) {
            Class_19426.Method_19610("Number of tiles should be 1 for method: fixed.");
            return (8725 & 4096) != 0;
        }
        return (1169 & -8189) != 0;
    }

    private int Method_30341() {
        return this.Field_30314 != null ? 16597 & 4609 : (this.Field_30325 != null ? -32510 & 16562 : 13975 & -30584);
    }

    private boolean Method_30342(String string) {
        if (this.Field_30323 == null) {
            Class_19426.Method_19610("No tiles defined for vertical+horizontal: " + string);
            return (17868 & 0) != 0;
        }
        if (this.Field_30323.length != (7 & 20575)) {
            Class_19426.Method_19610("Invalid tiles, must be exactly 7: " + string);
            return (548 & 22681) != 0;
        }
        return (-27551 & 18441) != 0;
    }

    public boolean Method_30343(int n, int n2) {
        return (!Class_20912.Method_20918(n, n2, this.Field_30314) ? 544 & -14080 : (int)(Class_20912.Method_20915(n2, this.Field_30330) ? 1 : 0)) != 0;
    }

    public boolean Method_30344(int n) {
        return Class_20912.Method_20916(n, this.Field_30314);
    }

    private static int Method_30345(String string) {
        if (string == null) {
            return 1 & 2067;
        }
        if ((string = string.trim()).equals("opposite")) {
            return 4966 & 9218;
        }
        if (string.equals("all")) {
            return 7174 & 270;
        }
        Class_19426.Method_19610("Unknown symmetry: " + string);
        return 4117 & 2305;
    }

    private boolean Method_30346(String string) {
        if (this.Field_30323 == null) {
            Class_19426.Method_19610("Tiles not defined: " + string);
            return (24632 & -27135) != 0;
        }
        if (this.Field_30326 > 0 && this.Field_30326 <= (18448 & 90)) {
            if (this.Field_30328 > 0 && this.Field_30328 <= (-24304 & 4123)) {
                if (this.Field_30323.length != this.Field_30326 * this.Field_30328) {
                    Class_19426.Method_19610("Number of tiles does not equal width x height: " + string);
                    return (-32348 & 25098) != 0;
                }
                return (37 & 385) != 0;
            }
            Class_19426.Method_19610("Invalid height: " + string);
            return (-28134 & 1280) != 0;
        }
        Class_19426.Method_19610("Invalid width: " + string);
        return (8208 & 2145) != 0;
    }

    private static Class_11372 Method_30347(String string) {
        Class_24069 class_24069 = Class_18.Field_89.Method_189();
        Class_11372 class_11372 = class_24069.Method_24107(string);
        if (class_11372 != null) {
            return class_11372;
        }
        class_11372 = class_24069.Method_24107("blocks/" + string);
        return class_11372;
    }

    private static int Method_30348(String string) {
        if (string == null) {
            return 18548 & 5635;
        }
        if ((string = string.trim()).equals("block")) {
            return 16513 & 2337;
        }
        if (string.equals("tile")) {
            return 10771 & 194;
        }
        if (string.equals("material")) {
            return -28601 & 1795;
        }
        Class_19426.Method_19610("Unknown connect: " + string);
        return -13424 & 128;
    }

    private int Method_30349(int[] arrn, int n) {
        if (arrn == null) {
            return n;
        }
        for (int i = 641 & 1120; i < arrn.length; ++i) {
            int n2 = arrn[i];
            if (n2 <= n) continue;
            n = n2;
        }
        return n;
    }

    private static int Method_30350(String string) {
        if (string == null) {
            return 11327 & 383;
        }
        String[] arrstring = Class_19426.Method_19561(string, " ,");
        int n = 4138 & 17409;
        for (int i = -20222 & 2176; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            int n2 = Class_30312.Method_30365(string2);
            n |= n2;
        }
        return n;
    }

    public boolean Method_30351(String string) {
        if (this.Field_30318 != null && this.Field_30318.length() > 0) {
            if (this.Field_30329 == null) {
                Class_19426.Method_19610("No base path found: " + string);
                return (8960 & -13308) != 0;
            }
            if (this.Field_30314 == null) {
                this.Field_30314 = this.Method_30360();
            }
            if (this.Field_30325 == null && this.Field_30314 == null) {
                this.Field_30325 = this.Method_30355();
            }
            if (this.Field_30314 == null && this.Field_30325 == null) {
                Class_19426.Method_19610("No matchBlocks or matchTiles specified: " + string);
                return (10376 & 17427) != 0;
            }
            if (this.Field_30333 == 0) {
                Class_19426.Method_19610("No method: " + string);
                return (23619 & 24) != 0;
            }
            if (this.Field_30323 != null && this.Field_30323.length > 0) {
                if (this.Field_30331 == 0) {
                    this.Field_30331 = this.Method_30341();
                }
                if (this.Field_30331 == (15058 & 128)) {
                    Class_19426.Method_19610("Invalid connect in: " + string);
                    return (8347 & -32192) != 0;
                }
                if (this.Field_30315 > 0) {
                    Class_19426.Method_19610("Render pass not supported: " + this.Field_30315);
                    return (-31710 & 4237) != 0;
                }
                if ((this.Field_30334 & (23965 & 192)) != 0) {
                    Class_19426.Method_19610("Invalid faces in: " + string);
                    return (16933 & 320) != 0;
                }
                if ((this.Field_30320 & (19584 & 8901)) != 0) {
                    Class_19426.Method_19610("Invalid symmetry in: " + string);
                    return (11080 & -31727) != 0;
                }
                switch (this.Field_30333) {
                    case 1: {
                        return this.Method_30335(string);
                    }
                    case 2: {
                        return this.Method_30357(string);
                    }
                    case 3: {
                        return this.Method_30336(string);
                    }
                    case 4: {
                        return this.Method_30338(string);
                    }
                    case 5: {
                        return this.Method_30346(string);
                    }
                    case 6: {
                        return this.Method_30337(string);
                    }
                    case 7: {
                        return this.Method_30340(string);
                    }
                    case 8: {
                        return this.Method_30366(string);
                    }
                    case 9: {
                        return this.Method_30342(string);
                    }
                }
                Class_19426.Method_19610("Unknown method: " + string);
                return (-22784 & 6148) != 0;
            }
            Class_19426.Method_19610("No tiles specified: " + string);
            return (-16304 & 14592) != 0;
        }
        Class_19426.Method_19610("No name found: " + string);
        return (577 & -28510) != 0;
    }

    public void Method_30352(Class_24069 class_24069) {
        if (this.Field_30325 != null) {
            this.Field_30327 = Class_30312.Method_30339(this.Field_30325, class_24069);
        }
        if (this.Field_30323 != null) {
            this.Field_30313 = Class_30312.Method_30339(this.Field_30323, class_24069);
        }
    }

    public int Method_30353() {
        int n = -1 & -1;
        n = this.Method_30349(this.Field_30330, n);
        if (this.Field_30314 != null) {
            for (int i = 0 & -7646; i < this.Field_30314.length; ++i) {
                Class_30305 class_30305 = this.Field_30314[i];
                n = this.Method_30349(class_30305.Method_30310(), n);
            }
        }
        return n;
    }

    private int[] Method_30354() {
        int n;
        int n2;
        int[] arrn;
        char c;
        if (!this.Field_30318.startsWith("block")) {
            return null;
        }
        for (n2 = n = "block".length(); n2 < this.Field_30318.length() && (c = this.Field_30318.charAt(n2)) >= (1264 & 19256) && c <= (6329 & 377); ++n2) {
        }
        if (n2 == n) {
            return null;
        }
        String string = this.Field_30318.substring(n, n2);
        int n3 = Class_19426.Method_19502(string, -1 & -1);
        if (n3 < 0) {
            arrn = null;
        } else {
            int[] arrn2 = new int[26665 & -28669];
            arrn = arrn2;
            arrn2[20002 & -32504] = n3;
        }
        return arrn;
    }

    private String[] Method_30355() {
        String[] arrstring;
        Class_11372 class_11372 = Class_30312.Method_30347(this.Field_30318);
        if (class_11372 == null) {
            arrstring = null;
        } else {
            String[] arrstring2 = new String[10503 & 1105];
            arrstring = arrstring2;
            arrstring2[6672 & 16523] = this.Field_30318;
        }
        return arrstring;
    }

    public Class_30312(Properties properties, String string) {
        Class_25611 class_25611 = new Class_25611("ConnectedTextures");
        this.Field_30318 = class_25611.Method_25621(string);
        this.Field_30329 = class_25611.Method_25632(string);
        this.Field_30314 = class_25611.Method_25618(properties.getProperty("matchBlocks"));
        this.Field_30330 = class_25611.Method_25613(properties.getProperty("metadata"));
        this.Field_30325 = this.Method_30358(properties.getProperty("matchTiles"));
        this.Field_30333 = Class_30312.Method_30362(properties.getProperty("method"));
        this.Field_30323 = this.Method_30359(properties.getProperty("tiles"));
        this.Field_30331 = Class_30312.Method_30348(properties.getProperty("connect"));
        this.Field_30334 = Class_30312.Method_30350(properties.getProperty("faces"));
        this.Field_30332 = class_25611.Method_25622(properties.getProperty("biomes"));
        this.Field_30317 = class_25611.Method_25627(properties.getProperty("heights"));
        if (this.Field_30317 == null) {
            int n = class_25611.Method_25623(properties.getProperty("minHeight"), -1 & -1);
            int n2 = class_25611.Method_25623(properties.getProperty("maxHeight"), 17984 & -27382);
            if (n != (-1 & -1) || n2 != (1320 & 13312)) {
                this.Field_30317 = new Class_27481(new Class_17230(n, n2));
            }
        }
        this.Field_30315 = class_25611.Method_25629(properties.getProperty("renderPass"));
        this.Field_30316 = class_25611.Method_25614(properties.getProperty("innerSeams"));
        this.Field_30326 = class_25611.Method_25629(properties.getProperty("width"));
        this.Field_30328 = class_25611.Method_25629(properties.getProperty("height"));
        this.Field_30321 = class_25611.Method_25613(properties.getProperty("weights"));
        this.Field_30320 = Class_30312.Method_30345(properties.getProperty("symmetry"));
        this.Field_30324 = class_25611.Method_25614(properties.getProperty("linked"));
    }

    private void Method_30356() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private boolean Method_30357(String string) {
        if (this.Field_30323 == null) {
            this.Field_30323 = this.Method_30359("12-15");
        }
        if (this.Field_30323.length != (271 & -27564)) {
            Class_19426.Method_19610("Invalid tiles, must be exactly 4: " + string);
            return (12803 & 180) != 0;
        }
        return (1543 & -19999) != 0;
    }

    private String[] Method_30358(String string) {
        if (string == null) {
            return null;
        }
        String[] arrstring = Class_19426.Method_19561(string, " ");
        for (int i = 160 & 2136; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            if (string2.endsWith(".png")) {
                string2 = string2.substring(1616 & 8580, string2.length() - (6788 & 348));
            }
            arrstring[i] = string2 = Class_21583.Method_21606(string2, this.Field_30329);
        }
        return arrstring;
    }

    private String[] Method_30359(String string) {
        Object object;
        if (string == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] arrstring = Class_19426.Method_19561(string, " ,");
        for (int i = 27904 & 0; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            if (string2.contains("-") && ((String[])(object = Class_19426.Method_19561(string2, "-"))).length == (16978 & 8354)) {
                int n = Class_19426.Method_19502(object[1746 & -32480], -1 & -1);
                int n2 = Class_19426.Method_19502((String)object[-24543 & 7363], -1 & -1);
                if (n >= 0 && n2 >= 0) {
                    if (n > n2) {
                        Class_19426.Method_19610("Invalid interval: " + string2 + ", when parsing: " + string);
                        continue;
                    }
                    for (int j = n; j <= n2; ++j) {
                        arrayList.add(String.valueOf(j));
                    }
                    continue;
                }
            }
            arrayList.add(string2);
        }
        String[] arrstring2 = arrayList.toArray(new String[arrayList.size()]);
        for (int i = 33 & 478; i < arrstring2.length; ++i) {
            String string3;
            object = arrstring2[i];
            if (!(((String)(object = Class_21583.Method_21606((String)object, this.Field_30329))).startsWith(this.Field_30329) || ((String)object).startsWith("textures/") || ((String)object).startsWith("mcpatcher/"))) {
                object = this.Field_30329 + "/" + (String)object;
            }
            if (((String)object).endsWith(".png")) {
                object = ((String)object).substring(1672 & 8293, ((String)object).length() - (1924 & -24498));
            }
            if (((String)object).startsWith(string3 = "textures/blocks/")) {
                object = ((String)object).substring(string3.length());
            }
            if (((String)object).startsWith("/")) {
                object = ((String)object).substring(-32765 & 11265);
            }
            arrstring2[i] = object;
        }
        return arrstring2;
    }

    private Class_30305[] Method_30360() {
        int[] arrn = this.Method_30354();
        if (arrn == null) {
            return null;
        }
        Class_30305[] arrclass_30305 = new Class_30305[arrn.length];
        for (int i = 385 & 3640; i < arrclass_30305.length; ++i) {
            arrclass_30305[i] = new Class_30305(arrn[i]);
        }
        return arrclass_30305;
    }

    public boolean Method_30361(Class_11372 class_11372) {
        return Class_20912.Method_20913(class_11372, this.Field_30327);
    }

    private static int Method_30362(String string) {
        if (string == null) {
            return 8709 & -31671;
        }
        if (!(string = string.trim()).equals("ctm") && !string.equals("glass")) {
            if (!string.equals("horizontal") && !string.equals("bookshelf")) {
                if (string.equals("vertical")) {
                    return 1414 & 10838;
                }
                if (string.equals("top")) {
                    return 17179 & 8195;
                }
                if (string.equals("random")) {
                    return -32698 & 516;
                }
                if (string.equals("repeat")) {
                    return 31069 & 1029;
                }
                if (string.equals("fixed")) {
                    return 8199 & 20519;
                }
                if (!string.equals("horizontal+vertical") && !string.equals("h+v")) {
                    if (!string.equals("vertical+horizontal") && !string.equals("v+h")) {
                        Class_19426.Method_19610("Unknown method: " + string);
                        return -23456 & 16660;
                    }
                    return -15953 & 4121;
                }
                return 714 & 5181;
            }
            return 8214 & -15550;
        }
        return -28535 & 773;
    }

    public boolean Method_30363(Class_17281 class_17281) {
        return Class_20912.Method_20917(class_17281, this.Field_30332);
    }

    public static Class_3538 Method_30364(String string, Collection collection) {
        for (Class_3538 class_3538 : collection) {
            if (!string.equals(class_3538.Method_3541())) continue;
            return class_3538;
        }
        return null;
    }

    private static int Method_30365(String string) {
        if (!(string = string.toLowerCase()).equals("bottom") && !string.equals("down")) {
            if (!string.equals("top") && !string.equals("up")) {
                if (string.equals("north")) {
                    return 4637 & 8230;
                }
                if (string.equals("south")) {
                    return -32248 & 23832;
                }
                if (string.equals("east")) {
                    return 60 & 6688;
                }
                if (string.equals("west")) {
                    return 26000 & 528;
                }
                if (string.equals("sides")) {
                    return 12988 & 127;
                }
                if (string.equals("all")) {
                    return 575 & 16511;
                }
                Class_19426.Method_19610("Unknown face: " + string);
                return 16545 & 194;
            }
            return 6722 & 16547;
        }
        return 609 & -24291;
    }

    private boolean Method_30366(String string) {
        if (this.Field_30323 == null) {
            Class_19426.Method_19610("No tiles defined for horizontal+vertical: " + string);
            return (4384 & 8210) != 0;
        }
        if (this.Field_30323.length != (-32681 & 1927)) {
            Class_19426.Method_19610("Invalid tiles, must be exactly 7: " + string);
            return (2644 & 25603) != 0;
        }
        return (769 & 16453) != 0;
    }

    public String Method_30367() {
        return "CTM name: " + this.Field_30318 + ", basePath: " + this.Field_30329 + ", matchBlocks: " + Class_19426.Method_19555(this.Field_30314) + ", matchTiles: " + Class_19426.Method_19555(this.Field_30325);
    }
}

