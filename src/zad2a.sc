class Time(godz: Int, min: Int):
  private var h: Int = _
  private var m: Int = _

  def hour: Int = h

  def hour_=(godz: Int): Unit = {
    if godz < 0 || godz > 24 then throw IllegalArgumentException(s"wrong hour");
    else h = godz
  }

  def minute: Int = m

  def minute_=(min: Int): Unit = {
    if min < 0 || min > 59 then throw IllegalArgumentException(s"wrong minute");
    else m = min
  }

  this.hour = godz
  this.minute = min
  def before(other:Time):Boolean = {
    if hour < other.hour then true
    else if hour == other.hour && minute < other.minute then true
    else false
  }
end Time

val tim = new Time(22, 37)
val sim = new Time(13, 35)
val nim = new Time(27, 77)

tim.before(sim)
sim.before(tim)
nim.before(tim)