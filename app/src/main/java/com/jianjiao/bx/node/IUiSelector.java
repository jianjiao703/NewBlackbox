package com.jianjiao.bx.node;

import android.view.accessibility.AccessibilityNodeInfo;

public interface IUiSelector {
    public UiSelector text(String str);
    public UiSelector textContains(String str);
    public UiSelector textStartsWith(String prefix);
    public UiSelector textEndsWith(String suffix);
    public UiSelector textMatches(String reg);
    public UiSelector desc(String str);
    public UiSelector descContains(String str);
    public UiSelector descStartsWith(String prefix);
    public UiSelector descEndsWith(String suffix);
    public UiSelector descMatches(String reg);
    public UiSelector id(String resId);
    public UiSelector idContains(String str);
    public UiSelector idStartsWith(String prefix);
    public UiSelector idEndsWith(String suffix);
    public UiSelector idMatches(String reg);
    public UiSelector className(String str);
    public UiSelector classNameContains(String str);
    public UiSelector classNameStartsWith(String prefix);
    public UiSelector classNameEndsWith(String suffix);
    public UiSelector classNameMatches(String reg);
    public UiSelector packageName(String str);
    public UiSelector packageNameContains(String str);
    public UiSelector packageNameStartsWith(String prefix);
    public UiSelector packageNameEndsWith(String suffix);
    public UiSelector packageNameMatches(String reg);
    public UiSelector bounds(int left, int top, int right, int bottom);
    public UiSelector boundsInScreen();
    public UiSelector boundsInside(int left, int top, int right, int bottom);
    public UiSelector boundsContains(int left, int top, int right, int bottom);
    public UiSelector drawingOrder(int order);
    public UiSelector clickable(boolean b);
    public UiSelector longClickable(boolean b);
    public UiSelector checkable(boolean b);
    public UiSelector selected(boolean b);
    public UiSelector enabled(boolean b);
    public UiSelector scrollable(boolean b);
    public UiSelector editable(boolean b);
    public UiSelector multiLine(boolean b);
    public UiObject untilFindOne();
    public UiObject untilFindOne(int time);
    public UiObject findOne();
    public UiObject findOne(AccessibilityNodeInfo accNodeInfo);
    public UiObject findOne(int i);
    public UiCollection find();
    public boolean exists();
    public void waitFor();
}
