package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Conflicts extends JsObject {

    
    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    private Fill fill;

    public void setFill(Fill fill) {
        this.fill = fill;
    }

    private String color;
    private Double opacity;

    public void setFill(String color, Double opacity) {
        this.color = color;
        this.opacity = opacity;
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private Rect mode1;
    private Double opacity1;

    public void setFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        this.keys = null;
        this.keys1 = null;
        
        this.keys = keys;
        this.mode = null;
        this.mode1 = null;
        
        this.mode = mode;
        this.angle = angle;
        this.opacity = null;
        this.opacity1 = null;
        
        this.opacity1 = opacity1;
    }


    public void setFill(GradientKey[] keys, Rect mode1, Double angle, Double opacity1) {
        this.keys = null;
        this.keys1 = null;
        
        this.keys = keys;
        this.mode = null;
        this.mode1 = null;
        
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity = null;
        this.opacity1 = null;
        
        this.opacity1 = opacity1;
    }


    public void setFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        this.keys = null;
        this.keys1 = null;
        
        this.keys1 = keys1;
        this.mode = null;
        this.mode1 = null;
        
        this.mode = mode;
        this.angle = angle;
        this.opacity = null;
        this.opacity1 = null;
        
        this.opacity1 = opacity1;
    }


    public void setFill(String[] keys1, Rect mode1, Double angle, Double opacity1) {
        this.keys = null;
        this.keys1 = null;
        
        this.keys1 = keys1;
        this.mode = null;
        this.mode1 = null;
        
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity = null;
        this.opacity1 = null;
        
        this.opacity1 = opacity1;
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private Rect mode2;
    private Double opacity2;
    private Double fx;
    private Double fy;

    public void setFill(GradientKey[] keys2, Double cx, Double cy, Rect mode2, Double opacity2, Double fx, Double fy) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        
        this.keys2 = keys2;
        this.cx = cx;
        this.cy = cy;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        
        this.mode2 = mode2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;
    }


    public void setFill(String[] keys3, Double cx, Double cy, Rect mode2, Double opacity2, Double fx, Double fy) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        
        this.keys3 = keys3;
        this.cx = cx;
        this.cy = cy;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        
        this.mode2 = mode2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;
    }

    private Fill imageSettings;
    private PatternFill patternFillOrType;
    private HatchFill patternFillOrType1;
    private HatchFillType patternFillOrType2;
    private String patternFillOrType3;
    private String color1;
    private Double thickness;
    private Double size;

    public void setHatchfill(PatternFill patternFillOrType, String color1, Double thickness, Double size) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        
        this.patternFillOrType = patternFillOrType;
        this.color = null;
        this.color1 = null;
        
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;
    }


    public void setHatchfill(HatchFill patternFillOrType1, String color1, Double thickness, Double size) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        
        this.patternFillOrType1 = patternFillOrType1;
        this.color = null;
        this.color1 = null;
        
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;
    }


    public void setHatchfill(HatchFillType patternFillOrType2, String color1, Double thickness, Double size) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        
        this.patternFillOrType2 = patternFillOrType2;
        this.color = null;
        this.color1 = null;
        
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;
    }


    public void setHatchfill(String patternFillOrType3, String color1, Double thickness, Double size) {
        this.patternFillOrType = null;
        this.patternFillOrType1 = null;
        this.patternFillOrType2 = null;
        this.patternFillOrType3 = null;
        
        this.patternFillOrType3 = patternFillOrType3;
        this.color = null;
        this.color1 = null;
        
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;
    }

    private Double height;

    public void setHeight(Double height) {
        this.height = height;
    }

    private Boolean labels;

    public void setLabels(Boolean labels) {
        this.labels = labels;
    }

    private String type;
    private Boolean useCapture;

    public void setListen(String type, Boolean useCapture) {
        this.type = type;
        this.useCapture = useCapture;
    }

    private String type1;
    private Boolean useCapture1;

    public void setListenonce(String type1, Boolean useCapture1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
        this.useCapture = null;
        this.useCapture1 = null;
        
        this.useCapture1 = useCapture1;
    }

    private PaperSize paperSizeOrOptions;
    private Boolean landscape;

    public void setPrint(PaperSize paperSizeOrOptions, Boolean landscape) {
        this.paperSizeOrOptions = paperSizeOrOptions;
        this.landscape = landscape;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private Stroke color2;
    private ColoredFill color3;
    private String color4;
    private Double thickness1;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setStroke(Stroke color2, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        
        this.color2 = color2;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }


    public void setStroke(ColoredFill color3, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        
        this.color3 = color3;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }


    public void setStroke(String color4, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        
        this.color4 = color4;
        this.thickness = null;
        this.thickness1 = null;
        
        this.thickness1 = thickness1;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
    }

    private String type3;
    private Boolean useCapture2;

    public void setUnlisten(String type3, Boolean useCapture2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
        this.useCapture = null;
        this.useCapture1 = null;
        this.useCapture2 = null;
        
        this.useCapture2 = useCapture2;
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        this.zIndex = zIndex;
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSfill() {
        if (fill != null) {
            return String.format(Locale.US, "fill: %s,", (fill != null) ? fill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", color);
        }
        return "";
    }

    private String generateJSopacity() {
        if (opacity != null) {
            return String.format(Locale.US, "opacity: %f,", opacity);
        }
        return "";
    }

    private String generateJSkeys() {
        if (keys != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys));
        }
        return "";
    }

    private String generateJSkeys1() {
        if (keys1 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys1));
        }
        return "";
    }

    private String generateJSangle() {
        if (angle != null) {
            return String.format(Locale.US, "angle: %f,", angle);
        }
        return "";
    }

    private String generateJSmode() {
        if (mode != null) {
            return String.format(Locale.US, "mode: %b,", mode);
        }
        return "";
    }

    private String generateJSmode1() {
        if (mode1 != null) {
            return String.format(Locale.US, "mode: %s,", (mode1 != null) ? mode1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity1() {
        if (opacity1 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity1);
        }
        return "";
    }

    private String generateJSkeys2() {
        if (keys2 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys2));
        }
        return "";
    }

    private String generateJSkeys3() {
        if (keys3 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys3));
        }
        return "";
    }

    private String generateJScx() {
        if (cx != null) {
            return String.format(Locale.US, "cx: %f,", cx);
        }
        return "";
    }

    private String generateJScy() {
        if (cy != null) {
            return String.format(Locale.US, "cy: %f,", cy);
        }
        return "";
    }

    private String generateJSmode2() {
        if (mode2 != null) {
            return String.format(Locale.US, "mode: %s,", (mode2 != null) ? mode2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity2() {
        if (opacity2 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity2);
        }
        return "";
    }

    private String generateJSfx() {
        if (fx != null) {
            return String.format(Locale.US, "fx: %f,", fx);
        }
        return "";
    }

    private String generateJSfy() {
        if (fy != null) {
            return String.format(Locale.US, "fy: %f,", fy);
        }
        return "";
    }

    private String generateJSimageSettings() {
        if (imageSettings != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings != null) ? imageSettings.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType() {
        if (patternFillOrType != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType1() {
        if (patternFillOrType1 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType2() {
        if (patternFillOrType2 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrType3() {
        if (patternFillOrType3 != null) {
            return String.format(Locale.US, "patternFillOrType: %s,", patternFillOrType3);
        }
        return "";
    }

    private String generateJScolor1() {
        if (color1 != null) {
            return String.format(Locale.US, "color: %s,", color1);
        }
        return "";
    }

    private String generateJSthickness() {
        if (thickness != null) {
            return String.format(Locale.US, "thickness: %f,", thickness);
        }
        return "";
    }

    private String generateJSsize() {
        if (size != null) {
            return String.format(Locale.US, "size: %f,", size);
        }
        return "";
    }

    private String generateJSheight() {
        if (height != null) {
            return String.format(Locale.US, "height: %f,", height);
        }
        return "";
    }

    private String generateJSlabels() {
        if (labels != null) {
            return String.format(Locale.US, "labels: %b,", labels);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJSpaperSizeOrOptions() {
        if (paperSizeOrOptions != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlandscape() {
        if (landscape != null) {
            return String.format(Locale.US, "landscape: %b,", landscape);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJScolor2() {
        if (color2 != null) {
            return String.format(Locale.US, "color: %s,", (color2 != null) ? color2.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor3() {
        if (color3 != null) {
            return String.format(Locale.US, "color: %s,", (color3 != null) ? color3.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor4() {
        if (color4 != null) {
            return String.format(Locale.US, "color: %s,", color4);
        }
        return "";
    }

    private String generateJSthickness1() {
        if (thickness1 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness1);
        }
        return "";
    }

    private String generateJSdashpattern() {
        if (dashpattern != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern);
        }
        return "";
    }

    private String generateJSlineJoin() {
        if (lineJoin != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin != null) ? lineJoin.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap() {
        if (lineCap != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap != null) ? lineCap.generateJs() : "null");
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSzIndex() {
        if (zIndex != null) {
            return String.format(Locale.US, "zIndex: %f,", zIndex);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSenabled());
        js.append(generateJSfill());
        js.append(generateJScolor());
        js.append(generateJSopacity());
        js.append(generateJSkeys());
        js.append(generateJSkeys1());
        js.append(generateJSangle());
        js.append(generateJSmode());
        js.append(generateJSmode1());
        js.append(generateJSopacity1());
        js.append(generateJSkeys2());
        js.append(generateJSkeys3());
        js.append(generateJScx());
        js.append(generateJScy());
        js.append(generateJSmode2());
        js.append(generateJSopacity2());
        js.append(generateJSfx());
        js.append(generateJSfy());
        js.append(generateJSimageSettings());
        js.append(generateJSpatternFillOrType());
        js.append(generateJSpatternFillOrType1());
        js.append(generateJSpatternFillOrType2());
        js.append(generateJSpatternFillOrType3());
        js.append(generateJScolor1());
        js.append(generateJSthickness());
        js.append(generateJSsize());
        js.append(generateJSheight());
        js.append(generateJSlabels());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSpaperSizeOrOptions());
        js.append(generateJSlandscape());
        js.append(generateJStype2());
        js.append(generateJScolor2());
        js.append(generateJScolor3());
        js.append(generateJScolor4());
        js.append(generateJSthickness1());
        js.append(generateJSdashpattern());
        js.append(generateJSlineJoin());
        js.append(generateJSlineCap());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());
        js.append(generateJSzIndex());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}