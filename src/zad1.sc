class Time(newh:Int):
  private var h:Int = _
  def hour: Int = h
  def hour_=(newh:Int):Unit = {
    if newh<0 || newh>24 then hour=0
    else h=newh
  }
  this.hour=newh
end Time


var tim = new Time(2)
println(tim.hour)
tim.hour= -7
println(tim.hour)
tim.hour= 27
println(tim.hour)
tim.hour= 1
println(tim.hour)

