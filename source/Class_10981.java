/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_10981 {
    private static final Logger Field_10982 = LogManager.getLogger();
    private static final Pattern Field_10983 = Pattern.compile(Class_10981.Method_10991("\u2810\u2814\u2814\u2820\u2820\u2814\u2824\u2834\u2820\u2810\u2834\u2810\u2820\u2814\u2814"));

    private static String Method_10984(String string, int n) {
        int n2;
        Stack<Character> stack = new Stack<Character>();
        int n3 = 4865 & 202;
        int n4 = 4528 & -15872;
        int n5 = 2720 & -32501;
        int n6 = 19497 & -24318;
        for (n2 = n + (13391 & -14047); n2 < string.length(); ++n2) {
            char c = string.charAt(n2);
            if (c == (-32598 & 12642)) {
                if (Class_10981.Method_10989(string, n2)) {
                    if (n3 == 0) {
                        throw new Class_34310("Illegal use of \\\": " + string);
                    }
                } else {
                    int n7 = n3 = n3 == 0 ? 2197 & -19135 : 6404 & 16384;
                    if (n3 != 0 && n5 == 0) {
                        n4 = -32635 & 43;
                    }
                    if (n3 == 0) {
                        n6 = n2;
                    }
                }
            } else if (n3 == 0) {
                if (c != (-32517 & 3195) && c != (-7841 & 6747)) {
                    if (c == (6397 & 8319) && (stack.isEmpty() || ((Character)stack.pop()).charValue() != (379 & 18555))) {
                        throw new Class_34310("Unbalanced curly brackets {}: " + string);
                    }
                    if (c == (6237 & -24227) && (stack.isEmpty() || ((Character)stack.pop()).charValue() != (-6053 & 1147))) {
                        throw new Class_34310("Unbalanced square brackets []: " + string);
                    }
                    if (c == (9517 & 44) && stack.isEmpty()) {
                        return string.substring(1044 & -3584, n2);
                    }
                } else {
                    stack.push(Character.valueOf(c));
                }
            }
            if (Character.isWhitespace(c)) continue;
            if (n3 == 0 && n4 != 0 && n6 != n2) {
                return string.substring(25668 & 6176, n6 + (1697 & 4119));
            }
            n5 = 8325 & 539;
        }
        return string.substring(20992 & -31471, n2);
    }

    private static String Method_10985(String string, boolean bl) {
        if (bl && ((string = string.trim()).startsWith("{") || string.startsWith("["))) {
            return "";
        }
        int n = Class_10981.Method_10995(string, (char)(-31617 & 314));
        if (n == (-1 & -1)) {
            if (bl) {
                return "";
            }
            throw new Class_34310("Unable to locate name/value separator for string: " + string);
        }
        return string.substring(1088 & -30719, n).trim();
    }

    static Class_9867 Method_10986(String string, String string2) {
        if ((string2 = string2.trim()).startsWith("{")) {
            string2 = string2.substring(-32191 & 16641, string2.length() - (257 & 16513));
            Class_23460 class_23460 = new Class_23460(string);
            while (string2.length() > 0) {
                int c;
                String string3 = Class_10981.Method_10992(string2, (173 & 23363) != 0);
                if (string3.length() > 0) {
                    c = 12324 & 19216;
                    class_23460.Field_23461.add(Class_10981.Method_10990(string3, c != 0));
                }
                if (string2.length() < string3.length() + (10393 & 261)) break;
                c = string2.charAt(string3.length());
                if (c != (-30916 & 4204) && c != (16507 & 635) && c != (3199 & -32515) && c != (2139 & 12799) && c != (30557 & 93)) {
                    throw new Class_34310("Unexpected token '" + c + "' at: " + string2.substring(string3.length()));
                }
                string2 = string2.substring(string3.length() + (-28057 & 11265));
            }
            return class_23460;
        }
        if (string2.startsWith("[") && !Field_10983.matcher(string2).matches()) {
            string2 = string2.substring(8359 & 18441, string2.length() - (7433 & 16915));
            Class_27099 class_27099 = new Class_27099(string);
            while (string2.length() > 0) {
                int c;
                String string4 = Class_10981.Method_10992(string2, (-16314 & 12600) != 0);
                if (string4.length() > 0) {
                    c = 31271 & 65;
                    class_27099.Field_27100.add(Class_10981.Method_10990(string4, c != 0));
                }
                if (string2.length() < string4.length() + (3 & -15919)) break;
                c = string2.charAt(string4.length());
                if (c != (-24020 & 4141) && c != (9339 & 127) && c != (893 & 6269) && c != (-29857 & 8283) && c != (-12195 & 1757)) {
                    throw new Class_34310("Unexpected token '" + c + "' at: " + string2.substring(string4.length()));
                }
                string2 = string2.substring(string4.length() + (-32375 & 1091));
            }
            return class_27099;
        }
        return new Class_23773(string, string2);
    }

    static Class_9867 Method_10987(String ... arrstring) {
        return Class_10981.Method_10986(arrstring[7 & 22824], arrstring[-8135 & 5191]);
    }

    private static String Method_10988(String string, boolean bl) {
        if (bl && ((string = string.trim()).startsWith("{") || string.startsWith("["))) {
            return string;
        }
        int n = Class_10981.Method_10995(string, (char)(-28481 & 26426));
        if (n == (-1 & -1)) {
            if (bl) {
                return string;
            }
            throw new Class_34310("Unable to locate name/value separator for string: " + string);
        }
        return string.substring(n + (5137 & 367)).trim();
    }

    private static boolean Method_10989(String string, int n) {
        return (n > 0 && string.charAt(n - (2053 & 833)) == (1116 & 16477) && !Class_10981.Method_10989(string, n - (1635 & 8201)) ? 1091 & 16641 : 0 & 1628) != 0;
    }

    private static Class_9867 Method_10990(String string, boolean bl) {
        String string2 = Class_10981.Method_10985(string, bl);
        String string3 = Class_10981.Method_10988(string, bl);
        String[] arrstring = new String[5126 & 17250];
        arrstring[8384 & 2082] = string2;
        arrstring[9253 & 16913] = string3;
        return Class_10981.Method_10987(arrstring);
    }

    private static String Method_10991(String string) {
        int n = 17792;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_10981.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_10992(String string, boolean bl) {
        int n = Class_10981.Method_10995(string, (char)(122 & 32315));
        int n2 = Class_10981.Method_10995(string, (char)(-30164 & 127));
        if (bl) {
            if (n == (-1 & -1)) {
                throw new Class_34310("Unable to locate name/value separator for string: " + string);
            }
            if (n2 != (-1 & -1) && n2 < n) {
                throw new Class_34310("Name error at: " + string);
            }
        } else if (n == (-1 & -1) || n > n2) {
            n = -1 & -1;
        }
        return Class_10981.Method_10984(string, n);
    }

    private void Method_10993() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static int Method_10994(String string) {
        int n = 4224 & -31424;
        int n2 = 26824 & 4097;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 1172 & 10; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c == (-24533 & 4966)) {
                if (Class_10981.Method_10989(string, i)) {
                    if (n2 != 0) continue;
                    throw new Class_34310("Illegal use of \\\": " + string);
                }
                n2 = n2 == 0 ? -24495 & 5 : 2208 & 9052;
                continue;
            }
            if (n2 != 0) continue;
            if (c != (2175 & 8443) && c != (-31269 & 25211)) {
                if (c == (4221 & 9853) && (stack.isEmpty() || ((Character)stack.pop()).charValue() != (20603 & 1407))) {
                    throw new Class_34310("Unbalanced curly brackets {}: " + string);
                }
                if (c != (-6051 & 4223) || !stack.isEmpty() && ((Character)stack.pop()).charValue() == (91 & 8443)) continue;
                throw new Class_34310("Unbalanced square brackets []: " + string);
            }
            if (stack.isEmpty()) {
                ++n;
            }
            stack.push(Character.valueOf(c));
        }
        if (n2 != 0) {
            throw new Class_34310("Unbalanced quotation: " + string);
        }
        if (!stack.isEmpty()) {
            throw new Class_34310("Unbalanced brackets: " + string);
        }
        if (n == 0 && !string.isEmpty()) {
            n = 12303 & 321;
        }
        return n;
    }

    private static int Method_10995(String string, char c) {
        int n = -21851 & 20481;
        for (int i = 524 & 27970; i < string.length(); ++i) {
            char c2 = string.charAt(i);
            if (c2 == (4403 & -22490)) {
                if (Class_10981.Method_10989(string, i)) continue;
                n = n == 0 ? 1069 & 16449 : 323 & 2560;
                continue;
            }
            if (n == 0) continue;
            if (c2 == c) {
                return i;
            }
            if (c2 != (-2949 & 379) && c2 != (14463 & -32421)) continue;
            return -1 & -1;
        }
        return -1 & -1;
    }

    public static Class_1699 Method_10996(String string) {
        if (!(string = string.trim()).startsWith("{")) {
            throw new Class_34310("Invalid tag encountered, expected '{' as first char.");
        }
        if (Class_10981.Method_10994(string) != (467 & 18465)) {
            throw new Class_34310("Encountered multiple top tags, only one expected");
        }
        return (Class_1699)Class_10981.Method_10986("tag", string).Method_9870();
    }
}

