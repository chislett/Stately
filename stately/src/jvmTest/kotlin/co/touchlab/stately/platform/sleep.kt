package co.touchlab.stately.platform

actual fun sleep(time: Long) {
  Thread.sleep(time)
}