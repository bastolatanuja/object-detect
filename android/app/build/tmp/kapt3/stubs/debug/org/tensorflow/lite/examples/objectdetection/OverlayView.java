package org.tensorflow.lite.examples.objectdetection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0001%B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0014J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J$\u0010\u001f\u001a\u00020\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/OverlayView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bounds", "Landroid/graphics/Rect;", "boxPaint", "Landroid/graphics/Paint;", "results", "", "Lorg/tensorflow/lite/task/vision/detector/Detection;", "scaleFactor", "", "textBackgroundPaint", "textPaint", "textToSpeech", "Landroid/speech/tts/TextToSpeech;", "clear", "", "draw", "canvas", "Landroid/graphics/Canvas;", "initPaints", "initTextToSpeech", "onDetachedFromWindow", "provideVoiceFeedback", "label", "", "setResults", "detectionResults", "", "imageHeight", "", "imageWidth", "Companion", "app_debug"})
public final class OverlayView extends android.view.View {
    private android.speech.tts.TextToSpeech textToSpeech;
    private java.util.List<? extends org.tensorflow.lite.task.vision.detector.Detection> results;
    private android.graphics.Paint boxPaint;
    private android.graphics.Paint textBackgroundPaint;
    private android.graphics.Paint textPaint;
    private float scaleFactor = 1.0F;
    private android.graphics.Rect bounds;
    @org.jetbrains.annotations.NotNull()
    public static final org.tensorflow.lite.examples.objectdetection.OverlayView.Companion Companion = null;
    private static final int BOUNDING_RECT_TEXT_PADDING = 8;
    
    public OverlayView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public final void clear() {
    }
    
    private final void initTextToSpeech() {
    }
    
    private final void provideVoiceFeedback(java.lang.String label) {
    }
    
    private final void initPaints() {
    }
    
    @java.lang.Override()
    public void draw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    public final void setResults(@org.jetbrains.annotations.NotNull()
    java.util.List<org.tensorflow.lite.task.vision.detector.Detection> detectionResults, int imageHeight, int imageWidth) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/OverlayView$Companion;", "", "()V", "BOUNDING_RECT_TEXT_PADDING", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}