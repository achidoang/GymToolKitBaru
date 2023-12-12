package com.dicoding.gymtoolkit.presentation;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\"\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u000f\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u00020\u000f\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0015\u001a\u00020\u000f\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\u0017\u001a\u00020\u000f\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0018\u0010\u0011R\u001c\u0010\u0019\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001a\u0010\u0006R\u001c\u0010\u001b\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001c\u0010\u0006R\u001c\u0010\u001d\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001e\u0010\u0006R\u001c\u0010\u001f\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b \u0010\u0006R\u001c\u0010!\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\"\u0010\u0006R\u001c\u0010#\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b$\u0010\u0006R\u001c\u0010%\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b&\u0010\u0006R\u001c\u0010\'\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b(\u0010\u0006R\u001c\u0010)\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b*\u0010\u0006R\u001c\u0010+\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b,\u0010\u0006R\u001c\u0010-\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b.\u0010\u0006R\u001c\u0010/\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b0\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u00061"}, d2 = {"Lcom/dicoding/gymtoolkit/presentation/Dimens;", "", "()V", "ArticleCardSize", "Landroidx/compose/ui/unit/Dp;", "getArticleCardSize-D9Ej5fM", "()F", "F", "BigIconSize", "getBigIconSize-D9Ej5fM", "ExtraSmallPadding", "getExtraSmallPadding-D9Ej5fM", "ExtraSmallPadding2", "getExtraSmallPadding2-D9Ej5fM", "FontSize1", "Landroidx/compose/ui/unit/TextUnit;", "getFontSize1-XSAIIZE", "()J", "J", "FontSize2", "getFontSize2-XSAIIZE", "FontSmall1", "getFontSmall1-XSAIIZE", "FontSmall2", "getFontSmall2-XSAIIZE", "HighPadding1", "getHighPadding1-D9Ej5fM", "HighPadding2", "getHighPadding2-D9Ej5fM", "IconSize", "getIconSize-D9Ej5fM", "IndicatorSize", "getIndicatorSize-D9Ej5fM", "Ketebalan1", "getKetebalan1-D9Ej5fM", "Ketebalan2", "getKetebalan2-D9Ej5fM", "MediumPadding1", "getMediumPadding1-D9Ej5fM", "MediumPadding2", "getMediumPadding2-D9Ej5fM", "MediumPadding3", "getMediumPadding3-D9Ej5fM", "MediumPadding4", "getMediumPadding4-D9Ej5fM", "PageIndicatorWidth", "getPageIndicatorWidth-D9Ej5fM", "SmallIconSize", "getSmallIconSize-D9Ej5fM", "app_debug"})
public final class Dimens {
    private static final float ExtraSmallPadding = 0.0F;
    private static final float ExtraSmallPadding2 = 0.0F;
    private static final float MediumPadding1 = 0.0F;
    private static final float MediumPadding2 = 0.0F;
    private static final float MediumPadding3 = 0.0F;
    private static final float MediumPadding4 = 0.0F;
    private static final float HighPadding1 = 0.0F;
    private static final float HighPadding2 = 0.0F;
    private static final float Ketebalan1 = 0.0F;
    private static final float Ketebalan2 = 0.0F;
    private static final float IndicatorSize = 0.0F;
    private static final float PageIndicatorWidth = 0.0F;
    private static final float ArticleCardSize = 0.0F;
    private static final float SmallIconSize = 0.0F;
    private static final float IconSize = 0.0F;
    private static final long FontSmall1 = 0L;
    private static final long FontSmall2 = 0L;
    private static final long FontSize1 = 0L;
    private static final long FontSize2 = 0L;
    private static final float BigIconSize = 0.0F;
    @org.jetbrains.annotations.NotNull
    public static final com.dicoding.gymtoolkit.presentation.Dimens INSTANCE = null;
    
    private Dimens() {
        super();
    }
}