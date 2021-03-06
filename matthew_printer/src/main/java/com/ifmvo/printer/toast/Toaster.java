package com.ifmvo.printer.toast;

import android.content.Context;
import android.widget.Toast;

import java.lang.ref.WeakReference;

public class Toaster {
    // Toast
    private static Toast toast;

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showShort(Context context, CharSequence message) {
//        show(context, message, CustomToast.LENGTH_SHORT);
        WeakReference<Context> reference = new WeakReference<>(context);
        if (null == toast) {
            toast = CustomToast.makeText(reference.get(), message, CustomToast.LENGTH_SHORT);
            // toast.setGravity(Gravity.CENTER, 0, 0);
        } else {
            toast.setText(message);
        }
        toast.show();
    }

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showShort(Context context, int message) {
//        show(context, message, CustomToast.LENGTH_SHORT);
        WeakReference<Context> reference = new WeakReference<>(context);

        if (null == toast) {
            toast = CustomToast.makeText(reference.get(), message, CustomToast.LENGTH_SHORT);
            // toast.setGravity(Gravity.CENTER, 0, 0);
        } else {
            toast.setText(message);
        }
        toast.show();
    }

    /**
     * 长时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showLong(Context context, CharSequence message) {
//        show(context, message, CustomToast.LENGTH_LONG);

        WeakReference<Context> reference = new WeakReference<>(context);

        if (null == toast) {
            toast = CustomToast.makeText(reference.get(), message, CustomToast.LENGTH_LONG);
            // toast.setGravity(Gravity.CENTER, 0, 0);
        } else {
            toast.setText(message);
        }
        toast.show();
    }

    /**
     * 长时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showLong(Context context, int message) {
//        show(context, message, CustomToast.LENGTH_LONG);
        WeakReference<Context> reference = new WeakReference<>(context);

        if (null == toast) {
            toast = CustomToast.makeText(reference.get(), message, CustomToast.LENGTH_LONG);
            // toast.setGravity(Gravity.CENTER, 0, 0);
        } else {
            toast.setText(message);
        }
        toast.show();
    }

//    /**
//     * 自定义显示Toast时间
//     *
//     * @param context
//     * @param message
//     * @param duration
//     */
//    public static void show(Context context, CharSequence message, int duration) {
////        CustomToast.makeText(context, message, duration).show();
//        WeakReference<Context> reference = new WeakReference<>(context);
//
//        if (null == toast) {
//            toast = CustomToast.makeText(reference.get(), message, CustomToast.LENGTH_LONG);
//            // toast.setGravity(Gravity.CENTER, 0, 0);
//        } else {
//            toast.setText(message);
//        }
//        toast.show();
//    }
//
//    /**
//     * 自定义显示Toast时间
//     */
//    public static void show(Context context, int message, int duration) {
//        WeakReference<Context> reference = new WeakReference<>(context);
//
//        if (null == toast) {
//            toast = CustomToast.makeText(reference.get(), message, CustomToast.LENGTH_LONG);
//            // toast.setGravity(Gravity.CENTER, 0, 0);
//        } else {
//            toast.setText(message);
//        }
//        toast.show();
//    }
}
