package com.wdullaer.datetimepickerexample;

import android.content.Context;
import android.graphics.Typeface;

import com.wdullaer.materialdatetimepicker.TypefaceHelper;

public class Fonts extends TypefaceHelper {

	private Typeface typeface;

	public Fonts(Context context) {
		this.typeface = Typeface.createFromAsset(context.getAssets(), "fonts/font.ttf");
	}

	@Override
	public Typeface getButtonTypeface() {
		return typeface;
	}

	@Override
	public Typeface getMonthDayLabelTypeface() {
		return typeface;
	}

	@Override
	public Typeface getDayOfWeekTypeface() {
		return typeface;
	}

	@Override
	public Typeface getMonthTitleTypeface() {
		return typeface;
	}

	@Override
	public Typeface getMonthDayNormalTypeface() {
		return typeface;
	}

	@Override
	public Typeface getMonthDaySelectedTypeface() {
		return typeface;
	}

	@Override
	public Typeface getSelectedYearMonthDayTypeface() {
		return typeface;
	}
}
