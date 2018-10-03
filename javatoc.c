#include "javatoc.h"
#include <string.h>

JNIEXPORT jint JNICALL Java_javatoc_intMethod
  (JNIEnv *env, jobject obj, jint num) {
        return num * num;
  }


JNIEXPORT jboolean JNICALL Java_javatoc_booleanMethod
   (JNIEnv *env, jobject obj, jboolean boolean){

   }

JNIEXPORT jstring JNICALL Java_javatoc_stringMethod
  (JNIEnv *env, jobject obj, jstring string){

  }

JNIEXPORT jint JNICALL Java_javatoc_intArrayMethod
  (JNIEnv *env, jobject onj, jintArray array) {

  }

int main(void){
    return 0;
}
