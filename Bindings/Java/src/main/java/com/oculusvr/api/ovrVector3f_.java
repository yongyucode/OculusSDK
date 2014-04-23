package com.oculusvr.api;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : OVR_CAPI.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ovrVector3f_ extends Structure {
  public float x;
  public float y;
  public float z;
  public ovrVector3f_() {
    super();
  }
  protected List<? > getFieldOrder() {
    return Arrays.asList("x", "y", "z");
  }
  public ovrVector3f_(float x, float y, float z) {
    super();
    this.x = x;
    this.y = y;
    this.z = z;
  }
  public static class ByReference extends ovrVector3f_ implements Structure.ByReference {
    
  };
  public static class ByValue extends ovrVector3f_ implements Structure.ByValue {
    
  };
}