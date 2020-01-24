/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u0000& return package if 7 private 2 transient case 2 boolean package throws for const native 
 *  \u0000& return package if 7 private 2 transient case 2 boolean package throws for const native $ | default interface this interface class import 4 static return while abstract ' ? ] 
 *  \u0000& return package if 7 private 2 transient case 2 boolean package throws for const native $ | default interface this interface class import 4 static return while abstract ' ? ] $ if 3 5 4 % 8 byte 
 *  \u0000& return package if 7 private 2 transient case 2 boolean package throws for const native $ | default interface this interface class import 4 static return while abstract ' ? ] $ if 3 5 4 % 8 byte $ long , super } strictfp class true short continue default 2 new abstract
 *  \u0000, public goto static default " void goto double 7 interface package 8 2 native void { 
 *  \u0000, public goto static default " void goto double 7 interface package 8 2 native void { $ if interface = 8 ~ class short throws interface ' + # continue break 4 super 2 try throw continue volatile package + try , ] & volatile true ` extends long 7 7 break byte
 *  \u0000break instanceof protected 9 finally null strictfp switch instanceof void if 9 break - 4 return package private % package implements void ` for ^ & const 2 false = } instanceof ] catch 2 if false 5 catch throw - try % public % - new continue 9 do { long long ?
 *  \u0000default interface const super % else interface char protected false 9 2 false 4 4 throw throw short interface do break final 5 throws native for import this short 6 ' 1 4 throws abstract boolean 2 throw int return 6 for case abstract char ' = int { if 7 volatile | return
 *  \u0000public break const & import try int extends 8 % | void 7 | 6 int ] } + float 6 + try { { if while ' catch - - ` for const native , { ' byte * + double 0 4 switch public 3 if package boolean else if static transient { instanceof - import super 3 ! public false
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.IOUtils
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.IOUtils;

public class Class_28961
extends Class_23424 {
    private static final Class_2793 Field_28962 = Class_28961.Method_28964();
    private String Field_28963;

    private static Class_2793 Method_28964() {
        Class_2793 class_2793 = new Class_2793();
        class_2793.Method_2799((Class_2078)new \u0000& return package if 7 private 2 transient case 2 boolean package throws for const native . | default interface this interface class import 4 static return while abstract ' ? ] . if 3 5 4 % 8 byte . long , super } strictfp class true short continue default 2 new abstract(), Class_26185.class);
        class_2793.Method_2799((Class_2078)new \u0000break instanceof protected 9 finally null strictfp switch instanceof void if 9 break - 4 return package private % package implements void ` for ^ & const 2 false = } instanceof ] catch 2 if false 5 catch throw - try % public % - new continue 9 do { long long ?(), Class_27193.class);
        class_2793.Method_2799((Class_2078)new \u0000public break const & import try int extends 8 % | void 7 | 6 int ] } + float 6 + try { { if while ' catch - - ` for const native , { ' byte * + double 0 4 switch public 3 if package boolean else if static transient { instanceof - import super 3 ! public false(), Class_26720.class);
        class_2793.Method_2799((Class_2078)new \u0000, public goto static default " void goto double 7 interface package 8 2 native void { . if interface = 8 ~ class short throws interface ' + # continue break 4 super 2 try throw continue volatile package + try , ] & volatile true ` extends long 7 7 break byte(), Class_30227.class);
        class_2793.Method_2799((Class_2078)new \u0000default interface const super % else interface char protected false 9 2 false 4 4 throw throw short interface do break final 5 throws native for import this short 6 ' 1 4 throws abstract boolean 2 throw int return 6 for case abstract char ' = int { if 7 volatile | return(), Class_36321.class);
        return class_2793;
    }

    private void Method_28965() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Class_26185 Method_28966() {
        String string = this.Field_28963 + ".mcmeta";
        String string2 = "texture";
        InputStream inputStream = Class_12440.Method_12993(string);
        if (inputStream != null) {
            Class_26185 class_26185;
            Class_26185 class_261852;
            Class_2793 class_2793 = Field_28962;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                JsonObject jsonObject = new JsonParser().parse((Reader)bufferedReader).getAsJsonObject();
                class_261852 = (Class_26185)class_2793.Method_2798(string2, jsonObject);
                if (class_261852 == null) {
                    Class_26185 class_261853 = new Class_26185((-32767 & 1536) != 0, (8576 & -16381) != 0, new ArrayList());
                    return class_261853;
                }
                class_26185 = class_261852;
            }
            catch (RuntimeException runtimeException) {
                Class_26062.Method_26066("Error reading metadata: " + string);
                Class_26062.Method_26066("" + runtimeException.getClass().getName() + ": " + runtimeException.getMessage());
                class_261852 = new Class_26185((2129 & -18934) != 0, (-30328 & 8192) != 0, new ArrayList());
                return class_261852;
            }
            finally {
                IOUtils.closeQuietly((Reader)bufferedReader);
                IOUtils.closeQuietly((InputStream)inputStream);
            }
            return class_26185;
        }
        return new Class_26185((16640 & 13493) != 0, (18544 & -32378) != 0, new ArrayList());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_28967(Class_279 class_279) {
        this.\u0000= final();
        InputStream inputStream = Class_12440.Method_12993(this.Field_28963);
        if (inputStream == null) {
            throw new FileNotFoundException("Shader texture not found: " + this.Field_28963);
        }
        try {
            BufferedImage bufferedImage = Class_18695.Method_18726(inputStream);
            Class_26185 class_26185 = this.Method_28966();
            Class_18695.Method_18703(this.\u0000strictfp(), bufferedImage, class_26185.Method_26192(), class_26185.Method_26191());
        }
        finally {
            IOUtils.closeQuietly((InputStream)inputStream);
        }
    }

    public Class_28961(String string) {
        this.Field_28963 = string;
    }
}

