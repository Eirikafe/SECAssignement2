#include<jni.h>

//native code declaration using JNI
JNIEXPORT jobject JNICALL Java_EquationEvaluator_CProgressBar_displayCProgress(JNIEnv *env, jobject this, jobject X, jobject Y)
{
    //have to use jclass because main application is using Doubles instead of primitives
    jclass Xcls = (*env)->GetObjectClass(env, X);
    jclass Ycls = (*env)->GetObjectClass(env, Y);

    //returns x/y to calculate the progress.
    return Xclas/Ycls;
}